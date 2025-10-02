package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.shadow.ShadowRenderer;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class ShapePath {

    /* renamed from: a, reason: collision with root package name */
    public float f14640a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    /* renamed from: com.google.android.material.shape.ShapePath$1, reason: invalid class name */
    class AnonymousClass1 extends ShadowCompatOperation {
        public final /* synthetic */ ArrayList c;
        public final /* synthetic */ Matrix d;

        public AnonymousClass1(ArrayList arrayList, Matrix matrix) {
            this.c = arrayList;
            this.d = matrix;
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public final void a(Matrix matrix, ShadowRenderer shadowRenderer, int i, Canvas canvas) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((ShadowCompatOperation) it.next()).a(this.d, shadowRenderer, i, canvas);
            }
        }
    }

    public static class ArcShadowOperation extends ShadowCompatOperation {
        public final PathArcOperation c;

        public ArcShadowOperation(PathArcOperation pathArcOperation) {
            this.c = pathArcOperation;
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public final void a(Matrix matrix, ShadowRenderer shadowRenderer, int i, Canvas canvas) {
            PathArcOperation pathArcOperation = this.c;
            shadowRenderer.a(canvas, matrix, new RectF(pathArcOperation.b, pathArcOperation.c, pathArcOperation.d, pathArcOperation.e), i, pathArcOperation.f, pathArcOperation.g);
        }
    }

    public static class InnerCornerShadowOperation extends ShadowCompatOperation {
        public final PathLineOperation c;
        public final PathLineOperation d;
        public final float e;
        public final float f;

        public InnerCornerShadowOperation(PathLineOperation pathLineOperation, PathLineOperation pathLineOperation2, float f, float f2) {
            this.c = pathLineOperation;
            this.d = pathLineOperation2;
            this.e = f;
            this.f = f2;
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public final void a(Matrix matrix, ShadowRenderer shadowRenderer, int i, Canvas canvas) {
            float f;
            float f2;
            Canvas canvas2;
            float f3;
            int i2;
            ShadowRenderer shadowRenderer2;
            float fB = ((b() - c()) + 360.0f) % 360.0f;
            if (fB > 180.0f) {
                fB -= 360.0f;
            }
            if (fB > BitmapDescriptorFactory.HUE_RED) {
                return;
            }
            PathLineOperation pathLineOperation = this.c;
            float f4 = pathLineOperation.b;
            float f5 = this.e;
            double d = f4 - f5;
            float f6 = pathLineOperation.c;
            float f7 = this.f;
            double dHypot = Math.hypot(d, f6 - f7);
            PathLineOperation pathLineOperation2 = this.d;
            double dHypot2 = Math.hypot(pathLineOperation2.b - pathLineOperation.b, pathLineOperation2.c - pathLineOperation.c);
            float fMin = (float) Math.min(i, Math.min(dHypot, dHypot2));
            double d2 = fMin;
            float f8 = -fB;
            float f9 = fB;
            double dTan = Math.tan(Math.toRadians(f8 / 2.0f)) * d2;
            Matrix matrix2 = this.f14642a;
            if (dHypot > dTan) {
                f = BitmapDescriptorFactory.HUE_RED;
                RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) (dHypot - dTan), BitmapDescriptorFactory.HUE_RED);
                matrix2.set(matrix);
                matrix2.preTranslate(f5, f7);
                matrix2.preRotate(c());
                shadowRenderer.b(canvas, matrix2, rectF, i);
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            float f10 = fMin * 2.0f;
            RectF rectF2 = new RectF(f, f, f10, f10);
            matrix2.set(matrix);
            matrix2.preTranslate(pathLineOperation.b, pathLineOperation.c);
            matrix2.preRotate(c());
            matrix2.preTranslate((float) ((-dTan) - d2), (-2.0f) * fMin);
            int i3 = (int) fMin;
            float[] fArr = {(float) (d2 + dTan), f10};
            shadowRenderer.getClass();
            if (fB > BitmapDescriptorFactory.HUE_RED) {
                f2 = f8;
                canvas2 = canvas;
                f3 = 450.0f + f9;
                shadowRenderer2 = shadowRenderer;
                i2 = i3;
            } else {
                f2 = f9;
                canvas2 = canvas;
                f3 = 450.0f;
                i2 = i3;
                shadowRenderer2 = shadowRenderer;
            }
            shadowRenderer2.a(canvas2, matrix2, rectF2, i2, f3, f2);
            Path path = shadowRenderer2.g;
            path.rewind();
            path.moveTo(fArr[0], fArr[1]);
            path.arcTo(rectF2, f3, f2);
            path.close();
            canvas2.save();
            canvas2.concat(matrix2);
            canvas2.scale(1.0f, rectF2.height() / rectF2.width());
            canvas2.drawPath(path, shadowRenderer2.h);
            canvas2.drawPath(path, shadowRenderer2.f14629a);
            canvas2.restore();
            if (dHypot2 > dTan) {
                RectF rectF3 = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) (dHypot2 - dTan), BitmapDescriptorFactory.HUE_RED);
                matrix2.set(matrix);
                matrix2.preTranslate(pathLineOperation.b, pathLineOperation.c);
                matrix2.preRotate(b());
                matrix2.preTranslate((float) dTan, BitmapDescriptorFactory.HUE_RED);
                shadowRenderer2.b(canvas2, matrix2, rectF3, i);
            }
        }

        public final float b() {
            float f = this.d.c;
            PathLineOperation pathLineOperation = this.c;
            return (float) Math.toDegrees(Math.atan((f - pathLineOperation.c) / (r0.b - pathLineOperation.b)));
        }

        public final float c() {
            PathLineOperation pathLineOperation = this.c;
            return (float) Math.toDegrees(Math.atan((pathLineOperation.c - this.f) / (pathLineOperation.b - this.e)));
        }
    }

    public static class LineShadowOperation extends ShadowCompatOperation {
        public final PathLineOperation c;
        public final float d;
        public final float e;

        public LineShadowOperation(PathLineOperation pathLineOperation, float f, float f2) {
            this.c = pathLineOperation;
            this.d = f;
            this.e = f2;
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public final void a(Matrix matrix, ShadowRenderer shadowRenderer, int i, Canvas canvas) {
            PathLineOperation pathLineOperation = this.c;
            float f = pathLineOperation.c;
            float f2 = this.e;
            float f3 = pathLineOperation.b;
            float f4 = this.d;
            RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) Math.hypot(f - f2, f3 - f4), BitmapDescriptorFactory.HUE_RED);
            Matrix matrix2 = this.f14642a;
            matrix2.set(matrix);
            matrix2.preTranslate(f4, f2);
            matrix2.preRotate(b());
            shadowRenderer.b(canvas, matrix2, rectF, i);
        }

        public final float b() {
            PathLineOperation pathLineOperation = this.c;
            return (float) Math.toDegrees(Math.atan((pathLineOperation.c - this.e) / (pathLineOperation.b - this.d)));
        }
    }

    public static class PathArcOperation extends PathOperation {
        public static final RectF h = new RectF();
        public final float b;
        public final float c;
        public final float d;
        public final float e;
        public float f;
        public float g;

        public PathArcOperation(float f, float f2, float f3, float f4) {
            this.b = f;
            this.c = f2;
            this.d = f3;
            this.e = f4;
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f14641a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            float f = this.d;
            float f2 = this.e;
            RectF rectF = h;
            rectF.set(this.b, this.c, f, f2);
            path.arcTo(rectF, this.f, this.g, false);
            path.transform(matrix);
        }
    }

    public static class PathCubicOperation extends PathOperation {
        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f14641a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.cubicTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            path.transform(matrix);
        }
    }

    public static class PathLineOperation extends PathOperation {
        public float b;
        public float c;

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f14641a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.b, this.c);
            path.transform(matrix);
        }
    }

    public static abstract class PathOperation {

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f14641a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    public static class PathQuadOperation extends PathOperation {
        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f14641a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.quadTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            path.transform(matrix);
        }
    }

    public static abstract class ShadowCompatOperation {
        public static final Matrix b = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f14642a = new Matrix();

        public abstract void a(Matrix matrix, ShadowRenderer shadowRenderer, int i, Canvas canvas);
    }

    public ShapePath() {
        f(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 270.0f, BitmapDescriptorFactory.HUE_RED);
    }

    public final void a(float f, float f2, float f3, float f4, float f5, float f6) {
        PathArcOperation pathArcOperation = new PathArcOperation(f, f2, f3, f4);
        pathArcOperation.f = f5;
        pathArcOperation.g = f6;
        this.g.add(pathArcOperation);
        ArcShadowOperation arcShadowOperation = new ArcShadowOperation(pathArcOperation);
        float f7 = f5 + f6;
        boolean z = f6 < BitmapDescriptorFactory.HUE_RED;
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        float f8 = z ? (180.0f + f7) % 360.0f : f7;
        b(f5);
        this.h.add(arcShadowOperation);
        this.e = f8;
        double d = f7;
        this.c = (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))) + ((f + f3) * 0.5f);
        this.d = (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))) + ((f2 + f4) * 0.5f);
    }

    public final void b(float f) {
        float f2 = this.e;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.c;
        float f5 = this.d;
        PathArcOperation pathArcOperation = new PathArcOperation(f4, f5, f4, f5);
        pathArcOperation.f = this.e;
        pathArcOperation.g = f3;
        this.h.add(new ArcShadowOperation(pathArcOperation));
        this.e = f;
    }

    public final void c(Matrix matrix, Path path) {
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((PathOperation) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void d(float f, float f2) {
        PathLineOperation pathLineOperation = new PathLineOperation();
        pathLineOperation.b = f;
        pathLineOperation.c = f2;
        this.g.add(pathLineOperation);
        LineShadowOperation lineShadowOperation = new LineShadowOperation(pathLineOperation, this.c, this.d);
        float fB = lineShadowOperation.b() + 270.0f;
        float fB2 = lineShadowOperation.b() + 270.0f;
        b(fB);
        this.h.add(lineShadowOperation);
        this.e = fB2;
        this.c = f;
        this.d = f2;
    }

    public final void e(float f, float f2, float f3) {
        if ((Math.abs(f - this.c) < 0.001f && Math.abs(BitmapDescriptorFactory.HUE_RED - this.d) < 0.001f) || (Math.abs(f - f2) < 0.001f && Math.abs(BitmapDescriptorFactory.HUE_RED - f3) < 0.001f)) {
            d(f2, f3);
            return;
        }
        PathLineOperation pathLineOperation = new PathLineOperation();
        pathLineOperation.b = f;
        pathLineOperation.c = BitmapDescriptorFactory.HUE_RED;
        ArrayList arrayList = this.g;
        arrayList.add(pathLineOperation);
        PathLineOperation pathLineOperation2 = new PathLineOperation();
        pathLineOperation2.b = f2;
        pathLineOperation2.c = f3;
        arrayList.add(pathLineOperation2);
        InnerCornerShadowOperation innerCornerShadowOperation = new InnerCornerShadowOperation(pathLineOperation, pathLineOperation2, this.c, this.d);
        float fB = ((innerCornerShadowOperation.b() - innerCornerShadowOperation.c()) + 360.0f) % 360.0f;
        if (fB > 180.0f) {
            fB -= 360.0f;
        }
        if (fB > BitmapDescriptorFactory.HUE_RED) {
            d(f, BitmapDescriptorFactory.HUE_RED);
            d(f2, f3);
            return;
        }
        float fC = innerCornerShadowOperation.c() + 270.0f;
        float fB2 = innerCornerShadowOperation.b() + 270.0f;
        b(fC);
        this.h.add(innerCornerShadowOperation);
        this.e = fB2;
        this.c = f2;
        this.d = f3;
    }

    public final void f(float f, float f2, float f3, float f4) {
        this.f14640a = f;
        this.b = f2;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = (f3 + f4) % 360.0f;
        this.g.clear();
        this.h.clear();
    }
}
