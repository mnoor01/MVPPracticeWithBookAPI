package com.example.muhaimenn.bookapi.apiCall;

import com.example.muhaimenn.bookapi.model.Response;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface BookCall {

    @GET("books.json")
    Call<List<Response>> getBooks();
}
