package androidx.compose.ui.graphics.layer;

import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
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
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@RequiresApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayerV23;", "Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class GraphicsLayerV23 implements GraphicsLayerImpl {
    public static final AtomicBoolean B = new AtomicBoolean(true);
    public RenderEffect A;
    public final CanvasHolder b;
    public final CanvasDrawScope c;
    public final RenderNode d;
    public long e;
    public Matrix f;
    public boolean g;
    public long h;
    public int i;
    public final int j;
    public float k;
    public boolean l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public long r;
    public long s;
    public float t;
    public float u;
    public float v;
    public float w;
    public boolean x;
    public boolean y;
    public boolean z;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayerV23$Companion;", "", "Ljava/util/concurrent/atomic/AtomicBoolean;", "needToValidateAccess", "Ljava/util/concurrent/atomic/AtomicBoolean;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public GraphicsLayerV23(AndroidComposeView androidComposeView, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope) {
        this.b = canvasHolder;
        this.c = canvasDrawScope;
        RenderNode renderNodeCreate = RenderNode.create("Compose", androidComposeView);
        this.d = renderNodeCreate;
        this.e = 0L;
        this.h = 0L;
        if (B.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            RenderNodeVerificationHelper28.c(renderNodeCreate, RenderNodeVerificationHelper28.a(renderNodeCreate));
            RenderNodeVerificationHelper28.d(renderNodeCreate, RenderNodeVerificationHelper28.b(renderNodeCreate));
            RenderNodeVerificationHelper24.a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        n(0);
        this.i = 0;
        this.j = 3;
        this.k = 1.0f;
        this.m = 1.0f;
        this.n = 1.0f;
        long j = Color.b;
        this.r = j;
        this.s = j;
        this.w = 8.0f;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void A(float f) {
        this.q = f;
        this.d.setElevation(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: B, reason: from getter */
    public final int getN() {
        return this.i;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void C(int i, int i2, long j) {
        int i3 = (int) (j >> 32);
        int i4 = (int) (4294967295L & j);
        this.d.setLeftTopRightBottom(i, i2, i + i3, i2 + i4);
        if (IntSize.b(this.e, j)) {
            return;
        }
        if (this.l) {
            this.d.setPivotX(i3 / 2.0f);
            this.d.setPivotY(i4 / 2.0f);
        }
        this.e = j;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: D, reason: from getter */
    public final float getX() {
        return this.u;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: E, reason: from getter */
    public final float getY() {
        return this.v;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: F, reason: from getter */
    public final long getU() {
        return this.r;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: G, reason: from getter */
    public final int getM() {
        return this.j;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: H, reason: from getter */
    public final float getP() {
        return this.m;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void I(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.l = true;
            this.d.setPivotX(((int) (this.e >> 32)) / 2.0f);
            this.d.setPivotY(((int) (4294967295L & this.e)) / 2.0f);
        } else {
            this.l = false;
            this.d.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: J, reason: from getter */
    public final float getW() {
        return this.t;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void K(long j) {
        this.r = j;
        RenderNodeVerificationHelper28.c(this.d, ColorKt.j(j));
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void L(long j) {
        this.s = j;
        RenderNodeVerificationHelper28.d(this.d, ColorKt.j(j));
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void M(int i) {
        this.i = i;
        if (i != 1 && this.j == 3) {
            n(i);
        } else {
            n(1);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: N, reason: from getter */
    public final float getQ() {
        return this.n;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: a, reason: from getter */
    public final float getO() {
        return this.k;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void b(float f) {
        this.k = f;
        this.d.setAlpha(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void c(float f) {
        this.p = f;
        this.d.setTranslationY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void d(float f) {
        this.w = f;
        this.d.setCameraDistance(-f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void e(float f) {
        this.t = f;
        this.d.setRotationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void f(float f) {
        this.u = f;
        this.d.setRotationY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void g(float f) {
        this.v = f;
        this.d.setRotation(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final boolean h() {
        return this.d.isValid();
    }

    public final void i() {
        boolean z = this.x;
        boolean z2 = false;
        boolean z3 = z && !this.g;
        if (z && this.g) {
            z2 = true;
        }
        if (z3 != this.y) {
            this.y = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.z) {
            this.z = z2;
            this.d.setClipToOutline(z2);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void j(float f) {
        this.m = f;
        this.d.setScaleX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void k(RenderEffect renderEffect) {
        this.A = renderEffect;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void l(float f) {
        this.n = f;
        this.d.setScaleY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void m(float f) {
        this.o = f;
        this.d.setTranslationX(f);
    }

    public final void n(int i) {
        RenderNode renderNode = this.d;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void o() {
        RenderNodeVerificationHelper24.a(this.d);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: p, reason: from getter */
    public final RenderEffect getZ() {
        return this.A;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: q, reason: from getter */
    public final long getV() {
        return this.s;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: r, reason: from getter */
    public final float getT() {
        return this.w;
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
        this.h = j;
        this.d.setOutline(outline);
        this.g = outline != null;
        i();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: u, reason: from getter */
    public final float getS() {
        return this.p;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: v, reason: from getter */
    public final float getR() {
        return this.o;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: w, reason: from getter */
    public final float getT() {
        return this.q;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void x(Canvas canvas) {
        DisplayListCanvas displayListCanvasA = AndroidCanvas_androidKt.a(canvas);
        Intrinsics.f(displayListCanvasA, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        displayListCanvasA.drawRenderNode(this.d);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void y(Density density, LayoutDirection layoutDirection, GraphicsLayer graphicsLayer, Function1 function1) {
        android.graphics.Canvas canvasStart = this.d.start(Math.max((int) (this.e >> 32), (int) (this.h >> 32)), Math.max((int) (this.e & 4294967295L), (int) (this.h & 4294967295L)));
        try {
            CanvasHolder canvasHolder = this.b;
            AndroidCanvas androidCanvas = canvasHolder.f1764a;
            android.graphics.Canvas canvas = androidCanvas.f1755a;
            androidCanvas.f1755a = canvasStart;
            CanvasDrawScope canvasDrawScope = this.c;
            long jD = IntSizeKt.d(this.e);
            CanvasDrawScope$drawContext$1 canvasDrawScope$drawContext$1 = canvasDrawScope.e;
            CanvasDrawScope$drawContext$1 canvasDrawScope$drawContext$12 = canvasDrawScope.e;
            Density densityB = canvasDrawScope$drawContext$1.b();
            LayoutDirection layoutDirectionC = canvasDrawScope$drawContext$12.c();
            Canvas canvasA = canvasDrawScope$drawContext$12.a();
            long jD2 = canvasDrawScope$drawContext$12.d();
            GraphicsLayer graphicsLayer2 = canvasDrawScope$drawContext$12.b;
            canvasDrawScope$drawContext$12.f(density);
            canvasDrawScope$drawContext$12.g(layoutDirection);
            canvasDrawScope$drawContext$12.e(androidCanvas);
            canvasDrawScope$drawContext$12.h(jD);
            canvasDrawScope$drawContext$12.b = graphicsLayer;
            androidCanvas.save();
            try {
                ((GraphicsLayer$clipDrawBlock$1) function1).invoke(canvasDrawScope);
                androidCanvas.m();
                canvasDrawScope$drawContext$12.f(densityB);
                canvasDrawScope$drawContext$12.g(layoutDirectionC);
                canvasDrawScope$drawContext$12.e(canvasA);
                canvasDrawScope$drawContext$12.h(jD2);
                canvasDrawScope$drawContext$12.b = graphicsLayer2;
                canvasHolder.f1764a.f1755a = canvas;
            } catch (Throwable th) {
                androidCanvas.m();
                CanvasDrawScope$drawContext$1 canvasDrawScope$drawContext$13 = canvasDrawScope.e;
                canvasDrawScope$drawContext$13.f(densityB);
                canvasDrawScope$drawContext$13.g(layoutDirectionC);
                canvasDrawScope$drawContext$13.e(canvasA);
                canvasDrawScope$drawContext$13.h(jD2);
                canvasDrawScope$drawContext$13.b = graphicsLayer2;
                throw th;
            }
        } finally {
            this.d.end(canvasStart);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void z(boolean z) {
        this.x = z;
        i();
    }

    public /* synthetic */ GraphicsLayerV23(AndroidComposeView androidComposeView) {
        this(androidComposeView, new CanvasHolder(), new CanvasDrawScope());
    }
}
