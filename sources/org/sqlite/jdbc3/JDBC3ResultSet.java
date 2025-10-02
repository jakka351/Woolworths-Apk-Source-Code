package org.sqlite.jdbc3;

import YU.a;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.sqlite.SQLiteException;
import org.sqlite.core.CoreResultSet;
import org.sqlite.core.CoreStatement;
import org.sqlite.core.DB;
import org.sqlite.core.NativeDB;
import org.sqlite.date.FastDateFormat;

/* loaded from: classes8.dex */
public abstract class JDBC3ResultSet extends CoreResultSet {
    public static final Pattern o = Pattern.compile("([^\\(]*)");
    public static final Pattern p = Pattern.compile("cast\\(.*?\\s+as\\s+(.*?)\\s*\\)");
    public static final Pattern q = Pattern.compile(".*?\\((.*?)\\)");

    public static Calendar g(Double d, Calendar calendar) {
        double dDoubleValue = d.doubleValue() + 0.5d;
        int i = (int) dDoubleValue;
        double d2 = i;
        double d3 = dDoubleValue - d2;
        if (i >= 2299161) {
            int i2 = (int) ((d2 - 1867216.25d) / 36524.25d);
            i = ((i + 1) + i2) - ((int) (i2 / 4.0d));
        }
        int i3 = i + 1524;
        int i4 = (int) ((i3 - 122.1d) / 365.25d);
        int i5 = (int) ((i3 - ((int) (i4 * 365.25d))) / 30.6001d);
        int i6 = i5 - (i5 < 13.5d ? 1 : 13);
        int i7 = i4 - (((double) i6) > 2.5d ? 4716 : 4715);
        double d4 = (r14 - ((int) (r7 * 30.6001d))) + d3;
        int i8 = (int) d4;
        double d5 = (d4 - i8) * 24.0d;
        int i9 = (int) d5;
        double d6 = (d5 - i9) * 60.0d;
        int i10 = (int) d6;
        double d7 = (d6 - i10) * 60.0d;
        int i11 = (int) d7;
        calendar.set(i7, i6 - 1, i8, i9, i10, i11);
        calendar.set(14, (int) ((d7 - i11) * 1000.0d));
        if (i7 < 1) {
            calendar.set(0, 0);
            calendar.set(1, -(i7 - 1));
        }
        return calendar;
    }

    public final void clearWarnings() {
    }

    public final String f(int i) throws SQLException {
        String strU;
        DB dbD = d();
        CoreStatement coreStatement = this.d;
        long j = coreStatement.f;
        int iA = a(i);
        NativeDB nativeDB = (NativeDB) dbD;
        synchronized (nativeDB) {
            strU = NativeDB.u(nativeDB.column_decltype_utf8(j, iA));
        }
        if (strU != null) {
            return strU;
        }
        Matcher matcher = p.matcher(dbD.c(a(i), coreStatement.f));
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    public final int findColumn(String str) throws SQLException {
        b();
        HashMap map = this.n;
        Integer num = map == null ? null : (Integer) map.get(str);
        if (num != null) {
            return num.intValue();
        }
        int i = 0;
        while (true) {
            String[] strArr = this.g;
            if (i >= strArr.length) {
                throw new SQLException(a.h("no such column: '", str, "'"));
            }
            if (str.equalsIgnoreCase(strArr[i])) {
                int i2 = i + 1;
                if (this.n == null) {
                    this.n = new HashMap(this.g.length);
                }
                this.n.put(str, Integer.valueOf(i2));
                return i2;
            }
            i++;
        }
    }

    public final BigDecimal getBigDecimal(int i) throws SQLException {
        String string = getString(i);
        if (string == null) {
            return null;
        }
        try {
            return new BigDecimal(string);
        } catch (NumberFormatException unused) {
            throw new SQLException("Bad value for type BigDecimal : ".concat(string));
        }
    }

    public final InputStream getBinaryStream(int i) {
        byte[] bytes = getBytes(i);
        if (bytes != null) {
            return new ByteArrayInputStream(bytes);
        }
        return null;
    }

    public final boolean getBoolean(int i) {
        return getInt(i) != 0;
    }

    public final byte getByte(int i) {
        return (byte) getInt(i);
    }

    public final byte[] getBytes(int i) {
        return d().column_blob(this.d.f, e(i));
    }

    public final String getCatalogName(int i) {
        return d().e(a(i), this.d.f);
    }

    public final Reader getCharacterStream(int i) {
        String string = getString(i);
        if (string == null) {
            return null;
        }
        return new StringReader(string);
    }

    public final String getColumnClassName(int i) throws SQLException {
        a(i);
        return "java.lang.Object";
    }

    public final int getColumnCount() throws SQLException {
        a(1);
        return this.h.length;
    }

    public final int getColumnDisplaySize(int i) {
        return Integer.MAX_VALUE;
    }

    public final String getColumnLabel(int i) {
        return getColumnName(i);
    }

    public final String getColumnName(int i) {
        return d().c(a(i), this.d.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int getColumnType(int r10) throws java.sql.SQLException {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.sqlite.jdbc3.JDBC3ResultSet.getColumnType(int):int");
    }

    public final String getColumnTypeName(int i) throws SQLException {
        String strF = f(i);
        if (strF == null) {
            int iColumn_type = d().column_type(this.d.f, a(i));
            return iColumn_type != 1 ? iColumn_type != 2 ? iColumn_type != 3 ? iColumn_type != 4 ? "NUMERIC" : "BLOB" : "TEXT" : "FLOAT" : "INTEGER";
        }
        Matcher matcher = o.matcher(strF);
        matcher.find();
        return matcher.group(1).toUpperCase(Locale.ENGLISH);
    }

    public final int getConcurrency() {
        return 1007;
    }

    public final String getCursorName() {
        return null;
    }

    public final Date getDate(int i) throws SQLException {
        DB dbD = d();
        CoreStatement coreStatement = this.d;
        int iColumn_type = dbD.column_type(coreStatement.f, e(i));
        if (iColumn_type == 2) {
            Double dValueOf = Double.valueOf(dbD.column_double(coreStatement.f, e(i)));
            Calendar calendar = Calendar.getInstance();
            g(dValueOf, calendar);
            return new Date(calendar.getTimeInMillis());
        }
        if (iColumn_type != 3) {
            if (iColumn_type == 5) {
                return null;
            }
            return new Date(c().a() * dbD.column_long(coreStatement.f, e(i)));
        }
        try {
            return new Date(c().g.c(dbD.f(e(i), coreStatement.f)).getTime());
        } catch (Exception e) {
            SQLException sQLException = new SQLException("Error parsing date");
            sQLException.initCause(e);
            throw sQLException;
        }
    }

    public final double getDouble(int i) {
        DB dbD = d();
        CoreStatement coreStatement = this.d;
        if (dbD.column_type(coreStatement.f, e(i)) == 5) {
            return 0.0d;
        }
        return dbD.column_double(coreStatement.f, e(i));
    }

    public final int getFetchDirection() throws SQLException {
        b();
        return 1000;
    }

    public final int getFetchSize() {
        return this.j;
    }

    public final float getFloat(int i) {
        DB dbD = d();
        CoreStatement coreStatement = this.d;
        return dbD.column_type(coreStatement.f, e(i)) == 5 ? BitmapDescriptorFactory.HUE_RED : (float) dbD.column_double(coreStatement.f, e(i));
    }

    public final int getInt(int i) {
        return d().column_int(this.d.f, e(i));
    }

    public final long getLong(int i) {
        return d().column_long(this.d.f, e(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ResultSetMetaData getMetaData() {
        return (ResultSetMetaData) this;
    }

    public final Object getObject(int i) {
        int iColumn_type = d().column_type(this.d.f, e(i));
        if (iColumn_type == 1) {
            long j = getLong(i);
            return (j > 2147483647L || j < -2147483648L) ? new Long(j) : new Integer((int) j);
        }
        if (iColumn_type == 2) {
            return new Double(getDouble(i));
        }
        if (iColumn_type == 4) {
            return getBytes(i);
        }
        if (iColumn_type != 5) {
            return getString(i);
        }
        return null;
    }

    public final int getPrecision(int i) throws SQLException {
        String strF = f(i);
        if (strF != null) {
            Matcher matcher = q.matcher(strF);
            if (matcher.find()) {
                return Integer.parseInt(matcher.group(1).split(",")[0].trim());
            }
        }
        return 0;
    }

    public final int getRow() {
        return this.k;
    }

    public final int getScale(int i) throws SQLException {
        String strF = f(i);
        if (strF == null) {
            return 0;
        }
        Matcher matcher = q.matcher(strF);
        if (!matcher.find()) {
            return 0;
        }
        String[] strArrSplit = matcher.group(1).split(",");
        if (strArrSplit.length == 2) {
            return Integer.parseInt(strArrSplit[1].trim());
        }
        return 0;
    }

    public final String getSchemaName(int i) {
        return "";
    }

    public final short getShort(int i) {
        return (short) getInt(i);
    }

    public final Statement getStatement() {
        return (Statement) this.d;
    }

    public final String getString(int i) {
        return d().f(e(i), this.d.f);
    }

    public final String getTableName(int i) {
        String strE = d().e(a(i), this.d.f);
        return strE == null ? "" : strE;
    }

    public final Time getTime(int i) throws SQLException {
        DB dbD = d();
        CoreStatement coreStatement = this.d;
        int iColumn_type = dbD.column_type(coreStatement.f, e(i));
        if (iColumn_type == 2) {
            Double dValueOf = Double.valueOf(dbD.column_double(coreStatement.f, e(i)));
            Calendar calendar = Calendar.getInstance();
            g(dValueOf, calendar);
            return new Time(calendar.getTimeInMillis());
        }
        if (iColumn_type != 3) {
            if (iColumn_type == 5) {
                return null;
            }
            return new Time(c().a() * dbD.column_long(coreStatement.f, e(i)));
        }
        try {
            return new Time(c().g.c(dbD.f(e(i), coreStatement.f)).getTime());
        } catch (Exception e) {
            SQLException sQLException = new SQLException("Error parsing time");
            sQLException.initCause(e);
            throw sQLException;
        }
    }

    public final Timestamp getTimestamp(int i) throws SQLException {
        DB dbD = d();
        CoreStatement coreStatement = this.d;
        int iColumn_type = dbD.column_type(coreStatement.f, e(i));
        if (iColumn_type == 2) {
            Double dValueOf = Double.valueOf(dbD.column_double(coreStatement.f, e(i)));
            Calendar calendar = Calendar.getInstance();
            g(dValueOf, calendar);
            return new Timestamp(calendar.getTimeInMillis());
        }
        if (iColumn_type != 3) {
            if (iColumn_type == 5) {
                return null;
            }
            return new Timestamp(c().a() * dbD.column_long(coreStatement.f, e(i)));
        }
        try {
            return new Timestamp(c().g.c(dbD.f(e(i), coreStatement.f)).getTime());
        } catch (Exception e) {
            SQLException sQLException = new SQLException("Error parsing time stamp");
            sQLException.initCause(e);
            throw sQLException;
        }
    }

    public final int getType() {
        return 1003;
    }

    public final SQLWarning getWarnings() {
        return null;
    }

    public final boolean isAfterLast() {
        return !this.e;
    }

    public final boolean isAutoIncrement(int i) throws SQLException {
        a(1);
        if (this.i == null) {
            CoreStatement coreStatement = this.d;
            this.i = coreStatement.d.e().column_metadata(coreStatement.f);
        }
        return this.i[a(i)][2];
    }

    public final boolean isBeforeFirst() {
        return this.e && this.k == 0;
    }

    public final boolean isCaseSensitive(int i) {
        return true;
    }

    public final boolean isCurrency(int i) {
        return false;
    }

    public final boolean isDefinitelyWritable(int i) {
        return true;
    }

    public final boolean isFirst() {
        return this.k == 1;
    }

    public final boolean isLast() throws SQLException {
        throw new SQLException("function not yet implemented for SQLite");
    }

    public final int isNullable(int i) throws SQLException {
        a(1);
        if (this.i == null) {
            CoreStatement coreStatement = this.d;
            this.i = coreStatement.d.e().column_metadata(coreStatement.f);
        }
        return !this.i[a(i)][1] ? 1 : 0;
    }

    public final boolean isReadOnly(int i) {
        return false;
    }

    public final boolean isSearchable(int i) {
        return true;
    }

    public final boolean isSigned(int i) throws SQLException {
        String columnTypeName = getColumnTypeName(i);
        return "NUMERIC".equals(columnTypeName) || "INTEGER".equals(columnTypeName) || "REAL".equals(columnTypeName);
    }

    public final boolean isWritable(int i) {
        return true;
    }

    public final boolean next() throws SQLiteException {
        if (this.e) {
            this.l = -1;
            int i = this.k;
            if (i == 0) {
                this.k = i + 1;
                return true;
            }
            int i2 = this.f;
            if (i2 == 0 || i != i2) {
                int iStep = d().step(this.d.f);
                if (iStep == 100) {
                    this.k++;
                    return true;
                }
                if (iStep != 101) {
                    throw d().n(iStep);
                }
                close();
                return false;
            }
        }
        return false;
    }

    public final boolean rowDeleted() {
        return false;
    }

    public final boolean rowInserted() {
        return false;
    }

    public final boolean rowUpdated() {
        return false;
    }

    public final void setFetchDirection(int i) throws SQLException {
        b();
        if (i != 1000) {
            throw new SQLException("only FETCH_FORWARD direction supported");
        }
    }

    public final void setFetchSize(int i) throws SQLException {
        int i2;
        if (i >= 0 && ((i2 = this.f) == 0 || i <= i2)) {
            this.j = i;
        } else {
            StringBuilder sbR = a.r(i, "fetch size ", " out of bounds ");
            sbR.append(this.f);
            throw new SQLException(sbR.toString());
        }
    }

    public final boolean wasNull() {
        return d().column_type(this.d.f, e(this.l)) == 5;
    }

    public final boolean getBoolean(String str) {
        return getBoolean(findColumn(str));
    }

    public final byte getByte(String str) {
        return (byte) getInt(findColumn(str));
    }

    public final byte[] getBytes(String str) {
        return getBytes(findColumn(str));
    }

    public final short getShort(String str) {
        return (short) getInt(findColumn(str));
    }

    public final InputStream getBinaryStream(String str) {
        return getBinaryStream(findColumn(str));
    }

    public final Reader getCharacterStream(String str) {
        return getCharacterStream(findColumn(str));
    }

    public final int getInt(String str) {
        return getInt(findColumn(str));
    }

    public final long getLong(String str) {
        return getLong(findColumn(str));
    }

    public final String getString(String str) {
        return getString(findColumn(str));
    }

    public final BigDecimal getBigDecimal(String str) {
        return getBigDecimal(findColumn(str));
    }

    public final double getDouble(String str) {
        return getDouble(findColumn(str));
    }

    public final float getFloat(String str) {
        return getFloat(findColumn(str));
    }

    public final Object getObject(String str) {
        return getObject(findColumn(str));
    }

    public final Date getDate(int i, Calendar calendar) throws SQLException {
        if (calendar != null) {
            DB dbD = d();
            CoreStatement coreStatement = this.d;
            int iColumn_type = dbD.column_type(coreStatement.f, e(i));
            if (iColumn_type == 2) {
                g(Double.valueOf(dbD.column_double(coreStatement.f, e(i))), calendar);
                return new Date(calendar.getTimeInMillis());
            }
            if (iColumn_type != 3) {
                if (iColumn_type == 5) {
                    return null;
                }
                calendar.setTimeInMillis(c().a() * dbD.column_long(coreStatement.f, e(i)));
                return new Date(calendar.getTime().getTime());
            }
            try {
                return new Date(FastDateFormat.b(c().f, calendar.getTimeZone()).c(dbD.f(e(i), coreStatement.f)).getTime());
            } catch (Exception e) {
                SQLException sQLException = new SQLException("Error parsing time stamp");
                sQLException.initCause(e);
                throw sQLException;
            }
        }
        SQLException sQLException2 = new SQLException("Expected a calendar instance.");
        sQLException2.initCause(new NullPointerException());
        throw sQLException2;
    }

    public final Time getTime(int i, Calendar calendar) throws SQLException {
        if (calendar != null) {
            DB dbD = d();
            CoreStatement coreStatement = this.d;
            int iColumn_type = dbD.column_type(coreStatement.f, e(i));
            if (iColumn_type == 2) {
                g(Double.valueOf(dbD.column_double(coreStatement.f, e(i))), calendar);
                return new Time(calendar.getTimeInMillis());
            }
            if (iColumn_type != 3) {
                if (iColumn_type == 5) {
                    return null;
                }
                calendar.setTimeInMillis(c().a() * dbD.column_long(coreStatement.f, e(i)));
                return new Time(calendar.getTime().getTime());
            }
            try {
                return new Time(FastDateFormat.b(c().f, calendar.getTimeZone()).c(dbD.f(e(i), coreStatement.f)).getTime());
            } catch (Exception e) {
                SQLException sQLException = new SQLException("Error parsing time");
                sQLException.initCause(e);
                throw sQLException;
            }
        }
        SQLException sQLException2 = new SQLException("Expected a calendar instance.");
        sQLException2.initCause(new NullPointerException());
        throw sQLException2;
    }

    public final Timestamp getTimestamp(int i, Calendar calendar) throws SQLException {
        if (calendar == null) {
            return getTimestamp(i);
        }
        DB dbD = d();
        CoreStatement coreStatement = this.d;
        int iColumn_type = dbD.column_type(coreStatement.f, e(i));
        if (iColumn_type == 2) {
            g(Double.valueOf(dbD.column_double(coreStatement.f, e(i))), calendar);
            return new Timestamp(calendar.getTimeInMillis());
        }
        if (iColumn_type != 3) {
            if (iColumn_type == 5) {
                return null;
            }
            calendar.setTimeInMillis(c().a() * dbD.column_long(coreStatement.f, e(i)));
            return new Timestamp(calendar.getTime().getTime());
        }
        try {
            return new Timestamp(FastDateFormat.b(c().f, calendar.getTimeZone()).c(dbD.f(e(i), coreStatement.f)).getTime());
        } catch (Exception e) {
            SQLException sQLException = new SQLException("Error parsing time stamp");
            sQLException.initCause(e);
            throw sQLException;
        }
    }

    public final Timestamp getTimestamp(String str) {
        return getTimestamp(findColumn(str));
    }

    public final Timestamp getTimestamp(String str, Calendar calendar) {
        return getTimestamp(findColumn(str), calendar);
    }

    public final Date getDate(String str) {
        return getDate(findColumn(str), Calendar.getInstance());
    }

    public final Time getTime(String str) {
        return getTime(findColumn(str));
    }

    public final Date getDate(String str, Calendar calendar) {
        return getDate(findColumn(str), calendar);
    }

    public final Time getTime(String str, Calendar calendar) {
        return getTime(findColumn(str), calendar);
    }
}
