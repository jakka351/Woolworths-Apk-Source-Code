package androidx.compose.ui.graphics.layer;

import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@RequiresApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayerV29;", "Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class GraphicsLayerV29 implements GraphicsLayerImpl {
    public final CanvasHolder b;
    public final CanvasDrawScope c;
    public final RenderNode d;
    public long e;
    public Matrix f;
    public boolean g;
    public float h;
    public final int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public long o;
    public long p;
    public float q;
    public float r;
    public float s;
    public float t;
    public boolean u;
    public boolean v;
    public boolean w;
    public RenderEffect x;
    public int y;

    public GraphicsLayerV29() {
        CanvasHolder canvasHolder = new CanvasHolder();
        CanvasDrawScope canvasDrawScope = new CanvasDrawScope();
        this.b = canvasHolder;
        this.c = canvasDrawScope;
        RenderNode renderNodeE = androidx.compose.ui.graphics.a.e();
        this.d = renderNodeE;
        this.e = 0L;
        renderNodeE.setClipToBounds(false);
        n(renderNodeE, 0);
        this.h = 1.0f;
        this.i = 3;
        this.j = 1.0f;
        this.k = 1.0f;
        long j = Color.b;
        this.o = j;
        this.p = j;
        this.t = 8.0f;
        this.y = 0;
    }

    public static void n(RenderNode renderNode, int i) {
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void A(float f) {
        this.n = f;
        this.d.setElevation(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: B, reason: from getter */
    public final int getY() {
        return this.y;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void C(int i, int i2, long j) {
        this.d.setPosition(i, i2, ((int) (j >> 32)) + i, ((int) (4294967295L & j)) + i2);
        this.e = IntSizeKt.d(j);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: D, reason: from getter */
    public final float getR() {
        return this.r;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: E, reason: from getter */
    public final float getS() {
        return this.s;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: F, reason: from getter */
    public final long getO() {
        return this.o;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: G, reason: from getter */
    public final int getI() {
        return this.i;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: H, reason: from getter */
    public final float getJ() {
        return this.j;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void I(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.d.resetPivot();
        } else {
            this.d.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: J, reason: from getter */
    public final float getQ() {
        return this.q;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void K(long j) {
        this.o = j;
        this.d.setAmbientShadowColor(ColorKt.j(j));
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void L(long j) {
        this.p = j;
        this.d.setSpotShadowColor(ColorKt.j(j));
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void M(int i) {
        this.y = i;
        if (i != 1 && this.i == 3 && this.x == null) {
            n(this.d, i);
        } else {
            n(this.d, 1);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: N, reason: from getter */
    public final float getK() {
        return this.k;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: a, reason: from getter */
    public final float getH() {
        return this.h;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void b(float f) {
        this.h = f;
        this.d.setAlpha(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void c(float f) {
        this.m = f;
        this.d.setTranslationY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void d(float f) {
        this.t = f;
        this.d.setCameraDistance(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void e(float f) {
        this.q = f;
        this.d.setRotationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void f(float f) {
        this.r = f;
        this.d.setRotationY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void g(float f) {
        this.s = f;
        this.d.setRotationZ(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final boolean h() {
        return this.d.hasDisplayList();
    }

    public final void i() {
        boolean z = this.u;
        boolean z2 = false;
        boolean z3 = z && !this.g;
        if (z && this.g) {
            z2 = true;
        }
        if (z3 != this.v) {
            this.v = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.w) {
            this.w = z2;
            this.d.setClipToOutline(z2);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void j(float f) {
        this.j = f;
        this.d.setScaleX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void k(RenderEffect renderEffect) {
        this.x = renderEffect;
        if (Build.VERSION.SDK_INT >= 31) {
            RenderNodeVerificationHelper.a(this.d, renderEffect);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void l(float f) {
        this.k = f;
        this.d.setScaleY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void m(float f) {
        this.l = f;
        this.d.setTranslationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void o() {
        this.d.discardDisplayList();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: p, reason: from getter */
    public final RenderEffect getX() {
        return this.x;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: q, reason: from getter */
    public final long getP() {
        return this.p;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: r, reason: from getter */
    public final float getT() {
        return this.t;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final Matrix s() {
        Matrix matrix = this.f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f = matrix;
        }
        this.d.getMatrix(matrix);
        return matrix;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void t(Outline outline, long j) {
        this.d.setOutline(outline);
        this.g = outline != null;
        i();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: u, reason: from getter */
    public final float getM() {
        return this.m;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: v, reason: from getter */
    public final float getL() {
        return this.l;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: w, reason: from getter */
    public final float getN() {
        return this.n;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void x(Canvas canvas) {
        AndroidCanvas_androidKt.a(canvas).drawRenderNode(this.d);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void y(Density density, LayoutDirection layoutDirection, GraphicsLayer graphicsLayer, Function1 function1) {
        CanvasDrawScope canvasDrawScope = this.c;
        RecordingCanvas recordingCanvasBeginRecording = this.d.beginRecording();
        try {
            CanvasHolder canvasHolder = this.b;
            AndroidCanvas androidCanvas = canvasHolder.f1764a;
            android.graphics.Canvas canvas = androidCanvas.f1755a;
            androidCanvas.f1755a = recordingCanvasBeginRecording;
            CanvasDrawScope$drawContext$1 canvasDrawScope$drawContext$1 = canvasDrawScope.e;
            canvasDrawScope$drawContext$1.f(density);
            canvasDrawScope$drawContext$1.g(layoutDirection);
            canvasDrawScope$drawContext$1.b = graphicsLayer;
            canvasDrawScope$drawContext$1.h(this.e);
            canvasDrawScope$drawContext$1.e(androidCanvas);
            ((GraphicsLayer$clipDrawBlock$1) function1).invoke(canvasDrawScope);
            canvasHolder.f1764a.f1755a = canvas;
        } finally {
            this.d.endRecording();
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void z(boolean z) {
        this.u = z;
        i();
    }
}
