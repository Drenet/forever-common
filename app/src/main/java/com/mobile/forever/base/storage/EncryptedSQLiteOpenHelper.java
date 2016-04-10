package com.mobile.forever.base.storage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Chris on 2/25/2016.
 */
public abstract class EncryptedSQLiteOpenHelper extends SQLiteOpenHelper {

    public EncryptedSQLiteOpenHelper(Context context, String name,
                                     SQLiteDatabase.CursorFactory factory, int version,
                                     String encryptionKeySeed) {
        super(context, name, factory, version);
    }

    /**
     * TODO: Strong, repeatable, secure Key from the Seed
     * @param seed
     * @return
     */
    private String getKeyFromSeed(String seed){
        return seed + "1";
    }

    /**
     * TODO: Custom Cursor handling
     */
}
