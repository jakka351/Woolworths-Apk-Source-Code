package androidx.camera.core.impl.utils;

import YU.a;
import androidx.camera.core.Logger;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* loaded from: classes2.dex */
public final class CameraOrientationUtil {
    public static int a(int i, int i2, boolean z) {
        int i3 = z ? ((i2 - i) + 360) % 360 : (i2 + i) % 360;
        if (Logger.d(2, "CameraOrientationUtil")) {
            StringBuilder sbQ = a.q(i, i2, "getRelativeImageRotation: destRotationDegrees=", ", sourceRotationDegrees=", ", isOppositeFacing=");
            sbQ.append(z);
            sbQ.append(", result=");
            sbQ.append(i3);
            Logger.a("CameraOrientationUtil", sbQ.toString());
        }
        return i3;
    }

    public static int b(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return SubsamplingScaleImageView.ORIENTATION_180;
        }
        if (i == 3) {
            return SubsamplingScaleImageView.ORIENTATION_270;
        }
        throw new IllegalArgumentException(a.d(i, "Unsupported surface rotation: "));
    }
}
