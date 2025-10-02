package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/painter/Painter;", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class Painter {
    public AndroidPaint d;
    public boolean e;
    public ColorFilter f;
    public float g = 1.0f;
    public LayoutDirection h = LayoutDirection.d;

    public boolean a(float f) {
        return false;
    }

    public boolean b(ColorFilter colorFilter) {
        return false;
    }

    public void d(LayoutDirection layoutDirection) {
    }

    public final void e(DrawScope drawScope, long j, float f, ColorFilter colorFilter) {
        if (this.g != f) {
            if (!a(f)) {
                if (f == 1.0f) {
                    AndroidPaint androidPaint = this.d;
                    if (androidPaint != null) {
                        androidPaint.b(f);
                    }
                    this.e = false;
                } else {
                    AndroidPaint androidPaintA = this.d;
                    if (androidPaintA == null) {
                        androidPaintA = AndroidPaint_androidKt.a();
                        this.d = androidPaintA;
                    }
                    androidPaintA.b(f);
                    this.e = true;
                }
            }
            this.g = f;
        }
        if (!Intrinsics.c(this.f, colorFilter)) {
            if (!b(colorFilter)) {
                if (colorFilter == null) {
                    AndroidPaint androidPaint2 = this.d;
                    if (androidPaint2 != null) {
                        androidPaint2.k(null);
                    }
                    this.e = false;
                } else {
                    AndroidPaint androidPaintA2 = this.d;
                    if (androidPaintA2 == null) {
                        androidPaintA2 = AndroidPaint_androidKt.a();
                        this.d = androidPaintA2;
                    }
                    androidPaintA2.k(colorFilter);
                    this.e = true;
                }
            }
            this.f = colorFilter;
        }
        LayoutDirection layoutDirection = drawScope.getLayoutDirection();
        if (this.h != layoutDirection) {
            d(layoutDirection);
            this.h = layoutDirection;
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.h() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.h() & 4294967295L)) - Float.intBitsToFloat(i2);
        drawScope.getE().f1798a.c(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, fIntBitsToFloat, fIntBitsToFloat2);
        if (f > BitmapDescriptorFactory.HUE_RED) {
            try {
                if (Float.intBitsToFloat(i) > BitmapDescriptorFactory.HUE_RED && Float.intBitsToFloat(i2) > BitmapDescriptorFactory.HUE_RED) {
                    if (this.e) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i);
                        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
                        Rect rectA = RectKt.a(0L, (Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32));
                        Canvas canvasA = drawScope.getE().a();
                        AndroidPaint androidPaintA3 = this.d;
                        if (androidPaintA3 == null) {
                            androidPaintA3 = AndroidPaint_androidKt.a();
                            this.d = androidPaintA3;
                        }
                        try {
                            canvasA.f(rectA, androidPaintA3);
                            h(drawScope);
                            canvasA.m();
                        } catch (Throwable th) {
                            canvasA.m();
                            throw th;
                        }
                    } else {
                        h(drawScope);
                    }
                }
            } catch (Throwable th2) {
                drawScope.getE().f1798a.c(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
                throw th2;
            }
        }
        drawScope.getE().f1798a.c(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
    }

    public abstract long f();

    public abstract void h(DrawScope drawScope);
}
