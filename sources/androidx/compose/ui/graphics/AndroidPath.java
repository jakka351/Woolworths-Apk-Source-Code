package androidx.compose.ui.graphics;

import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/AndroidPath;", "Landroidx/compose/ui/graphics/Path;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AndroidPath implements Path {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Path f1761a;
    public RectF b;
    public float[] c;
    public android.graphics.Matrix d;

    public AndroidPath(android.graphics.Path path) {
        this.f1761a = path;
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void a(float f, float f2) {
        this.f1761a.moveTo(f, f2);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void b(float f, float f2) {
        this.f1761a.lineTo(f, f2);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void c(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f1761a.cubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void close() {
        this.f1761a.close();
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void d(float f, float f2) {
        this.f1761a.rMoveTo(f, f2);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void e(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f1761a.rCubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void f(float f, float f2, float f3, float f4) {
        this.f1761a.rQuadTo(f, f2, f3, f4);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void g(long j) {
        android.graphics.Matrix matrix = this.d;
        if (matrix == null) {
            this.d = new android.graphics.Matrix();
        } else {
            Intrinsics.e(matrix);
            matrix.reset();
        }
        android.graphics.Matrix matrix2 = this.d;
        Intrinsics.e(matrix2);
        matrix2.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        android.graphics.Matrix matrix3 = this.d;
        Intrinsics.e(matrix3);
        this.f1761a.transform(matrix3);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final Rect getBounds() {
        if (this.b == null) {
            this.b = new RectF();
        }
        RectF rectF = this.b;
        Intrinsics.e(rectF);
        this.f1761a.computeBounds(rectF, true);
        return new Rect(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void h(float f, float f2, float f3, float f4) {
        this.f1761a.rQuadTo(f, f2, f3, f4);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final int i() {
        return this.f1761a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void j(RoundRect roundRect) {
        Path.Direction[] directionArr = Path.Direction.d;
        if (this.b == null) {
            this.b = new RectF();
        }
        RectF rectF = this.b;
        Intrinsics.e(rectF);
        float f = roundRect.f1753a;
        long j = roundRect.h;
        long j2 = roundRect.g;
        long j3 = roundRect.f;
        long j4 = roundRect.e;
        rectF.set(f, roundRect.b, roundRect.c, roundRect.d);
        if (this.c == null) {
            this.c = new float[8];
        }
        float[] fArr = this.c;
        Intrinsics.e(fArr);
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        RectF rectF2 = this.b;
        Intrinsics.e(rectF2);
        float[] fArr2 = this.c;
        Intrinsics.e(fArr2);
        this.f1761a.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final boolean l() {
        return this.f1761a.isConvex();
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void m(float f, float f2, float f3, float f4) {
        this.f1761a.quadTo(f, f2, f3, f4);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void n(int i) {
        this.f1761a.setFillType(i == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void o() {
        this.f1761a.rewind();
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void p(float f, float f2, float f3, float f4) {
        this.f1761a.quadTo(f, f2, f3, f4);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void q(Rect rect) {
        Path.Direction[] directionArr = Path.Direction.d;
        float f = rect.f1752a;
        float f2 = rect.d;
        float f3 = rect.c;
        float f4 = rect.b;
        if (Float.isNaN(f) || Float.isNaN(f4) || Float.isNaN(f3) || Float.isNaN(f2)) {
            AndroidPath_androidKt.b("Invalid rectangle, make sure no value is NaN");
        }
        if (this.b == null) {
            this.b = new RectF();
        }
        RectF rectF = this.b;
        Intrinsics.e(rectF);
        rectF.set(rect.f1752a, f4, f3, f2);
        RectF rectF2 = this.b;
        Intrinsics.e(rectF2);
        this.f1761a.addRect(rectF2, Path.Direction.CCW);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void reset() {
        this.f1761a.reset();
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void s(float f, float f2) {
        this.f1761a.rLineTo(f, f2);
    }

    public final boolean t(Path path, Path path2, int i) {
        Path.Op op = PathOperation.a(i, 0) ? Path.Op.DIFFERENCE : PathOperation.a(i, 1) ? Path.Op.INTERSECT : PathOperation.a(i, 4) ? Path.Op.REVERSE_DIFFERENCE : PathOperation.a(i, 2) ? Path.Op.UNION : Path.Op.XOR;
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        android.graphics.Path path3 = ((AndroidPath) path).f1761a;
        if (path2 instanceof AndroidPath) {
            return this.f1761a.op(path3, ((AndroidPath) path2).f1761a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }
}
