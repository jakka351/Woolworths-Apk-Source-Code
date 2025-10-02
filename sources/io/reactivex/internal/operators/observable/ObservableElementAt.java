package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;

/* loaded from: classes7.dex */
public final class ObservableElementAt<T> extends AbstractObservableWithUpstream<T, T> {
    public final boolean e;

    public static final class ElementAtObserver<T> implements Observer<T>, Disposable {
        public final Observer d;
        public final boolean e;
        public Disposable f;
        public long g;
        public boolean h;

        public ElementAtObserver(Observer observer, boolean z) {
            this.d = observer;
            this.e = z;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.f.b();
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.f, disposable)) {
                this.f = disposable;
                this.d.d(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.h) {
                return;
            }
            this.h = true;
            boolean z = this.e;
            Observer observer = this.d;
            if (z) {
                observer.onError(new NoSuchElementException());
            } else {
                observer.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.h) {
                RxJavaPlugins.b(th);
            } else {
                this.h = true;
                this.d.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.h) {
                return;
            }
            long j = this.g;
            if (j != 0) {
                this.g = j + 1;
                return;
            }
            this.h = true;
            this.f.dispose();
            Observer observer = this.d;
            observer.onNext(obj);
            observer.onComplete();
        }
    }

    public ObservableElementAt(boolean z) {
        super(null);
        this.e = z;
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        this.d.a(new ElementAtObserver(observer, this.e));
    }
}
