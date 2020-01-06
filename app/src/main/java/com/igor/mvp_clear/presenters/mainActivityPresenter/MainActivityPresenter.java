package com.igor.mvp_clear.presenters.mainActivityPresenter;


import android.view.View;

import com.igor.mvp_clear.R;
import com.igor.mvp_clear.presenters.BasePresenter;

public class MainActivityPresenter extends BasePresenter<MainActivityContract.View> implements MainActivityContract.Presenter, View.OnClickListener {


    public MainActivityPresenter() {

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                v.setBackgroundColor(getmView().getContext().getResources().getColor(R.color.colorAccent));
                break;

            case R.id.textView:
                v.setBackgroundColor(getmView().getContext().getResources().getColor(R.color.colorPrimary));
                break;
        }
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void onResume() {

    }
}
