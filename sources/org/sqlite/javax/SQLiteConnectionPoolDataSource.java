package org.sqlite.javax;

import javax.sql.ConnectionPoolDataSource;
import javax.sql.PooledConnection;
import org.sqlite.SQLiteDataSource;

/* loaded from: classes8.dex */
public class SQLiteConnectionPoolDataSource extends SQLiteDataSource implements ConnectionPoolDataSource {
    @Override // javax.sql.ConnectionPoolDataSource
    public final PooledConnection getPooledConnection() {
        throw null;
    }

    @Override // javax.sql.ConnectionPoolDataSource
    public final PooledConnection getPooledConnection(String str, String str2) {
        throw null;
    }
}
