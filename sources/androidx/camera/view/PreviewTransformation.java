package androidx.camera.view;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.camera.core.impl.utils.CameraOrientationUtil;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.view.PreviewView;
import androidx.core.util.Preconditions;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
final class PreviewTransformation {

    /* renamed from: a, reason: collision with root package name */
    public Size f647a;
    public Rect b;
    public int c;
    public Matrix d;
    public int e;
    public boolean f;
    public boolean g;
    public PreviewView.ScaleType h;

    /* renamed from: androidx.camera.view.PreviewTransformation$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f648a;

        static {
            int[] iArr = new int[PreviewView.ScaleType.values().length];
            f648a = iArr;
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f648a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f648a[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f648a[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f648a[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f648a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public final Matrix a(Size size, int i, Rect rect) {
        Matrix matrix = null;
        if (!f()) {
            return null;
        }
        Matrix matrix2 = new Matrix();
        if (f()) {
            matrix = new Matrix(this.d);
            matrix.postConcat(c(size, i));
        }
        matrix.invert(matrix2);
        Matrix matrix3 = new Matrix();
        matrix3.setRectToRect(new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, rect.width(), rect.height()), new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix2.postConcat(matrix3);
        return matrix2;
    }

    public final Size b() {
        return TransformUtils.c(this.c) ? new Size(this.b.height(), this.b.width()) : new Size(this.b.width(), this.b.height());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Matrix c(android.util.Size r8, int r9) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.view.PreviewTransformation.c(android.util.Size, int):android.graphics.Matrix");
    }

    public final Matrix d() {
        Preconditions.f(null, f());
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f647a.getWidth(), this.f647a.getHeight());
        return TransformUtils.a(rectF, rectF, !this.g ? this.c : -CameraOrientationUtil.b(this.e), false);
    }

    public final RectF e(Size size, int i) {
        Preconditions.f(null, f());
        Matrix matrixC = c(size, i);
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f647a.getWidth(), this.f647a.getHeight());
        matrixC.mapRect(rectF);
        return rectF;
    }

    public final boolean f() {
        return (this.b == null || this.f647a == null || !(!this.g || this.e != -1)) ? false : true;
    }
}
