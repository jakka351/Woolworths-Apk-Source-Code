package com.squareup.sqldelight.sqlite.driver;

import java.sql.Connection;
import java.sql.SQLException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\"\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/sqldelight/sqlite/driver/JdbcSqliteDriverConnectionManager;", "Lcom/squareup/sqldelight/sqlite/driver/ConnectionManager;", "sqldelight-sqlite-driver"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
abstract class JdbcSqliteDriverConnectionManager implements ConnectionManager {
    @Override // com.squareup.sqldelight.sqlite.driver.ConnectionManager
    public final void c(Connection connection) throws SQLException {
        Intrinsics.h(connection, "<this>");
        connection.prepareStatement("END TRANSACTION").execute();
    }

    @Override // com.squareup.sqldelight.sqlite.driver.ConnectionManager
    public final void d(Connection connection) throws SQLException {
        Intrinsics.h(connection, "<this>");
        connection.prepareStatement("ROLLBACK TRANSACTION").execute();
    }
}
