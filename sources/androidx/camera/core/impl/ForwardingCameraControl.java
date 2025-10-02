package androidx.camera.core.impl;

import android.graphics.Rect;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.impl.SessionConfig;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class ForwardingCameraControl implements CameraControlInternal {
    public final CameraControlInternal b;

    public ForwardingCameraControl(CameraControlInternal cameraControlInternal) {
        this.b = cameraControlInternal;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void a() {
        this.b.a();
    }

    @Override // androidx.camera.core.CameraControl
    public ListenableFuture b(float f) {
        return this.b.b(f);
    }

    @Override // androidx.camera.core.CameraControl
    public ListenableFuture c(float f) {
        return this.b.c(f);
    }

    @Override // androidx.camera.core.CameraControl
    public ListenableFuture d(boolean z) {
        return this.b.d(z);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public ListenableFuture e(int i, int i2, ArrayList arrayList) {
        return this.b.e(i, i2, arrayList);
    }

    @Override // androidx.camera.core.CameraControl
    public ListenableFuture f(FocusMeteringAction focusMeteringAction) {
        return this.b.f(focusMeteringAction);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void g() {
        this.b.g();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void h(Config config) {
        this.b.h(config);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final Rect i() {
        return this.b.i();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void j(int i) {
        this.b.j(i);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final Config k() {
        return this.b.k();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void l(SessionConfig.Builder builder) {
        this.b.l(builder);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final ListenableFuture m(int i, int i2) {
        return this.b.m(i, i2);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void n(ImageCapture.ScreenFlash screenFlash) {
        this.b.n(screenFlash);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void o() {
        this.b.o();
    }
}
