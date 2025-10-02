package androidx.camera.core.streamsharing;

import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.Threads;
import java.util.ArrayList;

/* loaded from: classes2.dex */
class VirtualCamera implements CameraInternal {
    public final CameraInternal d;
    public final VirtualCameraControl e;
    public final VirtualCameraInfo f;
    public final UseCase.StateChangeCallback g;

    public VirtualCamera(CameraInternal cameraInternal, UseCase.StateChangeCallback stateChangeCallback, b bVar) {
        this.d = cameraInternal;
        this.g = stateChangeCallback;
        this.e = new VirtualCameraControl(cameraInternal.k(), bVar);
        this.f = new VirtualCameraInfo(cameraInternal.d());
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public final void c(UseCase useCase) {
        Threads.a();
        ((VirtualCameraAdapter) this.g).c(useCase);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final CameraInfoInternal d() {
        return this.f;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final Observable g() {
        return this.d.g();
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void h(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public final void j(UseCase useCase) {
        Threads.a();
        ((VirtualCameraAdapter) this.g).j(useCase);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final CameraControlInternal k() {
        return this.e;
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public final void n(UseCase useCase) {
        Threads.a();
        ((VirtualCameraAdapter) this.g).n(useCase);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void o(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final boolean p() {
        return false;
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public final void q(UseCase useCase) {
        Threads.a();
        ((VirtualCameraAdapter) this.g).q(useCase);
    }
}
