package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/IntrinsicsMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class IntrinsicsMeasureScope implements MeasureScope, IntrinsicMeasureScope {
    public final LayoutDirection d;
    public final /* synthetic */ IntrinsicMeasureScope e;

    public IntrinsicsMeasureScope(IntrinsicMeasureScope intrinsicMeasureScope, LayoutDirection layoutDirection) {
        this.d = layoutDirection;
        this.e = intrinsicMeasureScope;
    }

    @Override // androidx.compose.ui.unit.Density
    public final float B(int i) {
        return this.e.B(i);
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public final MeasureResult B1(final int i, final int i2, final Map map, Function1 function1) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            InlineClassHelperKt.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new MeasureResult() { // from class: androidx.compose.ui.layout.IntrinsicsMeasureScope$layout$1
            @Override // androidx.compose.ui.layout.MeasureResult
            /* renamed from: getHeight, reason: from getter */
            public final int getB() {
                return i2;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            /* renamed from: getWidth, reason: from getter */
            public final int getF1881a() {
                return i;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            /* renamed from: o, reason: from getter */
            public final Map getC() {
                return map;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final Function1 p() {
                return null;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final void q() {
            }
        };
    }

    @Override // androidx.compose.ui.unit.Density
    public final float C(float f) {
        return this.e.C(f);
    }

    @Override // androidx.compose.ui.unit.Density
    public final long F(long j) {
        return this.e.F(j);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final long H(float f) {
        return this.e.H(f);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: Q1 */
    public final float getE() {
        return this.e.getE();
    }

    @Override // androidx.compose.ui.unit.Density
    public final float T1(float f) {
        return this.e.T1(f);
    }

    @Override // androidx.compose.ui.unit.Density
    public final int W1(long j) {
        return this.e.W1(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: getDensity */
    public final float getD() {
        return this.e.getD();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    /* renamed from: getLayoutDirection, reason: from getter */
    public final LayoutDirection getD() {
        return this.d;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public final boolean l1() {
        return this.e.l1();
    }

    @Override // androidx.compose.ui.unit.Density
    public final long p(long j) {
        return this.e.p(j);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final float r(long j) {
        return this.e.r(j);
    }

    @Override // androidx.compose.ui.unit.Density
    public final int r1(float f) {
        return this.e.r1(f);
    }

    @Override // androidx.compose.ui.unit.Density
    public final long t(int i) {
        return this.e.t(i);
    }

    @Override // androidx.compose.ui.unit.Density
    public final float t1(long j) {
        return this.e.t1(j);
    }

    @Override // androidx.compose.ui.unit.Density
    public final long v(float f) {
        return this.e.v(f);
    }
}
