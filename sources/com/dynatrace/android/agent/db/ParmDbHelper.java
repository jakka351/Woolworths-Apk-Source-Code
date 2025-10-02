package com.dynatrace.android.agent.db;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.util.Utility;

/* loaded from: classes.dex */
public class ParmDbHelper extends SQLiteOpenHelper {
    public static final String d;
    public static final String e;

    static {
        boolean z = Global.f14077a;
        d = "dtxParmDbHelper";
        e = "create table parm (_id integer primary key autoincrement,visitorid integer not null,sessionid integer not null);";
    }

    public ParmDbHelper(Context context) {
        super(context, "DTXDbP", (SQLiteDatabase.CursorFactory) null, 1);
    }

    public final Long a(String str) {
        Cursor cursorQuery = getReadableDatabase().query(true, "parm", new String[]{str}, "_id=1", null, null, null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        Long lValueOf = cursorQuery.moveToFirst() ? Long.valueOf(cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow(str))) : null;
        cursorQuery.close();
        return lValueOf;
    }

    public final void b(SQLiteDatabase sQLiteDatabase, int i, int i2, String str) throws SQLException {
        boolean z = Global.f14077a;
        String str2 = d;
        if (z) {
            Utility.h(str2, str + " Db.Table(DTXDbP.parm) from version " + i + " to " + i2 + ".");
        }
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS parm");
        } catch (Exception e2) {
            if (Global.f14077a) {
                Utility.j(str2, "could not delete table parm", e2);
            }
        }
        onCreate(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        if (Global.f14077a) {
            Utility.h(d, "Creating Db.Table(DTXDbP.parm)");
        }
        sQLiteDatabase.execSQL(e);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        b(sQLiteDatabase, i, i2, "Downgrading");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        b(sQLiteDatabase, i, i2, "Upgrading");
    }
}
