package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.LayoutModifierNodeCoordinator;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/layout/ApproachMeasureScopeImpl;", "Landroidx/compose/ui/layout/ApproachMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/LookaheadScope;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ApproachMeasureScopeImpl implements ApproachMeasureScope, MeasureScope, LookaheadScope {
    public final LayoutModifierNodeCoordinator d;
    public ApproachLayoutModifierNode e;
    public boolean f;

    public ApproachMeasureScopeImpl(LayoutModifierNodeCoordinator layoutModifierNodeCoordinator, ApproachLayoutModifierNode approachLayoutModifierNode) {
        this.d = layoutModifierNodeCoordinator;
        this.e = approachLayoutModifierNode;
    }

    @Override // androidx.compose.ui.unit.Density
    public final float B(int i) {
        return this.d.B(i);
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public final MeasureResult B1(final int i, final int i2, final Map map, final Function1 function1) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            InlineClassHelperKt.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new MeasureResult(i, i2, map, function1, this) { // from class: androidx.compose.ui.layout.ApproachMeasureScopeImpl$layout$1

            /* renamed from: a, reason: collision with root package name */
            public final int f1877a;
            public final int b;
            public final Map c;
            public final /* synthetic */ Function1 d;
            public final /* synthetic */ ApproachMeasureScopeImpl e;

            {
                this.d = function1;
                this.e = this;
                this.f1877a = i;
                this.b = i2;
                this.c = map;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            /* renamed from: getHeight, reason: from getter */
            public final int getB() {
                return this.b;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            /* renamed from: getWidth, reason: from getter */
            public final int getF1877a() {
                return this.f1877a;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            /* renamed from: o, reason: from getter */
            public final Map getC() {
                return this.c;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final Function1 p() {
                return null;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final void q() {
                this.d.invoke(this.e.d.l);
            }
        };
    }

    @Override // androidx.compose.ui.unit.Density
    public final float C(float f) {
        return f / this.d.getE();
    }

    @Override // androidx.compose.ui.unit.Density
    public final long F(long j) {
        return this.d.F(j);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final long H(float f) {
        return this.d.H(f);
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public final MeasureResult L0(int i, int i2, Map map, Function1 function1) {
        return this.d.B1(i, i2, map, function1);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: Q1 */
    public final float getF() {
        return this.d.getF();
    }

    @Override // androidx.compose.ui.unit.Density
    public final float T1(float f) {
        return this.d.getE() * f;
    }

    @Override // androidx.compose.ui.unit.Density
    public final int W1(long j) {
        return this.d.W1(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: getDensity */
    public final float getE() {
        return this.d.getE();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    /* renamed from: getLayoutDirection */
    public final LayoutDirection getD() {
        return this.d.p.E;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public final boolean l1() {
        return false;
    }

    @Override // androidx.compose.ui.unit.Density
    public final long p(long j) {
        return this.d.p(j);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final float r(long j) {
        return this.d.r(j);
    }

    @Override // androidx.compose.ui.unit.Density
    public final int r1(float f) {
        return this.d.r1(f);
    }

    @Override // androidx.compose.ui.unit.Density
    public final long t(int i) {
        return this.d.t(i);
    }

    @Override // androidx.compose.ui.layout.ApproachIntrinsicMeasureScope
    public final long t0() {
        LookaheadDelegate lookaheadDelegate = this.d.W;
        Intrinsics.e(lookaheadDelegate);
        MeasureResult measureResultD0 = lookaheadDelegate.D0();
        return (measureResultD0.getF1877a() << 32) | (measureResultD0.getB() & 4294967295L);
    }

    @Override // androidx.compose.ui.unit.Density
    public final float t1(long j) {
        return this.d.t1(j);
    }

    @Override // androidx.compose.ui.unit.Density
    public final long v(float f) {
        return this.d.v(f);
    }
}
