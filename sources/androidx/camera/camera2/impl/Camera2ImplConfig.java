package androidx.camera.camera2.impl;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.annotation.OptIn;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.core.ExtendableBuilder;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;

@OptIn
/* loaded from: classes2.dex */
public final class Camera2ImplConfig extends CaptureRequestOptions {
    public static final Config.Option H = Config.Option.a(Integer.TYPE, "camera2.captureRequest.templateType");
    public static final Config.Option I = Config.Option.a(Long.TYPE, "camera2.cameraCaptureSession.streamUseCase");
    public static final Config.Option J = Config.Option.a(CameraDevice.StateCallback.class, "camera2.cameraDevice.stateCallback");
    public static final Config.Option K = Config.Option.a(CameraCaptureSession.StateCallback.class, "camera2.cameraCaptureSession.stateCallback");
    public static final Config.Option L = Config.Option.a(CameraCaptureSession.CaptureCallback.class, "camera2.cameraCaptureSession.captureCallback");
    public static final Config.Option M;

    public static final class Builder implements ExtendableBuilder<Camera2ImplConfig> {

        /* renamed from: a, reason: collision with root package name */
        public final MutableOptionsBundle f223a = MutableOptionsBundle.V();

        public final Camera2ImplConfig a() {
            return new Camera2ImplConfig(OptionsBundle.U(this.f223a));
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public final MutableConfig b() {
            throw null;
        }

        public final void c(CaptureRequest.Key key, Object obj) {
            this.f223a.G(Camera2ImplConfig.U(key), obj);
        }

        public final void d(CaptureRequest.Key key, Object obj, Config.OptionPriority optionPriority) {
            this.f223a.X(Camera2ImplConfig.U(key), optionPriority, obj);
        }
    }

    static {
        Config.Option.a(Object.class, "camera2.captureRequest.tag");
        M = Config.Option.a(String.class, "camera2.cameraCaptureSession.physicalCameraId");
    }

    public static Config.Option U(CaptureRequest.Key key) {
        return Config.Option.b("camera2.captureRequest.option." + key.getName(), key);
    }
}
