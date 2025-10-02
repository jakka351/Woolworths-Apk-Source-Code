package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.platform.InspectorValueInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Stable
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/layout/DerivedWidthModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class DerivedWidthModifier extends InspectorValueInfo implements LayoutModifier, ModifierLocalConsumer {
    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public final void F1(ModifierLocalReadScope modifierLocalReadScope) {
        throw null;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof DerivedWidthModifier);
    }

    public final int hashCode() {
        throw null;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final MeasureResult n(MeasureScope measureScope, Measurable measurable, long j) {
        throw null;
    }
}
