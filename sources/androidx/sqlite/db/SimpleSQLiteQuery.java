package androidx.sqlite.db;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/sqlite/db/SimpleSQLiteQuery;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "Companion", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SimpleSQLiteQuery implements SupportSQLiteQuery {
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/sqlite/db/SimpleSQLiteQuery$Companion;", "", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public SimpleSQLiteQuery(String query) {
        Intrinsics.h(query, "query");
        this.d = query;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    /* renamed from: a, reason: from getter */
    public final String getD() {
        return this.d;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public final void d(SupportSQLiteProgram supportSQLiteProgram) {
    }
}
