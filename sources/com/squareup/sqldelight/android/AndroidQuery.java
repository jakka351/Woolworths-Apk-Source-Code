package com.squareup.sqldelight.android;

import android.database.Cursor;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.squareup.sqldelight.db.SqlCursor;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/squareup/sqldelight/android/AndroidQuery;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "Lcom/squareup/sqldelight/android/AndroidStatement;", "sqldelight-android-driver_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
final class AndroidQuery implements SupportSQLiteQuery, AndroidStatement {
    public final String d;
    public final SupportSQLiteDatabase e;
    public final LinkedHashMap f;

    public AndroidQuery(String sql, SupportSQLiteDatabase database) {
        Intrinsics.h(sql, "sql");
        Intrinsics.h(database, "database");
        this.d = sql;
        this.e = database;
        this.f = new LinkedHashMap();
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    /* renamed from: a, reason: from getter */
    public final String getD() {
        return this.d;
    }

    @Override // com.squareup.sqldelight.db.SqlPreparedStatement
    public final void b(final int i, final Double d) {
        this.f.put(Integer.valueOf(i), new Function1<SupportSQLiteProgram, Unit>() { // from class: com.squareup.sqldelight.android.AndroidQuery$bindDouble$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SupportSQLiteProgram it = (SupportSQLiteProgram) obj;
                Intrinsics.h(it, "it");
                int i2 = i;
                Double d2 = d;
                if (d2 == null) {
                    it.N0(i2);
                } else {
                    it.j2(d2.doubleValue(), i2);
                }
                return Unit.f24250a;
            }
        });
    }

    @Override // com.squareup.sqldelight.db.SqlPreparedStatement
    public final void c(final int i, final Long l) {
        this.f.put(Integer.valueOf(i), new Function1<SupportSQLiteProgram, Unit>() { // from class: com.squareup.sqldelight.android.AndroidQuery$bindLong$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SupportSQLiteProgram it = (SupportSQLiteProgram) obj;
                Intrinsics.h(it, "it");
                it.C0(i, l.longValue());
                return Unit.f24250a;
            }
        });
    }

    @Override // com.squareup.sqldelight.android.AndroidStatement
    public final void close() {
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public final void d(SupportSQLiteProgram supportSQLiteProgram) {
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(supportSQLiteProgram);
        }
    }

    @Override // com.squareup.sqldelight.db.SqlPreparedStatement
    public final void e(final int i, final byte[] bArr) {
        this.f.put(Integer.valueOf(i), new Function1<SupportSQLiteProgram, Unit>() { // from class: com.squareup.sqldelight.android.AndroidQuery$bindBytes$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SupportSQLiteProgram it = (SupportSQLiteProgram) obj;
                Intrinsics.h(it, "it");
                int i2 = i;
                byte[] bArr2 = bArr;
                if (bArr2 == null) {
                    it.N0(i2);
                } else {
                    it.E0(i2, bArr2);
                }
                return Unit.f24250a;
            }
        });
    }

    @Override // com.squareup.sqldelight.android.AndroidStatement
    public final void execute() {
        throw new UnsupportedOperationException();
    }

    @Override // com.squareup.sqldelight.android.AndroidStatement
    public final SqlCursor executeQuery() {
        Cursor cursorG0 = this.e.g0(this);
        Intrinsics.g(cursorG0, "database.query(this)");
        return new AndroidCursor(cursorG0);
    }

    public final String toString() {
        return this.d;
    }

    @Override // com.squareup.sqldelight.db.SqlPreparedStatement
    public final void z(final int i, final String str) {
        this.f.put(Integer.valueOf(i), new Function1<SupportSQLiteProgram, Unit>() { // from class: com.squareup.sqldelight.android.AndroidQuery$bindString$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SupportSQLiteProgram it = (SupportSQLiteProgram) obj;
                Intrinsics.h(it, "it");
                int i2 = i;
                String str2 = str;
                if (str2 == null) {
                    it.N0(i2);
                } else {
                    it.z(i2, str2);
                }
                return Unit.f24250a;
            }
        });
    }
}
