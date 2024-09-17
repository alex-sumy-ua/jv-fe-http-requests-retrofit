package com.northcoders.jv_fe_http_requests_retrofit.service;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import okhttp3.logging.HttpLoggingInterceptor;

public class RetrofitInstance {

    private static Retrofit retrofit = null;

    private final static String BASE_URL = "http://fruityvice.com/api/fruit/";




    public static ApiService getService() {

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(client)
                    .build();
        }

        return retrofit.create(ApiService.class);

    }


}
