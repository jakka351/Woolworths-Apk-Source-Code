package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.CameraInfo;
import androidx.lifecycle.LiveData;

@ExperimentalCamera2Interop
/* loaded from: classes2.dex */
public class Camera2PhysicalCameraInfoImpl implements CameraInfo {
    @Override // androidx.camera.core.CameraInfo
    public final int d() {
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
        throw null;
    }

    @Override // androidx.camera.core.CameraInfo
    public final int f(int i) {
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_ORIENTATION;
        throw null;
    }

    @Override // androidx.camera.core.CameraInfo
    public final LiveData h() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public final int i() {
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_ORIENTATION;
        throw null;
    }

    @Override // androidx.camera.core.CameraInfo
    public final LiveData m() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }
}
