package au.com.woolworths.pay.sdk.models;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import au.com.woolworths.pay.internal.network.JSONField;

@Keep
/* loaded from: classes4.dex */
public class CardCaptureInfo {

    @NonNull
    @JSONField
    private String cardCaptureURL;

    @NonNull
    @JSONField
    private String transactionRef;

    @NonNull
    public String getCardCaptureURL() {
        return this.cardCaptureURL;
    }

    @NonNull
    public String getTransactionRef() {
        return this.transactionRef;
    }

    public void setCardCaptureURL(@NonNull String str) {
        this.cardCaptureURL = str;
    }

    public void setTransactionRef(@NonNull String str) {
        this.transactionRef = str;
    }
}
