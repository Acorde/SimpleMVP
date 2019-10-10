package com.igor.mvp_clear.presenters;

import com.igor.mvp_clear.view.BaseView;


public class BasePresenter<V extends BaseView> implements BaseMvpPresenter<V>{

    private V mView;

    @Override
    public void attach(V view) {
        this.mView = view;

    }

    @Override
    public void detach() {
        this.mView = null;
    }

    @Override
    public boolean isAttached() {
        return mView != null;
    }

    public V getmView() {
        return mView;
    }






}
