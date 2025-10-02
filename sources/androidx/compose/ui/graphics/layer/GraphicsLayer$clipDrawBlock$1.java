package androidx.compose.ui.graphics.layer;

import androidx.camera.core.impl.b;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class GraphicsLayer$clipDrawBlock$1 extends Lambda implements Function1<DrawScope, Unit> {
    public final /* synthetic */ GraphicsLayer h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphicsLayer$clipDrawBlock$1(GraphicsLayer graphicsLayer) {
        super(1);
        this.h = graphicsLayer;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DrawScope drawScope = (DrawScope) obj;
        GraphicsLayer graphicsLayer = this.h;
        Path path = graphicsLayer.l;
        if (graphicsLayer.n && graphicsLayer.w && path != null) {
            CanvasDrawScope$drawContext$1 e = drawScope.getE();
            long jD = e.d();
            e.a().save();
            try {
                e.f1798a.a(path, 1);
                graphicsLayer.c(drawScope);
            } finally {
                b.C(e, jD);
            }
        } else {
            graphicsLayer.c(drawScope);
        }
        return Unit.f24250a;
    }
}
