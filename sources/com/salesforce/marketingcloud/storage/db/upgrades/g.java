package com.salesforce.marketingcloud.storage.db.upgrades;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;

/* loaded from: classes6.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17058a = com.salesforce.marketingcloud.g.a("Version6ToVersion7");

    private static void a(SQLiteDatabase sQLiteDatabase) {
        try {
            try {
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.execSQL("ALTER TABLE registration ADD COLUMN signed_string VARCHAR DEFAULT NULL");
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
            } catch (SQLException e) {
                try {
                    com.salesforce.marketingcloud.g.b(f17058a, e, "Unable to update registration table", new Object[0]);
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS registration");
                    sQLiteDatabase.execSQL("CREATE TABLE registration (id INTEGER PRIMARY KEY AUTOINCREMENT, platform VARCHAR, subscriber_key VARCHAR, et_app_id VARCHAR, timezone INTEGER, dst SMALLINT, tags VARCHAR, attributes VARCHAR, platform_version VARCHAR, push_enabled SMALLINT, location_enabled SMALLINT, proximity_enabled SMALLINT, hwid VARCHAR, system_token VARCHAR, device_id VARCHAR, app_version VARCHAR, sdk_version VARCHAR, signed_string VARCHAR, locale VARCHAR );");
                    sQLiteDatabase.setTransactionSuccessful();
                } catch (SQLException e2) {
                    com.salesforce.marketingcloud.g.b(f17058a, e2, "Unable to create registration table", new Object[0]);
                }
                sQLiteDatabase.endTransaction();
            }
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    public static void b(@NonNull SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase);
    }
}
