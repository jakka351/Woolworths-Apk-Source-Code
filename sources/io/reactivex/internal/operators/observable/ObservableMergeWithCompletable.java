package io.reactivex.internal.operators.observable;

import io.reactivex.CompletableObserver;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ObservableMergeWithCompletable<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class MergeWithObserver<T> extends AtomicInteger implements Observer<T>, Disposable {
        public final Observer d;
        public final AtomicReference e = new AtomicReference();
        public final OtherObserver f = new OtherObserver(this);
        public final AtomicThrowable g = new AtomicThrowable();
        public volatile boolean h;
        public volatile boolean i;

        public static final class OtherObserver extends AtomicReference<Disposable> implements CompletableObserver {
            public final MergeWithObserver d;

            public OtherObserver(MergeWithObserver mergeWithObserver) {
                this.d = mergeWithObserver;
            }

            @Override // io.reactivex.CompletableObserver
            public final void d(Disposable disposable) {
                DisposableHelper.f(this, disposable);
            }

            @Override // io.reactivex.CompletableObserver
            public final void onComplete() {
                MergeWithObserver mergeWithObserver = this.d;
                mergeWithObserver.i = true;
                if (mergeWithObserver.h) {
                    HalfSerializer.a(mergeWithObserver.d, mergeWithObserver, mergeWithObserver.g);
                }
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(Throwable th) {
                MergeWithObserver mergeWithObserver = this.d;
                DisposableHelper.a(mergeWithObserver.e);
                HalfSerializer.c(mergeWithObserver.d, th, mergeWithObserver, mergeWithObserver.g);
            }
        }

        public MergeWithObserver(Observer observer) {
            this.d = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return DisposableHelper.c((Disposable) this.e.get());
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            DisposableHelper.f(this.e, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.a(this.e);
            DisposableHelper.a(this.f);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.h = true;
            if (this.i) {
                HalfSerializer.a(this.d, this, this.g);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            DisposableHelper.a(this.f);
            HalfSerializer.c(this.d, th, this, this.g);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            HalfSerializer.e(this.d, obj, this, this.g);
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        MergeWithObserver mergeWithObserver = new MergeWithObserver(observer);
        observer.d(mergeWithObserver);
        this.d.a(mergeWithObserver);
        throw null;
    }
}
