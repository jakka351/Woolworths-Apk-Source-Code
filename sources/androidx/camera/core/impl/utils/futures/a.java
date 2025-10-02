package androidx.camera.core.impl.utils.futures;

import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements CallbackToFutureAdapter.Resolver {
    public final /* synthetic */ int d;
    public final /* synthetic */ ListenableFuture e;

    public /* synthetic */ a(int i, ListenableFuture listenableFuture) {
        this.d = i;
        this.e = listenableFuture;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.d) {
            case 0:
                Executor executorA = CameraXExecutors.a();
                ListenableFuture listenableFuture = this.e;
                Futures.j(false, listenableFuture, completer, executorA);
                return "nonCancellationPropagating[" + listenableFuture + "]";
            default:
                androidx.camera.camera2.interop.d dVar = new androidx.camera.camera2.interop.d(completer, 5);
                Executor executorA2 = CameraXExecutors.a();
                ListenableFuture listenableFuture2 = this.e;
                listenableFuture2.addListener(dVar, executorA2);
                return "transformVoidFuture [" + listenableFuture2 + "]";
        }
    }
}
