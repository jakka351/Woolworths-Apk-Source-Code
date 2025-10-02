package com.squareup.sqldelight.android;

import android.database.Cursor;
import com.squareup.sqldelight.db.SqlCursor;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/sqldelight/android/AndroidCursor;", "Lcom/squareup/sqldelight/db/SqlCursor;", "sqldelight-android-driver_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
final class AndroidCursor implements SqlCursor {
    public final Cursor d;

    public AndroidCursor(Cursor cursor) {
        this.d = cursor;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    @Override // com.squareup.sqldelight.db.SqlCursor
    public final byte[] getBytes(int i) {
        Cursor cursor = this.d;
        if (cursor.isNull(i)) {
            return null;
        }
        return cursor.getBlob(i);
    }

    @Override // com.squareup.sqldelight.db.SqlCursor
    public final Double getDouble(int i) {
        Cursor cursor = this.d;
        if (cursor.isNull(i)) {
            return null;
        }
        return Double.valueOf(cursor.getDouble(i));
    }

    @Override // com.squareup.sqldelight.db.SqlCursor
    public final Long getLong(int i) {
        Cursor cursor = this.d;
        if (cursor.isNull(i)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i));
    }

    @Override // com.squareup.sqldelight.db.SqlCursor
    public final String getString(int i) {
        Cursor cursor = this.d;
        if (cursor.isNull(i)) {
            return null;
        }
        return cursor.getString(i);
    }

    @Override // com.squareup.sqldelight.db.SqlCursor
    public final boolean next() {
        return this.d.moveToNext();
    }
}
