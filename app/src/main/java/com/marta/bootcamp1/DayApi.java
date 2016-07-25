package com.marta.bootcamp1;

import android.util.Log;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by marta on 25.07.2016.
 */
public class DayApi {

    public static final String BASE_URL ="http://burno.ga/"; //https://bootcampagenda.firebaseio.com/";
    private static final String TAG = "api";
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        Log.d(TAG, "getClient: jest retrofit");
        return retrofit;

    }
}