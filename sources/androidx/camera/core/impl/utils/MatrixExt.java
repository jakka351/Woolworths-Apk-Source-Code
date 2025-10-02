package androidx.camera.core.impl.utils;

import android.opengl.Matrix;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class MatrixExt {
    public static void a(float[] fArr, float f) {
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, BitmapDescriptorFactory.HUE_RED);
        Matrix.rotateM(fArr, 0, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, BitmapDescriptorFactory.HUE_RED);
    }

    public static void b(float[] fArr) {
        Matrix.translateM(fArr, 0, BitmapDescriptorFactory.HUE_RED, 0.5f, BitmapDescriptorFactory.HUE_RED);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.0f, -0.5f, BitmapDescriptorFactory.HUE_RED);
    }
}
