package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/FlowColumnScopeInstance;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/foundation/layout/FlowColumnScope;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class FlowColumnScopeInstance implements ColumnScope, FlowColumnScope {

    /* renamed from: a, reason: collision with root package name */
    public static final FlowColumnScopeInstance f957a = new FlowColumnScopeInstance();

    @Override // androidx.compose.foundation.layout.ColumnScope
    public final Modifier a(Modifier modifier, float f, boolean z) {
        return ColumnScopeInstance.f948a.a(modifier, f, z);
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public final Modifier b(Modifier modifier, BiasAlignment.Horizontal horizontal) {
        return ColumnScopeInstance.f948a.b(modifier, horizontal);
    }
}
