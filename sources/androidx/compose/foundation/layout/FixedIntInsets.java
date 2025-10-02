package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/FixedIntInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class FixedIntInsets implements WindowInsets {
    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int a(Density density) {
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int b(Density density, LayoutDirection layoutDirection) {
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int c(Density density) {
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int d(Density density, LayoutDirection layoutDirection) {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof FixedIntInsets);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "Insets(left=0, top=0, right=0, bottom=0)";
    }
}
