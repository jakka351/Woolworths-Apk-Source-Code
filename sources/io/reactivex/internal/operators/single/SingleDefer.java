package io.reactivex.internal.operators.single;

import au.com.woolworths.android.onesite.modules.checkout.paypal.b;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;

/* loaded from: classes7.dex */
public final class SingleDefer<T> extends Single<T> {
    public final b d;

    public SingleDefer(b bVar) {
        this.d = bVar;
    }

    @Override // io.reactivex.Single
    public final void g(SingleObserver singleObserver) {
        try {
            ((SingleSource) this.d.call()).a(singleObserver);
        } catch (Throwable th) {
            Exceptions.b(th);
            EmptyDisposable.f(th, singleObserver);
        }
    }
}
