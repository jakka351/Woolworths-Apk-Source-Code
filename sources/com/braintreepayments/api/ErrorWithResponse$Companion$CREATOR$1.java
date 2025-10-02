package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/braintreepayments/api/ErrorWithResponse$Companion$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Lcom/braintreepayments/api/ErrorWithResponse;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class ErrorWithResponse$Companion$CREATOR$1 implements Parcelable.Creator<ErrorWithResponse> {
    @Override // android.os.Parcelable.Creator
    public final ErrorWithResponse createFromParcel(Parcel source) {
        Intrinsics.h(source, "source");
        ErrorWithResponse errorWithResponse = new ErrorWithResponse();
        errorWithResponse.d = source.readInt();
        errorWithResponse.e = source.readString();
        errorWithResponse.f = source.readString();
        errorWithResponse.g = source.createTypedArrayList(BraintreeError.CREATOR);
        return errorWithResponse;
    }

    @Override // android.os.Parcelable.Creator
    public final ErrorWithResponse[] newArray(int i) {
        return new ErrorWithResponse[i];
    }
}
