package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/DefaultIntrinsicMeasurable;", "Landroidx/compose/ui/layout/Measurable;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DefaultIntrinsicMeasurable implements Measurable {
    public final IntrinsicMeasurable d;
    public final IntrinsicMinMax e;
    public final IntrinsicWidthHeight f;

    public DefaultIntrinsicMeasurable(IntrinsicMeasurable intrinsicMeasurable, IntrinsicMinMax intrinsicMinMax, IntrinsicWidthHeight intrinsicWidthHeight) {
        this.d = intrinsicMeasurable;
        this.e = intrinsicMinMax;
        this.f = intrinsicWidthHeight;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int J(int i) {
        return this.d.J(i);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int T(int i) {
        return this.d.T(i);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int a0(int i) {
        return this.d.a0(i);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int b0(int i) {
        return this.d.b0(i);
    }

    @Override // androidx.compose.ui.layout.Measurable
    public final Placeable c0(long j) {
        IntrinsicWidthHeight intrinsicWidthHeight = this.f;
        IntrinsicWidthHeight intrinsicWidthHeight2 = IntrinsicWidthHeight.d;
        IntrinsicMinMax intrinsicMinMax = this.e;
        IntrinsicMeasurable intrinsicMeasurable = this.d;
        if (intrinsicWidthHeight == intrinsicWidthHeight2) {
            return new FixedSizeIntrinsicsPlaceable(intrinsicMinMax == IntrinsicMinMax.e ? intrinsicMeasurable.b0(Constraints.g(j)) : intrinsicMeasurable.a0(Constraints.g(j)), Constraints.c(j) ? Constraints.g(j) : 32767);
        }
        return new FixedSizeIntrinsicsPlaceable(Constraints.d(j) ? Constraints.h(j) : 32767, intrinsicMinMax == IntrinsicMinMax.e ? intrinsicMeasurable.J(Constraints.h(j)) : intrinsicMeasurable.T(Constraints.h(j)));
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    /* renamed from: i */
    public final Object getV() {
        return this.d.getV();
    }
}
