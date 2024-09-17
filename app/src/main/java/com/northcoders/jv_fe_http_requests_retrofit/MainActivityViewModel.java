package com.northcoders.jv_fe_http_requests_retrofit;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.northcoders.jv_fe_http_requests_retrofit.model.Fruit;
import com.northcoders.jv_fe_http_requests_retrofit.model.FruitRepository;

import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {

    private FruitRepository fruitRepository;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        this.fruitRepository = new FruitRepository(application);
    }

    public LiveData<List<Fruit>> getAllFruit() {
        return fruitRepository.getMutableLiveData();
    }

}
