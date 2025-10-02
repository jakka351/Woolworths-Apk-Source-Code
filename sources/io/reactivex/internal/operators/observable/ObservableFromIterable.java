package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicQueueDisposable;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class ObservableFromIterable<T> extends Observable<T> {

    public static final class FromIterableDisposable<T> extends BasicQueueDisposable<T> {
        public final Observer d;
        public final Iterator e;
        public volatile boolean f;
        public boolean g;
        public boolean h;
        public boolean i;

        public FromIterableDisposable(Observer observer, Iterator it) {
            this.d = observer;
            this.e = it;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.f;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.h = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f = true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.h;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int l(int i) {
            this.g = true;
            return 1;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            if (this.h) {
                return null;
            }
            boolean z = this.i;
            Iterator it = this.e;
            if (!z) {
                this.i = true;
            } else if (!it.hasNext()) {
                this.h = true;
                return null;
            }
            Object next = it.next();
            ObjectHelper.b(next, "The iterator returned a null value");
            return next;
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
