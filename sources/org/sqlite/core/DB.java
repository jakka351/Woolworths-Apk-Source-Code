package org.sqlite.core;

import java.sql.BatchUpdateException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.sqlite.SQLiteConfig;
import org.sqlite.SQLiteErrorCode;
import org.sqlite.SQLiteException;
import org.sqlite.jdbc3.JDBC3Statement;

/* loaded from: classes8.dex */
public abstract class DB implements Codes {
    public final String d;
    public final String e;
    public final SQLiteConfig f;
    public final AtomicBoolean g = new AtomicBoolean(true);
    public long h = 0;
    public long i = 0;
    public final HashMap j = new HashMap();

    public interface ProgressObserver {
    }

    public DB(String str, String str2, SQLiteConfig sQLiteConfig) {
        new HashSet();
        new HashSet();
        this.d = str;
        this.e = str2;
        this.f = sQLiteConfig;
    }

    public static SQLiteException o(int i, String str) {
        SQLiteErrorCode sQLiteErrorCode;
        SQLiteErrorCode[] sQLiteErrorCodeArrValues = SQLiteErrorCode.values();
        int length = sQLiteErrorCodeArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                sQLiteErrorCode = SQLiteErrorCode.UNKNOWN_ERROR;
                break;
            }
            sQLiteErrorCode = sQLiteErrorCodeArrValues[i2];
            if (i == sQLiteErrorCode.d) {
                break;
            }
            i2++;
        }
        return new SQLiteException(sQLiteErrorCode + " (" + str + ")", null, sQLiteErrorCode.d & 255);
    }

    public abstract int a(String str, String str2);

    public abstract int b(int i, long j, String str);

    public abstract int bind_blob(long j, int i, byte[] bArr);

    public abstract int bind_double(long j, int i, double d);

    public abstract int bind_int(long j, int i, int i2);

    public abstract int bind_long(long j, int i, long j2);

    public abstract int bind_null(long j, int i);

    public abstract int bind_parameter_count(long j);

    public abstract String c(int i, long j);

    public abstract int changes();

    public abstract int clear_bindings(long j);

    public abstract byte[] column_blob(long j, int i);

    public abstract int column_count(long j);

    public abstract double column_double(long j, int i);

    public abstract int column_int(long j, int i);

    public abstract long column_long(long j, int i);

    public abstract boolean[][] column_metadata(long j);

    public abstract int column_type(long j, int i);

    public final synchronized String[] d(long j) {
        String[] strArr;
        int iColumn_count = column_count(j);
        strArr = new String[iColumn_count];
        for (int i = 0; i < iColumn_count; i++) {
            strArr[i] = c(i, j);
        }
        return strArr;
    }

    public abstract String e(int i, long j);

    public abstract String f(int i, long j);

    public abstract int finalize(long j);

    public final void g(boolean z) {
        int iStep;
        if (z) {
            if (this.h == 0) {
                this.h = p("begin;");
            }
            if (this.i == 0) {
                this.i = p("commit;");
            }
            try {
                if (step(this.h) == 101 && (iStep = step(this.i)) != 101) {
                    reset(this.i);
                    throw n(iStep);
                }
            } finally {
                reset(this.h);
                reset(this.i);
            }
        }
    }

    public abstract String h();

    public final synchronized void i(String str, boolean z) {
        long jP;
        try {
            jP = p(str);
            try {
                int iStep = step(jP);
                if (iStep == 100) {
                    finalize(jP);
                } else {
                    if (iStep != 101) {
                        throw n(iStep);
                    }
                    g(z);
                    finalize(jP);
                }
            } catch (Throwable th) {
                th = th;
                finalize(jP);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            jP = 0;
        }
    }

    public abstract void interrupt();

    public final synchronized boolean j(CoreStatement coreStatement, Object[] objArr) {
        if (objArr != null) {
            try {
                int iBind_parameter_count = bind_parameter_count(coreStatement.f);
                if (iBind_parameter_count > objArr.length) {
                    throw new SQLException("assertion failure: param count (" + iBind_parameter_count + ") > value count (" + objArr.length + ")");
                }
                for (int i = 0; i < iBind_parameter_count; i++) {
                    int iS = s(objArr[i], i, coreStatement.f);
                    if (iS != 0) {
                        throw n(iS);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int iStep = step(coreStatement.f);
        int i2 = iStep & 255;
        if (i2 == 5 || i2 == 6 || i2 == 19 || i2 == 21) {
            throw n(iStep);
        }
        if (i2 == 100) {
            return true;
        }
        if (i2 != 101) {
            m(coreStatement);
            throw n(iStep);
        }
        reset(coreStatement.f);
        g(coreStatement.d.getAutoCommit());
        return false;
    }

    public final synchronized int[] k(long j, int i, Object[] objArr, boolean z) {
        int[] iArr;
        try {
            if (i < 1) {
                throw new SQLException("count (" + i + ") < 1");
            }
            int iBind_parameter_count = bind_parameter_count(j);
            iArr = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    reset(j);
                    for (int i3 = 0; i3 < iBind_parameter_count; i3++) {
                        int iS = s(objArr[(i2 * iBind_parameter_count) + i3], i3, j);
                        if (iS != 0) {
                            throw n(iS);
                        }
                    }
                    int iStep = step(j);
                    if (iStep != 101) {
                        reset(j);
                        if (iStep != 100) {
                            throw n(iStep);
                        }
                        throw new BatchUpdateException("batch entry " + i2 + ": query returns results", iArr);
                    }
                    iArr[i2] = changes();
                } catch (Throwable th) {
                    g(z);
                    throw th;
                }
            }
            g(z);
            reset(j);
        } catch (Throwable th2) {
            throw th2;
        }
        return iArr;
    }

    /* JADX WARN: Finally extract failed */
    public final synchronized int l(JDBC3Statement jDBC3Statement, Object[] objArr) {
        try {
            try {
                if (j(jDBC3Statement, objArr)) {
                    throw new SQLException("query returns results");
                }
                long j = jDBC3Statement.f;
                if (j != 0) {
                    reset(j);
                }
            } catch (Throwable th) {
                long j2 = jDBC3Statement.f;
                if (j2 != 0) {
                    reset(j2);
                }
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return changes();
    }

    public final synchronized int m(CoreStatement coreStatement) {
        long j = coreStatement.f;
        if (j == 0) {
            return 0;
        }
        try {
            return finalize(j);
        } finally {
            this.j.remove(new Long(coreStatement.f));
            coreStatement.f = 0L;
        }
    }

    public final SQLiteException n(int i) {
        return o(i, h());
    }

    public abstract long p(String str);

    public final synchronized void q(JDBC3Statement jDBC3Statement) {
        try {
            if (jDBC3Statement.g == null) {
                throw new NullPointerException();
            }
            if (jDBC3Statement.f != 0) {
                m(jDBC3Statement);
            }
            long jP = p(jDBC3Statement.g);
            jDBC3Statement.f = jP;
            this.j.put(new Long(jP), jDBC3Statement);
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract int r(String str, String str2);

    public abstract int reset(long j);

    public final synchronized int s(Object obj, int i, long j) throws Throwable {
        Throwable th;
        int i2 = i + 1;
        try {
            try {
                if (obj == null) {
                    return bind_null(j, i2);
                }
                try {
                    if (obj instanceof Integer) {
                        return bind_int(j, i2, ((Integer) obj).intValue());
                    }
                    if (obj instanceof Short) {
                        return bind_int(j, i2, ((Short) obj).intValue());
                    }
                    if (obj instanceof Long) {
                        return bind_long(j, i2, ((Long) obj).longValue());
                    }
                    if (obj instanceof Float) {
                        return bind_double(j, i2, ((Float) obj).doubleValue());
                    }
                    if (obj instanceof Double) {
                        return bind_double(j, i2, ((Double) obj).doubleValue());
                    }
                    if (obj instanceof String) {
                        return b(i2, j, (String) obj);
                    }
                    if (obj instanceof byte[]) {
                        return bind_blob(j, i2, (byte[]) obj);
                    }
                    throw new SQLException("unexpected param type: " + obj.getClass());
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public abstract int step(long j);

    public abstract int total_changes();
}
