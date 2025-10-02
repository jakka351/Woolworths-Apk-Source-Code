package org.sqlite.jdbc3;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.ParameterMetaData;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import org.sqlite.SQLiteConnection;
import org.sqlite.core.CorePreparedStatement;

/* loaded from: classes8.dex */
public abstract class JDBC3PreparedStatement extends CorePreparedStatement {
    public static byte[] h(InputStream inputStream, int i) throws SQLException, IOException {
        if (i < 0) {
            throw new SQLException("Error reading stream. Length should be non-negative");
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            try {
                int i3 = inputStream.read(bArr, i2, i - i2);
                if (i3 == -1) {
                    throw new IOException("End of stream has been reached");
                }
                i2 += i3;
            } catch (IOException e) {
                SQLException sQLException = new SQLException("Error reading stream");
                sQLException.initCause(e);
                throw sQLException;
            }
        }
        return bArr;
    }

    public final void addBatch() throws SQLException {
        a();
        int i = this.h;
        int i2 = this.m;
        int i3 = i + i2;
        this.h = i3;
        this.n++;
        if (this.i == null) {
            this.i = new Object[i2];
        }
        int i4 = i3 + i2;
        Object[] objArr = this.i;
        if (i4 > objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
            this.i = objArr2;
        }
        Object[] objArr3 = this.i;
        int i5 = this.h;
        System.arraycopy(objArr3, i5 - i2, objArr3, i5, i2);
    }

    public final void clearParameters() throws SQLException {
        a();
        this.d.e().clear_bindings(this.f);
        if (this.i != null) {
            for (int i = this.h; i < this.h + this.m; i++) {
                this.i[i] = null;
            }
        }
    }

    @Override // org.sqlite.jdbc3.JDBC3Statement
    public final SQLException e() {
        return new SQLException("not implemented by SQLite JDBC driver");
    }

    public final boolean execute() throws Throwable {
        boolean z;
        Throwable th;
        a();
        this.e.close();
        SQLiteConnection sQLiteConnection = this.d;
        sQLiteConnection.e().reset(this.f);
        try {
            this.j = sQLiteConnection.e().j(this, this.i);
            z = true;
        } catch (Throwable th2) {
            z = false;
            th = th2;
        }
        try {
            return this.l != 0;
        } catch (Throwable th3) {
            th = th3;
            if (!z && this.f != 0) {
                sQLiteConnection.e().reset(this.f);
            }
            throw th;
        }
    }

    public final ResultSet executeQuery() throws SQLException {
        a();
        if (this.l == 0) {
            throw new SQLException("Query does not return results");
        }
        this.e.close();
        SQLiteConnection sQLiteConnection = this.d;
        sQLiteConnection.e().reset(this.f);
        try {
            this.j = sQLiteConnection.e().j(this, this.i);
            return getResultSet();
        } catch (Throwable th) {
            if (this.f != 0) {
                sQLiteConnection.e().reset(this.f);
            }
            throw th;
        }
    }

    public final int executeUpdate() throws SQLException {
        a();
        if (this.l != 0) {
            throw new SQLException("Query returns results");
        }
        this.e.close();
        SQLiteConnection sQLiteConnection = this.d;
        sQLiteConnection.e().reset(this.f);
        return sQLiteConnection.e().l(this, this.i);
    }

    public final ResultSetMetaData getMetaData() throws SQLException {
        a();
        return this.e;
    }

    public final String getParameterClassName(int i) throws SQLException {
        a();
        return "java.lang.String";
    }

    public final int getParameterCount() throws SQLException {
        a();
        return this.m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ParameterMetaData getParameterMetaData() {
        return (ParameterMetaData) this;
    }

    public final int getParameterMode(int i) {
        return 1;
    }

    public final int getParameterType(int i) {
        return 12;
    }

    public final String getParameterTypeName(int i) {
        return "VARCHAR";
    }

    public final int getPrecision(int i) {
        return 0;
    }

    public final int getScale(int i) {
        return 0;
    }

    public final int isNullable(int i) {
        return 1;
    }

    public final boolean isSigned(int i) {
        return true;
    }

    public final void setArray(int i, Array array) throws SQLException {
        throw e();
    }

    public final void setAsciiStream(int i, InputStream inputStream, int i2) throws SQLException {
        setUnicodeStream(i, inputStream, i2);
    }

    public final void setBigDecimal(int i, BigDecimal bigDecimal) throws SQLException {
        f(i, bigDecimal == null ? null : bigDecimal.toString());
    }

    public final void setBinaryStream(int i, InputStream inputStream, int i2) throws SQLException {
        if (inputStream == null && i2 == 0) {
            f(i, null);
        }
        f(i, h(inputStream, i2));
    }

    public final void setBlob(int i, Blob blob) throws SQLException {
        throw e();
    }

    public final void setBoolean(int i, boolean z) throws SQLException {
        setInt(i, z ? 1 : 0);
    }

    public final void setByte(int i, byte b) throws SQLException {
        setInt(i, b);
    }

    public final void setCharacterStream(int i, Reader reader, int i2) throws SQLException, IOException {
        try {
            StringBuffer stringBuffer = new StringBuffer();
            char[] cArr = new char[8192];
            while (true) {
                int i3 = reader.read(cArr);
                if (i3 <= 0) {
                    f(i, stringBuffer.toString());
                    return;
                }
                stringBuffer.append(cArr, 0, i3);
            }
        } catch (IOException e) {
            throw new SQLException(a.k(e, new StringBuilder("Cannot read from character stream, exception message: ")));
        }
    }

    public final void setClob(int i, Clob clob) throws SQLException {
        throw e();
    }

    public final void setDate(int i, Date date, Calendar calendar) throws SQLException {
        if (date == null) {
            f(i, null);
        } else {
            g(i, Long.valueOf(date.getTime()), calendar);
        }
    }

    public final void setDouble(int i, double d) throws SQLException {
        f(i, new Double(d));
    }

    public final void setFloat(int i, float f) throws SQLException {
        f(i, new Float(f));
    }

    public final void setInt(int i, int i2) throws SQLException {
        f(i, new Integer(i2));
    }

    public final void setLong(int i, long j) throws SQLException {
        f(i, new Long(j));
    }

    public final void setNull(int i, int i2) throws SQLException {
        f(i, null);
    }

    public final void setObject(int i, Object obj) throws SQLException {
        if (obj == null) {
            f(i, null);
            return;
        }
        if (obj instanceof java.util.Date) {
            g(i, Long.valueOf(((java.util.Date) obj).getTime()), Calendar.getInstance());
            return;
        }
        if (obj instanceof Long) {
            f(i, obj);
            return;
        }
        if (obj instanceof Integer) {
            f(i, obj);
            return;
        }
        if (obj instanceof Short) {
            f(i, new Integer(((Short) obj).intValue()));
            return;
        }
        if (obj instanceof Float) {
            f(i, obj);
            return;
        }
        if (obj instanceof Double) {
            f(i, obj);
            return;
        }
        if (obj instanceof Boolean) {
            setInt(i, ((Boolean) obj).booleanValue() ? 1 : 0);
            return;
        }
        if (obj instanceof byte[]) {
            f(i, obj);
        } else if (obj instanceof BigDecimal) {
            setBigDecimal(i, (BigDecimal) obj);
        } else {
            f(i, obj.toString());
        }
    }

    public final void setRef(int i, Ref ref) throws SQLException {
        throw e();
    }

    public final void setShort(int i, short s) throws SQLException {
        setInt(i, s);
    }

    public final void setTime(int i, Time time, Calendar calendar) throws SQLException {
        if (time == null) {
            f(i, null);
        } else {
            g(i, Long.valueOf(time.getTime()), calendar);
        }
    }

    public final void setTimestamp(int i, Timestamp timestamp, Calendar calendar) throws SQLException {
        if (timestamp == null) {
            f(i, null);
        } else {
            g(i, Long.valueOf(timestamp.getTime()), calendar);
        }
    }

    public final void setURL(int i, URL url) throws SQLException {
        throw e();
    }

    public final void setUnicodeStream(int i, InputStream inputStream, int i2) throws SQLException {
        if (inputStream == null && i2 == 0) {
            f(i, null);
        }
        try {
            f(i, new String(h(inputStream, i2), "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            SQLException sQLException = new SQLException("UTF-8 is not supported");
            sQLException.initCause(e);
            throw sQLException;
        }
    }

    public final void setNull(int i, int i2, String str) throws SQLException {
        f(i, null);
    }

    public final void setDate(int i, Date date) throws SQLException {
        setDate(i, date, Calendar.getInstance());
    }

    public final void setTime(int i, Time time) throws SQLException {
        setTime(i, time, Calendar.getInstance());
    }

    public final void setTimestamp(int i, Timestamp timestamp) throws SQLException {
        setTimestamp(i, timestamp, Calendar.getInstance());
    }

    @Override // org.sqlite.jdbc3.JDBC3Statement, java.sql.Statement
    public final int executeUpdate(String str) throws SQLException {
        throw e();
    }

    @Override // org.sqlite.jdbc3.JDBC3Statement, java.sql.Statement
    public final boolean execute(String str) throws SQLException {
        throw e();
    }

    @Override // org.sqlite.jdbc3.JDBC3Statement, java.sql.Statement
    public final ResultSet executeQuery(String str) throws SQLException {
        throw e();
    }

    @Override // org.sqlite.jdbc3.JDBC3Statement, java.sql.Statement
    public final void addBatch(String str) throws SQLException {
        throw e();
    }

    public final void setObject(int i, Object obj, int i2) throws SQLException {
        setObject(i, obj);
    }

    public final void setObject(int i, Object obj, int i2, int i3) throws SQLException {
        setObject(i, obj);
    }
}
