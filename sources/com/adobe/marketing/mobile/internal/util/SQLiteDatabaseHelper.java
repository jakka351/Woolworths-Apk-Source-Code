package com.adobe.marketing.mobile.internal.util;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.adobe.marketing.mobile.services.Log;
import java.io.File;

/* loaded from: classes.dex */
public class SQLiteDatabaseHelper {

    public enum DatabaseOpenMode {
        READ_ONLY(1),
        READ_WRITE(0);

        public final int d;

        DatabaseOpenMode(int i) {
            this.d = i;
        }
    }

    public static void a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase == null) {
            Log.a();
        } else {
            sQLiteDatabase.close();
            Log.c();
        }
    }

    public static boolean b(String str, String str2) {
        SQLiteDatabase sQLiteDatabaseC = null;
        try {
            try {
                sQLiteDatabaseC = c(str, DatabaseOpenMode.READ_WRITE);
                sQLiteDatabaseC.execSQL(str2);
                a(sQLiteDatabaseC);
                return true;
            } catch (SQLiteException e) {
                e.getMessage();
                Log.d();
                a(sQLiteDatabaseC);
                return false;
            }
        } catch (Throwable th) {
            a(sQLiteDatabaseC);
            throw th;
        }
    }

    public static SQLiteDatabase c(String str, DatabaseOpenMode databaseOpenMode) {
        if (str == null || str.isEmpty()) {
            Log.a();
            throw new SQLiteException("Invalid database path. Database path is null or empty.");
        }
        try {
            File parentFile = new File(str).getParentFile();
            if (parentFile != null && !parentFile.exists()) {
                parentFile.getPath();
                Log.a();
                parentFile.mkdirs();
            }
            SQLiteDatabase sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(str, null, databaseOpenMode.d | 268435472);
            Log.c();
            return sQLiteDatabaseOpenDatabase;
        } catch (Exception unused) {
            Log.a();
            throw new SQLiteException("Invalid database path. Unable to create parent directory for database.");
        }
    }

    public static boolean d(String str, DatabaseOpenMode databaseOpenMode, DatabaseProcessing databaseProcessing) {
        SQLiteDatabase sQLiteDatabaseC = null;
        try {
            try {
                sQLiteDatabaseC = c(str, databaseOpenMode);
                boolean zA = databaseProcessing.a(sQLiteDatabaseC);
                if (sQLiteDatabaseC != null) {
                    a(sQLiteDatabaseC);
                }
                return zA;
            } catch (Exception e) {
                e.getLocalizedMessage();
                Log.d();
                if (sQLiteDatabaseC == null) {
                    return false;
                }
                a(sQLiteDatabaseC);
                return false;
            }
        } catch (Throwable th) {
            if (sQLiteDatabaseC != null) {
                a(sQLiteDatabaseC);
            }
            throw th;
        }
    }
}
