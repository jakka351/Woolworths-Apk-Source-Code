package au.com.woolworths.pay.sdk.models.errors;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

@Keep
/* loaded from: classes4.dex */
public class RetryExhaustedError extends BaseError {
    public RetryExhaustedError(@NonNull String str) {
        super(PayErrorCode.RETRIES_EXHAUSTED_ERROR, str);
    }
}
