package com.braintreepayments.api;

import android.database.SQLException;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class AnalyticsDatabase_Impl extends AnalyticsDatabase {
    public volatile AnalyticsEventBlobDao_Impl o;

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker e() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "analytics_event_blob");
    }

    @Override // androidx.room.RoomDatabase
    public final SupportSQLiteOpenHelper f(DatabaseConfiguration databaseConfiguration) {
        RoomOpenHelper roomOpenHelper = new RoomOpenHelper(databaseConfiguration, new RoomOpenHelper.Delegate() { // from class: com.braintreepayments.api.AnalyticsDatabase_Impl.1
            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) throws SQLException {
                frameworkSQLiteDatabase.c1("CREATE TABLE IF NOT EXISTS `analytics_event_blob` (`json_string` TEXT NOT NULL, `_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
                frameworkSQLiteDatabase.c1("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                frameworkSQLiteDatabase.c1("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '065b039e1e06945e854870d014261016')");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void b(FrameworkSQLiteDatabase frameworkSQLiteDatabase) throws SQLException {
                frameworkSQLiteDatabase.c1("DROP TABLE IF EXISTS `analytics_event_blob`");
                AnalyticsDatabase_Impl analyticsDatabase_Impl = AnalyticsDatabase_Impl.this;
                List list = analyticsDatabase_Impl.g;
                if (list != null) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) analyticsDatabase_Impl.g.get(i)).getClass();
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void c(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
                AnalyticsDatabase_Impl analyticsDatabase_Impl = AnalyticsDatabase_Impl.this;
                List list = analyticsDatabase_Impl.g;
                if (list != null) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) analyticsDatabase_Impl.g.get(i)).getClass();
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void d(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
                AnalyticsDatabase_Impl.this.f3718a = frameworkSQLiteDatabase;
                AnalyticsDatabase_Impl.this.m(frameworkSQLiteDatabase);
                List list = AnalyticsDatabase_Impl.this.g;
                if (list != null) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) AnalyticsDatabase_Impl.this.g.get(i)).a(frameworkSQLiteDatabase);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void e(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void f(FrameworkSQLiteDatabase frameworkSQLiteDatabase) throws IOException, SQLException {
                DBUtil.a(frameworkSQLiteDatabase);
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final RoomOpenHelper.ValidationResult g(FrameworkSQLiteDatabase frameworkSQLiteDatabase) throws IOException {
                HashMap map = new HashMap(2);
                map.put("json_string", new TableInfo.Column(0, "json_string", "TEXT", null, true, 1));
                map.put("_id", new TableInfo.Column(1, "_id", "INTEGER", null, true, 1));
                TableInfo tableInfo = new TableInfo("analytics_event_blob", map, new HashSet(0), new HashSet(0));
                TableInfo tableInfoA = TableInfo.Companion.a(frameworkSQLiteDatabase, "analytics_event_blob");
                if (tableInfo.equals(tableInfoA)) {
                    return new RoomOpenHelper.ValidationResult(true, null);
                }
                return new RoomOpenHelper.ValidationResult(false, "analytics_event_blob(com.braintreepayments.api.AnalyticsEventBlob).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfoA);
            }
        }, "065b039e1e06945e854870d014261016", "56c8ea595c439f4f70d21d9755ea39fc");
        SupportSQLiteOpenHelper.Configuration.Builder builderA = SupportSQLiteOpenHelper.Configuration.Companion.a(databaseConfiguration.f3709a);
        builderA.b = databaseConfiguration.b;
        builderA.c = roomOpenHelper;
        return databaseConfiguration.c.d(builderA.a());
    }

    @Override // androidx.room.RoomDatabase
    public final List g(Map map) {
        return Arrays.asList(new AnalyticsDatabase_AutoMigration_1_2_Impl(1, 2), new AnalyticsDatabase_AutoMigration_2_3_Impl(2, 3), new AnalyticsDatabase_AutoMigration_3_4_Impl(3, 4), new AnalyticsDatabase_AutoMigration_4_5_Impl(4, 5), new AnalyticsDatabase_AutoMigration_5_6_Impl(5, 6), new AnalyticsDatabase_AutoMigration_6_7_Impl(6, 7));
    }

    @Override // androidx.room.RoomDatabase
    public final Set j() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final Map k() {
        HashMap map = new HashMap();
        map.put(AnalyticsEventBlobDao.class, Collections.EMPTY_LIST);
        return map;
    }

    @Override // com.braintreepayments.api.AnalyticsDatabase
    public final AnalyticsEventBlobDao t() {
        AnalyticsEventBlobDao_Impl analyticsEventBlobDao_Impl;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            try {
                if (this.o == null) {
                    this.o = new AnalyticsEventBlobDao_Impl(this);
                }
                analyticsEventBlobDao_Impl = this.o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return analyticsEventBlobDao_Impl;
    }
}
