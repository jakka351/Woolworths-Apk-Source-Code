package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/AddedInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AddedInsets implements WindowInsets {

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsets f930a;
    public final WindowInsets b;

    public AddedInsets(WindowInsets windowInsets, WindowInsets windowInsets2) {
        this.f930a = windowInsets;
        this.b = windowInsets2;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int a(Density density) {
        return this.b.a(density) + ((PaddingValuesInsets) this.f930a).a(density);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int b(Density density, LayoutDirection layoutDirection) {
        return this.b.b(density, layoutDirection) + ((PaddingValuesInsets) this.f930a).b(density, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int c(Density density) {
        return this.b.c(density) + ((PaddingValuesInsets) this.f930a).c(density);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int d(Density density, LayoutDirection layoutDirection) {
        return this.b.d(density, layoutDirection) + ((PaddingValuesInsets) this.f930a).d(density, layoutDirection);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddedInsets)) {
            return false;
        }
        AddedInsets addedInsets = (AddedInsets) obj;
        return Intrinsics.c(addedInsets.f930a, this.f930a) && Intrinsics.c(addedInsets.b, this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.f930a.hashCode();
    }

    public final String toString() {
        return "(" + this.f930a + " + " + this.b + ')';
    }
}
