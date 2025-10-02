package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.internal.observers.BasicFuseableObserver;

/* loaded from: classes7.dex */
public final class ObservableDoAfterNext<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class DoAfterObserver<T> extends BasicFuseableObserver<T, T> {
        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.d.onNext(obj);
            if (this.h != 0) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                a(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            Object objPoll = this.f.poll();
            if (objPoll == null) {
                return objPoll;
            }
            throw null;
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        this.d.a(new DoAfterObserver(observer));
    }
}
