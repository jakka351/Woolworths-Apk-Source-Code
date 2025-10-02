package com.woolworths.scanlibrary.util.exceptions;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.pay.sdk.interfaces.PayError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/util/exceptions/PaymentError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PaymentError extends Exception {
    public final PayError d;

    public PaymentError(PayError error) {
        Intrinsics.h(error, "error");
        this.d = error;
    }
}
