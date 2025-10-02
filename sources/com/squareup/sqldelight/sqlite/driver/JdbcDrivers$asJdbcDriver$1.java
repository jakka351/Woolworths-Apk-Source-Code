package com.squareup.sqldelight.sqlite.driver;

import java.sql.Connection;
import java.sql.SQLException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/squareup/sqldelight/sqlite/driver/JdbcDrivers$asJdbcDriver$1", "Lcom/squareup/sqldelight/sqlite/driver/JdbcDriver;", "sqldelight-jdbc-driver"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class JdbcDrivers$asJdbcDriver$1 extends JdbcDriver {
    @Override // com.squareup.sqldelight.sqlite.driver.ConnectionManager
    public final void a(Connection connection) throws SQLException {
        Intrinsics.h(connection, "connection");
        connection.close();
    }
}
