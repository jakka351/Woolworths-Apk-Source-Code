package androidx.room;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import androidx.sqlite.db.SupportSQLiteCompat;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/room/AutoClosingRoomOpenHelper;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Landroidx/room/DelegatingOpenHelper;", "AutoClosingSupportSQLiteDatabase", "AutoClosingSupportSqliteStatement", "KeepAliveCursor", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AutoClosingRoomOpenHelper implements SupportSQLiteOpenHelper, DelegatingOpenHelper {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class AutoClosingSupportSQLiteDatabase implements SupportSQLiteDatabase {
        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final long D() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final long D0() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final void N() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final List O() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final void O1(int i) {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final SupportSQLiteStatement S1(String sql) {
            Intrinsics.h(sql, "sql");
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final void W() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final void a2(Object[] bindArgs) {
            Intrinsics.h(bindArgs, "bindArgs");
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final void c1(String sql) {
            Intrinsics.h(sql, "sql");
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final boolean c2() {
            throw null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final boolean e0() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final Cursor g0(SupportSQLiteQuery supportSQLiteQuery) {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final boolean g1() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final String getPath() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final int getVersion() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final boolean isReadOnly() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final boolean l2() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final void o1() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final boolean r2() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final void v1() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final int v2(ContentValues contentValues, Object[] objArr) {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement;", "Landroidx/sqlite/db/SupportSQLiteStatement;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes2.dex */
    public static final class AutoClosingSupportSqliteStatement implements SupportSQLiteStatement {
        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public final void C0(int i, long j) {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public final void E0(int i, byte[] value) {
            Intrinsics.h(value, "value");
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public final long M1() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public final void N0(int i) {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public final int P() {
            throw null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public final void execute() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public final void j2(double d, int i) {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public final long o0() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public final String s1() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public final void z(int i, String value) {
            Intrinsics.h(value, "value");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/AutoClosingRoomOpenHelper$KeepAliveCursor;", "Landroid/database/Cursor;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class KeepAliveCursor implements Cursor {
        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }

        @Override // android.database.Cursor
        public final void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
            throw null;
        }

        @Override // android.database.Cursor
        public final void deactivate() {
            throw null;
        }

        @Override // android.database.Cursor
        public final byte[] getBlob(int i) {
            throw null;
        }

        @Override // android.database.Cursor
        public final int getColumnCount() {
            throw null;
        }

        @Override // android.database.Cursor
        public final int getColumnIndex(String str) {
            throw null;
        }

        @Override // android.database.Cursor
        public final int getColumnIndexOrThrow(String str) {
            throw null;
        }

        @Override // android.database.Cursor
        public final String getColumnName(int i) {
            throw null;
        }

        @Override // android.database.Cursor
        public final String[] getColumnNames() {
            throw null;
        }

        @Override // android.database.Cursor
        public final int getCount() {
            throw null;
        }

        @Override // android.database.Cursor
        public final double getDouble(int i) {
            throw null;
        }

        @Override // android.database.Cursor
        public final Bundle getExtras() {
            throw null;
        }

        @Override // android.database.Cursor
        public final float getFloat(int i) {
            throw null;
        }

        @Override // android.database.Cursor
        public final int getInt(int i) {
            throw null;
        }

        @Override // android.database.Cursor
        public final long getLong(int i) {
            throw null;
        }

        @Override // android.database.Cursor
        public final Uri getNotificationUri() {
            Intrinsics.h(null, "cursor");
            throw null;
        }

        @Override // android.database.Cursor
        public final List getNotificationUris() {
            SupportSQLiteCompat.Api29Impl.a(null);
            throw null;
        }

        @Override // android.database.Cursor
        public final int getPosition() {
            throw null;
        }

        @Override // android.database.Cursor
        public final short getShort(int i) {
            throw null;
        }

        @Override // android.database.Cursor
        public final String getString(int i) {
            throw null;
        }

        @Override // android.database.Cursor
        public final int getType(int i) {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean getWantsAllOnMoveCalls() {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean isAfterLast() {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean isBeforeFirst() {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean isClosed() {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean isFirst() {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean isLast() {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean isNull(int i) {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean move(int i) {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean moveToFirst() {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean moveToLast() {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean moveToNext() {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean moveToPosition(int i) {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean moveToPrevious() {
            throw null;
        }

        @Override // android.database.Cursor
        public final void registerContentObserver(ContentObserver contentObserver) {
            throw null;
        }

        @Override // android.database.Cursor
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean requery() {
            throw null;
        }

        @Override // android.database.Cursor
        public final Bundle respond(Bundle bundle) {
            throw null;
        }

        @Override // android.database.Cursor
        public final void setExtras(Bundle extras) {
            Intrinsics.h(extras, "extras");
            Intrinsics.h(null, "cursor");
            throw null;
        }

        @Override // android.database.Cursor
        public final void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            throw null;
        }

        @Override // android.database.Cursor
        public final void setNotificationUris(ContentResolver cr, List uris) {
            Intrinsics.h(cr, "cr");
            Intrinsics.h(uris, "uris");
            SupportSQLiteCompat.Api29Impl.b(null, cr, uris);
            throw null;
        }

        @Override // android.database.Cursor
        public final void unregisterContentObserver(ContentObserver contentObserver) {
            throw null;
        }

        @Override // android.database.Cursor
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            throw null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // androidx.room.DelegatingOpenHelper
    public final SupportSQLiteOpenHelper getDelegate() {
        return null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final SupportSQLiteDatabase getWritableDatabase() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final void setWriteAheadLoggingEnabled(boolean z) {
        throw null;
    }
}
