package com.swrve.sdk.localstorage;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.swrve.sdk.SwrveHelper;
import com.swrve.sdk.SwrveSDKBase;

/* loaded from: classes.dex */
final class SwrveSQLiteOpenHelper extends SQLiteOpenHelper {
    public static SwrveSQLiteOpenHelper e;
    public static final Object f = new Object();
    public Context d;

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final synchronized void close() {
        synchronized (f) {
            super.close();
            e = null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY AUTOINCREMENT, user_id TEXT NOT NULL, event TEXT NOT NULL);");
        sQLiteDatabase.execSQL("CREATE TABLE cache (user_id TEXT NOT NULL, category TEXT NOT NULL, raw_data TEXT NOT NULL, PRIMARY KEY (user_id,category));");
        sQLiteDatabase.execSQL("CREATE TABLE users (swrve_user_id TEXT NOT NULL, external_user_id TEXT NOT NULL,verified BOOL NOT NULL,PRIMARY KEY (swrve_user_id,external_user_id));");
        sQLiteDatabase.execSQL("CREATE TABLE notifications_authenticated (notification_id INTEGER NOT NULL, time INTEGER NOT NULL, PRIMARY KEY (notification_id));");
        sQLiteDatabase.execSQL("CREATE INDEX notifications_authenticated_time_idx ON notifications_authenticated(time);");
        sQLiteDatabase.execSQL("CREATE TABLE offline_campaigns (user_id TEXT NOT NULL, campaign_id TEXT NOT NULL,campaign_json TEXT NOT NULL,PRIMARY KEY (user_id,campaign_id));");
        sQLiteDatabase.execSQL("CREATE TABLE asset_logs (name TEXT NOT NULL, download_count INTEGER NOT NULL, last_download_time INTEGER NOT NULL, PRIMARY KEY (name));");
        sQLiteDatabase.execSQL("CREATE INDEX asset_logs_last_download_time_idx ON asset_logs(last_download_time);");
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [com.swrve.sdk.ISwrveBase, java.lang.Object] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        SwrveSDKBase.a();
        String userId = SwrveSDKBase.f19075a.getUserId();
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                }
                sQLiteDatabase.execSQL("CREATE TABLE asset_logs (name TEXT NOT NULL, download_count INTEGER NOT NULL, last_download_time INTEGER NOT NULL, PRIMARY KEY (name))");
                sQLiteDatabase.execSQL("CREATE INDEX asset_logs_last_download_time_idx ON asset_logs(last_download_time)");
            }
            sQLiteDatabase.execSQL("CREATE TABLE offline_campaigns (swrve_user_id TEXT NOT NULL, campaign_id TEXT NOT NULL, campaign_json_data TEXT NOT NULL, PRIMARY KEY (swrve_user_id, campaign_id));");
            sQLiteDatabase.execSQL("CREATE TABLE asset_logs (name TEXT NOT NULL, download_count INTEGER NOT NULL, last_download_time INTEGER NOT NULL, PRIMARY KEY (name))");
            sQLiteDatabase.execSQL("CREATE INDEX asset_logs_last_download_time_idx ON asset_logs(last_download_time)");
        }
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN user_id TEXT");
        if (SwrveHelper.o(userId)) {
            sQLiteDatabase.execSQL("UPDATE events SET user_id='" + userId + "' WHERE user_id IS NULL OR user_id = ''");
        } else {
            sQLiteDatabase.execSQL("DELETE FROM events");
        }
        sQLiteDatabase.execSQL("ALTER TABLE server_cache RENAME TO cache");
        if (SwrveHelper.o(userId)) {
            sQLiteDatabase.execSQL("UPDATE cache SET user_id='" + userId + "' WHERE user_id='SwrveSDK.installTime'");
            sQLiteDatabase.execSQL("UPDATE cache SET user_id='" + userId + "' WHERE user_id='seqnum'");
            sQLiteDatabase.execSQL("UPDATE cache SET user_id='" + userId + "' WHERE user_id='RegistrationId'");
            sQLiteDatabase.execSQL("UPDATE cache SET user_id='" + userId + "' WHERE user_id='AppVersion'");
            sQLiteDatabase.execSQL("UPDATE cache SET user_id='" + userId + "' WHERE user_id='GoogleAdvertisingId'");
            sQLiteDatabase.execSQL("UPDATE cache SET user_id='" + userId + "' WHERE user_id='GoogleAdvertisingLimitAdTrackingEnabled'");
        }
        sQLiteDatabase.execSQL("UPDATE cache SET user_id='' WHERE user_id='device_id'");
        sQLiteDatabase.execSQL("CREATE TABLE users (swrve_user_id TEXT NOT NULL, external_user_id TEXT NOT NULL, verified BOOL NOT NULL, PRIMARY KEY (swrve_user_id, external_user_id));");
        sQLiteDatabase.execSQL("CREATE TABLE notifications_authenticated (notification_id INTEGER NOT NULL, time INTEGER NOT NULL, PRIMARY KEY (notification_id))");
        sQLiteDatabase.execSQL("CREATE INDEX notifications_authenticated_time_idx ON notifications_authenticated(time)");
        SharedPreferences sharedPreferences = this.d.getSharedPreferences("swrve_prefs", 0);
        String string = sharedPreferences.getString("campaigns_and_resources_etag", "");
        if (SwrveHelper.o(userId)) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("user_id", userId);
            contentValues.put("category", "swrve.etag");
            contentValues.put("raw_data", string);
            sQLiteDatabase.insertOrThrow("cache", null, contentValues);
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.remove("campaigns_and_resources_etag");
        editorEdit.apply();
        if (SwrveHelper.o(userId)) {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM cache WHERE category='SwrveSDK.installTime'", null);
            try {
                cursorRawQuery.moveToFirst();
                if (!cursorRawQuery.isAfterLast()) {
                    String string2 = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("raw_data"));
                    if (SwrveHelper.o(string2)) {
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("user_id", userId);
                        contentValues2.put("category", "SwrveSDK.userJoinedTime");
                        contentValues2.put("raw_data", string2);
                        sQLiteDatabase.insertOrThrow("cache", null, contentValues2);
                    }
                }
                cursorRawQuery.close();
            } catch (Throwable th) {
                if (cursorRawQuery != null) {
                    try {
                        cursorRawQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        sQLiteDatabase.execSQL("DELETE FROM cache WHERE user_id='' AND category='SwrveSDK.installTime'");
        sQLiteDatabase.execSQL("CREATE TABLE offline_campaigns (swrve_user_id TEXT NOT NULL, campaign_id TEXT NOT NULL, campaign_json_data TEXT NOT NULL, PRIMARY KEY (swrve_user_id, campaign_id));");
        sQLiteDatabase.execSQL("CREATE TABLE asset_logs (name TEXT NOT NULL, download_count INTEGER NOT NULL, last_download_time INTEGER NOT NULL, PRIMARY KEY (name))");
        sQLiteDatabase.execSQL("CREATE INDEX asset_logs_last_download_time_idx ON asset_logs(last_download_time)");
    }
}
