package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.RestrictTo;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes6.dex */
public class ShapeAppearancePathProvider {

    /* renamed from: a, reason: collision with root package name */
    public final ShapePath[] f14638a = new ShapePath[4];
    public final Matrix[] b = new Matrix[4];
    public final Matrix[] c = new Matrix[4];
    public final PointF d = new PointF();
    public final Path e = new Path();
    public final Path f = new Path();
    public final ShapePath g = new ShapePath();
    public final float[] h = new float[2];
    public final float[] i = new float[2];
    public final Path j = new Path();
    public final Path k = new Path();
    public final boolean l = true;

    public static class Lazy {

        /* renamed from: a, reason: collision with root package name */
        public static final ShapeAppearancePathProvider f14639a = new ShapeAppearancePathProvider();
    }

    @RestrictTo
    public interface PathListener {
        void a(ShapePath shapePath, Matrix matrix, int i);

        void b(ShapePath shapePath, Matrix matrix, int i);
    }

    public static final class ShapeAppearancePathSpec {
    }

    public ShapeAppearancePathProvider() {
        for (int i = 0; i < 4; i++) {
            this.f14638a[i] = new ShapePath();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    public static ShapeAppearancePathProvider b() {
        return Lazy.f14639a;
    }

    public final void a(ShapeAppearanceModel shapeAppearanceModel, float f, RectF rectF, PathListener pathListener, Path path) {
        Matrix[] matrixArr;
        float[] fArr;
        int i;
        ShapePath[] shapePathArr;
        Matrix[] matrixArr2;
        int i2;
        path.rewind();
        Path path2 = this.e;
        path2.rewind();
        Path path3 = this.f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            matrixArr = this.c;
            fArr = this.h;
            shapePathArr = this.f14638a;
            matrixArr2 = this.b;
            if (i3 >= 4) {
                break;
            }
            CornerSize cornerSize = i3 != 1 ? i3 != 2 ? i3 != 3 ? shapeAppearanceModel.f : shapeAppearanceModel.e : shapeAppearanceModel.h : shapeAppearanceModel.g;
            CornerTreatment cornerTreatment = i3 != 1 ? i3 != 2 ? i3 != 3 ? shapeAppearanceModel.b : shapeAppearanceModel.f14636a : shapeAppearanceModel.d : shapeAppearanceModel.c;
            ShapePath shapePath = shapePathArr[i3];
            cornerTreatment.getClass();
            cornerTreatment.a(shapePath, f, cornerSize.a(rectF));
            int i4 = i3 + 1;
            float f2 = (i4 % 4) * 90;
            matrixArr2[i3].reset();
            PointF pointF = this.d;
            if (i3 == 1) {
                i2 = i3;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i3 == 2) {
                i2 = i3;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i3 != 3) {
                i2 = i3;
                pointF.set(rectF.right, rectF.top);
            } else {
                i2 = i3;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f2);
            ShapePath shapePath2 = shapePathArr[i2];
            fArr[0] = shapePath2.c;
            fArr[1] = shapePath2.d;
            matrixArr2[i2].mapPoints(fArr);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr[0], fArr[1]);
            matrixArr[i2].preRotate(f2);
            i3 = i4;
        }
        char c = 1;
        int i5 = 0;
        for (i = 4; i5 < i; i = 4) {
            ShapePath shapePath3 = shapePathArr[i5];
            fArr[0] = shapePath3.f14640a;
            fArr[c] = shapePath3.b;
            matrixArr2[i5].mapPoints(fArr);
            if (i5 == 0) {
                path.moveTo(fArr[0], fArr[c]);
            } else {
                path.lineTo(fArr[0], fArr[c]);
            }
            shapePathArr[i5].c(matrixArr2[i5], path);
            if (pathListener != null) {
                pathListener.a(shapePathArr[i5], matrixArr2[i5], i5);
            }
            int i6 = i5 + 1;
            int i7 = i6 % 4;
            ShapePath shapePath4 = shapePathArr[i5];
            fArr[0] = shapePath4.c;
            fArr[1] = shapePath4.d;
            matrixArr2[i5].mapPoints(fArr);
            ShapePath shapePath5 = shapePathArr[i7];
            float f3 = shapePath5.f14640a;
            float[] fArr2 = this.i;
            fArr2[0] = f3;
            fArr2[1] = shapePath5.b;
            matrixArr2[i7].mapPoints(fArr2);
            Matrix[] matrixArr3 = matrixArr;
            double d = fArr[0] - fArr2[0];
            float f4 = fArr[1] - fArr2[1];
            ShapePath[] shapePathArr2 = shapePathArr;
            float fMax = Math.max(((float) Math.hypot(d, f4)) - 0.001f, BitmapDescriptorFactory.HUE_RED);
            ShapePath shapePath6 = shapePathArr2[i5];
            fArr[0] = shapePath6.c;
            fArr[1] = shapePath6.d;
            matrixArr2[i5].mapPoints(fArr);
            float fAbs = (i5 == 1 || i5 == 3) ? Math.abs(rectF.centerX() - fArr[0]) : Math.abs(rectF.centerY() - fArr[1]);
            ShapePath shapePath7 = this.g;
            shapePath7.f(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 270.0f, BitmapDescriptorFactory.HUE_RED);
            EdgeTreatment edgeTreatment = i5 != 1 ? i5 != 2 ? i5 != 3 ? shapeAppearanceModel.j : shapeAppearanceModel.i : shapeAppearanceModel.l : shapeAppearanceModel.k;
            edgeTreatment.b(fMax, fAbs, f, shapePath7);
            Path path4 = this.j;
            path4.reset();
            shapePath7.c(matrixArr3[i5], path4);
            if (this.l && (edgeTreatment.a() || c(path4, i5) || c(path4, i7))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = shapePath7.f14640a;
                c = 1;
                fArr[1] = shapePath7.b;
                matrixArr3[i5].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                shapePath7.c(matrixArr3[i5], path2);
            } else {
                c = 1;
                shapePath7.c(matrixArr3[i5], path);
            }
            if (pathListener != null) {
                pathListener.b(shapePath7, matrixArr3[i5], i5);
            }
            shapePathArr = shapePathArr2;
            i5 = i6;
            matrixArr = matrixArr3;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public final boolean c(Path path, int i) {
        Path path2 = this.k;
        path2.reset();
        this.f14638a[i].c(this.b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
