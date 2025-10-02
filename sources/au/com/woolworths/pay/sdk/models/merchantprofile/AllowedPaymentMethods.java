package au.com.woolworths.pay.sdk.models.merchantprofile;

import androidx.annotation.Keep;
import au.com.woolworths.pay.internal.network.JSONField;

@Keep
/* loaded from: classes4.dex */
public class AllowedPaymentMethods {

    @JSONField(optional = true, value = "creditCard")
    CreditCardInfo creditCardInfo;

    @JSONField(optional = true, value = "giftCard")
    GiftCardInfo giftCardInfo;

    @JSONField(optional = true, value = "payPal")
    PayPalInfo payPalInfo;

    public CreditCardInfo getCreditCardInfo() {
        return this.creditCardInfo;
    }

    public GiftCardInfo getGiftCardInfo() {
        return this.giftCardInfo;
    }

    public PayPalInfo getPayPalInfo() {
        return this.payPalInfo;
    }
}
