package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/UnionInsetsConsumingModifier;", "Landroidx/compose/foundation/layout/InsetsConsumingModifier;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class UnionInsetsConsumingModifier extends InsetsConsumingModifier {
    public final WindowInsets e;

    public UnionInsetsConsumingModifier(WindowInsets windowInsets) {
        this.e = windowInsets;
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifier
    public final WindowInsets a(WindowInsets windowInsets) {
        return new UnionInsets(this.e, windowInsets);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnionInsetsConsumingModifier) {
            return Intrinsics.c(((UnionInsetsConsumingModifier) obj).e, this.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
