package androidx.compose.foundation.lazy.grid;

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
import kotlin.collections.ArraysKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LazyGridState implements ScrollableState {
    public static final SaverKt$Saver$1 w = ListSaverKt.a(LazyGridState$Companion$Saver$2.h, LazyGridState$Companion$Saver$1.h);

    /* renamed from: a, reason: collision with root package name */
    public final LazyGridPrefetchStrategy f1025a;
    public boolean b;
    public LazyGridMeasureResult c;
    public final LazyGridScrollPosition d;
    public final MutableState e;
    public final MutableInteractionSource f;
    public float g;
    public final ScrollableState h;
    public final boolean i;
    public Remeasurement j;
    public final LazyGridState$remeasurementModifier$1 k;
    public final AwaitFirstLayoutModifier l;
    public final LazyLayoutItemAnimator m;
    public final LazyLayoutBeyondBoundsInfo n;
    public final LazyLayoutPrefetchState o;
    public final LazyGridState$prefetchScope$1 p;
    public final LazyLayoutPinnedItemList q;
    public final MutableState r;
    public final MutableState s;
    public final MutableState t;
    public final MutableState u;
    public final LazyLayoutScrollDeltaBetweenPasses v;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridState$Companion;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public LazyGridState(int i, int i2) {
        this(i, i2, new DefaultLazyGridPrefetchStrategy());
    }

    public static Object j(LazyGridState lazyGridState, int i, SuspendLambda suspendLambda) {
        lazyGridState.getClass();
        Object objE = lazyGridState.e(MutatePriority.d, new LazyGridState$scrollToItem$2(lazyGridState, i, null), suspendLambda);
        return objE == CoroutineSingletons.d ? objE : Unit.f24250a;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean a() {
        return this.h.a();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean b() {
        return ((Boolean) ((SnapshotMutableStateImpl) this.t).getD()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final float c(float f) {
        return this.h.c(f);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean d() {
        return ((Boolean) ((SnapshotMutableStateImpl) this.u).getD()).booleanValue();
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
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1 r0 = (androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1 r0 = new androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1
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
            androidx.compose.foundation.lazy.grid.LazyGridState r2 = r0.p
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridState.e(androidx.compose.foundation.MutatePriority, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void f(LazyGridMeasureResult lazyGridMeasureResult, boolean z, boolean z2) {
        LazyGridMeasuredItem lazyGridMeasuredItem;
        LazyGridMeasuredItem lazyGridMeasuredItem2;
        if (!z && this.b) {
            this.c = lazyGridMeasureResult;
            return;
        }
        if (z) {
            this.b = true;
        }
        float f = this.g;
        float f2 = lazyGridMeasureResult.d;
        int i = lazyGridMeasureResult.b;
        LazyGridMeasuredLine lazyGridMeasuredLine = lazyGridMeasureResult.f1014a;
        this.g = f - f2;
        ((SnapshotMutableStateImpl) this.e).setValue(lazyGridMeasureResult);
        int i2 = 0;
        ((SnapshotMutableStateImpl) this.u).setValue(Boolean.valueOf(((lazyGridMeasuredLine != null ? lazyGridMeasuredLine.f1017a : 0) == 0 && i == 0) ? false : true));
        ((SnapshotMutableStateImpl) this.t).setValue(Boolean.valueOf(lazyGridMeasureResult.c));
        LazyGridScrollPosition lazyGridScrollPosition = this.d;
        if (z2) {
            lazyGridScrollPosition.getClass();
            if (!(((float) i) >= BitmapDescriptorFactory.HUE_RED)) {
                InlineClassHelperKt.c("scrollOffset should be non-negative");
            }
            ((SnapshotMutableIntStateImpl) lazyGridScrollPosition.b).i(i);
        } else {
            lazyGridScrollPosition.getClass();
            lazyGridScrollPosition.d = (lazyGridMeasuredLine == null || (lazyGridMeasuredItem2 = (LazyGridMeasuredItem) ArraysKt.H(lazyGridMeasuredLine.b)) == null) ? null : lazyGridMeasuredItem2.b;
            if (lazyGridScrollPosition.c || lazyGridMeasureResult.o > 0) {
                lazyGridScrollPosition.c = true;
                if (!(((float) i) >= BitmapDescriptorFactory.HUE_RED)) {
                    InlineClassHelperKt.c("scrollOffset should be non-negative (" + i + ')');
                }
                if (lazyGridMeasuredLine != null && (lazyGridMeasuredItem = (LazyGridMeasuredItem) ArraysKt.H(lazyGridMeasuredLine.b)) != null) {
                    i2 = lazyGridMeasuredItem.f1015a;
                }
                lazyGridScrollPosition.a(i2, i);
            }
            if (this.i) {
                this.f1025a.b(lazyGridMeasureResult);
            }
        }
        if (z) {
            this.v.a(lazyGridMeasureResult.f, lazyGridMeasureResult.i, lazyGridMeasureResult.h);
        }
    }

    public final int g() {
        return ((SnapshotMutableIntStateImpl) this.d.f1019a).d();
    }

    public final int h() {
        return ((SnapshotMutableIntStateImpl) this.d.b).d();
    }

    public final LazyGridLayoutInfo i() {
        return (LazyGridLayoutInfo) ((SnapshotMutableStateImpl) this.e).getD();
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.foundation.lazy.grid.LazyGridState$remeasurementModifier$1] */
    public LazyGridState(final int i, int i2, LazyGridPrefetchStrategy lazyGridPrefetchStrategy) {
        this.f1025a = lazyGridPrefetchStrategy;
        this.d = new LazyGridScrollPosition(i, i2);
        this.e = SnapshotStateKt.e(LazyGridStateKt.f1027a, SnapshotStateKt.g());
        this.f = InteractionSourceKt.a();
        this.h = ScrollableStateKt.a(new Function1<Float, Float>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$scrollableState$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                LazyGridMeasureResult lazyGridMeasureResult;
                float fFloatValue = ((Number) obj).floatValue();
                LazyGridState lazyGridState = this.h;
                LazyGridState$prefetchScope$1 lazyGridState$prefetchScope$1 = lazyGridState.p;
                LazyGridPrefetchStrategy lazyGridPrefetchStrategy2 = lazyGridState.f1025a;
                boolean z = lazyGridState.i;
                float f = -fFloatValue;
                if ((f >= BitmapDescriptorFactory.HUE_RED || lazyGridState.b()) && (f <= BitmapDescriptorFactory.HUE_RED || lazyGridState.d())) {
                    if (Math.abs(lazyGridState.g) > 0.5f) {
                        InlineClassHelperKt.c("entered drag with non-zero pending scroll");
                    }
                    float f2 = lazyGridState.g + f;
                    lazyGridState.g = f2;
                    if (Math.abs(f2) > 0.5f) {
                        float f3 = lazyGridState.g;
                        int iB = MathKt.b(f3);
                        LazyGridMeasureResult lazyGridMeasureResultI = ((LazyGridMeasureResult) ((SnapshotMutableStateImpl) lazyGridState.e).getD()).i(iB, !lazyGridState.b);
                        if (lazyGridMeasureResultI != null && (lazyGridMeasureResult = lazyGridState.c) != null) {
                            LazyGridMeasureResult lazyGridMeasureResultI2 = lazyGridMeasureResult.i(iB, true);
                            if (lazyGridMeasureResultI2 != null) {
                                lazyGridState.c = lazyGridMeasureResultI2;
                            } else {
                                lazyGridMeasureResultI = null;
                            }
                        }
                        if (lazyGridMeasureResultI != null) {
                            lazyGridState.f(lazyGridMeasureResultI, lazyGridState.b, true);
                            ObservableScopeInvalidator.b(lazyGridState.r);
                            float f4 = f3 - lazyGridState.g;
                            if (z) {
                                lazyGridPrefetchStrategy2.c(lazyGridState$prefetchScope$1, f4, lazyGridMeasureResultI);
                            }
                        } else {
                            Remeasurement remeasurement = lazyGridState.j;
                            if (remeasurement != null) {
                                remeasurement.d();
                            }
                            float f5 = f3 - lazyGridState.g;
                            LazyGridLayoutInfo lazyGridLayoutInfoI = lazyGridState.i();
                            if (z) {
                                lazyGridPrefetchStrategy2.c(lazyGridState$prefetchScope$1, f5, lazyGridLayoutInfoI);
                            }
                        }
                    }
                    if (Math.abs(lazyGridState.g) > 0.5f) {
                        f -= lazyGridState.g;
                        lazyGridState.g = BitmapDescriptorFactory.HUE_RED;
                    }
                } else {
                    f = 0.0f;
                }
                return Float.valueOf(-f);
            }
        });
        this.i = true;
        this.k = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$remeasurementModifier$1
            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public final void h0(LayoutNode layoutNode) {
                this.d.j = layoutNode;
            }
        };
        this.l = new AwaitFirstLayoutModifier();
        this.m = new LazyLayoutItemAnimator();
        this.n = new LazyLayoutBeyondBoundsInfo();
        lazyGridPrefetchStrategy.getClass();
        this.o = new LazyLayoutPrefetchState(null, new Function1<NestedPrefetchScope, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$prefetchState$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                NestedPrefetchScope nestedPrefetchScope = (NestedPrefetchScope) obj;
                LazyGridPrefetchStrategy lazyGridPrefetchStrategy2 = this.h.f1025a;
                Snapshot snapshotA = Snapshot.Companion.a();
                Snapshot.Companion.e(snapshotA, Snapshot.Companion.b(snapshotA), snapshotA != null ? snapshotA.getG() : null);
                lazyGridPrefetchStrategy2.a(nestedPrefetchScope, i);
                return Unit.f24250a;
            }
        });
        this.p = new LazyGridState$prefetchScope$1(this);
        this.q = new LazyLayoutPinnedItemList();
        this.r = ObservableScopeInvalidator.a();
        this.s = ObservableScopeInvalidator.a();
        Boolean bool = Boolean.FALSE;
        this.t = SnapshotStateKt.f(bool);
        this.u = SnapshotStateKt.f(bool);
        this.v = new LazyLayoutScrollDeltaBetweenPasses();
    }
}
