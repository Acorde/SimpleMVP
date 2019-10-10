package com.igor.mvp_clear.presenters;


import com.igor.mvp_clear.view.BaseView;

public interface BaseMvpPresenter<V extends BaseView> {

    /**
     * Called when view attached to presenter
     *
     * @param view
     */
    void attach(V view);

    /**
     * Called when view is detached from presenter
     */
    void detach();

    /**
     * @return true if view is attached to presenter
     */
    boolean isAttached();


}
