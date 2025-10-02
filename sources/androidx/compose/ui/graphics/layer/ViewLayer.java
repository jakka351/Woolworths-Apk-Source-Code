package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.DrawContextKt;
import androidx.compose.ui.graphics.layer.view.DrawChildContainer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0019R\u0017\u0010\u0006\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0010\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/graphics/layer/ViewLayer;", "Landroid/view/View;", "d", "Landroid/view/View;", "getOwnerView", "()Landroid/view/View;", "ownerView", "Landroidx/compose/ui/graphics/CanvasHolder;", "e", "Landroidx/compose/ui/graphics/CanvasHolder;", "getCanvasHolder", "()Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "", "g", "Z", "isInvalidated", "()Z", "setInvalidated", "(Z)V", "value", "i", "getCanUseCompositingLayer$ui_graphics_release", "setCanUseCompositingLayer$ui_graphics_release", "canUseCompositingLayer", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ViewLayer extends View {
    public static final ViewLayer$Companion$LayerOutlineProvider$1 n = new ViewLayer$Companion$LayerOutlineProvider$1();
    public final DrawChildContainer d;

    /* renamed from: e, reason: from kotlin metadata */
    public final CanvasHolder canvasHolder;
    public final CanvasDrawScope f;

    /* renamed from: g, reason: from kotlin metadata */
    public boolean isInvalidated;
    public Outline h;

    /* renamed from: i, reason: from kotlin metadata */
    public boolean canUseCompositingLayer;
    public Density j;
    public LayoutDirection k;
    public Function1 l;
    public GraphicsLayer m;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/layer/ViewLayer$Companion;", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public ViewLayer(DrawChildContainer drawChildContainer, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope) {
        super(drawChildContainer.getContext());
        this.d = drawChildContainer;
        this.canvasHolder = canvasHolder;
        this.f = canvasDrawScope;
        setOutlineProvider(n);
        this.canUseCompositingLayer = true;
        this.j = DrawContextKt.f1800a;
        this.k = LayoutDirection.d;
        GraphicsLayerImpl.f1806a.getClass();
        this.l = GraphicsLayerImpl$Companion$DefaultDrawBlock$1.h;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        CanvasHolder canvasHolder = this.canvasHolder;
        AndroidCanvas androidCanvas = canvasHolder.f1764a;
        Canvas canvas2 = androidCanvas.f1755a;
        androidCanvas.f1755a = canvas;
        Density density = this.j;
        LayoutDirection layoutDirection = this.k;
        float width = getWidth();
        float height = getHeight();
        long jFloatToRawIntBits = (Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        GraphicsLayer graphicsLayer = this.m;
        Function1 function1 = this.l;
        CanvasDrawScope canvasDrawScope = this.f;
        Density densityB = canvasDrawScope.e.b();
        CanvasDrawScope$drawContext$1 canvasDrawScope$drawContext$1 = canvasDrawScope.e;
        LayoutDirection layoutDirectionC = canvasDrawScope$drawContext$1.c();
        androidx.compose.ui.graphics.Canvas canvasA = canvasDrawScope$drawContext$1.a();
        long jD = canvasDrawScope$drawContext$1.d();
        GraphicsLayer graphicsLayer2 = canvasDrawScope$drawContext$1.b;
        canvasDrawScope$drawContext$1.f(density);
        canvasDrawScope$drawContext$1.g(layoutDirection);
        canvasDrawScope$drawContext$1.e(androidCanvas);
        canvasDrawScope$drawContext$1.h(jFloatToRawIntBits);
        canvasDrawScope$drawContext$1.b = graphicsLayer;
        androidCanvas.save();
        try {
            function1.invoke(canvasDrawScope);
            androidCanvas.m();
            canvasDrawScope$drawContext$1.f(densityB);
            canvasDrawScope$drawContext$1.g(layoutDirectionC);
            canvasDrawScope$drawContext$1.e(canvasA);
            canvasDrawScope$drawContext$1.h(jD);
            canvasDrawScope$drawContext$1.b = graphicsLayer2;
            canvasHolder.f1764a.f1755a = canvas2;
            this.isInvalidated = false;
        } catch (Throwable th) {
            androidCanvas.m();
            canvasDrawScope$drawContext$1.f(densityB);
            canvasDrawScope$drawContext$1.g(layoutDirectionC);
            canvasDrawScope$drawContext$1.e(canvasA);
            canvasDrawScope$drawContext$1.h(jD);
            canvasDrawScope$drawContext$1.b = graphicsLayer2;
            throw th;
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    /* renamed from: getCanUseCompositingLayer$ui_graphics_release, reason: from getter */
    public final boolean getCanUseCompositingLayer() {
        return this.canUseCompositingLayer;
    }

    @NotNull
    public final CanvasHolder getCanvasHolder() {
        return this.canvasHolder;
    }

    @NotNull
    public final View getOwnerView() {
        return this.d;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.canUseCompositingLayer;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        this.isInvalidated = true;
        super.invalidate();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z) {
        if (this.canUseCompositingLayer != z) {
            this.canUseCompositingLayer = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.isInvalidated = z;
    }
}
