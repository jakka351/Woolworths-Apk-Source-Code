package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.CameraCharacteristicsProvider;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final /* synthetic */ class q implements CallbackToFutureAdapter.Resolver, AsyncFunction, ImageReaderProxy.OnImageAvailableListener, CameraCharacteristicsProvider {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q(Camera2CapturePipeline.Pipeline pipeline, CaptureConfig.Builder builder) {
        this.d = 2;
        this.e = builder;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
    public void a(ImageReaderProxy imageReaderProxy) {
        ZslControlImpl zslControlImpl = (ZslControlImpl) this.e;
        zslControlImpl.getClass();
        try {
            ImageProxy imageProxyD = imageReaderProxy.d();
            if (imageProxyD != null) {
                zslControlImpl.b.c(imageProxyD);
            }
        } catch (IllegalStateException e) {
            Logger.b("ZslControlImpl", "Failed to acquire latest image IllegalStateException = " + e.getMessage());
        }
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public ListenableFuture apply(Object obj) {
        Camera2CapturePipeline.Pipeline pipeline = (Camera2CapturePipeline.Pipeline) this.e;
        int i = Camera2CapturePipeline.Pipeline.l;
        if (!Boolean.TRUE.equals((Boolean) obj)) {
            return Futures.g(null);
        }
        long j = pipeline.g;
        ScheduledExecutorService scheduledExecutorService = pipeline.c;
        Camera2CameraControlImpl camera2CameraControlImpl = pipeline.d;
        t tVar = new t(0);
        long millis = TimeUnit.NANOSECONDS.toMillis(j);
        Camera2CapturePipeline.ResultListener resultListener = new Camera2CapturePipeline.ResultListener(tVar);
        camera2CameraControlImpl.p(resultListener);
        b bVar = new b(4, camera2CameraControlImpl, resultListener);
        Executor executor = camera2CameraControlImpl.c;
        ListenableFuture listenableFuture = resultListener.b;
        listenableFuture.addListener(bVar, executor);
        return CallbackToFutureAdapter.a(new androidx.camera.core.impl.utils.futures.b(listenableFuture, scheduledExecutorService, millis, 1));
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(final CallbackToFutureAdapter.Completer completer) {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                Camera2CapturePipeline.AePreCaptureTask aePreCaptureTask = (Camera2CapturePipeline.AePreCaptureTask) obj;
                aePreCaptureTask.f245a.h.e(completer);
                aePreCaptureTask.b.b = true;
                return "AePreCapture";
            case 1:
                ((Camera2CapturePipeline.CameraCapturePipelineImpl) obj).b.i.c();
                completer.b(null);
                return "invokePostCaptureFuture";
            case 2:
                int i2 = Camera2CapturePipeline.Pipeline.l;
                ((CaptureConfig.Builder) obj).b(new CameraCaptureCallback() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline.Pipeline.2
                    @Override // androidx.camera.core.impl.CameraCaptureCallback
                    public final void a(int i3) {
                        completer.d(new ImageCaptureException("Capture request is cancelled because camera is closed", null));
                    }

                    @Override // androidx.camera.core.impl.CameraCaptureCallback
                    public final void b(int i3, CameraCaptureResult cameraCaptureResult) {
                        completer.b(null);
                    }

                    @Override // androidx.camera.core.impl.CameraCaptureCallback
                    public final void c(int i3, CameraCaptureFailure cameraCaptureFailure) {
                        completer.d(new ImageCaptureException("Capture request failed with reason " + CameraCaptureFailure.Reason.d, null));
                    }
                });
                return "submitStillCapture";
            case 3:
            default:
                Camera2CameraControlImpl camera2CameraControlImpl = (Camera2CameraControlImpl) obj;
                camera2CameraControlImpl.c.execute(new b(7, camera2CameraControlImpl, completer));
                return "updateSessionConfigAsync";
            case 4:
                ((Camera2CapturePipeline.ResultListener) obj).f251a = completer;
                return "waitFor3AResult";
            case 5:
                int i3 = Camera2CapturePipeline.ScreenFlashTask.g;
                ((AtomicReference) obj).set(new ImageCapture.ScreenFlashListener() { // from class: androidx.camera.camera2.internal.w
                    @Override // androidx.camera.core.ImageCapture.ScreenFlashListener
                    public final void onCompleted() {
                        int i4 = Camera2CapturePipeline.ScreenFlashTask.g;
                        Logger.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: UI change applied");
                        completer.b(null);
                    }
                });
                return "OnScreenFlashUiApplied";
            case 6:
                FocusMeteringControl focusMeteringControl = (FocusMeteringControl) obj;
                focusMeteringControl.b.execute(new b(5, focusMeteringControl, completer));
                return "triggerAePrecapture";
        }
    }

    @Override // androidx.camera.camera2.internal.compat.workaround.CameraCharacteristicsProvider
    public Object get() {
        return ((CameraCharacteristicsCompat) this.e).a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
    }

    public /* synthetic */ q(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }
}
