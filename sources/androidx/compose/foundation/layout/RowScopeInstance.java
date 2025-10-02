package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/RowScopeInstance;", "Landroidx/compose/foundation/layout/RowScope;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class RowScopeInstance implements RowScope {

    /* renamed from: a, reason: collision with root package name */
    public static final RowScopeInstance f974a = new RowScopeInstance();

    @Override // androidx.compose.foundation.layout.RowScope
    public final Modifier a(Modifier modifier, float f, boolean z) {
        if (f <= 0.0d) {
            InlineClassHelperKt.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return modifier.x0(new LayoutWeightElement(f, z));
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public final Modifier b(Modifier modifier, BiasAlignment.Vertical vertical) {
        return modifier.x0(new VerticalAlignElement(vertical));
    }

    public final Modifier c(Modifier modifier, HorizontalAlignmentLine horizontalAlignmentLine) {
        return modifier.x0(new WithAlignmentLineElement(horizontalAlignmentLine));
    }
}
