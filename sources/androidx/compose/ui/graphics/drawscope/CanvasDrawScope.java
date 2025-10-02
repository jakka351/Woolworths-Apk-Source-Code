package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "DrawParams", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class CanvasDrawScope implements DrawScope {
    public final DrawParams d;
    public final CanvasDrawScope$drawContext$1 e;
    public AndroidPaint f;
    public AndroidPaint g;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @PublishedApi
    public static final /* data */ class DrawParams {

        /* renamed from: a, reason: collision with root package name */
        public Density f1797a;
        public LayoutDirection b;
        public Canvas c;
        public long d;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DrawParams)) {
                return false;
            }
            DrawParams drawParams = (DrawParams) obj;
            return Intrinsics.c(this.f1797a, drawParams.f1797a) && this.b == drawParams.b && Intrinsics.c(this.c, drawParams.c) && Size.a(this.d, drawParams.d);
        }

        public final int hashCode() {
            return Long.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.f1797a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "DrawParams(density=" + this.f1797a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + ((Object) Size.g(this.d)) + ')';
        }
    }

    public CanvasDrawScope() {
        Density density = DrawContextKt.f1800a;
        LayoutDirection layoutDirection = LayoutDirection.d;
        DrawParams drawParams = new DrawParams();
        drawParams.f1797a = density;
        drawParams.b = layoutDirection;
        drawParams.c = EmptyCanvas.f1801a;
        drawParams.d = 0L;
        this.d = drawParams;
        this.e = new CanvasDrawScope$drawContext$1(this);
    }

    public static Paint i(CanvasDrawScope canvasDrawScope, long j, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i) {
        Paint paintQ = canvasDrawScope.q(drawStyle);
        if (f != 1.0f) {
            j = Color.b(j, Color.d(j) * f);
        }
        AndroidPaint androidPaint = (AndroidPaint) paintQ;
        if (!Color.c(androidPaint.c(), j)) {
            androidPaint.d(j);
        }
        if (androidPaint.c != null) {
            androidPaint.g(null);
        }
        if (!Intrinsics.c(androidPaint.d, colorFilter)) {
            androidPaint.k(colorFilter);
        }
        if (androidPaint.b != i) {
            androidPaint.j(i);
        }
        if (androidPaint.f1759a.isFilterBitmap()) {
            return paintQ;
        }
        androidPaint.l(1);
        return paintQ;
    }

    public static Paint o(CanvasDrawScope canvasDrawScope, long j, float f, int i, PathEffect pathEffect, int i2) {
        AndroidPaint androidPaintA = canvasDrawScope.g;
        if (androidPaintA == null) {
            androidPaintA = AndroidPaint_androidKt.a();
            androidPaintA.r(1);
            canvasDrawScope.g = androidPaintA;
        }
        android.graphics.Paint paint = androidPaintA.f1759a;
        if (!Color.c(androidPaintA.c(), j)) {
            androidPaintA.d(j);
        }
        if (androidPaintA.c != null) {
            androidPaintA.g(null);
        }
        if (!Intrinsics.c(androidPaintA.d, null)) {
            androidPaintA.k(null);
        }
        if (androidPaintA.b != i2) {
            androidPaintA.j(i2);
        }
        if (paint.getStrokeWidth() != f) {
            androidPaintA.q(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            androidPaintA.p(4.0f);
        }
        if (androidPaintA.h() != i) {
            androidPaintA.n(i);
        }
        if (androidPaintA.i() != 0) {
            androidPaintA.o(0);
        }
        if (!Intrinsics.c(androidPaintA.e, pathEffect)) {
            androidPaintA.m(pathEffect);
        }
        if (paint.isFilterBitmap()) {
            return androidPaintA;
        }
        androidPaintA.l(1);
        return androidPaintA;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void D1(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.d.c.k(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3), i(this, j, drawStyle, f, colorFilter, i));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: I0, reason: from getter */
    public final CanvasDrawScope$drawContext$1 getE() {
        return this.e;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void N1(ShaderBrush shaderBrush, float f, float f2, boolean z, long j, long j2, DrawStyle drawStyle) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        this.d.c.e(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, z, n(shaderBrush, drawStyle, 1.0f, null, 3, 1));
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: Q1 */
    public final float getE() {
        return this.d.f1797a.getE();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void R1(long j, float f, float f2, long j2, long j3, float f3, DrawStyle drawStyle) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.d.c.e(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, false, i(this, j, drawStyle, f3, null, 3));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void V1(long j, long j2, long j3, long j4, DrawStyle drawStyle, float f) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.d.c.t(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), i(this, j, drawStyle, f, null, 3));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void W(long j, float f, long j2, DrawStyle drawStyle, int i) {
        this.d.c.i(f, j2, i(this, j, drawStyle, 1.0f, null, i));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void X1(ArrayList arrayList, long j, float f) {
        this.d.c.o(arrayList, o(this, j, f, 1, null, 3));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void a2(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2) {
        this.d.c.a(imageBitmap, j, j2, j3, j4, n(null, drawStyle, f, colorFilter, i, i2));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void b1(long j, long j2, long j3, float f, int i, PathEffect pathEffect, int i2) {
        this.d.c.p(j2, j3, o(this, j, f, i, pathEffect, i2));
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: getDensity */
    public final float getD() {
        return this.d.f1797a.getD();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final LayoutDirection getLayoutDirection() {
        return this.d.b;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void l0(Path path, long j, float f, DrawStyle drawStyle) {
        this.d.c.s(path, i(this, j, drawStyle, f, null, 3));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void m1(Brush brush, long j, long j2, float f, int i, float f2) {
        Canvas canvas = this.d.c;
        AndroidPaint androidPaintA = this.g;
        if (androidPaintA == null) {
            androidPaintA = AndroidPaint_androidKt.a();
            androidPaintA.r(1);
            this.g = androidPaintA;
        }
        android.graphics.Paint paint = androidPaintA.f1759a;
        if (brush != null) {
            brush.a(f2, h(), androidPaintA);
        } else if (androidPaintA.a() != f2) {
            androidPaintA.b(f2);
        }
        if (!Intrinsics.c(androidPaintA.d, null)) {
            androidPaintA.k(null);
        }
        if (androidPaintA.b != 3) {
            androidPaintA.j(3);
        }
        if (paint.getStrokeWidth() != f) {
            androidPaintA.q(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            androidPaintA.p(4.0f);
        }
        if (androidPaintA.h() != i) {
            androidPaintA.n(i);
        }
        if (androidPaintA.i() != 0) {
            androidPaintA.o(0);
        }
        if (!Intrinsics.c(androidPaintA.e, null)) {
            androidPaintA.m(null);
        }
        if (!paint.isFilterBitmap()) {
            androidPaintA.l(1);
        }
        canvas.p(j, j2, androidPaintA);
    }

    public final Paint n(Brush brush, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i, int i2) {
        Paint paintQ = q(drawStyle);
        if (brush != null) {
            brush.a(f, h(), paintQ);
        } else {
            AndroidPaint androidPaint = (AndroidPaint) paintQ;
            if (androidPaint.c != null) {
                androidPaint.g(null);
            }
            long jC = androidPaint.c();
            long j = Color.b;
            if (!Color.c(jC, j)) {
                androidPaint.d(j);
            }
            if (androidPaint.a() != f) {
                androidPaint.b(f);
            }
        }
        AndroidPaint androidPaint2 = (AndroidPaint) paintQ;
        if (!Intrinsics.c(androidPaint2.d, colorFilter)) {
            androidPaint2.k(colorFilter);
        }
        if (androidPaint2.b != i) {
            androidPaint2.j(i);
        }
        if (androidPaint2.f1759a.isFilterBitmap() == i2) {
            return paintQ;
        }
        androidPaint2.l(i2);
        return paintQ;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void o0(ImageBitmap imageBitmap, ColorFilter colorFilter) {
        this.d.c.d(imageBitmap, n(null, Fill.f1802a, 1.0f, colorFilter, 3, 1));
    }

    public final Paint q(DrawStyle drawStyle) {
        if (Intrinsics.c(drawStyle, Fill.f1802a)) {
            AndroidPaint androidPaint = this.f;
            if (androidPaint != null) {
                return androidPaint;
            }
            AndroidPaint androidPaintA = AndroidPaint_androidKt.a();
            androidPaintA.r(0);
            this.f = androidPaintA;
            return androidPaintA;
        }
        if (!(drawStyle instanceof Stroke)) {
            throw new NoWhenBranchMatchedException();
        }
        AndroidPaint androidPaintA2 = this.g;
        if (androidPaintA2 == null) {
            androidPaintA2 = AndroidPaint_androidKt.a();
            androidPaintA2.r(1);
            this.g = androidPaintA2;
        }
        android.graphics.Paint paint = androidPaintA2.f1759a;
        float strokeWidth = paint.getStrokeWidth();
        Stroke stroke = (Stroke) drawStyle;
        PathEffect pathEffect = stroke.e;
        float f = stroke.f1803a;
        if (strokeWidth != f) {
            androidPaintA2.q(f);
        }
        int iH = androidPaintA2.h();
        int i = stroke.c;
        if (iH != i) {
            androidPaintA2.n(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = stroke.b;
        if (strokeMiter != f2) {
            androidPaintA2.p(f2);
        }
        int i2 = androidPaintA2.i();
        int i3 = stroke.d;
        if (i2 != i3) {
            androidPaintA2.o(i3);
        }
        if (!Intrinsics.c(androidPaintA2.e, pathEffect)) {
            androidPaintA2.m(pathEffect);
        }
        return androidPaintA2;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void q0(Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        this.d.c.k(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (4294967295L & j2)) + Float.intBitsToFloat(i2), n(brush, drawStyle, f, colorFilter, 3, 1));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void q1(Path path, Brush brush, float f, DrawStyle drawStyle, int i) {
        this.d.c.s(path, n(brush, drawStyle, f, null, i, 1));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void u1(Brush brush, long j, long j2, long j3, float f, DrawStyle drawStyle) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        this.d.c.t(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), n(brush, drawStyle, f, null, 3, 1));
    }
}
