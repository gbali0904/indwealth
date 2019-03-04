package com.android.indwealth.funds.persenter;


import com.android.indwealth.base.MvpPresenter;
import com.android.indwealth.di.PerActivity;
import com.android.indwealth.funds.view.MainView;

@PerActivity
public interface MainPersenter<V extends MainView> extends MvpPresenter<V> {

    void getFundList(int limit, int offset);

    void getLoadMoreFundList(int limit, int offset);
}
