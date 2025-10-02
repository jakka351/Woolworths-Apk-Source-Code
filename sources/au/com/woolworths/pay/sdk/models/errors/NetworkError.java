package au.com.woolworths.pay.sdk.models.errors;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

@Keep
/* loaded from: classes4.dex */
public class NetworkError extends BaseError {
    public NetworkError(@NonNull String str) {
        super(PayErrorCode.NETWORK_ERROR, str);
    }
}
