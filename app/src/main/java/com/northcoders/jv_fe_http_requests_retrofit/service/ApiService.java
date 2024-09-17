package com.northcoders.jv_fe_http_requests_retrofit.service;

import com.northcoders.jv_fe_http_requests_retrofit.model.Fruit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET
    Call<List<Fruit>> getAllFruits();

}
