package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.AbstractTransformFuture;
import com.google.common.util.concurrent.ImmediateFuture;
import com.google.common.util.concurrent.internal.InternalFutureFailureAccess;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes6.dex */
public final class Futures extends GwtFuturesCatchingSpecialization {

    /* renamed from: com.google.common.util.concurrent.Futures$1, reason: invalid class name */
    class AnonymousClass1 implements Future<Object> {
        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            throw null;
        }

        @Override // java.util.concurrent.Future
        public final Object get() {
            throw null;
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            throw null;
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            throw null;
        }

        @Override // java.util.concurrent.Future
        public final Object get(long j, TimeUnit timeUnit) {
            throw null;
        }
    }

    public static final class CallbackListener<V> implements Runnable {
        public final Future d;
        public final FutureCallback e;

        public CallbackListener(ListenableFuture listenableFuture, FutureCallback futureCallback) {
            this.d = listenableFuture;
            this.e = futureCallback;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            Throwable thA;
            Future future = this.d;
            boolean z = future instanceof InternalFutureFailureAccess;
            FutureCallback futureCallback = this.e;
            if (z && (thA = ((InternalFutureFailureAccess) future).a()) != null) {
                futureCallback.onFailure(thA);
                return;
            }
            try {
                futureCallback.onSuccess(Futures.b(future));
            } catch (ExecutionException e) {
                futureCallback.onFailure(e.getCause());
            } catch (Throwable th) {
                futureCallback.onFailure(th);
            }
        }

        public final String toString() {
            MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
            toStringHelperB.f(this.e);
            return toStringHelperB.toString();
        }
    }

    @GwtCompatible
    public static final class FutureCombiner<V> {

        /* renamed from: com.google.common.util.concurrent.Futures$FutureCombiner$1, reason: invalid class name */
        class AnonymousClass1 implements Callable<Void> {
            @Override // java.util.concurrent.Callable
            public final Void call() {
                throw null;
            }
        }
    }

    public static final class InCompletionOrderFuture<T> extends AbstractFuture<T> {
        @Override // com.google.common.util.concurrent.AbstractFuture
        public final void c() {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            if (super.cancel(z)) {
                throw null;
            }
            return false;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        public final String k() {
            return null;
        }
    }

    public static final class InCompletionOrderState<T> {
    }

    public static final class NonCancellationPropagatingFuture<V> extends AbstractFuture.TrustedFuture<V> implements Runnable {
        @Override // com.google.common.util.concurrent.AbstractFuture
        public final void c() {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        public final String k() {
            return null;
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    public static void a(ListenableFuture listenableFuture, FutureCallback futureCallback, Executor executor) {
        listenableFuture.addListener(new CallbackListener(listenableFuture, futureCallback), executor);
    }

    public static Object b(Future future) {
        Preconditions.p("Future was expected to be done: %s", future, future.isDone());
        return Uninterruptibles.a(future);
    }

    public static ListenableFuture c(Throwable th) {
        ImmediateFuture.ImmediateFailedFuture immediateFailedFuture = new ImmediateFuture.ImmediateFailedFuture();
        immediateFailedFuture.n(th);
        return immediateFailedFuture;
    }

    public static ListenableFuture d(Object obj) {
        return obj == null ? ImmediateFuture.e : new ImmediateFuture(obj);
    }

    public static ListenableFuture e(ListenableFuture listenableFuture, com.google.common.cache.a aVar) {
        int i = AbstractTransformFuture.m;
        AbstractTransformFuture.TransformFuture transformFuture = new AbstractTransformFuture.TransformFuture();
        transformFuture.k = listenableFuture;
        transformFuture.l = aVar;
        listenableFuture.addListener(transformFuture, DirectExecutor.d);
        return transformFuture;
    }
}
