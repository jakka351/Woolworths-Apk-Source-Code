package au.com.woolworths.pay.internal.services.balances;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import au.com.woolworths.pay.internal.network.JSONField;

@Keep
/* loaded from: classes4.dex */
public class GiftCardBalanceNumbersResult extends GiftCardBalanceResult {

    @NonNull
    @JSONField
    String cardNumber;

    @NonNull
    public String getCardNumber() {
        return this.cardNumber;
    }

    @Override // au.com.woolworths.pay.internal.services.balances.GiftCardBalanceResult
    public void setFieldsFromElement(@NonNull GiftCardBalanceResponseElement giftCardBalanceResponseElement) {
        this.cardNumber = giftCardBalanceResponseElement.cardNumber;
    }
}
