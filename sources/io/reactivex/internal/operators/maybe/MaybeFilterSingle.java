package io.reactivex.internal.operators.maybe;

import au.com.woolworths.feature.shop.delivery.address.a;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.operators.single.SingleFromCallable;

/* loaded from: classes7.dex */
public final class MaybeFilterSingle<T> extends Maybe<T> {
    public final SingleFromCallable d;
    public final a e;

    public static final class FilterMaybeObserver<T> implements SingleObserver<T>, Disposable {
        public final MaybeObserver d;
        public final a e;
        public Disposable f;

        public FilterMaybeObserver(MaybeObserver maybeObserver, a aVar) {
            this.d = maybeObserver;
            this.e = aVar;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.f.b();
        }

        @Override // io.reactivex.SingleObserver
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.f, disposable)) {
                this.f = disposable;
                this.d.d(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            Disposable disposable = this.f;
            this.f = DisposableHelper.d;
            disposable.dispose();
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            this.d.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            MaybeObserver maybeObserver = this.d;
            try {
                if (this.e.test(obj)) {
                    maybeObserver.onSuccess(obj);
                } else {
                    maybeObserver.onComplete();
                }
            } catch (Throwable th) {
                Exceptions.b(th);
                maybeObserver.onError(th);
            }
        }
    }

    public MaybeFilterSingle(SingleFromCallable singleFromCallable, a aVar) {
        this.d = singleFromCallable;
        this.e = aVar;
    }

    @Override // io.reactivex.Maybe
    public final void c(MaybeObserver maybeObserver) {
        this.d.a(new FilterMaybeObserver(maybeObserver, this.e));
    }
}
