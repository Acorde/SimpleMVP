package com.igor.mvp_clear.view;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.igor.mvp_clear.R;
import com.igor.mvp_clear.presenters.mainActivityPresenter.MainActivityContract;
import com.igor.mvp_clear.presenters.mainActivityPresenter.MainActivityPresenter;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {

    private MainActivityPresenter presenter;
    private TextView button, textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setPresenter();
        viewInit();

    }

    @Override
    public void viewInit() {
        button = findViewById(R.id.button);
        button.setOnClickListener(presenter);

        textView = findViewById(R.id.textView);
        textView.setOnClickListener(presenter);
    }

    @Override
    public void setPresenter() {
        presenter = new MainActivityPresenter();
        presenter.attach(this);
    }

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public Context getActivityContext() {
        return this;
    }

    @Override
    public View getView() {
        return getWindow().getDecorView().getRootView();
    }

    @Override
    protected void onStart() {
        presenter.onStart();
        super.onStart();
    }
}
