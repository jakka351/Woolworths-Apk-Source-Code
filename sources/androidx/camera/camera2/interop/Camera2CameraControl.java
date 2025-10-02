package androidx.camera.camera2.interop;

import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.Executor;

@ExperimentalCamera2Interop
/* loaded from: classes2.dex */
public final class Camera2CameraControl {
    public final Camera2CameraControlImpl c;
    public final Executor d;
    public CallbackToFutureAdapter.Completer g;

    /* renamed from: a, reason: collision with root package name */
    public boolean f381a = false;
    public boolean b = false;
    public final Object e = new Object();
    public Camera2ImplConfig.Builder f = new Camera2ImplConfig.Builder();

    public Camera2CameraControl(Camera2CameraControlImpl camera2CameraControlImpl, Executor executor) {
        this.c = camera2CameraControlImpl;
        this.d = executor;
    }
}
