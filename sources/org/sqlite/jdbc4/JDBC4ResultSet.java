package org.sqlite.jdbc4;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.NClob;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.SQLXML;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Map;
import org.sqlite.core.CoreStatement;
import org.sqlite.jdbc3.JDBC3ResultSet;

/* loaded from: classes8.dex */
public class JDBC4ResultSet extends JDBC3ResultSet implements ResultSet, ResultSetMetaData {
    public static final /* synthetic */ int r = 0;

    public class SqliteClob implements NClob {

        /* renamed from: a, reason: collision with root package name */
        public String f26909a;

        public SqliteClob(String str) {
            this.f26909a = str;
        }

        @Override // java.sql.Clob
        public final void free() {
            this.f26909a = null;
        }

        @Override // java.sql.Clob
        public final InputStream getAsciiStream() {
            return JDBC4ResultSet.h(this.f26909a);
        }

        @Override // java.sql.Clob
        public final Reader getCharacterStream() {
            String str = this.f26909a;
            int i = JDBC4ResultSet.r;
            if (str == null) {
                return null;
            }
            return new StringReader(str);
        }

        @Override // java.sql.Clob
        public final String getSubString(long j, int i) throws SQLException {
            String str = this.f26909a;
            if (str == null) {
                throw new SQLException("no data");
            }
            if (j < 1) {
                throw new SQLException("Position must be greater than or equal to 1");
            }
            if (i < 0) {
                throw new SQLException("Length must be greater than or equal to 0");
            }
            int i2 = ((int) j) - 1;
            return str.substring(i2, Math.min(i + i2, str.length()));
        }

        @Override // java.sql.Clob
        public final long length() throws SQLException {
            if (this.f26909a != null) {
                return r0.length();
            }
            throw new SQLException("no data");
        }

        @Override // java.sql.Clob
        public final long position(String str, long j) {
            JDBC4ResultSet.this.i();
            return -1L;
        }

        @Override // java.sql.Clob
        public final OutputStream setAsciiStream(long j) {
            JDBC4ResultSet.this.i();
            return null;
        }

        @Override // java.sql.Clob
        public final Writer setCharacterStream(long j) {
            JDBC4ResultSet.this.i();
            return null;
        }

        @Override // java.sql.Clob
        public final int setString(long j, String str) {
            JDBC4ResultSet.this.i();
            return -1;
        }

        @Override // java.sql.Clob
        public final void truncate(long j) {
            JDBC4ResultSet.this.i();
        }

        @Override // java.sql.Clob
        public final long position(Clob clob, long j) {
            JDBC4ResultSet.this.i();
            return -1L;
        }

        @Override // java.sql.Clob
        public final int setString(long j, String str, int i, int i2) {
            JDBC4ResultSet.this.i();
            return -1;
        }

        @Override // java.sql.Clob
        public final Reader getCharacterStream(long j, long j2) {
            String str = this.f26909a;
            int i = JDBC4ResultSet.r;
            if (str == null) {
                return null;
            }
            return new StringReader(str);
        }
    }

    public static ByteArrayInputStream h(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new ByteArrayInputStream(str.getBytes("ASCII"));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    @Override // java.sql.ResultSet
    public final boolean absolute(int i) throws SQLException {
        throw new SQLException("ResultSet is TYPE_FORWARD_ONLY");
    }

    @Override // java.sql.ResultSet
    public final void afterLast() throws SQLException {
        throw new SQLException("ResultSet is TYPE_FORWARD_ONLY");
    }

    @Override // java.sql.ResultSet
    public final void beforeFirst() throws SQLException {
        throw new SQLException("ResultSet is TYPE_FORWARD_ONLY");
    }

    @Override // java.sql.ResultSet
    public final void cancelRowUpdates() throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // org.sqlite.core.CoreResultSet, java.sql.ResultSet, java.lang.AutoCloseable
    public final void close() {
        boolean z = this.e;
        super.close();
        if (z) {
            CoreStatement coreStatement = this.d;
            if (coreStatement instanceof JDBC4Statement) {
                ((JDBC4Statement) coreStatement).getClass();
            }
        }
    }

    @Override // java.sql.ResultSet
    public final void deleteRow() throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final boolean first() throws SQLException {
        throw new SQLException("ResultSet is TYPE_FORWARD_ONLY");
    }

    @Override // java.sql.ResultSet
    public final Array getArray(int i) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final InputStream getAsciiStream(int i) {
        return h(getString(i));
    }

    @Override // java.sql.ResultSet
    public final BigDecimal getBigDecimal(int i, int i2) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final Blob getBlob(int i) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final Clob getClob(int i) {
        return new SqliteClob(getString(i));
    }

    @Override // java.sql.ResultSet
    public final int getHoldability() {
        return 0;
    }

    @Override // java.sql.ResultSet
    public final Reader getNCharacterStream(int i) {
        String string = getString(i);
        if (string == null) {
            return null;
        }
        return new StringReader(string);
    }

    @Override // java.sql.ResultSet
    public final NClob getNClob(int i) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final String getNString(int i) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final Object getObject(int i, Map map) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final Ref getRef(int i) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final RowId getRowId(int i) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final SQLXML getSQLXML(int i) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final URL getURL(int i) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final InputStream getUnicodeStream(int i) {
        return getAsciiStream(i);
    }

    public final SQLException i() {
        return new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void insertRow() throws SQLException {
        throw new SQLException("ResultSet is TYPE_FORWARD_ONLY");
    }

    @Override // java.sql.ResultSet
    public final boolean isClosed() {
        return !this.e;
    }

    @Override // java.sql.Wrapper
    public final boolean isWrapperFor(Class cls) {
        return cls.isInstance(this);
    }

    @Override // java.sql.ResultSet
    public final boolean last() throws SQLException {
        throw new SQLException("ResultSet is TYPE_FORWARD_ONLY");
    }

    @Override // java.sql.ResultSet
    public final void moveToCurrentRow() throws SQLException {
        throw new SQLException("ResultSet is TYPE_FORWARD_ONLY");
    }

    @Override // java.sql.ResultSet
    public final void moveToInsertRow() throws SQLException {
        throw new SQLException("ResultSet is TYPE_FORWARD_ONLY");
    }

    @Override // java.sql.ResultSet
    public final boolean previous() throws SQLException {
        throw new SQLException("ResultSet is TYPE_FORWARD_ONLY");
    }

    @Override // java.sql.ResultSet
    public final void refreshRow() throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final boolean relative(int i) throws SQLException {
        throw new SQLException("ResultSet is TYPE_FORWARD_ONLY");
    }

    @Override // java.sql.Wrapper
    public final Object unwrap(Class cls) {
        return cls.cast(this);
    }

    @Override // java.sql.ResultSet
    public final void updateArray(int i, Array array) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateAsciiStream(int i, InputStream inputStream, long j) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateBigDecimal(int i, BigDecimal bigDecimal) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateBinaryStream(int i, InputStream inputStream, long j) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateBlob(int i, InputStream inputStream, long j) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateBoolean(int i, boolean z) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateByte(int i, byte b) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateBytes(int i, byte[] bArr) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateCharacterStream(int i, Reader reader, long j) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateClob(int i, Reader reader, long j) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateDate(int i, Date date) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateDouble(int i, double d) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateFloat(int i, float f) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateInt(int i, int i2) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateLong(int i, long j) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateNCharacterStream(int i, Reader reader, long j) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateNClob(int i, NClob nClob) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateNString(int i, String str) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateNull(int i) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateObject(int i, Object obj) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateRef(int i, Ref ref) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateRow() throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateRowId(int i, RowId rowId) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateSQLXML(int i, SQLXML sqlxml) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateShort(int i, short s) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateString(int i, String str) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateTime(int i, Time time) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateTimestamp(int i, Timestamp timestamp) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final Clob getClob(String str) {
        return new SqliteClob(getString(str));
    }

    @Override // java.sql.ResultSet
    public final NClob getNClob(String str) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final String getNString(String str) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final RowId getRowId(String str) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final SQLXML getSQLXML(String str) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final InputStream getUnicodeStream(String str) {
        return getAsciiStream(str);
    }

    @Override // java.sql.ResultSet
    public final void updateAsciiStream(String str, InputStream inputStream, long j) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateBinaryStream(String str, InputStream inputStream, long j) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateBlob(String str, InputStream inputStream, long j) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateCharacterStream(String str, Reader reader, long j) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateClob(String str, Reader reader, long j) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateNCharacterStream(String str, Reader reader, long j) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateNClob(String str, NClob nClob) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateNString(String str, String str2) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateRowId(String str, RowId rowId) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateSQLXML(String str, SQLXML sqlxml) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final Array getArray(String str) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final InputStream getAsciiStream(String str) {
        return h(getString(str));
    }

    @Override // java.sql.ResultSet
    public final BigDecimal getBigDecimal(String str, int i) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final Blob getBlob(String str) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final Reader getNCharacterStream(String str) {
        String string = getString(str);
        if (string == null) {
            return null;
        }
        return new StringReader(string);
    }

    @Override // java.sql.ResultSet
    public final Object getObject(String str, Map map) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final Ref getRef(String str) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final URL getURL(String str) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateArray(String str, Array array) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateAsciiStream(int i, InputStream inputStream) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateBigDecimal(String str, BigDecimal bigDecimal) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateBinaryStream(int i, InputStream inputStream) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateBlob(int i, InputStream inputStream) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateBoolean(String str, boolean z) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateByte(String str, byte b) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateBytes(String str, byte[] bArr) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateCharacterStream(int i, Reader reader) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateClob(int i, Reader reader) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateDate(String str, Date date) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateDouble(String str, double d) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateFloat(String str, float f) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateInt(String str, int i) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateLong(String str, long j) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateNCharacterStream(int i, Reader reader) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateNClob(int i, Reader reader, long j) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateNull(String str) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateObject(int i, Object obj, int i2) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateRef(String str, Ref ref) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateShort(String str, short s) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateString(String str, String str2) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateTime(String str, Time time) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateTimestamp(String str, Timestamp timestamp) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateAsciiStream(String str, InputStream inputStream) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateBinaryStream(String str, InputStream inputStream) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateBlob(String str, InputStream inputStream) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateCharacterStream(String str, Reader reader) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateClob(String str, Reader reader) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateNCharacterStream(String str, Reader reader) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateNClob(String str, Reader reader, long j) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateAsciiStream(int i, InputStream inputStream, int i2) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateBinaryStream(int i, InputStream inputStream, int i2) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateBlob(int i, Blob blob) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateCharacterStream(int i, Reader reader, int i2) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateClob(int i, Clob clob) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateNClob(int i, Reader reader) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateObject(String str, Object obj) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateNClob(String str, Reader reader) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateAsciiStream(String str, InputStream inputStream, int i) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateBinaryStream(String str, InputStream inputStream, int i) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateBlob(String str, Blob blob) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateCharacterStream(String str, Reader reader, int i) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateClob(String str, Clob clob) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.ResultSet
    public final void updateObject(String str, Object obj, int i) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }
}
