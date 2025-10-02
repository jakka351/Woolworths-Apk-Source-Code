package au.com.woolworths.checkout.models;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes3.dex */
public class PayPalTokenResponse {

    @SerializedName("ClientToken")
    private String mClientToken;

    public PayPalTokenResponse(String str) {
        this.mClientToken = str;
    }

    public String getClientToken() {
        return this.mClientToken;
    }
}
