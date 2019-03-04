package com.android.indwealth.funds.persenter;

import com.android.indwealth.api.RetrofitImp;
import com.android.indwealth.base.BasePresenter;
import com.android.indwealth.funds.model.ModelForFunds;
import com.android.indwealth.funds.view.MainView;

import javax.inject.Inject;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;

public class MainMvpPersenter <V extends MainView> extends BasePresenter<V> implements MainPersenter<V>{
    private String auth;

    @Inject
    public MainMvpPersenter() {
        super();
    }

    @Inject
    RetrofitImp retrofitImp;


    @Override
    public void getFundList(int limit, int offset) {
        getMvpView().showLoading();
        auth=" Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoxMDI3LCJ1c2VybmFtZSI6Ijk4MTE4ODU5ODkiLCJleHAiOjE1NTE3NzA1MzcsImVtYWlsIjoia2xzYWRqbGFAYXNkLmFjb20iLCJtb2JpbGUiOiI5ODExODg1OTg5In0.yNnIloeXKJk5q77osuieKAWR-1vhAjpGbjdTh-u3A7E";
        retrofitImp.getRetrofitServices().getFunds(auth,limit,offset)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(retrofitImp.defaultSubscribeScheduler())
                .subscribe(new Subscriber<ModelForFunds>() {
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
                    public void onNext( ModelForFunds  modelForFunds) {
                        if (!isViewAttached()) {
                            return;
                        }
                        getMvpView().hideLoading();
                        getMvpView().getFundList(modelForFunds);
                    }
                });
    }

    @Override
    public void getLoadMoreFundList(int limit, int offset) {
        auth="Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoxMDI3LCJ1c2VybmFtZSI6Ijk4MTE4ODU5ODkiLCJleHAiOjE1NTE3NzA1MzcsImVtYWlsIjoia2xzYWRqbGFAYXNkLmFjb20iLCJtb2JpbGUiOiI5ODExODg1OTg5In0.yNnIloeXKJk5q77osuieKAWR-1vhAjpGbjdTh-u3A7E";
        retrofitImp.getRetrofitServices().getFunds(auth,limit,offset)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(retrofitImp.defaultSubscribeScheduler())
                .subscribe(new Subscriber<ModelForFunds>() {
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
                    public void onNext( ModelForFunds  modelForFunds) {
                        if (!isViewAttached()) {
                            return;
                        }
                        getMvpView().getLoadFundList(modelForFunds);
                    }
                });
    }

}

