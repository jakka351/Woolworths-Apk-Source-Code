package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/ColumnScopeInstance;", "Landroidx/compose/foundation/layout/ColumnScope;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ColumnScopeInstance implements ColumnScope {

    /* renamed from: a, reason: collision with root package name */
    public static final ColumnScopeInstance f948a = new ColumnScopeInstance();

    @Override // androidx.compose.foundation.layout.ColumnScope
    public final Modifier a(Modifier modifier, float f, boolean z) {
        if (f <= 0.0d) {
            InlineClassHelperKt.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return modifier.x0(new LayoutWeightElement(f, z));
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public final Modifier b(Modifier modifier, BiasAlignment.Horizontal horizontal) {
        return modifier.x0(new HorizontalAlignElement(horizontal));
    }
}
