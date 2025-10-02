package com.braintreepayments.api;

import android.database.SQLException;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;

/* loaded from: classes4.dex */
class AnalyticsDatabase_AutoMigration_6_7_Impl extends Migration {
    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) throws SQLException {
        FrameworkSQLiteDatabase frameworkSQLiteDatabase = (FrameworkSQLiteDatabase) supportSQLiteDatabase;
        frameworkSQLiteDatabase.c1("DROP TABLE `analytics_event`");
        frameworkSQLiteDatabase.c1("CREATE TABLE IF NOT EXISTS `analytics_event_blob` (`json_string` TEXT NOT NULL, `_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
    }
}
