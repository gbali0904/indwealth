package com.android.indwealth.funds;


import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.indwealth.R;
import com.android.indwealth.base.BaseFragment;
import com.android.indwealth.di.component.ActivityComponent;
import com.android.indwealth.funds.adapter.FundListAdapter;
import com.android.indwealth.funds.model.ModelForFunds;
import com.android.indwealth.funds.persenter.MainMvpPersenter;
import com.android.indwealth.funds.view.MainView;
import com.android.indwealth.home.HomeActivity;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class FundsFragment extends BaseFragment implements MainView, HomeActivity.OnSearchListener {
    public static final String TAG = FundsFragment.class.getSimpleName();
    @BindView(R.id.recy_fundList)
    RecyclerView recy_fundList;
    @BindView(R.id.counts)
    TextView counts;
    @BindView(R.id.content_layout)
    LinearLayout Layoutcontent;
    int limit = 16;
    int offset = 0;
    @Inject
    MainMvpPersenter<MainView> mPresenter;

    @Inject
    LinearLayoutManager mLayoutManager;

    @Inject
    FundListAdapter adapter;

    private List<ModelForFunds.DataBean> forFundsData;
    private boolean isLoading = false;

    public static FundsFragment newInstance() {
        FundsFragment fragment = new FundsFragment();
        return fragment;
    }

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
            mPresenter.getFundList(limit, offset);
        }
        return view;
    }

    @Override
    protected void setUp(View view) {
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recy_fundList.setLayoutManager(mLayoutManager);
        recy_fundList.setItemAnimator(new DefaultItemAnimator());
        recy_fundList.setAdapter(adapter);
        HomeActivity.setOnSerachListener(this);
        loadMoreDataRecyclerviewScroller();
    }

    private void loadMoreDataRecyclerviewScroller() {
        recy_fundList.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (!isLoading) {
                    if (linearLayoutManager != null && linearLayoutManager.findLastCompletelyVisibleItemPosition() == forFundsData.size() - 1) {
                        loadMore();
                        isLoading = true;
                    }
                }
            }
        });
    }

    private void loadMore() {
        forFundsData.add(null);
        adapter.notifyItemInserted(forFundsData.size() - 1);
        offset = offset + 1;
        mPresenter.getLoadMoreFundList(limit, offset);
    }

    @Override
    public void getFundList(ModelForFunds modelForFunds) {
        counts.setText("Showing " + modelForFunds.getCount() + " Funds");
        forFundsData = modelForFunds.getData();
        adapter.setData(forFundsData);
    }

    @Override
    public void getLoadFundList(final ModelForFunds modelForFunds) {
        forFundsData.remove(forFundsData.size() - 1);
        int scrollPosition = forFundsData.size();
        adapter.notifyItemRemoved(scrollPosition);
        forFundsData.addAll(modelForFunds.getData());
        adapter.notifyDataSetChanged();
        isLoading = false;
    }

    @Override
    public void onSearch(String query) {
        if (!query.equals("") && forFundsData != null) {
            List<ModelForFunds.DataBean> filter = filter(forFundsData, query);
            adapter.filter(filter);
        } else {
            hideKeyboard();
            offset = 0;
            mPresenter.getFundList(limit, offset);
        }
    }

    private void hideKeyboard() {
        View view = getActivity().getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    private List<ModelForFunds.DataBean> filter(List<ModelForFunds.DataBean> forFundsData, String query) {
        query = query.toLowerCase();
        final List<ModelForFunds.DataBean> filteredModelList = new ArrayList<>();
        filteredModelList.clear();
        for (ModelForFunds.DataBean dataBean : forFundsData) {
            String name = dataBean.getName().toLowerCase();
            if (name.toLowerCase().contains(query)) {
                filteredModelList.add(dataBean);
            }
        }
        return filteredModelList;
    }

}
