package androidx.camera.core.impl;

import androidx.camera.core.CameraInfo;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public interface CameraInfoInternal extends CameraInfo {
    Set a();

    String b();

    void c(Executor executor, CameraCaptureCallback cameraCaptureCallback);

    void e(CameraCaptureCallback cameraCaptureCallback);

    EncoderProfilesProvider g();

    default CameraInfoInternal getImplementation() {
        return this;
    }

    Quirks j();

    List k(int i);

    boolean l();

    Timebase n();
}
