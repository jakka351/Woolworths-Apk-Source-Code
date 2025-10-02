package io.reactivex.internal.operators.maybe;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class MaybeConcatArray<T> extends Flowable<T> {

    public static final class ConcatMaybeObserver<T> extends AtomicInteger implements MaybeObserver<T>, Subscription {
        public final Subscriber d;
        public long h;
        public final AtomicLong e = new AtomicLong();
        public final SequentialDisposable g = new SequentialDisposable();
        public final AtomicReference f = new AtomicReference(NotificationLite.d);

        public ConcatMaybeObserver(Subscriber subscriber) {
            this.d = subscriber;
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            do {
                SequentialDisposable sequentialDisposable = this.g;
                boolean zB = sequentialDisposable.b();
                AtomicReference atomicReference = this.f;
                if (zB) {
                    atomicReference.lazySet(null);
                    return;
                }
                Object obj = atomicReference.get();
                if (obj != null) {
                    if (obj != NotificationLite.d) {
                        long j = this.h;
                        if (j != this.e.get()) {
                            this.h = j + 1;
                            atomicReference.lazySet(null);
                            this.d.onNext(obj);
                        }
                    } else {
                        atomicReference.lazySet(null);
                    }
                    if (!sequentialDisposable.b()) {
                        throw null;
                    }
                }
            } while (decrementAndGet() != 0);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SequentialDisposable sequentialDisposable = this.g;
            sequentialDisposable.getClass();
            DisposableHelper.a(sequentialDisposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void d(Disposable disposable) {
            SequentialDisposable sequentialDisposable = this.g;
            sequentialDisposable.getClass();
            DisposableHelper.d(sequentialDisposable, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f.lazySet(NotificationLite.d);
            a();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            this.d.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            this.f.lazySet(obj);
            a();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.f(j)) {
                BackpressureHelper.a(this.e, j);
                a();
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        ConcatMaybeObserver concatMaybeObserver = new ConcatMaybeObserver(flowableSubscriber);
        flowableSubscriber.m(concatMaybeObserver);
        concatMaybeObserver.a();
    }
}
