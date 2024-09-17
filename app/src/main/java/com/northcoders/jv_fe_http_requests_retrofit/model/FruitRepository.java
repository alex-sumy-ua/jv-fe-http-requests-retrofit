package com.northcoders.jv_fe_http_requests_retrofit.model;

import android.app.Application;
import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.northcoders.jv_fe_http_requests_retrofit.service.ApiService;
import com.northcoders.jv_fe_http_requests_retrofit.service.RetrofitInstance;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

        ApiService apiService = RetrofitInstance.getService();
        Call<List<Fruit>> call = apiService.getAllFruits();

        call.enqueue(new Callback<List<Fruit>>() {
            @Override
            public void onResponse(Call<List<Fruit>> call, Response<List<Fruit>> response) {
        // We'll just concern ourselves with the onResponse() method body for now.
        // In here, assign a variable of a list of Fruit objects to the response variable
        // being passed into the method's body.
                List<Fruit> fruits = response.body();
                mutableLiveData.setValue(fruits);
            }

            @Override
            public void onFailure(Call<List<Fruit>> call, Throwable t) {
                Log.i("HTTP Failure", Objects.requireNonNull(t.getMessage()));
            }
        });

        return mutableLiveData;
    }

}
