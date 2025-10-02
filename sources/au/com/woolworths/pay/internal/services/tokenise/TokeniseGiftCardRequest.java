package au.com.woolworths.pay.internal.services.tokenise;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import au.com.woolworths.pay.internal.network.APIRequest;
import au.com.woolworths.pay.internal.network.JSONEncodingException;
import au.com.woolworths.pay.internal.network.JSONField;
import au.com.woolworths.pay.internal.network.JSONHelper;
import au.com.woolworths.pay.sdk.models.SaveOptions;
import au.com.woolworths.pay.sdk.models.config.Configuration;

@Keep
/* loaded from: classes4.dex */
class TokeniseGiftCardRequest extends APIRequest {

    @NonNull
    @JSONField
    private String cardNumber;

    @JSONField("primary")
    private boolean isPrimary;

    @NonNull
    @JSONField
    private String pinCode;

    @JSONField("save")
    private boolean shouldSave;

    public TokeniseGiftCardRequest(@NonNull String str, @NonNull Configuration configuration, @NonNull String str2, @NonNull String str3, @NonNull SaveOptions saveOptions) {
        super(str, configuration);
        this.cardNumber = str2;
        this.pinCode = str3;
        this.shouldSave = saveOptions.shouldSave();
        this.isPrimary = saveOptions.makePrimary();
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
        return "/giftcards/tokenize";
    }
}
