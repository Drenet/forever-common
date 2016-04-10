package com.mobile.forever.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import com.mobile.forever.base.analytics.LogF;

/**
 * Created by Chris on 2/25/2016.
 *
 * Base class to be extended by all Forever activities.
 * Includes helpers for Android M Permissions and other common Activity tasks
 * All lifecycle methods contain logging statements
 */
public class ForeverBaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LogF.lifecycle(getClass().getName(), "onCreate", true);
    }

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        LogF.lifecycle(getClass().getName(), "onCreate (Persisted)");
    }

    @Override
    protected void onStart() {
        super.onStart();
        LogF.lifecycle(getClass().getName(), "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        LogF.lifecycle(getClass().getName(), "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        LogF.lifecycle(getClass().getName(), "onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        LogF.lifecycle(getClass().getName(), "onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LogF.lifecycle(getClass().getName(), "onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        LogF.lifecycle(getClass().getName(), "onStop");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        LogF.lifecycle(getClass().getName(), "onRestoreInstanceState");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        LogF.lifecycle(getClass().getName(), "onSaveInstanceState");
    }
}
