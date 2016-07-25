package com.marta.bootcamp1;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by marta on 25.07.2016.
 */
public interface ApiInterface {
    @GET("schedule.json")

    Call<Days> days();//@Query("name") String app);

}
