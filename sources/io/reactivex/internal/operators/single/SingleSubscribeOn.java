package io.reactivex.internal.operators.single;

import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class SingleSubscribeOn<T> extends Single<T> {
    public final Single d;
    public final Scheduler e;

    public static final class SubscribeOnObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable, Runnable {
        public final SingleObserver d;
        public final SequentialDisposable e = new SequentialDisposable();
        public final Single f;

        public SubscribeOnObserver(SingleObserver singleObserver, Single single) {
            this.d = singleObserver;
            this.f = single;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return DisposableHelper.c(get());
        }

        @Override // io.reactivex.SingleObserver
        public final void d(Disposable disposable) {
            DisposableHelper.f(this, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.a(this);
            SequentialDisposable sequentialDisposable = this.e;
            sequentialDisposable.getClass();
            DisposableHelper.a(sequentialDisposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            this.d.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            this.d.onSuccess(obj);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f.a(this);
        }
    }

    public SingleSubscribeOn(Single single, Scheduler scheduler) {
        this.d = single;
        this.e = scheduler;
    }

    @Override // io.reactivex.Single
    public final void g(SingleObserver singleObserver) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(singleObserver, this.d);
        singleObserver.d(subscribeOnObserver);
        Disposable disposableD = this.e.d(subscribeOnObserver);
        SequentialDisposable sequentialDisposable = subscribeOnObserver.e;
        sequentialDisposable.getClass();
        DisposableHelper.d(sequentialDisposable, disposableD);
    }
}
