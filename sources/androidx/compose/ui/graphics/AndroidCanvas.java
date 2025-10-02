package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.ui.geometry.Offset;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/AndroidCanvas;", "Landroidx/compose/ui/graphics/Canvas;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@PublishedApi
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AndroidCanvas implements Canvas {

    /* renamed from: a, reason: collision with root package name */
    public android.graphics.Canvas f1755a = AndroidCanvas_androidKt.f1756a;
    public Rect b;
    public Rect c;

    @Override // androidx.compose.ui.graphics.Canvas
    public final void a(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, Paint paint) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        android.graphics.Canvas canvas = this.f1755a;
        Bitmap bitmapA = AndroidImageBitmap_androidKt.a(imageBitmap);
        Rect rect = this.b;
        Intrinsics.e(rect);
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.c;
        Intrinsics.e(rect2);
        int i3 = (int) (j3 >> 32);
        rect2.left = i3;
        int i4 = (int) (j3 & 4294967295L);
        rect2.top = i4;
        rect2.right = i3 + ((int) (j4 >> 32));
        rect2.bottom = i4 + ((int) (j4 & 4294967295L));
        canvas.drawBitmap(bitmapA, rect, rect2, paint.getF1759a());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void b(float f, float f2, float f3, float f4, int i) {
        this.f1755a.clipRect(f, f2, f3, f4, ClipOp.a(i) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void c(float f, float f2) {
        this.f1755a.translate(f, f2);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void d(ImageBitmap imageBitmap, Paint paint) {
        this.f1755a.drawBitmap(AndroidImageBitmap_androidKt.a(imageBitmap), Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0), paint.getF1759a());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void e(float f, float f2, float f3, float f4, float f5, float f6, boolean z, Paint paint) {
        this.f1755a.drawArc(f, f2, f3, f4, f5, f6, z, paint.getF1759a());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void f(androidx.compose.ui.geometry.Rect rect, Paint paint) {
        this.f1755a.saveLayer(rect.f1752a, rect.b, rect.c, rect.d, paint.getF1759a(), 31);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void g() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        CanvasUtils.a(this.f1755a, false);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void i(float f, long j, Paint paint) {
        this.f1755a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, paint.getF1759a());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void j(float f, float f2) {
        this.f1755a.scale(f, f2);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void k(float f, float f2, float f3, float f4, Paint paint) {
        this.f1755a.drawRect(f, f2, f3, f4, paint.getF1759a());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void l(Path path, int i) {
        android.graphics.Canvas canvas = this.f1755a;
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((AndroidPath) path).f1761a, ClipOp.a(i) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void m() {
        this.f1755a.restore();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void n() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        CanvasUtils.a(this.f1755a, true);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void o(ArrayList arrayList, Paint paint) {
        if (PointMode.a(1)) {
            u(arrayList, paint, 2);
            return;
        }
        if (PointMode.a(2)) {
            u(arrayList, paint, 1);
            return;
        }
        if (PointMode.a(0)) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                long j = ((Offset) arrayList.get(i)).f1751a;
                this.f1755a.drawPoint(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), paint.getF1759a());
            }
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void p(long j, long j2, Paint paint) {
        this.f1755a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), paint.getF1759a());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void q(float f) {
        this.f1755a.rotate(f);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void r(float[] fArr) {
        if (MatrixKt.a(fArr)) {
            return;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        AndroidMatrixConversions_androidKt.a(matrix, fArr);
        this.f1755a.concat(matrix);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void s(Path path, Paint paint) {
        android.graphics.Canvas canvas = this.f1755a;
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((AndroidPath) path).f1761a, paint.getF1759a());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void save() {
        this.f1755a.save();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void t(float f, float f2, float f3, float f4, float f5, float f6, Paint paint) {
        this.f1755a.drawRoundRect(f, f2, f3, f4, f5, f6, paint.getF1759a());
    }

    public final void u(ArrayList arrayList, Paint paint, int i) {
        if (arrayList.size() >= 2) {
            android.graphics.Paint f1759a = paint.getF1759a();
            int i2 = 0;
            while (i2 < arrayList.size() - 1) {
                long j = ((Offset) arrayList.get(i2)).f1751a;
                long j2 = ((Offset) arrayList.get(i2 + 1)).f1751a;
                this.f1755a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f1759a);
                i2 += i;
            }
        }
    }
}
