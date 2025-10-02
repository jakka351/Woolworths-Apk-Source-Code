package io.reactivex.internal.operators.observable;

import io.reactivex.Notification;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes7.dex */
public final class ObservableDematerialize<T, R> extends AbstractObservableWithUpstream<T, R> {

    public static final class DematerializeObserver<T, R> implements Observer<T>, Disposable {
        public final Observer d;
        public boolean e;
        public Disposable f;

        public DematerializeObserver(Observer observer) {
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
                this.d.d(this);
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
            this.d.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.e) {
                RxJavaPlugins.b(th);
            } else {
                this.e = true;
                this.d.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (!this.e) {
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.b(th);
                    this.f.dispose();
                    onError(th);
                    return;
                }
            }
            if (obj instanceof Notification) {
                Notification notification = (Notification) obj;
                if (NotificationLite.m(notification.f24218a)) {
                    RxJavaPlugins.b(notification.b());
                }
            }
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        this.d.a(new DematerializeObserver(observer));
    }
}
