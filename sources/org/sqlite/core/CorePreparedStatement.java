package org.sqlite.core;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.sqlite.SQLiteConfig;
import org.sqlite.SQLiteConnection;
import org.sqlite.SQLiteConnectionConfig;
import org.sqlite.date.FastDateFormat;
import org.sqlite.date.FastDatePrinter;
import org.sqlite.jdbc4.JDBC4Statement;

/* loaded from: classes8.dex */
public abstract class CorePreparedStatement extends JDBC4Statement {
    public int l;
    public int m;
    public int n;

    /* renamed from: org.sqlite.core.CorePreparedStatement$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26880a;

        static {
            int[] iArr = new int[SQLiteConfig.DateClass.values().length];
            f26880a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26880a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // org.sqlite.jdbc3.JDBC3Statement, java.sql.Statement
    public final void clearBatch() {
        super.clearBatch();
        this.n = 0;
    }

    @Override // org.sqlite.jdbc3.JDBC3Statement, java.sql.Statement
    public final int[] executeBatch() {
        SQLiteConnection sQLiteConnection = this.d;
        if (this.n == 0) {
            return new int[0];
        }
        try {
            return sQLiteConnection.e().k(this.f, this.n, this.i, sQLiteConnection.getAutoCommit());
        } finally {
            clearBatch();
        }
    }

    public final void f(int i, Object obj) throws SQLException {
        a();
        if (this.i == null) {
            this.i = new Object[this.m];
        }
        this.i[(this.h + i) - 1] = obj;
    }

    public final void g(int i, Long l, Calendar calendar) throws SQLException {
        SQLiteConnectionConfig sQLiteConnectionConfig = this.d.f;
        int iOrdinal = sQLiteConnectionConfig.d.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                f(i, new Long(l.longValue() / sQLiteConnectionConfig.a()));
                return;
            } else {
                f(i, new Double((l.longValue() / 8.64E7d) + 2440587.5d));
                return;
            }
        }
        FastDateFormat fastDateFormatB = FastDateFormat.b(sQLiteConnectionConfig.f, calendar.getTimeZone());
        Date date = new Date(l.longValue());
        FastDatePrinter fastDatePrinter = fastDateFormatB.d;
        fastDatePrinter.getClass();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(fastDatePrinter.e, fastDatePrinter.f);
        gregorianCalendar.setTime(date);
        StringBuffer stringBuffer = new StringBuffer(fastDatePrinter.h);
        fastDatePrinter.b(stringBuffer, gregorianCalendar);
        f(i, stringBuffer.toString());
    }

    @Override // org.sqlite.jdbc3.JDBC3Statement, java.sql.Statement
    public final int getUpdateCount() {
        if (this.f == 0 || this.j || this.e.e) {
            return -1;
        }
        return this.d.e().changes();
    }

    public void setBytes(int i, byte[] bArr) throws SQLException {
        f(i, bArr);
    }

    public void setString(int i, String str) throws SQLException {
        f(i, str);
    }
}
