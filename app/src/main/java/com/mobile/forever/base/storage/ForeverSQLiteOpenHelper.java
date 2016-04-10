package com.mobile.forever.base.storage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Chris on 2/25/2016.
 */
public abstract class ForeverSQLiteOpenHelper extends SQLiteOpenHelper {

    public ForeverSQLiteOpenHelper(Context context, String name,
                                   SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    /**
     * This just makes things easier...the code sees them the same, but when we call through
     * this method we can get rid of the hard cast.
     */
    public String[] arg(String... args){
        return args;
    }

    /**
     * TODO: Helper methods to read cursor/db values
     */
}
