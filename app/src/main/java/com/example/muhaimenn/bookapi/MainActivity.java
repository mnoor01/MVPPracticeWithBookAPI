package com.example.muhaimenn.bookapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.muhaimenn.bookapi.model.Response;
import com.example.muhaimenn.bookapi.mvpStuff.InteractorImpl;
import com.example.muhaimenn.bookapi.mvpStuff.MainContract;
import com.example.muhaimenn.bookapi.mvpStuff.PresenterImpl;
import com.example.muhaimenn.bookapi.resyclerviewStuff.BookAdapter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainContract.MainView {
    private MainContract.Presenter presenter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new PresenterImpl(this, new InteractorImpl());

        setUpRecyclerview();
        presenter.putData();

    }

    public void setUpRecyclerview() {
        recyclerView = findViewById(R.id.booksRecyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);

    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void putDataToRecyclerview(List<Response> responseList) {
        BookAdapter adapter= new BookAdapter(responseList);
        recyclerView.setAdapter(adapter);
    }
}










