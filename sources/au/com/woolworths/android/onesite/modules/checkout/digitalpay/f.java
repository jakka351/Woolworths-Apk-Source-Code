package au.com.woolworths.android.onesite.modules.checkout.digitalpay;

import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract;
import au.com.woolworths.android.onesite.modules.checkout.paypal.PayPalNonceProvider;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.pay.sdk.PayClient;
import au.com.woolworths.pay.sdk.interfaces.PayError;
import au.com.woolworths.pay.sdk.web.CardCaptureView;
import au.com.woolworths.shop.auth.ShopAppTokenAuthenticator;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.SingleSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements PayPalNonceProvider, SingleOnSubscribe, Function, Consumer {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) throws Exception {
        switch (this.d) {
            case 3:
                ((k) this.e).invoke(obj);
                break;
            case 4:
                ((androidx.lifecycle.f) this.e).invoke(obj);
                break;
            case 5:
                ((n) this.e).invoke(obj);
                break;
            case 6:
            case 7:
            default:
                ((n) this.e).invoke(obj);
                break;
            case 8:
                ((k) this.e).invoke(obj);
                break;
            case 9:
                ((k) this.e).invoke(obj);
                break;
        }
    }

    @Override // io.reactivex.functions.Function
    /* renamed from: apply */
    public Object mo0apply(Object p0) {
        switch (this.d) {
            case 2:
                k kVar = (k) this.e;
                Intrinsics.h(p0, "p0");
                return (SingleSource) kVar.invoke(p0);
            case 6:
                n nVar = (n) this.e;
                Intrinsics.h(p0, "p0");
                return (SingleSource) nVar.invoke(p0);
            case 7:
                k kVar2 = (k) this.e;
                Intrinsics.h(p0, "p0");
                return (SingleSource) kVar2.invoke(p0);
            default:
                androidx.lifecycle.f fVar = (androidx.lifecycle.f) this.e;
                Intrinsics.h(p0, "p0");
                return (SingleSource) fVar.invoke(p0);
        }
    }

    @Override // io.reactivex.SingleOnSubscribe
    public void d(final SingleEmitter singleEmitter) {
        DigitalPayForOrderPresenter digitalPayForOrderPresenter = (DigitalPayForOrderPresenter) this.e;
        PayClient payClient = digitalPayForOrderPresenter.m;
        Object obj = digitalPayForOrderPresenter.f4374a;
        Intrinsics.f(obj, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        FragmentActivity fragmentActivityRequireActivity = ((Fragment) obj).requireActivity();
        Object obj2 = digitalPayForOrderPresenter.f4374a;
        Intrinsics.e(obj2);
        LinearLayout linearLayoutM2 = ((DigitalPayForOrderContract.View) obj2).M2();
        final SchedulersProvider schedulersProvider = digitalPayForOrderPresenter.i;
        final ShopAppTokenAuthenticator shopAppTokenAuthenticator = digitalPayForOrderPresenter.j;
        payClient.c(fragmentActivityRequireActivity, linearLayoutM2, new BasePayResultCallback<CardCaptureView>(schedulersProvider, shopAppTokenAuthenticator) { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderPresenter$initialiseCardCapture$1$1
            @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
            public final void k0(Object obj3) {
                CardCaptureView formView = (CardCaptureView) obj3;
                Intrinsics.h(formView, "formView");
                singleEmitter.onSuccess(formView);
            }

            @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
            public final void v(PayError payError) {
                Intrinsics.h(payError, "payError");
                singleEmitter.onError(new Throwable(payError.getErrorMessage()));
            }
        });
    }
}
