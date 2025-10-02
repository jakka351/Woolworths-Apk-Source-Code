package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final /* synthetic */ class v implements CallbackToFutureAdapter.Resolver, AsyncFunction {
    public final /* synthetic */ int d;
    public final /* synthetic */ Camera2CapturePipeline.ScreenFlashTask e;

    public /* synthetic */ v(Camera2CapturePipeline.ScreenFlashTask screenFlashTask, int i) {
        this.d = i;
        this.e = screenFlashTask;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public ListenableFuture apply(Object obj) {
        int i = this.d;
        Camera2CapturePipeline.ScreenFlashTask screenFlashTask = this.e;
        switch (i) {
            case 1:
                return screenFlashTask.f252a.h.c(true);
            case 2:
                int i2 = Camera2CapturePipeline.ScreenFlashTask.g;
                return CallbackToFutureAdapter.a(new v(screenFlashTask, 0));
            case 3:
                FocusMeteringControl focusMeteringControl = screenFlashTask.f252a.h;
                focusMeteringControl.getClass();
                return CallbackToFutureAdapter.a(new q(focusMeteringControl, 6));
            default:
                long j = Camera2CapturePipeline.ScreenFlashTask.f;
                ScheduledExecutorService scheduledExecutorService = screenFlashTask.c;
                Camera2CameraControlImpl camera2CameraControlImpl = screenFlashTask.f252a;
                t tVar = new t(1);
                long millis = TimeUnit.NANOSECONDS.toMillis(j);
                Camera2CapturePipeline.ResultListener resultListener = new Camera2CapturePipeline.ResultListener(tVar);
                camera2CameraControlImpl.p(resultListener);
                b bVar = new b(4, camera2CameraControlImpl, resultListener);
                Executor executor = camera2CameraControlImpl.c;
                ListenableFuture listenableFuture = resultListener.b;
                listenableFuture.addListener(bVar, executor);
                return CallbackToFutureAdapter.a(new androidx.camera.core.impl.utils.futures.b(listenableFuture, scheduledExecutorService, millis, 1));
        }
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        Camera2CapturePipeline.ScreenFlashTask screenFlashTask = this.e;
        if (!screenFlashTask.e.a()) {
            completer.b(null);
            return "EnableTorchInternal";
        }
        Logger.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: enable torch");
        screenFlashTask.f252a.r(true);
        completer.b(null);
        return "EnableTorchInternal";
    }
}
