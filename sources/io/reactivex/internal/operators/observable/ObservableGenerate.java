package io.reactivex.internal.operators.observable;

import io.reactivex.Emitter;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes7.dex */
public final class ObservableGenerate<T, S> extends Observable<T> {

    public static final class GeneratorDisposable<T, S> implements Emitter<T>, Disposable {
        public volatile boolean d;
        public boolean e;

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.d;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.d = true;
        }

        @Override // io.reactivex.Emitter
        public final void onError(Throwable th) {
            if (this.e) {
                RxJavaPlugins.b(th);
            } else {
                this.e = true;
                throw null;
            }
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.b(th);
            EmptyDisposable.e(th, observer);
        }
    }
}
