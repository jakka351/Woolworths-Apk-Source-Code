package androidx.compose.runtime;

import android.os.Trace;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMap;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.changelist.ChangeList;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.RememberEventDispatcher;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.tooling.CompositionObserver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/CompositionImpl;", "Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/ReusableComposition;", "Landroidx/compose/runtime/RecomposeScopeOwner;", "Landroidx/compose/runtime/CompositionServices;", "Landroidx/compose/runtime/PausableComposition;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class CompositionImpl implements ControlledComposition, ReusableComposition, RecomposeScopeOwner, CompositionServices, PausableComposition {
    public final CompositionContext d;
    public final AbstractApplier e;
    public final AtomicReference f = new AtomicReference(null);
    public final Object g = new Object();
    public final Set h;
    public final SlotTable i;
    public final MutableScatterMap j;
    public final MutableScatterSet k;
    public final MutableScatterSet l;
    public final MutableScatterMap m;
    public final ChangeList n;
    public final ChangeList o;
    public final MutableScatterMap p;
    public MutableScatterMap q;
    public boolean r;
    public CompositionImpl s;
    public int t;
    public final CompositionObserverHolder u;
    public final ComposerImpl v;
    public boolean w;

    public CompositionImpl(CompositionContext compositionContext, AbstractApplier abstractApplier) {
        this.d = compositionContext;
        this.e = abstractApplier;
        Set setF = new MutableScatterSet().f();
        this.h = setF;
        SlotTable slotTable = new SlotTable();
        if (compositionContext.d()) {
            slotTable.n = new MutableIntObjectMap();
        }
        if (compositionContext.getC()) {
            slotTable.k();
        }
        this.i = slotTable;
        this.j = ScopeMap.c();
        this.k = new MutableScatterSet();
        this.l = new MutableScatterSet();
        this.m = ScopeMap.c();
        ChangeList changeList = new ChangeList();
        this.n = changeList;
        ChangeList changeList2 = new ChangeList();
        this.o = changeList2;
        this.p = ScopeMap.c();
        this.q = ScopeMap.c();
        CompositionObserverHolder compositionObserverHolder = new CompositionObserverHolder();
        compositionObserverHolder.f1633a = null;
        this.u = compositionObserverHolder;
        ComposerImpl composerImpl = new ComposerImpl(abstractApplier, compositionContext, slotTable, setF, changeList, changeList2, this);
        compositionContext.p(composerImpl);
        this.v = composerImpl;
        ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$CompositionKt.f1623a;
    }

    public final void A() {
        AtomicReference atomicReference = this.f;
        Object andSet = atomicReference.getAndSet(null);
        if (Intrinsics.c(andSet, CompositionKt.f1630a)) {
            return;
        }
        if (andSet instanceof Set) {
            v((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                v(set, false);
            }
            return;
        }
        if (andSet == null) {
            ComposerKt.d("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new KotlinNothingValueException();
        }
        ComposerKt.d("corrupt pendingModifications drain: " + atomicReference);
        throw new KotlinNothingValueException();
    }

    public final void B() {
        EmptySet emptySet = EmptySet.d;
        AtomicReference atomicReference = this.f;
        Object andSet = atomicReference.getAndSet(emptySet);
        if (Intrinsics.c(andSet, CompositionKt.f1630a) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            v((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            ComposerKt.d("corrupt pendingModifications drain: " + atomicReference);
            throw new KotlinNothingValueException();
        }
        for (Set set : (Set[]) andSet) {
            v(set, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00db A[Catch: all -> 0x0042, EDGE_INSN: B:82:0x00db->B:67:0x00db BREAK  A[LOOP:0: B:49:0x0092->B:63:0x00d3], EDGE_INSN: B:83:0x00db->B:67:0x00db BREAK  A[LOOP:0: B:49:0x0092->B:63:0x00d3], TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x000b, B:6:0x0010, B:8:0x0018, B:10:0x001f, B:14:0x0029, B:16:0x002f, B:13:0x0024, B:25:0x0047, B:27:0x004d, B:32:0x0058, B:35:0x005c, B:37:0x0062, B:39:0x006d, B:41:0x0071, B:42:0x007a, B:44:0x0082, B:46:0x0086, B:49:0x0092, B:51:0x00a2, B:53:0x00ae, B:55:0x00b8, B:59:0x00c7, B:63:0x00d3, B:64:0x00d6, B:67:0x00db), top: B:80:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.runtime.InvalidationResult C(androidx.compose.runtime.RecomposeScopeImpl r21, androidx.compose.runtime.Anchor r22, java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.C(androidx.compose.runtime.RecomposeScopeImpl, androidx.compose.runtime.Anchor, java.lang.Object):androidx.compose.runtime.InvalidationResult");
    }

    public final void D(Object obj) {
        Object objE = this.j.e(obj);
        if (objE == null) {
            return;
        }
        boolean z = objE instanceof MutableScatterSet;
        MutableScatterMap mutableScatterMap = this.p;
        if (!z) {
            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) objE;
            if (recomposeScopeImpl.c(obj) == InvalidationResult.g) {
                ScopeMap.a(mutableScatterMap, obj, recomposeScopeImpl);
                return;
            }
            return;
        }
        MutableScatterSet mutableScatterSet = (MutableScatterSet) objE;
        Object[] objArr = mutableScatterSet.b;
        long[] jArr = mutableScatterSet.f700a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) objArr[(i << 3) + i3];
                        if (recomposeScopeImpl2.c(obj) == InvalidationResult.g) {
                            ScopeMap.a(mutableScatterMap, obj, recomposeScopeImpl2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final CompositionObserver E() {
        CompositionObserverHolder compositionObserverHolder = this.u;
        compositionObserverHolder.getClass();
        CompositionObserverHolder d = this.d.getD();
        CompositionObserver compositionObserver = d != null ? d.f1633a : null;
        if (!Intrinsics.c(compositionObserver, compositionObserverHolder.f1633a)) {
            compositionObserverHolder.f1633a = compositionObserver;
        }
        return compositionObserver;
    }

    @Override // androidx.compose.runtime.ControlledComposition, androidx.compose.runtime.RecomposeScopeOwner
    public final void a(Object obj) {
        RecomposeScopeImpl recomposeScopeImplB0;
        boolean z;
        boolean z2;
        int i;
        int i2;
        ComposerImpl composerImpl = this.v;
        if (composerImpl.z <= 0 && (recomposeScopeImplB0 = composerImpl.b0()) != null) {
            recomposeScopeImplB0.f();
            if ((recomposeScopeImplB0.f1656a & 32) == 0) {
                MutableObjectIntMap mutableObjectIntMap = recomposeScopeImplB0.f;
                if (mutableObjectIntMap == null) {
                    mutableObjectIntMap = new MutableObjectIntMap();
                    recomposeScopeImplB0.f = mutableObjectIntMap;
                }
                int i3 = recomposeScopeImplB0.e;
                int iE = mutableObjectIntMap.e(obj);
                if (iE < 0) {
                    iE = ~iE;
                    i2 = -1;
                } else {
                    i2 = mutableObjectIntMap.c[iE];
                }
                mutableObjectIntMap.b[iE] = obj;
                mutableObjectIntMap.c[iE] = i3;
                if (i2 == recomposeScopeImplB0.e) {
                    return;
                }
            }
            boolean z3 = true;
            if (obj instanceof StateObjectImpl) {
                ((StateObjectImpl) obj).B(1);
            }
            ScopeMap.a(this.j, obj, recomposeScopeImplB0);
            if (obj instanceof DerivedState) {
                DerivedState derivedState = (DerivedState) obj;
                DerivedSnapshotState.ResultRecord resultRecordA = derivedState.A();
                MutableScatterMap mutableScatterMap = this.m;
                ScopeMap.e(mutableScatterMap, obj);
                ObjectIntMap objectIntMap = resultRecordA.e;
                Object[] objArr = objectIntMap.b;
                long[] jArr = objectIntMap.f692a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8;
                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((j & 255) < 128) {
                                    i = i5;
                                    StateObject stateObject = (StateObject) objArr[(i4 << 3) + i7];
                                    if (stateObject instanceof StateObjectImpl) {
                                        z2 = true;
                                        ((StateObjectImpl) stateObject).B(1);
                                    } else {
                                        z2 = true;
                                    }
                                    ScopeMap.a(mutableScatterMap, stateObject, obj);
                                } else {
                                    z2 = z3;
                                    i = i5;
                                }
                                j >>= i;
                                i7++;
                                z3 = z2;
                                i5 = i;
                            }
                            z = z3;
                            if (i6 != i5) {
                                break;
                            }
                        } else {
                            z = z3;
                        }
                        if (i4 == length) {
                            break;
                        }
                        i4++;
                        z3 = z;
                    }
                }
                Object obj2 = resultRecordA.f;
                MutableScatterMap mutableScatterMap2 = recomposeScopeImplB0.g;
                if (mutableScatterMap2 == null) {
                    mutableScatterMap2 = new MutableScatterMap();
                    recomposeScopeImplB0.g = mutableScatterMap2;
                }
                mutableScatterMap2.m(derivedState, obj2);
            }
        }
    }

    @Override // androidx.compose.runtime.Composition
    /* renamed from: b, reason: from getter */
    public final boolean getW() {
        return this.w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.Set[]] */
    @Override // androidx.compose.runtime.ControlledComposition
    public final void c(ScatterSetWrapper scatterSetWrapper) {
        Object obj;
        boolean z;
        ScatterSetWrapper scatterSetWrapper2;
        do {
            obj = this.f.get();
            z = true;
            if (obj == null ? true : obj.equals(CompositionKt.f1630a)) {
                scatterSetWrapper2 = scatterSetWrapper;
            } else if (obj instanceof Set) {
                scatterSetWrapper2 = new Set[]{obj, scatterSetWrapper};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f).toString());
                }
                Set[] setArr = (Set[]) obj;
                int length = setArr.length;
                ?? CopyOf = Arrays.copyOf(setArr, length + 1);
                CopyOf[length] = scatterSetWrapper;
                scatterSetWrapper2 = CopyOf;
            }
            AtomicReference atomicReference = this.f;
            while (true) {
                if (atomicReference.compareAndSet(obj, scatterSetWrapper2)) {
                    break;
                } else if (atomicReference.get() != obj) {
                    z = false;
                    break;
                }
            }
        } while (!z);
        if (obj == null) {
            synchronized (this.g) {
                A();
            }
        }
    }

    @Override // androidx.compose.runtime.Composition
    public final void d(Function2 function2) {
        ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) function2;
        if (this.w) {
            PreconditionsKt.b("The composition is disposed");
        }
        this.d.a(this, composableLambdaImpl);
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public final void deactivate() {
        synchronized (this.g) {
            try {
                boolean z = this.i.e > 0;
                if (z || !this.h.isEmpty()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.h);
                        if (z) {
                            SlotWriter slotWriterM = this.i.m();
                            try {
                                ComposerKt.e(slotWriterM, rememberEventDispatcher);
                                slotWriterM.e(true);
                                this.e.c();
                                rememberEventDispatcher.b();
                            } catch (Throwable th) {
                                slotWriterM.e(false);
                                throw th;
                            }
                        }
                        rememberEventDispatcher.a();
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                this.j.g();
                this.m.g();
                this.q.g();
                this.n.f1672a.b();
                this.o.f1672a.b();
                ComposerImpl composerImpl = this.v;
                composerImpl.D.clear();
                composerImpl.r.clear();
                composerImpl.e.f1672a.b();
                composerImpl.u = null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.compose.runtime.Composition
    public final void dispose() {
        synchronized (this.g) {
            try {
                if (this.v.E) {
                    PreconditionsKt.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (!this.w) {
                    this.w = true;
                    ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$CompositionKt.b;
                    ChangeList changeList = this.v.K;
                    if (changeList != null) {
                        w(changeList);
                    }
                    boolean z = this.i.e > 0;
                    if (z || !this.h.isEmpty()) {
                        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.h);
                        if (z) {
                            SlotWriter slotWriterM = this.i.m();
                            try {
                                ComposerKt.h(slotWriterM, rememberEventDispatcher);
                                slotWriterM.e(true);
                                this.e.k();
                                this.e.c();
                                rememberEventDispatcher.b();
                            } catch (Throwable th) {
                                slotWriterM.e(false);
                                throw th;
                            }
                        }
                        rememberEventDispatcher.a();
                    }
                    ComposerImpl composerImpl = this.v;
                    composerImpl.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        composerImpl.b.s(composerImpl);
                        composerImpl.D.clear();
                        composerImpl.r.clear();
                        composerImpl.e.f1672a.b();
                        composerImpl.u = null;
                        composerImpl.f1625a.k();
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.d.t(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    @Override // androidx.compose.runtime.ControlledComposition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(java.util.Set r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof androidx.compose.runtime.collection.ScatterSetWrapper
            androidx.collection.MutableScatterMap r3 = r0.m
            androidx.collection.MutableScatterMap r4 = r0.j
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L5e
            androidx.compose.runtime.collection.ScatterSetWrapper r1 = (androidx.compose.runtime.collection.ScatterSetWrapper) r1
            androidx.collection.ScatterSet r1 = r1.d
            java.lang.Object[] r2 = r1.b
            long[] r1 = r1.f700a
            int r7 = r1.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7b
            r8 = r5
        L1c:
            r9 = r1[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L59
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r5
        L36:
            if (r13 >= r11) goto L57
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L53
            int r14 = r8 << 3
            int r14 = r14 + r13
            r14 = r2[r14]
            boolean r15 = r4.c(r14)
            if (r15 != 0) goto L52
            boolean r14 = r3.c(r14)
            if (r14 == 0) goto L53
        L52:
            return r6
        L53:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L36
        L57:
            if (r11 != r12) goto L7b
        L59:
            if (r8 == r7) goto L7b
            int r8 = r8 + 1
            goto L1c
        L5e:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L64:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r1.next()
            boolean r7 = r4.c(r2)
            if (r7 != 0) goto L7a
            boolean r2 = r3.c(r2)
            if (r2 == 0) goto L64
        L7a:
            return r6
        L7b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.e(java.util.Set):boolean");
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void f(ArrayList arrayList) {
        Set set = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (!((MovableContentStateReference) ((Pair) arrayList.get(i)).d).b().equals(this)) {
                    ComposerKt.c("Check failed");
                    break;
                }
                i++;
            }
        }
        try {
            ComposerImpl composerImpl = this.v;
            composerImpl.getClass();
            try {
                composerImpl.d0(arrayList);
                composerImpl.P();
            } catch (Throwable th) {
                composerImpl.O();
                throw th;
            }
        } finally {
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void g() {
        synchronized (this.g) {
            try {
                this.v.u = null;
                if (!this.h.isEmpty()) {
                    new RememberEventDispatcher(this.h).a();
                }
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.h.isEmpty()) {
                            new RememberEventDispatcher(this.h).a();
                        }
                        throw th;
                    } catch (Exception e) {
                        s();
                        throw e;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    public final void h() {
        this.r = true;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void i() {
        synchronized (this.g) {
            try {
                if (this.o.f1672a.f()) {
                    w(this.o);
                }
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.h.isEmpty()) {
                            new RememberEventDispatcher(this.h).a();
                        }
                        throw th;
                    } catch (Exception e) {
                        s();
                        throw e;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final Object j(ControlledComposition controlledComposition, int i, Function0 function0) {
        if (controlledComposition == null || controlledComposition.equals(this) || i < 0) {
            return function0.invoke();
        }
        this.s = (CompositionImpl) controlledComposition;
        this.t = i;
        try {
            return function0.invoke();
        } finally {
            this.s = null;
            this.t = 0;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final boolean k() {
        boolean zH0;
        synchronized (this.g) {
            try {
                z();
                try {
                    MutableScatterMap mutableScatterMap = this.q;
                    this.q = ScopeMap.c();
                    try {
                        CompositionObserver compositionObserverE = E();
                        if (compositionObserverE != null) {
                            ScopeMap.b(mutableScatterMap);
                            compositionObserverE.a();
                        }
                        zH0 = this.v.h0(mutableScatterMap);
                        if (!zH0) {
                            A();
                        }
                        if (compositionObserverE != null) {
                            compositionObserverE.b();
                        }
                    } catch (Exception e) {
                        this.q = mutableScatterMap;
                        throw e;
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zH0;
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    public final InvalidationResult l(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        CompositionImpl compositionImpl;
        int i = recomposeScopeImpl.f1656a;
        if ((i & 2) != 0) {
            recomposeScopeImpl.f1656a = i | 4;
        }
        Anchor anchor = recomposeScopeImpl.c;
        if (anchor == null || !anchor.a()) {
            return InvalidationResult.d;
        }
        if (this.i.n(anchor)) {
            return recomposeScopeImpl.d != null ? C(recomposeScopeImpl, anchor, obj) : InvalidationResult.d;
        }
        synchronized (this.g) {
            compositionImpl = this.s;
        }
        if (compositionImpl != null) {
            ComposerImpl composerImpl = compositionImpl.v;
            if (composerImpl.E && composerImpl.z0(recomposeScopeImpl, obj)) {
                return InvalidationResult.g;
            }
        }
        return InvalidationResult.d;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void m(Function0 function0) {
        ComposerImpl composerImpl = this.v;
        if (composerImpl.E) {
            ComposerKt.c("Preparing a composition while composing is not supported");
        }
        composerImpl.E = true;
        try {
            ((Recomposer$performRecompose$1$1) function0).invoke();
        } finally {
            composerImpl.E = false;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void n() {
        synchronized (this.g) {
            try {
                w(this.n);
                A();
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.h.isEmpty()) {
                            new RememberEventDispatcher(this.h).a();
                        }
                        throw th;
                    } catch (Exception e) {
                        s();
                        throw e;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final boolean o() {
        return this.v.E;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    @Override // androidx.compose.runtime.ControlledComposition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.g
            monitor-enter(r0)
            r14.D(r15)     // Catch: java.lang.Throwable -> L4f
            androidx.collection.MutableScatterMap r1 = r14.m     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r15 = r1.e(r15)     // Catch: java.lang.Throwable -> L4f
            if (r15 == 0) goto L61
            boolean r1 = r15 instanceof androidx.collection.MutableScatterSet     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L5c
            androidx.collection.MutableScatterSet r15 = (androidx.collection.MutableScatterSet) r15     // Catch: java.lang.Throwable -> L4f
            java.lang.Object[] r1 = r15.b     // Catch: java.lang.Throwable -> L4f
            long[] r15 = r15.f700a     // Catch: java.lang.Throwable -> L4f
            int r2 = r15.length     // Catch: java.lang.Throwable -> L4f
            int r2 = r2 + (-2)
            if (r2 < 0) goto L61
            r3 = 0
            r4 = r3
        L1f:
            r5 = r15[r4]     // Catch: java.lang.Throwable -> L4f
            long r7 = ~r5     // Catch: java.lang.Throwable -> L4f
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = r4 - r2
            int r7 = ~r7     // Catch: java.lang.Throwable -> L4f
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L39:
            if (r9 >= r7) goto L55
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L51
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]     // Catch: java.lang.Throwable -> L4f
            androidx.compose.runtime.DerivedState r10 = (androidx.compose.runtime.DerivedState) r10     // Catch: java.lang.Throwable -> L4f
            r14.D(r10)     // Catch: java.lang.Throwable -> L4f
            goto L51
        L4f:
            r15 = move-exception
            goto L63
        L51:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L39
        L55:
            if (r7 != r8) goto L61
        L57:
            if (r4 == r2) goto L61
            int r4 = r4 + 1
            goto L1f
        L5c:
            androidx.compose.runtime.DerivedState r15 = (androidx.compose.runtime.DerivedState) r15     // Catch: java.lang.Throwable -> L4f
            r14.D(r15)     // Catch: java.lang.Throwable -> L4f
        L61:
            monitor-exit(r0)
            return
        L63:
            monitor-exit(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.p(java.lang.Object):void");
    }

    @Override // androidx.compose.runtime.Composition
    public final boolean q() {
        boolean z;
        synchronized (this.g) {
            z = this.q.e > 0;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(java.lang.Object r20, boolean r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            androidx.collection.MutableScatterMap r2 = r0.j
            java.lang.Object r2 = r2.e(r1)
            if (r2 == 0) goto L9a
            boolean r3 = r2 instanceof androidx.collection.MutableScatterSet
            androidx.collection.MutableScatterSet r4 = r0.k
            androidx.collection.MutableScatterSet r5 = r0.l
            androidx.collection.MutableScatterMap r6 = r0.p
            if (r3 == 0) goto L7d
            androidx.collection.MutableScatterSet r2 = (androidx.collection.MutableScatterSet) r2
            java.lang.Object[] r3 = r2.b
            long[] r2 = r2.f700a
            int r7 = r2.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L9a
            r9 = 0
        L22:
            r10 = r2[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L78
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L3c:
            if (r14 >= r12) goto L75
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.32E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L6c
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r3[r15]
            androidx.compose.runtime.RecomposeScopeImpl r15 = (androidx.compose.runtime.RecomposeScopeImpl) r15
            boolean r16 = androidx.compose.runtime.collection.ScopeMap.d(r6, r1, r15)
            if (r16 != 0) goto L6c
            androidx.compose.runtime.InvalidationResult r8 = r15.c(r1)
            r17 = r13
            androidx.compose.runtime.InvalidationResult r13 = androidx.compose.runtime.InvalidationResult.d
            if (r8 == r13) goto L6e
            androidx.collection.MutableScatterMap r8 = r15.g
            if (r8 == 0) goto L68
            if (r21 != 0) goto L68
            r5.e(r15)
            goto L6e
        L68:
            r4.e(r15)
            goto L6e
        L6c:
            r17 = r13
        L6e:
            long r10 = r10 >> r17
            int r14 = r14 + 1
            r13 = r17
            goto L3c
        L75:
            r8 = r13
            if (r12 != r8) goto L9a
        L78:
            if (r9 == r7) goto L9a
            int r9 = r9 + 1
            goto L22
        L7d:
            androidx.compose.runtime.RecomposeScopeImpl r2 = (androidx.compose.runtime.RecomposeScopeImpl) r2
            boolean r3 = androidx.compose.runtime.collection.ScopeMap.d(r6, r1, r2)
            if (r3 != 0) goto L9a
            androidx.compose.runtime.InvalidationResult r1 = r2.c(r1)
            androidx.compose.runtime.InvalidationResult r3 = androidx.compose.runtime.InvalidationResult.d
            if (r1 == r3) goto L9a
            androidx.collection.MutableScatterMap r1 = r2.g
            if (r1 == 0) goto L97
            if (r21 != 0) goto L97
            r5.e(r2)
            return
        L97:
            r4.e(r2)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.r(java.lang.Object, boolean):void");
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void s() {
        this.f.set(null);
        this.n.f1672a.b();
        this.o.f1672a.b();
        Set set = this.h;
        if (set.isEmpty()) {
            return;
        }
        new RememberEventDispatcher(set).a();
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public final void t(ComposableLambdaImpl composableLambdaImpl) {
        ComposerImpl composerImpl = this.v;
        composerImpl.y = 100;
        composerImpl.x = true;
        if (this.w) {
            PreconditionsKt.b("The composition is disposed");
        }
        this.d.a(this, composableLambdaImpl);
        if (composerImpl.E || composerImpl.y != 100) {
            PreconditionsKt.a("Cannot disable reuse from root if it was caused by other groups");
        }
        composerImpl.y = -1;
        composerImpl.x = false;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void u() {
        synchronized (this.g) {
            try {
                for (Object obj : this.i.f) {
                    RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
                    if (recomposeScopeImpl != null) {
                        recomposeScopeImpl.invalidate();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0183 A[EDGE_INSN: B:73:0x0183->B:224:0x0122 BREAK  A[LOOP:13: B:63:0x0151->B:74:0x0185]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(java.util.Set r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 918
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.v(java.util.Set, boolean):void");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(androidx.compose.runtime.changelist.ChangeList r33) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.w(androidx.compose.runtime.changelist.ChangeList):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x() {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.x():void");
    }

    public final void y(ComposableLambdaImpl composableLambdaImpl) {
        MutableScatterMap mutableScatterMap;
        try {
            synchronized (this.g) {
                try {
                    z();
                    mutableScatterMap = this.q;
                    this.q = ScopeMap.c();
                    CompositionObserver compositionObserverE = E();
                    if (compositionObserverE != null) {
                        ScopeMap.b(mutableScatterMap);
                        compositionObserverE.a();
                    }
                    ComposerImpl composerImpl = this.v;
                    if (!composerImpl.e.f1672a.e()) {
                        ComposerKt.c("Expected applyChanges() to have been called");
                    }
                    composerImpl.S(mutableScatterMap, composableLambdaImpl);
                    if (compositionObserverE != null) {
                        compositionObserverE.b();
                    }
                } catch (Exception e) {
                    this.q = mutableScatterMap;
                    throw e;
                } finally {
                }
            }
        } finally {
        }
    }

    public final void z() {
        AtomicReference atomicReference = this.f;
        Object obj = CompositionKt.f1630a;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                ComposerKt.d("pending composition has not been applied");
                throw new KotlinNothingValueException();
            }
            if (andSet instanceof Set) {
                v((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                ComposerKt.d("corrupt pendingModifications drain: " + atomicReference);
                throw new KotlinNothingValueException();
            }
            for (Set set : (Set[]) andSet) {
                v(set, true);
            }
        }
    }
}
