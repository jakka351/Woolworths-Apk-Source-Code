package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/ContextualFlowRowScopeImpl;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/foundation/layout/ContextualFlowRowScope;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ContextualFlowRowScopeImpl implements RowScope, ContextualFlowRowScope {
    @Override // androidx.compose.foundation.layout.RowScope
    public final Modifier a(Modifier modifier, float f, boolean z) {
        return RowScopeInstance.f974a.a(modifier, f, z);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public final Modifier b(Modifier modifier, BiasAlignment.Vertical vertical) {
        return RowScopeInstance.f974a.b(modifier, vertical);
    }
}
