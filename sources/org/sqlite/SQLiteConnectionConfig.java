package org.sqlite;

import java.util.EnumMap;
import org.sqlite.SQLiteConfig;
import org.sqlite.date.FastDateFormat;

/* loaded from: classes8.dex */
public class SQLiteConnectionConfig implements Cloneable {
    public static final EnumMap k;
    public final SQLiteConfig.DateClass d;
    public final SQLiteConfig.DatePrecision e;
    public final String f;
    public final FastDateFormat g;
    public int h;
    public final SQLiteConfig.TransactionMode i;
    public boolean j;

    static {
        EnumMap enumMap = new EnumMap(SQLiteConfig.TransactionMode.class);
        k = enumMap;
        enumMap.put((EnumMap) SQLiteConfig.TransactionMode.e, (SQLiteConfig.TransactionMode) "begin;");
        enumMap.put((EnumMap) SQLiteConfig.TransactionMode.f, (SQLiteConfig.TransactionMode) "begin immediate;");
        enumMap.put((EnumMap) SQLiteConfig.TransactionMode.g, (SQLiteConfig.TransactionMode) "begin exclusive;");
    }

    public SQLiteConnectionConfig(SQLiteConfig.DateClass dateClass, SQLiteConfig.DatePrecision datePrecision, String str, int i, SQLiteConfig.TransactionMode transactionMode, boolean z) {
        this.d = SQLiteConfig.DateClass.d;
        this.e = SQLiteConfig.DatePrecision.d;
        this.f = "yyyy-MM-dd HH:mm:ss.SSS";
        this.g = FastDateFormat.a("yyyy-MM-dd HH:mm:ss.SSS");
        this.h = 8;
        SQLiteConfig.TransactionMode transactionMode2 = SQLiteConfig.TransactionMode.e;
        this.i = transactionMode2;
        this.j = true;
        this.d = dateClass;
        this.e = datePrecision;
        this.f = str;
        this.g = FastDateFormat.a(str);
        this.h = i;
        this.i = transactionMode == SQLiteConfig.TransactionMode.d ? transactionMode2 : transactionMode;
        this.j = z;
    }

    public final long a() {
        return this.e == SQLiteConfig.DatePrecision.d ? 1L : 1000L;
    }
}
