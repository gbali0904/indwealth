package com.android.indwealth.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.android.indwealth.api.RetrofitImp;
import com.android.indwealth.di.ActivityContext;
import com.android.indwealth.di.PerActivity;
import com.android.indwealth.funds.adapter.FundListAdapter;
import com.android.indwealth.funds.persenter.MainMvpPersenter;
import com.android.indwealth.funds.persenter.MainPersenter;
import com.android.indwealth.funds.view.MainView;
import com.android.indwealth.splash.persenter.SplashMvpPresenter;
import com.android.indwealth.splash.persenter.SplashPresenter;
import com.android.indwealth.splash.view.SplashView;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return mActivity;
    }

    @Provides
    LinearLayoutManager provideLinearLayoutManager(AppCompatActivity activity) {
        return new LinearLayoutManager(activity);
    }

    @Provides
    @PerActivity
    SplashPresenter<SplashView> provideSplashPresenter(
            SplashMvpPresenter<SplashView> presenter) {
        return presenter;
    }


    @Provides
    @PerActivity
    MainPersenter<MainView> providedutyListPresenter(
            MainMvpPersenter<MainView> presenter) {
        return presenter;
    }



    @Provides
    RetrofitImp provideretrofit() {
        return new RetrofitImp();
    }

    @Provides
    FundListAdapter provideFundListAdapter() {
        return new FundListAdapter();
    }



}