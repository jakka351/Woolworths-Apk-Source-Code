package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/room/RoomSQLiteQuery;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "Landroidx/sqlite/db/SupportSQLiteProgram;", "Binding", "Companion", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* loaded from: classes.dex */
public final class RoomSQLiteQuery implements SupportSQLiteQuery, SupportSQLiteProgram {
    public static final TreeMap l = new TreeMap();
    public final int d;
    public volatile String e;
    public final long[] f;
    public final double[] g;
    public final String[] h;
    public final byte[][] i;
    public final int[] j;
    public int k;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/room/RoomSQLiteQuery$Binding;", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention
    /* loaded from: classes2.dex */
    public @interface Binding {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Landroidx/room/RoomSQLiteQuery$Companion;", "", "", "BLOB", "I", "DOUBLE", "LONG", "NULL", "STRING", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static RoomSQLiteQuery a(int i, String query) {
            Intrinsics.h(query, "query");
            TreeMap treeMap = RoomSQLiteQuery.l;
            synchronized (treeMap) {
                Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
                if (entryCeilingEntry == null) {
                    RoomSQLiteQuery roomSQLiteQuery = new RoomSQLiteQuery(i);
                    roomSQLiteQuery.e = query;
                    roomSQLiteQuery.k = i;
                    return roomSQLiteQuery;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                RoomSQLiteQuery roomSQLiteQuery2 = (RoomSQLiteQuery) entryCeilingEntry.getValue();
                roomSQLiteQuery2.getClass();
                roomSQLiteQuery2.e = query;
                roomSQLiteQuery2.k = i;
                return roomSQLiteQuery2;
            }
        }
    }

    public RoomSQLiteQuery(int i) {
        this.d = i;
        int i2 = i + 1;
        this.j = new int[i2];
        this.f = new long[i2];
        this.g = new double[i2];
        this.h = new String[i2];
        this.i = new byte[i2][];
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void C0(int i, long j) {
        this.j[i] = 2;
        this.f[i] = j;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void E0(int i, byte[] value) {
        Intrinsics.h(value, "value");
        this.j[i] = 5;
        this.i[i] = value;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void N0(int i) {
        this.j[i] = 1;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    /* renamed from: a */
    public final String getD() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public final void d(SupportSQLiteProgram supportSQLiteProgram) {
        int i = this.k;
        if (1 > i) {
            return;
        }
        int i2 = 1;
        while (true) {
            int i3 = this.j[i2];
            if (i3 == 1) {
                supportSQLiteProgram.N0(i2);
            } else if (i3 == 2) {
                supportSQLiteProgram.C0(i2, this.f[i2]);
            } else if (i3 == 3) {
                supportSQLiteProgram.j2(this.g[i2], i2);
            } else if (i3 == 4) {
                String str = this.h[i2];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                supportSQLiteProgram.z(i2, str);
            } else if (i3 == 5) {
                byte[] bArr = this.i[i2];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                supportSQLiteProgram.E0(i2, bArr);
            }
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void j2(double d, int i) {
        this.j[i] = 3;
        this.g[i] = d;
    }

    public final void release() {
        TreeMap treeMap = l;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.d), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                Intrinsics.g(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void z(int i, String value) {
        Intrinsics.h(value, "value");
        this.j[i] = 4;
        this.h[i] = value;
    }
}
