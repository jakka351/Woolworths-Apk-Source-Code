package androidx.camera.camera2.internal;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.view.Surface;
import androidx.camera.camera2.internal.MeteringRepeatingSession;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes2.dex */
public final /* synthetic */ class k implements CallbackToFutureAdapter.Resolver, MeteringRepeatingSession.SurfaceResetCallback {
    public final /* synthetic */ int d;
    public final /* synthetic */ Camera2CameraImpl e;

    public /* synthetic */ k(Camera2CameraImpl camera2CameraImpl, int i) {
        this.d = i;
        this.e = camera2CameraImpl;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(final CallbackToFutureAdapter.Completer completer) {
        switch (this.d) {
            case 0:
                final Camera2CameraImpl camera2CameraImpl = this.e;
                try {
                    ArrayList arrayList = new ArrayList(camera2CameraImpl.d.a().b().c);
                    arrayList.add(camera2CameraImpl.B.f);
                    arrayList.add(new CameraDevice.StateCallback() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl.2
                        @Override // android.hardware.camera2.CameraDevice.StateCallback
                        public final void onClosed(CameraDevice cameraDevice) {
                            Camera2CameraImpl.this.v("openCameraConfigAndClose camera closed", null);
                            completer.b(null);
                        }

                        @Override // android.hardware.camera2.CameraDevice.StateCallback
                        public final void onDisconnected(CameraDevice cameraDevice) {
                            Camera2CameraImpl.this.v("openCameraConfigAndClose camera disconnected", null);
                            completer.b(null);
                        }

                        @Override // android.hardware.camera2.CameraDevice.StateCallback
                        public final void onError(CameraDevice cameraDevice, int i) {
                            Camera2CameraImpl.this.v(YU.a.d(i, "openCameraConfigAndClose camera error "), null);
                            completer.b(null);
                        }

                        @Override // android.hardware.camera2.CameraDevice.StateCallback
                        public final void onOpened(CameraDevice cameraDevice) {
                            Camera2CameraImpl camera2CameraImpl2 = Camera2CameraImpl.this;
                            camera2CameraImpl2.v("openCameraConfigAndClose camera opened", null);
                            CaptureSession captureSession = new CaptureSession(camera2CameraImpl2.J, false);
                            SurfaceTexture surfaceTexture = new SurfaceTexture(0);
                            surfaceTexture.setDefaultBufferSize(640, 480);
                            Surface surface = new Surface(surfaceTexture);
                            ImmediateSurface immediateSurface = new ImmediateSurface(surface);
                            Futures.h(immediateSurface.e).addListener(new b(8, surface, surfaceTexture), CameraXExecutors.a());
                            SessionConfig.Builder builder = new SessionConfig.Builder();
                            builder.f(immediateSurface, DynamicRange.d);
                            builder.u(1);
                            camera2CameraImpl2.v("Start configAndClose.", null);
                            SessionConfig sessionConfigK = builder.k();
                            SynchronizedCaptureSession.OpenerBuilder openerBuilder = camera2CameraImpl2.C;
                            Quirks quirks = openerBuilder.e;
                            Quirks quirks2 = openerBuilder.f;
                            int i = 1;
                            FutureChain futureChainA = FutureChain.a(CallbackToFutureAdapter.a(new androidx.camera.core.impl.utils.futures.a(i, captureSession.a(sessionConfigK, cameraDevice, new SynchronizedCaptureSessionImpl(openerBuilder.c, openerBuilder.d, quirks, quirks2, openerBuilder.f283a, openerBuilder.b)))));
                            l lVar = new l(0, captureSession, immediateSurface);
                            Executor executor = camera2CameraImpl2.f;
                            FutureChain futureChain = (FutureChain) Futures.m(futureChainA, lVar, executor);
                            Objects.requireNonNull(cameraDevice);
                            futureChain.addListener(new m(cameraDevice, 9), executor);
                        }
                    });
                    CameraManagerCompat cameraManagerCompat = camera2CameraImpl.e;
                    cameraManagerCompat.f304a.b(camera2CameraImpl.m.f241a, camera2CameraImpl.f, CameraDeviceStateCallbacks.a(arrayList));
                    return "configAndCloseTask";
                } catch (CameraAccessExceptionCompat | SecurityException e) {
                    camera2CameraImpl.v(YU.a.f(e, new StringBuilder("Unable to open camera for configAndClose: ")), e);
                    completer.d(e);
                    return "configAndCloseTask";
                }
            default:
                Camera2CameraImpl camera2CameraImpl2 = this.e;
                try {
                    camera2CameraImpl2.f.execute(new b(2, camera2CameraImpl2, completer));
                    return "isMeteringRepeatingAttached";
                } catch (RejectedExecutionException unused) {
                    completer.d(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
                    return "isMeteringRepeatingAttached";
                }
        }
    }
}
