package com.android.indwealth.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.SearchView;
import android.widget.TextView;

import com.android.indwealth.R;
import com.android.indwealth.base.BaseActivity;
import com.android.indwealth.funds.FundsFragment;
import com.android.indwealth.utility.FragmentManagerUtil;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends BaseActivity implements NavigationView.OnNavigationItemSelectedListener, SearchView.OnQueryTextListener {


    private static OnSearchListener mListener;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.nav_view)
    NavigationView navigationView;
    @BindView(R.id.drawer_layout)
    DrawerLayout drawer;
    @BindView(R.id.title)
    TextView title;
    @BindView(R.id.searchView)
    SearchView searchView;
    @BindView(R.id.navigation)
    BottomNavigationView navigation;
    @BindView(R.id.container)
    ConstraintLayout container;
    @BindView(R.id.relLay)
    RelativeLayout relLay;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, HomeActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
        setUp();
    }

    @Override
    protected void setUp() {
        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        navigation.setSelectedItemId(R.id.nav_explore);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        searchView.setOnQueryTextListener(this);
        FragmentManagerUtil.replaceFragment(getSupportFragmentManager(), R.id.relLay,
                FundsFragment.newInstance(), false, FundsFragment.TAG);
        showToolBar(getResources().getString(R.string.title));

    }


    public void showToolBar(String barTitle) {

        getSupportActionBar().setTitle("");
        title.setText(barTitle);
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.nav_dashboard:
                    return true;
                case R.id.nav_portfolio:
                    return true;
                case R.id.nav_liabilites:
                    return true;
                case R.id.nav_explore:
                    return true;
                case R.id.nav_profile:
                    return true;
            }
            return false;
        }
    };

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_dashboard) {
            // Handle the camera action
        } else if (id == R.id.nav_portfolio) {

        } else if (id == R.id.nav_liabilites) {

        } else if (id == R.id.nav_explore) {

        } else if (id == R.id.nav_profile) {

        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public boolean onQueryTextSubmit(String s) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String s) {
        mListener.onSearch(s);
        return false;
    }

    public static void setOnSerachListener(OnSearchListener listener) {
        mListener = listener;
    }

    public interface OnSearchListener {
        void onSearch(String query);
    }
}
