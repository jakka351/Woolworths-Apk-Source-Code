package androidx.compose.foundation.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/TextRangeLayoutModifier;", "Landroidx/compose/ui/layout/ParentDataModifier;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextRangeLayoutModifier implements ParentDataModifier {
    public final a d;

    public TextRangeLayoutModifier(a aVar) {
        this.d = aVar;
    }

    @Override // androidx.compose.ui.layout.ParentDataModifier
    public final Object D(Density density, Object obj) {
        return this;
    }

    public final TextRangeScopeMeasurePolicy a() {
        return this.d;
    }
}
