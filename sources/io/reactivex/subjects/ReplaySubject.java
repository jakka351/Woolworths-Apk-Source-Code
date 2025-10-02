package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ReplaySubject<T> extends Subject<T> {

    public static final class Node<T> extends AtomicReference<Node<T>> {
    }

    public interface ReplayBuffer<T> {
    }

    public static final class ReplayDisposable<T> extends AtomicInteger implements Disposable {
        public final Observer d;
        public final ReplaySubject e;
        public volatile boolean f;

        public ReplayDisposable(Observer observer, ReplaySubject replaySubject) {
            this.d = observer;
            this.e = replaySubject;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.f;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.f) {
                return;
            }
            this.f = true;
            this.e.getClass();
            throw null;
        }
    }

    public static final class SizeAndTimeBoundReplayBuffer<T> extends AtomicReference<Object> implements ReplayBuffer<T> {
    }

    public static final class SizeBoundReplayBuffer<T> extends AtomicReference<Object> implements ReplayBuffer<T> {
    }

    public static final class TimedNode<T> extends AtomicReference<TimedNode<T>> {
    }

    public static final class UnboundedReplayBuffer<T> extends AtomicReference<Object> implements ReplayBuffer<T> {
    }

    @Override // io.reactivex.Observer
    public final void d(Disposable disposable) {
        disposable.dispose();
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        ReplayDisposable replayDisposable = new ReplayDisposable(observer, this);
        observer.d(replayDisposable);
        if (!replayDisposable.f) {
            throw null;
        }
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        ObjectHelper.b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        RxJavaPlugins.b(th);
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        ObjectHelper.b(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
    }
}
