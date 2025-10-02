package com.woolworths.scanlibrary.ui.checkout.stepup;

import au.com.woolworths.pay.sdk.interfaces.PayError;
import au.com.woolworths.pay.sdk.models.errors.PayErrorCode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/woolworths/scanlibrary/ui/checkout/stepup/StepUpDialogFragment$createConnectionFailureError$1", "Lau/com/woolworths/pay/sdk/interfaces/PayError;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StepUpDialogFragment$createConnectionFailureError$1 implements PayError {
    @Override // au.com.woolworths.pay.sdk.interfaces.PayError
    public final String getErrorMessage() {
        return "No connection.";
    }

    @Override // au.com.woolworths.pay.sdk.interfaces.PayError
    public final PayErrorCode getPayErrorCode() {
        return PayErrorCode.NETWORK_ERROR;
    }
}
