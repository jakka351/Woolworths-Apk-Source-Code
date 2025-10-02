package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class SurfaceRequest {
    public static final Range p = StreamSpec.f502a;

    /* renamed from: a, reason: collision with root package name */
    public final Object f424a = new Object();
    public final Size b;
    public final DynamicRange c;
    public final Range d;
    public final CameraInternal e;
    public final boolean f;
    public final ListenableFuture g;
    public final CallbackToFutureAdapter.Completer h;
    public final ListenableFuture i;
    public final CallbackToFutureAdapter.Completer j;
    public final CallbackToFutureAdapter.Completer k;
    public final DeferrableSurface l;
    public TransformationInfo m;
    public TransformationInfoListener n;
    public Executor o;

    public static final class RequestCancelledException extends RuntimeException {
    }

    @AutoValue
    public static abstract class Result {

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface ResultCode {
        }

        public abstract int a();

        public abstract Surface b();
    }

    @AutoValue
    public static abstract class TransformationInfo {
        public static TransformationInfo g(Rect rect, int i, int i2, boolean z, Matrix matrix, boolean z2) {
            return new AutoValue_SurfaceRequest_TransformationInfo(rect, i, i2, z, matrix, z2);
        }

        public abstract Rect a();

        public abstract int b();

        public abstract Matrix c();

        public abstract int d();

        public abstract boolean e();

        public abstract boolean f();
    }

    public interface TransformationInfoListener {
        void f(TransformationInfo transformationInfo);
    }

    public SurfaceRequest(Size size, CameraInternal cameraInternal, boolean z, DynamicRange dynamicRange, Range range, final androidx.camera.core.processing.l lVar) {
        this.b = size;
        this.e = cameraInternal;
        this.f = z;
        this.c = dynamicRange;
        this.d = range;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final AtomicReference atomicReference = new AtomicReference(null);
        final int i = 0;
        final ListenableFuture listenableFutureA = CallbackToFutureAdapter.a(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.o
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                int i2 = i;
                String str2 = str;
                AtomicReference atomicReference2 = atomicReference;
                switch (i2) {
                    case 0:
                        Range range2 = SurfaceRequest.p;
                        atomicReference2.set(completer);
                        return str2 + "-cancellation";
                    case 1:
                        Range range3 = SurfaceRequest.p;
                        atomicReference2.set(completer);
                        return str2 + "-status";
                    default:
                        Range range4 = SurfaceRequest.p;
                        atomicReference2.set(completer);
                        return str2 + "-Surface";
                }
            }
        });
        final CallbackToFutureAdapter.Completer completer = (CallbackToFutureAdapter.Completer) atomicReference.get();
        completer.getClass();
        this.k = completer;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        final int i2 = 1;
        ListenableFuture listenableFutureA2 = CallbackToFutureAdapter.a(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.o
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer2) {
                int i22 = i2;
                String str2 = str;
                AtomicReference atomicReference22 = atomicReference2;
                switch (i22) {
                    case 0:
                        Range range2 = SurfaceRequest.p;
                        atomicReference22.set(completer2);
                        return str2 + "-cancellation";
                    case 1:
                        Range range3 = SurfaceRequest.p;
                        atomicReference22.set(completer2);
                        return str2 + "-status";
                    default:
                        Range range4 = SurfaceRequest.p;
                        atomicReference22.set(completer2);
                        return str2 + "-Surface";
                }
            }
        });
        this.i = listenableFutureA2;
        Futures.a(listenableFutureA2, new FutureCallback<Void>() { // from class: androidx.camera.core.SurfaceRequest.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public final void onFailure(Throwable th) {
                if (th instanceof RequestCancelledException) {
                    Preconditions.f(null, listenableFutureA.cancel(false));
                } else {
                    Preconditions.f(null, completer.b(null));
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public final void onSuccess(Object obj) {
                Preconditions.f(null, completer.b(null));
            }
        }, CameraXExecutors.a());
        final CallbackToFutureAdapter.Completer completer2 = (CallbackToFutureAdapter.Completer) atomicReference2.get();
        completer2.getClass();
        final AtomicReference atomicReference3 = new AtomicReference(null);
        final int i3 = 2;
        ListenableFuture listenableFutureA3 = CallbackToFutureAdapter.a(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.o
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer22) {
                int i22 = i3;
                String str2 = str;
                AtomicReference atomicReference22 = atomicReference3;
                switch (i22) {
                    case 0:
                        Range range2 = SurfaceRequest.p;
                        atomicReference22.set(completer22);
                        return str2 + "-cancellation";
                    case 1:
                        Range range3 = SurfaceRequest.p;
                        atomicReference22.set(completer22);
                        return str2 + "-status";
                    default:
                        Range range4 = SurfaceRequest.p;
                        atomicReference22.set(completer22);
                        return str2 + "-Surface";
                }
            }
        });
        this.g = listenableFutureA3;
        CallbackToFutureAdapter.Completer completer3 = (CallbackToFutureAdapter.Completer) atomicReference3.get();
        completer3.getClass();
        this.h = completer3;
        DeferrableSurface deferrableSurface = new DeferrableSurface(size) { // from class: androidx.camera.core.SurfaceRequest.2
            @Override // androidx.camera.core.impl.DeferrableSurface
            public final ListenableFuture f() {
                return SurfaceRequest.this.g;
            }
        };
        this.l = deferrableSurface;
        final ListenableFuture listenableFutureH = Futures.h(deferrableSurface.e);
        Futures.a(listenableFutureA3, new FutureCallback<Surface>() { // from class: androidx.camera.core.SurfaceRequest.3
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public final void onFailure(Throwable th) {
                boolean z2 = th instanceof CancellationException;
                CallbackToFutureAdapter.Completer completer4 = completer2;
                if (z2) {
                    Preconditions.f(null, completer4.d(new RequestCancelledException(YU.a.o(new StringBuilder(), str, " cancelled."), th)));
                } else {
                    completer4.b(null);
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public final void onSuccess(Object obj) {
                Futures.i(completer2, listenableFutureH);
            }
        }, CameraXExecutors.a());
        listenableFutureH.addListener(new k(this, 2), CameraXExecutors.a());
        Executor executorA = CameraXExecutors.a();
        AtomicReference atomicReference4 = new AtomicReference(null);
        Futures.a(CallbackToFutureAdapter.a(new d(2, this, atomicReference4)), new FutureCallback<Void>() { // from class: androidx.camera.core.SurfaceRequest.5
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public final void onFailure(Throwable th) {
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public final void onSuccess(Object obj) {
                lVar.run();
            }
        }, executorA);
        CallbackToFutureAdapter.Completer completer4 = (CallbackToFutureAdapter.Completer) atomicReference4.get();
        completer4.getClass();
        this.j = completer4;
    }

    public final void a(final Surface surface, Executor executor, final Consumer consumer) throws ExecutionException, InterruptedException {
        if (!this.h.b(surface)) {
            ListenableFuture listenableFuture = this.g;
            if (!listenableFuture.isCancelled()) {
                Preconditions.f(null, listenableFuture.isDone());
                try {
                    listenableFuture.get();
                    final int i = 0;
                    executor.execute(new Runnable() { // from class: androidx.camera.core.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2 = i;
                            Surface surface2 = surface;
                            Consumer consumer2 = consumer;
                            switch (i2) {
                                case 0:
                                    Range range = SurfaceRequest.p;
                                    consumer2.accept(new AutoValue_SurfaceRequest_Result(3, surface2));
                                    break;
                                default:
                                    Range range2 = SurfaceRequest.p;
                                    consumer2.accept(new AutoValue_SurfaceRequest_Result(4, surface2));
                                    break;
                            }
                        }
                    });
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    final int i2 = 1;
                    executor.execute(new Runnable() { // from class: androidx.camera.core.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i22 = i2;
                            Surface surface2 = surface;
                            Consumer consumer2 = consumer;
                            switch (i22) {
                                case 0:
                                    Range range = SurfaceRequest.p;
                                    consumer2.accept(new AutoValue_SurfaceRequest_Result(3, surface2));
                                    break;
                                default:
                                    Range range2 = SurfaceRequest.p;
                                    consumer2.accept(new AutoValue_SurfaceRequest_Result(4, surface2));
                                    break;
                            }
                        }
                    });
                    return;
                }
            }
        }
        Futures.a(this.i, new FutureCallback<Void>() { // from class: androidx.camera.core.SurfaceRequest.4
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public final void onFailure(Throwable th) {
                Preconditions.f("Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th, th instanceof RequestCancelledException);
                consumer.accept(new AutoValue_SurfaceRequest_Result(1, surface));
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public final void onSuccess(Object obj) {
                consumer.accept(new AutoValue_SurfaceRequest_Result(0, surface));
            }
        }, executor);
    }

    public final void b(Executor executor, TransformationInfoListener transformationInfoListener) {
        TransformationInfo transformationInfo;
        synchronized (this.f424a) {
            this.n = transformationInfoListener;
            this.o = executor;
            transformationInfo = this.m;
        }
        if (transformationInfo != null) {
            executor.execute(new m(transformationInfoListener, transformationInfo, 1));
        }
    }

    public final void c() {
        this.h.d(new DeferrableSurface.SurfaceUnavailableException("Surface request will not complete."));
    }
}
