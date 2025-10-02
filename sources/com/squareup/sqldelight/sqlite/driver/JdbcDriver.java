package com.squareup.sqldelight.sqlite.driver;

import com.squareup.sqldelight.Transacter;
import com.squareup.sqldelight.db.SqlCursor;
import com.squareup.sqldelight.db.SqlDriver;
import com.squareup.sqldelight.sqlite.driver.ConnectionManager;
import java.sql.Connection;
import java.sql.SQLException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/squareup/sqldelight/sqlite/driver/JdbcDriver;", "Lcom/squareup/sqldelight/db/SqlDriver;", "Lcom/squareup/sqldelight/sqlite/driver/ConnectionManager;", "sqldelight-jdbc-driver"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public abstract class JdbcDriver implements SqlDriver, ConnectionManager {
    @Override // com.squareup.sqldelight.db.SqlDriver
    public final Transacter.Transaction L1() {
        e();
        throw null;
    }

    @Override // com.squareup.sqldelight.sqlite.driver.ConnectionManager
    public void b(ConnectionManager.Transaction transaction) {
        throw null;
    }

    @Override // com.squareup.sqldelight.sqlite.driver.ConnectionManager
    public void c(Connection connection) throws SQLException {
        Intrinsics.h(connection, "<this>");
        connection.commit();
        connection.setAutoCommit(true);
        a(connection);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.squareup.sqldelight.sqlite.driver.ConnectionManager
    public void d(Connection connection) throws SQLException {
        Intrinsics.h(connection, "<this>");
        connection.rollback();
        connection.setAutoCommit(true);
        a(connection);
    }

    public ConnectionManager.Transaction e() {
        throw null;
    }

    @Override // com.squareup.sqldelight.db.SqlDriver
    public final SqlCursor s0(Integer num, String sql, int i, Function1 function1) {
        Intrinsics.h(sql, "sql");
        e();
        throw null;
    }

    @Override // com.squareup.sqldelight.db.SqlDriver
    public final void t1(Integer num, String sql, Function1 function1) {
        Intrinsics.h(sql, "sql");
        e();
        throw null;
    }

    @Override // com.squareup.sqldelight.db.SqlDriver
    public final Transacter.Transaction x0() {
        e();
        throw null;
    }
}
