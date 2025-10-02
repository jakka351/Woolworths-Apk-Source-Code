package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@StabilityInferred
@ExperimentalLayoutApi
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/ContextualFlowRowOverflowScopeImpl;", "Landroidx/compose/foundation/layout/FlowRowOverflowScope;", "Landroidx/compose/foundation/layout/ContextualFlowRowOverflowScope;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ContextualFlowRowOverflowScopeImpl implements FlowRowOverflowScope, ContextualFlowRowOverflowScope {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlowRowOverflowScopeImpl f950a;

    public ContextualFlowRowOverflowScopeImpl(FlowLayoutOverflowState flowLayoutOverflowState) {
        this.f950a = new FlowRowOverflowScopeImpl(flowLayoutOverflowState);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public final Modifier a(Modifier modifier, float f, boolean z) {
        return this.f950a.a(modifier, f, z);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public final Modifier b(Modifier modifier, BiasAlignment.Vertical vertical) {
        return this.f950a.b(modifier, vertical);
    }
}
