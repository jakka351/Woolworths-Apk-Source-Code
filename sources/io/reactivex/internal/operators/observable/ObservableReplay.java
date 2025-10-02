package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.ResettableConnectable;
import io.reactivex.internal.fuseable.HasUpstreamObservableSource;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.observables.ConnectableObservable;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Timed;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ObservableReplay<T> extends ConnectableObservable<T> implements HasUpstreamObservableSource<T>, ResettableConnectable {

    public static abstract class BoundedReplayBuffer<T> extends AtomicReference<Node> implements ReplayBuffer<T> {
        public Node d;
        public int e;

        public Object a(Object obj) {
            return obj;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        public final void b(Object obj) {
            Node node = new Node(a(obj));
            this.d.set(node);
            this.d = node;
            this.e++;
            f();
        }

        public Node c() {
            return get();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        public final void complete() {
            Node node = new Node(a(NotificationLite.d));
            this.d.set(node);
            this.d = node;
            this.e++;
            h();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        public final void d(Throwable th) {
            Node node = new Node(a(NotificationLite.e(th)));
            this.d.set(node);
            this.d = node;
            this.e++;
            h();
        }

        public Object e(Object obj) {
            return obj;
        }

        public abstract void f();

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        public final void g(InnerDisposable innerDisposable) {
            if (innerDisposable.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                Node nodeC = (Node) innerDisposable.f;
                if (nodeC == null) {
                    nodeC = c();
                    innerDisposable.f = nodeC;
                }
                while (!innerDisposable.g) {
                    Node node = nodeC.get();
                    if (node != null) {
                        if (NotificationLite.a(innerDisposable.e, e(node.d))) {
                            innerDisposable.f = null;
                            return;
                        }
                        nodeC = node;
                    } else {
                        innerDisposable.f = nodeC;
                        iAddAndGet = innerDisposable.addAndGet(-iAddAndGet);
                    }
                }
                innerDisposable.f = null;
                return;
            } while (iAddAndGet != 0);
        }

        public void h() {
            Node node = get();
            if (node.d != null) {
                Node node2 = new Node(null);
                node2.lazySet(node.get());
                set(node2);
            }
        }
    }

    public interface BufferSupplier<T> {
        ReplayBuffer call();
    }

    public static final class DisposeConsumer<R> implements Consumer<Disposable> {
        @Override // io.reactivex.functions.Consumer
        public final void accept(Object obj) {
            throw null;
        }
    }

    public static final class InnerDisposable<T> extends AtomicInteger implements Disposable {
        public final ReplayObserver d;
        public final Observer e;
        public Serializable f;
        public volatile boolean g;

        public InnerDisposable(ReplayObserver replayObserver, Observer observer) {
            this.d = replayObserver;
            this.e = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.g;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            InnerDisposable[] innerDisposableArr;
            if (this.g) {
                return;
            }
            this.g = true;
            AtomicReference atomicReference = this.d.f;
            loop0: while (true) {
                InnerDisposable[] innerDisposableArr2 = (InnerDisposable[]) atomicReference.get();
                int length = innerDisposableArr2.length;
                if (length != 0) {
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            i = -1;
                            break;
                        } else if (innerDisposableArr2[i].equals(this)) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i < 0) {
                        break;
                    }
                    if (length == 1) {
                        innerDisposableArr = ReplayObserver.g;
                    } else {
                        InnerDisposable[] innerDisposableArr3 = new InnerDisposable[length - 1];
                        System.arraycopy(innerDisposableArr2, 0, innerDisposableArr3, 0, i);
                        System.arraycopy(innerDisposableArr2, i + 1, innerDisposableArr3, i, (length - i) - 1);
                        innerDisposableArr = innerDisposableArr3;
                    }
                    while (!atomicReference.compareAndSet(innerDisposableArr2, innerDisposableArr)) {
                        if (atomicReference.get() != innerDisposableArr2) {
                            break;
                        }
                    }
                    break loop0;
                }
                break;
            }
            this.f = null;
        }
    }

    public static final class MulticastReplay<R, U> extends Observable<R> {
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

    public static final class Node extends AtomicReference<Node> {
        public final Object d;

        public Node(Object obj) {
            this.d = obj;
        }
    }

    public static final class Replay<T> extends ConnectableObservable<T> {
        @Override // io.reactivex.Observable
        public final void h(Observer observer) {
            throw null;
        }
    }

    public interface ReplayBuffer<T> {
        void b(Object obj);

        void complete();

        void d(Throwable th);

        void g(InnerDisposable innerDisposable);
    }

    public static final class ReplayBufferSupplier<T> implements BufferSupplier<T> {
        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BufferSupplier
        public final ReplayBuffer call() {
            throw null;
        }
    }

    public static final class ReplayObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {
        public static final InnerDisposable[] g = new InnerDisposable[0];
        public static final InnerDisposable[] h = new InnerDisposable[0];
        public final ReplayBuffer d;
        public boolean e;
        public final AtomicReference f = new AtomicReference(g);

        public ReplayObserver(ReplayBuffer replayBuffer) {
            this.d = replayBuffer;
            new AtomicBoolean();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.f.get() == h;
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            if (DisposableHelper.f(this, disposable)) {
                for (InnerDisposable innerDisposable : (InnerDisposable[]) this.f.get()) {
                    this.d.g(innerDisposable);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f.set(h);
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.e) {
                return;
            }
            this.e = true;
            ReplayBuffer replayBuffer = this.d;
            replayBuffer.complete();
            for (InnerDisposable innerDisposable : (InnerDisposable[]) this.f.getAndSet(h)) {
                replayBuffer.g(innerDisposable);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.e) {
                RxJavaPlugins.b(th);
                return;
            }
            this.e = true;
            ReplayBuffer replayBuffer = this.d;
            replayBuffer.d(th);
            for (InnerDisposable innerDisposable : (InnerDisposable[]) this.f.getAndSet(h)) {
                replayBuffer.g(innerDisposable);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.e) {
                return;
            }
            ReplayBuffer replayBuffer = this.d;
            replayBuffer.b(obj);
            for (InnerDisposable innerDisposable : (InnerDisposable[]) this.f.get()) {
                replayBuffer.g(innerDisposable);
            }
        }
    }

    public static final class ReplaySource<T> implements ObservableSource<T> {
        @Override // io.reactivex.ObservableSource
        public final void a(Observer observer) {
            throw null;
        }
    }

    public static final class ScheduledReplaySupplier<T> implements BufferSupplier<T> {
        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BufferSupplier
        public final ReplayBuffer call() {
            throw null;
        }
    }

    public static final class SizeAndTimeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        public final Object a(Object obj) {
            throw null;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        public final Node c() {
            throw null;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        public final Object e(Object obj) {
            ((Timed) obj).getClass();
            return null;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        public final void f() {
            throw null;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        public final void h() {
            throw null;
        }
    }

    public static final class SizeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        public final void f() {
            if (this.e > 0) {
                this.e--;
                set(get().get());
            }
        }
    }

    public static final class UnBoundedFactory implements BufferSupplier<Object> {
        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BufferSupplier
        public final ReplayBuffer call() {
            return new UnboundedReplayBuffer(16);
        }
    }

    public static final class UnboundedReplayBuffer<T> extends ArrayList<Object> implements ReplayBuffer<T> {
        public volatile int d;

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        public final void b(Object obj) {
            add(obj);
            this.d++;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        public final void complete() {
            add(NotificationLite.d);
            this.d++;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        public final void d(Throwable th) {
            add(NotificationLite.e(th));
            this.d++;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        public final void g(InnerDisposable innerDisposable) {
            if (innerDisposable.getAndIncrement() != 0) {
                return;
            }
            Observer observer = innerDisposable.e;
            int iAddAndGet = 1;
            while (!innerDisposable.g) {
                int i = this.d;
                Integer num = (Integer) innerDisposable.f;
                int iIntValue = num != null ? num.intValue() : 0;
                while (iIntValue < i) {
                    if (NotificationLite.a(observer, get(iIntValue)) || innerDisposable.g) {
                        return;
                    } else {
                        iIntValue++;
                    }
                }
                innerDisposable.f = Integer.valueOf(iIntValue);
                iAddAndGet = innerDisposable.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        throw null;
    }
}
