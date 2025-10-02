package au.com.woolworths.android.onesite.modules.checkout.digitalpay;

import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.pay.sdk.hooks.Retryable;
import au.com.woolworths.pay.sdk.interfaces.PayError;
import au.com.woolworths.pay.sdk.interfaces.PayResultCallback;
import au.com.woolworths.pay.sdk.models.errors.PayErrorCode;
import au.com.woolworths.shop.auth.ShopAppTokenAuthenticator;
import io.reactivex.Scheduler;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.maybe.MaybeDefer;
import io.reactivex.internal.operators.maybe.MaybeObserveOn;
import io.reactivex.internal.operators.maybe.MaybeSubscribeOn;
import io.reactivex.observers.DisposableMaybeObserver;

/* loaded from: classes3.dex */
public abstract class BasePayResultCallback<T> implements PayResultCallback<T> {
    public final SchedulersProvider d;
    public final ShopAppTokenAuthenticator e;
    public final PayError g = new AnonymousClass1();
    public int f = 0;

    /* renamed from: au.com.woolworths.android.onesite.modules.checkout.digitalpay.BasePayResultCallback$1, reason: invalid class name */
    public class AnonymousClass1 implements PayError {
        @Override // au.com.woolworths.pay.sdk.interfaces.PayError
        public final String getErrorMessage() {
            return "unable to retrieve new access token";
        }

        @Override // au.com.woolworths.pay.sdk.interfaces.PayError
        public final PayErrorCode getPayErrorCode() {
            return PayErrorCode.HTTP_NOT_OK;
        }
    }

    public BasePayResultCallback(SchedulersProvider schedulersProvider, ShopAppTokenAuthenticator shopAppTokenAuthenticator) {
        this.d = schedulersProvider;
        this.e = shopAppTokenAuthenticator;
    }

    @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
    public final void A(final Retryable retryable) {
        int i = this.f;
        if (i >= 3) {
            v(this.g);
            return;
        }
        this.f = i + 1;
        MaybeDefer maybeDefer = new MaybeDefer(new a(1, this));
        SchedulersProvider schedulersProvider = this.d;
        Scheduler schedulerD = schedulersProvider.d();
        ObjectHelper.b(schedulerD, "scheduler is null");
        new MaybeObserveOn(new MaybeSubscribeOn(maybeDefer, schedulerD), schedulersProvider.b()).a(new DisposableMaybeObserver<String>(this) { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.BasePayResultCallback.2
            public final /* synthetic */ BasePayResultCallback f;

            {
                this.f = this;
            }

            @Override // io.reactivex.MaybeObserver
            public final void onComplete() {
                BasePayResultCallback basePayResultCallback = this.f;
                basePayResultCallback.v(basePayResultCallback.g);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onError(Throwable th) {
                BasePayResultCallback basePayResultCallback = this.f;
                basePayResultCallback.v(basePayResultCallback.g);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSuccess(Object obj) {
                retryable.a((String) obj);
            }
        });
    }
}
