package com.android.indwealth.api;

import com.android.indwealth.funds.model.ModelForFunds;

import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;
import rx.Completable;
import rx.Observable;

public interface ApiInterface {



    @GET("getList/")
    Observable<ModelForFunds> getFunds(@Header ("Authorization") String Authorization, @Query("limit") int limit, @Query("offset")  int offset);
}
