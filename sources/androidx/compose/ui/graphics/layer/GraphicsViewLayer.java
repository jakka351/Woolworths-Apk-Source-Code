package androidx.compose.ui.graphics.layer;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.layer.view.DrawChildContainer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsViewLayer;", "Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class GraphicsViewLayer implements GraphicsLayerImpl {
    public static final GraphicsViewLayer$Companion$PlaceholderCanvas$1 A = new GraphicsViewLayer$Companion$PlaceholderCanvas$1();
    public final DrawChildContainer b;
    public final CanvasHolder c;
    public final ViewLayer d;
    public final Resources e;
    public final Rect f;
    public int g;
    public int h;
    public long i;
    public boolean j;
    public boolean k;
    public boolean l;
    public final int m;
    public int n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public long u;
    public long v;
    public float w;
    public float x;
    public float y;
    public RenderEffect z;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsViewLayer$Companion;", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public GraphicsViewLayer(DrawChildContainer drawChildContainer) {
        CanvasHolder canvasHolder = new CanvasHolder();
        CanvasDrawScope canvasDrawScope = new CanvasDrawScope();
        this.b = drawChildContainer;
        this.c = canvasHolder;
        ViewLayer viewLayer = new ViewLayer(drawChildContainer, canvasHolder, canvasDrawScope);
        this.d = viewLayer;
        this.e = drawChildContainer.getResources();
        this.f = new Rect();
        drawChildContainer.addView(viewLayer);
        viewLayer.setClipBounds(null);
        this.i = 0L;
        View.generateViewId();
        this.m = 3;
        this.n = 0;
        this.o = 1.0f;
        this.p = 1.0f;
        this.q = 1.0f;
        long j = Color.b;
        this.u = j;
        this.v = j;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void A(float f) {
        this.t = f;
        this.d.setElevation(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: B, reason: from getter */
    public final int getN() {
        return this.n;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void C(int i, int i2, long j) {
        boolean zB = IntSize.b(this.i, j);
        ViewLayer viewLayer = this.d;
        if (zB) {
            int i3 = this.g;
            if (i3 != i) {
                viewLayer.offsetLeftAndRight(i - i3);
            }
            int i4 = this.h;
            if (i4 != i2) {
                viewLayer.offsetTopAndBottom(i2 - i4);
            }
        } else {
            if (this.l || viewLayer.getClipToOutline()) {
                this.j = true;
            }
            viewLayer.layout(i, i2, ((int) (j >> 32)) + i, ((int) (4294967295L & j)) + i2);
            this.i = j;
        }
        this.g = i;
        this.h = i2;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: D, reason: from getter */
    public final float getX() {
        return this.x;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: E, reason: from getter */
    public final float getY() {
        return this.y;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: F, reason: from getter */
    public final long getU() {
        return this.u;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: G, reason: from getter */
    public final int getM() {
        return this.m;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: H, reason: from getter */
    public final float getP() {
        return this.p;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void I(long j) {
        long j2 = 9223372034707292159L & j;
        ViewLayer viewLayer = this.d;
        if (j2 == 9205357640488583168L) {
            viewLayer.resetPivot();
        } else {
            viewLayer.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            viewLayer.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: J, reason: from getter */
    public final float getW() {
        return this.w;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void K(long j) {
        this.u = j;
        this.d.setOutlineAmbientShadowColor(ColorKt.j(j));
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void L(long j) {
        this.v = j;
        this.d.setOutlineSpotShadowColor(ColorKt.j(j));
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void M(int i) {
        this.n = i;
        ViewLayer viewLayer = this.d;
        boolean z = true;
        if (i == 1 || this.m != 3) {
            viewLayer.setLayerType(2, null);
            viewLayer.setCanUseCompositingLayer$ui_graphics_release(true);
            return;
        }
        if (i == 1) {
            viewLayer.setLayerType(2, null);
        } else if (i == 2) {
            viewLayer.setLayerType(0, null);
            z = false;
        } else {
            viewLayer.setLayerType(0, null);
        }
        viewLayer.setCanUseCompositingLayer$ui_graphics_release(z);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: N, reason: from getter */
    public final float getQ() {
        return this.q;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: a, reason: from getter */
    public final float getO() {
        return this.o;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void b(float f) {
        this.o = f;
        this.d.setAlpha(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void c(float f) {
        this.s = f;
        this.d.setTranslationY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void d(float f) {
        this.d.setCameraDistance(f * this.e.getDisplayMetrics().densityDpi);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void e(float f) {
        this.w = f;
        this.d.setRotationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void f(float f) {
        this.x = f;
        this.d.setRotationY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void g(float f) {
        this.y = f;
        this.d.setRotation(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void j(float f) {
        this.p = f;
        this.d.setScaleX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void k(RenderEffect renderEffect) {
        this.z = renderEffect;
        if (Build.VERSION.SDK_INT >= 31) {
            this.d.setRenderEffect(renderEffect != null ? renderEffect.a() : null);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void l(float f) {
        this.q = f;
        this.d.setScaleY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void m(float f) {
        this.r = f;
        this.d.setTranslationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void o() {
        this.b.removeViewInLayout(this.d);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: p, reason: from getter */
    public final RenderEffect getZ() {
        return this.z;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: q, reason: from getter */
    public final long getV() {
        return this.v;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float r() {
        return this.d.getCameraDistance() / this.e.getDisplayMetrics().densityDpi;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final Matrix s() {
        return this.d.getMatrix();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void t(Outline outline, long j) {
        ViewLayer viewLayer = this.d;
        viewLayer.h = outline;
        viewLayer.invalidateOutline();
        if ((this.l || viewLayer.getClipToOutline()) && outline != null) {
            viewLayer.setClipToOutline(true);
            if (this.l) {
                this.l = false;
                this.j = true;
            }
        }
        this.k = outline != null;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: u, reason: from getter */
    public final float getS() {
        return this.s;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: v, reason: from getter */
    public final float getR() {
        return this.r;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: w, reason: from getter */
    public final float getT() {
        return this.t;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void x(Canvas canvas) {
        Rect rect;
        boolean z = this.j;
        ViewLayer viewLayer = this.d;
        if (z) {
            if ((this.l || viewLayer.getClipToOutline()) && !this.k) {
                rect = this.f;
                rect.left = 0;
                rect.top = 0;
                rect.right = viewLayer.getWidth();
                rect.bottom = viewLayer.getHeight();
            } else {
                rect = null;
            }
            viewLayer.setClipBounds(rect);
        }
        if (AndroidCanvas_androidKt.a(canvas).isHardwareAccelerated()) {
            this.b.a(canvas, viewLayer, viewLayer.getDrawingTime());
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void y(Density density, LayoutDirection layoutDirection, GraphicsLayer graphicsLayer, Function1 function1) {
        ViewLayer viewLayer = this.d;
        ViewParent parent = viewLayer.getParent();
        DrawChildContainer drawChildContainer = this.b;
        if (parent == null) {
            drawChildContainer.addView(viewLayer);
        }
        viewLayer.j = density;
        viewLayer.k = layoutDirection;
        viewLayer.l = function1;
        viewLayer.m = graphicsLayer;
        if (viewLayer.isAttachedToWindow()) {
            viewLayer.setVisibility(4);
            viewLayer.setVisibility(0);
            try {
                CanvasHolder canvasHolder = this.c;
                GraphicsViewLayer$Companion$PlaceholderCanvas$1 graphicsViewLayer$Companion$PlaceholderCanvas$1 = A;
                AndroidCanvas androidCanvas = canvasHolder.f1764a;
                android.graphics.Canvas canvas = androidCanvas.f1755a;
                androidCanvas.f1755a = graphicsViewLayer$Companion$PlaceholderCanvas$1;
                drawChildContainer.a(androidCanvas, viewLayer, viewLayer.getDrawingTime());
                canvasHolder.f1764a.f1755a = canvas;
            } catch (Throwable unused) {
            }
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void z(boolean z) {
        boolean z2 = false;
        this.l = z && !this.k;
        this.j = true;
        if (z && this.k) {
            z2 = true;
        }
        this.d.setClipToOutline(z2);
    }
}
