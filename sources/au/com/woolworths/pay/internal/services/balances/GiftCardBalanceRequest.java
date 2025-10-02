package au.com.woolworths.pay.internal.services.balances;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import au.com.woolworths.pay.internal.network.APIRequest;
import au.com.woolworths.pay.sdk.models.config.Configuration;

@Keep
/* loaded from: classes4.dex */
abstract class GiftCardBalanceRequest extends APIRequest {
    public GiftCardBalanceRequest(@NonNull String str, @NonNull Configuration configuration) {
        super(str, configuration);
    }

    @Override // au.com.woolworths.pay.internal.network.APIRequest
    @NonNull
    public String getMethod() {
        return "POST";
    }

    @Override // au.com.woolworths.pay.internal.network.APIRequest
    @NonNull
    public String getRelativePath() {
        return "/giftcards/balance";
    }
}
