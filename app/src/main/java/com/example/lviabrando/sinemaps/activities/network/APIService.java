package com.example.lviabrando.sinemaps.activities.network;

import com.example.lviabrando.sinemaps.activities.model.Sine;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Lívia Brandão on 17/02/2017.
 */

public interface APIService {

    @GET("latitude/-7.242662/longitude/-35.9716057/raio/100")
    Call<List<Sine>> getSinesComRaio();

    @GET(" ")
    Call<List<Sine>> getSinesBR();

    @GET("cod/{cod}")
    Call<List<Sine>> getSinePorCod(@Path("cod") String cod);

}
