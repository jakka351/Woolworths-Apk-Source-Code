package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/UnionInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class UnionInsets implements WindowInsets {

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsets f980a;
    public final WindowInsets b;

    public UnionInsets(WindowInsets windowInsets, WindowInsets windowInsets2) {
        this.f980a = windowInsets;
        this.b = windowInsets2;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int a(Density density) {
        return Math.max(this.f980a.a(density), this.b.a(density));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int b(Density density, LayoutDirection layoutDirection) {
        return Math.max(this.f980a.b(density, layoutDirection), this.b.b(density, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int c(Density density) {
        return Math.max(this.f980a.c(density), this.b.c(density));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int d(Density density, LayoutDirection layoutDirection) {
        return Math.max(this.f980a.d(density, layoutDirection), this.b.d(density, layoutDirection));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnionInsets)) {
            return false;
        }
        UnionInsets unionInsets = (UnionInsets) obj;
        return Intrinsics.c(unionInsets.f980a, this.f980a) && Intrinsics.c(unionInsets.b, this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.f980a.hashCode();
    }

    public final String toString() {
        return "(" + this.f980a + " ∪ " + this.b + ')';
    }
}
