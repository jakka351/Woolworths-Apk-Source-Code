package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes7.dex */
public final class ObservableTake<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class TakeObserver<T> implements Observer<T>, Disposable {
        public final Observer d;
        public boolean e;
        public Disposable f;
        public long g = 1;

        public TakeObserver(Observer observer) {
            this.d = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.f.b();
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.f, disposable)) {
                this.f = disposable;
                long j = this.g;
                Observer observer = this.d;
                if (j != 0) {
                    observer.d(this);
                    return;
                }
                this.e = true;
                disposable.dispose();
                EmptyDisposable.a(observer);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.e) {
                return;
            }
            this.e = true;
            this.f.dispose();
            this.d.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.e) {
                RxJavaPlugins.b(th);
                return;
            }
            this.e = true;
            this.f.dispose();
            this.d.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.e) {
                return;
            }
            long j = this.g;
            long j2 = j - 1;
            this.g = j2;
            if (j > 0) {
                boolean z = j2 == 0;
                this.d.onNext(obj);
                if (z) {
                    onComplete();
                }
            }
        }
    }

    public ObservableTake(Observable observable) {
        super(observable);
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        this.d.a(new TakeObserver(observer));
    }
}
