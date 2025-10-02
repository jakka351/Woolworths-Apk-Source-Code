package androidx.room;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/QueryInterceptorDatabase;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class QueryInterceptorDatabase implements SupportSQLiteDatabase {
    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final long D() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final long D0() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void N() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final List O() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void O1(int i) {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final SupportSQLiteStatement S1(String sql) {
        Intrinsics.h(sql, "sql");
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void W() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void a2(Object[] bindArgs) {
        Intrinsics.h(bindArgs, "bindArgs");
        ListBuilder listBuilderV = CollectionsKt.v();
        CollectionsKt.j(listBuilderV, bindArgs);
        CollectionsKt.q(listBuilderV);
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void c1(String sql) {
        Intrinsics.h(sql, "sql");
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean c2() {
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean e0() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final Cursor g0(SupportSQLiteQuery query) {
        Intrinsics.h(query, "query");
        query.d(new QueryInterceptorProgram());
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean g1() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final String getPath() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final int getVersion() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean isReadOnly() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean l2() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void o1() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean r2() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void v1() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final int v2(ContentValues contentValues, Object[] objArr) {
        throw null;
    }
}
