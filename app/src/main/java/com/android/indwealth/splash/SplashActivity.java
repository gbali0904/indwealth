package com.android.indwealth.splash;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.indwealth.R;
import com.android.indwealth.base.BaseActivity;
import com.android.indwealth.home.HomeActivity;
import com.android.indwealth.main.MainActivity;
import com.android.indwealth.splash.persenter.SplashPresenter;
import com.android.indwealth.splash.view.SplashView;

import javax.inject.Inject;

import butterknife.ButterKnife;

public class SplashActivity extends BaseActivity implements SplashView{

    @Inject
    SplashPresenter<SplashView> mPresenter;


    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, SplashActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this));
        mPresenter.onAttach(SplashActivity.this);
    }

    @Override
    public void openLoginActivity() {
        Intent intent = HomeActivity.getStartIntent(SplashActivity.this);
        startActivity(intent);
        finish();
    }

    @Override
    protected void setUp() {

    }
}
