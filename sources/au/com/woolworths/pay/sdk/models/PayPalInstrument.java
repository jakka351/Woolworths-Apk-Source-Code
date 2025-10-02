package au.com.woolworths.pay.sdk.models;

import YU.a;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import au.com.woolworths.pay.internal.network.JSONField;

@Keep
/* loaded from: classes4.dex */
public class PayPalInstrument extends PaymentInstrument {

    @NonNull
    @JSONField
    private String payPalId;

    @NonNull
    public String getPayPalId() {
        return this.payPalId;
    }

    @Override // au.com.woolworths.pay.sdk.models.PaymentInstrument
    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("payPalId: ");
        return a.o(sb, this.payPalId, "\n");
    }
}
