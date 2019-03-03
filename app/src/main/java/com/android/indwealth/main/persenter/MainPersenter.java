package com.android.indwealth.main.persenter;


import com.android.indwealth.base.MvpPresenter;
import com.android.indwealth.di.PerActivity;
import com.android.indwealth.main.view.MainView;

@PerActivity
public interface MainPersenter <V extends MainView> extends MvpPresenter<V>
{

    void getFundList();
}
