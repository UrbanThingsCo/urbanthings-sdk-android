# UrbanThings Android SDK
_Create Android apps that connect to the UrbanThings API to retrieve smart city data_

Our completely rewritten from the ground up Android SDK allows you to quickly build apps using the [Urban Things API / Bristol API](https://portal-bristol.api.urbanthings.io). 

## Overview

The SDK is essentially a set of model POJOs and a [Retrofit](http://square.github.io/retrofit) interface definition which is wrapped to make the client exposed API calls more user-friendly. The SDK is currently at beta release stage.

The SDK relies on [GSON](https://github.com/google/gson) for deserialization to provide `TypeAdapter`s to support polymorphism in some of the API responses. 

There is an optional [RxJava 1.1](https://github.com/ReactiveX/RxJava) binding library available for the SDK.


## Getting Started

Before using the demonstration app, the tests, or your own client, you need to register for a free developer API key via the [portal](https://bristol-portal.api.urbanthings.io). To use this with the tests, update the `API_KEY` constants in the test classes, and to use in the app update the `API_KEY` constant in the `MainActivity` class.

To include the library:

```gradle
compile 'io.urbanthings:urbanthings-android:TODO:version'
```

To include the RxJava bindings
```gradle
compile 'io.urbanthings:urbanthings-android-rxbindings:TODO:version'
```

To get a `TransitApi` client:

```java
private static final String BASE_URL = "https://bristol.api.urbanthings.io/api/1.0/";
private static final String API_KEY = "[your key here]";

....

TransitApi transitApi = TransitApiManager.transitApi(BASE_URL, API_KEY);
```

To make an asynchronous request:

```java

transitApi.getStopsInRect(MIN_LAT, MAX_LAT, MIN_LNG, MAX_LNG, Arrays.asList(VehicleType.CAR), new ApiCallback<List<TransitStop>>() {
            @Override
            public void onSuccess(List<TransitStop> stops) {
                // do something with the list of stops
            }

            @Override
            public void onError(Throwable t) {
                // handle error
            }
}
```

There are currently basic Javadoc comments for each of the API methods in `TransitApi` and `RxTransitApi`, and further documentation can be seen at the [API portal](https://portal-bristol.api.urbanthings.io)

## RxJava Bindings

The RxJava bindings expose near identical APIs to the standard SDK, but returns `Single`s to be subscribed to. To get a `RxTransitApi` you do the same as with the standard SDK, but via the `RxTransitApiManager` instead.

## Error handling

Exceptions are returned in `ApiCallback.onError()`, or passed to the RxJava's `Subscriber.onError()`. They are provided as instances of `ApiException` with the source Exception provided by `ApiException.getCause()`.

## Tests

Most of the tests can be found in the RxBindings module, as that's what we use internally. There are a small number of tests in the standard module. At this beta stage the tests only do light validation of the response objects, and in most cases just check that the expected object has been returned.

## Demonstration App

The simple demonstration app implements usage of `searchPlacePoints()` to display a list of results for the places received for a given search query. 

## Caveats

* Any HTTPExceptions produced by Retrofit are passed to the client as the cause provided to the ApiException. In time these will be mapped to SDK specific Exceptions to allow other HTTP libraries to be used.

* The underlying `OkHttp` client is configured with a `HttpLoggingInterceptor`. At the moment this can't be disabled, but will be configurable when we release a production ready version of the SDK.

* The SDK is implemented without Lambdas to ensure it doesn't enforce the use of the [Jack toolchain](https://source.android.com/source/jack.html) on developers