package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/braintreepayments/api/PaymentMethodNonce$Companion$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Lcom/braintreepayments/api/PaymentMethodNonce;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class PaymentMethodNonce$Companion$CREATOR$1 implements Parcelable.Creator<PaymentMethodNonce> {
    @Override // android.os.Parcelable.Creator
    public final PaymentMethodNonce createFromParcel(Parcel in) {
        Intrinsics.h(in, "in");
        return new PaymentMethodNonce(in);
    }

    @Override // android.os.Parcelable.Creator
    public final PaymentMethodNonce[] newArray(int i) {
        return new PaymentMethodNonce[i];
    }
}
