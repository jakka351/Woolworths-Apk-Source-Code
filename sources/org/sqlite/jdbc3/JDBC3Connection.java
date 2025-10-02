package org.sqlite.jdbc3;

import YU.a;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicInteger;
import org.sqlite.SQLiteConnection;

/* loaded from: classes8.dex */
public abstract class JDBC3Connection extends SQLiteConnection {
    public final AtomicInteger g;
    public Map h;

    public JDBC3Connection(String str, String str2, Properties properties) {
        super(str, str2, properties);
        this.g = new AtomicInteger(0);
    }

    @Override // java.sql.Connection
    public final void clearWarnings() {
    }

    @Override // java.sql.Connection
    public final Statement createStatement() {
        return createStatement(1003, 1007, 2);
    }

    @Override // java.sql.Connection
    public final Struct createStruct(String str, Object[] objArr) throws SQLException {
        throw new SQLException("unsupported by SQLite");
    }

    @Override // java.sql.Connection
    public final String getCatalog() throws SQLException {
        b();
        return null;
    }

    @Override // java.sql.Connection
    public final int getHoldability() throws SQLException {
        b();
        return 2;
    }

    @Override // java.sql.Connection
    public final Map getTypeMap() {
        Map map;
        synchronized (this) {
            try {
                if (this.h == null) {
                    this.h = new HashMap();
                }
                map = this.h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return map;
    }

    @Override // java.sql.Connection
    public final SQLWarning getWarnings() {
        return null;
    }

    @Override // java.sql.Connection
    public final boolean isReadOnly() {
        return (this.d.f.b & 1) != 0;
    }

    @Override // java.sql.Connection
    public final String nativeSQL(String str) {
        return str;
    }

    @Override // java.sql.Connection
    public final CallableStatement prepareCall(String str) throws SQLException {
        prepareCall(str, 1003, 1007, 2);
        throw null;
    }

    @Override // java.sql.Connection
    public final PreparedStatement prepareStatement(String str) {
        return prepareStatement(str, 1003, 1007, 2);
    }

    @Override // java.sql.Connection
    public final void releaseSavepoint(Savepoint savepoint) throws SQLException {
        b();
        if (getAutoCommit()) {
            throw new SQLException("database in auto-commit mode");
        }
        this.d.i("RELEASE SAVEPOINT " + savepoint.getSavepointName(), false);
    }

    @Override // java.sql.Connection
    public final void rollback(Savepoint savepoint) throws SQLException {
        b();
        if (getAutoCommit()) {
            throw new SQLException("database in auto-commit mode");
        }
        this.d.i(a.A("ROLLBACK TO SAVEPOINT ", savepoint.getSavepointName()), getAutoCommit());
    }

    @Override // java.sql.Connection
    public final void setHoldability(int i) throws SQLException {
        b();
        if (i != 2) {
            throw new SQLException("SQLite only supports CLOSE_CURSORS_AT_COMMIT");
        }
    }

    @Override // java.sql.Connection
    public final void setReadOnly(boolean z) throws SQLException {
        if (z != isReadOnly()) {
            throw new SQLException("Cannot change read-only flag after establishing a connection. Use SQLiteConfig#setReadOnly and SQLiteConfig.createConnection().");
        }
    }

    @Override // java.sql.Connection
    public final Savepoint setSavepoint() throws SQLException {
        b();
        if (getAutoCommit()) {
            this.f.j = false;
        }
        JDBC3Savepoint jDBC3Savepoint = new JDBC3Savepoint(this.g.incrementAndGet());
        this.d.i("SAVEPOINT " + jDBC3Savepoint.getSavepointName(), false);
        return jDBC3Savepoint;
    }

    @Override // java.sql.Connection
    public final void setTypeMap(Map map) {
        synchronized (this) {
            this.h = map;
        }
    }

    @Override // java.sql.Connection
    public final Statement createStatement(int i, int i2) {
        return createStatement(i, i2, 2);
    }

    @Override // java.sql.Connection
    public final CallableStatement prepareCall(String str, int i, int i2) throws SQLException {
        prepareCall(str, i, i2, 2);
        throw null;
    }

    @Override // java.sql.Connection
    public final PreparedStatement prepareStatement(String str, int i, int i2) {
        return prepareStatement(str, i, i2, 2);
    }

    @Override // java.sql.Connection
    public final CallableStatement prepareCall(String str, int i, int i2, int i3) throws SQLException {
        throw new SQLException("SQLite does not support Stored Procedures");
    }

    @Override // java.sql.Connection
    public final Savepoint setSavepoint(String str) throws SQLException {
        b();
        if (getAutoCommit()) {
            this.f.j = false;
        }
        JDBC3Savepoint jDBC3Savepoint = new JDBC3Savepoint(this.g.incrementAndGet(), str);
        this.d.i("SAVEPOINT " + jDBC3Savepoint.getSavepointName(), false);
        return jDBC3Savepoint;
    }
}
