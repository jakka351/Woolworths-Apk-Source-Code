package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.camera2.internal.CaptureSessionRepository;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                Camera2CameraImpl camera2CameraImpl = (Camera2CameraImpl) this.e;
                camera2CameraImpl.y = false;
                camera2CameraImpl.x = false;
                camera2CameraImpl.v("OpenCameraConfigAndClose is done, state: " + camera2CameraImpl.h, null);
                int iOrdinal = camera2CameraImpl.h.ordinal();
                if (iOrdinal == 1 || iOrdinal == 4) {
                    Preconditions.f(null, camera2CameraImpl.q.isEmpty());
                    camera2CameraImpl.w();
                    return;
                }
                if (iOrdinal != 6) {
                    camera2CameraImpl.v("OpenCameraConfigAndClose finished while in state: " + camera2CameraImpl.h, null);
                    return;
                }
                int i = camera2CameraImpl.o;
                if (i == 0) {
                    camera2CameraImpl.L(false);
                    return;
                } else {
                    camera2CameraImpl.v("OpenCameraConfigAndClose in error: ".concat(Camera2CameraImpl.x(i)), null);
                    camera2CameraImpl.l.b();
                    return;
                }
            case 1:
                Camera2CameraImpl.StateCallback.ScheduledReopen scheduledReopen = (Camera2CameraImpl.StateCallback.ScheduledReopen) this.e;
                if (scheduledReopen.e) {
                    return;
                }
                Preconditions.f(null, scheduledReopen.f.f.h == Camera2CameraImpl.InternalState.j || scheduledReopen.f.f.h == Camera2CameraImpl.InternalState.i);
                if (scheduledReopen.f.c()) {
                    scheduledReopen.f.f.K(true);
                    return;
                } else {
                    scheduledReopen.f.f.L(true);
                    return;
                }
            case 2:
                ((Camera2CapturePipeline.Pipeline) this.e).i.c();
                return;
            case 3:
                CaptureSession captureSession = (CaptureSession) this.e;
                synchronized (captureSession.f264a) {
                    if (captureSession.b.isEmpty()) {
                        return;
                    }
                    try {
                        captureSession.n(captureSession.b);
                        return;
                    } finally {
                        captureSession.b.clear();
                    }
                }
            case 4:
                LinkedHashSet<SynchronizedCaptureSession> linkedHashSet = (LinkedHashSet) this.e;
                int i2 = CaptureSessionRepository.AnonymousClass1.b;
                for (SynchronizedCaptureSession synchronizedCaptureSession : linkedHashSet) {
                    synchronizedCaptureSession.e().l(synchronizedCaptureSession);
                }
                return;
            case 5:
                ProcessingCaptureSession processingCaptureSession = (ProcessingCaptureSession) this.e;
                ArrayList arrayList = ProcessingCaptureSession.n;
                Logger.a("ProcessingCaptureSession", "== deInitSession (id=" + processingCaptureSession.m + ")");
                processingCaptureSession.f279a.c();
                return;
            case 6:
                ProcessingCaptureSession.n.remove((DeferrableSurface) this.e);
                return;
            case 7:
                SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = (SynchronizedCaptureSessionBaseImpl) this.e;
                synchronizedCaptureSessionBaseImpl.p(synchronizedCaptureSessionBaseImpl);
                return;
            case 8:
                SynchronizedCaptureSessionImpl.y((SynchronizedCaptureSessionImpl) this.e);
                return;
            case 9:
                ((CameraDevice) this.e).close();
                return;
            case 10:
                ((ImageCapture.ScreenFlash) this.e).clear();
                return;
            default:
                ((SafeCloseImageReaderProxy) this.e).g();
                return;
        }
    }
}
