package au.com.woolworths.pay.sdk.models.errors;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

@Keep
/* loaded from: classes4.dex */
public class FatalError extends BaseError {
    public FatalError(@NonNull String str) {
        super(PayErrorCode.FATAL_ERROR, str);
    }
}
