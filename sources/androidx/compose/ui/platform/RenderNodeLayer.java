package androidx.compose.ui.platform;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.GraphicLayerInfo;
import androidx.compose.ui.node.OwnedLayer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeLayer;", "Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/layout/GraphicLayerInfo;", "Companion", "UniqueDrawingIdApi29", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@RequiresApi
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RenderNodeLayer implements OwnedLayer, GraphicLayerInfo {
    public static final Function2 q = null;
    public final AndroidComposeView d;
    public Function2 e;
    public Function0 f;
    public boolean g;
    public boolean i;
    public boolean j;
    public AndroidPaint k;
    public final DeviceRenderNode o;
    public int p;
    public final OutlineResolver h = new OutlineResolver();
    public final LayerMatrixCache l = new LayerMatrixCache(RenderNodeLayer$Companion$getMatrix$1.h);
    public final CanvasHolder m = new CanvasHolder();
    public long n = TransformOrigin.b;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R&\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeLayer$Companion;", "", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/DeviceRenderNode;", "Landroid/graphics/Matrix;", "", "getMatrix", "Lkotlin/jvm/functions/Function2;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    @RequiresApi
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeLayer$UniqueDrawingIdApi29;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UniqueDrawingIdApi29 {
    }

    public RenderNodeLayer(AndroidComposeView androidComposeView, Function2 function2, Function0 function0) {
        this.d = androidComposeView;
        this.e = function2;
        this.f = function0;
        DeviceRenderNode renderNodeApi29 = Build.VERSION.SDK_INT >= 29 ? new RenderNodeApi29() : new RenderNodeApi23(androidComposeView);
        renderNodeApi29.u();
        renderNodeApi29.r(false);
        this.o = renderNodeApi29;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void a(Function2 function2, Function0 function0) {
        this.l.h();
        l(false);
        this.i = false;
        this.j = false;
        this.n = TransformOrigin.b;
        this.e = function2;
        this.f = function0;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void b(Canvas canvas, GraphicsLayer graphicsLayer) {
        android.graphics.Canvas canvasA = AndroidCanvas_androidKt.a(canvas);
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        DeviceRenderNode deviceRenderNode = this.o;
        if (zIsHardwareAccelerated) {
            k();
            boolean z = deviceRenderNode.J() > BitmapDescriptorFactory.HUE_RED;
            this.j = z;
            if (z) {
                canvas.n();
            }
            deviceRenderNode.q(canvasA);
            if (this.j) {
                canvas.g();
                return;
            }
            return;
        }
        float fN = deviceRenderNode.getB();
        float F = deviceRenderNode.getC();
        float fI = deviceRenderNode.getD();
        float fZ = deviceRenderNode.getE();
        if (deviceRenderNode.a() < 1.0f) {
            AndroidPaint androidPaintA = this.k;
            if (androidPaintA == null) {
                androidPaintA = AndroidPaint_androidKt.a();
                this.k = androidPaintA;
            }
            androidPaintA.b(deviceRenderNode.a());
            canvasA.saveLayer(fN, F, fI, fZ, androidPaintA.f1759a);
        } else {
            canvas.save();
        }
        canvas.c(fN, F);
        canvas.r(this.l.b(deviceRenderNode));
        if (deviceRenderNode.v() || deviceRenderNode.getF()) {
            this.h.a(canvas);
        }
        Function2 function2 = this.e;
        if (function2 != null) {
            function2.invoke(canvas, null);
        }
        canvas.m();
        l(false);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void c(MutableRect mutableRect, boolean z) {
        DeviceRenderNode deviceRenderNode = this.o;
        LayerMatrixCache layerMatrixCache = this.l;
        if (z) {
            layerMatrixCache.f(deviceRenderNode, mutableRect);
        } else {
            layerMatrixCache.d(deviceRenderNode, mutableRect);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void d(float[] fArr) {
        Matrix.f(fArr, this.l.b(this.o));
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void destroy() {
        DeviceRenderNode deviceRenderNode = this.o;
        if (deviceRenderNode.h()) {
            deviceRenderNode.o();
        }
        this.e = null;
        this.f = null;
        this.i = true;
        l(false);
        AndroidComposeView androidComposeView = this.d;
        androidComposeView.I = true;
        androidComposeView.X(this);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final long e(long j, boolean z) {
        DeviceRenderNode deviceRenderNode = this.o;
        LayerMatrixCache layerMatrixCache = this.l;
        return z ? layerMatrixCache.g(j, deviceRenderNode) : layerMatrixCache.e(j, deviceRenderNode);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void f(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        float fB = TransformOrigin.b(this.n) * i;
        DeviceRenderNode deviceRenderNode = this.o;
        deviceRenderNode.A(fB);
        deviceRenderNode.B(TransformOrigin.c(this.n) * i2);
        if (deviceRenderNode.E(deviceRenderNode.getB(), deviceRenderNode.getC(), deviceRenderNode.getB() + i, deviceRenderNode.getC() + i2)) {
            deviceRenderNode.C(this.h.b());
            if (!this.g && !this.i) {
                this.d.invalidate();
                l(true);
            }
            this.l.c();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final boolean g(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j));
        DeviceRenderNode deviceRenderNode = this.o;
        if (deviceRenderNode.getF()) {
            return BitmapDescriptorFactory.HUE_RED <= fIntBitsToFloat && fIntBitsToFloat < ((float) deviceRenderNode.getWidth()) && BitmapDescriptorFactory.HUE_RED <= fIntBitsToFloat2 && fIntBitsToFloat2 < ((float) deviceRenderNode.getHeight());
        }
        if (deviceRenderNode.v()) {
            return this.h.f(j);
        }
        return true;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: getUnderlyingMatrix-sQKQjiQ */
    public final float[] mo2getUnderlyingMatrixsQKQjiQ() {
        return this.l.b(this.o);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void h(ReusableGraphicsLayerScope reusableGraphicsLayerScope) {
        Function0 function0;
        int i = reusableGraphicsLayerScope.d | this.p;
        int i2 = i & 4096;
        if (i2 != 0) {
            this.n = reusableGraphicsLayerScope.q;
        }
        DeviceRenderNode deviceRenderNode = this.o;
        boolean zV = deviceRenderNode.v();
        OutlineResolver outlineResolver = this.h;
        boolean z = false;
        boolean z2 = zV && outlineResolver.g;
        if ((i & 1) != 0) {
            deviceRenderNode.j(reusableGraphicsLayerScope.e);
        }
        if ((i & 2) != 0) {
            deviceRenderNode.l(reusableGraphicsLayerScope.f);
        }
        if ((i & 4) != 0) {
            deviceRenderNode.b(reusableGraphicsLayerScope.g);
        }
        if ((i & 8) != 0) {
            deviceRenderNode.m(reusableGraphicsLayerScope.h);
        }
        if ((i & 16) != 0) {
            deviceRenderNode.c(reusableGraphicsLayerScope.i);
        }
        if ((i & 32) != 0) {
            deviceRenderNode.s(reusableGraphicsLayerScope.j);
        }
        if ((i & 64) != 0) {
            deviceRenderNode.G(ColorKt.j(reusableGraphicsLayerScope.k));
        }
        if ((i & 128) != 0) {
            deviceRenderNode.I(ColorKt.j(reusableGraphicsLayerScope.l));
        }
        if ((i & 1024) != 0) {
            deviceRenderNode.g(reusableGraphicsLayerScope.o);
        }
        if ((i & 256) != 0) {
            deviceRenderNode.e(reusableGraphicsLayerScope.m);
        }
        if ((i & 512) != 0) {
            deviceRenderNode.f(reusableGraphicsLayerScope.n);
        }
        if ((i & 2048) != 0) {
            deviceRenderNode.d(reusableGraphicsLayerScope.p);
        }
        if (i2 != 0) {
            deviceRenderNode.A(TransformOrigin.b(this.n) * deviceRenderNode.getWidth());
            deviceRenderNode.B(TransformOrigin.c(this.n) * deviceRenderNode.getHeight());
        }
        boolean z3 = reusableGraphicsLayerScope.s;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.f1779a;
        boolean z4 = z3 && reusableGraphicsLayerScope.r != rectangleShapeKt$RectangleShape$1;
        if ((i & 24576) != 0) {
            deviceRenderNode.D(z4);
            deviceRenderNode.r(reusableGraphicsLayerScope.s && reusableGraphicsLayerScope.r == rectangleShapeKt$RectangleShape$1);
        }
        if ((131072 & i) != 0) {
            deviceRenderNode.k(reusableGraphicsLayerScope.w);
        }
        if ((32768 & i) != 0) {
            deviceRenderNode.x();
        }
        boolean zG = this.h.g(reusableGraphicsLayerScope.x, reusableGraphicsLayerScope.g, z4, reusableGraphicsLayerScope.j, reusableGraphicsLayerScope.t);
        if (outlineResolver.f) {
            deviceRenderNode.C(outlineResolver.b());
        }
        if (z4 && outlineResolver.g) {
            z = true;
        }
        View view = this.d;
        if (z2 == z && (!z || !zG)) {
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(view, view);
            }
        } else if (!this.g && !this.i) {
            view.invalidate();
            l(true);
        }
        if (!this.j && deviceRenderNode.J() > BitmapDescriptorFactory.HUE_RED && (function0 = this.f) != null) {
            function0.invoke();
        }
        if ((i & 7963) != 0) {
            this.l.c();
        }
        this.p = reusableGraphicsLayerScope.d;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void i(float[] fArr) {
        float[] fArrA = this.l.a(this.o);
        if (fArrA != null) {
            Matrix.f(fArr, fArrA);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void invalidate() {
        if (this.g || this.i) {
            return;
        }
        this.d.invalidate();
        l(true);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void j(long j) {
        DeviceRenderNode deviceRenderNode = this.o;
        int iN = deviceRenderNode.getB();
        int iF = deviceRenderNode.getC();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (iN == i && iF == i2) {
            return;
        }
        if (iN != i) {
            deviceRenderNode.y(i - iN);
        }
        if (iF != i2) {
            deviceRenderNode.t(i2 - iF);
        }
        View view = this.d;
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(view, view);
        }
        this.l.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    @Override // androidx.compose.ui.node.OwnedLayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k() {
        /*
            r4 = this;
            boolean r0 = r4.g
            androidx.compose.ui.platform.DeviceRenderNode r1 = r4.o
            if (r0 != 0) goto Le
            boolean r0 = r1.h()
            if (r0 != 0) goto Ld
            goto Le
        Ld:
            return
        Le:
            boolean r0 = r1.v()
            if (r0 == 0) goto L20
            androidx.compose.ui.platform.OutlineResolver r0 = r4.h
            boolean r2 = r0.g
            if (r2 == 0) goto L20
            r0.h()
            androidx.compose.ui.graphics.Path r0 = r0.e
            goto L21
        L20:
            r0 = 0
        L21:
            kotlin.jvm.functions.Function2 r2 = r4.e
            if (r2 == 0) goto L2f
            androidx.compose.ui.platform.RenderNodeLayer$updateDisplayList$1$1 r3 = new androidx.compose.ui.platform.RenderNodeLayer$updateDisplayList$1$1
            r3.<init>(r2)
            androidx.compose.ui.graphics.CanvasHolder r2 = r4.m
            r1.H(r2, r0, r3)
        L2f:
            r0 = 0
            r4.l(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.RenderNodeLayer.k():void");
    }

    public final void l(boolean z) {
        if (z != this.g) {
            this.g = z;
            this.d.S(this, z);
        }
    }
}
