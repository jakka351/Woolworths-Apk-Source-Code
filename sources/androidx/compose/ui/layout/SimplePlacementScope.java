package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/SimplePlacementScope;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SimplePlacementScope extends Placeable.PlacementScope {
    public final int b;
    public final LayoutDirection c;

    public SimplePlacementScope(int i, LayoutDirection layoutDirection) {
        this.b = i;
        this.c = layoutDirection;
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    /* renamed from: c, reason: from getter */
    public final LayoutDirection getC() {
        return this.c;
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    /* renamed from: d, reason: from getter */
    public final int getB() {
        return this.b;
    }
}
