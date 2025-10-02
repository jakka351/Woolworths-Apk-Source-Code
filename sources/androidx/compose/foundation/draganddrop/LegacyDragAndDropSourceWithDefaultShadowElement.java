package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.draganddrop.LegacyDragSourceNodeWithDefaultPainter.AnonymousClass2;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/draganddrop/LegacyDragAndDropSourceWithDefaultShadowElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/draganddrop/LegacyDragSourceNodeWithDefaultPainter;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class LegacyDragAndDropSourceWithDefaultShadowElement extends ModifierNodeElement<LegacyDragSourceNodeWithDefaultPainter> {
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        LegacyDragSourceNodeWithDefaultPainter legacyDragSourceNodeWithDefaultPainter = new LegacyDragSourceNodeWithDefaultPainter();
        CacheDrawScopeDragShadowCallback cacheDrawScopeDragShadowCallback = new CacheDrawScopeDragShadowCallback();
        legacyDragSourceNodeWithDefaultPainter.s2(DrawModifierKt.a(new LegacyDragSourceNodeWithDefaultPainter$cacheDrawScopeDragShadowCallback$1$1(1, cacheDrawScopeDragShadowCallback, CacheDrawScopeDragShadowCallback.class, "cachePicture", "cachePicture(Landroidx/compose/ui/draw/CacheDrawScope;)Landroidx/compose/ui/draw/DrawResult;", 0)));
        legacyDragSourceNodeWithDefaultPainter.s2(new LegacyDragAndDropSourceNode(new Function1<DrawScope, Unit>() { // from class: androidx.compose.foundation.draganddrop.LegacyDragSourceNodeWithDefaultPainter.1
            public AnonymousClass1() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                DrawScope drawScope = (DrawScope) obj;
                GraphicsLayer graphicsLayer = cacheDrawScopeDragShadowCallback.f863a;
                if (graphicsLayer == null) {
                    throw new IllegalArgumentException("No cached drag shadow. Check if the drag source node was rendered first");
                }
                GraphicsLayerKt.a(drawScope, graphicsLayer);
                return Unit.f24250a;
            }
        }, legacyDragSourceNodeWithDefaultPainter.new AnonymousClass2(null)));
        return legacyDragSourceNodeWithDefaultPainter;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ((LegacyDragSourceNodeWithDefaultPainter) node).getClass();
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof LegacyDragAndDropSourceWithDefaultShadowElement);
    }

    public final int hashCode() {
        throw null;
    }
}
