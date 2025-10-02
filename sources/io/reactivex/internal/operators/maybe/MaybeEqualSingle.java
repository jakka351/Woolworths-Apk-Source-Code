package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class MaybeEqualSingle<T> extends Single<Boolean> {

    public static final class EqualCoordinator<T> extends AtomicInteger implements Disposable {
        public final SingleObserver d;
        public final EqualObserver e;
        public final EqualObserver f;

        public EqualCoordinator(SingleObserver singleObserver) {
            super(2);
            this.d = singleObserver;
            this.e = new EqualObserver(this);
            this.f = new EqualObserver(this);
        }

        public final void a() {
            if (decrementAndGet() == 0) {
                Object obj = this.e.e;
                Object obj2 = this.f.e;
                SingleObserver singleObserver = this.d;
                if (obj == null || obj2 == null) {
                    singleObserver.onSuccess(Boolean.valueOf(obj == null && obj2 == null));
                    return;
                }
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.b(th);
                    singleObserver.onError(th);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return DisposableHelper.c(this.e.get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            EqualObserver equalObserver = this.e;
            equalObserver.getClass();
            DisposableHelper.a(equalObserver);
            EqualObserver equalObserver2 = this.f;
            equalObserver2.getClass();
            DisposableHelper.a(equalObserver2);
        }
    }

    public static final class EqualObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {
        public final EqualCoordinator d;
        public Object e;

        public EqualObserver(EqualCoordinator equalCoordinator) {
            this.d = equalCoordinator;
        }

        @Override // io.reactivex.MaybeObserver
        public final void d(Disposable disposable) {
            DisposableHelper.f(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.d.a();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            EqualCoordinator equalCoordinator = this.d;
            if (equalCoordinator.getAndSet(0) <= 0) {
                RxJavaPlugins.b(th);
                return;
            }
            EqualObserver<T> equalObserver = equalCoordinator.e;
            if (this == equalObserver) {
                EqualObserver equalObserver2 = equalCoordinator.f;
                equalObserver2.getClass();
                DisposableHelper.a(equalObserver2);
            } else {
                equalObserver.getClass();
                DisposableHelper.a(equalObserver);
            }
            equalCoordinator.d.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            this.e = obj;
            this.d.a();
        }
    }

    @Override // io.reactivex.Single
    public final void g(SingleObserver singleObserver) {
        singleObserver.d(new EqualCoordinator(singleObserver));
        throw null;
    }
}
