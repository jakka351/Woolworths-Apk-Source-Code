package org.sqlite.core;

import YU.a;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import org.sqlite.SQLiteConnectionConfig;

/* loaded from: classes8.dex */
public abstract class CoreResultSet implements Codes {
    public final CoreStatement d;
    public int f;
    public int j;
    public int l;
    public boolean m;
    public boolean e = false;
    public String[] g = null;
    public String[] h = null;
    public boolean[][] i = null;
    public int k = 0;
    public HashMap n = null;

    public CoreResultSet(CoreStatement coreStatement) {
        this.d = coreStatement;
    }

    public final int a(int i) throws SQLException {
        String[] strArr = this.h;
        if (strArr == null) {
            throw new IllegalStateException("SQLite JDBC: inconsistent internal state");
        }
        if (i < 1 || i > strArr.length) {
            throw new SQLException(a.m(a.r(i, "column ", " out of bounds [1,"), this.h.length, "]"));
        }
        return i - 1;
    }

    public final void b() throws SQLException {
        if (!this.e) {
            throw new SQLException("ResultSet closed");
        }
    }

    public final SQLiteConnectionConfig c() {
        return this.d.d.f;
    }

    public void close() {
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = 0;
        this.k = 0;
        this.l = -1;
        this.n = null;
        if (this.e) {
            DB dbE = this.d.d.e();
            synchronized (dbE) {
                try {
                    long j = this.d.f;
                    if (j != 0) {
                        dbE.reset(j);
                        if (this.m) {
                            this.m = false;
                            ((Statement) this.d).close();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.e = false;
        }
    }

    public final DB d() {
        return this.d.d.e();
    }

    public final int e(int i) throws SQLException {
        b();
        a(i);
        this.l = i;
        return i - 1;
    }
}
