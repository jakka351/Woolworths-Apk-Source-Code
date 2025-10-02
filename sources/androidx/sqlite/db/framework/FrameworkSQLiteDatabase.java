package androidx.sqlite.db.framework;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "Api30Impl", "Companion", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class FrameworkSQLiteDatabase implements SupportSQLiteDatabase {
    public static final String[] e = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] f = new String[0];
    public final SQLiteDatabase d;

    @RequiresApi
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001J3\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase$Api30Impl;", "", "Landroid/database/sqlite/SQLiteDatabase;", "sQLiteDatabase", "", "sql", "", "bindArgs", "", "a", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/Object;)V", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Api30Impl {
        @DoNotInline
        public final void a(@NotNull SQLiteDatabase sQLiteDatabase, @NotNull String sql, @Nullable Object[] bindArgs) throws SQLException {
            Intrinsics.h(sQLiteDatabase, "sQLiteDatabase");
            Intrinsics.h(sql, "sql");
            sQLiteDatabase.execPerConnectionSQL(sql, bindArgs);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase$Companion;", "", "", "", "CONFLICT_VALUES", "[Ljava/lang/String;", "EMPTY_STRING_ARRAY", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public FrameworkSQLiteDatabase(SQLiteDatabase sQLiteDatabase) {
        this.d = sQLiteDatabase;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final long D() {
        return this.d.getPageSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final long D0() {
        return this.d.getMaximumSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void N() {
        this.d.beginTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final List O() {
        return this.d.getAttachedDbs();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void O1(int i) {
        this.d.setVersion(i);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final SupportSQLiteStatement S1(String sql) throws SQLException {
        Intrinsics.h(sql, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.d.compileStatement(sql);
        Intrinsics.g(sQLiteStatementCompileStatement, "delegate.compileStatement(sql)");
        return new FrameworkSQLiteStatement(sQLiteStatementCompileStatement);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void W() {
        this.d.beginTransactionNonExclusive();
    }

    public final Cursor a(String query) {
        Intrinsics.h(query, "query");
        return g0(new SimpleSQLiteQuery(query));
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void a2(Object[] bindArgs) throws SQLException {
        Intrinsics.h(bindArgs, "bindArgs");
        this.d.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", bindArgs);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void c1(String sql) throws SQLException {
        Intrinsics.h(sql, "sql");
        this.d.execSQL(sql);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean c2() {
        return this.d.yieldIfContendedSafely();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean e0() {
        return this.d.isDbLockedByCurrentThread();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final Cursor g0(final SupportSQLiteQuery query) {
        Intrinsics.h(query, "query");
        final Function4<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor> function4 = new Function4<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor>() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteDatabase$query$cursorFactory$1
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                Intrinsics.e(sQLiteQuery);
                query.d(new FrameworkSQLiteProgram(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
            }
        };
        Cursor cursorRawQueryWithFactory = this.d.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.db.framework.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                Function4 tmp0 = function4;
                Intrinsics.h(tmp0, "$tmp0");
                return (Cursor) tmp0.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, query.getD(), f, null);
        Intrinsics.g(cursorRawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return cursorRawQueryWithFactory;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean g1() {
        return this.d.isDatabaseIntegrityOk();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final String getPath() {
        return this.d.getPath();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final int getVersion() {
        return this.d.getVersion();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean isReadOnly() {
        return this.d.isReadOnly();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean l2() {
        return this.d.inTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void o1() {
        this.d.setTransactionSuccessful();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean r2() {
        SQLiteDatabase sQLiteDatabase = this.d;
        Intrinsics.h(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void v1() {
        this.d.endTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final int v2(ContentValues contentValues, Object[] objArr) throws SQLException {
        if (contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = contentValues.size();
        int length = objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(e[3]);
        sb.append("WorkSpec SET ");
        int i = 0;
        for (String str : contentValues.keySet()) {
            sb.append(i > 0 ? "," : "");
            sb.append(str);
            objArr2[i] = contentValues.get(str);
            sb.append("=?");
            i++;
        }
        for (int i2 = size; i2 < length; i2++) {
            objArr2[i2] = objArr[i2 - size];
        }
        if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
            sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
        }
        String string = sb.toString();
        Intrinsics.g(string, "StringBuilder().apply(builderAction).toString()");
        SupportSQLiteStatement supportSQLiteStatementS1 = S1(string);
        int length2 = objArr2.length;
        int i3 = 0;
        while (i3 < length2) {
            Object obj = objArr2[i3];
            i3++;
            if (obj == null) {
                supportSQLiteStatementS1.N0(i3);
            } else if (obj instanceof byte[]) {
                supportSQLiteStatementS1.E0(i3, (byte[]) obj);
            } else if (obj instanceof Float) {
                supportSQLiteStatementS1.j2(((Number) obj).floatValue(), i3);
            } else if (obj instanceof Double) {
                supportSQLiteStatementS1.j2(((Number) obj).doubleValue(), i3);
            } else if (obj instanceof Long) {
                supportSQLiteStatementS1.C0(i3, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                supportSQLiteStatementS1.C0(i3, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                supportSQLiteStatementS1.C0(i3, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                supportSQLiteStatementS1.C0(i3, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                supportSQLiteStatementS1.z(i3, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i3 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                supportSQLiteStatementS1.C0(i3, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
        return ((FrameworkSQLiteStatement) supportSQLiteStatementS1).e.executeUpdateDelete();
    }
}
