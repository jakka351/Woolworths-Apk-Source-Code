package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/graphics/drawscope/CanvasDrawScope$drawContext$1", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CanvasDrawScope$drawContext$1 implements DrawContext {

    /* renamed from: a, reason: collision with root package name */
    public final CanvasDrawScopeKt$asDrawTransform$1 f1798a = new CanvasDrawScopeKt$asDrawTransform$1(this);
    public GraphicsLayer b;
    public final /* synthetic */ CanvasDrawScope c;

    public CanvasDrawScope$drawContext$1(CanvasDrawScope canvasDrawScope) {
        this.c = canvasDrawScope;
    }

    public final Canvas a() {
        return this.c.d.c;
    }

    public final Density b() {
        return this.c.d.f1797a;
    }

    public final LayoutDirection c() {
        return this.c.d.b;
    }

    public final long d() {
        return this.c.d.d;
    }

    public final void e(Canvas canvas) {
        this.c.d.c = canvas;
    }

    public final void f(Density density) {
        this.c.d.f1797a = density;
    }

    public final void g(LayoutDirection layoutDirection) {
        this.c.d.b = layoutDirection;
    }

    public final void h(long j) {
        this.c.d.d = j;
    }
}
