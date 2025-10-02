package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import androidx.compose.runtime.internal.WeakReference;
import androidx.compose.runtime.snapshots.GlobalSnapshot;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SnapshotKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Function1 f1707a = null;
    public static final SnapshotThreadLocal b = new SnapshotThreadLocal();
    public static final Object c = new Object();
    public static SnapshotIdSet d;
    public static long e;
    public static final SnapshotDoubleIndexHeap f;
    public static final SnapshotWeakSet g;
    public static Object h;
    public static Object i;
    public static final GlobalSnapshot j;
    public static final AtomicInt k;

    static {
        SnapshotIdSet snapshotIdSet = SnapshotIdSet.h;
        d = snapshotIdSet;
        e = 1 + 1;
        SnapshotDoubleIndexHeap snapshotDoubleIndexHeap = new SnapshotDoubleIndexHeap();
        snapshotDoubleIndexHeap.b = new long[16];
        snapshotDoubleIndexHeap.c = new int[16];
        int[] iArr = new int[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            iArr[i2] = i3;
            i2 = i3;
        }
        snapshotDoubleIndexHeap.d = iArr;
        f = snapshotDoubleIndexHeap;
        SnapshotWeakSet snapshotWeakSet = new SnapshotWeakSet();
        snapshotWeakSet.b = new int[16];
        snapshotWeakSet.c = new WeakReference[16];
        g = snapshotWeakSet;
        EmptyList emptyList = EmptyList.d;
        h = emptyList;
        i = emptyList;
        long j2 = e;
        e = 1 + j2;
        GlobalSnapshot globalSnapshot = new GlobalSnapshot(j2, snapshotIdSet, null, GlobalSnapshot.AnonymousClass1.h);
        d = d.i(globalSnapshot.b);
        j = globalSnapshot;
        k = new AtomicInt(0);
    }

    public static final void a() {
        f(SnapshotKt$emptyLambda$1.h);
    }

    public static final Function1 b(final Function1 function1, final Function1 function12) {
        return (function1 == null || function12 == null || function1 == function12) ? function1 == null ? function12 : function1 : new Function1<Object, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$mergedWriteObserver$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                function1.invoke(obj);
                function12.invoke(obj);
                return Unit.f24250a;
            }
        };
    }

    public static final HashMap c(long j2, MutableSnapshot mutableSnapshot, SnapshotIdSet snapshotIdSet) {
        long[] jArr;
        SnapshotIdSet snapshotIdSet2;
        long[] jArr2;
        SnapshotIdSet snapshotIdSet3;
        int i2;
        StateRecord stateRecordS;
        long j3 = j2;
        MutableScatterSet mutableScatterSetX = mutableSnapshot.getH();
        if (mutableScatterSetX != null) {
            SnapshotIdSet snapshotIdSetH = mutableSnapshot.getF1703a().i(mutableSnapshot.getB()).h(mutableSnapshot.j);
            Object[] objArr = mutableScatterSetX.b;
            long[] jArr3 = mutableScatterSetX.f700a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i3 = 0;
                HashMap map = null;
                while (true) {
                    long j4 = jArr3[i3];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8;
                        int i5 = 8 - ((~(i3 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j4 & 255) < 128) {
                                StateObject stateObject = (StateObject) objArr[(i3 << 3) + i6];
                                StateRecord stateRecordT = stateObject.t();
                                jArr2 = jArr3;
                                i2 = i4;
                                StateRecord stateRecordS2 = s(stateRecordT, j3, snapshotIdSet);
                                if (stateRecordS2 == null || (stateRecordS = s(stateRecordT, j3, snapshotIdSetH)) == null || stateRecordS2.equals(stateRecordS)) {
                                    snapshotIdSet3 = snapshotIdSetH;
                                } else {
                                    snapshotIdSet3 = snapshotIdSetH;
                                    StateRecord stateRecordS3 = s(stateRecordT, mutableSnapshot.getB(), mutableSnapshot.getF1703a());
                                    if (stateRecordS3 == null) {
                                        r();
                                        throw null;
                                    }
                                    StateRecord stateRecordO = stateObject.o(stateRecordS, stateRecordS2, stateRecordS3);
                                    if (stateRecordO == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(stateRecordS2, stateRecordO);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                snapshotIdSet3 = snapshotIdSetH;
                                i2 = i4;
                            }
                            j4 >>= i2;
                            i6++;
                            j3 = j2;
                            i4 = i2;
                            jArr3 = jArr2;
                            snapshotIdSetH = snapshotIdSet3;
                        }
                        jArr = jArr3;
                        snapshotIdSet2 = snapshotIdSetH;
                        if (i5 != i4) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        snapshotIdSet2 = snapshotIdSetH;
                    }
                    if (i3 == length) {
                        return map;
                    }
                    i3++;
                    j3 = j2;
                    jArr3 = jArr;
                    snapshotIdSetH = snapshotIdSet2;
                }
            }
        }
        return null;
    }

    public static final void d(Snapshot snapshot) {
        long j2;
        if (d.g(snapshot.getB())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(snapshot.getB());
        sb.append(", disposed=");
        sb.append(snapshot.c);
        sb.append(", applied=");
        MutableSnapshot mutableSnapshot = snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null;
        sb.append(mutableSnapshot != null ? Boolean.valueOf(mutableSnapshot.m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (c) {
            SnapshotDoubleIndexHeap snapshotDoubleIndexHeap = f;
            j2 = snapshotDoubleIndexHeap.f1705a > 0 ? snapshotDoubleIndexHeap.b[0] : -1L;
        }
        sb.append(j2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final SnapshotIdSet e(SnapshotIdSet snapshotIdSet, long j2, long j3) {
        while (j2 < j3) {
            snapshotIdSet = snapshotIdSet.i(j2);
            j2++;
        }
        return snapshotIdSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0091  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(kotlin.jvm.functions.Function1 r15) {
        /*
            androidx.compose.runtime.snapshots.GlobalSnapshot r0 = androidx.compose.runtime.snapshots.SnapshotKt.j
            java.lang.Object r1 = androidx.compose.runtime.snapshots.SnapshotKt.c
            monitor-enter(r1)
            androidx.collection.MutableScatterSet r2 = r0.h     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L13
            androidx.compose.runtime.internal.AtomicInt r3 = androidx.compose.runtime.snapshots.SnapshotKt.k     // Catch: java.lang.Throwable -> L10
            r4 = 1
            r3.addAndGet(r4)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r15 = move-exception
            goto L9a
        L13:
            java.lang.Object r15 = v(r0, r15)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            r1 = 0
            if (r2 == 0) goto L47
            r3 = -1
            java.lang.Object r4 = androidx.compose.runtime.snapshots.SnapshotKt.h     // Catch: java.lang.Throwable -> L39
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5     // Catch: java.lang.Throwable -> L39
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L39
            r6 = r1
        L26:
            if (r6 >= r5) goto L3b
            java.lang.Object r7 = r4.get(r6)     // Catch: java.lang.Throwable -> L39
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7     // Catch: java.lang.Throwable -> L39
            androidx.compose.runtime.collection.ScatterSetWrapper r8 = new androidx.compose.runtime.collection.ScatterSetWrapper     // Catch: java.lang.Throwable -> L39
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L39
            r7.invoke(r8, r0)     // Catch: java.lang.Throwable -> L39
            int r6 = r6 + 1
            goto L26
        L39:
            r15 = move-exception
            goto L41
        L3b:
            androidx.compose.runtime.internal.AtomicInt r0 = androidx.compose.runtime.snapshots.SnapshotKt.k
            r0.addAndGet(r3)
            goto L47
        L41:
            androidx.compose.runtime.internal.AtomicInt r0 = androidx.compose.runtime.snapshots.SnapshotKt.k
            r0.addAndGet(r3)
            throw r15
        L47:
            java.lang.Object r0 = androidx.compose.runtime.snapshots.SnapshotKt.c
            monitor-enter(r0)
            g()     // Catch: java.lang.Throwable -> L89
            if (r2 == 0) goto L96
            java.lang.Object[] r3 = r2.b     // Catch: java.lang.Throwable -> L89
            long[] r2 = r2.f700a     // Catch: java.lang.Throwable -> L89
            int r4 = r2.length     // Catch: java.lang.Throwable -> L89
            int r4 = r4 + (-2)
            if (r4 < 0) goto L96
            r5 = r1
        L59:
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L89
            long r8 = ~r6     // Catch: java.lang.Throwable -> L89
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L91
            int r8 = r5 - r4
            int r8 = ~r8     // Catch: java.lang.Throwable -> L89
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r1
        L73:
            if (r10 >= r8) goto L8f
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.32E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L8b
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r3[r11]     // Catch: java.lang.Throwable -> L89
            androidx.compose.runtime.snapshots.StateObject r11 = (androidx.compose.runtime.snapshots.StateObject) r11     // Catch: java.lang.Throwable -> L89
            q(r11)     // Catch: java.lang.Throwable -> L89
            goto L8b
        L89:
            r15 = move-exception
            goto L98
        L8b:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L73
        L8f:
            if (r8 != r9) goto L96
        L91:
            if (r5 == r4) goto L96
            int r5 = r5 + 1
            goto L59
        L96:
            monitor-exit(r0)
            return r15
        L98:
            monitor-exit(r0)
            throw r15
        L9a:
            monitor-exit(r1)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotKt.f(kotlin.jvm.functions.Function1):java.lang.Object");
    }

    public static final void g() {
        SnapshotWeakSet snapshotWeakSet = g;
        int i2 = snapshotWeakSet.f1714a;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            WeakReference weakReference = snapshotWeakSet.c[i3];
            Object obj = weakReference != null ? weakReference.get() : null;
            if (obj != null && p((StateObject) obj)) {
                if (i4 != i3) {
                    snapshotWeakSet.c[i4] = weakReference;
                    int[] iArr = snapshotWeakSet.b;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            snapshotWeakSet.c[i5] = null;
            snapshotWeakSet.b[i5] = 0;
        }
        if (i4 != i2) {
            snapshotWeakSet.f1714a = i4;
        }
    }

    public static final Snapshot h(Snapshot snapshot, Function1 function1, boolean z) {
        boolean z2 = snapshot instanceof MutableSnapshot;
        if (z2 || snapshot == null) {
            return new TransparentObserverMutableSnapshot(z2 ? (MutableSnapshot) snapshot : null, function1, null, false, z);
        }
        return new TransparentObserverSnapshot(snapshot, function1, z);
    }

    public static final StateRecord i(StateRecord stateRecord) {
        StateRecord stateRecordS;
        Snapshot snapshotK = k();
        StateRecord stateRecordS2 = s(stateRecord, snapshotK.getB(), snapshotK.getF1703a());
        if (stateRecordS2 != null) {
            return stateRecordS2;
        }
        synchronized (c) {
            Snapshot snapshotK2 = k();
            stateRecordS = s(stateRecord, snapshotK2.getB(), snapshotK2.getF1703a());
        }
        if (stateRecordS != null) {
            return stateRecordS;
        }
        r();
        throw null;
    }

    public static final StateRecord j(StateRecord stateRecord, Snapshot snapshot) {
        StateRecord stateRecordS;
        StateRecord stateRecordS2 = s(stateRecord, snapshot.getB(), snapshot.getF1703a());
        if (stateRecordS2 != null) {
            return stateRecordS2;
        }
        synchronized (c) {
            stateRecordS = s(stateRecord, snapshot.getB(), snapshot.getF1703a());
        }
        if (stateRecordS != null) {
            return stateRecordS;
        }
        r();
        throw null;
    }

    public static final Snapshot k() {
        Snapshot snapshot = (Snapshot) b.a();
        return snapshot == null ? j : snapshot;
    }

    public static final Function1 l(final Function1 function1, final Function1 function12, boolean z) {
        if (!z) {
            function12 = null;
        }
        return (function1 == null || function12 == null || function1 == function12) ? function1 == null ? function12 : function1 : new Function1<Object, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$mergedReadObserver$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                function1.invoke(obj);
                function12.invoke(obj);
                return Unit.f24250a;
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        r3 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.runtime.snapshots.StateRecord m(androidx.compose.runtime.snapshots.StateRecord r10, androidx.compose.runtime.snapshots.StateObject r11) {
        /*
            androidx.compose.runtime.snapshots.StateRecord r0 = r11.t()
            long r1 = androidx.compose.runtime.snapshots.SnapshotKt.e
            androidx.compose.runtime.snapshots.SnapshotDoubleIndexHeap r3 = androidx.compose.runtime.snapshots.SnapshotKt.f
            int r4 = r3.f1705a
            if (r4 <= 0) goto L11
            long[] r1 = r3.b
            r2 = 0
            r1 = r1[r2]
        L11:
            r3 = 1
            long r1 = r1 - r3
            r3 = 0
            r4 = r3
        L16:
            if (r0 == 0) goto L44
            long r5 = r0.f1715a
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L21
            goto L3d
        L21:
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L41
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 > 0) goto L41
            androidx.compose.runtime.snapshots.SnapshotIdSet r7 = androidx.compose.runtime.snapshots.SnapshotIdSet.h
            boolean r5 = r7.g(r5)
            if (r5 != 0) goto L41
            if (r4 != 0) goto L35
            r4 = r0
            goto L41
        L35:
            long r1 = r0.f1715a
            long r5 = r4.f1715a
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 >= 0) goto L3f
        L3d:
            r3 = r0
            goto L44
        L3f:
            r3 = r4
            goto L44
        L41:
            androidx.compose.runtime.snapshots.StateRecord r0 = r0.b
            goto L16
        L44:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 == 0) goto L4e
            r3.f1715a = r0
            return r3
        L4e:
            androidx.compose.runtime.snapshots.StateRecord r10 = r10.c(r0)
            androidx.compose.runtime.snapshots.StateRecord r0 = r11.t()
            r10.b = r0
            r11.b(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotKt.m(androidx.compose.runtime.snapshots.StateRecord, androidx.compose.runtime.snapshots.StateObject):androidx.compose.runtime.snapshots.StateRecord");
    }

    public static final void n(Snapshot snapshot, StateObject stateObject) {
        snapshot.t(snapshot.getG() + 1);
        Function1 function1I = snapshot.getS();
        if (function1I != null) {
            function1I.invoke(stateObject);
        }
    }

    public static final StateRecord o(StateRecord stateRecord, StateObjectImpl stateObjectImpl, Snapshot snapshot, StateRecord stateRecord2) {
        StateRecord stateRecordM;
        if (snapshot.f()) {
            snapshot.n(stateObjectImpl);
        }
        long b2 = snapshot.getB();
        if (stateRecord2.f1715a == b2) {
            return stateRecord2;
        }
        synchronized (c) {
            stateRecordM = m(stateRecord, stateObjectImpl);
        }
        stateRecordM.f1715a = b2;
        if (stateRecord2.f1715a != 1) {
            snapshot.n(stateObjectImpl);
        }
        return stateRecordM;
    }

    public static final boolean p(StateObject stateObject) {
        StateRecord stateRecord;
        long j2 = e;
        SnapshotDoubleIndexHeap snapshotDoubleIndexHeap = f;
        if (snapshotDoubleIndexHeap.f1705a > 0) {
            j2 = snapshotDoubleIndexHeap.b[0];
        }
        StateRecord stateRecord2 = null;
        StateRecord stateRecordT = null;
        int i2 = 0;
        for (StateRecord stateRecordT2 = stateObject.t(); stateRecordT2 != null; stateRecordT2 = stateRecordT2.b) {
            long j3 = stateRecordT2.f1715a;
            if (j3 != 0) {
                if (j3 >= j2) {
                    i2++;
                } else if (stateRecord2 == null) {
                    i2++;
                    stateRecord2 = stateRecordT2;
                } else {
                    if (j3 < stateRecord2.f1715a) {
                        stateRecord = stateRecord2;
                        stateRecord2 = stateRecordT2;
                    } else {
                        stateRecord = stateRecordT2;
                    }
                    if (stateRecordT == null) {
                        stateRecordT = stateObject.t();
                        StateRecord stateRecord3 = stateRecordT;
                        while (true) {
                            if (stateRecordT == null) {
                                stateRecordT = stateRecord3;
                                break;
                            }
                            long j4 = stateRecordT.f1715a;
                            if (j4 >= j2) {
                                break;
                            }
                            if (stateRecord3.f1715a < j4) {
                                stateRecord3 = stateRecordT;
                            }
                            stateRecordT = stateRecordT.b;
                        }
                    }
                    stateRecord2.f1715a = 0L;
                    stateRecord2.a(stateRecordT);
                    stateRecord2 = stateRecord;
                }
            }
        }
        return i2 > 1;
    }

    public static final void q(StateObject stateObject) {
        if (p(stateObject)) {
            SnapshotWeakSet snapshotWeakSet = g;
            int i2 = snapshotWeakSet.f1714a;
            int iIdentityHashCode = System.identityHashCode(stateObject);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = snapshotWeakSet.f1714a - 1;
                int i5 = 0;
                while (true) {
                    if (i5 > i4) {
                        i3 = -(i5 + 1);
                        break;
                    }
                    int i6 = (i5 + i4) >>> 1;
                    int i7 = snapshotWeakSet.b[i6];
                    if (i7 < iIdentityHashCode) {
                        i5 = i6 + 1;
                    } else if (i7 > iIdentityHashCode) {
                        i4 = i6 - 1;
                    } else {
                        WeakReference weakReference = snapshotWeakSet.c[i6];
                        if (stateObject == (weakReference != null ? weakReference.get() : null)) {
                            i3 = i6;
                        } else {
                            for (int i8 = i6 - 1; -1 < i8 && snapshotWeakSet.b[i8] == iIdentityHashCode; i8--) {
                                WeakReference weakReference2 = snapshotWeakSet.c[i8];
                                if ((weakReference2 != null ? weakReference2.get() : null) == stateObject) {
                                    i3 = i8;
                                    break;
                                }
                            }
                            i6++;
                            int i9 = snapshotWeakSet.f1714a;
                            while (true) {
                                if (i6 >= i9) {
                                    i3 = -(snapshotWeakSet.f1714a + 1);
                                    break;
                                } else {
                                    if (snapshotWeakSet.b[i6] != iIdentityHashCode) {
                                        i3 = -(i6 + 1);
                                        break;
                                    }
                                    WeakReference weakReference3 = snapshotWeakSet.c[i6];
                                    if ((weakReference3 != null ? weakReference3.get() : null) == stateObject) {
                                        break;
                                    } else {
                                        i6++;
                                    }
                                }
                            }
                            i3 = i6;
                        }
                    }
                }
                if (i3 >= 0) {
                    return;
                }
            }
            int i10 = -(i3 + 1);
            WeakReference[] weakReferenceArr = snapshotWeakSet.c;
            int length = weakReferenceArr.length;
            if (i2 == length) {
                int i11 = length * 2;
                WeakReference[] weakReferenceArr2 = new WeakReference[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                System.arraycopy(weakReferenceArr, i10, weakReferenceArr2, i12, i2 - i10);
                System.arraycopy(snapshotWeakSet.c, 0, weakReferenceArr2, 0, i10);
                ArraysKt.q(i12, i10, i2, snapshotWeakSet.b, iArr);
                ArraysKt.u(0, i10, 6, snapshotWeakSet.b, iArr);
                snapshotWeakSet.c = weakReferenceArr2;
                snapshotWeakSet.b = iArr;
            } else {
                int i13 = i10 + 1;
                System.arraycopy(weakReferenceArr, i10, weakReferenceArr, i13, i2 - i10);
                int[] iArr2 = snapshotWeakSet.b;
                ArraysKt.q(i13, i10, i2, iArr2, iArr2);
            }
            snapshotWeakSet.c[i10] = new WeakReference(stateObject);
            snapshotWeakSet.b[i10] = iIdentityHashCode;
            snapshotWeakSet.f1714a++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final StateRecord s(StateRecord stateRecord, long j2, SnapshotIdSet snapshotIdSet) {
        StateRecord stateRecord2 = null;
        while (stateRecord != null) {
            long j3 = stateRecord.f1715a;
            if (j3 != 0 && j3 <= j2 && !snapshotIdSet.g(j3) && (stateRecord2 == null || stateRecord2.f1715a < stateRecord.f1715a)) {
                stateRecord2 = stateRecord;
            }
            stateRecord = stateRecord.b;
        }
        if (stateRecord2 != null) {
            return stateRecord2;
        }
        return null;
    }

    public static final StateRecord t(StateRecord stateRecord, StateObject stateObject) {
        StateRecord stateRecordS;
        Snapshot snapshotK = k();
        Function1 function1E = snapshotK.getG();
        if (function1E != null) {
            function1E.invoke(stateObject);
        }
        StateRecord stateRecordS2 = s(stateRecord, snapshotK.getB(), snapshotK.getF1703a());
        if (stateRecordS2 != null) {
            return stateRecordS2;
        }
        synchronized (c) {
            Snapshot snapshotK2 = k();
            StateRecord stateRecordT = stateObject.t();
            Intrinsics.f(stateRecordT, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            stateRecordS = s(stateRecordT, snapshotK2.getB(), snapshotK2.getF1703a());
            if (stateRecordS == null) {
                r();
                throw null;
            }
        }
        return stateRecordS;
    }

    public static final void u(int i2) {
        SnapshotDoubleIndexHeap snapshotDoubleIndexHeap = f;
        int i3 = snapshotDoubleIndexHeap.d[i2];
        snapshotDoubleIndexHeap.b(i3, snapshotDoubleIndexHeap.f1705a - 1);
        snapshotDoubleIndexHeap.f1705a--;
        long[] jArr = snapshotDoubleIndexHeap.b;
        long j2 = jArr[i3];
        int i4 = i3;
        while (i4 > 0) {
            int i5 = ((i4 + 1) >> 1) - 1;
            if (jArr[i5] <= j2) {
                break;
            }
            snapshotDoubleIndexHeap.b(i5, i4);
            i4 = i5;
        }
        long[] jArr2 = snapshotDoubleIndexHeap.b;
        int i6 = snapshotDoubleIndexHeap.f1705a >> 1;
        while (i3 < i6) {
            int i7 = (i3 + 1) << 1;
            int i8 = i7 - 1;
            if (i7 < snapshotDoubleIndexHeap.f1705a) {
                long j3 = jArr2[i7];
                if (j3 < jArr2[i8]) {
                    if (j3 >= jArr2[i3]) {
                        break;
                    }
                    snapshotDoubleIndexHeap.b(i7, i3);
                    i3 = i7;
                }
            }
            if (jArr2[i8] >= jArr2[i3]) {
                break;
            }
            snapshotDoubleIndexHeap.b(i8, i3);
            i3 = i8;
        }
        snapshotDoubleIndexHeap.d[i2] = snapshotDoubleIndexHeap.e;
        snapshotDoubleIndexHeap.e = i2;
    }

    public static final Object v(GlobalSnapshot globalSnapshot, Function1 function1) {
        long j2 = globalSnapshot.b;
        Object objInvoke = function1.invoke(d.d(j2));
        long j3 = e;
        e = 1 + j3;
        SnapshotIdSet snapshotIdSetD = d.d(j2);
        d = snapshotIdSetD;
        globalSnapshot.b = j3;
        globalSnapshot.f1703a = snapshotIdSetD;
        globalSnapshot.g = 0;
        globalSnapshot.h = null;
        globalSnapshot.o();
        d = d.i(j3);
        return objInvoke;
    }

    public static final StateRecord w(StateRecord stateRecord, StateObject stateObject, Snapshot snapshot) {
        StateRecord stateRecordS;
        if (snapshot.f()) {
            snapshot.n(stateObject);
        }
        long b2 = snapshot.getB();
        StateRecord stateRecordS2 = s(stateRecord, b2, snapshot.getF1703a());
        if (stateRecordS2 == null) {
            r();
            throw null;
        }
        if (stateRecordS2.f1715a == snapshot.getB()) {
            return stateRecordS2;
        }
        synchronized (c) {
            stateRecordS = s(stateObject.t(), b2, snapshot.getF1703a());
            if (stateRecordS == null) {
                r();
                throw null;
            }
            if (stateRecordS.f1715a != b2) {
                StateRecord stateRecordM = m(stateRecordS, stateObject);
                stateRecordM.a(stateRecordS);
                stateRecordM.f1715a = snapshot.getB();
                stateRecordS = stateRecordM;
            }
        }
        if (stateRecordS2.f1715a != 1) {
            snapshot.n(stateObject);
        }
        return stateRecordS;
    }
}
