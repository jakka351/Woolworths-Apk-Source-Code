package androidx.compose.ui.node;

import androidx.compose.ui.layout.MeasureResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/PlaceableResult;", "Landroidx/compose/ui/node/OwnerScope;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class PlaceableResult implements OwnerScope {
    public final MeasureResult d;
    public final LookaheadCapablePlaceable e;

    public PlaceableResult(MeasureResult measureResult, LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        this.d = measureResult;
        this.e = lookaheadCapablePlaceable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceableResult)) {
            return false;
        }
        PlaceableResult placeableResult = (PlaceableResult) obj;
        return Intrinsics.c(this.d, placeableResult.d) && Intrinsics.c(this.e, placeableResult.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return "PlaceableResult(result=" + this.d + ", placeable=" + this.e + ')';
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public final boolean y0() {
        return this.e.B0().q();
    }
}
