package androidx.camera.view;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import androidx.annotation.RestrictTo;
import androidx.camera.core.MeteringPointFactory;

@RestrictTo
/* loaded from: classes2.dex */
class PreviewViewMeteringPointFactory extends MeteringPointFactory {
    public static final PointF e = new PointF(2.0f, 2.0f);
    public final PreviewTransformation b;
    public Rect c;
    public Matrix d;

    public PreviewViewMeteringPointFactory(PreviewTransformation previewTransformation) {
        this.f417a = null;
        this.c = null;
        this.b = previewTransformation;
    }

    public final PointF a(float f, float f2) {
        float[] fArr = {f, f2};
        synchronized (this) {
            try {
                Matrix matrix = this.d;
                if (matrix == null) {
                    return e;
                }
                matrix.mapPoints(fArr);
                return new PointF(fArr[0], fArr[1]);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
