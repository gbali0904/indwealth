package com.android.indwealth.funds.adapter;

import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.android.indwealth.R;
import com.android.indwealth.base.BaseViewHolder;
import com.android.indwealth.funds.model.ModelForFunds;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FundListAdapter extends RecyclerView.Adapter<BaseViewHolder> {


    private final int VIEW_TYPE_ITEM = 0;
    private final int VIEW_TYPE_LOADING = 1;

    private final static int FADE_DURATION = 1000;
    private List<ModelForFunds.DataBean> forFundsData;
    private int lastPosition = -1;

    public FundListAdapter() {
        forFundsData = new ArrayList<>();
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == VIEW_TYPE_ITEM) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_funds, parent, false);
            return new DutyListViewHolder(view);
        } else {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.progress_dialog, parent, false);
            return new LoadingViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder viewHolder, final int position) {
        if (viewHolder instanceof DutyListViewHolder) {
            setFadeAnimation(viewHolder.itemView, position);
            ((DutyListViewHolder) viewHolder).bind(forFundsData.get(position));
        } else if (viewHolder instanceof LoadingViewHolder) {
            ((LoadingViewHolder) viewHolder).bind();
        }
    }

    private void setFadeAnimation(View itemView, int position) {
        if (position > lastPosition) {
            AlphaAnimation anim = new AlphaAnimation(0.0f, 1.0f);
            anim.setDuration(FADE_DURATION);
            itemView.startAnimation(anim);
            lastPosition = position;
        }
    }

    @Override
    public int getItemCount() {
        return forFundsData == null ? 0 : forFundsData.size();
    }

    @Override
    public int getItemViewType(int position) {
        return forFundsData.get(position) == null ? VIEW_TYPE_LOADING : VIEW_TYPE_ITEM;
    }

    public void setData(List<ModelForFunds.DataBean> forFundsData) {
        this.forFundsData = forFundsData;
        notifyDataSetChanged();
    }

    public void filter(List<ModelForFunds.DataBean> filter) {
        this.forFundsData = filter;
        notifyDataSetChanged();
    }

    public class DutyListViewHolder extends BaseViewHolder {
        @BindView(R.id.name)
        TextView name;
        @BindView(R.id.txtFiryearreturn)
        TextView txtFiryearreturn;
        @BindView(R.id.txtAUM)
        TextView txtAUM;
        @BindView(R.id.txtexpense)
        TextView txtexpense;
        @BindView(R.id.txtrating)
        TextView txtrating;
        @BindView(R.id.imgRating)
        ImageView imgRating;
        @BindView(R.id.ll)
        FrameLayout ll;

        DutyListViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        @Override
        protected void clear() {
        }

        void bind(ModelForFunds.DataBean dataBean) {
            name.setText(dataBean.getName());
            txtFiryearreturn.setText(dataBean.getReturns().getOneYear() + "%");
            int aum = dataBean.getAum() * 10000000;
            txtAUM.setText("₹" + aum);
            txtexpense.setText(dataBean.getExpenseRatio() + "%");
            txtrating.setText(String.valueOf(dataBean.getRating()));
        }
    }

    public class LoadingViewHolder extends BaseViewHolder {
        @BindView(R.id.pb_loading)
        ProgressBar pbLoading;

        public LoadingViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, itemView);
        }

        @Override
        protected void clear() {
        }

        public void bind() {
        }
    }
}