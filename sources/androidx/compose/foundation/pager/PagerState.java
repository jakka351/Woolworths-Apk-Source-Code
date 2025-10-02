package androidx.compose.foundation.pager;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableIntStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/pager/PagerState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public abstract class PagerState implements ScrollableState {
    public final PagerState$remeasurementModifier$1 A;
    public long B;
    public final LazyLayoutPinnedItemList C;
    public final MutableState D;
    public final MutableState E;
    public final MutableState F;
    public final MutableState G;
    public final MutableState H;
    public final MutableState I;

    /* renamed from: a, reason: collision with root package name */
    public boolean f1092a;
    public PagerMeasureResult b;
    public final MutableState c;
    public final PagerScrollPosition d;
    public int e;
    public int f;
    public long g;
    public long h;
    public float i;
    public float j;
    public final ScrollableState k;
    public final boolean l;
    public int m;
    public LazyLayoutPrefetchState.PrefetchHandle n;
    public boolean o;
    public final MutableState p;
    public Density q;
    public final MutableInteractionSource r;
    public final MutableIntState s;
    public final MutableIntState t;
    public final State u;
    public final State v;
    public final LazyLayoutPrefetchState w;
    public final LazyLayoutBeyondBoundsInfo x;
    public final AwaitFirstLayoutModifier y;
    public final MutableState z;

    /* JADX WARN: Type inference failed for: r5v10, types: [androidx.compose.foundation.pager.PagerState$remeasurementModifier$1] */
    public PagerState(int i, float f) {
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            InlineClassHelperKt.a("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        this.c = SnapshotStateKt.f(new Offset(0L));
        this.d = new PagerScrollPosition(i, f, this);
        this.e = i;
        this.g = Long.MAX_VALUE;
        this.k = ScrollableStateKt.a(new Function1<Float, Float>() { // from class: androidx.compose.foundation.pager.PagerState$scrollableState$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                PagerMeasureResult pagerMeasureResult;
                float fFloatValue = ((Number) obj).floatValue();
                PagerState pagerState = this.h;
                long jA = PagerScrollPositionKt.a(pagerState);
                float f2 = pagerState.i + fFloatValue;
                long jC = MathKt.c(f2);
                pagerState.i = f2 - jC;
                if (Math.abs(fFloatValue) >= 1.0E-4f) {
                    long j = jA + jC;
                    long jE = RangesKt.e(j, pagerState.h, pagerState.g);
                    boolean z = j != jE;
                    long j2 = jE - jA;
                    float f3 = j2;
                    pagerState.j = f3;
                    long jAbs = Math.abs(j2);
                    float fO = BitmapDescriptorFactory.HUE_RED;
                    if (jAbs != 0) {
                        ((SnapshotMutableStateImpl) pagerState.H).setValue(Boolean.valueOf(f3 > BitmapDescriptorFactory.HUE_RED));
                        ((SnapshotMutableStateImpl) pagerState.I).setValue(Boolean.valueOf(f3 < BitmapDescriptorFactory.HUE_RED));
                    }
                    int i2 = (int) j2;
                    int i3 = -i2;
                    PagerMeasureResult pagerMeasureResultD = ((PagerMeasureResult) ((SnapshotMutableStateImpl) pagerState.p).getD()).d(i3);
                    if (pagerMeasureResultD != null && (pagerMeasureResult = pagerState.b) != null) {
                        PagerMeasureResult pagerMeasureResultD2 = pagerMeasureResult.d(i3);
                        if (pagerMeasureResultD2 != null) {
                            pagerState.b = pagerMeasureResultD2;
                        } else {
                            pagerMeasureResultD = null;
                        }
                    }
                    if (pagerMeasureResultD != null) {
                        pagerState.h(pagerMeasureResultD, pagerState.f1092a, true);
                        ObservableScopeInvalidator.b(pagerState.D);
                    } else {
                        PagerScrollPosition pagerScrollPosition = pagerState.d;
                        PagerState pagerState2 = pagerScrollPosition.f1090a;
                        MutableFloatState mutableFloatState = pagerScrollPosition.c;
                        if (pagerState2.o() != 0) {
                            fO = i2 / pagerState2.o();
                        }
                        ((SnapshotMutableFloatStateImpl) mutableFloatState).p(((SnapshotMutableFloatStateImpl) mutableFloatState).a() + fO);
                        Remeasurement remeasurement = (Remeasurement) ((SnapshotMutableStateImpl) pagerState.z).getD();
                        if (remeasurement != null) {
                            remeasurement.d();
                        }
                    }
                    fFloatValue = (z ? Long.valueOf(j2) : Float.valueOf(fFloatValue)).floatValue();
                }
                return Float.valueOf(fFloatValue);
            }
        });
        this.l = true;
        this.m = -1;
        this.p = SnapshotStateKt.e(PagerStateKt.b, SnapshotStateKt.g());
        this.q = PagerStateKt.c;
        this.r = InteractionSourceKt.a();
        this.s = SnapshotIntStateKt.a(-1);
        this.t = SnapshotIntStateKt.a(i);
        this.u = SnapshotStateKt.c(SnapshotStateKt.n(), new Function0<Integer>() { // from class: androidx.compose.foundation.pager.PagerState$settledPage$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PagerState pagerState = this.h;
                return Integer.valueOf(pagerState.k.a() ? ((SnapshotMutableIntStateImpl) pagerState.t).d() : pagerState.j());
            }
        });
        this.v = SnapshotStateKt.c(SnapshotStateKt.n(), new Function0<Integer>() { // from class: androidx.compose.foundation.pager.PagerState$targetPage$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PagerState pagerState = this.h;
                MutableIntState mutableIntState = pagerState.s;
                return Integer.valueOf(pagerState.i(!pagerState.k.a() ? pagerState.j() : ((SnapshotMutableIntStateImpl) mutableIntState).d() != -1 ? ((SnapshotMutableIntStateImpl) mutableIntState).d() : Math.abs(pagerState.k()) >= Math.abs(Math.min(pagerState.q.T1(PagerStateKt.f1093a), ((float) pagerState.n()) / 2.0f) / ((float) pagerState.n())) ? ((Boolean) ((SnapshotMutableStateImpl) pagerState.H).getD()).booleanValue() ? pagerState.e + 1 : pagerState.e : pagerState.j()));
            }
        });
        this.w = new LazyLayoutPrefetchState(null, new Function1<NestedPrefetchScope, Unit>() { // from class: androidx.compose.foundation.pager.PagerState$prefetchState$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                NestedPrefetchScope nestedPrefetchScope = (NestedPrefetchScope) obj;
                PagerState pagerState = this.h;
                Snapshot snapshotA = Snapshot.Companion.a();
                Function1 g = snapshotA != null ? snapshotA.getG() : null;
                Snapshot snapshotB = Snapshot.Companion.b(snapshotA);
                try {
                    nestedPrefetchScope.a(pagerState.e);
                    Snapshot.Companion.e(snapshotA, snapshotB, g);
                    return Unit.f24250a;
                } catch (Throwable th) {
                    Snapshot.Companion.e(snapshotA, snapshotB, g);
                    throw th;
                }
            }
        });
        this.x = new LazyLayoutBeyondBoundsInfo();
        this.y = new AwaitFirstLayoutModifier();
        this.z = SnapshotStateKt.f(null);
        this.A = new RemeasurementModifier() { // from class: androidx.compose.foundation.pager.PagerState$remeasurementModifier$1
            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public final void h0(LayoutNode layoutNode) {
                ((SnapshotMutableStateImpl) this.d.z).setValue(layoutNode);
            }
        };
        this.B = ConstraintsKt.b(0, 0, 15);
        this.C = new LazyLayoutPinnedItemList();
        this.D = ObservableScopeInvalidator.a();
        this.E = ObservableScopeInvalidator.a();
        Boolean bool = Boolean.FALSE;
        this.F = SnapshotStateKt.f(bool);
        this.G = SnapshotStateKt.f(bool);
        this.H = SnapshotStateKt.f(bool);
        this.I = SnapshotStateKt.f(bool);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
    
        if (r9.e(r7, r8, r0) == r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object s(androidx.compose.foundation.pager.PagerState r6, androidx.compose.foundation.MutatePriority r7, kotlin.jvm.functions.Function2 r8, kotlin.coroutines.Continuation r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.pager.PagerState$scroll$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.pager.PagerState$scroll$1 r0 = (androidx.compose.foundation.pager.PagerState$scroll$1) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            androidx.compose.foundation.pager.PagerState$scroll$1 r0 = new androidx.compose.foundation.pager.PagerState$scroll$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.s
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.u
            kotlin.Unit r3 = kotlin.Unit.f24250a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            androidx.compose.foundation.pager.PagerState r6 = r0.p
            kotlin.ResultKt.b(r9)
            goto L83
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.coroutines.jvm.internal.SuspendLambda r6 = r0.r
            r8 = r6
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            androidx.compose.foundation.MutatePriority r7 = r0.q
            androidx.compose.foundation.pager.PagerState r6 = r0.p
            kotlin.ResultKt.b(r9)
            goto L5e
        L43:
            kotlin.ResultKt.b(r9)
            r0.p = r6
            r0.q = r7
            r9 = r8
            kotlin.coroutines.jvm.internal.SuspendLambda r9 = (kotlin.coroutines.jvm.internal.SuspendLambda) r9
            r0.r = r9
            r0.u = r5
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r9 = r6.y
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r1) goto L5a
            goto L5b
        L5a:
            r9 = r3
        L5b:
            if (r9 != r1) goto L5e
            goto L82
        L5e:
            androidx.compose.foundation.gestures.ScrollableState r9 = r6.k
            boolean r9 = r9.a()
            if (r9 != 0) goto L71
            int r9 = r6.j()
            androidx.compose.runtime.MutableIntState r2 = r6.t
            androidx.compose.runtime.SnapshotMutableIntStateImpl r2 = (androidx.compose.runtime.SnapshotMutableIntStateImpl) r2
            r2.i(r9)
        L71:
            androidx.compose.foundation.gestures.ScrollableState r9 = r6.k
            r0.p = r6
            r2 = 0
            r0.q = r2
            r0.r = r2
            r0.u = r4
            java.lang.Object r7 = r9.e(r7, r8, r0)
            if (r7 != r1) goto L83
        L82:
            return r1
        L83:
            androidx.compose.runtime.MutableIntState r6 = r6.s
            androidx.compose.runtime.SnapshotMutableIntStateImpl r6 = (androidx.compose.runtime.SnapshotMutableIntStateImpl) r6
            r7 = -1
            r6.i(r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.s(androidx.compose.foundation.pager.PagerState, androidx.compose.foundation.MutatePriority, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static Object t(PagerState pagerState, int i, SuspendLambda suspendLambda) {
        pagerState.getClass();
        Object objE = pagerState.e(MutatePriority.d, new PagerState$scrollToPage$2(pagerState, i, null), suspendLambda);
        return objE == CoroutineSingletons.d ? objE : Unit.f24250a;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean a() {
        return this.k.a();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean b() {
        return ((Boolean) ((SnapshotMutableStateImpl) this.F).getD()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final float c(float f) {
        return this.k.c(f);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean d() {
        return ((Boolean) ((SnapshotMutableStateImpl) this.G).getD()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final Object e(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        return s(this, mutatePriority, function2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(int r13, androidx.compose.animation.core.SpringSpec r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof androidx.compose.foundation.pager.PagerState$animateScrollToPage$1
            if (r0 == 0) goto L13
            r0 = r15
            androidx.compose.foundation.pager.PagerState$animateScrollToPage$1 r0 = (androidx.compose.foundation.pager.PagerState$animateScrollToPage$1) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            androidx.compose.foundation.pager.PagerState$animateScrollToPage$1 r0 = new androidx.compose.foundation.pager.PagerState$animateScrollToPage$1
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.s
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.u
            r3 = 0
            kotlin.Unit r4 = kotlin.Unit.f24250a
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L41
            if (r2 == r6) goto L35
            if (r2 != r5) goto L2d
            kotlin.ResultKt.b(r15)
            return r4
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            int r13 = r0.r
            androidx.compose.animation.core.SpringSpec r14 = r0.q
            androidx.compose.foundation.pager.PagerState r2 = r0.p
            kotlin.ResultKt.b(r15)
            r7 = r2
        L3f:
            r10 = r14
            goto L71
        L41:
            kotlin.ResultKt.b(r15)
            int r15 = r12.j()
            if (r13 != r15) goto L53
            float r15 = r12.k()
            int r15 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r15 != 0) goto L53
            goto Lb6
        L53:
            int r15 = r12.m()
            if (r15 != 0) goto L5a
            goto Lb6
        L5a:
            r0.p = r12
            r0.q = r14
            r0.r = r13
            r0.u = r6
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r15 = r12.y
            java.lang.Object r15 = r15.a(r0)
            if (r15 != r1) goto L6b
            goto L6c
        L6b:
            r15 = r4
        L6c:
            if (r15 != r1) goto L6f
            goto Lb5
        L6f:
            r7 = r12
            goto L3f
        L71:
            double r14 = (double) r3
            r8 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r2 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r2 > 0) goto L7f
            r8 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r14 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r14 > 0) goto L7f
            goto L95
        L7f:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "pageOffsetFraction "
            r14.<init>(r15)
            r14.append(r3)
            java.lang.String r15 = " is not within the range -0.5 to 0.5"
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            androidx.compose.foundation.internal.InlineClassHelperKt.a(r14)
        L95:
            int r8 = r7.i(r13)
            int r13 = r7.o()
            float r13 = (float) r13
            float r9 = r3 * r13
            androidx.compose.foundation.pager.PagerState$animateScrollToPage$3 r6 = new androidx.compose.foundation.pager.PagerState$animateScrollToPage$3
            r11 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            r13 = 0
            r0.p = r13
            r0.q = r13
            r0.u = r5
            androidx.compose.foundation.MutatePriority r13 = androidx.compose.foundation.MutatePriority.d
            java.lang.Object r13 = r7.e(r13, r6, r0)
            if (r13 != r1) goto Lb6
        Lb5:
            return r1
        Lb6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.f(int, androidx.compose.animation.core.SpringSpec, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0133 A[Catch: all -> 0x0143, TryCatch #0 {all -> 0x0143, blocks: (B:57:0x00de, B:59:0x00f1, B:61:0x00f5, B:63:0x0103, B:74:0x013d, B:69:0x0133, B:66:0x011b), top: B:87:0x00de }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013d A[Catch: all -> 0x0143, TRY_LEAVE, TryCatch #0 {all -> 0x0143, blocks: (B:57:0x00de, B:59:0x00f1, B:61:0x00f5, B:63:0x0103, B:74:0x013d, B:69:0x0133, B:66:0x011b), top: B:87:0x00de }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(androidx.compose.foundation.pager.PagerMeasureResult r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.h(androidx.compose.foundation.pager.PagerMeasureResult, boolean, boolean):void");
    }

    public final int i(int i) {
        if (m() > 0) {
            return RangesKt.c(i, 0, m() - 1);
        }
        return 0;
    }

    public final int j() {
        return ((SnapshotMutableIntStateImpl) this.d.b).d();
    }

    public final float k() {
        return ((SnapshotMutableFloatStateImpl) this.d.c).a();
    }

    public final PagerLayoutInfo l() {
        return (PagerLayoutInfo) ((SnapshotMutableStateImpl) this.p).getD();
    }

    public abstract int m();

    public final int n() {
        return ((PagerMeasureResult) ((SnapshotMutableStateImpl) this.p).getD()).b;
    }

    public final int o() {
        return ((PagerMeasureResult) ((SnapshotMutableStateImpl) this.p).getD()).c + n();
    }

    public final long p() {
        return ((Offset) ((SnapshotMutableStateImpl) this.c).getD()).f1751a;
    }

    public final boolean q() {
        return ((int) Float.intBitsToFloat((int) (p() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (p() & 4294967295L))) == 0;
    }

    public final void r(float f, PagerMeasureResult pagerMeasureResult) {
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle2;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle3;
        int i = pagerMeasureResult.h;
        List list = pagerMeasureResult.f1088a;
        if (this.l && !list.isEmpty()) {
            boolean z = f > BitmapDescriptorFactory.HUE_RED;
            int index = z ? i + ((PageInfo) CollectionsKt.O(list)).getF1082a() + 1 : (((PageInfo) CollectionsKt.D(list)).getF1082a() - i) - 1;
            if (index < 0 || index >= m()) {
                return;
            }
            if (index != this.m) {
                if (this.o != z && (prefetchHandle3 = this.n) != null) {
                    prefetchHandle3.cancel();
                }
                this.o = z;
                this.m = index;
                this.n = this.w.a(index, this.B);
            }
            if (z) {
                if ((((PageInfo) CollectionsKt.O(list)).getL() + (pagerMeasureResult.c + pagerMeasureResult.b)) - pagerMeasureResult.g >= f || (prefetchHandle2 = this.n) == null) {
                    return;
                }
                prefetchHandle2.b();
                return;
            }
            if (pagerMeasureResult.f - ((PageInfo) CollectionsKt.D(list)).getL() >= (-f) || (prefetchHandle = this.n) == null) {
                return;
            }
            prefetchHandle.b();
        }
    }

    public final void u(boolean z, float f, int i) {
        PagerScrollPosition pagerScrollPosition = this.d;
        ((SnapshotMutableIntStateImpl) pagerScrollPosition.b).i(i);
        pagerScrollPosition.f.b(i);
        ((SnapshotMutableFloatStateImpl) pagerScrollPosition.c).p(f);
        pagerScrollPosition.e = null;
        if (!z) {
            ObservableScopeInvalidator.b(this.E);
            return;
        }
        Remeasurement remeasurement = (Remeasurement) ((SnapshotMutableStateImpl) this.z).getD();
        if (remeasurement != null) {
            remeasurement.d();
        }
    }
}
