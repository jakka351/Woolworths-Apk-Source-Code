package androidx.room;

import androidx.sqlite.db.SupportSQLiteStatement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/QueryInterceptorStatement;", "Landroidx/sqlite/db/SupportSQLiteStatement;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class QueryInterceptorStatement implements SupportSQLiteStatement {
    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void C0(int i, long j) {
        a(i, Long.valueOf(j));
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void E0(int i, byte[] value) {
        Intrinsics.h(value, "value");
        a(i, value);
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final long M1() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void N0(int i) {
        a(i, null);
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final int P() {
        throw null;
    }

    public final void a(int i, Object obj) {
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final void execute() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void j2(double d, int i) {
        a(i, Double.valueOf(d));
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final long o0() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final String s1() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void z(int i, String value) {
        Intrinsics.h(value, "value");
        a(i, value);
        throw null;
    }
}
