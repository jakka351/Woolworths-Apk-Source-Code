package com.woolworths.scanlibrary.ui.payment.instrumenttype;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.pay.sdk.models.PaymentInstrument;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/payment/instrumenttype/PayAtCheckout;", "Lau/com/woolworths/pay/sdk/models/PaymentInstrument;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PayAtCheckout extends PaymentInstrument {
    public final String d;
    public final int e;

    public PayAtCheckout(String name) {
        Intrinsics.h(name, "name");
        this.d = name;
        this.e = 2131232202;
    }

    @Override // au.com.woolworths.pay.sdk.models.PaymentInstrument
    public final String getInstrumentId() {
        return "998";
    }
}
