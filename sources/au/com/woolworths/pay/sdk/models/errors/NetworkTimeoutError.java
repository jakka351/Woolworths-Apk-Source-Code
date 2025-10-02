package au.com.woolworths.pay.sdk.models.errors;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes4.dex */
public class NetworkTimeoutError extends BaseError {
    public NetworkTimeoutError() {
        super(PayErrorCode.TIMEOUT_ERROR, "The request timed out.");
    }
}
