package au.com.woolworths.android.onesite.modules.checkout.digitalpay;

import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.pay.sdk.interfaces.PayError;
import au.com.woolworths.pay.sdk.models.PayPalInstrument;
import au.com.woolworths.shop.auth.ShopAppTokenAuthenticator;
import io.reactivex.SingleEmitter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"au/com/woolworths/android/onesite/modules/checkout/digitalpay/DigitalPayForOrderPresenter$linkPayPalAccountWithNonce$1$1", "Lau/com/woolworths/android/onesite/modules/checkout/digitalpay/BasePayResultCallback;", "Lau/com/woolworths/pay/sdk/models/PayPalInstrument;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DigitalPayForOrderPresenter$linkPayPalAccountWithNonce$1$1 extends BasePayResultCallback<PayPalInstrument> {
    public final /* synthetic */ SingleEmitter h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DigitalPayForOrderPresenter$linkPayPalAccountWithNonce$1$1(SchedulersProvider schedulersProvider, ShopAppTokenAuthenticator shopAppTokenAuthenticator, SingleEmitter singleEmitter) {
        super(schedulersProvider, shopAppTokenAuthenticator);
        this.h = singleEmitter;
    }

    @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
    public final void k0(Object obj) {
        PayPalInstrument s = (PayPalInstrument) obj;
        Intrinsics.h(s, "s");
        this.h.onSuccess(s);
    }

    @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
    public final void v(PayError payError) {
        Intrinsics.h(payError, "payError");
        this.h.onError(new Exception(payError.getErrorMessage()));
    }
}
