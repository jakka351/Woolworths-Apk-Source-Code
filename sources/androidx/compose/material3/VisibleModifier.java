package androidx.compose.material3;

import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.platform.InspectorValueInfo;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/VisibleModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class VisibleModifier extends InspectorValueInfo implements LayoutModifier {
    public final boolean equals(Object obj) {
        return (obj instanceof VisibleModifier ? (VisibleModifier) obj : null) != null;
    }

    public final int hashCode() {
        return Boolean.hashCode(false);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final MeasureResult n(MeasureScope measureScope, Measurable measurable, long j) {
        measurable.c0(j);
        return measureScope.L0(0, 0, EmptyMap.d, VisibleModifier$measure$1.h);
    }
}
