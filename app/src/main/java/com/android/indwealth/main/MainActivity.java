package com.android.indwealth.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.SearchView;
import android.widget.TextView;

import com.android.indwealth.R;
import com.android.indwealth.base.BaseActivity;
import com.android.indwealth.main.adapter.FundListAdapter;
import com.android.indwealth.main.persenter.MainMvpPersenter;
import com.android.indwealth.main.view.MainView;

import java.util.ArrayList;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements MainView ,SearchView.OnQueryTextListener{


    @Inject
    MainMvpPersenter<MainView> mPresenter;

    @Inject
    LinearLayoutManager mLayoutManager;


    @BindView(R.id.title)
    TextView title;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.recy_fundList)
    RecyclerView recy_fundList;
    @BindView(R.id.content_layout)
    CoordinatorLayout contentLayout;
    @BindView(R.id.container)
    ConstraintLayout container;
    @BindView(R.id.searchView)
    SearchView searchView;
    private FundListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this));
        mPresenter.onAttach(MainActivity.this);
        // mPresenter.getDutyList();
        setUp();
    }

    @Override
    protected void setUp() {
        setSupportActionBar(toolbar);
        searchView.setOnQueryTextListener(this);
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        adapter = new FundListAdapter(recy_fundList);
        recy_fundList.setLayoutManager(mLayoutManager);
        recy_fundList.setItemAnimator(new DefaultItemAnimator());
        recy_fundList.setAdapter(adapter);


      /*  adapter.setOnLoadMoreListener(new FundListAdapter.OnLoadMoreListener() {
            @Override
            public void onLoadMore() {

            }

           *//* @Override
            public void onLoadMore() {
                Log.e("haint", "Load More");
                mUsers.add(null);
                mUserAdapter.notifyItemInserted(mUsers.size() - 1);

                //Load more data for reyclerview
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Log.e("haint", "Load More 2");

                        //Remove loading item
                        mUsers.remove(mUsers.size() - 1);
                        mUserAdapter.notifyItemRemoved(mUsers.size());

                        //Load data
                        int index = mUsers.size();
                        int end = index + 20;
                        for (int i = index; i < end; i++) {
                            User user = new User();
                            user.setName("Name " + i);
                            user.setEmail("alibaba" + i + "@gmail.com");
                            mUsers.add(user);
                        }
                        mUserAdapter.notifyDataSetChanged();
                        mUserAdapter.setLoaded();
                    }
                }, 5000);
            }*//*
        });
*/
    }

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        return intent;
    }


    @Override
    public boolean onQueryTextSubmit(String s) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String s) {
        Log.e("this","textChange"+s);

        return false;
    }

    @Override
    public void getFundList() {

    }
}
