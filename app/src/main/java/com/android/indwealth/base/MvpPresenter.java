package com.android.indwealth.base;

public interface MvpPresenter<V extends MvpView> {

    void onAttach(V mvpView);

    void onDetach();

    void handleApiError(Throwable error);

    void setUserAsLoggedOut();
}
