package com.scandit.djinni;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public class Future<T> implements java.util.concurrent.Future<T> {

    /* renamed from: a, reason: collision with root package name */
    private AtomicReference f19004a;

    @FunctionalInterface
    /* loaded from: classes.dex */
    public interface FutureHandler<U> {
        void handleResult(Future<U> future) throws Throwable;
    }

    @FunctionalInterface
    public interface FutureHandlerWithReturn<U, R> {
        R handleResult(Future<U> future) throws Throwable;
    }

    public Future(d dVar) {
        this.f19004a = new AtomicReference(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(FutureHandler futureHandler, Promise promise, d dVar) {
        try {
            futureHandler.handleResult(new Future(dVar));
            promise.setValue(null);
        } catch (Throwable th) {
            promise.setException(th);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public T get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        T t;
        d dVar = (d) this.f19004a.getAndSet(null);
        synchronized (dVar) {
            while (!dVar.d && dVar.b == null) {
                try {
                    dVar.wait(timeUnit.toMillis(j));
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (dVar.b != null) {
                throw new ExecutionException(dVar.b.getMessage(), dVar.b);
            }
            t = (T) dVar.f19009a;
        }
        return t;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return isReady();
    }

    public boolean isReady() {
        boolean z;
        d dVar = (d) this.f19004a.get();
        synchronized (dVar) {
            try {
                z = dVar.d || dVar.b != null;
            } finally {
            }
        }
        return z;
    }

    public Future<Void> then(FutureHandler<T> futureHandler) {
        Promise promise = new Promise();
        Future<Void> future = promise.getFuture();
        e eVar = new e(futureHandler, promise);
        d dVar = null;
        d dVar2 = (d) this.f19004a.getAndSet(null);
        synchronized (dVar2) {
            try {
                if (dVar2.d || dVar2.b != null) {
                    dVar = dVar2;
                } else {
                    dVar2.c = eVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (dVar != null) {
            eVar.a(dVar);
        }
        return future;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(Promise promise, FutureHandlerWithReturn futureHandlerWithReturn, d dVar) {
        try {
            promise.setValue(futureHandlerWithReturn.handleResult(new Future(dVar)));
        } catch (Throwable th) {
            promise.setException(th);
        }
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException, InterruptedException {
        try {
            return get(0L, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused) {
            return null;
        }
    }

    public <R> Future<R> then(FutureHandlerWithReturn<T, R> futureHandlerWithReturn) {
        Promise promise = new Promise();
        Future<R> future = promise.getFuture();
        e eVar = new e(promise, futureHandlerWithReturn);
        d dVar = null;
        d dVar2 = (d) this.f19004a.getAndSet(null);
        synchronized (dVar2) {
            try {
                if (dVar2.d || dVar2.b != null) {
                    dVar = dVar2;
                } else {
                    dVar2.c = eVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (dVar != null) {
            eVar.a(dVar);
        }
        return future;
    }
}
