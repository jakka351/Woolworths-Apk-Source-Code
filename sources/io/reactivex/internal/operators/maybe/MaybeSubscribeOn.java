package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class MaybeSubscribeOn<T> extends AbstractMaybeWithUpstream<T, T> {
    public final Scheduler e;

    public static final class SubscribeOnMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {
        public final SequentialDisposable d = new SequentialDisposable();
        public final MaybeObserver e;

        public SubscribeOnMaybeObserver(MaybeObserver maybeObserver) {
            this.e = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return DisposableHelper.c(get());
        }

        @Override // io.reactivex.MaybeObserver
        public final void d(Disposable disposable) {
            DisposableHelper.f(this, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.a(this);
            SequentialDisposable sequentialDisposable = this.d;
            sequentialDisposable.getClass();
            DisposableHelper.a(sequentialDisposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.e.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            this.e.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            this.e.onSuccess(obj);
        }
    }

    public static final class SubscribeTask<T> implements Runnable {
        public final MaybeObserver d;
        public final Maybe e;

        public SubscribeTask(MaybeObserver maybeObserver, Maybe maybe) {
            this.d = maybeObserver;
            this.e = maybe;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.e.a(this.d);
        }
    }

    public MaybeSubscribeOn(Maybe maybe, Scheduler scheduler) {
        super(maybe);
        this.e = scheduler;
    }

    @Override // io.reactivex.Maybe
    public final void c(MaybeObserver maybeObserver) {
        SubscribeOnMaybeObserver subscribeOnMaybeObserver = new SubscribeOnMaybeObserver(maybeObserver);
        maybeObserver.d(subscribeOnMaybeObserver);
        Disposable disposableD = this.e.d(new SubscribeTask(subscribeOnMaybeObserver, this.d));
        SequentialDisposable sequentialDisposable = subscribeOnMaybeObserver.d;
        sequentialDisposable.getClass();
        DisposableHelper.d(sequentialDisposable, disposableD);
    }
}
