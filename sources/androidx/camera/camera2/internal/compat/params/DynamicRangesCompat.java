package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import androidx.activity.i;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.DynamicRange;
import androidx.core.util.Preconditions;
import java.util.Set;

/* loaded from: classes2.dex */
public final class DynamicRangesCompat {

    /* renamed from: a, reason: collision with root package name */
    public final DynamicRangeProfilesCompatImpl f310a;

    public interface DynamicRangeProfilesCompatImpl {
        Set a();

        Set b(DynamicRange dynamicRange);

        DynamicRangeProfiles c();
    }

    public DynamicRangesCompat(DynamicRangeProfilesCompatImpl dynamicRangeProfilesCompatImpl) {
        this.f310a = dynamicRangeProfilesCompatImpl;
    }

    public static DynamicRangesCompat a(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        DynamicRangeProfiles dynamicRangeProfilesC;
        int i = Build.VERSION.SDK_INT;
        DynamicRangesCompat dynamicRangesCompat = null;
        if (i >= 33 && (dynamicRangeProfilesC = i.c(cameraCharacteristicsCompat.a(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES))) != null) {
            Preconditions.f("DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.", i >= 33);
            dynamicRangesCompat = new DynamicRangesCompat(new DynamicRangesCompatApi33Impl(dynamicRangeProfilesC));
        }
        return dynamicRangesCompat == null ? DynamicRangesCompatBaseImpl.f312a : dynamicRangesCompat;
    }

    public final Set b(DynamicRange dynamicRange) {
        return this.f310a.b(dynamicRange);
    }

    public final Set c() {
        return this.f310a.a();
    }

    public final DynamicRangeProfiles d() {
        Preconditions.f("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", Build.VERSION.SDK_INT >= 33);
        return this.f310a.c();
    }
}
