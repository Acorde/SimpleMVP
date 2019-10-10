package com.igor.mvp_clear.presenters.mainActivityPresenter;


import com.igor.mvp_clear.presenters.BaseMvpPresenter;
import com.igor.mvp_clear.view.BaseView;

public interface MainActivityContract {



    interface Presenter extends BaseMvpPresenter<View> {
        void onStart();
        void onPause();
        void onDestroy();
    }


    interface View extends BaseView {

        void viewInit();
        void setPresenter();

    }



}
