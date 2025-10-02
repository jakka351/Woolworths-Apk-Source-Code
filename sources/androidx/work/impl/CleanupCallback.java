package androidx.work.impl;

import androidx.room.RoomDatabase;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import androidx.work.Clock;
import androidx.work.SystemClock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/CleanupCallback;", "Landroidx/room/RoomDatabase$Callback;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CleanupCallback extends RoomDatabase.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Clock f3916a;

    public CleanupCallback(SystemClock clock) {
        Intrinsics.h(clock, "clock");
        this.f3916a = clock;
    }

    @Override // androidx.room.RoomDatabase.Callback
    public final void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        frameworkSQLiteDatabase.N();
        try {
            frameworkSQLiteDatabase.c1("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (this.f3916a.currentTimeMillis() - WorkDatabaseKt.f3936a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            frameworkSQLiteDatabase.o1();
        } finally {
            frameworkSQLiteDatabase.v1();
        }
    }
}
