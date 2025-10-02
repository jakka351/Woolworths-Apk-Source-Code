package org.sqlite.javax;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.ConnectionEvent;
import javax.sql.ConnectionEventListener;
import org.sqlite.jdbc4.JDBC4PooledConnection;

/* loaded from: classes8.dex */
public class SQLitePooledConnection extends JDBC4PooledConnection {

    /* renamed from: a, reason: collision with root package name */
    public volatile Connection f26903a;

    @Override // javax.sql.PooledConnection
    public final void addConnectionEventListener(ConnectionEventListener connectionEventListener) {
        throw null;
    }

    @Override // javax.sql.PooledConnection
    public final void close() {
        if (this.f26903a != null) {
            throw null;
        }
    }

    @Override // javax.sql.PooledConnection
    public final Connection getConnection() throws SQLException {
        if (this.f26903a != null) {
            this.f26903a.close();
        }
        this.f26903a = (Connection) Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{Connection.class}, new InvocationHandler() { // from class: org.sqlite.javax.SQLitePooledConnection.1

            /* renamed from: a, reason: collision with root package name */
            public boolean f26904a;

            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                SQLitePooledConnection sQLitePooledConnection = SQLitePooledConnection.this;
                try {
                    String name = method.getName();
                    if ("close".equals(name)) {
                        new ConnectionEvent(sQLitePooledConnection);
                        throw null;
                    }
                    if ("isClosed".equals(name)) {
                        if (!this.f26904a) {
                            this.f26904a = ((Boolean) method.invoke(null, objArr)).booleanValue();
                        }
                        return Boolean.valueOf(this.f26904a);
                    }
                    if (this.f26904a) {
                        throw new SQLException("Connection is closed");
                    }
                    return method.invoke(null, objArr);
                } catch (InvocationTargetException e) {
                    throw e.getCause();
                } catch (SQLException e2) {
                    if (!"database connection closed".equals(e2.getMessage())) {
                        throw e2;
                    }
                    new ConnectionEvent(sQLitePooledConnection, e2);
                    throw null;
                }
            }
        });
        return this.f26903a;
    }

    @Override // javax.sql.PooledConnection
    public final void removeConnectionEventListener(ConnectionEventListener connectionEventListener) {
        throw null;
    }
}
