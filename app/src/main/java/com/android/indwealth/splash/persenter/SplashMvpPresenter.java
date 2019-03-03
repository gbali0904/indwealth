package com.android.indwealth.splash.persenter;

import com.android.indwealth.base.BasePresenter;
import com.android.indwealth.splash.view.SplashView;

import javax.inject.Inject;

public class SplashMvpPresenter<V extends SplashView> extends BasePresenter<V> implements SplashPresenter<V> {

    @Inject
    public SplashMvpPresenter() {
        super();
    }
    @Override
    public void onAttach(V mvpView) {
        super.onAttach(mvpView);
        getMvpView().openLoginActivity();
    }
}
