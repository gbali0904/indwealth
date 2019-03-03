package com.android.indwealth.splash.persenter;

import com.android.indwealth.base.MvpPresenter;
import com.android.indwealth.di.PerActivity;
import com.android.indwealth.splash.view.SplashView;

@PerActivity
public interface SplashPresenter<V extends SplashView> extends MvpPresenter<V> {
    void onAttach(V mvpView);
}
