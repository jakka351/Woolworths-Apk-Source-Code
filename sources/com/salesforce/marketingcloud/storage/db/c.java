package com.salesforce.marketingcloud.storage.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Locale;

/* loaded from: classes6.dex */
class c {
    private c() {
    }

    public static String a(String str, Object... objArr) {
        return String.format(Locale.ENGLISH, str, objArr);
    }

    public static boolean a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        Locale locale = Locale.ENGLISH;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery(YU.a.j("SELECT EXISTS(SELECT 1 FROM sqlite_master WHERE type='", str, "' and name='", str2, "')"), null);
        boolean z = false;
        if (cursorRawQuery.moveToFirst() && cursorRawQuery.getInt(0) == 0) {
            z = true;
        }
        cursorRawQuery.close();
        return z;
    }
}
