package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class LookaheadLayoutCoordinates implements LayoutCoordinates {
    public final LookaheadDelegate d;

    public LookaheadLayoutCoordinates(LookaheadDelegate lookaheadDelegate) {
        this.d = lookaheadDelegate;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final Rect D(LayoutCoordinates layoutCoordinates, boolean z) {
        return this.d.p.D(layoutCoordinates, z);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutCoordinates E() {
        LookaheadDelegate w;
        if (!q()) {
            InlineClassHelperKt.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        NodeCoordinator nodeCoordinator = this.d.p.p.K.c.t;
        if (nodeCoordinator == null || (w = nodeCoordinator.getV()) == null) {
            return null;
        }
        return w.s;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final long G(long j) {
        return this.d.p.G(Offset.h(j, b()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final long M(LayoutCoordinates layoutCoordinates, long j) {
        return c(layoutCoordinates, j, true);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutCoordinates N() {
        LookaheadDelegate w;
        if (!q()) {
            InlineClassHelperKt.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        NodeCoordinator nodeCoordinator = this.d.p.t;
        if (nodeCoordinator == null || (w = nodeCoordinator.getV()) == null) {
            return null;
        }
        return w.s;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final long P(long j) {
        return Offset.h(this.d.p.P(j), b());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final void Q(LayoutCoordinates layoutCoordinates, float[] fArr) {
        this.d.p.Q(layoutCoordinates, fArr);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final void V(float[] fArr) {
        this.d.p.V(fArr);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final long a() {
        LookaheadDelegate lookaheadDelegate = this.d;
        return (lookaheadDelegate.d << 32) | (lookaheadDelegate.e & 4294967295L);
    }

    public final long b() {
        LookaheadDelegate lookaheadDelegate = this.d;
        LookaheadDelegate lookaheadDelegateA = LookaheadLayoutCoordinatesKt.a(lookaheadDelegate);
        return Offset.g(c(lookaheadDelegateA.s, 0L, true), lookaheadDelegate.p.C1(lookaheadDelegateA.p, 0L, true));
    }

    public final long c(LayoutCoordinates layoutCoordinates, long j, boolean z) {
        boolean z2 = layoutCoordinates instanceof LookaheadLayoutCoordinates;
        LookaheadDelegate lookaheadDelegate = this.d;
        if (!z2) {
            LookaheadDelegate lookaheadDelegateA = LookaheadLayoutCoordinatesKt.a(lookaheadDelegate);
            LayoutCoordinates layoutCoordinates2 = lookaheadDelegateA.p;
            long jC = c(lookaheadDelegateA.s, j, z);
            long j2 = lookaheadDelegateA.q;
            long jG = Offset.g(jC, (4294967295L & Float.floatToRawIntBits((int) (j2 & 4294967295L))) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32));
            LayoutCoordinates layoutCoordinatesN = layoutCoordinates2.N();
            if (layoutCoordinatesN != null) {
                layoutCoordinates2 = layoutCoordinatesN;
            }
            return Offset.h(jG, ((NodeCoordinator) layoutCoordinates2).C1(layoutCoordinates, 0L, z));
        }
        LookaheadDelegate lookaheadDelegate2 = ((LookaheadLayoutCoordinates) layoutCoordinates).d;
        NodeCoordinator nodeCoordinator = lookaheadDelegate2.p;
        nodeCoordinator.F1();
        LookaheadDelegate w = lookaheadDelegate.p.a1(nodeCoordinator).getV();
        if (w != null) {
            boolean z3 = !z;
            long jC2 = IntOffset.c(IntOffset.d(lookaheadDelegate2.V0(w, z3), IntOffsetKt.c(j)), lookaheadDelegate.V0(w, z3));
            return (Float.floatToRawIntBits((int) (jC2 >> 32)) << 32) | (Float.floatToRawIntBits((int) (jC2 & 4294967295L)) & 4294967295L);
        }
        LookaheadDelegate lookaheadDelegateA2 = LookaheadLayoutCoordinatesKt.a(lookaheadDelegate2);
        boolean z4 = !z;
        long jD = IntOffset.d(IntOffset.d(lookaheadDelegate2.V0(lookaheadDelegateA2, z4), lookaheadDelegateA2.q), IntOffsetKt.c(j));
        LookaheadDelegate lookaheadDelegateA3 = LookaheadLayoutCoordinatesKt.a(lookaheadDelegate);
        long jC3 = IntOffset.c(jD, IntOffset.d(lookaheadDelegate.V0(lookaheadDelegateA3, z4), lookaheadDelegateA3.q));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jC3 >> 32));
        long jFloatToRawIntBits2 = Float.floatToRawIntBits((int) (jC3 & 4294967295L)) & 4294967295L;
        NodeCoordinator nodeCoordinator2 = lookaheadDelegateA3.p.t;
        Intrinsics.e(nodeCoordinator2);
        NodeCoordinator nodeCoordinator3 = lookaheadDelegateA2.p.t;
        Intrinsics.e(nodeCoordinator3);
        return nodeCoordinator2.C1(nodeCoordinator3, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32), z);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final long n(long j) {
        return Offset.h(this.d.p.n(j), b());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final boolean q() {
        return this.d.p.j1().q;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final long y(long j) {
        return this.d.p.y(Offset.h(j, b()));
    }
}
