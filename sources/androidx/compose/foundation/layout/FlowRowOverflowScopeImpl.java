package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/FlowRowOverflowScopeImpl;", "Landroidx/compose/foundation/layout/FlowRowScope;", "Landroidx/compose/foundation/layout/FlowRowOverflowScope;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FlowRowOverflowScopeImpl implements FlowRowScope, FlowRowOverflowScope {

    /* renamed from: a, reason: collision with root package name */
    public final FlowLayoutOverflowState f964a;
    public final /* synthetic */ FlowRowScopeInstance b = FlowRowScopeInstance.f965a;
    public final Lazy c = new LazyImpl("Lazy item is not yet initialized", new Function0<Integer>() { // from class: androidx.compose.foundation.layout.FlowRowOverflowScopeImpl$totalItemCount$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(this.h.f964a.b);
        }
    });

    public FlowRowOverflowScopeImpl(FlowLayoutOverflowState flowLayoutOverflowState) {
        this.f964a = flowLayoutOverflowState;
        flowLayoutOverflowState.getClass();
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public final Modifier a(Modifier modifier, float f, boolean z) {
        this.b.getClass();
        return RowScopeInstance.f974a.a(modifier, f, z);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public final Modifier b(Modifier modifier, BiasAlignment.Vertical vertical) {
        this.b.getClass();
        return RowScopeInstance.f974a.b(modifier, vertical);
    }
}
