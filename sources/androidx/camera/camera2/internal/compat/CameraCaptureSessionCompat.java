package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class CameraCaptureSessionCompat {

    /* renamed from: a, reason: collision with root package name */
    public final CameraCaptureSessionCompatApi28Impl f297a;

    public interface CameraCaptureSessionCompatImpl {
    }

    public static final class CaptureCallbackExecutorWrapper extends CameraCaptureSession.CaptureCallback {
        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
            throw null;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            throw null;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            throw null;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            throw null;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
            throw null;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
            throw null;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            throw null;
        }
    }

    public static final class StateCallbackExecutorWrapper extends CameraCaptureSession.StateCallback {
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onActive(CameraCaptureSession cameraCaptureSession) {
            new a(this, cameraCaptureSession, 0);
            throw null;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            new a(this, cameraCaptureSession, 2);
            throw null;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onClosed(CameraCaptureSession cameraCaptureSession) {
            new a(this, cameraCaptureSession, 1);
            throw null;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            new a(this, cameraCaptureSession, 5);
            throw null;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
            new a(this, cameraCaptureSession, 3);
            throw null;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onReady(CameraCaptureSession cameraCaptureSession) {
            new a(this, cameraCaptureSession, 4);
            throw null;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onSurfacePrepared(final CameraCaptureSession cameraCaptureSession, final Surface surface) {
            new Runnable() { // from class: androidx.camera.camera2.internal.compat.b
                @Override // java.lang.Runnable
                public final void run() {
                    throw null;
                }
            };
            throw null;
        }
    }

    public CameraCaptureSessionCompat(CameraCaptureSession cameraCaptureSession) {
        this.f297a = new CameraCaptureSessionCompatApi28Impl(cameraCaptureSession, null);
    }

    public final int a(ArrayList arrayList, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f297a.f298a.captureBurstRequests(arrayList, executor, captureCallback);
    }

    public final int b(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f297a.f298a.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }

    public final CameraCaptureSession c() {
        return this.f297a.f298a;
    }
}
