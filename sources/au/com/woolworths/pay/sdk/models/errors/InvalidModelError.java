package au.com.woolworths.pay.sdk.models.errors;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

@Keep
/* loaded from: classes4.dex */
public class InvalidModelError extends BaseError {
    public InvalidModelError(@NonNull String str) {
        super(PayErrorCode.INVALID_MODEL, str);
    }
}
