package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.observers.BasicFuseableObserver;

/* loaded from: classes.dex */
public final class ObservableFilter<T> extends AbstractObservableWithUpstream<T, T> {
    public final Predicate e;

    public static final class FilterObserver<T> extends BasicFuseableObserver<T, T> {
        public final Predicate i;

        public FilterObserver(Observer observer, Predicate predicate) {
            super(observer);
            this.i = predicate;
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            int i = this.h;
            Observer observer = this.d;
            if (i != 0) {
                observer.onNext(null);
                return;
            }
            try {
                if (this.i.test(obj)) {
                    observer.onNext(obj);
                }
            } catch (Throwable th) {
                a(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            Object objPoll;
            do {
                objPoll = this.f.poll();
                if (objPoll == null) {
                    break;
                }
            } while (!this.i.test(objPoll));
            return objPoll;
        }
    }

    public ObservableFilter(Observable observable, Predicate predicate) {
        super(observable);
        this.e = predicate;
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        this.d.a(new FilterObserver(observer, this.e));
    }
}
