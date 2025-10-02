package androidx.work.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.SQLException;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/work/impl/WorkMigration9To10;", "Landroidx/room/migration/Migration;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WorkMigration9To10 extends Migration {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3940a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkMigration9To10(@NotNull Context context) {
        super(9, 10);
        Intrinsics.h(context, "context");
        this.f3940a = context;
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) throws SQLException {
        FrameworkSQLiteDatabase frameworkSQLiteDatabase = (FrameworkSQLiteDatabase) supportSQLiteDatabase;
        frameworkSQLiteDatabase.c1("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        Context context = this.f3940a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            frameworkSQLiteDatabase.N();
            try {
                frameworkSQLiteDatabase.a2(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                frameworkSQLiteDatabase.a2(new Object[]{"reschedule_needed", Long.valueOf(j2)});
                sharedPreferences.edit().clear().apply();
                frameworkSQLiteDatabase.o1();
            } finally {
            }
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
            int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
            int i2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
            frameworkSQLiteDatabase.N();
            try {
                frameworkSQLiteDatabase.a2(new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                frameworkSQLiteDatabase.a2(new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                sharedPreferences2.edit().clear().apply();
                frameworkSQLiteDatabase.o1();
            } finally {
            }
        }
    }
}
