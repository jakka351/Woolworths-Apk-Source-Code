package androidx.camera.core.impl;

import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.UseCase;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public interface CameraInternal extends Camera, UseCase.StateChangeCallback {

    public enum State {
        RELEASED(false),
        RELEASING(true),
        CLOSED(false),
        PENDING_OPEN(false),
        CLOSING(true),
        OPENING(true),
        OPEN(true),
        CONFIGURED(true);

        public final boolean d;

        State(boolean z) {
            this.d = z;
        }
    }

    @Override // androidx.camera.core.Camera
    default CameraControl a() {
        return k();
    }

    @Override // androidx.camera.core.Camera
    default CameraInfo b() {
        return d();
    }

    CameraInfoInternal d();

    default boolean e() {
        return b().d() == 0;
    }

    default void f(CameraConfig cameraConfig) {
    }

    Observable g();

    void h(ArrayList arrayList);

    default void i(boolean z) {
    }

    CameraControlInternal k();

    default CameraConfig l() {
        return CameraConfigs.f473a;
    }

    default void m(boolean z) {
    }

    void o(ArrayList arrayList);

    default boolean p() {
        return true;
    }
}
