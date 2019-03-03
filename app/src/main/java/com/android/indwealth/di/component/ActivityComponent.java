package com.android.indwealth.di.component;

import com.android.indwealth.di.PerActivity;
import com.android.indwealth.di.module.ActivityModule;
import com.android.indwealth.funds.FundsFragment;
import com.android.indwealth.main.MainActivity;
import com.android.indwealth.splash.SplashActivity;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity activity);

    void inject(SplashActivity activity);

    void inject(FundsFragment activity);

}

