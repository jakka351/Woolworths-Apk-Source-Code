package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@StabilityInferred
@ExperimentalLayoutApi
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/ContextualFlowColumnOverflowScopeImpl;", "Landroidx/compose/foundation/layout/FlowColumnOverflowScope;", "Landroidx/compose/foundation/layout/ContextualFlowColumnOverflowScope;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ContextualFlowColumnOverflowScopeImpl implements FlowColumnOverflowScope, ContextualFlowColumnOverflowScope {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlowColumnOverflowScopeImpl f949a;

    public ContextualFlowColumnOverflowScopeImpl(FlowLayoutOverflowState flowLayoutOverflowState) {
        this.f949a = new FlowColumnOverflowScopeImpl(flowLayoutOverflowState);
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public final Modifier a(Modifier modifier, float f, boolean z) {
        return this.f949a.a(modifier, f, z);
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public final Modifier b(Modifier modifier, BiasAlignment.Horizontal horizontal) {
        return this.f949a.b(modifier, horizontal);
    }
}
