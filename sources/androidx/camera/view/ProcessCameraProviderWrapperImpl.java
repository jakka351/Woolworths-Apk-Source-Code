package androidx.camera.view;

import androidx.camera.core.CameraSelector;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.RestrictedCameraInfo;
import androidx.camera.lifecycle.ProcessCameraProvider;

/* loaded from: classes2.dex */
class ProcessCameraProviderWrapperImpl implements ProcessCameraProviderWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final ProcessCameraProvider f651a;

    public ProcessCameraProviderWrapperImpl(ProcessCameraProvider processCameraProvider) {
        this.f651a = processCameraProvider;
    }

    @Override // androidx.camera.view.ProcessCameraProviderWrapper
    public final void a(UseCase... useCaseArr) {
        this.f651a.f(useCaseArr);
    }

    @Override // androidx.camera.view.ProcessCameraProviderWrapper
    public final RestrictedCameraInfo b(CameraSelector cameraSelector) {
        return this.f651a.d(cameraSelector);
    }
}
