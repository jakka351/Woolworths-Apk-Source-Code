package org.sqlite.jdbc4;

import java.io.InputStream;
import java.io.Reader;
import java.sql.NClob;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.RowId;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.SQLXML;
import java.util.Arrays;
import org.sqlite.SQLiteConnection;
import org.sqlite.core.DB;
import org.sqlite.jdbc3.JDBC3PreparedStatement;

/* loaded from: classes8.dex */
public class JDBC4PreparedStatement extends JDBC3PreparedStatement implements PreparedStatement, ParameterMetaData {
    public JDBC4PreparedStatement(SQLiteConnection sQLiteConnection, String str) {
        super(sQLiteConnection);
        this.g = str;
        DB dbE = sQLiteConnection.e();
        dbE.q(this);
        this.e.h = dbE.d(this.f);
        this.l = dbE.column_count(this.f);
        this.m = dbE.bind_parameter_count(this.f);
        this.n = 0;
        this.i = null;
        this.h = 0;
    }

    @Override // java.sql.PreparedStatement
    public final void setAsciiStream(int i, InputStream inputStream, long j) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.PreparedStatement
    public final void setBinaryStream(int i, InputStream inputStream, long j) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.PreparedStatement
    public final void setBlob(int i, InputStream inputStream, long j) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.PreparedStatement
    public final void setCharacterStream(int i, Reader reader, long j) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.PreparedStatement
    public final void setClob(int i, Reader reader, long j) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.PreparedStatement
    public final void setNCharacterStream(int i, Reader reader, long j) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.PreparedStatement
    public final void setNClob(int i, NClob nClob) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.PreparedStatement
    public final void setNString(int i, String str) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.PreparedStatement
    public final void setRowId(int i, RowId rowId) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.PreparedStatement
    public final void setSQLXML(int i, SQLXML sqlxml) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    public final String toString() {
        return this.g + " \n parameters=" + Arrays.toString(this.i);
    }

    @Override // java.sql.PreparedStatement
    public final void setAsciiStream(int i, InputStream inputStream) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.PreparedStatement
    public final void setBinaryStream(int i, InputStream inputStream) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.PreparedStatement
    public final void setBlob(int i, InputStream inputStream) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.PreparedStatement
    public final void setCharacterStream(int i, Reader reader) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.PreparedStatement
    public final void setClob(int i, Reader reader) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.PreparedStatement
    public final void setNCharacterStream(int i, Reader reader) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.PreparedStatement
    public final void setNClob(int i, Reader reader, long j) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.PreparedStatement
    public final void setNClob(int i, Reader reader) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }
}
