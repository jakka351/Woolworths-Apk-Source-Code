package org.sqlite;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;
import javax.sql.DataSource;

/* loaded from: classes8.dex */
public class SQLiteDataSource implements DataSource {
    public transient PrintWriter d;
    public int e;

    @Override // javax.sql.DataSource
    public final Connection getConnection() {
        throw null;
    }

    @Override // javax.sql.CommonDataSource
    public final PrintWriter getLogWriter() {
        return this.d;
    }

    @Override // javax.sql.CommonDataSource
    public final int getLoginTimeout() {
        return this.e;
    }

    @Override // javax.sql.CommonDataSource
    public final Logger getParentLogger() throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException("getParentLogger");
    }

    @Override // java.sql.Wrapper
    public final boolean isWrapperFor(Class cls) {
        return cls.isInstance(this);
    }

    @Override // javax.sql.CommonDataSource
    public final void setLogWriter(PrintWriter printWriter) {
        this.d = printWriter;
    }

    @Override // javax.sql.CommonDataSource
    public final void setLoginTimeout(int i) {
        this.e = i;
    }

    @Override // java.sql.Wrapper
    public final Object unwrap(Class cls) {
        return this;
    }

    @Override // javax.sql.DataSource
    public final Connection getConnection(String str, String str2) {
        throw null;
    }
}
