package com.braintreepayments.api;

import android.database.SQLException;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;

/* loaded from: classes4.dex */
class AnalyticsDatabase_AutoMigration_4_5_Impl extends Migration {
    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) throws SQLException {
        ((FrameworkSQLiteDatabase) supportSQLiteDatabase).c1("ALTER TABLE `analytics_event` ADD COLUMN `is_vault` INTEGER NOT NULL DEFAULT 0");
    }
}
