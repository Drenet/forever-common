package com.mobile.forever.base;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mobile.forever.base.analytics.LogF;

/**
 * Created by Chris on 2/25/2016.
 *
 * Contains lifecycle logging
 */
public class ForeverBaseFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LogF.lifecycle(getClass().getName(), "onCreate", true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        LogF.lifecycle(getClass().getName(), "onCreateView");
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
