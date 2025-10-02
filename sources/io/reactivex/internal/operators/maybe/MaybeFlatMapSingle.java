package io.reactivex.internal.operators.maybe;

import au.com.woolworths.feature.shop.storelocator.legacy.pickup.c;
import io.reactivex.MaybeObserver;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class MaybeFlatMapSingle<T, R> extends Single<R> {
    public final MaybePeek d;
    public final c e;

    public static final class FlatMapMaybeObserver<T, R> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {
        public final SingleObserver d;
        public final c e;

        public FlatMapMaybeObserver(SingleObserver singleObserver, c cVar) {
            this.d = singleObserver;
            this.e = cVar;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return DisposableHelper.c(get());
        }

        @Override // io.reactivex.MaybeObserver
        public final void d(Disposable disposable) {
            if (DisposableHelper.f(this, disposable)) {
                this.d.d(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.d.onError(new NoSuchElementException());
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            this.d.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            try {
                Object objMo0apply = this.e.mo0apply(obj);
                ObjectHelper.b(objMo0apply, "The mapper returned a null SingleSource");
                SingleSource singleSource = (SingleSource) objMo0apply;
                if (b()) {
                    return;
                }
                singleSource.a(new FlatMapSingleObserver(this, this.d));
            } catch (Throwable th) {
                Exceptions.b(th);
                onError(th);
            }
        }
    }

    public static final class FlatMapSingleObserver<R> implements SingleObserver<R> {
        public final AtomicReference d;
        public final SingleObserver e;

        public FlatMapSingleObserver(AtomicReference atomicReference, SingleObserver singleObserver) {
            this.d = atomicReference;
            this.e = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        public final void d(Disposable disposable) {
            DisposableHelper.d(this.d, disposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            this.e.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            this.e.onSuccess(obj);
        }
    }

    public MaybeFlatMapSingle(MaybePeek maybePeek, c cVar) {
        this.d = maybePeek;
        this.e = cVar;
    }

    @Override // io.reactivex.Single
    public final void g(SingleObserver singleObserver) {
        this.d.a(new FlatMapMaybeObserver(singleObserver, this.e));
    }
}
