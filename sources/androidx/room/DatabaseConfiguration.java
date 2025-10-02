package androidx.room;

import android.content.Context;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/DatabaseConfiguration;", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class DatabaseConfiguration {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3709a;
    public final String b;
    public final SupportSQLiteOpenHelper.Factory c;
    public final RoomDatabase.MigrationContainer d;
    public final List e;
    public final boolean f;
    public final RoomDatabase.JournalMode g;
    public final Executor h;
    public final Executor i;
    public final boolean j;
    public final boolean k;
    public final Set l;
    public final List m;
    public final List n;

    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory factory, RoomDatabase.MigrationContainer migrationContainer, ArrayList arrayList, boolean z, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z2, boolean z3, LinkedHashSet linkedHashSet, ArrayList typeConverters, ArrayList autoMigrationSpecs) {
        Intrinsics.h(context, "context");
        Intrinsics.h(migrationContainer, "migrationContainer");
        Intrinsics.h(queryExecutor, "queryExecutor");
        Intrinsics.h(transactionExecutor, "transactionExecutor");
        Intrinsics.h(typeConverters, "typeConverters");
        Intrinsics.h(autoMigrationSpecs, "autoMigrationSpecs");
        this.f3709a = context;
        this.b = str;
        this.c = factory;
        this.d = migrationContainer;
        this.e = arrayList;
        this.f = z;
        this.g = journalMode;
        this.h = queryExecutor;
        this.i = transactionExecutor;
        this.j = z2;
        this.k = z3;
        this.l = linkedHashSet;
        this.m = typeConverters;
        this.n = autoMigrationSpecs;
    }
}
