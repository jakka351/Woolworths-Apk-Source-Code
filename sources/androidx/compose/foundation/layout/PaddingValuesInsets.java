package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class PaddingValuesInsets implements WindowInsets {

    /* renamed from: a, reason: collision with root package name */
    public final PaddingValues f970a;

    public PaddingValuesInsets(PaddingValues paddingValues) {
        this.f970a = paddingValues;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int a(Density density) {
        return density.r1(this.f970a.getB());
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int b(Density density, LayoutDirection layoutDirection) {
        return density.r1(this.f970a.c(layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int c(Density density) {
        return density.r1(this.f970a.getD());
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int d(Density density, LayoutDirection layoutDirection) {
        return density.r1(this.f970a.b(layoutDirection));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaddingValuesInsets) {
            return Intrinsics.c(((PaddingValuesInsets) obj).f970a, this.f970a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f970a.hashCode();
    }

    public final String toString() {
        LayoutDirection layoutDirection = LayoutDirection.d;
        PaddingValues paddingValues = this.f970a;
        return "PaddingValues(" + ((Object) Dp.b(paddingValues.b(layoutDirection))) + ", " + ((Object) Dp.b(paddingValues.getB())) + ", " + ((Object) Dp.b(paddingValues.c(layoutDirection))) + ", " + ((Object) Dp.b(paddingValues.getD())) + ')';
    }
}
