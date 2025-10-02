package com.braintreepayments.api;

import android.database.SQLException;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;

/* loaded from: classes4.dex */
class AnalyticsDatabase_AutoMigration_3_4_Impl extends Migration {
    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) throws SQLException {
        ((FrameworkSQLiteDatabase) supportSQLiteDatabase).c1("ALTER TABLE `analytics_event` ADD COLUMN `venmo_installed` INTEGER NOT NULL DEFAULT 0");
    }
}
