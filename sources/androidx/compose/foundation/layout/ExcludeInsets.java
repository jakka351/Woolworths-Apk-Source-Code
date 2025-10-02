package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/ExcludeInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class ExcludeInsets implements WindowInsets {

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsets f954a;
    public final WindowInsets b;

    public ExcludeInsets(WindowInsets windowInsets, WindowInsets windowInsets2) {
        this.f954a = windowInsets;
        this.b = windowInsets2;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int a(Density density) {
        int iA = this.f954a.a(density) - this.b.a(density);
        if (iA < 0) {
            return 0;
        }
        return iA;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int b(Density density, LayoutDirection layoutDirection) {
        int iB = this.f954a.b(density, layoutDirection) - this.b.b(density, layoutDirection);
        if (iB < 0) {
            return 0;
        }
        return iB;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int c(Density density) {
        int iC = this.f954a.c(density) - this.b.c(density);
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int d(Density density, LayoutDirection layoutDirection) {
        int iD = this.f954a.d(density, layoutDirection) - this.b.d(density, layoutDirection);
        if (iD < 0) {
            return 0;
        }
        return iD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExcludeInsets)) {
            return false;
        }
        ExcludeInsets excludeInsets = (ExcludeInsets) obj;
        return Intrinsics.c(excludeInsets.f954a, this.f954a) && Intrinsics.c(excludeInsets.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f954a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f954a + " - " + this.b + ')';
    }
}
