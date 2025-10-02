package au.com.woolworths.foundation.shop.model.checkout;

import com.google.gson.annotations.SerializedName;
import java.net.URL;

/* loaded from: classes4.dex */
public class PaymentStepUp {

    @SerializedName("Mandatory")
    private boolean mMandatory;

    @SerializedName("Url")
    private URL mUrl;

    public PaymentStepUp(boolean z, URL url) {
        this.mMandatory = z;
        this.mUrl = url;
    }

    public final URL a() {
        return this.mUrl;
    }

    public final boolean b() {
        return this.mMandatory;
    }
}
