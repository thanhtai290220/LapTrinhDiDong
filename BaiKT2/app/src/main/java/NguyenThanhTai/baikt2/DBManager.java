package NguyenThanhTai.baikt2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class DBManager {
    private com.nguyenvanhailong.country_sqlite.DatabaseHelper dbHelper;

    private Context context;

    private SQLiteDatabase database;

    public DBManager(Context c) {
        context = c;
    }

    public DBManager open() throws SQLException {
        dbHelper = new com.nguyenvanhailong.country_sqlite.DatabaseHelper(context);
        database = dbHelper.getWritableDatabase();
        return this;
    }

    public void close() {
        dbHelper.close();
    }

    public void insert(String name, String desc) {
        ContentValues contentValue = new ContentValues();
        contentValue.put(com.nguyenvanhailong.country_sqlite.DatabaseHelper.SUBJECT, name);
        contentValue.put(com.nguyenvanhailong.country_sqlite.DatabaseHelper.DESC, desc);
        database.insert(com.nguyenvanhailong.country_sqlite.DatabaseHelper.TABLE_NAME, null, contentValue);
    }

    public Cursor fetch() {
        String[] columns = new String[] { com.nguyenvanhailong.country_sqlite.DatabaseHelper._ID, com.nguyenvanhailong.country_sqlite.DatabaseHelper.SUBJECT, com.nguyenvanhailong.country_sqlite.DatabaseHelper.DESC };
        Cursor cursor = database.query(com.nguyenvanhailong.country_sqlite.DatabaseHelper.TABLE_NAME, columns, null, null, null, null, null);
        if (cursor != null) {
            cursor.moveToFirst();
        }
        return cursor;
    }

    public int update(long _id, String name, String desc) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.nguyenvanhailong.country_sqlite.DatabaseHelper.SUBJECT, name);
        contentValues.put(com.nguyenvanhailong.country_sqlite.DatabaseHelper.DESC, desc);
        int i = database.update(com.nguyenvanhailong.country_sqlite.DatabaseHelper.TABLE_NAME, contentValues, com.nguyenvanhailong.country_sqlite.DatabaseHelper._ID + " = " + _id, null);
        return i;
    }

    public void delete(long _id) {
        database.delete(com.nguyenvanhailong.country_sqlite.DatabaseHelper.TABLE_NAME, com.nguyenvanhailong.country_sqlite.DatabaseHelper._ID + "=" + _id, null);
    }
}
