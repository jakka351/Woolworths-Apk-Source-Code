package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/layout/Arrangement$Bottom$1", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Arrangement$Bottom$1 implements Arrangement.Vertical {
    @Override // androidx.compose.foundation.layout.Arrangement.Vertical
    public final void c(Density density, int i, int[] iArr, int[] iArr2) {
        Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
        Arrangement.c(i, iArr, iArr2, false);
    }

    public final String toString() {
        return "Arrangement#Bottom";
    }
}
