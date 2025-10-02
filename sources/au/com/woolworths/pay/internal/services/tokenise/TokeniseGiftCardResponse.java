package au.com.woolworths.pay.internal.services.tokenise;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import au.com.woolworths.pay.internal.network.JSONField;
import au.com.woolworths.pay.internal.network.JSONHelper;
import au.com.woolworths.pay.sdk.models.GiftCardInstrument;
import java.math.BigDecimal;

@Keep
/* loaded from: classes4.dex */
public class TokeniseGiftCardResponse {

    @NonNull
    @JSONField
    public BigDecimal balance;

    @NonNull
    @JSONField
    public String expiryDay;

    @NonNull
    @JSONField
    public String expiryMonth;

    @NonNull
    @JSONField
    public String expiryYear;

    @NonNull
    @JSONField
    public GiftCardInstrument giftCard;

    @NonNull
    @JSONField("expired")
    public boolean isExpired;

    @NonNull
    public String toString() {
        try {
            return JSONHelper.d(this).toString(4);
        } catch (Exception e) {
            return e.getLocalizedMessage();
        }
    }
}
