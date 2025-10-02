package com.google.android.gms.wallet.button;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GetInstrumentAvailabilityResponseCreator")
/* loaded from: classes2.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new zzd();

    @SafeParcelable.Field(getter = "getDefaultInstrumentSuffix", id = 1)
    String zza;

    @SafeParcelable.Field(getter = "getDefaultInstrumentCardNetwork", id = 2)
    int zzb;

    @SafeParcelable.Field(getter = "getBnplEligibility", id = 3)
    boolean zzc;

    @SafeParcelable.Field(getter = "getDefaultInstrumentImageUrl", id = 4)
    String zzd;

    @SafeParcelable.Field(getter = "getDefaultInstrumentName", id = 5)
    String zze;

    @SafeParcelable.Field(getter = "getPrimaryBnplInstrumentImageUrl", id = 6)
    String zzf;

    @SafeParcelable.Field(getter = "getPrimaryBnplInstrumentBrand", id = 7)
    String zzg;

    @SafeParcelable.Field(getter = "getSecondaryBnplInstrumentImageUrl", id = 8)
    String zzh;

    @SafeParcelable.Field(getter = "getSecondaryBnplInstrumentBrand", id = 9)
    String zzi;

    private zzc() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzg, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzh, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzi, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzc(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 6) String str4, @SafeParcelable.Param(id = 7) String str5, @SafeParcelable.Param(id = 8) String str6, @SafeParcelable.Param(id = 9) String str7) {
        this.zza = str;
        this.zzb = i;
        this.zzc = z;
        this.zzd = str2;
        this.zze = str3;
        this.zzf = str4;
        this.zzg = str5;
        this.zzh = str6;
        this.zzi = str7;
    }
}
