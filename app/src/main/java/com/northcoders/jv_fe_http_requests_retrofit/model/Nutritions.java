package com.northcoders.jv_fe_http_requests_retrofit.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import com.google.gson.annotations.SerializedName;
import com.northcoders.jv_fe_http_requests_retrofit.BR;

public class Nutritions extends BaseObservable {

    @SerializedName("calories")
    private int calories;

    @SerializedName("fat")
    private float fat;

    @SerializedName("sugar")
    private float sugar;

    @SerializedName("carbohydrates")
    private float carbohydrates;

    @SerializedName("protein")
    private float protein;

    public Nutritions() {
    }

    public Nutritions(int calories, float fat, float sugar, float carbohydrates, float protein) {
        this.calories = calories;
        this.fat = fat;
        this.sugar = sugar;
        this.carbohydrates = carbohydrates;
        this.protein = protein;
    }

    @Bindable
    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
        notifyPropertyChanged(BR.calories);
    }

    @Bindable
    public float getFat() {
        return fat;
    }

    public void setFat(float fat) {
        this.fat = fat;
        notifyPropertyChanged(BR.fat);
    }

    @Bindable
    public float getSugar() {
        return sugar;
    }

    public void setSugar(float sugar) {
        this.sugar = sugar;
        notifyPropertyChanged(BR.sugar);
    }

    @Bindable
    public float getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(float carbohydrates) {
        this.carbohydrates = carbohydrates;
        notifyPropertyChanged(BR.carbohydrates);
    }

    @Bindable
    public float getProtein() {
        return protein;
    }

    public void setProtein(float protein) {
        this.protein = protein;
        notifyPropertyChanged(BR.protein);
    }
}