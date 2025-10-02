package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesConsumingModifier;", "Landroidx/compose/foundation/layout/InsetsConsumingModifier;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class PaddingValuesConsumingModifier extends InsetsConsumingModifier {
    public final PaddingValues e;

    public PaddingValuesConsumingModifier(PaddingValues paddingValues) {
        this.e = paddingValues;
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifier
    public final WindowInsets a(WindowInsets windowInsets) {
        return new AddedInsets(new PaddingValuesInsets(this.e), windowInsets);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaddingValuesConsumingModifier) {
            return Intrinsics.c(((PaddingValuesConsumingModifier) obj).e, this.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
