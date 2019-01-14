package com.example.muhaimenn.bookapi.mvpStuff;

import com.example.muhaimenn.bookapi.apiCall.BookCall;
import com.example.muhaimenn.bookapi.model.Response;
import com.example.muhaimenn.bookapi.networkingStuff.RetrofitInstance;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;

public class InteractorImpl implements MainContract.GetBookInteractor {
    @Override
    public void getData(final OnFinishedListener onFinishedListener) {
        BookCall call= RetrofitInstance.getRetrofitInstance().create(BookCall.class);

        Call<List<Response>> bookCall=call.getBooks();

        bookCall.enqueue(new Callback<List<Response>>() {
            @Override
            public void onResponse(Call<List<Response>> call, retrofit2.Response<List<Response>> response) {
                onFinishedListener.onFinished(response.body());
            }

            @Override
            public void onFailure(Call<List<Response>> call, Throwable t) {
                onFinishedListener.onFailure(t);

            }
        });

    }
}
