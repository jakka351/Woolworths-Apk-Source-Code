package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.node.DelegatingNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;", "Landroidx/compose/ui/node/DelegatingNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DragSourceNodeWithDefaultPainter extends DelegatingNode {
    public final CacheDrawScopeDragShadowCallback t;
    public final DragAndDropSourceNode u;

    public DragSourceNodeWithDefaultPainter() {
        CacheDrawScopeDragShadowCallback cacheDrawScopeDragShadowCallback = new CacheDrawScopeDragShadowCallback();
        s2(DrawModifierKt.a(new DragSourceNodeWithDefaultPainter$cacheDrawScopeDragShadowCallback$1$1(1, cacheDrawScopeDragShadowCallback, CacheDrawScopeDragShadowCallback.class, "cachePicture", "cachePicture(Landroidx/compose/ui/draw/CacheDrawScope;)Landroidx/compose/ui/draw/DrawResult;", 0)));
        this.t = cacheDrawScopeDragShadowCallback;
        DragAndDropSourceNode dragAndDropSourceNode = new DragAndDropSourceNode(new Function1<DrawScope, Unit>() { // from class: androidx.compose.foundation.draganddrop.DragSourceNodeWithDefaultPainter$dragAndDropModifierNode$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                DrawScope drawScope = (DrawScope) obj;
                GraphicsLayer graphicsLayer = this.h.t.f863a;
                if (graphicsLayer == null) {
                    throw new IllegalArgumentException("No cached drag shadow. Check if the drag source node was rendered first");
                }
                GraphicsLayerKt.a(drawScope, graphicsLayer);
                return Unit.f24250a;
            }
        });
        s2(dragAndDropSourceNode);
        this.u = dragAndDropSourceNode;
    }
}
