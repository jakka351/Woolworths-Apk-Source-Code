package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicFuseableObserver;

/* loaded from: classes7.dex */
public final class ObservableMap<T, U> extends AbstractObservableWithUpstream<T, U> {
    public final Function e;

    public static final class MapObserver<T, U> extends BasicFuseableObserver<T, U> {
        public final Function i;

        public MapObserver(Observer observer, Function function) {
            super(observer);
            this.i = function;
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.g) {
                return;
            }
            int i = this.h;
            Observer observer = this.d;
            if (i != 0) {
                observer.onNext(null);
                return;
            }
            try {
                Object objMo0apply = this.i.mo0apply(obj);
                ObjectHelper.b(objMo0apply, "The mapper function returned a null value.");
                observer.onNext(objMo0apply);
            } catch (Throwable th) {
                a(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            Object objPoll = this.f.poll();
            if (objPoll == null) {
                return null;
            }
            Object objMo0apply = this.i.mo0apply(objPoll);
            ObjectHelper.b(objMo0apply, "The mapper function returned a null value.");
            return objMo0apply;
        }
    }

    public ObservableMap(Observable observable, Function function) {
        super(observable);
        this.e = function;
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        this.d.a(new MapObserver(observer, this.e));
    }
}
