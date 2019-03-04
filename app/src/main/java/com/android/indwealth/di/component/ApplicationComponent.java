package com.android.indwealth.di.component;

import android.content.Context;

import com.android.indwealth.app.AppController;
import com.android.indwealth.di.ApplicationContext;
import com.android.indwealth.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(AppController appController);
    @ApplicationContext
    Context context();
}

