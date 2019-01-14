package com.example.muhaimenn.bookapi.mvpStuff;

import com.example.muhaimenn.bookapi.model.Response;

import java.util.List;

public interface MainContract {

    interface Presenter {
        void putData();
    }

    interface MainView {
        void showProgress();

        void hideProgress();

        void putDataToRecyclerview(List<Response> responseList);

    }

    interface GetBookInteractor {
        void getData(OnFinishedListener onFinishedListener);

        interface OnFinishedListener {
            void onFinished(List<Response> responseList);

            void onFailure(Throwable throwable);
        }

    }

}
