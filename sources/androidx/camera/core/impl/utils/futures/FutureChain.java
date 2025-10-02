package androidx.camera.core.impl.utils.futures;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class FutureChain<V> implements ListenableFuture<V> {
    public final ListenableFuture d;
    public CallbackToFutureAdapter.Completer e;

    public FutureChain(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        this.d = listenableFuture;
    }

    public static FutureChain a(ListenableFuture listenableFuture) {
        return listenableFuture instanceof FutureChain ? (FutureChain) listenableFuture : new FutureChain(listenableFuture);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.d.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.d.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.d.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.d.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.d.isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return this.d.get(j, timeUnit);
    }

    public FutureChain() {
        this.d = CallbackToFutureAdapter.a(new CallbackToFutureAdapter.Resolver<Object>() { // from class: androidx.camera.core.impl.utils.futures.FutureChain.1
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                FutureChain futureChain = FutureChain.this;
                Preconditions.f("The result can only set once!", futureChain.e == null);
                futureChain.e = completer;
                return "FutureChain[" + futureChain + "]";
            }
        });
    }
}
