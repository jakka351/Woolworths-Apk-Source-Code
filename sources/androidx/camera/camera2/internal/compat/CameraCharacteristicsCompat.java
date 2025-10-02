package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import androidx.camera.camera2.internal.compat.workaround.OutputSizesCorrector;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class CameraCharacteristicsCompat {
    public final CameraCharacteristicsCompatImpl b;
    public final String c;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f300a = new HashMap();
    public StreamConfigurationMapCompat d = null;

    public interface CameraCharacteristicsCompatImpl {
    }

    public CameraCharacteristicsCompat(String str, CameraCharacteristics cameraCharacteristics) {
        this.b = new CameraCharacteristicsApi28Impl(cameraCharacteristics);
        this.c = str;
    }

    public final Object a(CameraCharacteristics.Key key) {
        if (key.equals(CameraCharacteristics.SENSOR_ORIENTATION)) {
            return ((CameraCharacteristicsBaseImpl) this.b).f299a.get(key);
        }
        synchronized (this) {
            try {
                Object obj = this.f300a.get(key);
                if (obj != null) {
                    return obj;
                }
                Object obj2 = ((CameraCharacteristicsBaseImpl) this.b).f299a.get(key);
                if (obj2 != null) {
                    this.f300a.put(key, obj2);
                }
                return obj2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final StreamConfigurationMapCompat b() {
        if (this.d == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    throw new IllegalArgumentException("StreamConfigurationMap is null!");
                }
                this.d = new StreamConfigurationMapCompat(streamConfigurationMap, new OutputSizesCorrector(this.c));
            } catch (AssertionError | NullPointerException e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }
        return this.d;
    }

    public final boolean c() {
        if (Build.VERSION.SDK_INT >= 34) {
            int[] iArr = (int[]) ((CameraCharacteristicsBaseImpl) this.b).f299a.get(CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
