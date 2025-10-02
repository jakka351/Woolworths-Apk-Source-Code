package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "Companion", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class MutableSnapshot extends Snapshot {
    public static final int[] n = new int[0];
    public final Function1 e;
    public final Function1 f;
    public int g;
    public MutableScatterSet h;
    public ArrayList i;
    public SnapshotIdSet j;
    public int[] k;
    public int l;
    public boolean m;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/snapshots/MutableSnapshot$Companion;", "", "", "EmptyIntArray", "[I", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public MutableSnapshot(long j, SnapshotIdSet snapshotIdSet, Function1 function1, Function1 function12) {
        super(j, snapshotIdSet);
        this.e = function1;
        this.f = function12;
        this.j = SnapshotIdSet.h;
        this.k = n;
        this.l = 1;
    }

    public final void A(long j) {
        synchronized (SnapshotKt.c) {
            this.j = this.j.i(j);
        }
    }

    public void B(MutableScatterSet mutableScatterSet) {
        this.h = mutableScatterSet;
    }

    public MutableSnapshot C(Function1 function1, Function1 function12) throws Throwable {
        long j;
        SnapshotIdSet f1703a;
        if (this.c) {
            PreconditionsKt.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            PreconditionsKt.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(getB());
        Object obj = SnapshotKt.c;
        synchronized (obj) {
            try {
                j = SnapshotKt.e;
                SnapshotKt.e = j + 1;
                SnapshotKt.d = SnapshotKt.d.i(j);
                f1703a = getF1703a();
                r(f1703a.i(j));
            } catch (Throwable th) {
                th = th;
            }
            try {
                NestedMutableSnapshot nestedMutableSnapshot = new NestedMutableSnapshot(j, SnapshotKt.e(f1703a, getB() + 1, j), SnapshotKt.l(function1, e(), true), SnapshotKt.b(function12, getS()), this);
                if (this.m || this.c) {
                    return nestedMutableSnapshot;
                }
                long b = getB();
                synchronized (obj) {
                    long j2 = SnapshotKt.e;
                    SnapshotKt.e = j2 + 1;
                    s(j2);
                    SnapshotKt.d = SnapshotKt.d.i(getB());
                }
                r(SnapshotKt.e(getF1703a(), b + 1, getB()));
                return nestedMutableSnapshot;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void b() {
        SnapshotKt.d = SnapshotKt.d.d(getB()).b(this.j);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void c() {
        if (this.c) {
            return;
        }
        super.c();
        l();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean f() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: h, reason: from getter */
    public int getG() {
        return this.g;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: i, reason: from getter */
    public Function1 getS() {
        return this.f;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void k() {
        this.l++;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    @Override // androidx.compose.runtime.snapshots.Snapshot
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l() {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.l
            if (r1 <= 0) goto L7
            goto Lc
        L7:
            java.lang.String r1 = "no pending nested snapshots"
            androidx.compose.runtime.PreconditionsKt.a(r1)
        Lc:
            int r1 = r0.l
            int r1 = r1 + (-1)
            r0.l = r1
            if (r1 != 0) goto L94
            boolean r1 = r0.m
            if (r1 != 0) goto L94
            androidx.collection.MutableScatterSet r1 = r0.getH()
            if (r1 == 0) goto L91
            boolean r2 = r0.m
            if (r2 == 0) goto L27
            java.lang.String r2 = "Unsupported operation on a snapshot that has been applied"
            androidx.compose.runtime.PreconditionsKt.b(r2)
        L27:
            r2 = 0
            r0.B(r2)
            long r2 = r0.getB()
            java.lang.Object[] r4 = r1.b
            long[] r1 = r1.f700a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L91
            r7 = 0
        L39:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L8c
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L53:
            if (r12 >= r10) goto L8a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L86
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            androidx.compose.runtime.snapshots.StateObject r13 = (androidx.compose.runtime.snapshots.StateObject) r13
            androidx.compose.runtime.snapshots.StateRecord r13 = r13.t()
        L69:
            if (r13 == 0) goto L86
            long r14 = r13.f1715a
            int r16 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r16 == 0) goto L7d
            androidx.compose.runtime.snapshots.SnapshotIdSet r6 = r0.j
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            boolean r6 = kotlin.collections.CollectionsKt.t(r6, r14)
            if (r6 == 0) goto L83
        L7d:
            kotlin.jvm.functions.Function1 r6 = androidx.compose.runtime.snapshots.SnapshotKt.f1707a
            r14 = 0
            r13.f1715a = r14
        L83:
            androidx.compose.runtime.snapshots.StateRecord r13 = r13.b
            goto L69
        L86:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L53
        L8a:
            if (r10 != r11) goto L91
        L8c:
            if (r7 == r5) goto L91
            int r7 = r7 + 1
            goto L39
        L91:
            r0.a()
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.MutableSnapshot.l():void");
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void m() {
        if (this.m || this.c) {
            return;
        }
        v();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void n(StateObject stateObject) {
        MutableScatterSet h = getH();
        if (h == null) {
            int i = ScatterSetKt.f701a;
            h = new MutableScatterSet();
            B(h);
        }
        h.e(stateObject);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void p() {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            SnapshotKt.u(this.k[i]);
        }
        o();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void t(int i) {
        this.g = i;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot u(Function1 function1) throws Throwable {
        long j;
        if (this.c) {
            PreconditionsKt.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            PreconditionsKt.b("Unsupported operation on a disposed or applied snapshot");
        }
        long b = getB();
        A(getB());
        Object obj = SnapshotKt.c;
        synchronized (obj) {
            try {
                j = SnapshotKt.e;
                SnapshotKt.e = j + 1;
                SnapshotKt.d = SnapshotKt.d.i(j);
            } catch (Throwable th) {
                th = th;
            }
            try {
                NestedReadonlySnapshot nestedReadonlySnapshot = new NestedReadonlySnapshot(j, SnapshotKt.e(getF1703a(), b + 1, j), SnapshotKt.l(function1, e(), true), this);
                if (this.m || this.c) {
                    return nestedReadonlySnapshot;
                }
                long b2 = getB();
                synchronized (obj) {
                    long j2 = SnapshotKt.e;
                    SnapshotKt.e = j2 + 1;
                    s(j2);
                    SnapshotKt.d = SnapshotKt.d.i(getB());
                }
                r(SnapshotKt.e(getF1703a(), b2 + 1, getB()));
                return nestedReadonlySnapshot;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public final void v() {
        A(getB());
        if (this.m || this.c) {
            return;
        }
        long b = getB();
        synchronized (SnapshotKt.c) {
            long j = SnapshotKt.e;
            SnapshotKt.e = j + 1;
            s(j);
            SnapshotKt.d = SnapshotKt.d.i(getB());
        }
        r(SnapshotKt.e(getF1703a(), b + 1, getB()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.compose.runtime.snapshots.SnapshotApplyResult w() {
        /*
            Method dump skipped, instructions count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.MutableSnapshot.w():androidx.compose.runtime.snapshots.SnapshotApplyResult");
    }

    /* renamed from: x, reason: from getter */
    public MutableScatterSet getH() {
        return this.h;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: y, reason: from getter and merged with bridge method [inline-methods] */
    public Function1 getE() {
        return this.e;
    }

    public final SnapshotApplyResult z(long j, MutableScatterSet mutableScatterSet, HashMap map, SnapshotIdSet snapshotIdSet) {
        ArrayList arrayList;
        ArrayList arrayListC0;
        ArrayList arrayList2;
        SnapshotIdSet snapshotIdSet2;
        Object[] objArr;
        long[] jArr;
        SnapshotIdSet snapshotIdSet3;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j2;
        ArrayList arrayList3;
        StateRecord stateRecordO;
        SnapshotIdSet snapshotIdSetH = getF1703a().i(getB()).h(this.j);
        Object[] objArr3 = mutableScatterSet.b;
        long[] jArr3 = mutableScatterSet.f700a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            arrayList2 = null;
            arrayListC0 = null;
            while (true) {
                long j3 = jArr3[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            StateObject stateObject = (StateObject) objArr3[(i2 << 3) + i4];
                            jArr2 = jArr3;
                            StateRecord stateRecordT = stateObject.t();
                            i = i4;
                            ArrayList arrayList4 = arrayList2;
                            StateRecord stateRecordS = SnapshotKt.s(stateRecordT, j, snapshotIdSet);
                            if (stateRecordS == null) {
                                snapshotIdSet3 = snapshotIdSetH;
                                arrayList3 = arrayListC0;
                                j2 = j3;
                            } else {
                                arrayList3 = arrayListC0;
                                j2 = j3;
                                StateRecord stateRecordS2 = SnapshotKt.s(stateRecordT, getB(), snapshotIdSetH);
                                if (stateRecordS2 == null) {
                                    snapshotIdSet3 = snapshotIdSetH;
                                } else {
                                    snapshotIdSet3 = snapshotIdSetH;
                                    if (stateRecordS2.f1715a != 1 && !stateRecordS.equals(stateRecordS2)) {
                                        StateRecord stateRecordS3 = SnapshotKt.s(stateRecordT, getB(), getF1703a());
                                        if (stateRecordS3 == null) {
                                            SnapshotKt.r();
                                            throw null;
                                        }
                                        if (map == null || (stateRecordO = (StateRecord) map.get(stateRecordS)) == null) {
                                            stateRecordO = stateObject.o(stateRecordS2, stateRecordS, stateRecordS3);
                                        }
                                        if (stateRecordO == null) {
                                            return new SnapshotApplyResult.Failure();
                                        }
                                        if (!stateRecordO.equals(stateRecordS3)) {
                                            if (stateRecordO.equals(stateRecordS)) {
                                                ArrayList arrayList5 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList5.add(new Pair(stateObject, stateRecordS.c(getB())));
                                                arrayListC0 = arrayList3 == null ? new ArrayList() : arrayList3;
                                                arrayListC0.add(stateObject);
                                                arrayList2 = arrayList5;
                                            } else {
                                                arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList2.add(!stateRecordO.equals(stateRecordS2) ? new Pair(stateObject, stateRecordO) : new Pair(stateObject, stateRecordS2.c(getB())));
                                            }
                                        }
                                        arrayListC0 = arrayList3;
                                    }
                                }
                            }
                            arrayList2 = arrayList4;
                            arrayListC0 = arrayList3;
                        } else {
                            snapshotIdSet3 = snapshotIdSetH;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i4;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i4 = i + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        snapshotIdSetH = snapshotIdSet3;
                    }
                    snapshotIdSet2 = snapshotIdSetH;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i3 != 8) {
                        break;
                    }
                } else {
                    snapshotIdSet2 = snapshotIdSetH;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i2 == length) {
                    arrayList = arrayList2;
                    break;
                }
                i2++;
                jArr3 = jArr;
                objArr3 = objArr;
                snapshotIdSetH = snapshotIdSet2;
            }
        } else {
            arrayList = null;
            arrayListC0 = null;
        }
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            int size = arrayList2.size();
            for (int i5 = 0; i5 < size; i5++) {
                Pair pair = (Pair) arrayList2.get(i5);
                StateObject stateObject2 = (StateObject) pair.d;
                StateRecord stateRecord = (StateRecord) pair.e;
                stateRecord.f1715a = j;
                synchronized (SnapshotKt.c) {
                    stateRecord.b = stateObject2.t();
                    stateObject2.b(stateRecord);
                }
            }
        }
        if (arrayListC0 != null) {
            int size2 = arrayListC0.size();
            for (int i6 = 0; i6 < size2; i6++) {
                mutableScatterSet.n((StateObject) arrayListC0.get(i6));
            }
            ArrayList arrayList6 = this.i;
            if (arrayList6 != null) {
                arrayListC0 = CollectionsKt.c0(arrayListC0, arrayList6);
            }
            this.i = arrayListC0;
        }
        return SnapshotApplyResult.Success.f1704a;
    }
}
