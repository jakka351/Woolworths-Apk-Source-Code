package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.SerializedObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ObservableDebounceTimed<T> extends AbstractObservableWithUpstream<T, T> {
    public final long e;
    public final Scheduler f;

    public static final class DebounceEmitter<T> extends AtomicReference<Disposable> implements Runnable, Disposable {
        public final Object d;
        public final long e;
        public final DebounceTimedObserver f;
        public final AtomicBoolean g = new AtomicBoolean();

        public DebounceEmitter(Object obj, long j, DebounceTimedObserver debounceTimedObserver) {
            this.d = obj;
            this.e = j;
            this.f = debounceTimedObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return get() == DisposableHelper.d;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.g.compareAndSet(false, true)) {
                DebounceTimedObserver debounceTimedObserver = this.f;
                long j = this.e;
                Object obj = this.d;
                if (j == debounceTimedObserver.i) {
                    debounceTimedObserver.d.onNext(obj);
                    DisposableHelper.a(this);
                }
            }
        }
    }

    public static final class DebounceTimedObserver<T> implements Observer<T>, Disposable {
        public final SerializedObserver d;
        public final long e;
        public final Scheduler.Worker f;
        public Disposable g;
        public Disposable h;
        public volatile long i;
        public boolean j;

        public DebounceTimedObserver(SerializedObserver serializedObserver, long j, Scheduler.Worker worker) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.d = serializedObserver;
            this.e = j;
            this.f = worker;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.f.b();
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.g, disposable)) {
                this.g = disposable;
                this.d.d(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.g.dispose();
            this.f.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.j) {
                return;
            }
            this.j = true;
            Disposable disposable = this.h;
            if (disposable != null) {
                DisposableHelper.a((DebounceEmitter) disposable);
            }
            DebounceEmitter debounceEmitter = (DebounceEmitter) disposable;
            if (debounceEmitter != null) {
                debounceEmitter.run();
            }
            this.d.onComplete();
            this.f.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.j) {
                RxJavaPlugins.b(th);
                return;
            }
            Disposable disposable = this.h;
            if (disposable != null) {
                DisposableHelper.a((DebounceEmitter) disposable);
            }
            this.j = true;
            this.d.onError(th);
            this.f.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.j) {
                return;
            }
            long j = this.i + 1;
            this.i = j;
            Disposable disposable = this.h;
            if (disposable != null) {
                DisposableHelper.a((DebounceEmitter) disposable);
            }
            DebounceEmitter debounceEmitter = new DebounceEmitter(obj, j, this);
            this.h = debounceEmitter;
            DisposableHelper.d(debounceEmitter, this.f.d(debounceEmitter, this.e, TimeUnit.MILLISECONDS));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObservableDebounceTimed(Observable observable, long j, Scheduler scheduler) {
        super(observable);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.e = j;
        this.f = scheduler;
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        SerializedObserver serializedObserver = new SerializedObserver(observer);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.d.a(new DebounceTimedObserver(serializedObserver, this.e, this.f.c()));
    }
}
