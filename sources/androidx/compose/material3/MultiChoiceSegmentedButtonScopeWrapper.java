package androidx.compose.material3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/MultiChoiceSegmentedButtonScopeWrapper;", "Landroidx/compose/material3/MultiChoiceSegmentedButtonRowScope;", "Landroidx/compose/foundation/layout/RowScope;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class MultiChoiceSegmentedButtonScopeWrapper implements MultiChoiceSegmentedButtonRowScope, RowScope {
    @Override // androidx.compose.foundation.layout.RowScope
    public final Modifier a(Modifier modifier, float f, boolean z) {
        return RowScopeInstance.f974a.a(modifier, f, z);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public final Modifier b(Modifier modifier, BiasAlignment.Vertical vertical) {
        return RowScopeInstance.f974a.b(modifier, vertical);
    }
}
