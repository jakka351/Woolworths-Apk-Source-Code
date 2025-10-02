package au.com.woolworths.pay.sdk.models;

import YU.a;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import au.com.woolworths.pay.internal.network.JSONField;

@Keep
/* loaded from: classes4.dex */
public class GiftCardInstrument extends PaymentInstrument {

    @NonNull
    @JSONField
    private String cardSuffix;

    @NonNull
    @JSONField
    private String programName;

    @NonNull
    public String getCardSuffix() {
        return this.cardSuffix;
    }

    @NonNull
    public String getProgramName() {
        return this.programName;
    }

    @Override // au.com.woolworths.pay.sdk.models.PaymentInstrument
    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("programName: ");
        sb.append(this.programName);
        sb.append("\ncardSuffix: ");
        return a.o(sb, this.cardSuffix, "\n");
    }
}
