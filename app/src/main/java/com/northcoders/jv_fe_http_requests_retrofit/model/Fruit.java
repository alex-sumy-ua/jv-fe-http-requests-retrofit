package com.northcoders.jv_fe_http_requests_retrofit.model;

import com.google.gson.annotations.SerializedName;

public class Fruit {

    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    @SerializedName("family")
    private String family;

    @SerializedName("order")
    private String order;

    @SerializedName("genus")
    private String genus;

    @SerializedName("nutritions")
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public Nutritions getNutritions() {
        return nutritions;
    }

    public void setNutritions(Nutritions nutritions) {
        this.nutritions = nutritions;
    }
}
