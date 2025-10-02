package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Thread_jvmKt;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/snapshots/Snapshot;", "", "Companion", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/ReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/TransparentObserverSnapshot;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class Snapshot {

    /* renamed from: a, reason: collision with root package name */
    public SnapshotIdSet f1703a;
    public long b;
    public boolean c;
    public int d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/snapshots/Snapshot$Companion;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static Snapshot a() {
            return (Snapshot) SnapshotKt.b.a();
        }

        public static Snapshot b(Snapshot snapshot) {
            if (snapshot instanceof TransparentObserverMutableSnapshot) {
                TransparentObserverMutableSnapshot transparentObserverMutableSnapshot = (TransparentObserverMutableSnapshot) snapshot;
                if (transparentObserverMutableSnapshot.t == Thread_jvmKt.a()) {
                    transparentObserverMutableSnapshot.r = null;
                    return snapshot;
                }
            }
            if (snapshot instanceof TransparentObserverSnapshot) {
                TransparentObserverSnapshot transparentObserverSnapshot = (TransparentObserverSnapshot) snapshot;
                if (transparentObserverSnapshot.h == Thread_jvmKt.a()) {
                    transparentObserverSnapshot.g = null;
                    return snapshot;
                }
            }
            Snapshot snapshotH = SnapshotKt.h(snapshot, null, false);
            snapshotH.j();
            return snapshotH;
        }

        public static Object c(Function0 function0, Function1 function1) {
            Snapshot transparentObserverMutableSnapshot;
            if (function1 == null) {
                return function0.invoke();
            }
            Snapshot snapshot = (Snapshot) SnapshotKt.b.a();
            if (snapshot instanceof TransparentObserverMutableSnapshot) {
                TransparentObserverMutableSnapshot transparentObserverMutableSnapshot2 = (TransparentObserverMutableSnapshot) snapshot;
                if (transparentObserverMutableSnapshot2.t == Thread_jvmKt.a()) {
                    Function1 function12 = transparentObserverMutableSnapshot2.r;
                    Function1 function13 = transparentObserverMutableSnapshot2.s;
                    try {
                        ((TransparentObserverMutableSnapshot) snapshot).r = SnapshotKt.l(function1, function12, true);
                        ((TransparentObserverMutableSnapshot) snapshot).s = function13;
                        return function0.invoke();
                    } finally {
                        transparentObserverMutableSnapshot2.r = function12;
                        transparentObserverMutableSnapshot2.s = function13;
                    }
                }
            }
            if (snapshot == null || (snapshot instanceof MutableSnapshot)) {
                transparentObserverMutableSnapshot = new TransparentObserverMutableSnapshot(snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null, function1, null, true, false);
            } else {
                if (function1 == null) {
                    return function0.invoke();
                }
                transparentObserverMutableSnapshot = snapshot.u(function1);
            }
            try {
                Snapshot snapshotJ = transparentObserverMutableSnapshot.j();
                try {
                    Object objInvoke = function0.invoke();
                    Snapshot.q(snapshotJ);
                    transparentObserverMutableSnapshot.c();
                    return objInvoke;
                } catch (Throwable th) {
                    Snapshot.q(snapshotJ);
                    throw th;
                }
            } catch (Throwable th2) {
                transparentObserverMutableSnapshot.c();
                throw th2;
            }
        }

        public static a d(Function2 function2) {
            Function1 function1 = SnapshotKt.f1707a;
            SnapshotKt.f(SnapshotKt$emptyLambda$1.h);
            synchronized (SnapshotKt.c) {
                SnapshotKt.h = CollectionsKt.d0(function2, (Collection) SnapshotKt.h);
            }
            return new a(function2, 0);
        }

        public static void e(Snapshot snapshot, Snapshot snapshot2, Function1 function1) {
            if (snapshot != snapshot2) {
                snapshot2.getClass();
                Snapshot.q(snapshot);
                snapshot2.c();
            } else if (snapshot instanceof TransparentObserverMutableSnapshot) {
                ((TransparentObserverMutableSnapshot) snapshot).r = function1;
            } else if (snapshot instanceof TransparentObserverSnapshot) {
                ((TransparentObserverSnapshot) snapshot).g = function1;
            } else {
                throw new IllegalStateException(("Non-transparent snapshot was reused: " + snapshot).toString());
            }
        }

        public static void f() {
            boolean z;
            synchronized (SnapshotKt.c) {
                MutableScatterSet mutableScatterSet = SnapshotKt.j.h;
                z = false;
                if (mutableScatterSet != null) {
                    if (mutableScatterSet.d()) {
                        z = true;
                    }
                }
            }
            if (z) {
                SnapshotKt.a();
            }
        }

        public static MutableSnapshot g(Function1 function1, Function1 function12) {
            MutableSnapshot mutableSnapshotC;
            Snapshot snapshotK = SnapshotKt.k();
            MutableSnapshot mutableSnapshot = snapshotK instanceof MutableSnapshot ? (MutableSnapshot) snapshotK : null;
            if (mutableSnapshot == null || (mutableSnapshotC = mutableSnapshot.C(function1, function12)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            return mutableSnapshotC;
        }
    }

    public Snapshot(long j, SnapshotIdSet snapshotIdSet) {
        int iA;
        int iNumberOfTrailingZeros;
        this.f1703a = snapshotIdSet;
        this.b = j;
        Function1 function1 = SnapshotKt.f1707a;
        if (j != 0) {
            SnapshotIdSet f1703a = getF1703a();
            long j2 = f1703a.f;
            long[] jArr = f1703a.g;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = f1703a.e;
                if (j3 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = f1703a.d;
                    if (j4 != 0) {
                        j2 += 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = iNumberOfTrailingZeros + j2;
            }
            synchronized (SnapshotKt.c) {
                iA = SnapshotKt.f.a(j);
            }
        } else {
            iA = -1;
        }
        this.d = iA;
    }

    public static void q(Snapshot snapshot) {
        SnapshotKt.b.b(snapshot);
    }

    public final void a() {
        synchronized (SnapshotKt.c) {
            b();
            p();
        }
    }

    public void b() {
        SnapshotKt.d = SnapshotKt.d.d(getB());
    }

    public void c() {
        this.c = true;
        synchronized (SnapshotKt.c) {
            o();
        }
    }

    /* renamed from: d, reason: from getter */
    public SnapshotIdSet getF1703a() {
        return this.f1703a;
    }

    /* renamed from: e */
    public abstract Function1 getG();

    public abstract boolean f();

    /* renamed from: g, reason: from getter */
    public long getB() {
        return this.b;
    }

    /* renamed from: h */
    public int getG() {
        return 0;
    }

    /* renamed from: i */
    public abstract Function1 getS();

    public final Snapshot j() {
        SnapshotThreadLocal snapshotThreadLocal = SnapshotKt.b;
        Snapshot snapshot = (Snapshot) snapshotThreadLocal.a();
        snapshotThreadLocal.b(this);
        return snapshot;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(StateObject stateObject);

    public final void o() {
        int i = this.d;
        if (i >= 0) {
            SnapshotKt.u(i);
            this.d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(SnapshotIdSet snapshotIdSet) {
        this.f1703a = snapshotIdSet;
    }

    public void s(long j) {
        this.b = j;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract Snapshot u(Function1 function1);
}
