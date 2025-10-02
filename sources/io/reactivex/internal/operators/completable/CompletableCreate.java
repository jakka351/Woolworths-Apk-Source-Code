package io.reactivex.internal.operators.completable;

import androidx.constraintlayout.core.state.a;
import io.reactivex.Completable;
import io.reactivex.CompletableEmitter;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class CompletableCreate extends Completable {

    public static final class Emitter extends AtomicReference<Disposable> implements CompletableEmitter, Disposable {
        public final CompletableObserver d;

        public Emitter(CompletableObserver completableObserver) {
            this.d = completableObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return DisposableHelper.c(get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return a.i(Emitter.class.getSimpleName(), "{", super.toString(), "}");
        }
    }

    @Override // io.reactivex.Completable
    public final void c(CompletableObserver completableObserver) {
        Disposable andSet;
        Emitter emitter = new Emitter(completableObserver);
        completableObserver.d(emitter);
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.b(th);
            Disposable disposable = emitter.get();
            DisposableHelper disposableHelper = DisposableHelper.d;
            if (disposable == disposableHelper || (andSet = emitter.getAndSet(disposableHelper)) == disposableHelper) {
                RxJavaPlugins.b(th);
                return;
            }
            try {
                emitter.d.onError(th);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }
    }
}
