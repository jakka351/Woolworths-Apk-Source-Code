package org.sqlite;

import com.dynatrace.android.callback.Callback;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Map;
import org.sqlite.SQLiteConfig;
import org.sqlite.core.CoreDatabaseMetaData;
import org.sqlite.core.CoreStatement;
import org.sqlite.core.DB;
import org.sqlite.core.NativeDB;
import org.sqlite.jdbc4.JDBC4DatabaseMetaData;

/* loaded from: classes8.dex */
public abstract class SQLiteConnection implements Connection {
    public final NativeDB d;
    public JDBC4DatabaseMetaData e = null;
    public final SQLiteConnectionConfig f;

    /* JADX WARN: Removed duplicated region for block: B:103:0x022e A[LOOP:2: B:102:0x022c->B:103:0x022e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03d5 A[Catch: all -> 0x03d3, TryCatch #2 {all -> 0x03d3, blocks: (B:143:0x03ac, B:145:0x03b4, B:147:0x03bc, B:149:0x03c2, B:158:0x03e2, B:154:0x03d5, B:159:0x03fa, B:160:0x0402, B:162:0x0408, B:165:0x0417, B:167:0x041d), top: B:190:0x03ac }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0408 A[Catch: all -> 0x03d3, TryCatch #2 {all -> 0x03d3, blocks: (B:143:0x03ac, B:145:0x03b4, B:147:0x03bc, B:149:0x03c2, B:158:0x03e2, B:154:0x03d5, B:159:0x03fa, B:160:0x0402, B:162:0x0408, B:165:0x0417, B:167:0x041d), top: B:190:0x03ac }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:218:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SQLiteConnection(java.lang.String r18, java.lang.String r19, java.util.Properties r20) throws java.sql.SQLException {
        /*
            Method dump skipped, instructions count: 1114
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.sqlite.SQLiteConnection.<init>(java.lang.String, java.lang.String, java.util.Properties):void");
    }

    public static void a(int i, int i2, int i3) throws SQLException {
        if (i != 1003) {
            throw new SQLException("SQLite only supports TYPE_FORWARD_ONLY cursors");
        }
        if (i2 != 1007) {
            throw new SQLException("SQLite only supports CONCUR_READ_ONLY cursors");
        }
        if (i3 != 2) {
            throw new SQLException("SQLite only supports closing cursors at commit");
        }
    }

    public static File c(URL url) throws IOException {
        if (url.getProtocol().equals("file")) {
            try {
                return new File(url.toURI());
            } catch (URISyntaxException e) {
                throw new IOException(e.getMessage());
            }
        }
        File file = new File(new File(System.getProperty("java.io.tmpdir")).getAbsolutePath(), String.format("sqlite-jdbc-tmp-%d.db", Integer.valueOf(url.hashCode())));
        if (file.exists()) {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            Callback.v(uRLConnectionOpenConnection);
            if (((URLConnection) FirebasePerfUrlConnection.instrument(uRLConnectionOpenConnection)).getLastModified() < file.lastModified()) {
                return file;
            }
            if (!file.delete()) {
                throw new IOException("failed to remove existing DB file: " + file.getAbsolutePath());
            }
        }
        byte[] bArr = new byte[8192];
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        InputStream inputStreamOpenStream = FirebasePerfUrlConnection.openStream(url);
        while (true) {
            try {
                int i = inputStreamOpenStream.read(bArr);
                if (i == -1) {
                    return file;
                }
                fileOutputStream.write(bArr, 0, i);
            } finally {
                fileOutputStream.close();
                inputStreamOpenStream.close();
            }
        }
    }

    public final void b() throws SQLException {
        if (isClosed()) {
            throw new SQLException("database connection closed");
        }
    }

    @Override // java.sql.Connection, java.lang.AutoCloseable
    public void close() {
        if (isClosed()) {
            return;
        }
        JDBC4DatabaseMetaData jDBC4DatabaseMetaData = this.e;
        if (jDBC4DatabaseMetaData != null) {
            jDBC4DatabaseMetaData.close();
        }
        NativeDB nativeDB = this.d;
        synchronized (nativeDB) {
            try {
                synchronized (nativeDB.j) {
                    try {
                        Iterator it = nativeDB.j.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            CoreStatement coreStatement = (CoreStatement) entry.getValue();
                            nativeDB.finalize(((Long) entry.getKey()).longValue());
                            if (coreStatement != null) {
                                coreStatement.f = 0L;
                            }
                            it.remove();
                        }
                    } finally {
                    }
                }
                nativeDB.free_functions();
                long j = nativeDB.h;
                if (j != 0) {
                    nativeDB.finalize(j);
                    nativeDB.h = 0L;
                }
                long j2 = nativeDB.i;
                if (j2 != 0) {
                    nativeDB.finalize(j2);
                    nativeDB.i = 0L;
                }
                nativeDB.g.set(true);
                nativeDB._close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.sql.Connection
    public void commit() throws SQLException {
        b();
        SQLiteConnectionConfig sQLiteConnectionConfig = this.f;
        if (sQLiteConnectionConfig.j) {
            throw new SQLException("database in auto-commit mode");
        }
        boolean autoCommit = getAutoCommit();
        NativeDB nativeDB = this.d;
        nativeDB.i("commit;", autoCommit);
        nativeDB.i((String) SQLiteConnectionConfig.k.get(sQLiteConnectionConfig.i), getAutoCommit());
    }

    public int d() {
        return this.d.f.c;
    }

    public DB e() {
        return this.d;
    }

    public final CoreDatabaseMetaData f() throws SQLException {
        b();
        if (this.e == null) {
            JDBC4DatabaseMetaData jDBC4DatabaseMetaData = new JDBC4DatabaseMetaData();
            jDBC4DatabaseMetaData.e = null;
            jDBC4DatabaseMetaData.f = null;
            jDBC4DatabaseMetaData.g = null;
            jDBC4DatabaseMetaData.h = null;
            jDBC4DatabaseMetaData.i = null;
            jDBC4DatabaseMetaData.j = null;
            jDBC4DatabaseMetaData.k = null;
            jDBC4DatabaseMetaData.l = null;
            jDBC4DatabaseMetaData.m = null;
            jDBC4DatabaseMetaData.n = null;
            jDBC4DatabaseMetaData.o = null;
            jDBC4DatabaseMetaData.p = null;
            jDBC4DatabaseMetaData.q = null;
            jDBC4DatabaseMetaData.r = null;
            jDBC4DatabaseMetaData.s = null;
            jDBC4DatabaseMetaData.d = this;
            this.e = jDBC4DatabaseMetaData;
        }
        return this.e;
    }

    public final String g() throws SQLException {
        String strU;
        b();
        NativeDB nativeDB = this.d;
        synchronized (nativeDB) {
            strU = NativeDB.u(nativeDB.libversion_utf8());
        }
        return strU;
    }

    @Override // java.sql.Connection
    public boolean getAutoCommit() throws SQLException {
        b();
        return this.f.j;
    }

    @Override // java.sql.Connection
    public DatabaseMetaData getMetaData() {
        return f();
    }

    @Override // java.sql.Connection
    public int getTransactionIsolation() {
        return this.f.h;
    }

    public void h(int i) {
        NativeDB nativeDB = this.d;
        SQLiteConfig sQLiteConfig = nativeDB.f;
        sQLiteConfig.getClass();
        SQLiteConfig.Pragma pragma = SQLiteConfig.Pragma.y;
        sQLiteConfig.f26877a.put(pragma.d, Integer.toString(i));
        nativeDB.busy_timeout(i);
    }

    @Override // java.sql.Connection
    public boolean isClosed() {
        return this.d.g.get();
    }

    @Override // java.sql.Connection
    public PreparedStatement prepareStatement(String str, int i) {
        return prepareStatement(str);
    }

    @Override // java.sql.Connection
    public void rollback() throws SQLException {
        b();
        SQLiteConnectionConfig sQLiteConnectionConfig = this.f;
        if (sQLiteConnectionConfig.j) {
            throw new SQLException("database in auto-commit mode");
        }
        boolean autoCommit = getAutoCommit();
        NativeDB nativeDB = this.d;
        nativeDB.i("rollback;", autoCommit);
        nativeDB.i((String) SQLiteConnectionConfig.k.get(sQLiteConnectionConfig.i), getAutoCommit());
    }

    @Override // java.sql.Connection
    public void setAutoCommit(boolean z) throws SQLException {
        b();
        SQLiteConnectionConfig sQLiteConnectionConfig = this.f;
        if (sQLiteConnectionConfig.j == z) {
            return;
        }
        sQLiteConnectionConfig.j = z;
        this.d.i(z ? "commit;" : (String) SQLiteConnectionConfig.k.get(sQLiteConnectionConfig.i), z);
    }

    @Override // java.sql.Connection
    public void setCatalog(String str) throws SQLException {
        b();
    }

    @Override // java.sql.Connection
    public void setTransactionIsolation(int i) throws SQLException {
        b();
        if (i == 1) {
            e().i("PRAGMA read_uncommitted = true;", getAutoCommit());
        } else {
            if (i != 8) {
                throw new SQLException("SQLite supports only TRANSACTION_SERIALIZABLE and TRANSACTION_READ_UNCOMMITTED.");
            }
            e().i("PRAGMA read_uncommitted = false;", getAutoCommit());
        }
        this.f.h = i;
    }

    @Override // java.sql.Connection
    public PreparedStatement prepareStatement(String str, int[] iArr) {
        return prepareStatement(str);
    }

    @Override // java.sql.Connection
    public PreparedStatement prepareStatement(String str, String[] strArr) {
        return prepareStatement(str);
    }
}
