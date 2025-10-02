package au.com.woolworths.pay.internal.services.paymentinstruments;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import au.com.woolworths.pay.internal.network.JSONField;
import au.com.woolworths.pay.sdk.models.CreditCardInstrument;
import au.com.woolworths.pay.sdk.models.GiftCardInstrument;
import au.com.woolworths.pay.sdk.models.PayPalInstrument;

@Keep
/* loaded from: classes4.dex */
class ListPaymentInstrumentsResponse {

    @NonNull
    @JSONField
    private CreditCardInstrument[] creditCards = new CreditCardInstrument[0];

    @NonNull
    @JSONField
    private GiftCardInstrument[] giftCards = new GiftCardInstrument[0];

    @NonNull
    @JSONField
    private PayPalInstrument[] payPal = new PayPalInstrument[0];

    @NonNull
    public CreditCardInstrument[] getCreditCards() {
        return this.creditCards;
    }

    @NonNull
    public GiftCardInstrument[] getGiftCards() {
        return this.giftCards;
    }

    @NonNull
    public PayPalInstrument[] getPayPal() {
        return this.payPal;
    }
}
