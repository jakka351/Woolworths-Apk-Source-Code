package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.QueueDrainObserver;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.observers.SerializedObserver;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subjects.UnicastSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ObservableWindowBoundarySelector<T, B, V> extends AbstractObservableWithUpstream<T, Observable<T>> {

    public static final class OperatorWindowBoundaryCloseObserver<T, V> extends DisposableObserver<V> {
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
            dispose();
            onComplete();
        }
    }

    public static final class OperatorWindowBoundaryOpenObserver<T, B> extends DisposableObserver<B> {
        public final WindowBoundaryMainObserver e;

        public OperatorWindowBoundaryOpenObserver(WindowBoundaryMainObserver windowBoundaryMainObserver) {
            this.e = windowBoundaryMainObserver;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.e.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            WindowBoundaryMainObserver windowBoundaryMainObserver = this.e;
            windowBoundaryMainObserver.k.dispose();
            windowBoundaryMainObserver.j.dispose();
            windowBoundaryMainObserver.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            WindowBoundaryMainObserver windowBoundaryMainObserver = this.e;
            windowBoundaryMainObserver.f.offer(new WindowOperation(null, obj));
            if (windowBoundaryMainObserver.f()) {
                windowBoundaryMainObserver.j();
            }
        }
    }

    public static final class WindowBoundaryMainObserver<T, B, V> extends QueueDrainObserver<T, Object, Observable<T>> implements Disposable {
        public final CompositeDisposable j;
        public Disposable k;
        public final AtomicReference l;
        public final ArrayList m;
        public final AtomicLong n;
        public final AtomicBoolean o;

        public WindowBoundaryMainObserver(SerializedObserver serializedObserver) {
            super(serializedObserver, new MpscLinkedQueue());
            this.l = new AtomicReference();
            AtomicLong atomicLong = new AtomicLong();
            this.n = atomicLong;
            this.o = new AtomicBoolean();
            this.j = new CompositeDisposable();
            this.m = new ArrayList();
            atomicLong.lazySet(1L);
        }

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        public final void a(Observer observer, Object obj) {
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.o.get();
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            AtomicReference atomicReference;
            if (DisposableHelper.l(this.k, disposable)) {
                this.k = disposable;
                this.e.d(this);
                if (this.o.get()) {
                    return;
                }
                OperatorWindowBoundaryOpenObserver operatorWindowBoundaryOpenObserver = new OperatorWindowBoundaryOpenObserver(this);
                do {
                    atomicReference = this.l;
                    if (atomicReference.compareAndSet(null, operatorWindowBoundaryOpenObserver)) {
                        throw null;
                    }
                } while (atomicReference.get() == null);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.o.compareAndSet(false, true)) {
                DisposableHelper.a(this.l);
                if (this.n.decrementAndGet() == 0) {
                    this.k.dispose();
                }
            }
        }

        public final void j() {
            MpscLinkedQueue mpscLinkedQueue = this.f;
            SerializedObserver serializedObserver = this.e;
            ArrayList arrayList = this.m;
            int i = 1;
            while (true) {
                boolean z = this.h;
                Object objPoll = mpscLinkedQueue.poll();
                boolean z2 = objPoll == null;
                if (z && z2) {
                    this.j.dispose();
                    DisposableHelper.a(this.l);
                    Throwable th = this.i;
                    if (th != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((UnicastSubject) it.next()).onError(th);
                        }
                    } else {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ((UnicastSubject) it2.next()).onComplete();
                        }
                    }
                    arrayList.clear();
                    return;
                }
                if (z2) {
                    i = i(-i);
                    if (i == 0) {
                        return;
                    }
                } else if (objPoll instanceof WindowOperation) {
                    WindowOperation windowOperation = (WindowOperation) objPoll;
                    UnicastSubject unicastSubject = windowOperation.f24233a;
                    if (unicastSubject != null) {
                        if (arrayList.remove(unicastSubject)) {
                            windowOperation.f24233a.onComplete();
                            if (this.n.decrementAndGet() == 0) {
                                this.j.dispose();
                                DisposableHelper.a(this.l);
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else if (this.o.get()) {
                        continue;
                    } else {
                        UnicastSubject unicastSubjectN = UnicastSubject.n();
                        arrayList.add(unicastSubjectN);
                        serializedObserver.onNext(unicastSubjectN);
                        try {
                            throw null;
                        } catch (Throwable th2) {
                            Exceptions.b(th2);
                            this.o.set(true);
                            serializedObserver.onError(th2);
                        }
                    }
                } else {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        ((UnicastSubject) it3.next()).onNext(objPoll);
                    }
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.h) {
                return;
            }
            this.h = true;
            if (f()) {
                j();
            }
            if (this.n.decrementAndGet() == 0) {
                this.j.dispose();
            }
            this.e.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.h) {
                RxJavaPlugins.b(th);
                return;
            }
            this.i = th;
            this.h = true;
            if (f()) {
                j();
            }
            if (this.n.decrementAndGet() == 0) {
                this.j.dispose();
            }
            this.e.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (g()) {
                Iterator it = this.m.iterator();
                while (it.hasNext()) {
                    ((UnicastSubject) it.next()).onNext(obj);
                }
                if (i(-1) == 0) {
                    return;
                }
            } else {
                this.f.offer(obj);
                if (!f()) {
                    return;
                }
            }
            j();
        }
    }

    public static final class WindowOperation<T, B> {

        /* renamed from: a, reason: collision with root package name */
        public final UnicastSubject f24233a;
        public final Object b;

        public WindowOperation(UnicastSubject unicastSubject, Object obj) {
            this.f24233a = unicastSubject;
            this.b = obj;
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        this.d.a(new WindowBoundaryMainObserver(new SerializedObserver(observer)));
    }
}
