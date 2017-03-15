/*
 * Copyright (C) 2017 UrbanThings.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * UrbanThings is a trading name of FatAttitude Limited
 */

package co.urbanthings.api.sample;

import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.Menu;


import io.urbanthings.api.ApiCallback;
import io.urbanthings.api.sample.R;
import io.urbanthings.api.transit.TransitApi;
import io.urbanthings.api.transit.TransitApiManager;
import io.urbanthings.api.transit.model.PlacePointList;



public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {
    public static final String TAG = MainActivity.class.getSimpleName();

    // Base URL for all Bristol API calls
    private static final String BASE_URL = "https://bristol.api.urbanthings.io/api/1.0/";

    // You will need to register to use the API and put your own API key here...!
    // Please visit: https://portal-bristol.api.urbanthings.io
    public static final String API_KEY = null;

    private static final double CENTRE_LAT = 51.4575586;
    private static final double CENTRE_LNG = -2.5982637;

    private TransitApi transportApi = TransitApiManager.transitApi(BASE_URL, API_KEY);

    private PlacePointAdapter adapter = new PlacePointAdapter(this, null);

    private View emptyState;
    private View noResultState;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        emptyState = findViewById(R.id.empty_state);
        noResultState = findViewById(R.id.no_result_state);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);

        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView = (SearchView) menu.findItem(R.id.action_search).getActionView();
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        searchView.setIconifiedByDefault(false);
        searchView.setMaxWidth(Integer.MAX_VALUE);
        searchView.setOnQueryTextListener(this);
        searchView.setQueryHint("Search for places...");
        return true;
    }

    private String searchText;
    private long queryUpdateTime = 0;
    private static final long DEBOUNCE = 333;
    private static final int MIN_CHARS = 3;

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(final String newText) {
        if (newText != null && newText.trim().length() >= MIN_CHARS) {
            if (System.currentTimeMillis() > queryUpdateTime + DEBOUNCE) {
                queryUpdateTime = System.currentTimeMillis();
                if (searchText != newText) {
                    searchText = newText;
                    transportApi.searchPlacePoints(newText, CENTRE_LAT, CENTRE_LNG, 25, new ApiCallback<PlacePointList>() {
                        @Override
                        public void onSuccess(PlacePointList places) {
                            if (searchText != newText) {
                                // query has been changed, ignore
                                return;
                            }
                            // update adapter
                            Log.v("log", places.toString());
                            showEmptyState(false);
                            showNoResultState(places.getPlacePoints().size() == 0);

                            adapter.setPlacePoints(places.getPlacePoints());
                        }

                        @Override
                        public void onError(Throwable t) {

                        }
                    });
                }
            }
        } else {
            if (newText != null || newText.length() == 0) {
                showEmptyState(true);
                showNoResultState(false);
            } else {
                showEmptyState(false);
                showNoResultState(true);
            }
            adapter.setPlacePoints(null);

        }
        return true;
    }

    private void showEmptyState(boolean show) {
        emptyState.setVisibility(show ? View.VISIBLE : View.GONE);
    }

    private void showNoResultState(boolean show) {
        noResultState.setVisibility(show ? View.VISIBLE : View.GONE);
    }
}
