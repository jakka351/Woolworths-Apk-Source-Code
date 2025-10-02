package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import androidx.annotation.RequiresApi;
import java.util.Set;

@RequiresApi
/* loaded from: classes2.dex */
class CameraManagerCompatApi30Impl extends CameraManagerCompatApi29Impl {
    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public final Set d() throws CameraAccessExceptionCompat {
        try {
            return this.f306a.getConcurrentCameraIds();
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        }
    }
}
