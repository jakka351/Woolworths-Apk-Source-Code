package io.reactivex.internal.disposables;

import io.reactivex.CompletableObserver;
import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.internal.fuseable.QueueDisposable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class EmptyDisposable implements QueueDisposable<Object> {
    public static final EmptyDisposable d;
    public static final EmptyDisposable e;
    public static final /* synthetic */ EmptyDisposable[] f;

    static {
        EmptyDisposable emptyDisposable = new EmptyDisposable("INSTANCE", 0);
        d = emptyDisposable;
        EmptyDisposable emptyDisposable2 = new EmptyDisposable("NEVER", 1);
        e = emptyDisposable2;
        f = new EmptyDisposable[]{emptyDisposable, emptyDisposable2};
    }

    public static void a(Observer observer) {
        observer.d(d);
        observer.onComplete();
    }

    public static void c(Throwable th, CompletableObserver completableObserver) {
        completableObserver.d(d);
        completableObserver.onError(th);
    }

    public static void d(Throwable th, MaybeObserver maybeObserver) {
        maybeObserver.d(d);
        maybeObserver.onError(th);
    }

    public static void e(Throwable th, Observer observer) {
        observer.d(d);
        observer.onError(th);
    }

    public static void f(Throwable th, SingleObserver singleObserver) {
        singleObserver.d(d);
        singleObserver.onError(th);
    }

    public static EmptyDisposable valueOf(String str) {
        return (EmptyDisposable) Enum.valueOf(EmptyDisposable.class, str);
    }

    public static EmptyDisposable[] values() {
        return (EmptyDisposable[]) f.clone();
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean b() {
        return this == d;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return true;
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public final int l(int i) {
        return 2;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        return null;
    }
}
