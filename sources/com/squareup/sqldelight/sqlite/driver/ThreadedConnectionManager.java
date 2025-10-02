package com.squareup.sqldelight.sqlite.driver;

import com.squareup.sqldelight.sqlite.driver.ConnectionManager;
import java.sql.Connection;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/sqldelight/sqlite/driver/ThreadedConnectionManager;", "Lcom/squareup/sqldelight/sqlite/driver/JdbcSqliteDriverConnectionManager;", "sqldelight-sqlite-driver"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
final class ThreadedConnectionManager extends JdbcSqliteDriverConnectionManager {
    @Override // com.squareup.sqldelight.sqlite.driver.ConnectionManager
    public final void a(Connection connection) {
        throw null;
    }

    @Override // com.squareup.sqldelight.sqlite.driver.ConnectionManager
    public final void b(ConnectionManager.Transaction transaction) {
        throw null;
    }
}
