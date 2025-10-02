package io.reactivex.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes7.dex */
public class TestObserver<T> extends BaseTestConsumer<T, TestObserver<T>> implements Observer<T>, Disposable, MaybeObserver<T>, SingleObserver<T>, CompletableObserver {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class EmptyObserver implements Observer<Object> {
        public static final /* synthetic */ EmptyObserver[] d = {new EmptyObserver("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        EmptyObserver EF5;

        public static EmptyObserver valueOf(String str) {
            return (EmptyObserver) Enum.valueOf(EmptyObserver.class, str);
        }

        public static EmptyObserver[] values() {
            return (EmptyObserver[]) d.clone();
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean b() {
        throw null;
    }

    @Override // io.reactivex.Observer
    public final void d(Disposable disposable) {
        Thread.currentThread();
        disposable.getClass();
        throw null;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.a(null);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        throw null;
     */
    @Override // io.reactivex.Observer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onComplete() {
        /*
            r1 = this;
            r0 = 0
            java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L5
            throw r0     // Catch: java.lang.Throwable -> L5
        L5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.observers.TestObserver.onComplete():void");
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        Thread.currentThread();
        if (th != null) {
            throw null;
        }
        throw null;
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        Thread.currentThread();
        throw null;
    }

    @Override // io.reactivex.MaybeObserver
    public final void onSuccess(Object obj) {
        Thread.currentThread();
        throw null;
    }
}
