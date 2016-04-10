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
     * TODO: Helper methods to read cursor/db values
     */
}
