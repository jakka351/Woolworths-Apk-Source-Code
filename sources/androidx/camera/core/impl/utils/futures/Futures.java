package androidx.camera.core.impl.utils.futures;

import androidx.arch.core.util.Function;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.ImmediateFuture;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes2.dex */
public final class Futures {

    /* renamed from: a, reason: collision with root package name */
    public static final Function f524a = new AnonymousClass2();

    /* renamed from: androidx.camera.core.impl.utils.futures.Futures$2, reason: invalid class name */
    public class AnonymousClass2 implements Function<Object, Object> {
        @Override // androidx.arch.core.util.Function
        public final Object apply(Object obj) {
            return obj;
        }
    }

    public static final class CallbackListener<V> implements Runnable {
        public final Future d;
        public final FutureCallback e;

        public CallbackListener(ListenableFuture listenableFuture, FutureCallback futureCallback) {
            this.d = listenableFuture;
            this.e = futureCallback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            FutureCallback futureCallback = this.e;
            try {
                futureCallback.onSuccess(Futures.c(this.d));
            } catch (Error e) {
                e = e;
                futureCallback.onFailure(e);
            } catch (RuntimeException e2) {
                e = e2;
                futureCallback.onFailure(e);
            } catch (ExecutionException e3) {
                Throwable cause = e3.getCause();
                if (cause == null) {
                    futureCallback.onFailure(e3);
                } else {
                    futureCallback.onFailure(cause);
                }
            }
        }

        public final String toString() {
            return CallbackListener.class.getSimpleName() + "," + this.e;
        }
    }

    public static void a(ListenableFuture listenableFuture, FutureCallback futureCallback, Executor executor) {
        futureCallback.getClass();
        listenableFuture.addListener(new CallbackListener(listenableFuture, futureCallback), executor);
    }

    public static ListenableFuture b(List list) {
        return new ListFuture(new ArrayList(list), true, CameraXExecutors.a());
    }

    public static Object c(Future future) {
        Preconditions.f("Future was expected to be done, " + future, future.isDone());
        return d(future);
    }

    public static Object d(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
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
        return obj;
    }

    public static ListenableFuture e(Throwable th) {
        return new ImmediateFuture.ImmediateFailedFuture(th);
    }

    public static ScheduledFuture f(RejectedExecutionException rejectedExecutionException) {
        return new ImmediateFuture.ImmediateFailedScheduledFuture(rejectedExecutionException);
    }

    public static ListenableFuture g(Object obj) {
        return obj == null ? ImmediateFuture.ImmediateSuccessfulFuture.e : new ImmediateFuture.ImmediateSuccessfulFuture(obj);
    }

    public static ListenableFuture h(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        return listenableFuture.isDone() ? listenableFuture : CallbackToFutureAdapter.a(new a(0, listenableFuture));
    }

    public static void i(CallbackToFutureAdapter.Completer completer, ListenableFuture listenableFuture) {
        j(true, listenableFuture, completer, CameraXExecutors.a());
    }

    public static void j(boolean z, final ListenableFuture listenableFuture, final CallbackToFutureAdapter.Completer completer, Executor executor) {
        listenableFuture.getClass();
        completer.getClass();
        executor.getClass();
        a(listenableFuture, new FutureCallback<Object>() { // from class: androidx.camera.core.impl.utils.futures.Futures.3
            public final /* synthetic */ Function b = Futures.f524a;

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public final void onFailure(Throwable th) {
                completer.d(th);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public final void onSuccess(Object obj) {
                CallbackToFutureAdapter.Completer completer2 = completer;
                try {
                    completer2.b(this.b.apply(obj));
                } catch (Throwable th) {
                    completer2.d(th);
                }
            }
        }, executor);
        if (z) {
            completer.a(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.Futures.4
                @Override // java.lang.Runnable
                public final void run() {
                    listenableFuture.cancel(true);
                }
            }, CameraXExecutors.a());
        }
    }

    public static ListenableFuture k(ArrayList arrayList) {
        return new ListFuture(new ArrayList(arrayList), false, CameraXExecutors.a());
    }

    public static ListenableFuture l(ListenableFuture listenableFuture, final Function function, Executor executor) {
        return m(listenableFuture, new AsyncFunction<Object, Object>() { // from class: androidx.camera.core.impl.utils.futures.Futures.1
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final ListenableFuture apply(Object obj) {
                return Futures.g(function.apply(obj));
            }
        }, executor);
    }

    public static ListenableFuture m(ListenableFuture listenableFuture, AsyncFunction asyncFunction, Executor executor) {
        ChainingListenableFuture chainingListenableFuture = new ChainingListenableFuture(asyncFunction, listenableFuture);
        listenableFuture.addListener(chainingListenableFuture, executor);
        return chainingListenableFuture;
    }
}
