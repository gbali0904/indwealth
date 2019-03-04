package com.android.indwealth.funds.view;

import com.android.indwealth.base.MvpView;
import com.android.indwealth.funds.model.ModelForFunds;

public interface MainView extends MvpView {
    void getFundList(ModelForFunds modelForFunds);

    void getLoadFundList(ModelForFunds modelForFunds);
}
