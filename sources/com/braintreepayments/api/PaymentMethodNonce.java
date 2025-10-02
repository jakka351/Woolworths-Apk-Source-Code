package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/braintreepayments/api/PaymentMethodNonce;", "Landroid/os/Parcelable;", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public class PaymentMethodNonce implements Parcelable {

    @JvmField
    @NotNull
    public static final Parcelable.Creator<PaymentMethodNonce> CREATOR = new PaymentMethodNonce$Companion$CREATOR$1();
    public final String d;
    public final boolean e;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/braintreepayments/api/PaymentMethodNonce$Companion;", "", "Landroid/os/Parcelable$Creator;", "Lcom/braintreepayments/api/PaymentMethodNonce;", "CREATOR", "Landroid/os/Parcelable$Creator;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
    }

    public PaymentMethodNonce(String nonce, boolean z) {
        Intrinsics.h(nonce, "nonce");
        this.d = nonce;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeByte(this.e ? (byte) 1 : (byte) 0);
    }

    public PaymentMethodNonce(Parcel inParcel) {
        Intrinsics.h(inParcel, "inParcel");
        String string = inParcel.readString();
        this.d = string == null ? "" : string;
        this.e = inParcel.readByte() > 0;
    }
}
