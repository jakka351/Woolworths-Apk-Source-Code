package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.observers.QueueDrainObserver;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.observers.SerializedObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ObservableBufferBoundarySupplier<T, U extends Collection<? super T>, B> extends AbstractObservableWithUpstream<T, U> {

    public static final class BufferBoundaryObserver<T, U extends Collection<? super T>, B> extends DisposableObserver<B> {
        public boolean e;

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.e) {
                return;
            }
            this.e = true;
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.e) {
                RxJavaPlugins.b(th);
            } else {
                this.e = true;
                throw null;
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.e) {
                return;
            }
            this.e = true;
            dispose();
            throw null;
        }
    }

    public static final class BufferBoundarySupplierObserver<T, U extends Collection<? super T>, B> extends QueueDrainObserver<T, U, U> implements Observer<T>, Disposable {
        public Disposable j;
        public final AtomicReference k;
        public Collection l;

        public BufferBoundarySupplierObserver(SerializedObserver serializedObserver) {
            super(serializedObserver, new MpscLinkedQueue());
            this.k = new AtomicReference();
        }

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        public final void a(Observer observer, Object obj) {
            this.e.onNext((Collection) obj);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.g;
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.j, disposable)) {
                this.j = disposable;
                SerializedObserver serializedObserver = this.e;
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.b(th);
                    this.g = true;
                    disposable.dispose();
                    EmptyDisposable.e(th, serializedObserver);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.g) {
                return;
            }
            this.g = true;
            this.j.dispose();
            DisposableHelper.a(this.k);
            if (f()) {
                this.f.clear();
            }
        }

        public final void j() {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                dispose();
                this.e.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            synchronized (this) {
                try {
                    Collection collection = this.l;
                    if (collection == null) {
                        return;
                    }
                    this.l = null;
                    this.f.offer(collection);
                    this.h = true;
                    if (f()) {
                        QueueDrainHelper.b(this.f, this.e, this, this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            dispose();
            this.e.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            synchronized (this) {
                try {
                    Collection collection = this.l;
                    if (collection == null) {
                        return;
                    }
                    collection.add(obj);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        this.d.a(new BufferBoundarySupplierObserver(new SerializedObserver(observer)));
    }
}
