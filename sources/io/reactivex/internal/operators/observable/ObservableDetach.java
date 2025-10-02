package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.EmptyComponent;

/* loaded from: classes7.dex */
public final class ObservableDetach<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class DetachObserver<T> implements Observer<T>, Disposable {
        public Observer d;
        public Disposable e;

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
            Disposable disposable = this.e;
            EmptyComponent emptyComponent = EmptyComponent.d;
            this.e = emptyComponent;
            this.d = emptyComponent;
            disposable.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            Observer observer = this.d;
            EmptyComponent emptyComponent = EmptyComponent.d;
            this.e = emptyComponent;
            this.d = emptyComponent;
            observer.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            Observer observer = this.d;
            EmptyComponent emptyComponent = EmptyComponent.d;
            this.e = emptyComponent;
            this.d = emptyComponent;
            observer.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.d.onNext(obj);
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        DetachObserver detachObserver = new DetachObserver();
        detachObserver.d = observer;
        this.d.a(detachObserver);
    }
}
