package com.mobile.forever.base.analytics;

import android.util.Log;

/**
 * Created by Chris on 2/25/2016.
 */
public class LogF {

    private static final String STARS = " ***** ";

    /**
     * Helper method
     * @param tag
     * @param message
     */
    public static void error(String tag, String message){
        error(tag, message, null);
    }

    /**
     * Log the error and fire any relevant tagging
     * @param tag
     * @param message
     * @param error
     */
    public static void error(String tag, String message, Throwable error){
        Log.e(tag, message, error);

        // TODO: Analytics for the error?
    }

    public static void lifecycle(String tag, String message){
        lifecycle(tag, message, false);
    }

    public static void lifecycle(String tag, String message, boolean logAsInfo){
        if(logAsInfo){
            Log.i(tag, STARS + message + STARS);
        }else{
            Log.d(tag, STARS + message + STARS);
        }

        // TODO: Analytics?
    }

}
