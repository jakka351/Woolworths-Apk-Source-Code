package androidx.room;

import androidx.sqlite.db.SupportSQLiteProgram;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/QueryInterceptorProgram;", "Landroidx/sqlite/db/SupportSQLiteProgram;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class QueryInterceptorProgram implements SupportSQLiteProgram {
    public final ArrayList d = new ArrayList();

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void C0(int i, long j) {
        a(i, Long.valueOf(j));
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void E0(int i, byte[] value) {
        Intrinsics.h(value, "value");
        a(i, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void N0(int i) {
        a(i, null);
    }

    public final void a(int i, Object obj) {
        int size;
        int i2 = i - 1;
        ArrayList arrayList = this.d;
        if (i2 >= arrayList.size() && (size = arrayList.size()) <= i2) {
            while (true) {
                arrayList.add(null);
                if (size == i2) {
                    break;
                } else {
                    size++;
                }
            }
        }
        arrayList.set(i2, obj);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void j2(double d, int i) {
        a(i, Double.valueOf(d));
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void z(int i, String value) {
        Intrinsics.h(value, "value");
        a(i, value);
    }
}
