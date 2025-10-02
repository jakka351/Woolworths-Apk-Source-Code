package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;

/* loaded from: classes7.dex */
public final class ObservableTakeLast<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class TakeLastObserver<T> extends ArrayDeque<T> implements Observer<T>, Disposable {
        public final Observer d;
        public Disposable e;
        public volatile boolean f;

        public TakeLastObserver(Observer observer) {
            this.d = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.f;
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
            if (this.f) {
                return;
            }
            this.f = true;
            this.e.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            Observer observer = this.d;
            while (!this.f) {
                T tPoll = poll();
                if (tPoll == null) {
                    if (this.f) {
                        return;
                    }
                    observer.onComplete();
                    return;
                }
                observer.onNext(tPoll);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.d.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (size() == 0) {
                poll();
            }
            offer(obj);
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        this.d.a(new TakeLastObserver(observer));
    }
}
