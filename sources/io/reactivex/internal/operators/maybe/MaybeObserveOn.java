package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class MaybeObserveOn<T> extends AbstractMaybeWithUpstream<T, T> {
    public final Scheduler e;

    public static final class ObserveOnMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable, Runnable {
        public final MaybeObserver d;
        public final Scheduler e;
        public Object f;
        public Throwable g;

        public ObserveOnMaybeObserver(MaybeObserver maybeObserver, Scheduler scheduler) {
            this.d = maybeObserver;
            this.e = scheduler;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return DisposableHelper.c(get());
        }

        @Override // io.reactivex.MaybeObserver
        public final void d(Disposable disposable) {
            if (DisposableHelper.f(this, disposable)) {
                this.d.d(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            DisposableHelper.d(this, this.e.d(this));
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            this.g = th;
            DisposableHelper.d(this, this.e.d(this));
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            this.f = obj;
            DisposableHelper.d(this, this.e.d(this));
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th = this.g;
            MaybeObserver maybeObserver = this.d;
            if (th != null) {
                this.g = null;
                maybeObserver.onError(th);
                return;
            }
            Object obj = this.f;
            if (obj == null) {
                maybeObserver.onComplete();
            } else {
                this.f = null;
                maybeObserver.onSuccess(obj);
            }
        }
    }

    public MaybeObserveOn(Maybe maybe, Scheduler scheduler) {
        super(maybe);
        this.e = scheduler;
    }

    @Override // io.reactivex.Maybe
    public final void c(MaybeObserver maybeObserver) {
        this.d.a(new ObserveOnMaybeObserver(maybeObserver, this.e));
    }
}
