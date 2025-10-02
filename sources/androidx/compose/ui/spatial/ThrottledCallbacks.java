package androidx.compose.ui.spatial;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.DelegatableNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/spatial/ThrottledCallbacks;", "", "Entry", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ThrottledCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final MutableIntObjectMap f2028a;
    public Entry b;
    public long c;
    public long d;
    public long e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class Entry implements DelegatableNode.RegistrationHandle {

        /* renamed from: a, reason: collision with root package name */
        public final int f2029a;
        public final long b;
        public final DelegatableNode c;
        public final Function1 d;
        public Entry e;
        public long f;
        public long g;
        public long h = 0;
        public long i = -1;

        public Entry(int i, long j, DelegatableNode delegatableNode, Function1 function1) {
            this.f2029a = i;
            this.b = j;
            this.c = delegatableNode;
            this.d = function1;
        }

        public final void a() {
            ThrottledCallbacks throttledCallbacks = ThrottledCallbacks.this;
            MutableIntObjectMap mutableIntObjectMap = throttledCallbacks.f2028a;
            int i = this.f2029a;
            Entry entry = (Entry) mutableIntObjectMap.g(i);
            if (entry != null) {
                if (entry.equals(this)) {
                    Entry entry2 = this.e;
                    this.e = null;
                    if (entry2 != null) {
                        int iD = mutableIntObjectMap.d(i);
                        Object[] objArr = mutableIntObjectMap.c;
                        Object obj = objArr[iD];
                        mutableIntObjectMap.b[iD] = i;
                        objArr[iD] = entry2;
                        return;
                    }
                    return;
                }
                int iD2 = mutableIntObjectMap.d(i);
                Object[] objArr2 = mutableIntObjectMap.c;
                Object obj2 = objArr2[iD2];
                mutableIntObjectMap.b[iD2] = i;
                objArr2[iD2] = entry;
                while (true) {
                    Entry entry3 = entry.e;
                    if (entry3 == null) {
                        break;
                    }
                    if (entry3 == this) {
                        entry.e = this.e;
                        this.e = null;
                        return;
                    }
                    entry = entry3;
                }
            }
            Entry entry4 = throttledCallbacks.b;
            if (entry4 == this) {
                throttledCallbacks.b = entry4.e;
                this.e = null;
                return;
            }
            Entry entry5 = entry4 != null ? entry4.e : null;
            while (true) {
                Entry entry6 = entry4;
                entry4 = entry5;
                if (entry4 == null) {
                    return;
                }
                if (entry4 == this) {
                    if (entry6 != null) {
                        entry6.e = entry4.e;
                    }
                    this.e = null;
                    return;
                }
                entry5 = entry4.e;
            }
        }
    }

    public ThrottledCallbacks() {
        MutableIntObjectMap mutableIntObjectMap = IntObjectMapKt.f679a;
        this.f2028a = new MutableIntObjectMap();
        this.c = -1L;
        this.d = 0L;
        this.e = 0L;
    }

    public static long a(Entry entry, long j, long j2) {
        long j3 = entry.b;
        if (j3 > 0) {
            long j4 = entry.i;
            if (j4 > 0) {
                if (j - j4 <= j3) {
                    return Math.min(j2, j4 + j3);
                }
                entry.h = j;
                entry.i = -1L;
                RelativeLayoutBounds relativeLayoutBoundsA = ThrottledCallbacksKt.a(entry.f, entry.g, entry.c);
                if (relativeLayoutBoundsA != null) {
                    entry.d.invoke(relativeLayoutBoundsA);
                    return j2;
                }
            }
        }
        return j2;
    }

    public final void b(Entry entry, long j) {
        long j2 = entry.h;
        long j3 = entry.b;
        boolean z = j - j2 > 0;
        boolean z2 = j3 == 0;
        entry.i = j;
        if (z && z2) {
            entry.h = j;
            RelativeLayoutBounds relativeLayoutBoundsA = ThrottledCallbacksKt.a(entry.f, entry.g, entry.c);
            if (relativeLayoutBoundsA != null) {
                entry.d.invoke(relativeLayoutBoundsA);
            }
        }
        if (z2) {
            return;
        }
        long j4 = this.c;
        long j5 = j + j3;
        if (j4 <= 0 || j5 >= j4) {
            return;
        }
        this.c = j4;
    }
}
