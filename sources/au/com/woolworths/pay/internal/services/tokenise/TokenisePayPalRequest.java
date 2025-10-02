package au.com.woolworths.pay.internal.services.tokenise;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import au.com.woolworths.pay.internal.network.APIRequest;
import au.com.woolworths.pay.internal.network.JSONEncodingException;
import au.com.woolworths.pay.internal.network.JSONField;
import au.com.woolworths.pay.internal.network.JSONHelper;
import au.com.woolworths.pay.sdk.models.config.Configuration;

@Keep
/* loaded from: classes4.dex */
class TokenisePayPalRequest extends APIRequest {

    @JSONField("primary")
    private boolean isPrimary;

    @NonNull
    @JSONField
    private String nonce;

    public TokenisePayPalRequest(@NonNull String str, @NonNull Configuration configuration, @NonNull String str2, boolean z) {
        super(str, configuration);
        this.nonce = str2;
        this.isPrimary = z;
    }

    @Override // au.com.woolworths.pay.internal.network.APIRequest
    @Nullable
    public String getData() throws JSONEncodingException {
        try {
            return JSONHelper.d(this).toString();
        } catch (Exception e) {
            throw new JSONEncodingException(e.getLocalizedMessage());
        }
    }

    @Override // au.com.woolworths.pay.internal.network.APIRequest
    @NonNull
    public String getMethod() {
        return "POST";
    }

    @Override // au.com.woolworths.pay.internal.network.APIRequest
    @NonNull
    public String getRelativePath() {
        return "/paypal/tokenize";
    }
}
