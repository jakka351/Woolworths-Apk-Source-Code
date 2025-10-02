package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/LimitInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class LimitInsets implements WindowInsets {

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsets f968a;
    public final int b;

    public LimitInsets(WindowInsets windowInsets, int i) {
        this.f968a = windowInsets;
        this.b = i;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int a(Density density) {
        if ((this.b & 16) != 0) {
            return this.f968a.a(density);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int b(Density density, LayoutDirection layoutDirection) {
        if (((layoutDirection == LayoutDirection.d ? 4 : 1) & this.b) != 0) {
            return this.f968a.b(density, layoutDirection);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int c(Density density) {
        if ((this.b & 32) != 0) {
            return this.f968a.c(density);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int d(Density density, LayoutDirection layoutDirection) {
        if (((layoutDirection == LayoutDirection.d ? 8 : 2) & this.b) != 0) {
            return this.f968a.d(density, layoutDirection);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitInsets)) {
            return false;
        }
        LimitInsets limitInsets = (LimitInsets) obj;
        return Intrinsics.c(this.f968a, limitInsets.f968a) && this.b == limitInsets.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f968a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f968a + " only " + ((Object) WindowInsetsSides.a(this.b)) + ')';
    }
}
