package au.com.woolworths.pay.internal.services.balances;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import au.com.woolworths.pay.internal.network.JSONField;

@Keep
/* loaded from: classes4.dex */
class GiftCardBalanceResponseElement extends GiftCardBalanceInfo {

    @Nullable
    @JSONField(optional = true)
    String cardNumber;

    @Nullable
    @JSONField(optional = true)
    String errorCode;

    @Nullable
    @JSONField(optional = true)
    String errorDetail;

    @Nullable
    @JSONField(optional = true)
    String errorMessage;

    @Nullable
    @JSONField(optional = true)
    String paymentInstrumentId;
}
