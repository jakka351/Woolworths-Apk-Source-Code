package au.com.woolworths.foundation.shop.model.checkout;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;

/* loaded from: classes4.dex */
public class DigitalPayPaymentMethod {

    @SerializedName("Amount")
    private BigDecimal mPaymentAmount;

    @SerializedName("PaymentInstrumentId")
    private String mPaymentInstrumentId;

    @SerializedName("stepUpToken")
    private String mStepUpToken;

    public DigitalPayPaymentMethod(String str, BigDecimal bigDecimal) {
        this.mPaymentInstrumentId = str;
        this.mPaymentAmount = bigDecimal;
    }

    public final BigDecimal a() {
        return this.mPaymentAmount;
    }

    public final String b() {
        return this.mPaymentInstrumentId;
    }

    public final String c() {
        return this.mStepUpToken;
    }

    public final void d(String str) {
        this.mStepUpToken = str;
    }
}
