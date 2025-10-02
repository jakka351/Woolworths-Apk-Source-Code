package androidx.work.impl;

import android.database.SQLException;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;

/* loaded from: classes.dex */
final class WorkDatabase_AutoMigration_17_18_Impl extends Migration {
    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) throws SQLException {
        FrameworkSQLiteDatabase frameworkSQLiteDatabase = (FrameworkSQLiteDatabase) supportSQLiteDatabase;
        frameworkSQLiteDatabase.c1("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
        frameworkSQLiteDatabase.c1("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
    }
}
