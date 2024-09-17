package com.northcoders.jv_fe_http_requests_retrofit.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class Nutritions {

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

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public float getFat() {
        return fat;
    }

    public void setFat(float fat) {
        this.fat = fat;
    }

    public float getSugar() {
        return sugar;
    }

    public void setSugar(float sugar) {
        this.sugar = sugar;
    }

    public float getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(float carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public float getProtein() {
        return protein;
    }

    public void setProtein(float protein) {
        this.protein = protein;
    }
}
