package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
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
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableIntStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LazyStaggeredGridState implements ScrollableState {
    public static final /* synthetic */ int w = 0;

    /* renamed from: a, reason: collision with root package name */
    public boolean f1080a;
    public LazyStaggeredGridMeasureResult b;
    public final LazyStaggeredGridScrollPosition c;
    public final MutableState d = SnapshotStateKt.e(LazyStaggeredGridMeasureResultKt.f1073a, SnapshotStateKt.g());
    public final LazyStaggeredGridLaneInfo e = new LazyStaggeredGridLaneInfo();
    public final MutableState f;
    public final MutableState g;
    public Remeasurement h;
    public final AwaitFirstLayoutModifier i;
    public final LazyLayoutBeyondBoundsInfo j;
    public final boolean k;
    public final LazyLayoutPrefetchState l;
    public final ScrollableState m;
    public float n;
    public int o;
    public final LinkedHashMap p;
    public final MutableInteractionSource q;
    public final LazyLayoutPinnedItemList r;
    public final LazyLayoutItemAnimator s;
    public final MutableState t;
    public final MutableState u;
    public final LazyLayoutScrollDeltaBetweenPasses v;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$Companion;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        ListSaverKt.a(LazyStaggeredGridState$Companion$Saver$2.h, LazyStaggeredGridState$Companion$Saver$1.h);
    }

    public LazyStaggeredGridState(int[] iArr, int[] iArr2) {
        this.c = new LazyStaggeredGridScrollPosition(iArr, iArr2, new LazyStaggeredGridState$scrollPosition$1(2, this, LazyStaggeredGridState.class, "fillNearestIndices", "fillNearestIndices(II)[I", 0));
        Boolean bool = Boolean.FALSE;
        this.f = SnapshotStateKt.f(bool);
        this.g = SnapshotStateKt.f(bool);
        new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$remeasurementModifier$1
            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public final void h0(LayoutNode layoutNode) {
                this.d.h = layoutNode;
            }
        };
        this.i = new AwaitFirstLayoutModifier();
        this.j = new LazyLayoutBeyondBoundsInfo();
        this.k = true;
        this.l = new LazyLayoutPrefetchState(null, null);
        this.m = ScrollableStateKt.a(new Function1<Float, Float>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollableState$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult;
                float f = -((Number) obj).floatValue();
                LazyStaggeredGridState lazyStaggeredGridState = this.h;
                MutableState mutableState = lazyStaggeredGridState.d;
                if ((f >= BitmapDescriptorFactory.HUE_RED || lazyStaggeredGridState.b()) && (f <= BitmapDescriptorFactory.HUE_RED || lazyStaggeredGridState.d())) {
                    if (Math.abs(lazyStaggeredGridState.n) > 0.5f) {
                        InlineClassHelperKt.c("entered drag with non-zero pending scroll");
                    }
                    float f2 = lazyStaggeredGridState.n + f;
                    lazyStaggeredGridState.n = f2;
                    if (Math.abs(f2) > 0.5f) {
                        float f3 = lazyStaggeredGridState.n;
                        int iB = MathKt.b(f3);
                        SnapshotMutableStateImpl snapshotMutableStateImpl = (SnapshotMutableStateImpl) mutableState;
                        LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResultG = ((LazyStaggeredGridMeasureResult) snapshotMutableStateImpl.getD()).g(iB, !lazyStaggeredGridState.f1080a);
                        if (lazyStaggeredGridMeasureResultG != null && (lazyStaggeredGridMeasureResult = lazyStaggeredGridState.b) != null) {
                            LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResultG2 = lazyStaggeredGridMeasureResult.g(iB, true);
                            if (lazyStaggeredGridMeasureResultG2 != null) {
                                lazyStaggeredGridState.b = lazyStaggeredGridMeasureResultG2;
                            } else {
                                lazyStaggeredGridMeasureResultG = null;
                            }
                        }
                        if (lazyStaggeredGridMeasureResultG != null) {
                            boolean z = lazyStaggeredGridState.f1080a;
                            LazyStaggeredGridScrollPosition lazyStaggeredGridScrollPosition = lazyStaggeredGridState.c;
                            if (z || !lazyStaggeredGridState.f1080a) {
                                boolean z2 = true;
                                if (z) {
                                    lazyStaggeredGridState.f1080a = true;
                                }
                                float f4 = lazyStaggeredGridState.n;
                                float f5 = lazyStaggeredGridMeasureResultG.c;
                                int[] iArr3 = lazyStaggeredGridMeasureResultG.f1072a;
                                int[] iArr4 = lazyStaggeredGridMeasureResultG.b;
                                lazyStaggeredGridState.n = f4 - f5;
                                ((SnapshotMutableStateImpl) lazyStaggeredGridState.d).setValue(lazyStaggeredGridMeasureResultG);
                                lazyStaggeredGridScrollPosition.d = iArr4;
                                ((SnapshotMutableIntStateImpl) lazyStaggeredGridScrollPosition.e).i(LazyStaggeredGridScrollPosition.b(lazyStaggeredGridScrollPosition.b, iArr4));
                                if (iArr3[0] == 0 && iArr4[0] <= 0) {
                                    z2 = false;
                                }
                                ((SnapshotMutableStateImpl) lazyStaggeredGridState.g).setValue(Boolean.valueOf(z2));
                                ((SnapshotMutableStateImpl) lazyStaggeredGridState.f).setValue(Boolean.valueOf(lazyStaggeredGridMeasureResultG.f));
                                if (z) {
                                    lazyStaggeredGridState.v.a(lazyStaggeredGridMeasureResultG.e, lazyStaggeredGridMeasureResultG.k, lazyStaggeredGridMeasureResultG.t);
                                }
                            } else {
                                lazyStaggeredGridState.b = lazyStaggeredGridMeasureResultG;
                            }
                            ObservableScopeInvalidator.b(lazyStaggeredGridState.t);
                            lazyStaggeredGridState.g(f3 - lazyStaggeredGridState.n, lazyStaggeredGridMeasureResultG);
                        } else {
                            Remeasurement remeasurement = lazyStaggeredGridState.h;
                            if (remeasurement != null) {
                                remeasurement.d();
                            }
                            lazyStaggeredGridState.g(f3 - lazyStaggeredGridState.n, (LazyStaggeredGridMeasureResult) snapshotMutableStateImpl.getD());
                        }
                    }
                    if (Math.abs(lazyStaggeredGridState.n) > 0.5f) {
                        f -= lazyStaggeredGridState.n;
                        lazyStaggeredGridState.n = BitmapDescriptorFactory.HUE_RED;
                    }
                } else {
                    f = 0.0f;
                }
                return Float.valueOf(-f);
            }
        });
        this.o = -1;
        this.p = new LinkedHashMap();
        this.q = InteractionSourceKt.a();
        this.r = new LazyLayoutPinnedItemList();
        this.s = new LazyLayoutItemAnimator();
        this.t = ObservableScopeInvalidator.a();
        this.u = ObservableScopeInvalidator.a();
        this.v = new LazyLayoutScrollDeltaBetweenPasses();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean a() {
        return this.m.a();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean b() {
        return ((Boolean) ((SnapshotMutableStateImpl) this.f).getD()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final float c(float f) {
        return this.m.c(f);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean d() {
        return ((Boolean) ((SnapshotMutableStateImpl) this.g).getD()).booleanValue();
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
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1 r0 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1 r0 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1
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
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r2 = r0.p
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
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r8 = r5.i
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L56
            goto L68
        L56:
            r2 = r5
        L57:
            androidx.compose.foundation.gestures.ScrollableState r8 = r2.m
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.e(androidx.compose.foundation.MutatePriority, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final LazyStaggeredGridLayoutInfo f() {
        return (LazyStaggeredGridLayoutInfo) ((SnapshotMutableStateImpl) this.d).getD();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void g(float f, LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult) {
        LinkedHashMap linkedHashMap;
        if (this.k) {
            ?? r0 = lazyStaggeredGridMeasureResult.m;
            if (((Collection) r0).isEmpty()) {
                return;
            }
            int i = 0;
            boolean z = f < BitmapDescriptorFactory.HUE_RED;
            int iD = z ? ((LazyStaggeredGridMeasuredItem) CollectionsKt.O(r0)).f1075a : ((LazyStaggeredGridMeasuredItem) CollectionsKt.D(r0)).f1075a;
            if (iD == this.o) {
                return;
            }
            this.o = iD;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LazyStaggeredGridSlots lazyStaggeredGridSlots = lazyStaggeredGridMeasureResult.i;
            int length = lazyStaggeredGridSlots.b.length;
            while (true) {
                linkedHashMap = this.p;
                if (i >= length) {
                    break;
                }
                LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo = this.e;
                if (z) {
                    iD++;
                    int length2 = lazyStaggeredGridLaneInfo.f1068a + lazyStaggeredGridLaneInfo.b.length;
                    while (true) {
                        if (iD >= length2) {
                            iD = lazyStaggeredGridLaneInfo.f1068a + lazyStaggeredGridLaneInfo.b.length;
                            break;
                        } else if (lazyStaggeredGridLaneInfo.a(iD, i)) {
                            break;
                        } else {
                            iD++;
                        }
                    }
                } else {
                    iD = lazyStaggeredGridLaneInfo.d(iD, i);
                }
                if (iD < 0 || iD >= lazyStaggeredGridMeasureResult.l || linkedHashSet.contains(Integer.valueOf(iD))) {
                    break;
                }
                linkedHashSet.add(Integer.valueOf(iD));
                if (!linkedHashMap.containsKey(Integer.valueOf(iD))) {
                    lazyStaggeredGridMeasureResult.j.a(iD);
                    int i2 = lazyStaggeredGridSlots.b[i];
                    linkedHashMap.put(Integer.valueOf(iD), this.l.a(iD, lazyStaggeredGridMeasureResult.u == Orientation.d ? Constraints.Companion.e(i2) : Constraints.Companion.d(i2)));
                }
                i++;
            }
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!linkedHashSet.contains(entry.getKey())) {
                    ((LazyLayoutPrefetchState.PrefetchHandle) entry.getValue()).cancel();
                    it.remove();
                }
            }
        }
    }
}
