package androidx.compose.ui.platform;

import android.view.ViewGroup;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.relocation.BringIntoViewModifierNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/BringIntoViewOnScreenResponderNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/relocation/BringIntoViewModifierNode;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class BringIntoViewOnScreenResponderNode extends Modifier.Node implements BringIntoViewModifierNode {
    public ViewGroup r;

    @Override // androidx.compose.ui.relocation.BringIntoViewModifierNode
    public final Object S0(NodeCoordinator nodeCoordinator, Function0 function0, ContinuationImpl continuationImpl) {
        long jG = nodeCoordinator.G(0L);
        Rect rect = (Rect) function0.invoke();
        Rect rectK = rect != null ? rect.k(jG) : null;
        if (rectK != null) {
            this.r.requestRectangleOnScreen(RectHelper_androidKt.a(rectK), false);
        }
        return Unit.f24250a;
    }
}
