package com.srd14.actividad41.resources;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PokemonAPIService {
    @GET("pokemon/?limit=50")
    Call<PokemonFetchResults> getPokemons();
}
