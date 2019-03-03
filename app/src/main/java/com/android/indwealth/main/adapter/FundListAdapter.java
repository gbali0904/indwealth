package com.android.indwealth.main.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ProgressBar;

import com.android.indwealth.R;
import com.android.indwealth.base.BaseViewHolder;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FundListAdapter extends RecyclerView.Adapter<BaseViewHolder> {



    private final int VIEW_TYPE_ITEM = 0;
    private final int VIEW_TYPE_LOADING = 1;
    private OnLoadMoreListener mOnLoadMoreListener;
    private int totalItemCount;
    private int lastVisibleItem;
    private boolean isLoading;
    private int visibleThreshold = 5;
    private final static int FADE_DURATION = 2000;

    public FundListAdapter(RecyclerView mRecyclerView) {


    /*    final LinearLayoutManager linearLayoutManager = (LinearLayoutManager) mRecyclerView.getLayoutManager();
        mRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);

                totalItemCount = linearLayoutManager.getItemCount();
                lastVisibleItem = linearLayoutManager.findLastVisibleItemPosition();

                if (!isLoading && totalItemCount <= (lastVisibleItem + visibleThreshold)) {
                    if (mOnLoadMoreListener != null) {
                        mOnLoadMoreListener.onLoadMore();
                    }
                    isLoading = true;
                }
            }
        });*/

    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_funds, parent, false);
        return new DutyListViewHolder(itemView);

      /*  if (viewType == VIEW_TYPE_ITEM) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_funds, parent, false);
            return new DutyListViewHolder(view);
        } else if (viewType == VIEW_TYPE_LOADING) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.progress_dialog, parent, false);
            return new LoadingViewHolder(view);
        }
        return null;*/
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder viewHolder, final int position) {
         /* if (viewHolder instanceof DutyListViewHolder) {
              ((DutyListViewHolder) viewHolder).bind();
        } else if (viewHolder instanceof LoadingViewHolder) {
              ((LoadingViewHolder) viewHolder).bind();
        }*/

        // Set the view to fade in
        setFadeAnimation(viewHolder.itemView);

        ((DutyListViewHolder) viewHolder).bind();
    }

    private void setFadeAnimation(View itemView) {

        AlphaAnimation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(FADE_DURATION);
        itemView.startAnimation(anim);
    }

    @Override
    public int getItemCount() {
      //  return mUsers == null ? 0 : mUsers.size();
        return 5;
    }
  /*  @Override
    public int getItemViewType(int position) {
       // return mUsers.get(position) == null ? VIEW_TYPE_LOADING : VIEW_TYPE_ITEM;
        return position;
    }*/

    public void setLoaded() {
        isLoading = false;
    }


    public class DutyListViewHolder extends BaseViewHolder {

        DutyListViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        @Override
        protected void clear() {

        }

        void bind() {

        }
    }


    public void setOnLoadMoreListener(OnLoadMoreListener mOnLoadMoreListener) {
        this.mOnLoadMoreListener = mOnLoadMoreListener;
    }

    public interface OnLoadMoreListener {
        void onLoadMore();
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
            pbLoading.setIndeterminate(true);
        }
    }
}