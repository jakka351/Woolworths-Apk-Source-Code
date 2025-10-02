package androidx.compose.foundation.relocation;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.NodeCoordinator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "androidx/compose/foundation/relocation/BringIntoViewRequesterKt")
/* loaded from: classes2.dex */
final /* synthetic */ class BringIntoViewRequesterKt__BringIntoViewResponderKt {
    public static final Rect a(NodeCoordinator nodeCoordinator, LayoutCoordinates layoutCoordinates, Rect rect) {
        return rect.k(nodeCoordinator.D(layoutCoordinates, false).f());
    }
}
