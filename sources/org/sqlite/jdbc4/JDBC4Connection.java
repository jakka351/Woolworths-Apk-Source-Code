package org.sqlite.jdbc4;

import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.SQLXML;
import java.sql.Statement;
import java.util.Properties;
import org.sqlite.SQLiteConnection;
import org.sqlite.jdbc3.JDBC3Connection;

/* loaded from: classes8.dex */
public class JDBC4Connection extends JDBC3Connection {
    @Override // java.sql.Connection
    public final Array createArrayOf(String str, Object[] objArr) {
        return null;
    }

    @Override // java.sql.Connection
    public final Blob createBlob() throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.Connection
    public final Clob createClob() throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.Connection
    public final NClob createNClob() throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.Connection
    public final SQLXML createSQLXML() throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.Connection
    public final Statement createStatement(int i, int i2, int i3) throws SQLException {
        b();
        SQLiteConnection.a(i, i2, i3);
        return new JDBC4Statement(this);
    }

    @Override // java.sql.Connection
    public final String getClientInfo(String str) {
        return null;
    }

    @Override // java.sql.Connection
    public final boolean isValid(int i) throws SQLException {
        if (super.isClosed()) {
            return false;
        }
        Statement statementCreateStatement = createStatement();
        try {
            return statementCreateStatement.execute("select 1");
        } finally {
            statementCreateStatement.close();
        }
    }

    @Override // java.sql.Wrapper
    public final boolean isWrapperFor(Class cls) {
        return cls.isInstance(this);
    }

    @Override // java.sql.Connection
    public final PreparedStatement prepareStatement(String str, int i, int i2, int i3) throws SQLException {
        b();
        SQLiteConnection.a(i, i2, i3);
        return new JDBC4PreparedStatement(this, str);
    }

    @Override // java.sql.Connection
    public final void setClientInfo(String str, String str2) {
    }

    @Override // java.sql.Wrapper
    public final Object unwrap(Class cls) {
        return cls.cast(this);
    }

    @Override // java.sql.Connection
    public final Properties getClientInfo() {
        return null;
    }

    @Override // java.sql.Connection
    public final void setClientInfo(Properties properties) {
    }
}
