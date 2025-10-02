package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.ResettableConnectable;
import io.reactivex.internal.fuseable.HasUpstreamObservableSource;
import io.reactivex.observables.ConnectableObservable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ObservablePublishAlt<T> extends ConnectableObservable<T> implements HasUpstreamObservableSource<T>, ResettableConnectable {

    public static final class InnerDisposable<T> extends AtomicReference<PublishConnection<T>> implements Disposable {
        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return get() == null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            InnerDisposable<T>[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            PublishConnection<T> andSet = getAndSet(null);
            if (andSet != null) {
                do {
                    innerDisposableArr = andSet.get();
                    int length = innerDisposableArr.length;
                    if (length == 0) {
                        return;
                    }
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            i = -1;
                            break;
                        } else if (innerDisposableArr[i] == this) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i < 0) {
                        return;
                    }
                    if (length != 1) {
                        innerDisposableArr2 = new InnerDisposable[length - 1];
                        System.arraycopy(innerDisposableArr, 0, innerDisposableArr2, 0, i);
                        System.arraycopy(innerDisposableArr, i + 1, innerDisposableArr2, i, (length - i) - 1);
                    } else {
                        innerDisposableArr2 = PublishConnection.d;
                    }
                } while (!andSet.compareAndSet(innerDisposableArr, innerDisposableArr2));
            }
        }
    }

    public static final class PublishConnection<T> extends AtomicReference<InnerDisposable<T>[]> implements Observer<T>, Disposable {
        public static final InnerDisposable[] d = new InnerDisposable[0];
        public static final InnerDisposable[] e = new InnerDisposable[0];

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return get() == e;
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            DisposableHelper.f(null, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            getAndSet(e);
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            InnerDisposable<T>[] innerDisposableArr = get();
            if (innerDisposableArr.length <= 0) {
                return;
            }
            innerDisposableArr[0].getClass();
            throw null;
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        throw null;
    }
}
