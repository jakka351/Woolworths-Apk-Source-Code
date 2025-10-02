package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.InlineClassHelperKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class GraphicsLayerKt {
    public static final void a(DrawScope drawScope, GraphicsLayer graphicsLayer) {
        boolean z;
        boolean z2;
        Canvas canvas;
        boolean z3;
        float f;
        androidx.compose.ui.graphics.Canvas canvasA = drawScope.getE().a();
        GraphicsLayer graphicsLayer2 = drawScope.getE().b;
        GraphicsLayerImpl graphicsLayerImpl = graphicsLayer.f1805a;
        if (graphicsLayer.s) {
            return;
        }
        graphicsLayer.a();
        if (!graphicsLayerImpl.h()) {
            try {
                graphicsLayerImpl.y(graphicsLayer.b, graphicsLayer.c, graphicsLayer, graphicsLayer.e);
            } catch (Throwable unused) {
            }
        }
        boolean z4 = graphicsLayerImpl.getN() > BitmapDescriptorFactory.HUE_RED;
        if (z4) {
            canvasA.n();
        }
        Canvas canvasA2 = AndroidCanvas_androidKt.a(canvasA);
        boolean zIsHardwareAccelerated = canvasA2.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j = graphicsLayer.t;
            float f2 = (int) (j >> 32);
            float f3 = (int) (j & 4294967295L);
            long j2 = graphicsLayer.u;
            float f4 = ((int) (j2 >> 32)) + f2;
            float f5 = ((int) (j2 & 4294967295L)) + f3;
            float fA = graphicsLayerImpl.getH();
            int iG = graphicsLayerImpl.getI();
            if (fA < 1.0f || iG != 3 || graphicsLayerImpl.getY() == 1) {
                AndroidPaint androidPaintA = graphicsLayer.p;
                if (androidPaintA == null) {
                    androidPaintA = AndroidPaint_androidKt.a();
                    graphicsLayer.p = androidPaintA;
                }
                androidPaintA.b(fA);
                androidPaintA.j(iG);
                androidPaintA.k(null);
                canvasA2 = canvasA2;
                f = f2;
                canvasA2.saveLayer(f, f3, f4, f5, androidPaintA.f1759a);
            } else {
                canvasA2.save();
                canvasA2 = canvasA2;
                f = f2;
            }
            canvasA2.translate(f, f3);
            canvasA2.concat(graphicsLayerImpl.s());
        }
        boolean z5 = !zIsHardwareAccelerated && graphicsLayer.w;
        if (z5) {
            canvasA.save();
            Outline outlineD = graphicsLayer.d();
            if (outlineD instanceof Outline.Rectangle) {
                canvasA.h(((Outline.Rectangle) outlineD).f1775a);
            } else if (outlineD instanceof Outline.Rounded) {
                AndroidPath androidPathA = graphicsLayer.m;
                if (androidPathA != null) {
                    androidPathA.o();
                } else {
                    androidPathA = AndroidPath_androidKt.a();
                    graphicsLayer.m = androidPathA;
                }
                Path.k(androidPathA, ((Outline.Rounded) outlineD).f1776a);
                canvasA.l(androidPathA, 1);
            } else if (outlineD instanceof Outline.Generic) {
                canvasA.l(((Outline.Generic) outlineD).f1774a, 1);
            }
        }
        if (graphicsLayer2 != null) {
            ChildLayerDependenciesTracker childLayerDependenciesTracker = graphicsLayer2.r;
            if (!childLayerDependenciesTracker.e) {
                InlineClassHelperKt.a("Only add dependencies during a tracking");
            }
            MutableScatterSet mutableScatterSet = childLayerDependenciesTracker.c;
            if (mutableScatterSet != null) {
                mutableScatterSet.e(graphicsLayer);
            } else if (childLayerDependenciesTracker.f1804a != null) {
                int i = ScatterSetKt.f701a;
                MutableScatterSet mutableScatterSet2 = new MutableScatterSet();
                GraphicsLayer graphicsLayer3 = childLayerDependenciesTracker.f1804a;
                Intrinsics.e(graphicsLayer3);
                mutableScatterSet2.e(graphicsLayer3);
                mutableScatterSet2.e(graphicsLayer);
                childLayerDependenciesTracker.c = mutableScatterSet2;
                childLayerDependenciesTracker.f1804a = null;
            } else {
                childLayerDependenciesTracker.f1804a = graphicsLayer;
            }
            MutableScatterSet mutableScatterSet3 = childLayerDependenciesTracker.d;
            if (mutableScatterSet3 != null) {
                z3 = !mutableScatterSet3.n(graphicsLayer);
            } else if (childLayerDependenciesTracker.b != graphicsLayer) {
                z3 = true;
            } else {
                childLayerDependenciesTracker.b = null;
                z3 = false;
            }
            if (z3) {
                graphicsLayer.q++;
            }
        }
        if (AndroidCanvas_androidKt.a(canvasA).isHardwareAccelerated()) {
            z = z4;
            z2 = z5;
            canvas = canvasA2;
            graphicsLayerImpl.x(canvasA);
        } else {
            CanvasDrawScope canvasDrawScope = graphicsLayer.o;
            if (canvasDrawScope == null) {
                canvasDrawScope = new CanvasDrawScope();
                graphicsLayer.o = canvasDrawScope;
            }
            CanvasDrawScope$drawContext$1 canvasDrawScope$drawContext$1 = canvasDrawScope.e;
            Density density = graphicsLayer.b;
            LayoutDirection layoutDirection = graphicsLayer.c;
            long jD = IntSizeKt.d(graphicsLayer.u);
            Density densityB = canvasDrawScope$drawContext$1.b();
            LayoutDirection layoutDirectionC = canvasDrawScope$drawContext$1.c();
            androidx.compose.ui.graphics.Canvas canvasA3 = canvasDrawScope$drawContext$1.a();
            z2 = z5;
            canvas = canvasA2;
            long jD2 = canvasDrawScope$drawContext$1.d();
            z = z4;
            GraphicsLayer graphicsLayer4 = canvasDrawScope$drawContext$1.b;
            canvasDrawScope$drawContext$1.f(density);
            canvasDrawScope$drawContext$1.g(layoutDirection);
            canvasDrawScope$drawContext$1.e(canvasA);
            canvasDrawScope$drawContext$1.h(jD);
            canvasDrawScope$drawContext$1.b = graphicsLayer;
            canvasA.save();
            try {
                graphicsLayer.c(canvasDrawScope);
            } finally {
                canvasA.m();
                canvasDrawScope$drawContext$1.f(densityB);
                canvasDrawScope$drawContext$1.g(layoutDirectionC);
                canvasDrawScope$drawContext$1.e(canvasA3);
                canvasDrawScope$drawContext$1.h(jD2);
                canvasDrawScope$drawContext$1.b = graphicsLayer4;
            }
        }
        if (z2) {
            canvasA.m();
        }
        if (z) {
            canvasA.g();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvas.restore();
    }
}
