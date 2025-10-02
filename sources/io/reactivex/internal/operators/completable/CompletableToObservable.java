package io.reactivex.internal.operators.completable;

import io.reactivex.CompletableObserver;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.BasicQueueDisposable;

/* loaded from: classes7.dex */
public final class CompletableToObservable<T> extends Observable<T> {
    public final CompletableFromAction d;

    public static final class ObserverCompletableObserver extends BasicQueueDisposable<Void> implements CompletableObserver {
        public final Observer d;
        public Disposable e;

        public ObserverCompletableObserver(Observer observer) {
            this.d = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.e.b();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
        }

        @Override // io.reactivex.CompletableObserver
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

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return true;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int l(int i) {
            return 2;
        }

        @Override // io.reactivex.CompletableObserver
        public final void onComplete() {
            this.d.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th) {
            this.d.onError(th);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final /* bridge */ /* synthetic */ Object poll() {
            return null;
        }
    }

    public CompletableToObservable(CompletableFromAction completableFromAction) {
        this.d = completableFromAction;
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        this.d.a(new ObserverCompletableObserver(observer));
    }
}
