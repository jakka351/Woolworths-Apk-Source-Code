package org.sqlite.jdbc3;

import YU.a;
import java.sql.BatchUpdateException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import org.sqlite.ExtendedCommand;
import org.sqlite.SQLiteConnection;
import org.sqlite.SQLiteException;
import org.sqlite.core.CoreStatement;
import org.sqlite.core.DB;
import org.sqlite.core.NativeDB;
import org.sqlite.jdbc4.JDBC4ResultSet;

/* loaded from: classes8.dex */
public abstract class JDBC3Statement extends CoreStatement {

    public static class BackupObserver implements DB.ProgressObserver {
    }

    public void addBatch(String str) throws SQLiteException {
        d();
        Object[] objArr = this.i;
        if (objArr == null || this.h + 1 >= objArr.length) {
            Object[] objArr2 = new Object[Math.max(10, this.h * 2)];
            Object[] objArr3 = this.i;
            if (objArr3 != null) {
                System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            }
            this.i = objArr2;
        }
        Object[] objArr4 = this.i;
        int i = this.h;
        this.h = i + 1;
        objArr4[i] = str;
    }

    @Override // org.sqlite.core.CoreStatement
    public final ResultSet c(String str) {
        this.e.m = true;
        return executeQuery(str);
    }

    public final void cancel() {
        this.d.e().interrupt();
    }

    public void clearBatch() {
        int i = 0;
        this.h = 0;
        if (this.i == null) {
            return;
        }
        while (true) {
            Object[] objArr = this.i;
            if (i >= objArr.length) {
                return;
            }
            objArr[i] = null;
            i++;
        }
    }

    public final void clearWarnings() {
    }

    public SQLException e() {
        return new SQLException("not implemented by SQLite JDBC driver");
    }

    public boolean execute(String str) throws SQLiteException {
        d();
        ExtendedCommand.SQLExtension sQLExtensionA = ExtendedCommand.a(str);
        SQLiteConnection sQLiteConnection = this.d;
        if (sQLExtensionA != null) {
            sQLExtensionA.a(sQLiteConnection.e());
            return false;
        }
        this.g = str;
        sQLiteConnection.e().q(this);
        return b();
    }

    public int[] executeBatch() throws SQLiteException {
        int i;
        d();
        if (this.i == null || (i = this.h) == 0) {
            return new int[0];
        }
        int[] iArr = new int[i];
        DB dbE = this.d.e();
        synchronized (dbE) {
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    try {
                        this.g = (String) this.i[i2];
                        dbE.q(this);
                        iArr[i2] = dbE.l(this, null);
                        try {
                            try {
                            } catch (Throwable th) {
                                clearBatch();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    } catch (SQLException e) {
                        throw new BatchUpdateException("batch entry " + i2 + ": " + e.getMessage(), iArr);
                    }
                } finally {
                    dbE.m(this);
                }
            }
            clearBatch();
        }
        return iArr;
    }

    public ResultSet executeQuery(String str) throws SQLException {
        d();
        this.g = str;
        this.d.e().q(this);
        if (b()) {
            return getResultSet();
        }
        d();
        throw new SQLException("query does not return ResultSet", "SQLITE_DONE", 101);
    }

    public int executeUpdate(String str) throws SQLiteException {
        int i_exec_utf8;
        d();
        this.g = str;
        DB dbE = this.d.e();
        ExtendedCommand.SQLExtension sQLExtensionA = ExtendedCommand.a(str);
        if (sQLExtensionA != null) {
            sQLExtensionA.a(dbE);
            return 0;
        }
        try {
            int i = dbE.total_changes();
            NativeDB nativeDB = (NativeDB) dbE;
            synchronized (nativeDB) {
                i_exec_utf8 = nativeDB._exec_utf8(NativeDB.t(str));
            }
            if (i_exec_utf8 == 0) {
                return dbE.total_changes() - i;
            }
            throw DB.o(i_exec_utf8, "");
        } finally {
            d();
        }
    }

    public final Connection getConnection() {
        return this.d;
    }

    public final int getFetchDirection() {
        return this.e.getFetchDirection();
    }

    public final int getFetchSize() {
        return this.e.getFetchSize();
    }

    public final ResultSet getGeneratedKeys() {
        JDBC3DatabaseMetaData jDBC3DatabaseMetaData = (JDBC3DatabaseMetaData) this.d.f();
        if (jDBC3DatabaseMetaData.s == null) {
            jDBC3DatabaseMetaData.s = jDBC3DatabaseMetaData.d.prepareStatement("select last_insert_rowid();");
        }
        return jDBC3DatabaseMetaData.s.executeQuery();
    }

    public final int getMaxFieldSize() {
        return 0;
    }

    public final int getMaxRows() {
        return this.e.f;
    }

    public final boolean getMoreResults() throws SQLException {
        getMoreResults(0);
        return false;
    }

    public final int getQueryTimeout() {
        return this.d.d();
    }

    public final ResultSet getResultSet() throws SQLException {
        a();
        JDBC4ResultSet jDBC4ResultSet = this.e;
        if (jDBC4ResultSet.e) {
            throw new SQLException("ResultSet already requested");
        }
        DB dbE = this.d.e();
        if (dbE.column_count(this.f) == 0) {
            return null;
        }
        if (jDBC4ResultSet.h == null) {
            jDBC4ResultSet.h = dbE.d(this.f);
        }
        jDBC4ResultSet.g = jDBC4ResultSet.h;
        jDBC4ResultSet.e = this.j;
        this.j = false;
        return jDBC4ResultSet;
    }

    public final int getResultSetConcurrency() {
        return 1007;
    }

    public final int getResultSetHoldability() {
        return 2;
    }

    public final int getResultSetType() {
        return 1003;
    }

    public int getUpdateCount() {
        DB dbE = this.d.e();
        long j = this.f;
        if (j == 0 || this.e.e || this.j || dbE.column_count(j) != 0) {
            return -1;
        }
        return dbE.changes();
    }

    public final SQLWarning getWarnings() {
        return null;
    }

    public final void setCursorName(String str) {
    }

    public final void setEscapeProcessing(boolean z) throws SQLException {
        if (z) {
            throw e();
        }
    }

    public final void setFetchDirection(int i) throws SQLException {
        this.e.setFetchDirection(i);
    }

    public final void setFetchSize(int i) throws SQLException {
        this.e.setFetchSize(i);
    }

    public final void setMaxFieldSize(int i) throws SQLException {
        if (i < 0) {
            throw new SQLException(a.e(i, "max field size ", " cannot be negative"));
        }
    }

    public final void setMaxRows(int i) throws SQLException {
        if (i < 0) {
            throw new SQLException("max row count must be >= 0");
        }
        this.e.f = i;
    }

    public final void setQueryTimeout(int i) throws SQLException {
        if (i < 0) {
            throw new SQLException("query timeout must be >= 0");
        }
        this.d.h(i * 1000);
    }

    public final boolean getMoreResults(int i) throws SQLException {
        a();
        d();
        return false;
    }

    public final boolean execute(String str, int[] iArr) throws SQLException {
        throw e();
    }

    public final boolean execute(String str, String[] strArr) throws SQLException {
        throw e();
    }

    public final boolean execute(String str, int i) throws SQLException {
        throw e();
    }

    public final int executeUpdate(String str, int i) throws SQLException {
        throw e();
    }

    public final int executeUpdate(String str, int[] iArr) throws SQLException {
        throw e();
    }

    public final int executeUpdate(String str, String[] strArr) throws SQLException {
        throw e();
    }
}
