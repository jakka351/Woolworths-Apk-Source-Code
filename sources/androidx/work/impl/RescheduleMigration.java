package androidx.work.impl;

import android.content.Context;
import android.database.SQLException;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/RescheduleMigration;", "Landroidx/room/migration/Migration;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RescheduleMigration extends Migration {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3929a;

    public RescheduleMigration(Context context, int i, int i2) {
        super(i, i2);
        this.f3929a = context;
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) throws SQLException {
        if (this.endVersion < 10) {
            this.f3929a.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        } else {
            ((FrameworkSQLiteDatabase) supportSQLiteDatabase).a2(new Object[]{"reschedule_needed", 1});
        }
    }
}
