package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteProgram;
import androidx.sqlite.db.SupportSQLiteProgram;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteProgram;", "Landroidx/sqlite/db/SupportSQLiteProgram;", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class FrameworkSQLiteProgram implements SupportSQLiteProgram {
    public final SQLiteProgram d;

    public FrameworkSQLiteProgram(SQLiteProgram delegate) {
        Intrinsics.h(delegate, "delegate");
        this.d = delegate;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void C0(int i, long j) {
        this.d.bindLong(i, j);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void E0(int i, byte[] value) {
        Intrinsics.h(value, "value");
        this.d.bindBlob(i, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void N0(int i) {
        this.d.bindNull(i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void j2(double d, int i) {
        this.d.bindDouble(i, d);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void z(int i, String value) {
        Intrinsics.h(value, "value");
        this.d.bindString(i, value);
    }
}
