package com.squareup.sqldelight.android;

import androidx.sqlite.db.SupportSQLiteStatement;
import com.squareup.sqldelight.db.SqlCursor;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/sqldelight/android/AndroidPreparedStatement;", "Lcom/squareup/sqldelight/android/AndroidStatement;", "sqldelight-android-driver_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
final class AndroidPreparedStatement implements AndroidStatement {
    public final SupportSQLiteStatement d;

    public AndroidPreparedStatement(SupportSQLiteStatement supportSQLiteStatement) {
        this.d = supportSQLiteStatement;
    }

    @Override // com.squareup.sqldelight.db.SqlPreparedStatement
    public final void b(int i, Double d) {
        SupportSQLiteStatement supportSQLiteStatement = this.d;
        if (d == null) {
            supportSQLiteStatement.N0(i);
        } else {
            supportSQLiteStatement.j2(d.doubleValue(), i);
        }
    }

    @Override // com.squareup.sqldelight.db.SqlPreparedStatement
    public final void c(int i, Long l) {
        this.d.C0(i, l.longValue());
    }

    @Override // com.squareup.sqldelight.android.AndroidStatement
    public final void close() throws IOException {
        this.d.close();
    }

    @Override // com.squareup.sqldelight.db.SqlPreparedStatement
    public final void e(int i, byte[] bArr) {
        SupportSQLiteStatement supportSQLiteStatement = this.d;
        if (bArr == null) {
            supportSQLiteStatement.N0(i);
        } else {
            supportSQLiteStatement.E0(i, bArr);
        }
    }

    @Override // com.squareup.sqldelight.android.AndroidStatement
    public final void execute() {
        this.d.execute();
    }

    @Override // com.squareup.sqldelight.android.AndroidStatement
    public final SqlCursor executeQuery() {
        throw new UnsupportedOperationException();
    }

    @Override // com.squareup.sqldelight.db.SqlPreparedStatement
    public final void z(int i, String str) {
        SupportSQLiteStatement supportSQLiteStatement = this.d;
        if (str == null) {
            supportSQLiteStatement.N0(i);
        } else {
            supportSQLiteStatement.z(i, str);
        }
    }
}
