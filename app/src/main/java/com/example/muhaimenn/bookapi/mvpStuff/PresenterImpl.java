package com.example.muhaimenn.bookapi.mvpStuff;

import com.example.muhaimenn.bookapi.model.Response;

import java.util.List;

public class PresenterImpl implements MainContract.Presenter,MainContract.GetBookInteractor.OnFinishedListener {
    private MainContract.MainView view;
    private MainContract.GetBookInteractor interactor;

    public PresenterImpl(MainContract.MainView view, MainContract.GetBookInteractor interactor) {
        this.view = view;
        this.interactor = interactor;
    }

    @Override
    public void putData() {
        interactor.getData(this);


    }


    @Override
    public void onFinished(List<Response> responseList) {
        view.putDataToRecyclerview(responseList);
    }

    @Override
    public void onFailure(Throwable throwable) {
        throwable.printStackTrace();

    }
}