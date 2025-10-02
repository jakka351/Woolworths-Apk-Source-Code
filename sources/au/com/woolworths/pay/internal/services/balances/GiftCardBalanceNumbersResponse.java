package au.com.woolworths.pay.internal.services.balances;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import au.com.woolworths.pay.internal.network.JSONField;

@Keep
/* loaded from: classes4.dex */
class GiftCardBalanceNumbersResponse extends GiftCardBalanceResponse {

    @NonNull
    @JSONField("giftCardBalances")
    protected GiftCardBalanceResponseElement[] elements;

    @Override // au.com.woolworths.pay.internal.services.balances.GiftCardBalanceResponse
    @NonNull
    public GiftCardBalanceResponseElement[] getElements() {
        return this.elements;
    }
}
