package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final /* synthetic */ class y implements CallbackToFutureAdapter.Resolver, AsyncFunction {
    public final /* synthetic */ int d;
    public final /* synthetic */ Camera2CapturePipeline.TorchTask e;

    public /* synthetic */ y(Camera2CapturePipeline.TorchTask torchTask, int i) {
        this.d = i;
        this.e = torchTask;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public ListenableFuture apply(Object obj) {
        switch (this.d) {
            case 1:
                Camera2CapturePipeline.TorchTask torchTask = this.e;
                if (!torchTask.f) {
                    return Futures.g(null);
                }
                FocusMeteringControl focusMeteringControl = torchTask.f253a.h;
                focusMeteringControl.getClass();
                return CallbackToFutureAdapter.a(new q(focusMeteringControl, 6));
            default:
                long j = Camera2CapturePipeline.TorchTask.g;
                Camera2CapturePipeline.TorchTask torchTask2 = this.e;
                ScheduledExecutorService scheduledExecutorService = torchTask2.e;
                Camera2CameraControlImpl camera2CameraControlImpl = torchTask2.f253a;
                t tVar = new t(2);
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
        this.e.f253a.j.a(completer, true);
        return "TorchOn";
    }
}
