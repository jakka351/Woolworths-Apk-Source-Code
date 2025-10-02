package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/braintreepayments/api/PostalAddress$Companion$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Lcom/braintreepayments/api/PostalAddress;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class PostalAddress$Companion$CREATOR$1 implements Parcelable.Creator<PostalAddress> {
    @Override // android.os.Parcelable.Creator
    public final PostalAddress createFromParcel(Parcel source) {
        Intrinsics.h(source, "source");
        PostalAddress postalAddress = new PostalAddress();
        postalAddress.f = source.readString();
        postalAddress.g = source.readString();
        postalAddress.h = source.readString();
        postalAddress.i = source.readString();
        postalAddress.j = source.readString();
        postalAddress.l = source.readString();
        postalAddress.d = source.readString();
        postalAddress.e = source.readString();
        postalAddress.k = source.readString();
        return postalAddress;
    }

    @Override // android.os.Parcelable.Creator
    public final PostalAddress[] newArray(int i) {
        return new PostalAddress[i];
    }
}
