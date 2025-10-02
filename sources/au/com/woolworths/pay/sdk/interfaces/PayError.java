package au.com.woolworths.pay.sdk.interfaces;

import au.com.woolworths.pay.sdk.models.errors.PayErrorCode;

/* loaded from: classes4.dex */
public interface PayError {
    String getErrorMessage();

    PayErrorCode getPayErrorCode();
}
