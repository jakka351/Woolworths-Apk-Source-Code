package au.com.woolworths.android.onesite.modules.checkout.digitalpay;

import au.com.woolworths.android.onesite.modules.checkout.common.CheckoutPaymentState;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract;
import au.com.woolworths.android.onesite.modules.checkout.paypal.PayPalData;
import au.com.woolworths.android.onesite.rxutils.Result;
import au.com.woolworths.checkout.models.PayPalTokenResponse;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import io.reactivex.Single;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ DigitalPayForOrderPresenter e;

    public /* synthetic */ k(DigitalPayForOrderPresenter digitalPayForOrderPresenter, int i) {
        this.d = i;
        this.e = digitalPayForOrderPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable th;
        int i = this.d;
        Unit unit = Unit.f24250a;
        DigitalPayForOrderPresenter digitalPayForOrderPresenter = this.e;
        switch (i) {
            case 0:
                PayPalTokenResponse it = (PayPalTokenResponse) obj;
                Intrinsics.h(it, "it");
                break;
            case 1:
                Result result = (Result) obj;
                if (result != null && !result.a()) {
                    digitalPayForOrderPresenter.A(null);
                    break;
                } else {
                    if (result == null || (th = result.b) == null) {
                        Bark.Companion companion = Bark.f8483a;
                        Bark.Barker.i(new ReportOwner(ReportOwner.Squad.h), "Retrieving Merchant Profile returned with null value", null, 12);
                    } else {
                        Bark.Companion companion2 = Bark.f8483a;
                        Bark.Barker.h(new ReportOwner(ReportOwner.Squad.h), th, "Retrieving Merchant Profile returned with error", 24);
                    }
                    Object obj2 = digitalPayForOrderPresenter.f4374a;
                    Intrinsics.e(obj2);
                    ((DigitalPayForOrderContract.View) obj2).t1();
                    break;
                }
                break;
            case 2:
                PayPalData payPalData = (PayPalData) obj;
                Intrinsics.h(payPalData, "payPalData");
                if (digitalPayForOrderPresenter.f4374a == null) {
                    Single.c(new IllegalStateException("View is null"));
                }
                break;
            case 3:
                CheckoutPaymentState result2 = (CheckoutPaymentState) obj;
                Intrinsics.h(result2, "result");
                Throwable th2 = result2.b;
                if (th2 == null) {
                    digitalPayForOrderPresenter.d0(result2.f4275a);
                    break;
                } else {
                    digitalPayForOrderPresenter.c0(th2);
                    break;
                }
            default:
                Throwable th3 = (Throwable) obj;
                Intrinsics.e(th3);
                digitalPayForOrderPresenter.c0(th3);
                break;
        }
        return unit;
    }
}
