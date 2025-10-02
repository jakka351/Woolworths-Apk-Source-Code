package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class CameraDeviceCompat {

    /* renamed from: a, reason: collision with root package name */
    public final CameraDeviceCompatApi28Impl f301a;

    public interface CameraDeviceCompatImpl {
    }

    public static final class StateCallbackExecutorWrapper extends CameraDevice.StateCallback {

        /* renamed from: a, reason: collision with root package name */
        public final CameraDevice.StateCallback f302a;
        public final Executor b;

        public StateCallbackExecutorWrapper(Executor executor, CameraDevice.StateCallback stateCallback) {
            this.b = executor;
            this.f302a = stateCallback;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(CameraDevice cameraDevice) {
            this.b.execute(new d(this, cameraDevice, 0));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(CameraDevice cameraDevice) {
            this.b.execute(new d(this, cameraDevice, 1));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(final CameraDevice cameraDevice, final int i) {
            this.b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.f302a.onError(cameraDevice, i);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(CameraDevice cameraDevice) {
            this.b.execute(new d(this, cameraDevice, 2));
        }
    }

    public CameraDeviceCompat(CameraDevice cameraDevice) {
        cameraDevice.getClass();
        this.f301a = new CameraDeviceCompatApi28Impl(cameraDevice, null);
    }

    public final void a(SessionConfigurationCompat sessionConfigurationCompat) throws CameraAccessException, CameraAccessExceptionCompat {
        CameraDeviceCompatApi28Impl cameraDeviceCompatApi28Impl = this.f301a;
        cameraDeviceCompatApi28Impl.getClass();
        SessionConfiguration sessionConfigurationC = sessionConfigurationCompat.c();
        sessionConfigurationC.getClass();
        try {
            cameraDeviceCompatApi28Impl.f303a.createCaptureSession(sessionConfigurationC);
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        }
    }
}
