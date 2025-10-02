package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;
import androidx.camera.core.impl.Quirks;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public interface SynchronizedCaptureSession {

    public interface Opener {
    }

    public static class OpenerBuilder {

        /* renamed from: a, reason: collision with root package name */
        public final Executor f283a;
        public final ScheduledExecutorService b;
        public final Handler c;
        public final CaptureSessionRepository d;
        public final Quirks e;
        public final Quirks f;

        public OpenerBuilder(Handler handler, CaptureSessionRepository captureSessionRepository, Quirks quirks, Quirks quirks2, Executor executor, ScheduledExecutorService scheduledExecutorService) {
            this.f283a = executor;
            this.b = scheduledExecutorService;
            this.c = handler;
            this.d = captureSessionRepository;
            this.e = quirks;
            this.f = quirks2;
        }
    }

    public static abstract class StateCallback {
        public void j(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        public void k(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        public void l(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        public void m(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        public void n(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        public void o(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        public void p(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        public void q(SynchronizedCaptureSession synchronizedCaptureSession, Surface surface) {
        }
    }

    void a();

    void b(int i);

    CameraDevice c();

    void close();

    CameraCaptureSessionCompat d();

    StateCallback e();

    ListenableFuture f();

    void g();

    int h(ArrayList arrayList, CameraCaptureSession.CaptureCallback captureCallback);

    int i(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);
}
