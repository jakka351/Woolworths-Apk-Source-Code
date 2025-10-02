package androidx.camera.core.impl;

import androidx.lifecycle.LiveData;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class ForwardingCameraInfo implements CameraInfoInternal {

    /* renamed from: a, reason: collision with root package name */
    public final CameraInfoInternal f490a;

    public ForwardingCameraInfo(CameraInfoInternal cameraInfoInternal) {
        this.f490a = cameraInfoInternal;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final Set a() {
        return this.f490a.a();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public String b() {
        return this.f490a.b();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final void c(Executor executor, CameraCaptureCallback cameraCaptureCallback) {
        this.f490a.c(executor, cameraCaptureCallback);
    }

    @Override // androidx.camera.core.CameraInfo
    public final int d() {
        return this.f490a.d();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final void e(CameraCaptureCallback cameraCaptureCallback) {
        this.f490a.e(cameraCaptureCallback);
    }

    @Override // androidx.camera.core.CameraInfo
    public int f(int i) {
        return this.f490a.f(i);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final EncoderProfilesProvider g() {
        return this.f490a.g();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public CameraInfoInternal getImplementation() {
        return this.f490a.getImplementation();
    }

    @Override // androidx.camera.core.CameraInfo
    public LiveData h() {
        return this.f490a.h();
    }

    @Override // androidx.camera.core.CameraInfo
    public int i() {
        return this.f490a.i();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final Quirks j() {
        return this.f490a.j();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final List k(int i) {
        return this.f490a.k(i);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final boolean l() {
        return this.f490a.l();
    }

    @Override // androidx.camera.core.CameraInfo
    public LiveData m() {
        return this.f490a.m();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final Timebase n() {
        return this.f490a.n();
    }

    @Override // androidx.camera.core.CameraInfo
    public final String o() {
        return this.f490a.o();
    }
}
