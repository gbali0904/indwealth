package com.android.indwealth.main.persenter;

import com.android.indwealth.api.RetrofitImp;
import com.android.indwealth.base.BasePresenter;
import com.android.indwealth.main.view.MainView;

import javax.inject.Inject;

public class MainMvpPersenter <V extends MainView> extends BasePresenter<V> implements MainPersenter<V>{
    @Inject
    public MainMvpPersenter() {
        super();
    }

    @Inject
    RetrofitImp retrofitImp;


    @Override
    public void getFundList() {
        /*getMvpView().showLoading();
        retrofitImp.getRetrofitServices().getDutyList("no-cache",checksum)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(retrofitImp.defaultSubscribeScheduler())
                .subscribe(new Subscriber< Object  >() {
                    @Override
                    public void onCompleted() {
                    }
                    @Override
                    public void onError(Throwable e) {
                        if (!isViewAttached()) {
                            return;
                        }
                        getMvpView().hideLoading();
                        handleApiError(e);
                        e.printStackTrace();
                    }
                    @Override
                    public void onNext( Object   response) {
                        if (!isViewAttached()) {
                            return;
                        }
                        ArrayList dutyListData = (ArrayList) response;
                        getMvpView().hideLoading();
                        getMvpView().getDutyListSuccess(dutyListData);
                    }
                });*/
    }

 }

