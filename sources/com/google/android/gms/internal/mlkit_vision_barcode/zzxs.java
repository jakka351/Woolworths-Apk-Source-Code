package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ContactInfoParcelCreator")
/* loaded from: classes5.dex */
public final class zzxs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxs> CREATOR = new zzyh();

    @Nullable
    @SafeParcelable.Field(getter = "getName", id = 1)
    private final zzxw zza;

    @Nullable
    @SafeParcelable.Field(getter = "getOrganization", id = 2)
    private final String zzb;

    @Nullable
    @SafeParcelable.Field(getter = "getTitle", id = 3)
    private final String zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getPhones", id = 4)
    private final zzxx[] zzd;

    @Nullable
    @SafeParcelable.Field(getter = "getEmails", id = 5)
    private final zzxu[] zze;

    @Nullable
    @SafeParcelable.Field(getter = "getUrls", id = 6)
    private final String[] zzf;

    @Nullable
    @SafeParcelable.Field(getter = "getAddresses", id = 7)
    private final zzxp[] zzg;

    @SafeParcelable.Constructor
    public zzxs(@Nullable @SafeParcelable.Param(id = 1) zzxw zzxwVar, @Nullable @SafeParcelable.Param(id = 2) String str, @Nullable @SafeParcelable.Param(id = 3) String str2, @Nullable @SafeParcelable.Param(id = 4) zzxx[] zzxxVarArr, @Nullable @SafeParcelable.Param(id = 5) zzxu[] zzxuVarArr, @Nullable @SafeParcelable.Param(id = 6) String[] strArr, @Nullable @SafeParcelable.Param(id = 7) zzxp[] zzxpVarArr) {
        this.zza = zzxwVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzxxVarArr;
        this.zze = zzxuVarArr;
        this.zzf = strArr;
        this.zzg = zzxpVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeTypedArray(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.zze, i, false);
        SafeParcelWriter.writeStringArray(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeTypedArray(parcel, 7, this.zzg, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Nullable
    public final zzxw zza() {
        return this.zza;
    }

    @Nullable
    public final String zzb() {
        return this.zzb;
    }

    @Nullable
    public final String zzc() {
        return this.zzc;
    }

    @Nullable
    public final zzxp[] zzd() {
        return this.zzg;
    }

    @Nullable
    public final zzxu[] zze() {
        return this.zze;
    }

    @Nullable
    public final zzxx[] zzf() {
        return this.zzd;
    }

    @Nullable
    public final String[] zzg() {
        return this.zzf;
    }
}
