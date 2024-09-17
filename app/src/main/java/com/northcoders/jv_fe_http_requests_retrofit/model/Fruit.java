package com.northcoders.jv_fe_http_requests_retrofit.model;

import androidx.databinding.BaseObservable;
import com.google.gson.annotations.SerializedName;
import com.northcoders.jv_fe_http_requests_retrofit.BR;
import androidx.databinding.Bindable;

public class Fruit extends BaseObservable {

    private int id;
    private String name;
    private String family;
    private String order;
    private String genus;
    private Nutritions nutritions;

    public Fruit() {
    }

    public Fruit(int id, String name, String family, String order, String genus, Nutritions nutritions) {
        this.id = id;
        this.name = name;
        this.family = family;
        this.order = order;
        this.genus = genus;
        this.nutritions = nutritions;
    }

    @Bindable
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        notifyPropertyChanged(BR.id); // notify data binding of the change
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
        notifyPropertyChanged(BR.family);
    }

    @Bindable
    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
        notifyPropertyChanged(BR.order);
    }

    @Bindable
    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
        notifyPropertyChanged(BR.genus);
    }

    @Bindable
    public Nutritions getNutritions() {
        return nutritions;
    }

    public void setNutritions(Nutritions nutritions) {
        this.nutritions = nutritions;
        notifyPropertyChanged(BR.nutritions);
    }
}