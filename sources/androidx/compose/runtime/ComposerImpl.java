package androidx.compose.runtime;

import android.os.Trace;
import androidx.collection.MutableIntIntMap;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.changelist.ChangeList;
import androidx.compose.runtime.changelist.ComposerChangeListWriter;
import androidx.compose.runtime.changelist.FixupList;
import androidx.compose.runtime.changelist.Operation;
import androidx.compose.runtime.changelist.Operations;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Utils_jvmKt;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/ComposerImpl;", "Landroidx/compose/runtime/Composer;", "CompositionContextHolder", "CompositionContextImpl", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ComposerImpl implements Composer {
    public int A;
    public boolean B;
    public final ComposerImpl$derivedStateObserver$1 C;
    public final ArrayList D;
    public boolean E;
    public SlotReader F;
    public SlotTable G;
    public SlotWriter H;
    public boolean I;
    public PersistentCompositionLocalMap J;
    public ChangeList K;
    public final ComposerChangeListWriter L;
    public Anchor M;
    public FixupList N;
    public boolean O;
    public int P;
    public CompositionDataImpl Q;

    /* renamed from: a, reason: collision with root package name */
    public final AbstractApplier f1625a;
    public final CompositionContext b;
    public final SlotTable c;
    public final Set d;
    public final ChangeList e;
    public final ChangeList f;
    public final CompositionImpl g;
    public Pending i;
    public int j;
    public int k;
    public int l;
    public int[] n;
    public MutableIntIntMap o;
    public boolean p;
    public boolean q;
    public MutableIntObjectMap u;
    public boolean v;
    public boolean x;
    public int z;
    public final ArrayList h = new ArrayList();
    public final IntStack m = new IntStack();
    public final ArrayList r = new ArrayList();
    public final IntStack s = new IntStack();
    public PersistentCompositionLocalMap t = PersistentCompositionLocalHashMap.i;
    public final IntStack w = new IntStack();
    public int y = -1;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/ComposerImpl$CompositionContextHolder;", "Landroidx/compose/runtime/ReusableRememberObserver;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CompositionContextHolder implements ReusableRememberObserver {
        public final CompositionContextImpl d;

        public CompositionContextHolder(CompositionContextImpl compositionContextImpl) {
            this.d = compositionContextImpl;
        }

        @Override // androidx.compose.runtime.RememberObserver
        public final void c() {
        }

        @Override // androidx.compose.runtime.RememberObserver
        public final void g() {
            this.d.u();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public final void i() {
            this.d.u();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "Landroidx/compose/runtime/CompositionContext;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public final class CompositionContextImpl extends CompositionContext {

        /* renamed from: a, reason: collision with root package name */
        public final int f1626a;
        public final boolean b;
        public final boolean c;
        public final CompositionObserverHolder d;
        public HashSet e;
        public final LinkedHashSet f = new LinkedHashSet();
        public final MutableState g = new ParcelableSnapshotMutableState(PersistentCompositionLocalHashMap.i, ReferentialEqualityPolicy.f1660a);

        public CompositionContextImpl(int i, boolean z, boolean z2, CompositionObserverHolder compositionObserverHolder) {
            this.f1626a = i;
            this.b = z;
            this.c = z2;
            this.d = compositionObserverHolder;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void a(CompositionImpl compositionImpl, ComposableLambdaImpl composableLambdaImpl) {
            ComposerImpl.this.b.a(compositionImpl, composableLambdaImpl);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void b(MovableContentStateReference movableContentStateReference) {
            ComposerImpl.this.b.b(movableContentStateReference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void c() {
            ComposerImpl composerImpl = ComposerImpl.this;
            composerImpl.z--;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final boolean d() {
            return ComposerImpl.this.b.d();
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* renamed from: e, reason: from getter */
        public final boolean getB() {
            return this.b;
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* renamed from: f, reason: from getter */
        public final boolean getC() {
            return this.c;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final PersistentCompositionLocalMap g() {
            return (PersistentCompositionLocalMap) ((SnapshotMutableStateImpl) this.g).getD();
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* renamed from: h, reason: from getter */
        public final int getF1626a() {
            return this.f1626a;
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* renamed from: i */
        public final CoroutineContext getW() {
            return ComposerImpl.this.b.getW();
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* renamed from: j, reason: from getter */
        public final CompositionObserverHolder getD() {
            return this.d;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void k(MovableContentStateReference movableContentStateReference) {
            ComposerImpl.this.b.k(movableContentStateReference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void l(CompositionImpl compositionImpl) {
            ComposerImpl composerImpl = ComposerImpl.this;
            CompositionContext compositionContext = composerImpl.b;
            compositionContext.l(composerImpl.g);
            compositionContext.l(compositionImpl);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void m(MovableContentStateReference movableContentStateReference, MovableContentState movableContentState, Applier applier) {
            ComposerImpl.this.b.m(movableContentStateReference, movableContentState, applier);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final MovableContentState n(MovableContentStateReference movableContentStateReference) {
            return ComposerImpl.this.b.n(movableContentStateReference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void o(Set set) {
            HashSet hashSet = this.e;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.e = hashSet;
            }
            hashSet.add(set);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void p(ComposerImpl composerImpl) {
            this.f.add(composerImpl);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void q(CompositionImpl compositionImpl) {
            ComposerImpl.this.b.q(compositionImpl);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void r() {
            ComposerImpl.this.z++;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void s(Composer composer) {
            HashSet hashSet = this.e;
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Set set = (Set) it.next();
                    Intrinsics.f(composer, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                    set.remove(((ComposerImpl) composer).c);
                }
            }
            TypeIntrinsics.a(this.f).remove(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void t(CompositionImpl compositionImpl) {
            ComposerImpl.this.b.t(compositionImpl);
        }

        public final void u() {
            LinkedHashSet<ComposerImpl> linkedHashSet = this.f;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            HashSet hashSet = this.e;
            if (hashSet != null) {
                for (ComposerImpl composerImpl : linkedHashSet) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((Set) it.next()).remove(composerImpl.c);
                    }
                }
            }
            linkedHashSet.clear();
        }
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [androidx.compose.runtime.ComposerImpl$derivedStateObserver$1] */
    public ComposerImpl(AbstractApplier abstractApplier, CompositionContext compositionContext, SlotTable slotTable, Set set, ChangeList changeList, ChangeList changeList2, CompositionImpl compositionImpl) {
        this.f1625a = abstractApplier;
        this.b = compositionContext;
        this.c = slotTable;
        this.d = set;
        this.e = changeList;
        this.f = changeList2;
        this.g = compositionImpl;
        this.B = compositionContext.getC() || compositionContext.d();
        this.C = new DerivedStateObserver() { // from class: androidx.compose.runtime.ComposerImpl$derivedStateObserver$1
            @Override // androidx.compose.runtime.DerivedStateObserver
            public final void a() {
                ComposerImpl composerImpl = this.f1627a;
                composerImpl.z--;
            }

            @Override // androidx.compose.runtime.DerivedStateObserver
            public final void start() {
                this.f1627a.z++;
            }
        };
        this.D = new ArrayList();
        SlotReader slotReaderL = slotTable.l();
        slotReaderL.c();
        this.F = slotReaderL;
        SlotTable slotTable2 = new SlotTable();
        if (compositionContext.getC()) {
            slotTable2.k();
        }
        if (compositionContext.d()) {
            slotTable2.n = new MutableIntObjectMap();
        }
        this.G = slotTable2;
        SlotWriter slotWriterM = slotTable2.m();
        slotWriterM.e(true);
        this.H = slotWriterM;
        this.L = new ComposerChangeListWriter(this, changeList);
        SlotReader slotReaderL2 = this.G.l();
        try {
            Anchor anchorA = slotReaderL2.a(0);
            slotReaderL2.c();
            this.M = anchorA;
            this.N = new FixupList();
        } catch (Throwable th) {
            slotReaderL2.c();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.runtime.MovableContentStateReference o0(androidx.compose.runtime.ComposerImpl r14, int r15) {
        /*
            androidx.compose.runtime.SlotReader r0 = r14.F
            int[] r1 = r0.b
            int r2 = r15 * 5
            r3 = r1[r2]
            java.lang.Object r0 = r0.n(r15, r1)
            r1 = 126665345(0x78cc281, float:2.1179178E-34)
            r4 = 0
            if (r3 != r1) goto Lad
            boolean r0 = r0 instanceof androidx.compose.runtime.MovableContent
            if (r0 == 0) goto Lad
            androidx.compose.runtime.SlotReader r0 = r14.F
            boolean r0 = r0.d(r15)
            if (r0 == 0) goto L2e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            p0(r14, r0, r15)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L2e
            r13 = r0
            goto L2f
        L2e:
            r13 = r4
        L2f:
            androidx.compose.runtime.SlotReader r0 = r14.F
            int[] r1 = r0.b
            java.lang.Object r0 = r0.n(r15, r1)
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>"
            kotlin.jvm.internal.Intrinsics.f(r0, r1)
            r6 = r0
            androidx.compose.runtime.MovableContent r6 = (androidx.compose.runtime.MovableContent) r6
            androidx.compose.runtime.SlotReader r0 = r14.F
            r1 = 0
            java.lang.Object r7 = r0.h(r15, r1)
            androidx.compose.runtime.SlotReader r0 = r14.F
            androidx.compose.runtime.Anchor r10 = r0.a(r15)
            androidx.compose.runtime.SlotReader r0 = r14.F
            int[] r0 = r0.b
            int r2 = r2 + 3
            r0 = r0[r2]
            int r0 = r0 + r15
            java.util.ArrayList r2 = r14.r
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = androidx.compose.runtime.ComposerKt.g(r15, r2)
            if (r4 >= 0) goto L65
            int r4 = r4 + 1
            int r4 = -r4
        L65:
            int r5 = r2.size()
            if (r4 >= r5) goto L7b
            java.lang.Object r5 = r2.get(r4)
            androidx.compose.runtime.Invalidation r5 = (androidx.compose.runtime.Invalidation) r5
            int r8 = r5.b
            if (r8 >= r0) goto L7b
            r3.add(r5)
            int r4 = r4 + 1
            goto L65
        L7b:
            java.util.ArrayList r11 = new java.util.ArrayList
            int r0 = r3.size()
            r11.<init>(r0)
            int r0 = r3.size()
        L88:
            if (r1 >= r0) goto L9f
            java.lang.Object r2 = r3.get(r1)
            androidx.compose.runtime.Invalidation r2 = (androidx.compose.runtime.Invalidation) r2
            androidx.compose.runtime.RecomposeScopeImpl r4 = r2.f1640a
            java.lang.Object r2 = r2.c
            kotlin.Pair r5 = new kotlin.Pair
            r5.<init>(r4, r2)
            r11.add(r5)
            int r1 = r1 + 1
            goto L88
        L9f:
            androidx.compose.runtime.MovableContentStateReference r5 = new androidx.compose.runtime.MovableContentStateReference
            androidx.compose.runtime.CompositionImpl r8 = r14.g
            androidx.compose.runtime.SlotTable r9 = r14.c
            androidx.compose.runtime.PersistentCompositionLocalMap r12 = r14.R(r15)
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            return r5
        Lad:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.o0(androidx.compose.runtime.ComposerImpl, int):androidx.compose.runtime.MovableContentStateReference");
    }

    public static final void p0(ComposerImpl composerImpl, ArrayList arrayList, int i) {
        int i2 = composerImpl.F.b[(i * 5) + 3] + i;
        int i3 = i + 1;
        while (i3 < i2) {
            SlotReader slotReader = composerImpl.F;
            int i4 = i3 * 5;
            if ((slotReader.b[i4 + 1] & 134217728) != 0) {
                MovableContentStateReference movableContentStateReferenceO0 = o0(composerImpl, i3);
                if (movableContentStateReferenceO0 != null) {
                    arrayList.add(movableContentStateReferenceO0);
                }
            } else if (slotReader.d(i3)) {
                p0(composerImpl, arrayList, i3);
            }
            i3 += composerImpl.F.b[i4 + 3];
        }
    }

    public static final int q0(ComposerImpl composerImpl, int i, int i2, boolean z, int i3) {
        SlotReader slotReader = composerImpl.F;
        CompositionContext compositionContext = composerImpl.b;
        ComposerChangeListWriter composerChangeListWriter = composerImpl.L;
        int[] iArr = slotReader.b;
        int i4 = i2 * 5;
        if ((iArr[i4 + 1] & 134217728) != 0) {
            int i5 = iArr[i4];
            Object objN = slotReader.n(i2, iArr);
            if (i5 == 126665345 && (objN instanceof MovableContent)) {
                MovableContentStateReference movableContentStateReferenceO0 = o0(composerImpl, i2);
                if (movableContentStateReferenceO0 != null) {
                    compositionContext.b(movableContentStateReferenceO0);
                    composerChangeListWriter.e();
                    CompositionImpl compositionImpl = composerImpl.g;
                    CompositionContext compositionContext2 = composerImpl.b;
                    Operations operations = composerChangeListWriter.b.f1672a;
                    operations.g(Operation.ReleaseMovableGroupAtCurrent.c);
                    Operations.WriteScope.c(operations, compositionImpl, compositionContext2, movableContentStateReferenceO0);
                }
                if (!z || i2 == i) {
                    return slotReader.m(i2);
                }
                composerChangeListWriter.c();
                composerChangeListWriter.b();
                ComposerImpl composerImpl2 = composerChangeListWriter.f1673a;
                int iM = composerImpl2.F.j(i2) ? 1 : composerImpl2.F.m(i2);
                if (iM > 0) {
                    composerChangeListWriter.f(i3, iM);
                }
                return 0;
            }
            if (i5 == 206 && Intrinsics.c(objN, ComposerKt.e)) {
                Object objH = slotReader.h(i2, 0);
                CompositionContextHolder compositionContextHolder = objH instanceof CompositionContextHolder ? (CompositionContextHolder) objH : null;
                if (compositionContextHolder != null) {
                    for (ComposerImpl composerImpl3 : compositionContextHolder.d.f) {
                        SlotTable slotTable = composerImpl3.c;
                        if (slotTable.e > 0 && (slotTable.d[1] & 67108864) != 0) {
                            CompositionImpl compositionImpl2 = composerImpl3.g;
                            synchronized (compositionImpl2.g) {
                                compositionImpl2.B();
                                MutableScatterMap mutableScatterMap = compositionImpl2.q;
                                compositionImpl2.q = ScopeMap.c();
                                try {
                                    compositionImpl2.v.A0(mutableScatterMap);
                                } catch (Exception e) {
                                    compositionImpl2.q = mutableScatterMap;
                                    throw e;
                                }
                            }
                            ChangeList changeList = new ChangeList();
                            composerImpl3.K = changeList;
                            SlotReader slotReaderL = composerImpl3.c.l();
                            try {
                                composerImpl3.F = slotReaderL;
                                ComposerChangeListWriter composerChangeListWriter2 = composerImpl3.L;
                                ChangeList changeList2 = composerChangeListWriter2.b;
                                try {
                                    composerChangeListWriter2.b = changeList;
                                    composerImpl3.n0(0);
                                    ComposerChangeListWriter composerChangeListWriter3 = composerImpl3.L;
                                    composerChangeListWriter3.b();
                                    if (composerChangeListWriter3.c) {
                                        composerChangeListWriter3.b.f1672a.g(Operation.SkipToEndOfCurrentGroup.c);
                                        if (composerChangeListWriter3.c) {
                                            composerChangeListWriter3.d(false);
                                            composerChangeListWriter3.d(false);
                                            composerChangeListWriter3.b.f1672a.g(Operation.EndCurrentGroup.c);
                                            composerChangeListWriter3.c = false;
                                        }
                                    }
                                } finally {
                                }
                            } finally {
                                slotReaderL.c();
                            }
                        }
                        compositionContext.q(composerImpl3.g);
                    }
                }
                return slotReader.m(i2);
            }
            if (!slotReader.j(i2)) {
                return slotReader.m(i2);
            }
        } else if (slotReader.d(i2)) {
            int i6 = iArr[i4 + 3] + i2;
            int iQ0 = 0;
            for (int i7 = i2 + 1; i7 < i6; i7 += iArr[(i7 * 5) + 3]) {
                boolean zJ = slotReader.j(i7);
                if (zJ) {
                    composerChangeListWriter.c();
                    Object objL = slotReader.l(i7);
                    composerChangeListWriter.c();
                    composerChangeListWriter.h.add(objL);
                }
                iQ0 += q0(composerImpl, i, i7, zJ || z, zJ ? 0 : i3 + iQ0);
                if (zJ) {
                    composerChangeListWriter.c();
                    composerChangeListWriter.a();
                }
            }
            if (!slotReader.j(i2)) {
                return iQ0;
            }
        } else if (!slotReader.j(i2)) {
            return slotReader.m(i2);
        }
        return 1;
    }

    @Override // androidx.compose.runtime.Composer
    public final void A(Object obj) {
        int i;
        SlotReader slotReader;
        int i2;
        SlotWriter slotWriter;
        if (obj instanceof RememberObserver) {
            RememberObserver rememberObserver = (RememberObserver) obj;
            Anchor anchorA = null;
            if (this.O) {
                SlotWriter slotWriter2 = this.H;
                int i3 = slotWriter2.t;
                if (i3 > slotWriter2.v + 1) {
                    int i4 = i3 - 1;
                    int iE = slotWriter2.E(i4, slotWriter2.b);
                    while (true) {
                        i2 = i4;
                        i4 = iE;
                        slotWriter = this.H;
                        if (i4 == slotWriter.v || i4 < 0) {
                            break;
                        } else {
                            iE = slotWriter.E(i4, slotWriter.b);
                        }
                    }
                    anchorA = slotWriter.b(i2);
                }
            } else {
                SlotReader slotReader2 = this.F;
                int i5 = slotReader2.g;
                if (i5 > slotReader2.i + 1) {
                    int i6 = i5 - 1;
                    int iO = slotReader2.o(i6);
                    while (true) {
                        i = i6;
                        i6 = iO;
                        slotReader = this.F;
                        if (i6 == slotReader.i || i6 < 0) {
                            break;
                        } else {
                            iO = slotReader.o(i6);
                        }
                    }
                    anchorA = slotReader.a(i);
                }
            }
            RememberObserverHolder rememberObserverHolder = new RememberObserverHolder(rememberObserver, anchorA);
            if (this.O) {
                Operations operations = this.L.b.f1672a;
                operations.g(Operation.Remember.c);
                Operations.WriteScope.a(operations, 0, rememberObserverHolder);
            }
            this.d.add(obj);
            obj = rememberObserverHolder;
        }
        D0(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0(androidx.collection.MutableScatterMap r18) {
        /*
            r17 = this;
            r0 = r18
            java.lang.Object[] r1 = r0.b
            java.lang.Object[] r2 = r0.c
            long[] r0 = r0.f698a
            int r3 = r0.length
            int r3 = r3 + (-2)
            r4 = r17
            java.util.ArrayList r5 = r4.r
            if (r3 < 0) goto L63
            r7 = 0
        L12:
            r8 = r0[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L5e
            int r10 = r7 - r3
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L2c:
            if (r12 >= r10) goto L5c
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L58
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r1[r13]
            r13 = r2[r13]
            java.lang.String r15 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            kotlin.jvm.internal.Intrinsics.f(r14, r15)
            androidx.compose.runtime.RecomposeScopeImpl r14 = (androidx.compose.runtime.RecomposeScopeImpl) r14
            androidx.compose.runtime.Anchor r15 = r14.c
            if (r15 == 0) goto L58
            int r15 = r15.f1619a
            androidx.compose.runtime.ScopeInvalidated r6 = androidx.compose.runtime.ScopeInvalidated.f1663a
            if (r13 != r6) goto L50
            r13 = 0
        L50:
            androidx.compose.runtime.Invalidation r6 = new androidx.compose.runtime.Invalidation
            r6.<init>(r14, r15, r13)
            r5.add(r6)
        L58:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2c
        L5c:
            if (r10 != r11) goto L63
        L5e:
            if (r7 == r3) goto L63
            int r7 = r7 + 1
            goto L12
        L63:
            androidx.compose.runtime.a r0 = androidx.compose.runtime.ComposerKt.f
            kotlin.collections.CollectionsKt.s0(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.A0(androidx.collection.MutableScatterMap):void");
    }

    @Override // androidx.compose.runtime.Composer
    public final void B(MovableContent movableContent, Object obj) {
        Intrinsics.f(movableContent, "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        e0(movableContent, Q(), obj, false);
    }

    public final void B0(int i, int i2) {
        if (E0(i) != i2) {
            if (i < 0) {
                MutableIntIntMap mutableIntIntMap = this.o;
                if (mutableIntIntMap == null) {
                    mutableIntIntMap = new MutableIntIntMap();
                    this.o = mutableIntIntMap;
                }
                mutableIntIntMap.f(i, i2);
                return;
            }
            int[] iArr = this.n;
            if (iArr == null) {
                iArr = new int[this.F.c];
                ArraysKt.C(-1, 0, 6, iArr);
                this.n = iArr;
            }
            iArr[i] = i2;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public final void C() {
        this.p = true;
        this.B = true;
        this.c.k();
        this.G.k();
        SlotWriter slotWriter = this.H;
        SlotTable slotTable = slotWriter.f1667a;
        slotWriter.e = slotTable.m;
        slotWriter.f = slotTable.n;
    }

    public final void C0(int i, int i2) {
        int iE0 = E0(i);
        if (iE0 != i2) {
            int i3 = i2 - iE0;
            ArrayList arrayList = this.h;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int iE02 = E0(i) + i3;
                B0(i, iE02);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        Pending pending = (Pending) arrayList.get(i4);
                        if (pending != null && pending.a(i, iE02)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                if (i < 0) {
                    i = this.F.i;
                } else if (this.F.j(i)) {
                    return;
                } else {
                    i = this.F.o(i);
                }
            }
        }
    }

    @Override // androidx.compose.runtime.Composer
    public final RecomposeScopeImpl D() {
        return b0();
    }

    public final void D0(Object obj) {
        if (this.O) {
            this.H.S(obj);
            return;
        }
        SlotReader slotReader = this.F;
        boolean z = slotReader.n;
        ComposerChangeListWriter composerChangeListWriter = this.L;
        if (!z) {
            Anchor anchorA = slotReader.a(slotReader.i);
            Operations operations = composerChangeListWriter.b.f1672a;
            operations.g(Operation.AppendValue.c);
            Operations.WriteScope.b(operations, 0, anchorA, 1, obj);
            return;
        }
        int iD = (slotReader.l - SlotTableKt.d(slotReader.i, slotReader.b)) - 1;
        if (composerChangeListWriter.f1673a.F.i - composerChangeListWriter.f >= 0) {
            composerChangeListWriter.d(true);
            Operations operations2 = composerChangeListWriter.b.f1672a;
            operations2.g(Operation.UpdateValue.c);
            Operations.WriteScope.a(operations2, 0, obj);
            operations2.c[operations2.d - operations2.f1676a[operations2.b - 1].f1675a] = iD;
            return;
        }
        SlotReader slotReader2 = this.F;
        Anchor anchorA2 = slotReader2.a(slotReader2.i);
        Operations operations3 = composerChangeListWriter.b.f1672a;
        operations3.g(Operation.UpdateAnchoredValue.c);
        Operations.WriteScope.b(operations3, 0, obj, 1, anchorA2);
        operations3.c[operations3.d - operations3.f1676a[operations3.b - 1].f1675a] = iD;
    }

    @Override // androidx.compose.runtime.Composer
    public final void E() {
        if (this.x && this.F.i == this.y) {
            this.y = -1;
            this.x = false;
        }
        V(false);
    }

    public final int E0(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.n;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.F.m(i) : i2;
        }
        MutableIntIntMap mutableIntIntMap = this.o;
        if (mutableIntIntMap == null || mutableIntIntMap.a(i) < 0) {
            return 0;
        }
        int iA = mutableIntIntMap.a(i);
        if (iA >= 0) {
            return mutableIntIntMap.c[iA];
        }
        RuntimeHelpersKt.d("Cannot find value for key " + i);
        throw null;
    }

    @Override // androidx.compose.runtime.Composer
    public final void F(int i) {
        t0(null, i, 0, null);
    }

    @Override // androidx.compose.runtime.Composer
    public final Object G() {
        boolean z = this.O;
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
        if (!z) {
            Object objK = this.F.k();
            if (!this.x || (objK instanceof ReusableRememberObserver)) {
                return objK instanceof RememberObserverHolder ? ((RememberObserverHolder) objK).f1662a : objK;
            }
        } else if (this.q) {
            ComposerKt.c("A call to createNode(), emitNode() or useNode() expected");
            return composer$Companion$Empty$1;
        }
        return composer$Companion$Empty$1;
    }

    @Override // androidx.compose.runtime.Composer
    public final CompositionData H() {
        CompositionDataImpl compositionDataImpl = this.Q;
        if (compositionDataImpl != null) {
            return compositionDataImpl;
        }
        CompositionDataImpl compositionDataImpl2 = new CompositionDataImpl(this.g);
        this.Q = compositionDataImpl2;
        return compositionDataImpl2;
    }

    @Override // androidx.compose.runtime.Composer
    public final boolean I(Object obj) {
        if (f0() == obj) {
            return false;
        }
        D0(obj);
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public final void J(int i, Object obj) {
        t0(obj, i, 0, null);
    }

    @Override // androidx.compose.runtime.Composer
    public final void K(Function0 function0) {
        if (!this.q) {
            ComposerKt.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.q = false;
        if (!this.O) {
            ComposerKt.c("createNode() can only be called when inserting");
        }
        IntStack intStack = this.m;
        int i = intStack.f1639a[intStack.b - 1];
        SlotWriter slotWriter = this.H;
        Anchor anchorB = slotWriter.b(slotWriter.v);
        this.k++;
        FixupList fixupList = this.N;
        Operations operations = fixupList.f1674a;
        operations.g(Operation.InsertNodeFixup.c);
        Operations.WriteScope.a(operations, 0, function0);
        operations.c[operations.d - operations.f1676a[operations.b - 1].f1675a] = i;
        Operations.WriteScope.a(operations, 1, anchorB);
        Operations operations2 = fixupList.b;
        operations2.g(Operation.PostInsertNodeFixup.c);
        operations2.c[operations2.d - operations2.f1676a[operations2.b - 1].f1675a] = i;
        Operations.WriteScope.a(operations2, 0, anchorB);
    }

    @Override // androidx.compose.runtime.Composer
    /* renamed from: L, reason: from getter */
    public final int getP() {
        return this.P;
    }

    @Override // androidx.compose.runtime.Composer
    public final void M() {
        V(false);
    }

    @Override // androidx.compose.runtime.Composer
    public final void N() {
        V(false);
    }

    public final void O() {
        P();
        this.h.clear();
        this.m.b = 0;
        this.s.b = 0;
        this.w.b = 0;
        this.u = null;
        FixupList fixupList = this.N;
        fixupList.b.b();
        fixupList.f1674a.b();
        this.P = 0;
        this.z = 0;
        this.q = false;
        this.O = false;
        this.x = false;
        this.E = false;
        this.y = -1;
        SlotReader slotReader = this.F;
        if (!slotReader.f) {
            slotReader.c();
        }
        if (this.H.w) {
            return;
        }
        a0();
    }

    public final void P() {
        this.i = null;
        this.j = 0;
        this.k = 0;
        this.P = 0;
        this.q = false;
        ComposerChangeListWriter composerChangeListWriter = this.L;
        composerChangeListWriter.c = false;
        composerChangeListWriter.d.b = 0;
        composerChangeListWriter.f = 0;
        this.D.clear();
        this.n = null;
        this.o = null;
    }

    public final PersistentCompositionLocalMap Q() {
        PersistentCompositionLocalMap persistentCompositionLocalMap = this.J;
        return persistentCompositionLocalMap != null ? persistentCompositionLocalMap : R(this.F.i);
    }

    public final PersistentCompositionLocalMap R(int i) {
        PersistentCompositionLocalMap persistentCompositionLocalMap;
        boolean z = this.O;
        OpaqueKey opaqueKey = ComposerKt.c;
        if (z && this.I) {
            int iE = this.H.v;
            while (iE > 0) {
                SlotWriter slotWriter = this.H;
                if (slotWriter.b[slotWriter.q(iE) * 5] == 202 && Intrinsics.c(this.H.r(iE), opaqueKey)) {
                    Object objP = this.H.p(iE);
                    Intrinsics.f(objP, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    PersistentCompositionLocalMap persistentCompositionLocalMap2 = (PersistentCompositionLocalMap) objP;
                    this.J = persistentCompositionLocalMap2;
                    return persistentCompositionLocalMap2;
                }
                SlotWriter slotWriter2 = this.H;
                iE = slotWriter2.E(iE, slotWriter2.b);
            }
        }
        if (this.F.c > 0) {
            while (i > 0) {
                SlotReader slotReader = this.F;
                int[] iArr = slotReader.b;
                if (iArr[i * 5] == 202 && Intrinsics.c(slotReader.n(i, iArr), opaqueKey)) {
                    MutableIntObjectMap mutableIntObjectMap = this.u;
                    if (mutableIntObjectMap == null || (persistentCompositionLocalMap = (PersistentCompositionLocalMap) mutableIntObjectMap.b(i)) == null) {
                        SlotReader slotReader2 = this.F;
                        Object objB = slotReader2.b(i, slotReader2.b);
                        Intrinsics.f(objB, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        persistentCompositionLocalMap = (PersistentCompositionLocalMap) objB;
                    }
                    this.J = persistentCompositionLocalMap;
                    return persistentCompositionLocalMap;
                }
                i = this.F.o(i);
            }
        }
        PersistentCompositionLocalMap persistentCompositionLocalMap3 = this.t;
        this.J = persistentCompositionLocalMap3;
        return persistentCompositionLocalMap3;
    }

    public final void S(MutableScatterMap mutableScatterMap, ComposableLambdaImpl composableLambdaImpl) {
        ArrayList arrayList = this.r;
        if (this.E) {
            ComposerKt.c("Reentrant composition is not supported");
        }
        Trace.beginSection("Compose:recompose");
        try {
            this.A = Long.hashCode(SnapshotKt.k().getB());
            this.u = null;
            A0(mutableScatterMap);
            this.j = 0;
            this.E = true;
            try {
                y0();
                Object objF0 = f0();
                if (objF0 != composableLambdaImpl && composableLambdaImpl != null) {
                    D0(composableLambdaImpl);
                }
                ComposerImpl$derivedStateObserver$1 composerImpl$derivedStateObserver$1 = this.C;
                MutableVector mutableVectorB = SnapshotStateKt.b();
                try {
                    mutableVectorB.c(composerImpl$derivedStateObserver$1);
                    OpaqueKey opaqueKey = ComposerKt.f1628a;
                    if (composableLambdaImpl != null) {
                        v0(200, opaqueKey);
                        Utils_jvmKt.a(this, composableLambdaImpl);
                        V(false);
                    } else if (!this.v || objF0 == null || objF0.equals(Composer.Companion.f1624a)) {
                        r0();
                    } else {
                        v0(200, opaqueKey);
                        TypeIntrinsics.d(2, objF0);
                        Utils_jvmKt.a(this, (Function2) objF0);
                        V(false);
                    }
                    mutableVectorB.l(mutableVectorB.f - 1);
                    Y();
                    this.E = false;
                    arrayList.clear();
                    if (!this.H.w) {
                        ComposerKt.c("Check failed");
                    }
                    a0();
                } catch (Throwable th) {
                    mutableVectorB.l(mutableVectorB.f - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                this.E = false;
                arrayList.clear();
                O();
                if (!this.H.w) {
                    ComposerKt.c("Check failed");
                }
                a0();
                throw th2;
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void T(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        T(this.F.o(i), i2);
        if (this.F.j(i)) {
            Object objL = this.F.l(i);
            ComposerChangeListWriter composerChangeListWriter = this.L;
            composerChangeListWriter.c();
            composerChangeListWriter.h.add(objL);
        }
    }

    public final void U() {
        this.x = this.y >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03a8  */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V(boolean r43) {
        /*
            Method dump skipped, instructions count: 1391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.V(boolean):void");
    }

    public final void W() {
        V(false);
        RecomposeScopeImpl recomposeScopeImplB0 = b0();
        if (recomposeScopeImplB0 != null) {
            int i = recomposeScopeImplB0.f1656a;
            if ((i & 1) != 0) {
                recomposeScopeImplB0.f1656a = i | 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b A[EDGE_INSN: B:57:0x007b->B:28:0x007b BREAK  A[LOOP:0: B:15:0x0037->B:27:0x0078], EDGE_INSN: B:58:0x007b->B:28:0x007b BREAK  A[LOOP:0: B:15:0x0037->B:27:0x0078]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.runtime.RecomposeScopeImpl X() {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.X():androidx.compose.runtime.RecomposeScopeImpl");
    }

    public final void Y() {
        V(false);
        this.b.c();
        V(false);
        ComposerChangeListWriter composerChangeListWriter = this.L;
        if (composerChangeListWriter.c) {
            composerChangeListWriter.d(false);
            composerChangeListWriter.d(false);
            composerChangeListWriter.b.f1672a.g(Operation.EndCurrentGroup.c);
            composerChangeListWriter.c = false;
        }
        composerChangeListWriter.b();
        if (composerChangeListWriter.d.b != 0) {
            ComposerKt.c("Missed recording an endGroup()");
        }
        if (!this.h.isEmpty()) {
            ComposerKt.c("Start/end imbalance");
        }
        P();
        this.F.c();
        this.v = this.w.b() != 0;
    }

    public final void Z(boolean z, Pending pending) {
        this.h.add(this.i);
        this.i = pending;
        int i = this.k;
        IntStack intStack = this.m;
        intStack.c(i);
        intStack.c(this.l);
        intStack.c(this.j);
        if (z) {
            this.j = 0;
        }
        this.k = 0;
        this.l = 0;
    }

    @Override // androidx.compose.runtime.Composer
    public final void a(Object obj, Function2 function2) {
        if (this.O) {
            Operations operations = this.N.f1674a;
            operations.g(Operation.UpdateNode.c);
            Operations.WriteScope.a(operations, 0, obj);
            Intrinsics.f(function2, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
            TypeIntrinsics.d(2, function2);
            Operations.WriteScope.a(operations, 1, function2);
            return;
        }
        ComposerChangeListWriter composerChangeListWriter = this.L;
        composerChangeListWriter.b();
        Operations operations2 = composerChangeListWriter.b.f1672a;
        operations2.g(Operation.UpdateNode.c);
        Intrinsics.f(function2, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        TypeIntrinsics.d(2, function2);
        Operations.WriteScope.b(operations2, 0, obj, 1, function2);
    }

    public final void a0() {
        SlotTable slotTable = new SlotTable();
        if (this.B) {
            slotTable.k();
        }
        if (this.b.d()) {
            slotTable.n = new MutableIntObjectMap();
        }
        this.G = slotTable;
        SlotWriter slotWriterM = slotTable.m();
        slotWriterM.e(true);
        this.H = slotWriterM;
    }

    @Override // androidx.compose.runtime.Composer
    public final void b(boolean z) {
        if (this.k != 0) {
            ComposerKt.c("No nodes can be emitted before calling dactivateToEndGroup");
        }
        if (this.O) {
            return;
        }
        if (!z) {
            s0();
            return;
        }
        SlotReader slotReader = this.F;
        int i = slotReader.g;
        int i2 = slotReader.h;
        ComposerChangeListWriter composerChangeListWriter = this.L;
        composerChangeListWriter.getClass();
        composerChangeListWriter.d(false);
        composerChangeListWriter.b.f1672a.g(Operation.DeactivateCurrentGroup.c);
        ComposerKt.a(i, i2, this.r);
        this.F.r();
    }

    public final RecomposeScopeImpl b0() {
        if (this.z != 0) {
            return null;
        }
        ArrayList arrayList = this.D;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (RecomposeScopeImpl) YU.a.c(1, arrayList);
    }

    @Override // androidx.compose.runtime.Composer
    public final boolean c() {
        RecomposeScopeImpl recomposeScopeImplB0;
        return (this.O || this.x || this.v || (recomposeScopeImplB0 = b0()) == null || (recomposeScopeImplB0.f1656a & 8) != 0) ? false : true;
    }

    public final boolean c0() {
        if (!c() || this.v) {
            return true;
        }
        RecomposeScopeImpl recomposeScopeImplB0 = b0();
        return (recomposeScopeImplB0 == null || (recomposeScopeImplB0.f1656a & 4) == 0) ? false : true;
    }

    @Override // androidx.compose.runtime.Composer
    public final PersistentCompositionLocalMap d() {
        return Q();
    }

    public final void d0(ArrayList arrayList) {
        SlotTable slotTableG;
        Anchor anchorA;
        CompositionContext compositionContext;
        SlotReader slotReader;
        MutableIntObjectMap mutableIntObjectMap;
        int[] iArr;
        ChangeList changeList;
        SlotTable slotTable;
        boolean z;
        Function0<Unit> function0;
        int i;
        int i2;
        SlotTable slotTableC;
        SlotReader slotReader2;
        final ChangeList changeList2;
        SlotTable slotTable2 = this.c;
        CompositionContext compositionContext2 = this.b;
        ChangeList changeList3 = this.f;
        ComposerChangeListWriter composerChangeListWriter = this.L;
        ChangeList changeList4 = composerChangeListWriter.b;
        try {
            composerChangeListWriter.b = changeList3;
            changeList3.f1672a.g(Operation.ResetSlots.c);
            int size = arrayList.size();
            int i3 = 0;
            int i4 = 0;
            while (i4 < size) {
                Pair pair = (Pair) arrayList.get(i4);
                final MovableContentStateReference movableContentStateReference = (MovableContentStateReference) pair.d;
                MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) pair.e;
                Anchor anchorA2 = movableContentStateReference.getE();
                int iJ = movableContentStateReference.getD().j(anchorA2);
                IntRef intRef = new IntRef();
                composerChangeListWriter.b();
                Operations operations = composerChangeListWriter.b.f1672a;
                operations.g(Operation.DetermineMovableContentNodeIndex.c);
                Operations.WriteScope.b(operations, i3, intRef, 1, anchorA2);
                if (movableContentStateReference2 == null) {
                    if (Intrinsics.c(movableContentStateReference.getD(), this.G)) {
                        if (!this.H.w) {
                            ComposerKt.c("Check failed");
                        }
                        a0();
                    }
                    final SlotReader slotReaderL = movableContentStateReference.getD().l();
                    try {
                        slotReaderL.p(iJ);
                        composerChangeListWriter.f = iJ;
                        changeList2 = new ChangeList();
                        slotReader2 = slotReaderL;
                    } catch (Throwable th) {
                        th = th;
                        slotReader2 = slotReaderL;
                    }
                    try {
                        i0(null, null, null, EmptyList.d, new Function0<Unit>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                ComposerImpl composerImpl = this.h;
                                ComposerChangeListWriter composerChangeListWriter2 = composerImpl.L;
                                ChangeList changeList5 = changeList2;
                                SlotReader slotReader3 = slotReaderL;
                                MovableContentStateReference movableContentStateReference3 = movableContentStateReference;
                                ChangeList changeList6 = composerChangeListWriter2.b;
                                try {
                                    composerChangeListWriter2.b = changeList5;
                                    SlotReader slotReader4 = composerImpl.F;
                                    int[] iArr2 = composerImpl.n;
                                    MutableIntObjectMap mutableIntObjectMap2 = composerImpl.u;
                                    composerImpl.n = null;
                                    composerImpl.u = null;
                                    try {
                                        composerImpl.F = slotReader3;
                                        boolean z2 = composerChangeListWriter2.e;
                                        try {
                                            composerChangeListWriter2.e = false;
                                            composerImpl.e0(movableContentStateReference3.f1647a, movableContentStateReference3.g, movableContentStateReference3.b, true);
                                            composerChangeListWriter2.b = changeList6;
                                            return Unit.f24250a;
                                        } finally {
                                            composerChangeListWriter2.e = z2;
                                        }
                                    } finally {
                                        composerImpl.F = slotReader4;
                                        composerImpl.n = iArr2;
                                        composerImpl.u = mutableIntObjectMap2;
                                    }
                                } catch (Throwable th2) {
                                    composerChangeListWriter2.b = changeList6;
                                    throw th2;
                                }
                            }
                        });
                        ChangeList changeList5 = composerChangeListWriter.b;
                        changeList5.getClass();
                        if (changeList2.f1672a.f()) {
                            Operations operations2 = changeList5.f1672a;
                            operations2.g(Operation.ApplyChangeList.c);
                            Operations.WriteScope.b(operations2, 0, changeList2, 1, intRef);
                        }
                        slotReader2.c();
                        slotTable = slotTable2;
                        compositionContext = compositionContext2;
                        i = size;
                        i2 = i4;
                    } catch (Throwable th2) {
                        th = th2;
                        slotReader2.c();
                        throw th;
                    }
                } else {
                    MovableContentState movableContentStateN = compositionContext2.n(movableContentStateReference2);
                    if (movableContentStateN == null || (slotTableG = movableContentStateN.getF1646a()) == null) {
                        slotTableG = movableContentStateReference2.getD();
                    }
                    if (movableContentStateN == null || (slotTableC = movableContentStateN.getF1646a()) == null || (anchorA = slotTableC.h(0)) == null) {
                        anchorA = movableContentStateReference2.getE();
                    }
                    ArrayList arrayList2 = new ArrayList();
                    SlotReader slotReaderL2 = slotTableG.l();
                    try {
                        ComposerKt.b(slotReaderL2, arrayList2, slotTableG.j(anchorA));
                        slotReaderL2.c();
                        if (arrayList2.isEmpty()) {
                            compositionContext = compositionContext2;
                        } else {
                            ChangeList changeList6 = composerChangeListWriter.b;
                            changeList6.getClass();
                            if (arrayList2.isEmpty()) {
                                compositionContext = compositionContext2;
                            } else {
                                Operations operations3 = changeList6.f1672a;
                                operations3.g(Operation.CopyNodesToNewAnchorLocation.c);
                                compositionContext = compositionContext2;
                                Operations.WriteScope.b(operations3, 1, arrayList2, 0, intRef);
                            }
                            if (Intrinsics.c(movableContentStateReference.getD(), slotTable2)) {
                                int iJ2 = slotTable2.j(anchorA2);
                                B0(iJ2, E0(iJ2) + arrayList2.size());
                            }
                        }
                        Operations operations4 = composerChangeListWriter.b.f1672a;
                        operations4.g(Operation.CopySlotTableToAnchorLocation.c);
                        int i5 = operations4.f - operations4.f1676a[operations4.b - 1].b;
                        Object[] objArr = operations4.e;
                        objArr[i5] = movableContentStateN;
                        objArr[i5 + 1] = compositionContext;
                        objArr[i5 + 3] = movableContentStateReference;
                        objArr[i5 + 2] = movableContentStateReference2;
                        SlotReader slotReaderL3 = slotTableG.l();
                        try {
                            SlotReader slotReader3 = this.F;
                            int[] iArr2 = this.n;
                            MutableIntObjectMap mutableIntObjectMap2 = this.u;
                            this.n = null;
                            this.u = null;
                            try {
                                this.F = slotReaderL3;
                                int iJ3 = slotTableG.j(anchorA);
                                slotReaderL3.p(iJ3);
                                composerChangeListWriter.f = iJ3;
                                ChangeList changeList7 = new ChangeList();
                                ChangeList changeList8 = composerChangeListWriter.b;
                                try {
                                    composerChangeListWriter.b = changeList7;
                                    boolean z2 = composerChangeListWriter.e;
                                    slotTable = slotTable2;
                                    try {
                                        composerChangeListWriter.e = false;
                                        try {
                                            ControlledComposition controlledCompositionB = movableContentStateReference2.b();
                                            ControlledComposition controlledCompositionB2 = movableContentStateReference.b();
                                            Integer numValueOf = Integer.valueOf(slotReaderL3.g);
                                            List listD = movableContentStateReference2.d();
                                            try {
                                                function0 = new Function0<Unit>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$2$1$1$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        MovableContentStateReference movableContentStateReference3 = movableContentStateReference;
                                                        this.h.e0(movableContentStateReference3.f1647a, movableContentStateReference3.g, movableContentStateReference3.b, true);
                                                        return Unit.f24250a;
                                                    }
                                                };
                                                i = size;
                                                mutableIntObjectMap = mutableIntObjectMap2;
                                                int i6 = i4;
                                                changeList = changeList8;
                                                i2 = i6;
                                                slotReader = slotReaderL3;
                                                iArr = iArr2;
                                                z = z2;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                mutableIntObjectMap = mutableIntObjectMap2;
                                                changeList = changeList8;
                                                slotReader = slotReaderL3;
                                                iArr = iArr2;
                                                z = z2;
                                            }
                                            try {
                                                i0(controlledCompositionB, controlledCompositionB2, numValueOf, listD, function0);
                                                try {
                                                    composerChangeListWriter.e = z;
                                                    try {
                                                        composerChangeListWriter.b = changeList;
                                                        changeList.getClass();
                                                        if (changeList7.f1672a.f()) {
                                                            Operations operations5 = changeList.f1672a;
                                                            operations5.g(Operation.ApplyChangeList.c);
                                                            Operations.WriteScope.b(operations5, 0, changeList7, 1, intRef);
                                                        }
                                                        try {
                                                            this.F = slotReader3;
                                                            this.n = iArr;
                                                            this.u = mutableIntObjectMap;
                                                            slotReader.c();
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            slotReader.c();
                                                            throw th;
                                                        }
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        this.F = slotReader3;
                                                        this.n = iArr;
                                                        this.u = mutableIntObjectMap;
                                                        throw th;
                                                    }
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    composerChangeListWriter.b = changeList;
                                                    throw th;
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                composerChangeListWriter.e = z;
                                                throw th;
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            mutableIntObjectMap = mutableIntObjectMap2;
                                            changeList = changeList8;
                                            z = z2;
                                            slotReader = slotReaderL3;
                                            iArr = iArr2;
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        mutableIntObjectMap = mutableIntObjectMap2;
                                        changeList = changeList8;
                                        z = z2;
                                        slotReader = slotReaderL3;
                                        iArr = iArr2;
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                    mutableIntObjectMap = mutableIntObjectMap2;
                                    changeList = changeList8;
                                    slotReader = slotReaderL3;
                                    iArr = iArr2;
                                }
                            } catch (Throwable th11) {
                                th = th11;
                                mutableIntObjectMap = mutableIntObjectMap2;
                                slotReader = slotReaderL3;
                                iArr = iArr2;
                            }
                        } catch (Throwable th12) {
                            th = th12;
                            slotReader = slotReaderL3;
                        }
                    } catch (Throwable th13) {
                        slotReaderL2.c();
                        throw th13;
                    }
                }
                composerChangeListWriter.b.f1672a.g(Operation.SkipToEndOfCurrentGroup.c);
                i4 = i2 + 1;
                size = i;
                slotTable2 = slotTable;
                compositionContext2 = compositionContext;
                i3 = 0;
            }
            composerChangeListWriter.b.f1672a.g(Operation.EndMovableContentPlacement.c);
            composerChangeListWriter.f = 0;
            composerChangeListWriter.b = changeList4;
        } catch (Throwable th14) {
            composerChangeListWriter.b = changeList4;
            throw th14;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public final void e() {
        if (!this.q) {
            ComposerKt.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.q = false;
        if (this.O) {
            ComposerKt.c("useNode() called while inserting");
        }
        SlotReader slotReader = this.F;
        Object objL = slotReader.l(slotReader.i);
        ComposerChangeListWriter composerChangeListWriter = this.L;
        composerChangeListWriter.c();
        composerChangeListWriter.h.add(objL);
        if (this.x && (objL instanceof ComposeNodeLifecycleCallback)) {
            composerChangeListWriter.b();
            composerChangeListWriter.b.f1672a.g(Operation.UseCurrentNode.c);
        }
    }

    public final void e0(final MovableContent movableContent, PersistentCompositionLocalMap persistentCompositionLocalMap, final Object obj, boolean z) {
        J(126665345, movableContent);
        f0();
        D0(obj);
        int i = this.P;
        try {
            this.P = 126665345;
            if (this.O) {
                SlotWriter.x(this.H);
            }
            boolean z2 = (this.O || Intrinsics.c(this.F.f(), persistentCompositionLocalMap)) ? false : true;
            if (z2) {
                l0(persistentCompositionLocalMap);
            }
            t0(ComposerKt.c, DatastoreTestTrace.FirestoreV1Action.DATABASE_CONTENTS_BEFORE_ACTION_FIELD_NUMBER, 0, persistentCompositionLocalMap);
            this.J = null;
            if (!this.O || z) {
                boolean z3 = this.v;
                this.v = z2;
                Utils_jvmKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$invokeMovableContentLambda$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Composer composer = (Composer) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        if (composer.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                            movableContent.f1645a.invoke(obj, composer, 0);
                        } else {
                            composer.j();
                        }
                        return Unit.f24250a;
                    }
                }, true, 316014703));
                this.v = z3;
            } else {
                this.I = true;
                SlotWriter slotWriter = this.H;
                this.b.k(new MovableContentStateReference(movableContent, obj, this.g, this.G, slotWriter.b(slotWriter.E(slotWriter.v, slotWriter.b)), EmptyList.d, Q(), null));
            }
            V(false);
            this.J = null;
            this.P = i;
            V(false);
        } catch (Throwable th) {
            V(false);
            this.J = null;
            this.P = i;
            V(false);
            throw th;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public final void f() {
        V(true);
    }

    public final Object f0() {
        boolean z = this.O;
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
        if (!z) {
            Object objK = this.F.k();
            if (!this.x || (objK instanceof ReusableRememberObserver)) {
                return objK;
            }
        } else if (this.q) {
            ComposerKt.c("A call to createNode(), emitNode() or useNode() expected");
            return composer$Companion$Empty$1;
        }
        return composer$Companion$Empty$1;
    }

    @Override // androidx.compose.runtime.Composer
    public final void g(Function0 function0) {
        Operations operations = this.L.b.f1672a;
        operations.g(Operation.SideEffect.c);
        Operations.WriteScope.a(operations, 0, function0);
    }

    public final int g0(int i) {
        int iO = this.F.o(i) + 1;
        int i2 = 0;
        while (iO < i) {
            if (!this.F.i(iO)) {
                i2++;
            }
            iO += SlotTableKt.a(iO, this.F.b);
        }
        return i2;
    }

    @Override // androidx.compose.runtime.Composer
    public final void h(Object obj) {
        if (!this.O && this.F.g() == 207 && !Intrinsics.c(this.F.f(), obj) && this.y < 0) {
            this.y = this.F.g;
            this.x = true;
        }
        t0(null, 207, 0, obj);
    }

    public final boolean h0(MutableScatterMap mutableScatterMap) {
        Operations operations = this.e.f1672a;
        if (!operations.e()) {
            ComposerKt.c("Expected applyChanges() to have been called");
        }
        if (mutableScatterMap.e <= 0 && this.r.isEmpty()) {
            return false;
        }
        S(mutableScatterMap, null);
        return operations.f();
    }

    @Override // androidx.compose.runtime.Composer
    public final void i() {
        t0(null, 125, 2, null);
        this.q = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[Catch: all -> 0x0025, TRY_LEAVE, TryCatch #0 {all -> 0x0025, blocks: (B:3:0x0005, B:5:0x0013, B:7:0x0021, B:11:0x002b, B:10:0x0027, B:14:0x0032, B:16:0x0038, B:18:0x003e), top: B:23:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i0(androidx.compose.runtime.ControlledComposition r7, androidx.compose.runtime.ControlledComposition r8, java.lang.Integer r9, java.util.List r10, kotlin.jvm.functions.Function0 r11) {
        /*
            r6 = this;
            boolean r0 = r6.E
            int r1 = r6.j
            r2 = 1
            r6.E = r2     // Catch: java.lang.Throwable -> L25
            r2 = 0
            r6.j = r2     // Catch: java.lang.Throwable -> L25
            r3 = r10
            java.util.Collection r3 = (java.util.Collection) r3     // Catch: java.lang.Throwable -> L25
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L25
        L11:
            if (r2 >= r3) goto L2e
            java.lang.Object r4 = r10.get(r2)     // Catch: java.lang.Throwable -> L25
            kotlin.Pair r4 = (kotlin.Pair) r4     // Catch: java.lang.Throwable -> L25
            java.lang.Object r5 = r4.d     // Catch: java.lang.Throwable -> L25
            androidx.compose.runtime.RecomposeScopeImpl r5 = (androidx.compose.runtime.RecomposeScopeImpl) r5     // Catch: java.lang.Throwable -> L25
            java.lang.Object r4 = r4.e     // Catch: java.lang.Throwable -> L25
            if (r4 == 0) goto L27
            r6.z0(r5, r4)     // Catch: java.lang.Throwable -> L25
            goto L2b
        L25:
            r7 = move-exception
            goto L47
        L27:
            r4 = 0
            r6.z0(r5, r4)     // Catch: java.lang.Throwable -> L25
        L2b:
            int r2 = r2 + 1
            goto L11
        L2e:
            if (r7 == 0) goto L3e
            if (r9 == 0) goto L37
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> L25
            goto L38
        L37:
            r9 = -1
        L38:
            java.lang.Object r7 = r7.j(r8, r9, r11)     // Catch: java.lang.Throwable -> L25
            if (r7 != 0) goto L42
        L3e:
            java.lang.Object r7 = r11.invoke()     // Catch: java.lang.Throwable -> L25
        L42:
            r6.E = r0
            r6.j = r1
            return r7
        L47:
            r6.E = r0
            r6.j = r1
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.i0(androidx.compose.runtime.ControlledComposition, androidx.compose.runtime.ControlledComposition, java.lang.Integer, java.util.List, kotlin.jvm.functions.Function0):java.lang.Object");
    }

    @Override // androidx.compose.runtime.Composer
    public final void j() {
        if (this.k != 0) {
            ComposerKt.c("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.O) {
            return;
        }
        RecomposeScopeImpl recomposeScopeImplB0 = b0();
        if (recomposeScopeImplB0 != null) {
            int i = recomposeScopeImplB0.f1656a;
            if ((i & 128) == 0) {
                recomposeScopeImplB0.f1656a = i | 16;
            }
        }
        if (this.r.isEmpty()) {
            s0();
        } else {
            j0();
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x027e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j0() {
        /*
            Method dump skipped, instructions count: 872
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.j0():void");
    }

    @Override // androidx.compose.runtime.Composer
    public final void k(RecomposeScope recomposeScope) {
        RecomposeScopeImpl recomposeScopeImpl = recomposeScope instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) recomposeScope : null;
        if (recomposeScopeImpl == null) {
            return;
        }
        recomposeScopeImpl.f();
    }

    public final void k0() {
        n0(this.F.g);
        ComposerChangeListWriter composerChangeListWriter = this.L;
        composerChangeListWriter.d(false);
        composerChangeListWriter.e();
        composerChangeListWriter.b.f1672a.g(Operation.RemoveCurrentGroup.c);
        int i = composerChangeListWriter.f;
        SlotReader slotReader = composerChangeListWriter.f1673a.F;
        composerChangeListWriter.f = slotReader.b[(slotReader.g * 5) + 3] + i;
    }

    @Override // androidx.compose.runtime.Composer
    public final void l() {
        V(false);
    }

    public final void l0(PersistentCompositionLocalMap persistentCompositionLocalMap) {
        MutableIntObjectMap mutableIntObjectMap = this.u;
        if (mutableIntObjectMap == null) {
            mutableIntObjectMap = new MutableIntObjectMap();
            this.u = mutableIntObjectMap;
        }
        mutableIntObjectMap.h(this.F.g, persistentCompositionLocalMap);
    }

    @Override // androidx.compose.runtime.Composer
    public final CompositionContextImpl m() {
        v0(206, ComposerKt.e);
        if (this.O) {
            SlotWriter.x(this.H);
        }
        Object objF0 = f0();
        CompositionContextHolder compositionContextHolder = objF0 instanceof CompositionContextHolder ? (CompositionContextHolder) objF0 : null;
        if (compositionContextHolder == null) {
            compositionContextHolder = new CompositionContextHolder(new CompositionContextImpl(this.P, this.p, this.B, this.g.u));
            D0(compositionContextHolder);
        }
        CompositionContextImpl compositionContextImpl = compositionContextHolder.d;
        ((SnapshotMutableStateImpl) compositionContextImpl.g).setValue(Q());
        V(false);
        return compositionContextImpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m0(int r7, int r8, int r9) {
        /*
            r6 = this;
            androidx.compose.runtime.SlotReader r0 = r6.F
            if (r7 != r8) goto L5
            goto L1a
        L5:
            if (r7 == r9) goto L6b
            if (r8 != r9) goto Lb
            goto L6b
        Lb:
            int r1 = r0.o(r7)
            if (r1 != r8) goto L14
            r9 = r8
            goto L6b
        L14:
            int r1 = r0.o(r8)
            if (r1 != r7) goto L1c
        L1a:
            r9 = r7
            goto L6b
        L1c:
            int r1 = r0.o(r7)
            int r2 = r0.o(r8)
            if (r1 != r2) goto L2b
            int r9 = r0.o(r7)
            goto L6b
        L2b:
            r1 = 0
            r2 = r7
            r3 = r1
        L2e:
            if (r2 <= 0) goto L39
            if (r2 == r9) goto L39
            int r2 = r0.o(r2)
            int r3 = r3 + 1
            goto L2e
        L39:
            r2 = r8
            r4 = r1
        L3b:
            if (r2 <= 0) goto L46
            if (r2 == r9) goto L46
            int r2 = r0.o(r2)
            int r4 = r4 + 1
            goto L3b
        L46:
            int r9 = r3 - r4
            r5 = r7
            r2 = r1
        L4a:
            if (r2 >= r9) goto L53
            int r5 = r0.o(r5)
            int r2 = r2 + 1
            goto L4a
        L53:
            int r4 = r4 - r3
            r9 = r8
        L55:
            if (r1 >= r4) goto L5e
            int r9 = r0.o(r9)
            int r1 = r1 + 1
            goto L55
        L5e:
            r1 = r9
            r9 = r5
        L60:
            if (r9 == r1) goto L6b
            int r9 = r0.o(r9)
            int r1 = r0.o(r1)
            goto L60
        L6b:
            if (r7 <= 0) goto L7f
            if (r7 == r9) goto L7f
            boolean r1 = r0.j(r7)
            if (r1 == 0) goto L7a
            androidx.compose.runtime.changelist.ComposerChangeListWriter r1 = r6.L
            r1.a()
        L7a:
            int r7 = r0.o(r7)
            goto L6b
        L7f:
            r6.T(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.m0(int, int, int):void");
    }

    @Override // androidx.compose.runtime.Composer
    public final boolean n(Object obj) {
        if (Intrinsics.c(f0(), obj)) {
            return false;
        }
        D0(obj);
        return true;
    }

    public final void n0(int i) {
        boolean zJ = this.F.j(i);
        ComposerChangeListWriter composerChangeListWriter = this.L;
        if (zJ) {
            composerChangeListWriter.c();
            Object objL = this.F.l(i);
            composerChangeListWriter.c();
            composerChangeListWriter.h.add(objL);
        }
        q0(this, i, i, zJ, 0);
        composerChangeListWriter.c();
        if (zJ) {
            composerChangeListWriter.a();
        }
    }

    @Override // androidx.compose.runtime.Composer
    public final void o(int i) {
        int i2;
        int i3;
        if (this.i != null) {
            t0(null, i, 0, null);
            return;
        }
        if (this.q) {
            ComposerKt.c("A call to createNode(), emitNode() or useNode() expected");
        }
        this.P = this.l ^ Integer.rotateLeft(Integer.rotateLeft(this.P, 3) ^ i, 3);
        this.l++;
        SlotReader slotReader = this.F;
        boolean z = this.O;
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
        if (z) {
            slotReader.k++;
            this.H.Q(composer$Companion$Empty$1, i, composer$Companion$Empty$1, false);
            Z(false, null);
            return;
        }
        if (slotReader.g() == i && ((i3 = slotReader.g) >= slotReader.h || (slotReader.b[(i3 * 5) + 1] & 536870912) == 0)) {
            slotReader.s();
            Z(false, null);
            return;
        }
        if (slotReader.k <= 0 && (i2 = slotReader.g) != slotReader.h) {
            int i4 = this.j;
            k0();
            this.L.f(i4, slotReader.q());
            ComposerKt.a(i2, slotReader.g, this.r);
        }
        slotReader.k++;
        this.O = true;
        this.J = null;
        if (this.H.w) {
            SlotWriter slotWriterM = this.G.m();
            this.H = slotWriterM;
            slotWriterM.L();
            this.I = false;
            this.J = null;
        }
        SlotWriter slotWriter = this.H;
        slotWriter.d();
        int i5 = slotWriter.t;
        slotWriter.Q(composer$Companion$Empty$1, i, composer$Companion$Empty$1, false);
        this.M = slotWriter.b(i5);
        Z(false, null);
    }

    @Override // androidx.compose.runtime.Composer
    public final boolean p(boolean z) {
        Object objF0 = f0();
        if ((objF0 instanceof Boolean) && z == ((Boolean) objF0).booleanValue()) {
            return false;
        }
        D0(Boolean.valueOf(z));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public final boolean q(float f) {
        Object objF0 = f0();
        if ((objF0 instanceof Float) && f == ((Number) objF0).floatValue()) {
            return false;
        }
        D0(Float.valueOf(f));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public final boolean r(int i) {
        Object objF0 = f0();
        if ((objF0 instanceof Integer) && i == ((Number) objF0).intValue()) {
            return false;
        }
        D0(Integer.valueOf(i));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r0() {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.r0():void");
    }

    @Override // androidx.compose.runtime.Composer
    public final boolean s(long j) {
        Object objF0 = f0();
        if ((objF0 instanceof Long) && j == ((Number) objF0).longValue()) {
            return false;
        }
        D0(Long.valueOf(j));
        return true;
    }

    public final void s0() {
        SlotReader slotReader = this.F;
        int i = slotReader.i;
        this.k = i >= 0 ? slotReader.b[(i * 5) + 1] & 67108863 : 0;
        slotReader.r();
    }

    @Override // androidx.compose.runtime.Composer
    public final boolean t(double d) {
        Object objF0 = f0();
        if ((objF0 instanceof Double) && d == ((Number) objF0).doubleValue()) {
            return false;
        }
        D0(Double.valueOf(d));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t0(java.lang.Object r26, int r27, int r28, java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 864
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.t0(java.lang.Object, int, int, java.lang.Object):void");
    }

    @Override // androidx.compose.runtime.Composer
    /* renamed from: u, reason: from getter */
    public final boolean getO() {
        return this.O;
    }

    public final void u0() {
        t0(null, -127, 0, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    @Override // androidx.compose.runtime.Composer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.runtime.ComposerImpl v(int r5) {
        /*
            r4 = this;
            r4.o(r5)
            boolean r5 = r4.O
            java.util.ArrayList r0 = r4.D
            androidx.compose.runtime.CompositionImpl r1 = r4.g
            if (r5 == 0) goto L21
            androidx.compose.runtime.RecomposeScopeImpl r5 = new androidx.compose.runtime.RecomposeScopeImpl
            r5.<init>(r1)
            r0.add(r5)
            r4.D0(r5)
            int r0 = r4.A
            r5.e = r0
            int r0 = r5.f1656a
            r0 = r0 & (-17)
            r5.f1656a = r0
            return r4
        L21:
            androidx.compose.runtime.SlotReader r5 = r4.F
            int r5 = r5.i
            java.util.ArrayList r2 = r4.r
            int r5 = androidx.compose.runtime.ComposerKt.g(r5, r2)
            if (r5 < 0) goto L34
            java.lang.Object r5 = r2.remove(r5)
            androidx.compose.runtime.Invalidation r5 = (androidx.compose.runtime.Invalidation) r5
            goto L35
        L34:
            r5 = 0
        L35:
            androidx.compose.runtime.SlotReader r2 = r4.F
            java.lang.Object r2 = r2.k()
            androidx.compose.runtime.Composer$Companion$Empty$1 r3 = androidx.compose.runtime.Composer.Companion.f1624a
            boolean r3 = kotlin.jvm.internal.Intrinsics.c(r2, r3)
            if (r3 == 0) goto L4c
            androidx.compose.runtime.RecomposeScopeImpl r2 = new androidx.compose.runtime.RecomposeScopeImpl
            r2.<init>(r1)
            r4.D0(r2)
            goto L53
        L4c:
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            kotlin.jvm.internal.Intrinsics.f(r2, r1)
            androidx.compose.runtime.RecomposeScopeImpl r2 = (androidx.compose.runtime.RecomposeScopeImpl) r2
        L53:
            r1 = 0
            if (r5 != 0) goto L6f
            int r5 = r2.f1656a
            r3 = r5 & 64
            if (r3 == 0) goto L5e
            r3 = 1
            goto L5f
        L5e:
            r3 = r1
        L5f:
            if (r3 == 0) goto L65
            r5 = r5 & (-65)
            r2.f1656a = r5
        L65:
            if (r3 == 0) goto L68
            goto L6f
        L68:
            int r5 = r2.f1656a
            r5 = r5 & (-9)
            r2.f1656a = r5
            goto L75
        L6f:
            int r5 = r2.f1656a
            r5 = r5 | 8
            r2.f1656a = r5
        L75:
            r0.add(r2)
            int r5 = r4.A
            r2.e = r5
            int r5 = r2.f1656a
            r0 = r5 & (-17)
            r2.f1656a = r0
            r0 = r5 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L9a
            r5 = r5 & (-273(0xfffffffffffffeef, float:NaN))
            r5 = r5 | 512(0x200, float:7.175E-43)
            r2.f1656a = r5
            androidx.compose.runtime.changelist.ComposerChangeListWriter r5 = r4.L
            androidx.compose.runtime.changelist.ChangeList r5 = r5.b
            androidx.compose.runtime.changelist.Operations r5 = r5.f1672a
            androidx.compose.runtime.changelist.Operation$StartResumingScope r0 = androidx.compose.runtime.changelist.Operation.StartResumingScope.c
            r5.g(r0)
            androidx.compose.runtime.changelist.Operations.WriteScope.a(r5, r1, r2)
        L9a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.v(int):androidx.compose.runtime.ComposerImpl");
    }

    public final void v0(int i, OpaqueKey opaqueKey) {
        t0(opaqueKey, i, 0, null);
    }

    @Override // androidx.compose.runtime.Composer
    public final Applier w() {
        return this.f1625a;
    }

    public final void w0() {
        t0(null, 125, 1, null);
        this.q = true;
    }

    @Override // androidx.compose.runtime.Composer
    public final Object x(CompositionLocal compositionLocal) {
        return CompositionLocalMapKt.a(Q(), compositionLocal);
    }

    public final void x0(Object obj, boolean z) {
        if (z) {
            SlotReader slotReader = this.F;
            if (slotReader.k <= 0) {
                if ((slotReader.b[(slotReader.g * 5) + 1] & 1073741824) == 0) {
                    PreconditionsKt.a("Expected a node group");
                }
                slotReader.s();
                return;
            }
            return;
        }
        if (obj != null && this.F.f() != obj) {
            ComposerChangeListWriter composerChangeListWriter = this.L;
            composerChangeListWriter.getClass();
            composerChangeListWriter.d(false);
            Operations operations = composerChangeListWriter.b.f1672a;
            operations.g(Operation.UpdateAuxData.c);
            Operations.WriteScope.a(operations, 0, obj);
        }
        this.F.s();
    }

    @Override // androidx.compose.runtime.Composer
    public final CoroutineContext y() {
        return this.b.getW();
    }

    public final void y0() {
        this.l = 0;
        this.F = this.c.l();
        t0(null, 100, 0, null);
        CompositionContext compositionContext = this.b;
        compositionContext.r();
        this.t = compositionContext.g();
        this.w.c(this.v ? 1 : 0);
        this.v = n(this.t);
        this.J = null;
        if (!this.p) {
            this.p = compositionContext.getB();
        }
        if (!this.B) {
            this.B = compositionContext.getC();
        }
        Set set = (Set) CompositionLocalMapKt.a(this.t, InspectionTablesKt.f1716a);
        if (set != null) {
            set.add(H());
            compositionContext.o(set);
        }
        t0(null, compositionContext.getF1626a(), 0, null);
    }

    @Override // androidx.compose.runtime.Composer
    public final boolean z(int i, boolean z) {
        return ((i & 1) == 0 && (this.O || this.x)) || z || !c();
    }

    public final boolean z0(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        Anchor anchor = recomposeScopeImpl.c;
        if (anchor == null) {
            return false;
        }
        int iJ = this.F.f1665a.j(anchor);
        if (!this.E || iJ < this.F.g) {
            return false;
        }
        ArrayList arrayList = this.r;
        int iG = ComposerKt.g(iJ, arrayList);
        if (iG < 0) {
            int i = -(iG + 1);
            if (!(obj instanceof DerivedState)) {
                obj = null;
            }
            arrayList.add(i, new Invalidation(recomposeScopeImpl, iJ, obj));
            return true;
        }
        Invalidation invalidation = (Invalidation) arrayList.get(iG);
        if (!(obj instanceof DerivedState)) {
            invalidation.c = null;
            return true;
        }
        Object obj2 = invalidation.c;
        if (obj2 == null) {
            invalidation.c = obj;
            return true;
        }
        if (obj2 instanceof MutableScatterSet) {
            ((MutableScatterSet) obj2).e(obj);
            return true;
        }
        int i2 = ScatterSetKt.f701a;
        MutableScatterSet mutableScatterSet = new MutableScatterSet(2);
        mutableScatterSet.m(obj2);
        mutableScatterSet.m(obj);
        invalidation.c = mutableScatterSet;
        return true;
    }
}
