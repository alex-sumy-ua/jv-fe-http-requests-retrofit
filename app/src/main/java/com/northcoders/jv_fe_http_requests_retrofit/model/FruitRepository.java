package com.northcoders.jv_fe_http_requests_retrofit.model;

import android.app.Application;
import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.northcoders.jv_fe_http_requests_retrofit.service.ApiService;
import com.northcoders.jv_fe_http_requests_retrofit.service.RetrofitInstance;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FruitRepository {

    private ArrayList<Fruit> fruits = new ArrayList<>();
    private MutableLiveData<List<Fruit>> mutableLiveData = new MutableLiveData<>();
    private Application application;

    public FruitRepository(Application application) {
        this.application = application;
    }

    public MutableLiveData<List<Fruit>> getMutableLiveData() {
        // Get ApiService instance
        ApiService apiService = RetrofitInstance.getService();
        // Make the API call to get all fruits
        Call<List<Fruit>> call = apiService.getAllFruits();

        call.enqueue(new Callback<List<Fruit>>() {
            @Override
            public void onResponse(Call<List<Fruit>> call, Response<List<Fruit>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    // Set the fetched fruits list into the MutableLiveData object
                    mutableLiveData.setValue(response.body());
                } else {
                    Log.e("API Error", "Failed to retrieve fruits: " + response.message());
                }
            }

            @Override
            public void onFailure(Call<List<Fruit>> call, Throwable t) {
                // Log the error message in case of failure
                Log.e("HTTP Failure", t.getMessage());
            }
        });

        return mutableLiveData;
    }
}