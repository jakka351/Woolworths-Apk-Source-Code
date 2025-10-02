package au.com.woolworths.pay.sdk.models.errors;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

@Keep
/* loaded from: classes4.dex */
public class InvalidJSONError extends BaseError {
    public InvalidJSONError(@NonNull String str) {
        super(PayErrorCode.INVALID_JSON, str);
    }
}
