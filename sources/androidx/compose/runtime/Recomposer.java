package androidx.compose.runtime;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.collection.MultiValueMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Utils_androidKt;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.snapshots.SnapshotKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/Recomposer;", "Landroidx/compose/runtime/CompositionContext;", "Companion", "HotReloadable", "RecomposerErrorState", "RecomposerInfoImpl", "State", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class Recomposer extends CompositionContext {
    public static final MutableStateFlow y = StateFlowKt.a(PersistentOrderedSet.g);
    public static final AtomicReference z = new AtomicReference(Boolean.FALSE);

    /* renamed from: a, reason: collision with root package name */
    public final BroadcastFrameClock f1657a;
    public final Object b;
    public Job c;
    public Throwable d;
    public final ArrayList e;
    public Object f;
    public MutableScatterSet g;
    public final MutableVector h;
    public final ArrayList i;
    public final ArrayList j;
    public final MutableScatterMap k;
    public final NestedContentMap l;
    public final MutableScatterMap m;
    public final MutableScatterMap n;
    public ArrayList o;
    public LinkedHashSet p;
    public CancellableContinuationImpl q;
    public boolean r;
    public RecomposerErrorState s;
    public boolean t;
    public final MutableStateFlow u;
    public final JobImpl v;
    public final CoroutineContext w;
    public final RecomposerInfoImpl x;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001R4\u0010\u0006\u001a\"\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0002j\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R$\u0010\f\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\nR\u00020\u000b0\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/Recomposer$Companion;", "", "Ljava/util/concurrent/atomic/AtomicReference;", "", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/internal/AtomicReference;", "_hotReloadEnabled", "Ljava/util/concurrent/atomic/AtomicReference;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "Landroidx/compose/runtime/Recomposer;", "_runningRecomposers", "Lkotlinx/coroutines/flow/MutableStateFlow;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/Recomposer$HotReloadable;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class HotReloadable {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "Landroidx/compose/runtime/RecomposerErrorInfo;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class RecomposerErrorState implements RecomposerErrorInfo {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f1658a;

        public RecomposerErrorState(Throwable th) {
            this.f1658a = th;
        }

        /* renamed from: a, reason: from getter */
        public final Throwable getF1658a() {
            return this.f1658a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "Landroidx/compose/runtime/RecomposerInfo;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public final class RecomposerInfoImpl implements RecomposerInfo {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/Recomposer$State;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class State {
        public static final State d;
        public static final State e;
        public static final State f;
        public static final State g;
        public static final State h;
        public static final State i;
        public static final /* synthetic */ State[] j;
        public static final /* synthetic */ EnumEntries k;

        static {
            State state = new State("ShutDown", 0);
            d = state;
            State state2 = new State("ShuttingDown", 1);
            e = state2;
            State state3 = new State("Inactive", 2);
            f = state3;
            State state4 = new State("InactivePendingWork", 3);
            g = state4;
            State state5 = new State("Idle", 4);
            h = state5;
            State state6 = new State("PendingWork", 5);
            i = state6;
            State[] stateArr = {state, state2, state3, state4, state5, state6};
            j = stateArr;
            k = EnumEntriesKt.a(stateArr);
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) j.clone();
        }
    }

    public Recomposer(CoroutineContext coroutineContext) {
        BroadcastFrameClock broadcastFrameClock = new BroadcastFrameClock(new Recomposer$broadcastFrameClock$1(this));
        this.f1657a = broadcastFrameClock;
        this.b = new Object();
        this.e = new ArrayList();
        this.g = new MutableScatterSet();
        this.h = new MutableVector(new ControlledComposition[16], 0);
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new MutableScatterMap();
        this.l = new NestedContentMap();
        this.m = new MutableScatterMap();
        this.n = new MutableScatterMap();
        this.u = StateFlowKt.a(State.f);
        new SnapshotThreadLocal();
        JobImpl jobImpl = new JobImpl((Job) coroutineContext.get(Job.Key.d));
        jobImpl.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CancellableContinuationImpl cancellableContinuationImpl;
                CancellableContinuationImpl cancellableContinuationImpl2;
                final Throwable th = (Throwable) obj;
                CancellationException cancellationExceptionA = ExceptionsKt.a("Recomposer effect job completed", th);
                final Recomposer recomposer = this.h;
                synchronized (recomposer.b) {
                    try {
                        Job job = recomposer.c;
                        cancellableContinuationImpl = null;
                        if (job != null) {
                            recomposer.u.setValue(Recomposer.State.e);
                            if (recomposer.r) {
                                cancellableContinuationImpl2 = recomposer.q;
                                if (cancellableContinuationImpl2 != null) {
                                }
                                recomposer.q = null;
                                job.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        Throwable th2 = (Throwable) obj2;
                                        Recomposer recomposer2 = recomposer;
                                        Object obj3 = recomposer2.b;
                                        Throwable th3 = th;
                                        synchronized (obj3) {
                                            if (th3 == null) {
                                                th3 = null;
                                            } else if (th2 != null) {
                                                try {
                                                    if (th2 instanceof CancellationException) {
                                                        th2 = null;
                                                    }
                                                    if (th2 != null) {
                                                        kotlin.ExceptionsKt.a(th3, th2);
                                                    }
                                                } catch (Throwable th4) {
                                                    throw th4;
                                                }
                                            }
                                            recomposer2.d = th3;
                                            recomposer2.u.setValue(Recomposer.State.d);
                                        }
                                        return Unit.f24250a;
                                    }
                                });
                                cancellableContinuationImpl = cancellableContinuationImpl2;
                            } else {
                                job.cancel(cancellationExceptionA);
                            }
                            cancellableContinuationImpl2 = null;
                            recomposer.q = null;
                            job.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    Throwable th2 = (Throwable) obj2;
                                    Recomposer recomposer2 = recomposer;
                                    Object obj3 = recomposer2.b;
                                    Throwable th3 = th;
                                    synchronized (obj3) {
                                        if (th3 == null) {
                                            th3 = null;
                                        } else if (th2 != null) {
                                            try {
                                                if (th2 instanceof CancellationException) {
                                                    th2 = null;
                                                }
                                                if (th2 != null) {
                                                    kotlin.ExceptionsKt.a(th3, th2);
                                                }
                                            } catch (Throwable th4) {
                                                throw th4;
                                            }
                                        }
                                        recomposer2.d = th3;
                                        recomposer2.u.setValue(Recomposer.State.d);
                                    }
                                    return Unit.f24250a;
                                }
                            });
                            cancellableContinuationImpl = cancellableContinuationImpl2;
                        } else {
                            recomposer.d = cancellationExceptionA;
                            recomposer.u.setValue(Recomposer.State.d);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (cancellableContinuationImpl != null) {
                    cancellableContinuationImpl.resumeWith(Unit.f24250a);
                }
                return Unit.f24250a;
            }
        });
        this.v = jobImpl;
        this.w = coroutineContext.plus(broadcastFrameClock).plus(jobImpl);
        this.x = new RecomposerInfoImpl();
    }

    public static final void F(ArrayList arrayList, Recomposer recomposer, CompositionImpl compositionImpl) {
        arrayList.clear();
        synchronized (recomposer.b) {
            Iterator it = recomposer.j.iterator();
            while (it.hasNext()) {
                MovableContentStateReference movableContentStateReference = (MovableContentStateReference) it.next();
                if (movableContentStateReference.b().equals(compositionImpl)) {
                    arrayList.add(movableContentStateReference);
                    it.remove();
                }
            }
        }
    }

    public static final ControlledComposition u(Recomposer recomposer, ControlledComposition controlledComposition, MutableScatterSet mutableScatterSet) {
        recomposer.getClass();
        if (controlledComposition.o() || controlledComposition.getW()) {
            return null;
        }
        LinkedHashSet linkedHashSet = recomposer.p;
        if (linkedHashSet != null && linkedHashSet.contains(controlledComposition)) {
            return null;
        }
        MutableSnapshot mutableSnapshotG = Snapshot.Companion.g(new Recomposer$readObserverOf$1(controlledComposition), new Recomposer$writeObserverOf$1(mutableScatterSet, controlledComposition));
        try {
            Snapshot snapshotJ = mutableSnapshotG.j();
            if (mutableScatterSet != null) {
                try {
                    if (mutableScatterSet.d()) {
                        controlledComposition.m(new Recomposer$performRecompose$1$1(mutableScatterSet, controlledComposition));
                    }
                } catch (Throwable th) {
                    Snapshot.q(snapshotJ);
                    throw th;
                }
            }
            boolean zK = controlledComposition.k();
            Snapshot.q(snapshotJ);
            if (zK) {
                return controlledComposition;
            }
            return null;
        } finally {
            w(mutableSnapshotG);
        }
    }

    public static final boolean v(Recomposer recomposer) {
        List listC;
        synchronized (recomposer.b) {
            boolean z2 = true;
            if (recomposer.g.c()) {
                if (recomposer.h.f == 0 && !recomposer.A()) {
                    z2 = false;
                }
                return z2;
            }
            ScatterSetWrapper scatterSetWrapper = new ScatterSetWrapper(recomposer.g);
            recomposer.g = new MutableScatterSet();
            synchronized (recomposer.b) {
                listC = recomposer.C();
            }
            try {
                int size = listC.size();
                for (int i = 0; i < size; i++) {
                    ((ControlledComposition) listC.get(i)).c(scatterSetWrapper);
                    if (((State) recomposer.u.getValue()).compareTo(State.e) <= 0) {
                        break;
                    }
                }
                synchronized (recomposer.b) {
                    recomposer.g = new MutableScatterSet();
                }
                synchronized (recomposer.b) {
                    if (recomposer.z() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    if (recomposer.h.f == 0 && !recomposer.A()) {
                        z2 = false;
                    }
                }
                return z2;
            } catch (Throwable th) {
                synchronized (recomposer.b) {
                    MutableScatterSet mutableScatterSet = recomposer.g;
                    mutableScatterSet.getClass();
                    Iterator<T> it = scatterSetWrapper.iterator();
                    while (it.hasNext()) {
                        mutableScatterSet.m(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public static void w(MutableSnapshot mutableSnapshot) {
        try {
            if (mutableSnapshot.w() instanceof SnapshotApplyResult.Failure) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            mutableSnapshot.c();
        }
    }

    public static final void y(Recomposer recomposer, MovableContentStateReference movableContentStateReference, MovableContentStateReference movableContentStateReference2) {
        List h = movableContentStateReference2.getH();
        if (h != null) {
            int size = h.size();
            for (int i = 0; i < size; i++) {
                MovableContentStateReference movableContentStateReference3 = (MovableContentStateReference) h.get(i);
                NestedContentMap nestedContentMap = recomposer.l;
                MovableContent f1647a = movableContentStateReference3.getF1647a();
                NestedMovableContent nestedMovableContent = new NestedMovableContent(movableContentStateReference3, movableContentStateReference);
                MultiValueMap.a(nestedContentMap.f1648a, f1647a, nestedMovableContent);
                MultiValueMap.a(nestedContentMap.b, nestedMovableContent.getB(), f1647a);
                y(recomposer, movableContentStateReference, movableContentStateReference3);
            }
        }
    }

    public final boolean A() {
        return (this.t || this.f1657a.i.get() == 0) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean B() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.b
            monitor-enter(r0)
            androidx.collection.MutableScatterSet r1 = r2.g     // Catch: java.lang.Throwable -> L1b
            boolean r1 = r1.d()     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L1d
            androidx.compose.runtime.collection.MutableVector r1 = r2.h     // Catch: java.lang.Throwable -> L1b
            int r1 = r1.f     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L12
            goto L1d
        L12:
            boolean r1 = r2.A()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L19
            goto L1d
        L19:
            r1 = 0
            goto L1e
        L1b:
            r1 = move-exception
            goto L20
        L1d:
            r1 = 1
        L1e:
            monitor-exit(r0)
            return r1
        L20:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.B():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final List C() {
        Object obj = this.f;
        ?? r0 = obj;
        if (obj == null) {
            ArrayList arrayList = this.e;
            RandomAccess arrayList2 = arrayList.isEmpty() ? EmptyList.d : new ArrayList(arrayList);
            this.f = arrayList2;
            r0 = arrayList2;
        }
        return r0;
    }

    public final Object D(SuspendLambda suspendLambda) {
        Object objX = FlowKt.x(this.u, new Recomposer$join$2(2, null), suspendLambda);
        return objX == CoroutineSingletons.d ? objX : Unit.f24250a;
    }

    public final void E(CompositionImpl compositionImpl) {
        synchronized (this.b) {
            ArrayList arrayList = this.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((MovableContentStateReference) arrayList.get(i)).b().equals(compositionImpl)) {
                    ArrayList arrayList2 = new ArrayList();
                    F(arrayList2, this, compositionImpl);
                    while (!arrayList2.isEmpty()) {
                        G(arrayList2, null);
                        F(arrayList2, this, compositionImpl);
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x014b, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0150, code lost:
    
        if (r4 >= r3) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x015a, code lost:
    
        if (((kotlin.Pair) r10.get(r4)).e == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x015c, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x015f, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x016d, code lost:
    
        if (r9 >= r4) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x016f, code lost:
    
        r11 = (kotlin.Pair) r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0177, code lost:
    
        if (r11.e != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0179, code lost:
    
        r11 = (androidx.compose.runtime.MovableContentStateReference) r11.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0180, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0181, code lost:
    
        if (r11 == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0183, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0186, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0189, code lost:
    
        r4 = r16.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x018b, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018c, code lost:
    
        kotlin.collections.CollectionsKt.h(r3, r16.j);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0191, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0192, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01a0, code lost:
    
        if (r9 >= r4) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a2, code lost:
    
        r11 = r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ab, code lost:
    
        if (((kotlin.Pair) r11).e == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01ad, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b0, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01b3, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List G(java.util.List r17, androidx.collection.MutableScatterSet r18) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.G(java.util.List, androidx.collection.MutableScatterSet):java.util.List");
    }

    public final void H(Throwable th, CompositionImpl compositionImpl) throws Throwable {
        if (!((Boolean) z.get()).booleanValue() || (th instanceof ComposeRuntimeError)) {
            synchronized (this.b) {
                RecomposerErrorState recomposerErrorState = this.s;
                if (recomposerErrorState != null) {
                    throw recomposerErrorState.getF1658a();
                }
                this.s = new RecomposerErrorState(th);
            }
            throw th;
        }
        synchronized (this.b) {
            try {
                Utils_androidKt.a(th);
                this.i.clear();
                this.h.h();
                this.g = new MutableScatterSet();
                this.j.clear();
                this.k.g();
                this.m.g();
                this.s = new RecomposerErrorState(th);
                if (compositionImpl != null) {
                    I(compositionImpl);
                }
                z();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void I(ControlledComposition controlledComposition) {
        ArrayList arrayList = this.o;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.o = arrayList;
        }
        if (!arrayList.contains(controlledComposition)) {
            arrayList.add(controlledComposition);
        }
        if (this.e.remove(controlledComposition)) {
            this.f = null;
        }
    }

    public final Object J(SuspendLambda suspendLambda) throws Throwable {
        Object objF = BuildersKt.f(this.f1657a, new Recomposer$recompositionRunner$2(this, new Recomposer$runRecomposeAndApplyChanges$2(this, null), MonotonicFrameClockKt.a(suspendLambda.getE()), null), suspendLambda);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        Unit unit = Unit.f24250a;
        if (objF != coroutineSingletons) {
            objF = unit;
        }
        return objF == coroutineSingletons ? objF : unit;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final void a(CompositionImpl compositionImpl, ComposableLambdaImpl composableLambdaImpl) throws Throwable {
        boolean z2 = compositionImpl.v.E;
        try {
            MutableSnapshot mutableSnapshotG = Snapshot.Companion.g(new Recomposer$readObserverOf$1(compositionImpl), new Recomposer$writeObserverOf$1(null, compositionImpl));
            try {
                Snapshot snapshotJ = mutableSnapshotG.j();
                try {
                    compositionImpl.y(composableLambdaImpl);
                    if (!z2) {
                        SnapshotKt.k().m();
                    }
                    synchronized (this.b) {
                        if (((State) this.u.getValue()).compareTo(State.e) > 0 && !C().contains(compositionImpl)) {
                            this.e.add(compositionImpl);
                            this.f = null;
                        }
                    }
                    try {
                        E(compositionImpl);
                        try {
                            compositionImpl.n();
                            compositionImpl.i();
                            if (z2) {
                                return;
                            }
                            SnapshotKt.k().m();
                        } catch (Throwable th) {
                            H(th, null);
                        }
                    } catch (Throwable th2) {
                        H(th2, compositionImpl);
                    }
                } finally {
                    Snapshot.q(snapshotJ);
                }
            } finally {
                w(mutableSnapshotG);
            }
        } catch (Throwable th3) {
            H(th3, compositionImpl);
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final void b(MovableContentStateReference movableContentStateReference) {
        synchronized (this.b) {
            MultiValueMap.a(this.k, movableContentStateReference.getF1647a(), movableContentStateReference);
            if (movableContentStateReference.getH() != null) {
                y(this, movableContentStateReference, movableContentStateReference);
            }
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final boolean d() {
        return ((Boolean) z.get()).booleanValue();
    }

    @Override // androidx.compose.runtime.CompositionContext
    /* renamed from: e */
    public final boolean getB() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    /* renamed from: f */
    public final boolean getC() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    /* renamed from: h */
    public final int getF1626a() {
        return 1000;
    }

    @Override // androidx.compose.runtime.CompositionContext
    /* renamed from: i, reason: from getter */
    public final CoroutineContext getW() {
        return this.w;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final void k(MovableContentStateReference movableContentStateReference) {
        CancellableContinuation cancellableContinuationZ;
        synchronized (this.b) {
            this.j.add(movableContentStateReference);
            cancellableContinuationZ = z();
        }
        if (cancellableContinuationZ != null) {
            ((CancellableContinuationImpl) cancellableContinuationZ).resumeWith(Unit.f24250a);
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final void l(CompositionImpl compositionImpl) {
        CancellableContinuation cancellableContinuationZ;
        synchronized (this.b) {
            if (this.h.i(compositionImpl)) {
                cancellableContinuationZ = null;
            } else {
                this.h.c(compositionImpl);
                cancellableContinuationZ = z();
            }
        }
        if (cancellableContinuationZ != null) {
            ((CancellableContinuationImpl) cancellableContinuationZ).resumeWith(Unit.f24250a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    @Override // androidx.compose.runtime.CompositionContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(androidx.compose.runtime.MovableContentStateReference r18, androidx.compose.runtime.MovableContentState r19, androidx.compose.runtime.Applier r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            java.lang.Object r3 = r1.b
            monitor-enter(r3)
            androidx.collection.MutableScatterMap r4 = r1.m     // Catch: java.lang.Throwable -> L80
            r4.m(r0, r2)     // Catch: java.lang.Throwable -> L80
            androidx.collection.MutableScatterMap r4 = r1.n     // Catch: java.lang.Throwable -> L80
            java.lang.Object r0 = r4.e(r0)     // Catch: java.lang.Throwable -> L80
            if (r0 != 0) goto L1e
            androidx.collection.MutableObjectList r0 = androidx.collection.ObjectListKt.b     // Catch: java.lang.Throwable -> L80
            java.lang.String r4 = "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>"
            kotlin.jvm.internal.Intrinsics.f(r0, r4)     // Catch: java.lang.Throwable -> L80
            goto L31
        L1e:
            boolean r4 = r0 instanceof androidx.collection.MutableObjectList     // Catch: java.lang.Throwable -> L80
            if (r4 == 0) goto L25
            androidx.collection.ObjectList r0 = (androidx.collection.ObjectList) r0     // Catch: java.lang.Throwable -> L80
            goto L31
        L25:
            java.lang.Object[] r4 = androidx.collection.ObjectListKt.f695a     // Catch: java.lang.Throwable -> L80
            androidx.collection.MutableObjectList r4 = new androidx.collection.MutableObjectList     // Catch: java.lang.Throwable -> L80
            r5 = 1
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L80
            r4.g(r0)     // Catch: java.lang.Throwable -> L80
            r0 = r4
        L31:
            boolean r4 = r0.e()     // Catch: java.lang.Throwable -> L80
            if (r4 == 0) goto L8d
            r4 = r20
            androidx.collection.MutableScatterMap r0 = r2.b(r4, r0)     // Catch: java.lang.Throwable -> L80
            java.lang.Object[] r2 = r0.b     // Catch: java.lang.Throwable -> L80
            java.lang.Object[] r4 = r0.c     // Catch: java.lang.Throwable -> L80
            long[] r0 = r0.f698a     // Catch: java.lang.Throwable -> L80
            int r5 = r0.length     // Catch: java.lang.Throwable -> L80
            int r5 = r5 + (-2)
            if (r5 < 0) goto L8d
            r6 = 0
            r7 = r6
        L4a:
            r8 = r0[r7]     // Catch: java.lang.Throwable -> L80
            long r10 = ~r8     // Catch: java.lang.Throwable -> L80
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L88
            int r10 = r7 - r5
            int r10 = ~r10     // Catch: java.lang.Throwable -> L80
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L64:
            if (r12 >= r10) goto L86
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L82
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]     // Catch: java.lang.Throwable -> L80
            r13 = r4[r13]     // Catch: java.lang.Throwable -> L80
            androidx.compose.runtime.MovableContentState r13 = (androidx.compose.runtime.MovableContentState) r13     // Catch: java.lang.Throwable -> L80
            androidx.compose.runtime.MovableContentStateReference r14 = (androidx.compose.runtime.MovableContentStateReference) r14     // Catch: java.lang.Throwable -> L80
            androidx.collection.MutableScatterMap r15 = r1.m     // Catch: java.lang.Throwable -> L80
            r15.m(r14, r13)     // Catch: java.lang.Throwable -> L80
            goto L82
        L80:
            r0 = move-exception
            goto L8f
        L82:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L64
        L86:
            if (r10 != r11) goto L8d
        L88:
            if (r7 == r5) goto L8d
            int r7 = r7 + 1
            goto L4a
        L8d:
            monitor-exit(r3)
            return
        L8f:
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.m(androidx.compose.runtime.MovableContentStateReference, androidx.compose.runtime.MovableContentState, androidx.compose.runtime.Applier):void");
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final MovableContentState n(MovableContentStateReference movableContentStateReference) {
        MovableContentState movableContentState;
        synchronized (this.b) {
            movableContentState = (MovableContentState) this.m.k(movableContentStateReference);
        }
        return movableContentState;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final void o(Set set) {
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final void q(CompositionImpl compositionImpl) {
        synchronized (this.b) {
            try {
                LinkedHashSet linkedHashSet = this.p;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.p = linkedHashSet;
                }
                linkedHashSet.add(compositionImpl);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final void t(CompositionImpl compositionImpl) {
        synchronized (this.b) {
            if (this.e.remove(compositionImpl)) {
                this.f = null;
            }
            this.h.k(compositionImpl);
            this.i.remove(compositionImpl);
        }
    }

    public final void x() {
        synchronized (this.b) {
            if (((State) this.u.getValue()).compareTo(State.h) >= 0) {
                this.u.setValue(State.e);
            }
        }
        this.v.cancel((CancellationException) null);
    }

    public final CancellableContinuation z() throws DispatchException {
        State state;
        MutableStateFlow mutableStateFlow = this.u;
        int iCompareTo = ((State) mutableStateFlow.getValue()).compareTo(State.e);
        ArrayList arrayList = this.j;
        ArrayList arrayList2 = this.i;
        MutableVector mutableVector = this.h;
        if (iCompareTo <= 0) {
            this.e.clear();
            this.f = EmptyList.d;
            this.g = new MutableScatterSet();
            mutableVector.h();
            arrayList2.clear();
            arrayList.clear();
            this.o = null;
            CancellableContinuationImpl cancellableContinuationImpl = this.q;
            if (cancellableContinuationImpl != null) {
                cancellableContinuationImpl.cancel(null);
            }
            this.q = null;
            this.s = null;
            return null;
        }
        if (this.s != null) {
            state = State.f;
        } else if (this.c == null) {
            this.g = new MutableScatterSet();
            mutableVector.h();
            state = A() ? State.g : State.f;
        } else {
            state = (mutableVector.f == 0 && !this.g.d() && arrayList2.isEmpty() && arrayList.isEmpty() && !A()) ? State.h : State.i;
        }
        mutableStateFlow.setValue(state);
        if (state != State.i) {
            return null;
        }
        CancellableContinuationImpl cancellableContinuationImpl2 = this.q;
        this.q = null;
        return cancellableContinuationImpl2;
    }
}
