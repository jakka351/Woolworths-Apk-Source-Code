package io.reactivex.internal.operators.maybe;

import au.com.woolworths.feature.shop.delivery.address.a;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class MaybeFlatMapCompletable<T> extends Completable {
    public final MaybeFilterSingle d;
    public final a e;

    public static final class FlatMapCompletableObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, CompletableObserver, Disposable {
        public final CompletableObserver d;
        public final a e;

        public FlatMapCompletableObserver(CompletableObserver completableObserver, a aVar) {
            this.d = completableObserver;
            this.e = aVar;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return DisposableHelper.c(get());
        }

        @Override // io.reactivex.MaybeObserver
        public final void d(Disposable disposable) {
            DisposableHelper.d(this, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.d.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            this.d.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            try {
                Object objMo0apply = this.e.mo0apply(obj);
                ObjectHelper.b(objMo0apply, "The mapper returned a null CompletableSource");
                CompletableSource completableSource = (CompletableSource) objMo0apply;
                if (b()) {
                    return;
                }
                completableSource.a(this);
            } catch (Throwable th) {
                Exceptions.b(th);
                onError(th);
            }
        }
    }

    public MaybeFlatMapCompletable(MaybeFilterSingle maybeFilterSingle, a aVar) {
        this.d = maybeFilterSingle;
        this.e = aVar;
    }

    @Override // io.reactivex.Completable
    public final void c(CompletableObserver completableObserver) {
        FlatMapCompletableObserver flatMapCompletableObserver = new FlatMapCompletableObserver(completableObserver, this.e);
        completableObserver.d(flatMapCompletableObserver);
        this.d.a(flatMapCompletableObserver);
    }
}
