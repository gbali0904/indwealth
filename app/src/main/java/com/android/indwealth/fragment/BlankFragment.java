package com.android.indwealth.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.indwealth.R;
import com.android.indwealth.funds.FundsFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    public static final String TAG = BlankFragment.class.getSimpleName();

    public static Fragment newInstance() {
        BlankFragment fragment = new BlankFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }
}
