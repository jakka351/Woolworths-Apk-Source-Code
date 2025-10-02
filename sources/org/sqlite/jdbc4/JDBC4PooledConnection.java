package org.sqlite.jdbc4;

import javax.sql.PooledConnection;
import javax.sql.StatementEventListener;

/* loaded from: classes8.dex */
public abstract class JDBC4PooledConnection implements PooledConnection {
    @Override // javax.sql.PooledConnection
    public final void addStatementEventListener(StatementEventListener statementEventListener) {
    }

    @Override // javax.sql.PooledConnection
    public final void removeStatementEventListener(StatementEventListener statementEventListener) {
    }
}
