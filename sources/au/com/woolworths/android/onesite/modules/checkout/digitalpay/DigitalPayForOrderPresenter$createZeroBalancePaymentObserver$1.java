package au.com.woolworths.android.onesite.modules.checkout.digitalpay;

import au.com.woolworths.android.onesite.utils.Jsons;
import au.com.woolworths.foundation.shop.model.checkout.OrderSummary;
import com.google.gson.JsonObject;
import io.reactivex.observers.DisposableSingleObserver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"au/com/woolworths/android/onesite/modules/checkout/digitalpay/DigitalPayForOrderPresenter$createZeroBalancePaymentObserver$1", "Lio/reactivex/observers/DisposableSingleObserver;", "Lcom/google/gson/JsonObject;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DigitalPayForOrderPresenter$createZeroBalancePaymentObserver$1 extends DisposableSingleObserver<JsonObject> {
    public final /* synthetic */ DigitalPayForOrderPresenter e;

    public DigitalPayForOrderPresenter$createZeroBalancePaymentObserver$1(DigitalPayForOrderPresenter digitalPayForOrderPresenter) {
        this.e = digitalPayForOrderPresenter;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    @Override // io.reactivex.SingleObserver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onError(java.lang.Throwable r4) {
        /*
            r3 = this;
            java.lang.String r0 = "throwable"
            kotlin.jvm.internal.Intrinsics.h(r4, r0)
            au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderPresenter r0 = r3.e
            java.lang.Object r1 = r0.f4374a
            kotlin.jvm.internal.Intrinsics.e(r1)
            au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract$View r1 = (au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View) r1
            r1.y()
            boolean r1 = r0.r0(r4)
            r2 = 0
            if (r1 == 0) goto L19
            goto L69
        L19:
            au.com.woolworths.android.onesite.network.NetworkExceptions r1 = r0.k
            r1.getClass()
            boolean r1 = au.com.woolworths.android.onesite.network.NetworkExceptions.c(r4)
            if (r1 != 0) goto L25
            goto L66
        L25:
            retrofit2.HttpException r4 = au.com.woolworths.android.onesite.network.NetworkExceptions.a(r4)
            if (r4 == 0) goto L2e
            retrofit2.Response r1 = r4.e
            goto L2f
        L2e:
            r1 = r2
        L2f:
            if (r1 != 0) goto L32
            goto L66
        L32:
            retrofit2.Response r4 = r4.e     // Catch: java.io.IOException -> L4c com.google.gson.JsonParseException -> L4e
            kotlin.jvm.internal.Intrinsics.e(r4)     // Catch: java.io.IOException -> L4c com.google.gson.JsonParseException -> L4e
            okhttp3.ResponseBody r4 = r4.c     // Catch: java.io.IOException -> L4c com.google.gson.JsonParseException -> L4e
            if (r4 == 0) goto L66
            java.lang.String r4 = r4.d()     // Catch: java.io.IOException -> L4c com.google.gson.JsonParseException -> L4e
            com.google.gson.Gson r1 = r0.e     // Catch: java.io.IOException -> L4c com.google.gson.JsonParseException -> L4e
            au.com.woolworths.android.onesite.models.checkout.ZeroBalancePaymentError r4 = au.com.woolworths.android.onesite.utils.Jsons.b(r1, r4)     // Catch: java.io.IOException -> L4c com.google.gson.JsonParseException -> L4e
            if (r4 == 0) goto L50
            java.util.List r4 = r4.getErrors()     // Catch: java.io.IOException -> L4c com.google.gson.JsonParseException -> L4e
            goto L51
        L4c:
            r4 = move-exception
            goto L5b
        L4e:
            r4 = move-exception
            goto L61
        L50:
            r4 = r2
        L51:
            boolean r4 = au.com.woolworths.foundation.shop.model.checkout.CheckoutErrorKt.a(r4)     // Catch: java.io.IOException -> L4c com.google.gson.JsonParseException -> L4e
            if (r4 == 0) goto L66
            r0.m0()     // Catch: java.io.IOException -> L4c com.google.gson.JsonParseException -> L4e
            goto L69
        L5b:
            timber.log.Timber$Forest r1 = timber.log.Timber.f27013a
            r1.p(r4)
            goto L66
        L61:
            timber.log.Timber$Forest r1 = timber.log.Timber.f27013a
            r1.p(r4)
        L66:
            r0.p0()
        L69:
            r0.a0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderPresenter$createZeroBalancePaymentObserver$1.onError(java.lang.Throwable):void");
    }

    @Override // io.reactivex.SingleObserver
    public final void onSuccess(Object obj) {
        OrderSummary orderSummary;
        JsonObject jsonObject = (JsonObject) obj;
        Intrinsics.h(jsonObject, "jsonObject");
        boolean zC = Jsons.c(jsonObject);
        DigitalPayForOrderPresenter digitalPayForOrderPresenter = this.e;
        if (zC && (orderSummary = (OrderSummary) digitalPayForOrderPresenter.e.b(jsonObject, OrderSummary.class)) != null && orderSummary.getIsPlaced()) {
            DigitalPayForOrderPresenter.k(digitalPayForOrderPresenter, orderSummary);
        } else {
            digitalPayForOrderPresenter.p0();
        }
        digitalPayForOrderPresenter.a0 = null;
    }
}
