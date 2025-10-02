package com.salesforce.marketingcloud.storage.db.upgrades;

import android.annotation.SuppressLint;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;

@SuppressLint
/* loaded from: classes6.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17061a = com.salesforce.marketingcloud.g.a("Version9ToVersion10");

    private j() {
    }

    private static void a(SQLiteDatabase sQLiteDatabase) {
        try {
            try {
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.execSQL("CREATE TABLE device_stats(id INTEGER PRIMARY KEY, type INTEGER, date INTEGER, event_data TEXT, in_transit INTEGER DEFAULT 0, ready_to_send INTEGER DEFAULT 0);");
                sQLiteDatabase.setTransactionSuccessful();
            } catch (Exception e) {
                com.salesforce.marketingcloud.g.b(f17061a, e, "Unable to create device stats table.", new Object[0]);
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    private static void b(SQLiteDatabase sQLiteDatabase) {
        try {
            try {
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.execSQL("CREATE TABLE triggers (id TEXT PRIMARY KEY, _key TEXT, start_date INTEGER DEFAULT NULL, _trigger TEXT, app_open_count INTEGER DEFAULT 0);");
                sQLiteDatabase.execSQL("CREATE TABLE in_app_messages(id TEXT PRIMARY KEY, priority INTEGER DEFAULT 999, start_date DATETIME, end_date DATETIME, modified_date DATETIME, display_limit INTEGER DEFAULT 1, media_url TEXT DEFAULT NULL, message_json TEXT);");
                sQLiteDatabase.execSQL("CREATE TABLE iam_state(id TEXT PRIMARY KEY, display_count integer DEFAULT 0, FOREIGN KEY (id) REFERENCES in_app_messages(id) ON DELETE CASCADE);");
                sQLiteDatabase.execSQL("CREATE TRIGGER iam_state_init AFTER INSERT ON in_app_messages BEGIN INSERT INTO iam_state (id) VALUES (NEW.id); END;");
                sQLiteDatabase.execSQL("CREATE VIEW iam_view AS SELECT in_app_messages.id,in_app_messages.priority,in_app_messages.start_date,in_app_messages.end_date,in_app_messages.modified_date,in_app_messages.display_limit,in_app_messages.message_json,iam_state.display_count FROM in_app_messages INNER JOIN iam_state ON iam_state.id = in_app_messages.id;");
                sQLiteDatabase.setTransactionSuccessful();
            } catch (Exception e) {
                com.salesforce.marketingcloud.g.b(f17061a, e, "Unable to create in app message table", new Object[0]);
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    private static void c(@NonNull SQLiteDatabase sQLiteDatabase) {
        try {
            try {
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.execSQL("CREATE TABLE region_messages ( region_id TEXT, message_id TEXT, FOREIGN KEY (region_id) REFERENCES regions(id) ON DELETE CASCADE, PRIMARY KEY (region_id, message_id));");
                sQLiteDatabase.execSQL("INSERT INTO region_messages SELECT region_id,message_id FROM region_message;");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS region_message");
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
            } catch (SQLException e) {
                com.salesforce.marketingcloud.g.b(f17061a, e, "Unable to create region_messages table and migrate data from region_message.", new Object[0]);
                try {
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS region_messages");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS region_message");
                    sQLiteDatabase.execSQL("CREATE TABLE region_messages ( region_id TEXT, message_id TEXT, FOREIGN KEY (region_id) REFERENCES regions(id) ON DELETE CASCADE, PRIMARY KEY (region_id, message_id));");
                    sQLiteDatabase.setTransactionSuccessful();
                } catch (SQLException e2) {
                    com.salesforce.marketingcloud.g.b(f17061a, e2, "Unable to create region_messages table", new Object[0]);
                }
                sQLiteDatabase.endTransaction();
            }
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(3:5|(2:(16:109|7|103|8|(5:115|10|11|111|12)(1:19)|20|(1:22)|23|(11:121|25|(4:27|(8:30|31|32|33|118|34|126|28)|125|41)(1:42)|43|(4:46|(1:48)|(1:50)|51)|52|53|105|54|66|(1:124)(1:69))(0)|80|107|81|(3:83|(2:(2:85|(1:123)(1:88))|87)|93)|94|97|98)|68)(1:72)|73)(1:76)|107|81|(0)|94|97|98) */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0288, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0291, code lost:
    
        com.salesforce.marketingcloud.g.b(com.salesforce.marketingcloud.storage.db.upgrades.j.f17061a, r0, "Unable to update inbox status values", new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0229 A[EDGE_INSN: B:124:0x0229->B:68:0x0229 BREAK  A[LOOP:1: B:109:0x0036->B:69:0x022a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x022a A[LOOP:1: B:109:0x0036->B:69:0x022a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0263 A[Catch: all -> 0x0286, Exception -> 0x0288, TryCatch #11 {Exception -> 0x0288, blocks: (B:81:0x025a, B:83:0x0263, B:85:0x0269, B:93:0x028a, B:94:0x028d), top: B:107:0x025a, outer: #2 }] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(@androidx.annotation.NonNull android.database.sqlite.SQLiteDatabase r21, @androidx.annotation.NonNull com.salesforce.marketingcloud.util.c r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.storage.db.upgrades.j.a(android.database.sqlite.SQLiteDatabase, com.salesforce.marketingcloud.util.c):void");
    }

    public static void b(@NonNull SQLiteDatabase sQLiteDatabase, @NonNull com.salesforce.marketingcloud.util.c cVar) throws Throwable {
        a(sQLiteDatabase, cVar);
        b(sQLiteDatabase);
        a(sQLiteDatabase);
        c(sQLiteDatabase);
    }
}
