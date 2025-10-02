package androidx.camera.view;

import androidx.camera.core.CameraSelector;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.RestrictedCameraInfo;

/* loaded from: classes2.dex */
interface ProcessCameraProviderWrapper {
    void a(UseCase... useCaseArr);

    RestrictedCameraInfo b(CameraSelector cameraSelector);
}
