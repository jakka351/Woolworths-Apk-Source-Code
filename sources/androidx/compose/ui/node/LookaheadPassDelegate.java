package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/node/LookaheadPassDelegate;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "Landroidx/compose/ui/node/MotionReferencePlacementDelegate;", "PlacedState", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LookaheadPassDelegate extends Placeable implements Measurable, AlignmentLinesOwner, MotionReferencePlacementDelegate {
    public Object A;
    public boolean B;
    public final LayoutNodeLayoutDelegate i;
    public boolean j;
    public boolean n;
    public boolean o;
    public boolean p;
    public Constraints q;
    public Function1 s;
    public GraphicsLayer t;
    public boolean y;
    public int k = Integer.MAX_VALUE;
    public int l = Integer.MAX_VALUE;
    public LayoutNode.UsageByParent m = LayoutNode.UsageByParent.f;
    public long r = 0;
    public PlacedState u = PlacedState.f;
    public final LookaheadAlignmentLines v = new LookaheadAlignmentLines(this);
    public final MutableVector w = new MutableVector(new LookaheadPassDelegate[16], 0);
    public boolean x = true;
    public boolean z = true;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/LookaheadPassDelegate$PlacedState;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PlacedState {
        public static final PlacedState d;
        public static final PlacedState e;
        public static final PlacedState f;
        public static final /* synthetic */ PlacedState[] g;
        public static final /* synthetic */ EnumEntries h;

        static {
            PlacedState placedState = new PlacedState("IsPlacedInLookahead", 0);
            d = placedState;
            PlacedState placedState2 = new PlacedState("IsPlacedInApproach", 1);
            e = placedState2;
            PlacedState placedState3 = new PlacedState("IsNotPlaced", 2);
            f = placedState3;
            PlacedState[] placedStateArr = {placedState, placedState2, placedState3};
            g = placedStateArr;
            h = EnumEntriesKt.a(placedStateArr);
        }

        public static PlacedState valueOf(String str) {
            return (PlacedState) Enum.valueOf(PlacedState.class, str);
        }

        public static PlacedState[] values() {
            return (PlacedState[]) g.clone();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.d;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                LayoutNode.LayoutState layoutState3 = LayoutNode.LayoutState.d;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.d;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public LookaheadPassDelegate(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate) {
        this.i = layoutNodeLayoutDelegate;
        this.A = layoutNodeLayoutDelegate.p.v;
    }

    /* renamed from: A0, reason: from getter */
    public final boolean getY() {
        return this.y;
    }

    /* renamed from: B0, reason: from getter */
    public final LayoutNode.UsageByParent getM() {
        return this.m;
    }

    public final boolean C0() {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.i;
        if (LayoutNodeLayoutDelegateKt.a(layoutNodeLayoutDelegate.f1921a)) {
            return true;
        }
        if (this.u == PlacedState.f && !layoutNodeLayoutDelegate.b) {
            layoutNodeLayoutDelegate.c = true;
        }
        return layoutNodeLayoutDelegate.c;
    }

    /* renamed from: D0, reason: from getter */
    public final boolean getO() {
        return this.o;
    }

    public final void E0(boolean z) {
        LayoutNode layoutNodeK;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.i;
        LayoutNode layoutNodeK2 = layoutNodeLayoutDelegate.f1921a.K();
        LayoutNode.UsageByParent usageByParent = layoutNodeLayoutDelegate.f1921a.H;
        if (layoutNodeK2 == null || usageByParent == LayoutNode.UsageByParent.f) {
            return;
        }
        while (layoutNodeK2.H == usageByParent && (layoutNodeK = layoutNodeK2.K()) != null) {
            layoutNodeK2 = layoutNodeK;
        }
        int iOrdinal = usageByParent.ordinal();
        if (iOrdinal == 0) {
            if (layoutNodeK2.m != null) {
                LayoutNode.k0(layoutNodeK2, z, 6);
                return;
            } else {
                LayoutNode.m0(layoutNodeK2, z, 6);
                return;
            }
        }
        if (iOrdinal != 1) {
            throw new IllegalStateException("Intrinsics isn't used by the parent");
        }
        if (layoutNodeK2.m != null) {
            layoutNodeK2.j0(z);
        } else {
            layoutNodeK2.l0(z);
        }
    }

    public final void F0() {
        this.z = true;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final void I() {
        LayoutNode.k0(this.i.f1921a, false, 7);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int J(int i) {
        S0();
        LookaheadDelegate v = this.i.a().getV();
        Intrinsics.e(v);
        return v.J(i);
    }

    public final void J0(boolean z) {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.i;
        if (z && layoutNodeLayoutDelegate.c) {
            return;
        }
        if (z || layoutNodeLayoutDelegate.c) {
            this.u = PlacedState.f;
            MutableVector mutableVectorN = layoutNodeLayoutDelegate.f1921a.N();
            Object[] objArr = mutableVectorN.d;
            int i = mutableVectorN.f;
            for (int i2 = 0; i2 < i; i2++) {
                LookaheadPassDelegate lookaheadPassDelegate = ((LayoutNode) objArr[i2]).L.q;
                Intrinsics.e(lookaheadPassDelegate);
                lookaheadPassDelegate.J0(true);
            }
        }
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final AlignmentLinesOwner O() {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate;
        LayoutNode layoutNodeK = this.i.f1921a.K();
        if (layoutNodeK == null || (layoutNodeLayoutDelegate = layoutNodeK.L) == null) {
            return null;
        }
        return layoutNodeLayoutDelegate.q;
    }

    public final void O0() {
        PlacedState placedState = this.u;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.i;
        boolean z = layoutNodeLayoutDelegate.c;
        LayoutNode layoutNode = layoutNodeLayoutDelegate.f1921a;
        if (z) {
            this.u = PlacedState.e;
        } else {
            this.u = PlacedState.d;
        }
        if (placedState != PlacedState.d && layoutNodeLayoutDelegate.e) {
            LayoutNode.k0(layoutNode, true, 6);
        }
        MutableVector mutableVectorN = layoutNode.N();
        Object[] objArr = mutableVectorN.d;
        int i = mutableVectorN.f;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            LookaheadPassDelegate lookaheadPassDelegate = layoutNode2.L.q;
            if (lookaheadPassDelegate == null) {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (lookaheadPassDelegate.l != Integer.MAX_VALUE) {
                lookaheadPassDelegate.O0();
                LayoutNode.n0(layoutNode2);
            }
        }
    }

    public final void P0() {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.i;
        if (layoutNodeLayoutDelegate.o > 0) {
            MutableVector mutableVectorN = layoutNodeLayoutDelegate.f1921a.N();
            Object[] objArr = mutableVectorN.d;
            int i = mutableVectorN.f;
            for (int i2 = 0; i2 < i; i2++) {
                LayoutNode layoutNode = (LayoutNode) objArr[i2];
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = layoutNode.L;
                if ((layoutNodeLayoutDelegate2.m || layoutNodeLayoutDelegate2.n) && !layoutNodeLayoutDelegate2.f) {
                    layoutNode.j0(false);
                }
                LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate2.q;
                if (lookaheadPassDelegate != null) {
                    lookaheadPassDelegate.P0();
                }
            }
        }
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final void R() {
        this.y = true;
        LookaheadAlignmentLines lookaheadAlignmentLines = this.v;
        lookaheadAlignmentLines.i();
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.i;
        boolean z = layoutNodeLayoutDelegate.f;
        LayoutNode layoutNode = layoutNodeLayoutDelegate.f1921a;
        if (z) {
            MutableVector mutableVectorN = layoutNode.N();
            Object[] objArr = mutableVectorN.d;
            int i = mutableVectorN.f;
            for (int i2 = 0; i2 < i; i2++) {
                LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = layoutNode2.L;
                if (layoutNodeLayoutDelegate2.e && layoutNode2.I() == LayoutNode.UsageByParent.d) {
                    LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate2.q;
                    Intrinsics.e(lookaheadPassDelegate);
                    LookaheadPassDelegate lookaheadPassDelegate2 = layoutNodeLayoutDelegate2.q;
                    Constraints q = lookaheadPassDelegate2 != null ? lookaheadPassDelegate2.getQ() : null;
                    Intrinsics.e(q);
                    if (lookaheadPassDelegate.Z0(q.f2197a)) {
                        LayoutNode.k0(layoutNode, false, 7);
                    }
                }
            }
        }
        final LookaheadDelegate lookaheadDelegate = U().V;
        Intrinsics.e(lookaheadDelegate);
        if (layoutNodeLayoutDelegate.g || (!this.n && !lookaheadDelegate.k && layoutNodeLayoutDelegate.f)) {
            layoutNodeLayoutDelegate.f = false;
            LayoutNode.LayoutState layoutState = layoutNodeLayoutDelegate.d;
            layoutNodeLayoutDelegate.d = LayoutNode.LayoutState.g;
            Owner ownerA = LayoutNodeKt.a(layoutNode);
            layoutNodeLayoutDelegate.h(false);
            OwnerSnapshotObserver snapshotObserver = ownerA.getSnapshotObserver();
            Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildren$1

                @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "child", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildren$1$1, reason: invalid class name */
                final class AnonymousClass1 extends Lambda implements Function1<AlignmentLinesOwner, Unit> {
                    public static final AnonymousClass1 h = new AnonymousClass1(1);

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((AlignmentLinesOwner) obj).o().d = false;
                        return Unit.f24250a;
                    }
                }

                @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "child", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildren$1$4, reason: invalid class name */
                final class AnonymousClass4 extends Lambda implements Function1<AlignmentLinesOwner, Unit> {
                    public static final AnonymousClass4 h = new AnonymousClass4(1);

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        AlignmentLinesOwner alignmentLinesOwner = (AlignmentLinesOwner) obj;
                        alignmentLinesOwner.o().e = alignmentLinesOwner.o().d;
                        return Unit.f24250a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    LookaheadPassDelegate lookaheadPassDelegate3 = this.h;
                    LayoutNodeLayoutDelegate layoutNodeLayoutDelegate3 = lookaheadPassDelegate3.i;
                    layoutNodeLayoutDelegate3.h = 0;
                    MutableVector mutableVectorN2 = layoutNodeLayoutDelegate3.f1921a.N();
                    Object[] objArr2 = mutableVectorN2.d;
                    int i3 = mutableVectorN2.f;
                    for (int i4 = 0; i4 < i3; i4++) {
                        LookaheadPassDelegate lookaheadPassDelegate4 = ((LayoutNode) objArr2[i4]).L.q;
                        Intrinsics.e(lookaheadPassDelegate4);
                        lookaheadPassDelegate4.k = lookaheadPassDelegate4.l;
                        lookaheadPassDelegate4.l = Integer.MAX_VALUE;
                        if (lookaheadPassDelegate4.m == LayoutNode.UsageByParent.e) {
                            lookaheadPassDelegate4.m = LayoutNode.UsageByParent.f;
                        }
                    }
                    lookaheadPassDelegate3.f0(AnonymousClass1.h);
                    LookaheadDelegate lookaheadDelegate2 = lookaheadPassDelegate3.U().V;
                    if (lookaheadDelegate2 != null) {
                        boolean z2 = lookaheadDelegate2.k;
                        List listD = layoutNodeLayoutDelegate3.f1921a.D();
                        int size = listD.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            LookaheadDelegate v = ((LayoutNode) listD.get(i5)).K.c.getV();
                            if (v != null) {
                                v.k = z2;
                            }
                        }
                    }
                    lookaheadDelegate.D0().q();
                    if (lookaheadPassDelegate3.U().V != null) {
                        List listD2 = layoutNodeLayoutDelegate3.f1921a.D();
                        int size2 = listD2.size();
                        for (int i6 = 0; i6 < size2; i6++) {
                            LookaheadDelegate v2 = ((LayoutNode) listD2.get(i6)).K.c.getV();
                            if (v2 != null) {
                                v2.k = false;
                            }
                        }
                    }
                    MutableVector mutableVectorN3 = layoutNodeLayoutDelegate3.f1921a.N();
                    Object[] objArr3 = mutableVectorN3.d;
                    int i7 = mutableVectorN3.f;
                    for (int i8 = 0; i8 < i7; i8++) {
                        LookaheadPassDelegate lookaheadPassDelegate5 = ((LayoutNode) objArr3[i8]).L.q;
                        Intrinsics.e(lookaheadPassDelegate5);
                        int i9 = lookaheadPassDelegate5.k;
                        int i10 = lookaheadPassDelegate5.l;
                        if (i9 != i10 && i10 == Integer.MAX_VALUE) {
                            lookaheadPassDelegate5.J0(true);
                        }
                    }
                    lookaheadPassDelegate3.f0(AnonymousClass4.h);
                    return Unit.f24250a;
                }
            };
            snapshotObserver.getClass();
            if (layoutNode.m != null) {
                snapshotObserver.b(layoutNode, snapshotObserver.h, function0);
            } else {
                snapshotObserver.b(layoutNode, snapshotObserver.e, function0);
            }
            layoutNodeLayoutDelegate.d = layoutState;
            if (layoutNodeLayoutDelegate.m && lookaheadDelegate.k) {
                requestLayout();
            }
            layoutNodeLayoutDelegate.g = false;
        }
        if (lookaheadAlignmentLines.d) {
            lookaheadAlignmentLines.e = true;
        }
        if (lookaheadAlignmentLines.b && lookaheadAlignmentLines.f()) {
            lookaheadAlignmentLines.h();
        }
        this.y = false;
    }

    public final void R0() {
        this.u = PlacedState.d;
    }

    public final void S0() {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.i;
        LayoutNode.k0(layoutNodeLayoutDelegate.f1921a, false, 7);
        LayoutNode layoutNode = layoutNodeLayoutDelegate.f1921a;
        LayoutNode layoutNodeK = layoutNode.K();
        if (layoutNodeK == null || layoutNode.H != LayoutNode.UsageByParent.f) {
            return;
        }
        int iOrdinal = layoutNodeK.L.d.ordinal();
        layoutNode.H = iOrdinal != 0 ? iOrdinal != 2 ? layoutNodeK.H : LayoutNode.UsageByParent.e : LayoutNode.UsageByParent.d;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int T(int i) {
        S0();
        LookaheadDelegate v = this.i.a().getV();
        Intrinsics.e(v);
        return v.T(i);
    }

    public final void T0() {
        this.l = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.u = PlacedState.f;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final InnerNodeCoordinator U() {
        return this.i.f1921a.K.b;
    }

    public final void V0() {
        LayoutNode.LayoutState layoutState;
        this.B = true;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.i;
        LayoutNode layoutNodeK = layoutNodeLayoutDelegate.f1921a.K();
        PlacedState placedState = this.u;
        if ((placedState != PlacedState.d && !layoutNodeLayoutDelegate.c) || (placedState != PlacedState.e && layoutNodeLayoutDelegate.c)) {
            O0();
            if (this.j && layoutNodeK != null) {
                layoutNodeK.j0(false);
            }
        }
        if (layoutNodeK != null) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = layoutNodeK.L;
            if (!this.j && ((layoutState = layoutNodeLayoutDelegate2.d) == LayoutNode.LayoutState.f || layoutState == LayoutNode.LayoutState.g)) {
                if (this.l != Integer.MAX_VALUE) {
                    InlineClassHelperKt.b("Place was called on a node which was placed already");
                }
                int i = layoutNodeLayoutDelegate2.h;
                this.l = i;
                layoutNodeLayoutDelegate2.h = i + 1;
            }
        } else {
            this.l = 0;
        }
        R();
    }

    public final void W0(final long j, GraphicsLayer graphicsLayer, Function1 function1) {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.i;
        LayoutNode layoutNode = layoutNodeLayoutDelegate.f1921a;
        LayoutNode layoutNode2 = layoutNodeLayoutDelegate.f1921a;
        LayoutNode layoutNodeK = layoutNode.K();
        LayoutNode.LayoutState layoutState = layoutNodeK != null ? layoutNodeK.L.d : null;
        LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.g;
        if (layoutState == layoutState2) {
            layoutNodeLayoutDelegate.c = false;
        }
        if (layoutNode2.U) {
            InlineClassHelperKt.a("place is called on a deactivated node");
        }
        layoutNodeLayoutDelegate.d = layoutState2;
        this.o = true;
        this.B = false;
        if (!IntOffset.b(j, this.r)) {
            if (layoutNodeLayoutDelegate.n || layoutNodeLayoutDelegate.m) {
                layoutNodeLayoutDelegate.f = true;
            }
            P0();
        }
        final Owner ownerA = LayoutNodeKt.a(layoutNode2);
        if (layoutNodeLayoutDelegate.f || !getW()) {
            layoutNodeLayoutDelegate.g(false);
            this.v.g = false;
            OwnerSnapshotObserver snapshotObserver = ownerA.getSnapshotObserver();
            Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$placeSelf$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    LookaheadDelegate v;
                    LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = this.h.i;
                    Placeable.PlacementScope placementScope = null;
                    if (LayoutNodeLayoutDelegateKt.a(layoutNodeLayoutDelegate2.f1921a) || layoutNodeLayoutDelegate2.c) {
                        NodeCoordinator nodeCoordinator = layoutNodeLayoutDelegate2.a().t;
                        if (nodeCoordinator != null) {
                            placementScope = nodeCoordinator.l;
                        }
                    } else {
                        NodeCoordinator nodeCoordinator2 = layoutNodeLayoutDelegate2.a().t;
                        if (nodeCoordinator2 != null && (v = nodeCoordinator2.getV()) != null) {
                            placementScope = v.l;
                        }
                    }
                    if (placementScope == null) {
                        placementScope = ownerA.getPlacementScope();
                    }
                    LookaheadDelegate v2 = layoutNodeLayoutDelegate2.a().getV();
                    Intrinsics.e(v2);
                    Placeable.PlacementScope.g(placementScope, v2, j);
                    return Unit.f24250a;
                }
            };
            snapshotObserver.getClass();
            if (layoutNode2.m != null) {
                snapshotObserver.b(layoutNode2, snapshotObserver.g, function0);
            } else {
                snapshotObserver.b(layoutNode2, snapshotObserver.f, function0);
            }
        } else {
            LookaheadDelegate v = layoutNodeLayoutDelegate.a().getV();
            Intrinsics.e(v);
            v.T0(IntOffset.d(j, v.h));
            V0();
        }
        this.r = j;
        this.s = function1;
        this.t = graphicsLayer;
        layoutNodeLayoutDelegate.d = LayoutNode.LayoutState.h;
    }

    public final boolean Z0(final long j) {
        long j2;
        long j3;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.i;
        LayoutNode layoutNode = layoutNodeLayoutDelegate.f1921a;
        LayoutNode layoutNode2 = layoutNodeLayoutDelegate.f1921a;
        if (layoutNode.U) {
            InlineClassHelperKt.a("measure is called on a deactivated node");
        }
        LayoutNode layoutNodeK = layoutNode2.K();
        layoutNode2.J = layoutNode2.J || (layoutNodeK != null && layoutNodeK.J);
        if (!layoutNode2.L.e) {
            Constraints constraints = this.q;
            if (constraints == null ? false : Constraints.b(constraints.f2197a, j)) {
                Owner owner = layoutNode2.s;
                if (owner != null) {
                    owner.s(layoutNode2, true);
                }
                layoutNode2.o0();
                return false;
            }
        }
        this.q = new Constraints(j);
        v0(j);
        this.v.f = false;
        f0(LookaheadPassDelegate$remeasure$2.h);
        if (this.p) {
            j2 = this.f;
        } else {
            long j4 = Integer.MIN_VALUE;
            j2 = (j4 & 4294967295L) | (j4 << 32);
        }
        this.p = true;
        LookaheadDelegate v = layoutNodeLayoutDelegate.a().getV();
        if (!(v != null)) {
            InlineClassHelperKt.b("Lookahead result from lookaheadRemeasure cannot be null");
        }
        final LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.q;
        if (lookaheadPassDelegate != null) {
            LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.e;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = lookaheadPassDelegate.i;
            layoutNodeLayoutDelegate2.d = layoutState;
            MeasurePassDelegate measurePassDelegate = layoutNodeLayoutDelegate2.p;
            layoutNodeLayoutDelegate2.e = false;
            LayoutNode layoutNode3 = layoutNodeLayoutDelegate2.f1921a;
            OwnerSnapshotObserver snapshotObserver = LayoutNodeKt.a(layoutNode3).getSnapshotObserver();
            j3 = 4294967295L;
            Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$performMeasure$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    LookaheadDelegate v2 = this.h.i.a().getV();
                    Intrinsics.e(v2);
                    v2.c0(j);
                    return Unit.f24250a;
                }
            };
            snapshotObserver.getClass();
            if (layoutNode3.m != null) {
                snapshotObserver.b(layoutNode3, snapshotObserver.b, function0);
            } else {
                snapshotObserver.b(layoutNode3, snapshotObserver.c, function0);
            }
            layoutNodeLayoutDelegate2.f = true;
            layoutNodeLayoutDelegate2.g = true;
            if (LayoutNodeLayoutDelegateKt.a(layoutNode3)) {
                measurePassDelegate.z = true;
                measurePassDelegate.A = true;
            } else {
                measurePassDelegate.y = true;
            }
            layoutNodeLayoutDelegate2.d = LayoutNode.LayoutState.h;
        } else {
            j3 = 4294967295L;
        }
        u0((v.e & j3) | (v.d << 32));
        return (((int) (j2 >> 32)) == v.d && ((int) (j2 & j3)) == v.e) ? false : true;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int a0(int i) {
        S0();
        LookaheadDelegate v = this.i.a().getV();
        Intrinsics.e(v);
        return v.a0(i);
    }

    public final void a1() {
        LayoutNode layoutNodeK;
        try {
            this.j = true;
            if (!this.o) {
                InlineClassHelperKt.b("replace() called on item that was not placed");
            }
            this.B = false;
            boolean w = getW();
            W0(this.r, this.t, this.s);
            if (w && !this.B && (layoutNodeK = this.i.f1921a.K()) != null) {
                layoutNodeK.j0(false);
            }
            this.j = false;
        } catch (Throwable th) {
            this.j = false;
            throw th;
        }
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int b0(int i) {
        S0();
        LookaheadDelegate v = this.i.a().getV();
        Intrinsics.e(v);
        return v.b0(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // androidx.compose.ui.layout.Measurable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.ui.layout.Placeable c0(long r6) {
        /*
            r5 = this;
            androidx.compose.ui.node.LayoutNodeLayoutDelegate r0 = r5.i
            androidx.compose.ui.node.LayoutNode r1 = r0.f1921a
            androidx.compose.ui.node.LayoutNode r1 = r1.K()
            r2 = 0
            if (r1 == 0) goto L10
            androidx.compose.ui.node.LayoutNodeLayoutDelegate r1 = r1.L
            androidx.compose.ui.node.LayoutNode$LayoutState r1 = r1.d
            goto L11
        L10:
            r1 = r2
        L11:
            androidx.compose.ui.node.LayoutNode$LayoutState r3 = androidx.compose.ui.node.LayoutNode.LayoutState.e
            if (r1 == r3) goto L25
            androidx.compose.ui.node.LayoutNode r1 = r0.f1921a
            androidx.compose.ui.node.LayoutNode r1 = r1.K()
            if (r1 == 0) goto L21
            androidx.compose.ui.node.LayoutNodeLayoutDelegate r1 = r1.L
            androidx.compose.ui.node.LayoutNode$LayoutState r2 = r1.d
        L21:
            androidx.compose.ui.node.LayoutNode$LayoutState r1 = androidx.compose.ui.node.LayoutNode.LayoutState.g
            if (r2 != r1) goto L28
        L25:
            r1 = 0
            r0.b = r1
        L28:
            androidx.compose.ui.node.LayoutNode r1 = r0.f1921a
            androidx.compose.ui.node.LayoutNode r2 = r1.K()
            if (r2 == 0) goto L72
            androidx.compose.ui.node.LayoutNodeLayoutDelegate r2 = r2.L
            androidx.compose.ui.node.LayoutNode$UsageByParent r3 = r5.m
            androidx.compose.ui.node.LayoutNode$UsageByParent r4 = androidx.compose.ui.node.LayoutNode.UsageByParent.f
            if (r3 == r4) goto L42
            boolean r1 = r1.J
            if (r1 == 0) goto L3d
            goto L42
        L3d:
            java.lang.String r1 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
            androidx.compose.ui.internal.InlineClassHelperKt.b(r1)
        L42:
            androidx.compose.ui.node.LayoutNode$LayoutState r1 = r2.d
            int r1 = r1.ordinal()
            if (r1 == 0) goto L6d
            r3 = 1
            if (r1 == r3) goto L6d
            r3 = 2
            if (r1 == r3) goto L6a
            r3 = 3
            if (r1 != r3) goto L54
            goto L6a
        L54:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Measurable could be only measured from the parent's measure or layout block. Parents state is "
            r7.<init>(r0)
            androidx.compose.ui.node.LayoutNode$LayoutState r0 = r2.d
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L6a:
            androidx.compose.ui.node.LayoutNode$UsageByParent r1 = androidx.compose.ui.node.LayoutNode.UsageByParent.e
            goto L6f
        L6d:
            androidx.compose.ui.node.LayoutNode$UsageByParent r1 = androidx.compose.ui.node.LayoutNode.UsageByParent.d
        L6f:
            r5.m = r1
            goto L76
        L72:
            androidx.compose.ui.node.LayoutNode$UsageByParent r1 = androidx.compose.ui.node.LayoutNode.UsageByParent.f
            r5.m = r1
        L76:
            androidx.compose.ui.node.LayoutNode r0 = r0.f1921a
            androidx.compose.ui.node.LayoutNode$UsageByParent r1 = r0.H
            androidx.compose.ui.node.LayoutNode$UsageByParent r2 = androidx.compose.ui.node.LayoutNode.UsageByParent.f
            if (r1 != r2) goto L81
            r0.o()
        L81:
            r5.Z0(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LookaheadPassDelegate.c0(long):androidx.compose.ui.layout.Placeable");
    }

    @Override // androidx.compose.ui.layout.Measured
    public final int d0(AlignmentLine alignmentLine) {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.i;
        LayoutNode layoutNodeK = layoutNodeLayoutDelegate.f1921a.K();
        LayoutNode.LayoutState layoutState = layoutNodeK != null ? layoutNodeK.L.d : null;
        LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.e;
        LookaheadAlignmentLines lookaheadAlignmentLines = this.v;
        if (layoutState == layoutState2) {
            lookaheadAlignmentLines.c = true;
        } else {
            LayoutNode layoutNodeK2 = layoutNodeLayoutDelegate.f1921a.K();
            if ((layoutNodeK2 != null ? layoutNodeK2.L.d : null) == LayoutNode.LayoutState.g) {
                lookaheadAlignmentLines.d = true;
            }
        }
        this.n = true;
        LookaheadDelegate v = layoutNodeLayoutDelegate.a().getV();
        Intrinsics.e(v);
        int iD0 = v.d0(alignmentLine);
        this.n = false;
        return iD0;
    }

    public final void e1() {
        this.x = true;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final void f0(Function1 function1) {
        MutableVector mutableVectorN = this.i.f1921a.N();
        Object[] objArr = mutableVectorN.d;
        int i = mutableVectorN.f;
        for (int i2 = 0; i2 < i; i2++) {
            LookaheadPassDelegate lookaheadPassDelegate = ((LayoutNode) objArr[i2]).L.q;
            Intrinsics.e(lookaheadPassDelegate);
            function1.invoke(lookaheadPassDelegate);
        }
    }

    public final void f1() {
        this.m = LayoutNode.UsageByParent.f;
    }

    @Override // androidx.compose.ui.layout.Placeable
    public final int h0() {
        LookaheadDelegate v = this.i.a().getV();
        Intrinsics.e(v);
        return v.h0();
    }

    public final void h1() {
        this.l = Integer.MAX_VALUE;
    }

    @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    /* renamed from: i, reason: from getter */
    public final Object getA() {
        return this.A;
    }

    @Override // androidx.compose.ui.layout.Placeable
    public final int i0() {
        LookaheadDelegate v = this.i.a().getV();
        Intrinsics.e(v);
        return v.i0();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i1() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.A
            androidx.compose.ui.node.LayoutNodeLayoutDelegate r1 = r3.i
            r2 = 0
            if (r0 != 0) goto L1b
            androidx.compose.ui.node.NodeCoordinator r0 = r1.a()
            androidx.compose.ui.node.LookaheadDelegate r0 = r0.getV()
            kotlin.jvm.internal.Intrinsics.e(r0)
            androidx.compose.ui.node.NodeCoordinator r0 = r0.p
            java.lang.Object r0 = r0.getA()
            if (r0 != 0) goto L1b
            goto L1f
        L1b:
            boolean r0 = r3.z
            if (r0 != 0) goto L20
        L1f:
            return r2
        L20:
            r3.z = r2
            androidx.compose.ui.node.NodeCoordinator r0 = r1.a()
            androidx.compose.ui.node.LookaheadDelegate r0 = r0.getV()
            kotlin.jvm.internal.Intrinsics.e(r0)
            androidx.compose.ui.node.NodeCoordinator r0 = r0.p
            java.lang.Object r0 = r0.getA()
            r3.A = r0
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LookaheadPassDelegate.i1():boolean");
    }

    @Override // androidx.compose.ui.layout.Placeable
    public final void n0(long j, float f, GraphicsLayer graphicsLayer) {
        W0(j, graphicsLayer, null);
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final AlignmentLines o() {
        return this.v;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final void requestLayout() {
        LayoutNode layoutNode = this.i.f1921a;
        LayoutNode$Companion$ErrorMeasurePolicy$1 layoutNode$Companion$ErrorMeasurePolicy$1 = LayoutNode.V;
        layoutNode.j0(false);
    }

    @Override // androidx.compose.ui.layout.Placeable
    public final void s0(long j, float f, Function1 function1) {
        W0(j, null, function1);
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    /* renamed from: u */
    public final boolean getW() {
        return this.u != PlacedState.f;
    }

    @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
    public final void w(boolean z) {
        LookaheadDelegate v;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.i;
        LookaheadDelegate v2 = layoutNodeLayoutDelegate.a().getV();
        if (Boolean.valueOf(z).equals(v2 != null ? Boolean.valueOf(v2.i) : null) || (v = layoutNodeLayoutDelegate.a().getV()) == null) {
            return;
        }
        v.i = z;
    }

    public final List w0() {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.i;
        layoutNodeLayoutDelegate.f1921a.D();
        boolean z = this.x;
        MutableVector mutableVector = this.w;
        if (!z) {
            return mutableVector.g();
        }
        LayoutNode layoutNode = layoutNodeLayoutDelegate.f1921a;
        MutableVector mutableVectorN = layoutNode.N();
        Object[] objArr = mutableVectorN.d;
        int i = mutableVectorN.f;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (mutableVector.f <= i2) {
                LookaheadPassDelegate lookaheadPassDelegate = layoutNode2.L.q;
                Intrinsics.e(lookaheadPassDelegate);
                mutableVector.c(lookaheadPassDelegate);
            } else {
                LookaheadPassDelegate lookaheadPassDelegate2 = layoutNode2.L.q;
                Intrinsics.e(lookaheadPassDelegate2);
                Object[] objArr2 = mutableVector.d;
                Object obj = objArr2[i2];
                objArr2[i2] = lookaheadPassDelegate2;
            }
        }
        mutableVector.m(layoutNode.D().size(), mutableVector.f);
        this.x = false;
        return mutableVector.g();
    }

    /* renamed from: x0, reason: from getter */
    public final Constraints getQ() {
        return this.q;
    }
}
