package androidx.compose.ui.node;

import androidx.camera.core.impl.b;
import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadLayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/node/LookaheadDelegate;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class LookaheadDelegate extends LookaheadCapablePlaceable implements Measurable {
    public final NodeCoordinator p;
    public LinkedHashMap r;
    public MeasureResult t;
    public final MutableObjectIntMap u;
    public long q = 0;
    public final LookaheadLayoutCoordinates s = new LookaheadLayoutCoordinates(this);

    public LookaheadDelegate(NodeCoordinator nodeCoordinator) {
        this.p = nodeCoordinator;
        MutableObjectIntMap mutableObjectIntMap = ObjectIntMapKt.f693a;
        this.u = new MutableObjectIntMap();
    }

    public static final void P0(LookaheadDelegate lookaheadDelegate, MeasureResult measureResult) {
        Unit unit;
        LinkedHashMap linkedHashMap;
        if (measureResult != null) {
            lookaheadDelegate.u0((measureResult.getB() & 4294967295L) | (measureResult.getF1885a() << 32));
            unit = Unit.f24250a;
        } else {
            unit = null;
        }
        if (unit == null) {
            lookaheadDelegate.u0(0L);
        }
        if (!Intrinsics.c(lookaheadDelegate.t, measureResult) && measureResult != null && ((((linkedHashMap = lookaheadDelegate.r) != null && !linkedHashMap.isEmpty()) || !measureResult.getF1028a().isEmpty()) && !Intrinsics.c(measureResult.getF1028a(), lookaheadDelegate.r))) {
            LookaheadPassDelegate lookaheadPassDelegate = lookaheadDelegate.p.p.L.q;
            Intrinsics.e(lookaheadPassDelegate);
            lookaheadPassDelegate.o().g();
            LinkedHashMap linkedHashMap2 = lookaheadDelegate.r;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                lookaheadDelegate.r = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(measureResult.getF1028a());
        }
        lookaheadDelegate.t = measureResult;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final LookaheadCapablePlaceable A0() {
        NodeCoordinator nodeCoordinator = this.p.s;
        if (nodeCoordinator != null) {
            return nodeCoordinator.getV();
        }
        return null;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final LayoutCoordinates B0() {
        return this.s;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final boolean C0() {
        return this.t != null;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final MeasureResult D0() {
        MeasureResult measureResult = this.t;
        if (measureResult != null) {
            return measureResult;
        }
        throw b.w("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final LookaheadCapablePlaceable E0() {
        NodeCoordinator nodeCoordinator = this.p.t;
        if (nodeCoordinator != null) {
            return nodeCoordinator.getV();
        }
        return null;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    /* renamed from: F0, reason: from getter */
    public final long getC() {
        return this.q;
    }

    public int J(int i) {
        NodeCoordinator nodeCoordinator = this.p.s;
        Intrinsics.e(nodeCoordinator);
        LookaheadDelegate w = nodeCoordinator.getV();
        Intrinsics.e(w);
        return w.J(i);
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.node.MeasureScopeWithLayoutNode
    /* renamed from: N0 */
    public final LayoutNode getP() {
        return this.p.p;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final void O0() {
        s0(this.q, BitmapDescriptorFactory.HUE_RED, null);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: Q1 */
    public final float getF() {
        return this.p.getF();
    }

    public final long R0() {
        return (this.e & 4294967295L) | (this.d << 32);
    }

    public void S0() {
        D0().q();
    }

    public int T(int i) {
        NodeCoordinator nodeCoordinator = this.p.s;
        Intrinsics.e(nodeCoordinator);
        LookaheadDelegate w = nodeCoordinator.getV();
        Intrinsics.e(w);
        return w.T(i);
    }

    public final void T0(long j) {
        if (!IntOffset.b(this.q, j)) {
            this.q = j;
            NodeCoordinator nodeCoordinator = this.p;
            LookaheadPassDelegate lookaheadPassDelegate = nodeCoordinator.p.L.q;
            if (lookaheadPassDelegate != null) {
                lookaheadPassDelegate.P0();
            }
            LookaheadCapablePlaceable.J0(nodeCoordinator);
        }
        if (this.k) {
            return;
        }
        x0(new PlaceableResult(D0(), this));
    }

    public final long V0(LookaheadDelegate lookaheadDelegate, boolean z) {
        long jD = 0;
        LookaheadDelegate w = this;
        while (!w.equals(lookaheadDelegate)) {
            if (!w.i || !z) {
                jD = IntOffset.d(jD, w.q);
            }
            NodeCoordinator nodeCoordinator = w.p.t;
            Intrinsics.e(nodeCoordinator);
            w = nodeCoordinator.getV();
            Intrinsics.e(w);
        }
        return jD;
    }

    public int a0(int i) {
        NodeCoordinator nodeCoordinator = this.p.s;
        Intrinsics.e(nodeCoordinator);
        LookaheadDelegate w = nodeCoordinator.getV();
        Intrinsics.e(w);
        return w.a0(i);
    }

    public int b0(int i) {
        NodeCoordinator nodeCoordinator = this.p.s;
        Intrinsics.e(nodeCoordinator);
        LookaheadDelegate w = nodeCoordinator.getV();
        Intrinsics.e(w);
        return w.b0(i);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: getDensity */
    public final float getE() {
        return this.p.getE();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    /* renamed from: getLayoutDirection */
    public final LayoutDirection getD() {
        return this.p.p.E;
    }

    @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    /* renamed from: i */
    public final Object getV() {
        return this.p.getV();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.layout.IntrinsicMeasureScope
    public final boolean l1() {
        return true;
    }

    @Override // androidx.compose.ui.layout.Placeable
    public final void s0(long j, float f, Function1 function1) {
        T0(j);
        if (this.j) {
            return;
        }
        S0();
    }
}
