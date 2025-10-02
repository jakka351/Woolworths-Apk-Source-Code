package androidx.compose.ui.platform;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.MatrixKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerImpl;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.GraphicLayerInfo;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/GraphicsLayerOwnerLayer;", "Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/layout/GraphicLayerInfo;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class GraphicsLayerOwnerLayer implements OwnedLayer, GraphicLayerInfo {
    public GraphicsLayer d;
    public final GraphicsContext e;
    public final AndroidComposeView f;
    public Function2 g;
    public Function0 h;
    public long i;
    public boolean j;
    public float[] l;
    public boolean m;
    public int q;
    public Outline s;
    public boolean t;
    public boolean u;
    public boolean w;
    public final float[] k = Matrix.a();
    public Density n = DensityKt.b();
    public LayoutDirection o = LayoutDirection.d;
    public final CanvasDrawScope p = new CanvasDrawScope();
    public long r = TransformOrigin.b;
    public boolean v = true;
    public final Function1 x = new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.platform.GraphicsLayerOwnerLayer$recordLambda$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            DrawScope drawScope = (DrawScope) obj;
            Canvas canvasA = drawScope.getE().a();
            Function2 function2 = this.h.g;
            if (function2 != null) {
                function2.invoke(canvasA, drawScope.getE().b);
            }
            return Unit.f24250a;
        }
    };

    public GraphicsLayerOwnerLayer(GraphicsLayer graphicsLayer, GraphicsContext graphicsContext, AndroidComposeView androidComposeView, Function2 function2, Function0 function0) {
        this.d = graphicsLayer;
        this.e = graphicsContext;
        this.f = androidComposeView;
        this.g = function2;
        this.h = function0;
        long j = Integer.MAX_VALUE;
        this.i = (j & 4294967295L) | (j << 32);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void a(Function2 function2, Function0 function0) {
        GraphicsContext graphicsContext = this.e;
        if (graphicsContext == null) {
            throw androidx.camera.core.impl.b.w("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!this.d.s) {
            InlineClassHelperKt.a("layer should have been released before reuse");
        }
        this.d = graphicsContext.a();
        this.j = false;
        this.g = function2;
        this.h = function0;
        this.t = false;
        this.u = false;
        this.v = true;
        Matrix.d(this.k);
        float[] fArr = this.l;
        if (fArr != null) {
            Matrix.d(fArr);
        }
        this.r = TransformOrigin.b;
        this.w = false;
        long j = Integer.MAX_VALUE;
        this.i = (j & 4294967295L) | (j << 32);
        this.s = null;
        this.q = 0;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void b(Canvas canvas, GraphicsLayer graphicsLayer) {
        k();
        this.w = this.d.f1805a.getT() > BitmapDescriptorFactory.HUE_RED;
        CanvasDrawScope canvasDrawScope = this.p;
        CanvasDrawScope$drawContext$1 canvasDrawScope$drawContext$1 = canvasDrawScope.e;
        canvasDrawScope$drawContext$1.e(canvas);
        canvasDrawScope$drawContext$1.b = graphicsLayer;
        GraphicsLayerKt.a(canvasDrawScope, this.d);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void c(MutableRect mutableRect, boolean z) {
        float[] fArrL = z ? l() : m();
        if (this.v) {
            return;
        }
        if (fArrL != null) {
            Matrix.c(fArrL, mutableRect);
            return;
        }
        mutableRect.f1750a = BitmapDescriptorFactory.HUE_RED;
        mutableRect.b = BitmapDescriptorFactory.HUE_RED;
        mutableRect.c = BitmapDescriptorFactory.HUE_RED;
        mutableRect.d = BitmapDescriptorFactory.HUE_RED;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void d(float[] fArr) {
        Matrix.f(fArr, m());
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void destroy() {
        this.g = null;
        this.h = null;
        this.j = true;
        boolean z = this.m;
        AndroidComposeView androidComposeView = this.f;
        if (z) {
            this.m = false;
            androidComposeView.S(this, false);
        }
        GraphicsContext graphicsContext = this.e;
        if (graphicsContext != null) {
            graphicsContext.b(this.d);
            androidComposeView.X(this);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final long e(long j, boolean z) {
        float[] fArrM;
        if (z) {
            fArrM = l();
            if (fArrM == null) {
                return 9187343241974906880L;
            }
        } else {
            fArrM = m();
        }
        return this.v ? j : Matrix.b(fArrM, j);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void f(long j) {
        if (IntSize.b(j, this.i)) {
            return;
        }
        this.i = j;
        if (this.m || this.j) {
            return;
        }
        AndroidComposeView androidComposeView = this.f;
        androidComposeView.invalidate();
        if (true != this.m) {
            this.m = true;
            androidComposeView.S(this, true);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final boolean g(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        GraphicsLayer graphicsLayer = this.d;
        if (graphicsLayer.w) {
            return ShapeContainingUtilKt.a(graphicsLayer.d(), fIntBitsToFloat, fIntBitsToFloat2);
        }
        return true;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: getUnderlyingMatrix-sQKQjiQ */
    public final float[] mo2getUnderlyingMatrixsQKQjiQ() {
        return m();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void h(ReusableGraphicsLayerScope reusableGraphicsLayerScope) {
        View view;
        ViewParent parent;
        Function0 function0;
        Function0 function02;
        int i = reusableGraphicsLayerScope.d | this.q;
        this.o = reusableGraphicsLayerScope.v;
        this.n = reusableGraphicsLayerScope.u;
        int i2 = i & 4096;
        if (i2 != 0) {
            this.r = reusableGraphicsLayerScope.q;
        }
        if ((i & 1) != 0) {
            GraphicsLayer graphicsLayer = this.d;
            float f = reusableGraphicsLayerScope.e;
            GraphicsLayerImpl graphicsLayerImpl = graphicsLayer.f1805a;
            if (graphicsLayerImpl.getP() != f) {
                graphicsLayerImpl.j(f);
            }
        }
        if ((i & 2) != 0) {
            GraphicsLayer graphicsLayer2 = this.d;
            float f2 = reusableGraphicsLayerScope.f;
            GraphicsLayerImpl graphicsLayerImpl2 = graphicsLayer2.f1805a;
            if (graphicsLayerImpl2.getQ() != f2) {
                graphicsLayerImpl2.l(f2);
            }
        }
        if ((i & 4) != 0) {
            this.d.f(reusableGraphicsLayerScope.g);
        }
        if ((i & 8) != 0) {
            GraphicsLayer graphicsLayer3 = this.d;
            float f3 = reusableGraphicsLayerScope.h;
            GraphicsLayerImpl graphicsLayerImpl3 = graphicsLayer3.f1805a;
            if (graphicsLayerImpl3.getR() != f3) {
                graphicsLayerImpl3.m(f3);
            }
        }
        if ((i & 16) != 0) {
            GraphicsLayer graphicsLayer4 = this.d;
            float f4 = reusableGraphicsLayerScope.i;
            GraphicsLayerImpl graphicsLayerImpl4 = graphicsLayer4.f1805a;
            if (graphicsLayerImpl4.getS() != f4) {
                graphicsLayerImpl4.c(f4);
            }
        }
        boolean z = true;
        if ((i & 32) != 0) {
            GraphicsLayer graphicsLayer5 = this.d;
            float f5 = reusableGraphicsLayerScope.j;
            GraphicsLayerImpl graphicsLayerImpl5 = graphicsLayer5.f1805a;
            if (graphicsLayerImpl5.getT() != f5) {
                graphicsLayerImpl5.A(f5);
                graphicsLayer5.g = true;
                graphicsLayer5.a();
            }
            if (reusableGraphicsLayerScope.j > BitmapDescriptorFactory.HUE_RED && !this.w && (function02 = this.h) != null) {
                function02.invoke();
            }
        }
        if ((i & 64) != 0) {
            GraphicsLayer graphicsLayer6 = this.d;
            long j = reusableGraphicsLayerScope.k;
            GraphicsLayerImpl graphicsLayerImpl6 = graphicsLayer6.f1805a;
            if (!Color.c(j, graphicsLayerImpl6.getU())) {
                graphicsLayerImpl6.K(j);
            }
        }
        if ((i & 128) != 0) {
            GraphicsLayer graphicsLayer7 = this.d;
            long j2 = reusableGraphicsLayerScope.l;
            GraphicsLayerImpl graphicsLayerImpl7 = graphicsLayer7.f1805a;
            if (!Color.c(j2, graphicsLayerImpl7.getV())) {
                graphicsLayerImpl7.L(j2);
            }
        }
        if ((i & 1024) != 0) {
            GraphicsLayer graphicsLayer8 = this.d;
            float f6 = reusableGraphicsLayerScope.o;
            GraphicsLayerImpl graphicsLayerImpl8 = graphicsLayer8.f1805a;
            if (graphicsLayerImpl8.getY() != f6) {
                graphicsLayerImpl8.g(f6);
            }
        }
        if ((i & 256) != 0) {
            GraphicsLayer graphicsLayer9 = this.d;
            float f7 = reusableGraphicsLayerScope.m;
            GraphicsLayerImpl graphicsLayerImpl9 = graphicsLayer9.f1805a;
            if (graphicsLayerImpl9.getW() != f7) {
                graphicsLayerImpl9.e(f7);
            }
        }
        if ((i & 512) != 0) {
            GraphicsLayer graphicsLayer10 = this.d;
            float f8 = reusableGraphicsLayerScope.n;
            GraphicsLayerImpl graphicsLayerImpl10 = graphicsLayer10.f1805a;
            if (graphicsLayerImpl10.getX() != f8) {
                graphicsLayerImpl10.f(f8);
            }
        }
        if ((i & 2048) != 0) {
            GraphicsLayer graphicsLayer11 = this.d;
            float f9 = reusableGraphicsLayerScope.p;
            GraphicsLayerImpl graphicsLayerImpl11 = graphicsLayer11.f1805a;
            if (graphicsLayerImpl11.getT() != f9) {
                graphicsLayerImpl11.d(f9);
            }
        }
        if (i2 != 0) {
            if (TransformOrigin.a(this.r, TransformOrigin.b)) {
                GraphicsLayer graphicsLayer12 = this.d;
                if (!Offset.c(graphicsLayer12.v, 9205357640488583168L)) {
                    graphicsLayer12.v = 9205357640488583168L;
                    graphicsLayer12.f1805a.I(9205357640488583168L);
                }
            } else {
                GraphicsLayer graphicsLayer13 = this.d;
                float fB = TransformOrigin.b(this.r) * ((int) (this.i >> 32));
                long jFloatToRawIntBits = (Float.floatToRawIntBits(TransformOrigin.c(this.r) * ((int) (this.i & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(fB) << 32);
                if (!Offset.c(graphicsLayer13.v, jFloatToRawIntBits)) {
                    graphicsLayer13.v = jFloatToRawIntBits;
                    graphicsLayer13.f1805a.I(jFloatToRawIntBits);
                }
            }
        }
        if ((i & 16384) != 0) {
            GraphicsLayer graphicsLayer14 = this.d;
            boolean z2 = reusableGraphicsLayerScope.s;
            if (graphicsLayer14.w != z2) {
                graphicsLayer14.w = z2;
                graphicsLayer14.g = true;
                graphicsLayer14.a();
            }
        }
        if ((131072 & i) != 0) {
            GraphicsLayer graphicsLayer15 = this.d;
            RenderEffect renderEffect = reusableGraphicsLayerScope.w;
            GraphicsLayerImpl graphicsLayerImpl12 = graphicsLayer15.f1805a;
            if (!Intrinsics.c(graphicsLayerImpl12.getZ(), renderEffect)) {
                graphicsLayerImpl12.k(renderEffect);
            }
        }
        if ((32768 & i) != 0) {
            GraphicsLayerImpl graphicsLayerImpl13 = this.d.f1805a;
            if (graphicsLayerImpl13.getN() != 0) {
                graphicsLayerImpl13.M(0);
            }
        }
        if ((i & 7963) != 0) {
            this.t = true;
            this.u = true;
        }
        if (Intrinsics.c(this.s, reusableGraphicsLayerScope.x)) {
            z = false;
        } else {
            Outline outline = reusableGraphicsLayerScope.x;
            this.s = outline;
            if (outline != null) {
                GraphicsLayer graphicsLayer16 = this.d;
                if (outline instanceof Outline.Rectangle) {
                    Rect rect = ((Outline.Rectangle) outline).f1775a;
                    float f10 = rect.f1752a;
                    float f11 = rect.b;
                    graphicsLayer16.g((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L), BitmapDescriptorFactory.HUE_RED, (Float.floatToRawIntBits(rect.c - rect.f1752a) << 32) | (Float.floatToRawIntBits(rect.d - f11) & 4294967295L));
                } else if (outline instanceof Outline.Generic) {
                    Path path = ((Outline.Generic) outline).f1774a;
                    graphicsLayer16.k = null;
                    graphicsLayer16.i = 9205357640488583168L;
                    graphicsLayer16.h = 0L;
                    graphicsLayer16.j = BitmapDescriptorFactory.HUE_RED;
                    graphicsLayer16.g = true;
                    graphicsLayer16.n = false;
                    graphicsLayer16.l = path;
                    graphicsLayer16.a();
                } else if (outline instanceof Outline.Rounded) {
                    Outline.Rounded rounded = (Outline.Rounded) outline;
                    AndroidPath androidPath = rounded.b;
                    if (androidPath != null) {
                        graphicsLayer16.k = null;
                        graphicsLayer16.i = 9205357640488583168L;
                        graphicsLayer16.h = 0L;
                        graphicsLayer16.j = BitmapDescriptorFactory.HUE_RED;
                        graphicsLayer16.g = true;
                        graphicsLayer16.n = false;
                        graphicsLayer16.l = androidPath;
                        graphicsLayer16.a();
                    } else {
                        RoundRect roundRect = rounded.f1776a;
                        float fB2 = roundRect.b();
                        float fA = roundRect.a();
                        graphicsLayer16.g((Float.floatToRawIntBits(roundRect.f1753a) << 32) | (Float.floatToRawIntBits(roundRect.b) & 4294967295L), Float.intBitsToFloat((int) (roundRect.h >> 32)), (Float.floatToRawIntBits(fB2) << 32) | (Float.floatToRawIntBits(fA) & 4294967295L));
                    }
                }
                if ((outline instanceof Outline.Generic) && Build.VERSION.SDK_INT < 33 && (function0 = this.h) != null) {
                    function0.invoke();
                }
            }
        }
        this.q = reusableGraphicsLayerScope.d;
        if ((i != 0 || z) && (parent = (view = this.f).getParent()) != null) {
            parent.onDescendantInvalidated(view, view);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void i(float[] fArr) {
        float[] fArrL = l();
        if (fArrL != null) {
            Matrix.f(fArr, fArrL);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void invalidate() {
        if (this.m || this.j) {
            return;
        }
        AndroidComposeView androidComposeView = this.f;
        androidComposeView.invalidate();
        if (true != this.m) {
            this.m = true;
            androidComposeView.S(this, true);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void j(long j) {
        GraphicsLayer graphicsLayer = this.d;
        if (!IntOffset.b(graphicsLayer.t, j)) {
            graphicsLayer.t = j;
            graphicsLayer.f1805a.C((int) (j >> 32), (int) (j & 4294967295L), graphicsLayer.u);
        }
        View view = this.f;
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(view, view);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void k() {
        if (this.m) {
            if (!TransformOrigin.a(this.r, TransformOrigin.b) && !IntSize.b(this.d.u, this.i)) {
                GraphicsLayer graphicsLayer = this.d;
                float fB = TransformOrigin.b(this.r) * ((int) (this.i >> 32));
                float fC = TransformOrigin.c(this.r) * ((int) (this.i & 4294967295L));
                long jFloatToRawIntBits = (Float.floatToRawIntBits(fC) & 4294967295L) | (Float.floatToRawIntBits(fB) << 32);
                if (!Offset.c(graphicsLayer.v, jFloatToRawIntBits)) {
                    graphicsLayer.v = jFloatToRawIntBits;
                    graphicsLayer.f1805a.I(jFloatToRawIntBits);
                }
            }
            this.d.e(this.n, this.o, this.i, this.x);
            if (this.m) {
                this.m = false;
                this.f.S(this, false);
            }
        }
    }

    public final float[] l() {
        float[] fArrA = this.l;
        if (fArrA == null) {
            fArrA = Matrix.a();
            this.l = fArrA;
        }
        if (this.u) {
            this.u = false;
            float[] fArrM = m();
            if (this.v) {
                return fArrM;
            }
            if (!InvertMatrixKt.a(fArrM, fArrA)) {
                fArrA[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrA[0])) {
            return null;
        }
        return fArrA;
    }

    public final float[] m() {
        boolean z = this.t;
        float[] fArr = this.k;
        if (z) {
            GraphicsLayer graphicsLayer = this.d;
            long jB = graphicsLayer.v;
            GraphicsLayerImpl graphicsLayerImpl = graphicsLayer.f1805a;
            if ((9223372034707292159L & jB) == 9205357640488583168L) {
                jB = SizeKt.b(IntSizeKt.d(this.i));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jB >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jB & 4294967295L));
            float l = graphicsLayerImpl.getR();
            float m = graphicsLayerImpl.getS();
            float q = graphicsLayerImpl.getW();
            float r = graphicsLayerImpl.getX();
            float s = graphicsLayerImpl.getY();
            float j = graphicsLayerImpl.getP();
            float k = graphicsLayerImpl.getQ();
            double d = q * 0.017453292519943295d;
            float fSin = (float) Math.sin(d);
            float fCos = (float) Math.cos(d);
            float f = -fSin;
            float f2 = (m * fCos) - (1.0f * fSin);
            float f3 = (1.0f * fCos) + (m * fSin);
            double d2 = r * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d2);
            float fCos2 = (float) Math.cos(d2);
            float f4 = -fSin2;
            float f5 = fSin * fSin2;
            float f6 = fSin * fCos2;
            float f7 = fCos * fSin2;
            float f8 = fCos * fCos2;
            float f9 = (f3 * fSin2) + (l * fCos2);
            float f10 = (f3 * fCos2) + ((-l) * fSin2);
            double d3 = s * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d3);
            float fCos3 = (float) Math.cos(d3);
            float f11 = -fSin3;
            float f12 = (fCos3 * f5) + (f11 * fCos2);
            float f13 = ((f5 * fSin3) + (fCos2 * fCos3)) * j;
            float f14 = fSin3 * fCos * j;
            float f15 = ((fSin3 * f6) + (fCos3 * f4)) * j;
            float f16 = f12 * k;
            float f17 = fCos * fCos3 * k;
            float f18 = ((fCos3 * f6) + (f11 * f4)) * k;
            float f19 = f7 * 1.0f;
            float f20 = f * 1.0f;
            float f21 = f8 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f13;
                fArr[1] = f14;
                fArr[2] = f15;
                fArr[3] = 0.0f;
                fArr[4] = f16;
                fArr[5] = f17;
                fArr[6] = f18;
                fArr[7] = 0.0f;
                fArr[8] = f19;
                fArr[9] = f20;
                fArr[10] = f21;
                fArr[11] = 0.0f;
                float f22 = -fIntBitsToFloat;
                fArr[12] = ((f13 * f22) - (fIntBitsToFloat2 * f16)) + f9 + fIntBitsToFloat;
                fArr[13] = ((f14 * f22) - (fIntBitsToFloat2 * f17)) + f2 + fIntBitsToFloat2;
                fArr[14] = ((f22 * f15) - (fIntBitsToFloat2 * f18)) + f10;
                fArr[15] = 1.0f;
            }
            this.t = false;
            this.v = MatrixKt.a(fArr);
        }
        return fArr;
    }
}
