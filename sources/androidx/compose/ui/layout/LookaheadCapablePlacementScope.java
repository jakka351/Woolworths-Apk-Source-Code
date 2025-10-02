package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/LookaheadCapablePlacementScope;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class LookaheadCapablePlacementScope extends Placeable.PlacementScope {
    public final LookaheadCapablePlaceable b;

    public LookaheadCapablePlacementScope(LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        this.b = lookaheadCapablePlaceable;
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public final LayoutCoordinates b() {
        LookaheadCapablePlaceable lookaheadCapablePlaceable = this.b;
        LayoutCoordinates layoutCoordinatesB0 = lookaheadCapablePlaceable.k ? null : lookaheadCapablePlaceable.B0();
        if (layoutCoordinatesB0 == null) {
            lookaheadCapablePlaceable.getP().L.b();
        }
        return layoutCoordinatesB0;
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    /* renamed from: c */
    public final LayoutDirection getC() {
        return this.b.getD();
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    /* renamed from: d */
    public final int getB() {
        return this.b.i0();
    }
}
