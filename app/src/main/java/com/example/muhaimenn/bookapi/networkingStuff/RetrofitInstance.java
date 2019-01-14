package com.example.muhaimenn.bookapi.networkingStuff;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    private static Retrofit retrofit;
    private static final String BASE_URL = "https://raw.githubusercontent.com/tamingtext/book/master/apache-solr/example/exampledocs/";

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null){
            retrofit= new Retrofit.Builder().baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
