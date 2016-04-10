package com.mobile.forever.base.interactive;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

import com.mobile.forever.base.R;

/**
 * Created by Chris on 4/9/2016.
 */
public class DialogUtil {

    AlertDialog.Builder b;

    public DialogUtil(Context c){
        b = new AlertDialog.Builder(c);
        b.setPositiveButton(c.getString(R.string.ok), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        b.setCancelable(true);
    }

    public DialogUtil withTitle(String title){
        b.setTitle(title);
        return this;
    }

    public DialogUtil withNegativeButton(String btnTxt, DialogInterface.OnClickListener btnOnClick){
        b.setNegativeButton(btnTxt, btnOnClick);
        return this;
    }

    public DialogUtil withPositiveButton(String btnTxt, DialogInterface.OnClickListener btnOnClick){
        b.setPositiveButton(btnTxt, btnOnClick);
        return this;
    }

    public DialogUtil setCancelable(boolean cancelable, DialogInterface.OnCancelListener onCancel){
        b.setCancelable(cancelable);
        if(cancelable){
            b.setOnCancelListener(onCancel);
        }
        return this;
    }

    public void show(String message){
        b.setMessage(message);
        b.create().show();
    }

}
