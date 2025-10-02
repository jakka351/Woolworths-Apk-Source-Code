package au.com.woolworths.android.onesite.modules.checkout.digitalpay;

import au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract;
import au.com.woolworths.pay.sdk.models.PayPalInstrument;
import io.reactivex.observers.DisposableSingleObserver;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"au/com/woolworths/android/onesite/modules/checkout/digitalpay/DigitalPayForOrderPresenter$createLinkPayPalObserver$1", "Lio/reactivex/observers/DisposableSingleObserver;", "Lau/com/woolworths/pay/sdk/models/PayPalInstrument;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DigitalPayForOrderPresenter$createLinkPayPalObserver$1 extends DisposableSingleObserver<PayPalInstrument> {
    public final /* synthetic */ DigitalPayForOrderPresenter e;

    public DigitalPayForOrderPresenter$createLinkPayPalObserver$1(DigitalPayForOrderPresenter digitalPayForOrderPresenter) {
        this.e = digitalPayForOrderPresenter;
    }

    @Override // io.reactivex.SingleObserver
    public final void onError(Throwable throwable) {
        Intrinsics.h(throwable, "throwable");
        DigitalPayForOrderPresenter digitalPayForOrderPresenter = this.e;
        digitalPayForOrderPresenter.c0 = null;
        Timber.f27013a.p(throwable);
        if (digitalPayForOrderPresenter.M == null) {
            digitalPayForOrderPresenter.B();
        }
        digitalPayForOrderPresenter.z0();
        if (digitalPayForOrderPresenter.i()) {
            Object obj = digitalPayForOrderPresenter.f4374a;
            Intrinsics.e(obj);
            ((DigitalPayForOrderContract.View) obj).y();
            Object obj2 = digitalPayForOrderPresenter.f4374a;
            Intrinsics.e(obj2);
            Object obj3 = digitalPayForOrderPresenter.f4374a;
            Intrinsics.e(obj3);
            ((DigitalPayForOrderContract.View) obj2).D1(((DigitalPayForOrderContract.View) obj3).a2());
        }
    }

    @Override // io.reactivex.SingleObserver
    public final void onSuccess(Object obj) {
        PayPalInstrument payPalInstrument = (PayPalInstrument) obj;
        Intrinsics.h(payPalInstrument, "payPalInstrument");
        DigitalPayForOrderPresenter digitalPayForOrderPresenter = this.e;
        digitalPayForOrderPresenter.x();
        digitalPayForOrderPresenter.z = payPalInstrument.getInstrumentId();
        ArrayList arrayList = digitalPayForOrderPresenter.w;
        Intrinsics.e(arrayList);
        arrayList.add(payPalInstrument);
        digitalPayForOrderPresenter.B = payPalInstrument;
        digitalPayForOrderPresenter.c0 = null;
        if (digitalPayForOrderPresenter.M == null) {
            digitalPayForOrderPresenter.B();
        }
        if (digitalPayForOrderPresenter.i() && digitalPayForOrderPresenter.c0 == null) {
            digitalPayForOrderPresenter.A0();
            digitalPayForOrderPresenter.B = null;
        }
        digitalPayForOrderPresenter.D0();
        digitalPayForOrderPresenter.z0();
        digitalPayForOrderPresenter.S();
    }
}
