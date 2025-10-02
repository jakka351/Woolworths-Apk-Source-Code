package org.sqlite.javax;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;
import javax.sql.ConnectionEvent;
import org.sqlite.SQLiteConnection;
import org.sqlite.core.DB;
import org.sqlite.jdbc4.JDBC4PreparedStatement;
import org.sqlite.jdbc4.JDBC4Statement;

/* loaded from: classes8.dex */
class SQLitePooledConnectionHandle extends SQLiteConnection {
    @Override // java.sql.Connection
    public final void clearWarnings() {
    }

    @Override // org.sqlite.SQLiteConnection, java.sql.Connection, java.lang.AutoCloseable
    public final void close() {
        new ConnectionEvent(null);
        throw null;
    }

    @Override // org.sqlite.SQLiteConnection, java.sql.Connection
    public final void commit() {
    }

    @Override // java.sql.Connection
    public final Array createArrayOf(String str, Object[] objArr) {
        return null;
    }

    @Override // java.sql.Connection
    public final Blob createBlob() {
        return null;
    }

    @Override // java.sql.Connection
    public final Clob createClob() {
        return null;
    }

    @Override // java.sql.Connection
    public final NClob createNClob() {
        return null;
    }

    @Override // java.sql.Connection
    public final SQLXML createSQLXML() {
        return null;
    }

    @Override // java.sql.Connection
    public final Statement createStatement(int i, int i2) {
        return null;
    }

    @Override // java.sql.Connection
    public final Struct createStruct(String str, Object[] objArr) {
        return null;
    }

    @Override // org.sqlite.SQLiteConnection
    public final int d() {
        return 0;
    }

    @Override // org.sqlite.SQLiteConnection
    public final DB e() {
        return null;
    }

    @Override // org.sqlite.SQLiteConnection, java.sql.Connection
    public final boolean getAutoCommit() {
        return false;
    }

    @Override // java.sql.Connection
    public final String getCatalog() {
        return null;
    }

    @Override // java.sql.Connection
    public final String getClientInfo(String str) {
        return null;
    }

    @Override // java.sql.Connection
    public final int getHoldability() {
        return 0;
    }

    @Override // org.sqlite.SQLiteConnection, java.sql.Connection
    public final DatabaseMetaData getMetaData() {
        return null;
    }

    @Override // org.sqlite.SQLiteConnection, java.sql.Connection
    public final int getTransactionIsolation() {
        return 0;
    }

    @Override // java.sql.Connection
    public final Map getTypeMap() {
        return null;
    }

    @Override // java.sql.Connection
    public final SQLWarning getWarnings() {
        return null;
    }

    @Override // org.sqlite.SQLiteConnection
    public final void h(int i) {
    }

    @Override // org.sqlite.SQLiteConnection, java.sql.Connection
    public final boolean isClosed() {
        throw null;
    }

    @Override // java.sql.Connection
    public final boolean isReadOnly() {
        return false;
    }

    @Override // java.sql.Connection
    public final boolean isValid(int i) {
        return false;
    }

    @Override // java.sql.Wrapper
    public final boolean isWrapperFor(Class cls) {
        return false;
    }

    @Override // java.sql.Connection
    public final String nativeSQL(String str) {
        return null;
    }

    @Override // java.sql.Connection
    public final CallableStatement prepareCall(String str) {
        return null;
    }

    @Override // org.sqlite.SQLiteConnection, java.sql.Connection
    public final PreparedStatement prepareStatement(String str, int i) {
        return null;
    }

    @Override // java.sql.Connection
    public final void releaseSavepoint(Savepoint savepoint) {
    }

    @Override // org.sqlite.SQLiteConnection, java.sql.Connection
    public final void rollback() {
    }

    @Override // org.sqlite.SQLiteConnection, java.sql.Connection
    public final void setAutoCommit(boolean z) {
    }

    @Override // org.sqlite.SQLiteConnection, java.sql.Connection
    public final void setCatalog(String str) {
    }

    @Override // java.sql.Connection
    public final void setClientInfo(String str, String str2) {
    }

    @Override // java.sql.Connection
    public final void setHoldability(int i) {
    }

    @Override // java.sql.Connection
    public final void setReadOnly(boolean z) {
    }

    @Override // java.sql.Connection
    public final Savepoint setSavepoint() {
        return null;
    }

    @Override // org.sqlite.SQLiteConnection, java.sql.Connection
    public final void setTransactionIsolation(int i) {
    }

    @Override // java.sql.Connection
    public final void setTypeMap(Map map) {
    }

    @Override // java.sql.Wrapper
    public final Object unwrap(Class cls) {
        return null;
    }

    @Override // java.sql.Connection
    public final Statement createStatement(int i, int i2, int i3) {
        return null;
    }

    @Override // java.sql.Connection
    public final Properties getClientInfo() {
        return null;
    }

    @Override // java.sql.Connection
    public final CallableStatement prepareCall(String str, int i, int i2) {
        return null;
    }

    @Override // java.sql.Connection
    public final PreparedStatement prepareStatement(String str, int i, int i2) {
        return null;
    }

    @Override // java.sql.Connection
    public final void rollback(Savepoint savepoint) {
    }

    @Override // java.sql.Connection
    public final void setClientInfo(Properties properties) {
    }

    @Override // java.sql.Connection
    public final Savepoint setSavepoint(String str) {
        return null;
    }

    @Override // java.sql.Connection
    public final Statement createStatement() {
        return new JDBC4Statement(this);
    }

    @Override // java.sql.Connection
    public final CallableStatement prepareCall(String str, int i, int i2, int i3) {
        return null;
    }

    @Override // java.sql.Connection
    public final PreparedStatement prepareStatement(String str, int i, int i2, int i3) {
        return null;
    }

    @Override // org.sqlite.SQLiteConnection, java.sql.Connection
    public final PreparedStatement prepareStatement(String str, int[] iArr) {
        return null;
    }

    @Override // org.sqlite.SQLiteConnection, java.sql.Connection
    public final PreparedStatement prepareStatement(String str, String[] strArr) {
        return null;
    }

    @Override // java.sql.Connection
    public final PreparedStatement prepareStatement(String str) {
        return new JDBC4PreparedStatement(this, str);
    }
}
