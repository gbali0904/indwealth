package com.android.indwealth.funds;


import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.indwealth.R;
import com.android.indwealth.base.BaseFragment;
import com.android.indwealth.di.component.ActivityComponent;
import com.android.indwealth.home.HomeActivity;
import com.android.indwealth.main.adapter.FundListAdapter;
import com.android.indwealth.main.persenter.MainMvpPersenter;
import com.android.indwealth.main.view.MainView;

import java.util.ArrayList;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class FundsFragment extends BaseFragment implements MainView ,HomeActivity.OnSearchListener{
    public static final String TAG = FundsFragment.class.getSimpleName();
    @BindView(R.id.recy_fundList)
    RecyclerView recy_fundList;
    @BindView(R.id.content_layout)
    CoordinatorLayout contentLayout;
    private FundListAdapter adapter;

    @Inject
    MainMvpPersenter<MainView> mPresenter;

    @Inject
    LinearLayoutManager mLayoutManager;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_funds, container, false);
        ActivityComponent component = getActivityComponent();
        if (component != null) {
            component.inject(this);
            setUnBinder(ButterKnife.bind(this, view));
            mPresenter.onAttach(this);
        }
        return view;
    }

    public static FundsFragment newInstance() {
        FundsFragment fragment = new FundsFragment();
        return fragment;
    }

    @Override
    protected void setUp(View view) {
        HomeActivity.setOnSerachListener(this);
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        adapter = new FundListAdapter(recy_fundList);
        recy_fundList.setLayoutManager(mLayoutManager);
        recy_fundList.setItemAnimator(new DefaultItemAnimator());
        recy_fundList.setAdapter(adapter);

    }


    @Override
    public void getFundList() {

    }

    @Override
    public void onSearch(String query) {

    }
}
