package androidx.compose.foundation;

import android.graphics.Rect;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.NodeCoordinator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/RectListNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public abstract class RectListNode extends Modifier.Node implements GlobalPositionAwareModifierNode {
    public Rect r;

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void Q(NodeCoordinator nodeCoordinator) {
        androidx.compose.ui.geometry.Rect rectD = LayoutCoordinatesKt.c(nodeCoordinator).D(nodeCoordinator, true);
        Rect rect = new Rect(MathKt.b(rectD.f1752a), MathKt.b(rectD.b), MathKt.b(rectD.c), MathKt.b(rectD.d));
        MutableVector mutableVectorS2 = s2();
        Object obj = this.r;
        if (obj != null) {
            mutableVectorS2.k(obj);
        }
        if (!rect.isEmpty()) {
            mutableVectorS2.c(rect);
        }
        t2(mutableVectorS2);
        this.r = rect;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void l2() {
        MutableVector mutableVectorS2 = s2();
        Rect rect = this.r;
        if (rect != null) {
            mutableVectorS2.k(rect);
        }
        t2(mutableVectorS2);
        this.r = null;
    }

    public abstract MutableVector s2();

    public abstract void t2(MutableVector mutableVector);
}
