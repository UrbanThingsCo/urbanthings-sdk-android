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

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import io.urbanthings.api.sample.R;
import io.urbanthings.api.transit.model.PlacePoint;

public class PlacePointAdapter extends RecyclerView.Adapter<PlacePointAdapter.ViewHolder>  {

    private List<PlacePoint> placePoints;
    private Context context;

    public PlacePointAdapter(Context context, List<PlacePoint> placePoints) {
        this.placePoints = placePoints;
        this.context = context;
    }

    @Override
    public PlacePointAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View contactView = inflater.inflate(R.layout.place_point_list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        PlacePoint placePoint = placePoints.get(position);
        holder.nameTextView.setText(placePoint.getName());
        holder.localityTextView.setText(placePoint.getLocalityName());
    }

    @Override
    public int getItemCount() {
        return placePoints == null ? 0 : placePoints.size();
    }

    public void setPlacePoints(List<PlacePoint> placePoints) {
        this.placePoints = placePoints;
        notifyDataSetChanged();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView nameTextView;
        public TextView localityTextView;

        public ViewHolder(View itemView) {
            super(itemView);

            nameTextView = (TextView) itemView.findViewById(R.id.place_name);
            localityTextView = (TextView) itemView.findViewById(R.id.place_locality_name);
        }
    }
}
