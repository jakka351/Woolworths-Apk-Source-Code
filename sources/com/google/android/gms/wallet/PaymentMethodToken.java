package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "PaymentMethodTokenCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class PaymentMethodToken extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PaymentMethodToken> CREATOR = new zzad();

    @SafeParcelable.Field(id = 2)
    int zza;

    @SafeParcelable.Field(id = 3)
    String zzb;

    private PaymentMethodToken() {
    }

    public int getPaymentMethodTokenizationType() {
        return this.zza;
    }

    @NonNull
    public String getToken() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zza);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public PaymentMethodToken(@SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) String str) {
        this.zza = i;
        this.zzb = str;
    }
}
