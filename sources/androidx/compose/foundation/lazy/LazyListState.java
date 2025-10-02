package androidx.compose.foundation.lazy;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableIntStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.node.LayoutNode;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;

@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class LazyListState implements ScrollableState {
    public static final SaverKt$Saver$1 w = ListSaverKt.a(LazyListState$Companion$Saver$2.h, LazyListState$Companion$Saver$1.h);

    /* renamed from: a, reason: collision with root package name */
    public final LazyListPrefetchStrategy f1000a;
    public boolean b;
    public LazyListMeasureResult c;
    public final LazyListScrollPosition d;
    public final MutableState e;
    public final MutableInteractionSource f;
    public float g;
    public final ScrollableState h;
    public final boolean i;
    public Remeasurement j;
    public final LazyListState$remeasurementModifier$1 k;
    public final AwaitFirstLayoutModifier l;
    public final LazyLayoutItemAnimator m;
    public final LazyLayoutBeyondBoundsInfo n;
    public final LazyLayoutPrefetchState o;
    public final LazyListState$prefetchScope$1 p;
    public final LazyLayoutPinnedItemList q;
    public final MutableState r;
    public final MutableState s;
    public final MutableState t;
    public final MutableState u;
    public final LazyLayoutScrollDeltaBetweenPasses v;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListState$Companion;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public LazyListState(int i, int i2) {
        DefaultLazyListPrefetchStrategy defaultLazyListPrefetchStrategy = new DefaultLazyListPrefetchStrategy();
        defaultLazyListPrefetchStrategy.f988a = -1;
        this(i, i2, defaultLazyListPrefetchStrategy);
    }

    public static Object f(LazyListState lazyListState, int i, SuspendLambda suspendLambda) {
        lazyListState.getClass();
        Object objE = lazyListState.e(MutatePriority.d, new LazyListState$animateScrollToItem$2(i, lazyListState, null), suspendLambda);
        return objE == CoroutineSingletons.d ? objE : Unit.f24250a;
    }

    public static void k(LazyListState lazyListState) {
        if (lazyListState.h.a()) {
            BuildersKt.c(((LazyListMeasureResult) ((SnapshotMutableStateImpl) lazyListState.e).getD()).h, null, null, new LazyListState$requestScrollToItem$1(lazyListState, null), 3);
        }
        lazyListState.m(0, 0, false);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean a() {
        return this.h.a();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean b() {
        return ((Boolean) ((SnapshotMutableStateImpl) this.s).getD()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final float c(float f) {
        return this.h.c(f);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean d() {
        return ((Boolean) ((SnapshotMutableStateImpl) this.t).getD()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r8.e(r6, r7, r0) == r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(androidx.compose.foundation.MutatePriority r6, kotlin.jvm.functions.Function2 r7, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.LazyListState$scroll$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.lazy.LazyListState$scroll$1 r0 = (androidx.compose.foundation.lazy.LazyListState$scroll$1) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.LazyListState$scroll$1 r0 = new androidx.compose.foundation.lazy.LazyListState$scroll$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.s
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r8)
            goto L69
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            kotlin.coroutines.jvm.internal.SuspendLambda r6 = r0.r
            r7 = r6
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            androidx.compose.foundation.MutatePriority r6 = r0.q
            androidx.compose.foundation.lazy.LazyListState r2 = r0.p
            kotlin.ResultKt.b(r8)
            goto L57
        L3f:
            kotlin.ResultKt.b(r8)
            r0.p = r5
            r0.q = r6
            r8 = r7
            kotlin.coroutines.jvm.internal.SuspendLambda r8 = (kotlin.coroutines.jvm.internal.SuspendLambda) r8
            r0.r = r8
            r0.u = r4
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r8 = r5.l
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L56
            goto L68
        L56:
            r2 = r5
        L57:
            androidx.compose.foundation.gestures.ScrollableState r8 = r2.h
            r2 = 0
            r0.p = r2
            r0.q = r2
            r0.r = r2
            r0.u = r3
            java.lang.Object r6 = r8.e(r6, r7, r0)
            if (r6 != r1) goto L69
        L68:
            return r1
        L69:
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListState.e(androidx.compose.foundation.MutatePriority, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void g(LazyListMeasureResult lazyListMeasureResult, boolean z, boolean z2) {
        if (!z && this.b) {
            this.c = lazyListMeasureResult;
            return;
        }
        if (z) {
            this.b = true;
        }
        LazyListMeasuredItem lazyListMeasuredItem = lazyListMeasureResult.f995a;
        int i = lazyListMeasureResult.b;
        ((SnapshotMutableStateImpl) this.t).setValue(Boolean.valueOf(((lazyListMeasuredItem != null ? lazyListMeasuredItem.f996a : 0) == 0 && i == 0) ? false : true));
        ((SnapshotMutableStateImpl) this.s).setValue(Boolean.valueOf(lazyListMeasureResult.c));
        this.g -= lazyListMeasureResult.d;
        ((SnapshotMutableStateImpl) this.e).setValue(lazyListMeasureResult);
        LazyListScrollPosition lazyListScrollPosition = this.d;
        if (z2) {
            lazyListScrollPosition.getClass();
            if (!(((float) i) >= BitmapDescriptorFactory.HUE_RED)) {
                InlineClassHelperKt.c("scrollOffset should be non-negative");
            }
            ((SnapshotMutableIntStateImpl) lazyListScrollPosition.b).i(i);
        } else {
            lazyListScrollPosition.getClass();
            lazyListScrollPosition.d = lazyListMeasuredItem != null ? lazyListMeasuredItem.l : null;
            if (lazyListScrollPosition.c || lazyListMeasureResult.n > 0) {
                lazyListScrollPosition.c = true;
                if (!(((float) i) >= BitmapDescriptorFactory.HUE_RED)) {
                    InlineClassHelperKt.c("scrollOffset should be non-negative");
                }
                lazyListScrollPosition.a(lazyListMeasuredItem != null ? lazyListMeasuredItem.f996a : 0, i);
            }
            if (this.i) {
                this.f1000a.b(lazyListMeasureResult);
            }
        }
        if (z) {
            this.v.a(lazyListMeasureResult.f, lazyListMeasureResult.i, lazyListMeasureResult.h);
        }
    }

    public final int h() {
        return ((SnapshotMutableIntStateImpl) this.d.f998a).d();
    }

    public final int i() {
        return ((SnapshotMutableIntStateImpl) this.d.b).d();
    }

    public final LazyListLayoutInfo j() {
        return (LazyListLayoutInfo) ((SnapshotMutableStateImpl) this.e).getD();
    }

    public final Object l(int i, int i2, Continuation continuation) {
        Object objE = e(MutatePriority.d, new LazyListState$scrollToItem$2(this, i, i2, null), continuation);
        return objE == CoroutineSingletons.d ? objE : Unit.f24250a;
    }

    public final void m(int i, int i2, boolean z) {
        LazyListScrollPosition lazyListScrollPosition = this.d;
        if (((SnapshotMutableIntStateImpl) lazyListScrollPosition.f998a).d() != i || ((SnapshotMutableIntStateImpl) lazyListScrollPosition.b).d() != i2) {
            LazyLayoutItemAnimator lazyLayoutItemAnimator = this.m;
            lazyLayoutItemAnimator.e();
            lazyLayoutItemAnimator.b = null;
            lazyLayoutItemAnimator.c = -1;
        }
        lazyListScrollPosition.a(i, i2);
        lazyListScrollPosition.d = null;
        if (!z) {
            ObservableScopeInvalidator.b(this.r);
            return;
        }
        Remeasurement remeasurement = this.j;
        if (remeasurement != null) {
            remeasurement.d();
        }
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.foundation.lazy.LazyListState$remeasurementModifier$1] */
    public LazyListState(final int i, int i2, LazyListPrefetchStrategy lazyListPrefetchStrategy) {
        this.f1000a = lazyListPrefetchStrategy;
        this.d = new LazyListScrollPosition(i, i2);
        this.e = SnapshotStateKt.e(LazyListStateKt.f1002a, SnapshotStateKt.g());
        this.f = InteractionSourceKt.a();
        this.h = ScrollableStateKt.a(new Function1<Float, Float>() { // from class: androidx.compose.foundation.lazy.LazyListState$scrollableState$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                LazyListMeasureResult lazyListMeasureResult;
                float fFloatValue = ((Number) obj).floatValue();
                LazyListState lazyListState = this.h;
                LazyListState$prefetchScope$1 lazyListState$prefetchScope$1 = lazyListState.p;
                LazyListPrefetchStrategy lazyListPrefetchStrategy2 = lazyListState.f1000a;
                boolean z = lazyListState.i;
                float f = -fFloatValue;
                if ((f >= BitmapDescriptorFactory.HUE_RED || lazyListState.b()) && (f <= BitmapDescriptorFactory.HUE_RED || lazyListState.d())) {
                    if (Math.abs(lazyListState.g) > 0.5f) {
                        InlineClassHelperKt.c("entered drag with non-zero pending scroll");
                    }
                    float f2 = lazyListState.g + f;
                    lazyListState.g = f2;
                    if (Math.abs(f2) > 0.5f) {
                        float f3 = lazyListState.g;
                        int iRound = Math.round(f3);
                        LazyListMeasureResult lazyListMeasureResultI = ((LazyListMeasureResult) ((SnapshotMutableStateImpl) lazyListState.e).getD()).i(iRound, !lazyListState.b);
                        if (lazyListMeasureResultI != null && (lazyListMeasureResult = lazyListState.c) != null) {
                            LazyListMeasureResult lazyListMeasureResultI2 = lazyListMeasureResult.i(iRound, true);
                            if (lazyListMeasureResultI2 != null) {
                                lazyListState.c = lazyListMeasureResultI2;
                            } else {
                                lazyListMeasureResultI = null;
                            }
                        }
                        if (lazyListMeasureResultI != null) {
                            lazyListState.g(lazyListMeasureResultI, lazyListState.b, true);
                            ObservableScopeInvalidator.b(lazyListState.u);
                            float f4 = f3 - lazyListState.g;
                            if (z) {
                                lazyListPrefetchStrategy2.c(lazyListState$prefetchScope$1, f4, lazyListMeasureResultI);
                            }
                        } else {
                            Remeasurement remeasurement = lazyListState.j;
                            if (remeasurement != null) {
                                remeasurement.d();
                            }
                            float f5 = f3 - lazyListState.g;
                            LazyListLayoutInfo lazyListLayoutInfoJ = lazyListState.j();
                            if (z) {
                                lazyListPrefetchStrategy2.c(lazyListState$prefetchScope$1, f5, lazyListLayoutInfoJ);
                            }
                        }
                    }
                    if (Math.abs(lazyListState.g) > 0.5f) {
                        f -= lazyListState.g;
                        lazyListState.g = BitmapDescriptorFactory.HUE_RED;
                    }
                } else {
                    f = 0.0f;
                }
                return Float.valueOf(-f);
            }
        });
        this.i = true;
        this.k = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.LazyListState$remeasurementModifier$1
            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public final void h0(LayoutNode layoutNode) {
                this.d.j = layoutNode;
            }
        };
        this.l = new AwaitFirstLayoutModifier();
        this.m = new LazyLayoutItemAnimator();
        this.n = new LazyLayoutBeyondBoundsInfo();
        lazyListPrefetchStrategy.getClass();
        this.o = new LazyLayoutPrefetchState(null, new Function1<NestedPrefetchScope, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListState$prefetchState$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                NestedPrefetchScope nestedPrefetchScope = (NestedPrefetchScope) obj;
                LazyListPrefetchStrategy lazyListPrefetchStrategy2 = this.h.f1000a;
                Snapshot snapshotA = Snapshot.Companion.a();
                Snapshot.Companion.e(snapshotA, Snapshot.Companion.b(snapshotA), snapshotA != null ? snapshotA.getG() : null);
                lazyListPrefetchStrategy2.a(nestedPrefetchScope, i);
                return Unit.f24250a;
            }
        });
        this.p = new LazyListState$prefetchScope$1(this);
        this.q = new LazyLayoutPinnedItemList();
        this.r = ObservableScopeInvalidator.a();
        Boolean bool = Boolean.FALSE;
        this.s = SnapshotStateKt.f(bool);
        this.t = SnapshotStateKt.f(bool);
        this.u = ObservableScopeInvalidator.a();
        this.v = new LazyLayoutScrollDeltaBetweenPasses();
    }
}
