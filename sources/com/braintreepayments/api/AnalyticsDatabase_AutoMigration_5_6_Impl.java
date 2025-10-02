package com.braintreepayments.api;

import android.database.SQLException;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;

/* loaded from: classes4.dex */
class AnalyticsDatabase_AutoMigration_5_6_Impl extends Migration {
    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) throws SQLException {
        FrameworkSQLiteDatabase frameworkSQLiteDatabase = (FrameworkSQLiteDatabase) supportSQLiteDatabase;
        frameworkSQLiteDatabase.c1("ALTER TABLE `analytics_event` ADD COLUMN `start_time` INTEGER DEFAULT -1");
        frameworkSQLiteDatabase.c1("ALTER TABLE `analytics_event` ADD COLUMN `endpoint` TEXT DEFAULT NULL");
        frameworkSQLiteDatabase.c1("ALTER TABLE `analytics_event` ADD COLUMN `end_time` INTEGER DEFAULT -1");
    }
}
