package com.example.recyclerviewall.adapter;

public interface ShopContract {

    interface View extends BaseView<Presenter> {
        void showSuccessFirstPage();

        void showSuccessSecondPage();
    }

    interface Presenter extends BasePresenter {
        void getData(int currentPosition, ShopRequest shopRequest);
    }
}
