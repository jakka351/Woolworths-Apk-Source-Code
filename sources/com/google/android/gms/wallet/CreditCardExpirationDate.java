package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "CreditCardExpirationDateCreator")
/* loaded from: classes2.dex */
public final class CreditCardExpirationDate extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CreditCardExpirationDate> CREATOR = new zzj();

    @SafeParcelable.Field(id = 1)
    int zza;

    @SafeParcelable.Field(id = 2)
    int zzb;

    public CreditCardExpirationDate() {
    }

    public int getMonth() {
        return this.zza;
    }

    public int getYear() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public CreditCardExpirationDate(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2) {
        this.zza = i;
        this.zzb = i2;
    }
}
