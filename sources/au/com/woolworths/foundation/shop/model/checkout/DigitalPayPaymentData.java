package au.com.woolworths.foundation.shop.model.checkout;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class DigitalPayPaymentData {

    @SerializedName("Payments")
    private List<DigitalPayPaymentMethod> payments = new ArrayList();

    public final List a() {
        return this.payments;
    }
}
