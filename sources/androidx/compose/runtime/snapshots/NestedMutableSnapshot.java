package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/snapshots/NestedMutableSnapshot;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class NestedMutableSnapshot extends MutableSnapshot {
    public final MutableSnapshot o;
    public boolean p;

    public NestedMutableSnapshot(long j, SnapshotIdSet snapshotIdSet, Function1 function1, Function1 function12, MutableSnapshot mutableSnapshot) {
        super(j, snapshotIdSet, function1, function12);
        this.o = mutableSnapshot;
        mutableSnapshot.k();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final void c() {
        if (this.c) {
            return;
        }
        super.c();
        if (this.p) {
            return;
        }
        this.p = true;
        this.o.l();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public final SnapshotApplyResult w() throws Throwable {
        NestedMutableSnapshot nestedMutableSnapshot;
        MutableSnapshot mutableSnapshot = this.o;
        if (mutableSnapshot.m || mutableSnapshot.c) {
            return new SnapshotApplyResult.Failure();
        }
        MutableScatterSet mutableScatterSet = this.h;
        long j = this.b;
        HashMap mapC = mutableScatterSet != null ? SnapshotKt.c(mutableSnapshot.getB(), this, this.o.getF1703a()) : null;
        Object obj = SnapshotKt.c;
        synchronized (obj) {
            try {
                SnapshotKt.d(this);
                try {
                    if (mutableScatterSet == null || mutableScatterSet.d == 0) {
                        nestedMutableSnapshot = this;
                        a();
                    } else {
                        nestedMutableSnapshot = this;
                        SnapshotApplyResult snapshotApplyResultZ = nestedMutableSnapshot.z(this.o.getB(), mutableScatterSet, mapC, this.o.getF1703a());
                        if (!snapshotApplyResultZ.equals(SnapshotApplyResult.Success.f1704a)) {
                            return snapshotApplyResultZ;
                        }
                        MutableScatterSet h = nestedMutableSnapshot.o.getH();
                        if (h != null) {
                            h.l(mutableScatterSet);
                        } else {
                            nestedMutableSnapshot.o.B(mutableScatterSet);
                            nestedMutableSnapshot.h = null;
                        }
                    }
                    if (nestedMutableSnapshot.o.getB() < j) {
                        nestedMutableSnapshot.o.v();
                    }
                    MutableSnapshot mutableSnapshot2 = nestedMutableSnapshot.o;
                    mutableSnapshot2.r(mutableSnapshot2.getF1703a().d(j).b(nestedMutableSnapshot.j));
                    nestedMutableSnapshot.o.A(j);
                    MutableSnapshot mutableSnapshot3 = nestedMutableSnapshot.o;
                    int i = nestedMutableSnapshot.d;
                    nestedMutableSnapshot.d = -1;
                    if (i >= 0) {
                        int[] iArr = mutableSnapshot3.k;
                        Intrinsics.h(iArr, "<this>");
                        int length = iArr.length;
                        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                        iArrCopyOf[length] = i;
                        mutableSnapshot3.k = iArrCopyOf;
                    } else {
                        mutableSnapshot3.getClass();
                    }
                    MutableSnapshot mutableSnapshot4 = nestedMutableSnapshot.o;
                    SnapshotIdSet snapshotIdSet = nestedMutableSnapshot.j;
                    mutableSnapshot4.getClass();
                    synchronized (obj) {
                        mutableSnapshot4.j = mutableSnapshot4.j.h(snapshotIdSet);
                        MutableSnapshot mutableSnapshot5 = nestedMutableSnapshot.o;
                        int[] iArrA0 = nestedMutableSnapshot.k;
                        mutableSnapshot5.getClass();
                        if (iArrA0.length != 0) {
                            int[] iArr2 = mutableSnapshot5.k;
                            if (iArr2.length != 0) {
                                iArrA0 = ArraysKt.a0(iArr2, iArrA0);
                            }
                            mutableSnapshot5.k = iArrA0;
                        }
                    }
                    nestedMutableSnapshot.m = true;
                    if (!nestedMutableSnapshot.p) {
                        nestedMutableSnapshot.p = true;
                        nestedMutableSnapshot.o.l();
                    }
                    return SnapshotApplyResult.Success.f1704a;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
