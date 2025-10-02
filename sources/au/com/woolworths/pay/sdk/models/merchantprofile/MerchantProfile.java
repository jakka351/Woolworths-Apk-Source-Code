package au.com.woolworths.pay.sdk.models.merchantprofile;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes4.dex */
public class MerchantProfile {
    private CreditCardInfo creditCardInfo;
    private GiftCardInfo giftCardInfo;
    private boolean isCreditCardsAllowed;
    private boolean isGiftCardsAllowed;
    private boolean isPayPalAllowed;
    private PayPalInfo payPalInfo;

    public CreditCardInfo getCreditCardInfo() {
        return this.creditCardInfo;
    }

    public GiftCardInfo getGiftCardInfo() {
        return this.giftCardInfo;
    }

    public PayPalInfo getPayPalInfo() {
        return this.payPalInfo;
    }

    public boolean isCreditCardsAllowed() {
        return this.isCreditCardsAllowed;
    }

    public boolean isGiftCardsAllowed() {
        return this.isGiftCardsAllowed;
    }

    public boolean isPayPalAllowed() {
        return this.isPayPalAllowed;
    }

    public void setCreditCardInfo(CreditCardInfo creditCardInfo) {
        this.creditCardInfo = creditCardInfo;
    }

    public void setCreditCardsAllowed(boolean z) {
        this.isCreditCardsAllowed = z;
    }

    public void setGiftCardInfo(GiftCardInfo giftCardInfo) {
        this.giftCardInfo = giftCardInfo;
    }

    public void setGiftCardsAllowed(boolean z) {
        this.isGiftCardsAllowed = z;
    }

    public void setPayPalAllowed(boolean z) {
        this.isPayPalAllowed = z;
    }

    public void setPayPalInfo(PayPalInfo payPalInfo) {
        this.payPalInfo = payPalInfo;
    }
}
