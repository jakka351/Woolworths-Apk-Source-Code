package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.video.Quality;

/* loaded from: classes2.dex */
public class ExcludeStretchedVideoQualityQuirk implements VideoQualityQuirk {
    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public final boolean d(CameraInfoInternal cameraInfoInternal, Quality quality) {
        String str = Build.BRAND;
        if ("Samsung".equalsIgnoreCase(str) && "SM-J400G".equalsIgnoreCase(Build.MODEL)) {
            if (quality == Quality.c || quality == Quality.d) {
                return true;
            }
        } else if ((("Samsung".equalsIgnoreCase(str) && "SM-J260F".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str) && "SM-J530F".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str) && "sm-j600g".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str) && "SM-J701F".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str) && "SM-G610M".equalsIgnoreCase(Build.MODEL)) || ("Samsung".equalsIgnoreCase(str) && "SM-J710MN".equalsIgnoreCase(Build.MODEL))))))) && quality == Quality.c) {
            return true;
        }
        return false;
    }
}
