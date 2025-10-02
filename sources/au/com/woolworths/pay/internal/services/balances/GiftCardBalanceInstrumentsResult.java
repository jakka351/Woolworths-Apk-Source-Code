package au.com.woolworths.pay.internal.services.balances;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

@Keep
/* loaded from: classes4.dex */
public class GiftCardBalanceInstrumentsResult extends GiftCardBalanceResult {

    @NonNull
    String paymentInstrumentId;

    @NonNull
    public String getPaymentInstrumentId() {
        return this.paymentInstrumentId;
    }

    @Override // au.com.woolworths.pay.internal.services.balances.GiftCardBalanceResult
    public void setFieldsFromElement(@NonNull GiftCardBalanceResponseElement giftCardBalanceResponseElement) {
        this.paymentInstrumentId = giftCardBalanceResponseElement.paymentInstrumentId;
    }
}
