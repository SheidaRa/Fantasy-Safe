package com.example.counter;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "counter.db";
    private static final int DATABASE_VERSION = 1;

    private static final String TABLE_COUNTER = "counter";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_VALUE = "value";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String createTable = "CREATE TABLE " + TABLE_COUNTER + " (" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                COLUMN_VALUE + " INTEGER" + ")";
        sqLiteDatabase.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_COUNTER);
        onCreate(sqLiteDatabase);
    }

    @SuppressLint("Range")
    public int getCounter() {
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();
        Cursor cursor = sqLiteDatabase.query(TABLE_COUNTER,
                new String[]{COLUMN_VALUE},
                null, null, null, null, null);

        int counter = 0;
        if (cursor.moveToFirst()) {
            counter = cursor.getInt(cursor.getColumnIndex(COLUMN_VALUE));
        }
        cursor.close();
        sqLiteDatabase.close();
        return counter;
    }

    public void saveCounter(int counter) {
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_VALUE, counter);
        sqLiteDatabase.insert(TABLE_COUNTER, null, contentValues);
        sqLiteDatabase.close();
    }
}
