package com.squareup.sqldelight.sqlite.driver;

import com.squareup.sqldelight.sqlite.driver.ConnectionManager;
import java.sql.Connection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/sqldelight/sqlite/driver/JdbcSqliteDriver;", "Lcom/squareup/sqldelight/sqlite/driver/JdbcDriver;", "Lcom/squareup/sqldelight/sqlite/driver/ConnectionManager;", "Companion", "sqldelight-sqlite-driver"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class JdbcSqliteDriver extends JdbcDriver implements ConnectionManager {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/sqldelight/sqlite/driver/JdbcSqliteDriver$Companion;", "", "", "IN_MEMORY", "Ljava/lang/String;", "sqldelight-sqlite-driver"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
    }

    @Override // com.squareup.sqldelight.sqlite.driver.ConnectionManager
    public final void a(Connection connection) {
        Intrinsics.h(connection, "connection");
        throw null;
    }

    @Override // com.squareup.sqldelight.sqlite.driver.JdbcDriver, com.squareup.sqldelight.sqlite.driver.ConnectionManager
    public final void b(ConnectionManager.Transaction transaction) {
        throw null;
    }

    @Override // com.squareup.sqldelight.sqlite.driver.JdbcDriver, com.squareup.sqldelight.sqlite.driver.ConnectionManager
    public final void c(Connection connection) {
        Intrinsics.h(connection, "<this>");
        throw null;
    }

    @Override // com.squareup.sqldelight.sqlite.driver.JdbcDriver, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // com.squareup.sqldelight.sqlite.driver.JdbcDriver, com.squareup.sqldelight.sqlite.driver.ConnectionManager
    public final void d(Connection connection) {
        Intrinsics.h(connection, "<this>");
        throw null;
    }

    @Override // com.squareup.sqldelight.sqlite.driver.JdbcDriver
    public final ConnectionManager.Transaction e() {
        throw null;
    }
}
