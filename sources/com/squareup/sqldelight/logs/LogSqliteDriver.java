package com.squareup.sqldelight.logs;

import com.squareup.sqldelight.Transacter;
import com.squareup.sqldelight.db.SqlCursor;
import com.squareup.sqldelight.db.SqlDriver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/sqldelight/logs/LogSqliteDriver;", "Lcom/squareup/sqldelight/db/SqlDriver;", "runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class LogSqliteDriver implements SqlDriver {
    @Override // com.squareup.sqldelight.db.SqlDriver
    public final Transacter.Transaction L1() {
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // com.squareup.sqldelight.db.SqlDriver
    public final SqlCursor s0(Integer num, String sql, int i, Function1 function1) {
        Intrinsics.h(sql, "sql");
        Intrinsics.m(sql, "QUERY\n ");
        throw null;
    }

    @Override // com.squareup.sqldelight.db.SqlDriver
    public final void t1(Integer num, String sql, Function1 function1) {
        Intrinsics.h(sql, "sql");
        Intrinsics.m(sql, "EXECUTE\n ");
        throw null;
    }

    @Override // com.squareup.sqldelight.db.SqlDriver
    public final Transacter.Transaction x0() {
        throw null;
    }
}
