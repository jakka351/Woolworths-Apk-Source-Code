package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "PersonNameParcelCreator")
/* loaded from: classes5.dex */
public final class zzat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzat> CREATOR = new zzbx();

    @Nullable
    @SafeParcelable.Field(getter = "getFormattedName", id = 1)
    private final String zza;

    @Nullable
    @SafeParcelable.Field(getter = "getPronunciation", id = 2)
    private final String zzb;

    @Nullable
    @SafeParcelable.Field(getter = "getPrefix", id = 3)
    private final String zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getFirst", id = 4)
    private final String zzd;

    @Nullable
    @SafeParcelable.Field(getter = "getMiddle", id = 5)
    private final String zze;

    @Nullable
    @SafeParcelable.Field(getter = "getLast", id = 6)
    private final String zzf;

    @Nullable
    @SafeParcelable.Field(getter = "getSuffix", id = 7)
    private final String zzg;

    @SafeParcelable.Constructor
    public zzat(@Nullable @SafeParcelable.Param(id = 1) String str, @Nullable @SafeParcelable.Param(id = 2) String str2, @Nullable @SafeParcelable.Param(id = 3) String str3, @Nullable @SafeParcelable.Param(id = 4) String str4, @Nullable @SafeParcelable.Param(id = 5) String str5, @Nullable @SafeParcelable.Param(id = 6) String str6, @Nullable @SafeParcelable.Param(id = 7) String str7) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzg, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
