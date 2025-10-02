package io.reactivex.internal.operators.observable;

import io.reactivex.Notification;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;

/* loaded from: classes7.dex */
public final class ObservableMaterialize<T> extends AbstractObservableWithUpstream<T, Notification<T>> {

    public static final class MaterializeObserver<T> implements Observer<T>, Disposable {
        public final Observer d;
        public Disposable e;

        public MaterializeObserver(Observer observer) {
            this.d = observer;
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
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            Observer observer = this.d;
            observer.onNext(Notification.b);
            observer.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            Notification notificationA = Notification.a(th);
            Observer observer = this.d;
            observer.onNext(notificationA);
            observer.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            ObjectHelper.b(obj, "value is null");
            this.d.onNext(new Notification(obj));
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        this.d.a(new MaterializeObserver(observer));
    }
}
