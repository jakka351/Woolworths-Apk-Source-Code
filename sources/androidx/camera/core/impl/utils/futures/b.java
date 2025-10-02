package androidx.camera.core.impl.utils.futures;

import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements CallbackToFutureAdapter.Resolver {
    public final /* synthetic */ int d;
    public final /* synthetic */ ListenableFuture e;
    public final /* synthetic */ ScheduledExecutorService f;
    public final /* synthetic */ long g;

    public /* synthetic */ b(ListenableFuture listenableFuture, ScheduledExecutorService scheduledExecutorService, long j, int i) {
        this.d = i;
        this.e = listenableFuture;
        this.f = scheduledExecutorService;
        this.g = j;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(final CallbackToFutureAdapter.Completer completer) {
        switch (this.d) {
            case 0:
                final ListenableFuture listenableFuture = this.e;
                Futures.i(completer, listenableFuture);
                if (!listenableFuture.isDone()) {
                    final long j = this.g;
                    final ScheduledFuture scheduledFutureSchedule = this.f.schedule(new Callable() { // from class: androidx.camera.core.impl.utils.futures.c
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Boolean.valueOf(completer.d(new TimeoutException("Future[" + listenableFuture + "] is not done within " + j + " ms.")));
                        }
                    }, j, TimeUnit.MILLISECONDS);
                    final int i = 0;
                    listenableFuture.addListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i) {
                                case 0:
                                    scheduledFutureSchedule.cancel(true);
                                    break;
                                default:
                                    scheduledFutureSchedule.cancel(true);
                                    break;
                            }
                        }
                    }, CameraXExecutors.a());
                }
                return "TimeoutFuture[" + listenableFuture + "]";
            default:
                ListenableFuture listenableFuture2 = this.e;
                Futures.i(completer, listenableFuture2);
                if (!listenableFuture2.isDone()) {
                    final ScheduledFuture<?> scheduledFutureSchedule2 = this.f.schedule(new e(0, completer, listenableFuture2), this.g, TimeUnit.MILLISECONDS);
                    final int i2 = 1;
                    listenableFuture2.addListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    scheduledFutureSchedule2.cancel(true);
                                    break;
                                default:
                                    scheduledFutureSchedule2.cancel(true);
                                    break;
                            }
                        }
                    }, CameraXExecutors.a());
                }
                return "TimeoutFuture[" + listenableFuture2 + "]";
        }
    }
}
