package org.sqlite.core;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.sqlite.SQLiteConnection;
import org.sqlite.SQLiteException;
import org.sqlite.jdbc4.JDBC4ResultSet;

/* loaded from: classes8.dex */
public abstract class CoreStatement implements Codes {
    public final SQLiteConnection d;
    public long f;
    public int h;
    public String g = null;
    public Object[] i = null;
    public boolean j = false;
    public final JDBC4ResultSet e = new JDBC4ResultSet(this);

    public CoreStatement(SQLiteConnection sQLiteConnection) {
        this.d = sQLiteConnection;
    }

    public final void a() throws SQLException {
        if (this.f == 0) {
            throw new SQLException("statement is not executing");
        }
    }

    public final boolean b() throws SQLException {
        SQLiteConnection sQLiteConnection = this.d;
        if (this.g == null) {
            throw new SQLException("SQLiteJDBC internal error: sql==null");
        }
        if (this.e.e) {
            throw new SQLException("SQLite JDBC internal error: rs.isOpen() on exec.");
        }
        try {
            this.j = sQLiteConnection.e().j(this, null);
            return sQLiteConnection.e().column_count(this.f) != 0;
        } catch (Throwable th) {
            this.j = false;
            sQLiteConnection.e().m(this);
            throw th;
        }
    }

    public abstract ResultSet c(String str);

    public final void d() throws SQLiteException {
        if (this.f == 0) {
            return;
        }
        SQLiteConnection sQLiteConnection = this.d;
        if (sQLiteConnection.isClosed()) {
            throw DB.o(1, "Connection is closed");
        }
        this.e.close();
        this.i = null;
        this.h = 0;
        int iM = sQLiteConnection.e().m(this);
        if (iM != 0 && iM != 21) {
            throw sQLiteConnection.e().n(iM);
        }
    }
}
