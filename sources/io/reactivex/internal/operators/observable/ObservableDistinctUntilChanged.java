package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicFuseableObserver;

/* loaded from: classes.dex */
public final class ObservableDistinctUntilChanged<T, K> extends AbstractObservableWithUpstream<T, T> {
    public final Function e;
    public final BiPredicate f;

    public static final class DistinctUntilChangedObserver<T, K> extends BasicFuseableObserver<T, T> {
        public final Function i;
        public final BiPredicate j;
        public Object k;
        public boolean l;

        public DistinctUntilChangedObserver(Observer observer) {
            super(observer);
            this.i = Functions.f24224a;
            this.j = ObjectHelper.f24225a;
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.g) {
                return;
            }
            int i = this.h;
            Observer observer = this.d;
            if (i != 0) {
                observer.onNext(obj);
                return;
            }
            try {
                if (this.l) {
                    boolean zTest = ObjectHelper.f24225a.test(this.k, obj);
                    this.k = obj;
                    if (zTest) {
                        return;
                    }
                } else {
                    this.l = true;
                    this.k = obj;
                }
                observer.onNext(obj);
            } catch (Throwable th) {
                a(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            while (true) {
                Object objPoll = this.f.poll();
                if (objPoll == null) {
                    return null;
                }
                if (!this.l) {
                    this.l = true;
                    this.k = objPoll;
                    return objPoll;
                }
                if (!ObjectHelper.f24225a.test(this.k, objPoll)) {
                    this.k = objPoll;
                    return objPoll;
                }
                this.k = objPoll;
            }
        }
    }

    public ObservableDistinctUntilChanged(Observable observable) {
        super(observable);
        this.e = Functions.f24224a;
        this.f = ObjectHelper.f24225a;
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        this.d.a(new DistinctUntilChangedObserver(observer));
    }
}
