package au.com.woolworths.compose.utils.modifier;

import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/compose/utils/modifier/VisibilityModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "compose-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* data */ class VisibilityModifier implements LayoutModifier {
    public final Function0 d;

    public VisibilityModifier(Function0 isVisible) {
        Intrinsics.h(isVisible, "isVisible");
        this.d = isVisible;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VisibilityModifier) && Intrinsics.c(this.d, ((VisibilityModifier) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final MeasureResult n(MeasureScope measureScope, Measurable measurable, long j) {
        Intrinsics.h(measurable, "measurable");
        Placeable placeableC0 = measurable.c0(j);
        return measureScope.L0(placeableC0.d, placeableC0.e, EmptyMap.d, new j(0, this, placeableC0));
    }

    public final String toString() {
        return "VisibilityModifier(isVisible=" + this.d + ")";
    }
}
