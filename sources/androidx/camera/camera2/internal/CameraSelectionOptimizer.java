package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import java.util.List;

/* loaded from: classes2.dex */
class CameraSelectionOptimizer {
    public static String a(CameraManagerCompat cameraManagerCompat, Integer num, List list) {
        if (num != null && list.contains("0") && list.contains("1")) {
            if (num.intValue() == 1) {
                if (((Integer) cameraManagerCompat.b("0").a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                    return "1";
                }
            } else if (num.intValue() == 0 && ((Integer) cameraManagerCompat.b("1").a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                return "0";
            }
        }
        return null;
    }
}
