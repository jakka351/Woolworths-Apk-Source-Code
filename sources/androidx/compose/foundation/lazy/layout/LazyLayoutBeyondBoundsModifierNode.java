package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/layout/BeyondBoundsLayout;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsModifierNode extends Modifier.Node implements ModifierLocalModifierNode, BeyondBoundsLayout, LayoutModifierNode {
    public static final LazyLayoutBeyondBoundsModifierNode$Companion$emptyBeyondBoundsScope$1 v = new LazyLayoutBeyondBoundsModifierNode$Companion$emptyBeyondBoundsScope$1();
    public LazyLayoutBeyondBoundsState r;
    public LazyLayoutBeyondBoundsInfo s;
    public boolean t;
    public Orientation u;

    @Metadata(d1 = {"\u0000\u000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierNode$Companion;", "", "androidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierNode$Companion$emptyBeyondBoundsScope$1", "emptyBeyondBoundsScope", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierNode$Companion$emptyBeyondBoundsScope$1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LayoutDirection layoutDirection = LayoutDirection.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public final ModifierLocalMap f0() {
        return ModifierLocalModifierNodeKt.a(new Pair(BeyondBoundsLayoutKt.a(), this));
    }

    @Override // androidx.compose.ui.layout.BeyondBoundsLayout
    public final Object h1(final int i, Function1 function1) {
        if (this.r.a() <= 0 || !this.r.d() || !this.q) {
            return function1.invoke(v);
        }
        int iE = t2(i) ? this.r.e() : this.r.c();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo = this.s;
        lazyLayoutBeyondBoundsInfo.getClass();
        LazyLayoutBeyondBoundsInfo.Interval interval = new LazyLayoutBeyondBoundsInfo.Interval(iE, iE);
        lazyLayoutBeyondBoundsInfo.f1034a.c(interval);
        objectRef.d = interval;
        int iB = this.r.b() * 2;
        int iA = this.r.a();
        if (iB > iA) {
            iB = iA;
        }
        Object objInvoke = null;
        int i2 = 0;
        while (objInvoke == null && s2((LazyLayoutBeyondBoundsInfo.Interval) objectRef.d, i) && i2 < iB) {
            LazyLayoutBeyondBoundsInfo.Interval interval2 = (LazyLayoutBeyondBoundsInfo.Interval) objectRef.d;
            int i3 = interval2.f1035a;
            int i4 = interval2.b;
            if (t2(i)) {
                i4++;
            } else {
                i3--;
            }
            LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo2 = this.s;
            lazyLayoutBeyondBoundsInfo2.getClass();
            LazyLayoutBeyondBoundsInfo.Interval interval3 = new LazyLayoutBeyondBoundsInfo.Interval(i3, i4);
            lazyLayoutBeyondBoundsInfo2.f1034a.c(interval3);
            this.s.f1034a.k((LazyLayoutBeyondBoundsInfo.Interval) objectRef.d);
            objectRef.d = interval3;
            i2++;
            DelegatableNodeKt.g(this).d();
            objInvoke = function1.invoke(new BeyondBoundsLayout.BeyondBoundsScope() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierNode$layout$2
                @Override // androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope
                public final boolean a() {
                    return this.f1036a.s2((LazyLayoutBeyondBoundsInfo.Interval) objectRef.d, i);
                }
            });
        }
        this.s.f1034a.k((LazyLayoutBeyondBoundsInfo.Interval) objectRef.d);
        DelegatableNodeKt.g(this).d();
        return objInvoke;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult n(MeasureScope measureScope, Measurable measurable, long j) {
        final Placeable placeableC0 = measurable.c0(j);
        return measureScope.L0(placeableC0.d, placeableC0.e, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierNode$measure$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ((Placeable.PlacementScope) obj).e(placeableC0, 0, 0, BitmapDescriptorFactory.HUE_RED);
                return Unit.f24250a;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean s2(androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo.Interval r5, int r6) {
        /*
            r4 = this;
            r0 = 5
            boolean r0 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.a(r6, r0)
            r1 = 1
            if (r0 == 0) goto La
            r0 = r1
            goto Lf
        La:
            r0 = 6
            boolean r0 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.a(r6, r0)
        Lf:
            r2 = 0
            if (r0 == 0) goto L1c
            androidx.compose.foundation.gestures.Orientation r0 = r4.u
            androidx.compose.foundation.gestures.Orientation r3 = androidx.compose.foundation.gestures.Orientation.e
            if (r0 != r3) goto L1a
        L18:
            r0 = r1
            goto L43
        L1a:
            r0 = r2
            goto L43
        L1c:
            r0 = 3
            boolean r0 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.a(r6, r0)
            if (r0 == 0) goto L25
            r0 = r1
            goto L2a
        L25:
            r0 = 4
            boolean r0 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.a(r6, r0)
        L2a:
            if (r0 == 0) goto L33
            androidx.compose.foundation.gestures.Orientation r0 = r4.u
            androidx.compose.foundation.gestures.Orientation r3 = androidx.compose.foundation.gestures.Orientation.d
            if (r0 != r3) goto L1a
            goto L18
        L33:
            boolean r0 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.a(r6, r1)
            if (r0 == 0) goto L3b
            r0 = r1
            goto L40
        L3b:
            r0 = 2
            boolean r0 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.a(r6, r0)
        L40:
            if (r0 == 0) goto L5e
            goto L1a
        L43:
            if (r0 == 0) goto L46
            goto L5d
        L46:
            boolean r6 = r4.t2(r6)
            if (r6 == 0) goto L58
            int r5 = r5.b
            androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState r6 = r4.r
            int r6 = r6.a()
            int r6 = r6 - r1
            if (r5 >= r6) goto L5d
            goto L5c
        L58:
            int r5 = r5.f1035a
            if (r5 <= 0) goto L5d
        L5c:
            return r1
        L5d:
            return r2
        L5e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Lazy list does not support beyond bounds layout for the specified direction"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierNode.s2(androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo$Interval, int):boolean");
    }

    public final boolean t2(int i) {
        if (BeyondBoundsLayout.LayoutDirection.a(i, 1)) {
            return false;
        }
        if (!BeyondBoundsLayout.LayoutDirection.a(i, 2)) {
            if (BeyondBoundsLayout.LayoutDirection.a(i, 5)) {
                return this.t;
            }
            if (BeyondBoundsLayout.LayoutDirection.a(i, 6)) {
                if (this.t) {
                    return false;
                }
            } else if (BeyondBoundsLayout.LayoutDirection.a(i, 3)) {
                int iOrdinal = DelegatableNodeKt.g(this).E.ordinal();
                if (iOrdinal == 0) {
                    return this.t;
                }
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                if (this.t) {
                    return false;
                }
            } else {
                if (!BeyondBoundsLayout.LayoutDirection.a(i, 4)) {
                    throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
                }
                int iOrdinal2 = DelegatableNodeKt.g(this).E.ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        return this.t;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (this.t) {
                    return false;
                }
            }
        }
        return true;
    }
}
