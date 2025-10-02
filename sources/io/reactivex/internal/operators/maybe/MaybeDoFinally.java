package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public final class MaybeDoFinally<T> extends AbstractMaybeWithUpstream<T, T> {

    public static final class DoFinallyObserver<T> extends AtomicInteger implements MaybeObserver<T>, Disposable {
        public final MaybeObserver d;
        public Disposable e;

        public DoFinallyObserver(MaybeObserver maybeObserver) {
            this.d = maybeObserver;
        }

        public final void a() {
            if (compareAndSet(0, 1)) {
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.b(th);
                    RxJavaPlugins.b(th);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.e.b();
        }

        @Override // io.reactivex.MaybeObserver
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.e, disposable)) {
                this.e = disposable;
                this.d.d(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.e.dispose();
            a();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.d.onComplete();
            a();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            this.d.onError(th);
            a();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            this.d.onSuccess(obj);
            a();
        }
    }

    @Override // io.reactivex.Maybe
    public final void c(MaybeObserver maybeObserver) {
        this.d.a(new DoFinallyObserver(maybeObserver));
    }
}
