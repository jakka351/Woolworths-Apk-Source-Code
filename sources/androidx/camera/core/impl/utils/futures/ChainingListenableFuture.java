package androidx.camera.core.impl.utils.futures;

import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
class ChainingListenableFuture<I, O> extends FutureChain<O> implements Runnable {
    public AsyncFunction f;
    public final LinkedBlockingQueue g = new LinkedBlockingQueue(1);
    public final CountDownLatch h = new CountDownLatch(1);
    public ListenableFuture i;
    public volatile ListenableFuture j;

    public ChainingListenableFuture(AsyncFunction asyncFunction, ListenableFuture listenableFuture) {
        this.f = asyncFunction;
        listenableFuture.getClass();
        this.i = listenableFuture;
    }

    public static Object b(LinkedBlockingQueue linkedBlockingQueue) {
        Object objTake;
        boolean z = false;
        while (true) {
            try {
                objTake = linkedBlockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return objTake;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2 = false;
        if (!this.d.cancel(z)) {
            return false;
        }
        while (true) {
            try {
                this.g.put(Boolean.valueOf(z));
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        ListenableFuture listenableFuture = this.i;
        if (listenableFuture != null) {
            listenableFuture.cancel(z);
        }
        ListenableFuture listenableFuture2 = this.j;
        if (listenableFuture2 != null) {
            listenableFuture2.cancel(z);
        }
        return true;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        if (!this.d.isDone()) {
            ListenableFuture listenableFuture = this.i;
            if (listenableFuture != null) {
                listenableFuture.get();
            }
            this.h.await();
            ListenableFuture listenableFuture2 = this.j;
            if (listenableFuture2 != null) {
                listenableFuture2.get();
            }
        }
        return this.d.get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.camera.core.impl.utils.futures.AsyncFunction, com.google.common.util.concurrent.ListenableFuture] */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.camera.core.impl.utils.futures.AsyncFunction, com.google.common.util.concurrent.ListenableFuture] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.camera.core.impl.utils.futures.AsyncFunction, com.google.common.util.concurrent.ListenableFuture] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.concurrent.CountDownLatch] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r0;
        ?? r02 = 0;
        r02 = 0;
        r02 = 0;
        r02 = 0;
        r02 = 0;
        try {
            try {
                try {
                    try {
                        try {
                            final ListenableFuture listenableFutureApply = this.f.apply(Futures.d(this.i));
                            this.j = listenableFutureApply;
                            if (this.d.isCancelled()) {
                                listenableFutureApply.cancel(((Boolean) b(this.g)).booleanValue());
                                this.j = null;
                            } else {
                                listenableFutureApply.addListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.ChainingListenableFuture.1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        try {
                                            try {
                                                ChainingListenableFuture chainingListenableFuture = ChainingListenableFuture.this;
                                                Object objD = Futures.d(listenableFutureApply);
                                                CallbackToFutureAdapter.Completer completer = chainingListenableFuture.e;
                                                if (completer != null) {
                                                    completer.b(objD);
                                                }
                                            } catch (CancellationException unused) {
                                                ChainingListenableFuture.this.cancel(false);
                                            } catch (ExecutionException e) {
                                                ChainingListenableFuture chainingListenableFuture2 = ChainingListenableFuture.this;
                                                Throwable cause = e.getCause();
                                                CallbackToFutureAdapter.Completer completer2 = chainingListenableFuture2.e;
                                                if (completer2 != null) {
                                                    completer2.d(cause);
                                                }
                                            }
                                        } finally {
                                            ChainingListenableFuture.this.j = null;
                                        }
                                    }
                                }, CameraXExecutors.a());
                            }
                        } catch (CancellationException unused) {
                            cancel(false);
                        } catch (ExecutionException e) {
                            Throwable cause = e.getCause();
                            CallbackToFutureAdapter.Completer completer = this.e;
                            if (completer != null) {
                                completer.d(cause);
                            }
                        }
                    } catch (Error e2) {
                        CallbackToFutureAdapter.Completer completer2 = this.e;
                        r0 = r02;
                        if (completer2 != null) {
                            completer2.d(e2);
                            r0 = r02;
                        }
                    }
                } catch (Exception e3) {
                    CallbackToFutureAdapter.Completer completer3 = this.e;
                    r0 = r02;
                    if (completer3 != null) {
                        completer3.d(e3);
                        r0 = r02;
                    }
                }
            } finally {
                this.f = r02;
                this.i = r02;
                this.h.countDown();
            }
        } catch (UndeclaredThrowableException e4) {
            Throwable cause2 = e4.getCause();
            CallbackToFutureAdapter.Completer completer4 = this.e;
            r0 = r02;
            if (completer4 != null) {
                completer4.d(cause2);
                r0 = r02;
            }
        }
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!this.d.isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j = timeUnit2.convert(j, timeUnit);
                timeUnit = timeUnit2;
            }
            ListenableFuture listenableFuture = this.i;
            if (listenableFuture != null) {
                long jNanoTime = System.nanoTime();
                listenableFuture.get(j, timeUnit);
                j -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (this.h.await(j, timeUnit)) {
                j -= Math.max(0L, System.nanoTime() - jNanoTime2);
                ListenableFuture listenableFuture2 = this.j;
                if (listenableFuture2 != null) {
                    listenableFuture2.get(j, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return this.d.get(j, timeUnit);
    }
}
