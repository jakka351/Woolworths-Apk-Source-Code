package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.observers.SerializedObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ObservableDebounce<T, U> extends AbstractObservableWithUpstream<T, T> {

    public static final class DebounceObserver<T, U> implements Observer<T>, Disposable {
        public final SerializedObserver d;
        public Disposable e;
        public final AtomicReference f = new AtomicReference();
        public volatile long g;
        public boolean h;

        public static final class DebounceInnerObserver<T, U> extends DisposableObserver<U> {
            public boolean e;

            public final void a() {
                throw null;
            }

            @Override // io.reactivex.Observer
            public final void onComplete() {
                if (this.e) {
                    return;
                }
                this.e = true;
                a();
            }

            @Override // io.reactivex.Observer
            public final void onError(Throwable th) {
                if (this.e) {
                    RxJavaPlugins.b(th);
                } else {
                    this.e = true;
                    throw null;
                }
            }

            @Override // io.reactivex.Observer
            public final void onNext(Object obj) {
                if (this.e) {
                    return;
                }
                this.e = true;
                dispose();
                a();
            }
        }

        public DebounceObserver(SerializedObserver serializedObserver) {
            this.d = serializedObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.e.b();
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.e, disposable)) {
                this.e = disposable;
                this.d.d(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.e.dispose();
            DisposableHelper.a(this.f);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.h) {
                return;
            }
            this.h = true;
            AtomicReference atomicReference = this.f;
            Disposable disposable = (Disposable) atomicReference.get();
            if (disposable != DisposableHelper.d) {
                DebounceInnerObserver debounceInnerObserver = (DebounceInnerObserver) disposable;
                if (debounceInnerObserver != null) {
                    debounceInnerObserver.a();
                }
                DisposableHelper.a(atomicReference);
                this.d.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            DisposableHelper.a(this.f);
            this.d.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.h) {
                return;
            }
            this.g++;
            Disposable disposable = (Disposable) this.f.get();
            if (disposable != null) {
                disposable.dispose();
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                dispose();
                this.d.onError(th);
            }
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        this.d.a(new DebounceObserver(new SerializedObserver(observer)));
    }
}
