package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(creator = "AppMetadataCreator")
@SafeParcelable.Reserved({1, 13, 17, 19, 20, 24, 33})
/* loaded from: classes.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();

    @SafeParcelable.Field(id = 34)
    public final long zzA;

    @Nullable
    @SafeParcelable.Field(id = 35)
    public final String zzB;

    @SafeParcelable.Field(defaultValue = "", id = 36)
    public final String zzC;

    @SafeParcelable.Field(id = 37)
    public final long zzD;

    @SafeParcelable.Field(id = 38)
    public final int zzE;

    @Nullable
    @SafeParcelable.Field(id = 2)
    public final String zza;

    @Nullable
    @SafeParcelable.Field(id = 3)
    public final String zzb;

    @Nullable
    @SafeParcelable.Field(id = 4)
    public final String zzc;

    @Nullable
    @SafeParcelable.Field(id = 5)
    public final String zzd;

    @SafeParcelable.Field(id = 6)
    public final long zze;

    @SafeParcelable.Field(id = 7)
    public final long zzf;

    @Nullable
    @SafeParcelable.Field(id = 8)
    public final String zzg;

    @SafeParcelable.Field(defaultValue = "true", id = 9)
    public final boolean zzh;

    @SafeParcelable.Field(id = 10)
    public final boolean zzi;

    @SafeParcelable.Field(defaultValueUnchecked = "Integer.MIN_VALUE", id = 11)
    public final long zzj;

    @Nullable
    @SafeParcelable.Field(id = 12)
    public final String zzk;

    @SafeParcelable.Field(id = 14)
    public final long zzl;

    @SafeParcelable.Field(id = 15)
    public final int zzm;

    @SafeParcelable.Field(defaultValue = "true", id = 16)
    public final boolean zzn;

    @SafeParcelable.Field(id = 18)
    public final boolean zzo;

    @Nullable
    @SafeParcelable.Field(id = 21)
    public final Boolean zzp;

    @SafeParcelable.Field(id = 22)
    public final long zzq;

    @Nullable
    @SafeParcelable.Field(id = 23)
    public final List zzr;

    @SafeParcelable.Field(defaultValue = "", id = 25)
    public final String zzs;

    @SafeParcelable.Field(defaultValue = "", id = 26)
    public final String zzt;

    @Nullable
    @SafeParcelable.Field(id = 27)
    public final String zzu;

    @SafeParcelable.Field(defaultValue = "false", id = 28)
    public final boolean zzv;

    @SafeParcelable.Field(id = 29)
    public final long zzw;

    @SafeParcelable.Field(defaultValue = "100", id = 30)
    public final int zzx;

    @SafeParcelable.Field(defaultValue = "", id = 31)
    public final String zzy;

    @SafeParcelable.Field(id = 32)
    public final int zzz;

    public zzr(@Nullable String str, @Nullable String str2, @Nullable String str3, long j, @Nullable String str4, long j2, long j3, @Nullable String str5, boolean z, boolean z2, @Nullable String str6, long j4, int i, boolean z3, boolean z4, @Nullable Boolean bool, long j5, @Nullable List list, String str7, String str8, @Nullable String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, @Nullable String str11, String str12, long j8, int i4) {
        Preconditions.checkNotEmpty(str);
        this.zza = str;
        this.zzb = true == TextUtils.isEmpty(str2) ? null : str2;
        this.zzc = str3;
        this.zzj = j;
        this.zzd = str4;
        this.zze = j2;
        this.zzf = j3;
        this.zzg = str5;
        this.zzh = z;
        this.zzi = z2;
        this.zzk = str6;
        this.zzl = j4;
        this.zzm = i;
        this.zzn = z3;
        this.zzo = z4;
        this.zzp = bool;
        this.zzq = j5;
        this.zzr = list;
        this.zzs = str7;
        this.zzt = str8;
        this.zzu = str9;
        this.zzv = z5;
        this.zzw = j6;
        this.zzx = i2;
        this.zzy = str10;
        this.zzz = i3;
        this.zzA = j7;
        this.zzB = str11;
        this.zzC = str12;
        this.zzD = j8;
        this.zzE = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeLong(parcel, 6, this.zze);
        SafeParcelWriter.writeLong(parcel, 7, this.zzf);
        SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzh);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzi);
        SafeParcelWriter.writeLong(parcel, 11, this.zzj);
        SafeParcelWriter.writeString(parcel, 12, this.zzk, false);
        SafeParcelWriter.writeLong(parcel, 14, this.zzl);
        SafeParcelWriter.writeInt(parcel, 15, this.zzm);
        SafeParcelWriter.writeBoolean(parcel, 16, this.zzn);
        SafeParcelWriter.writeBoolean(parcel, 18, this.zzo);
        SafeParcelWriter.writeBooleanObject(parcel, 21, this.zzp, false);
        SafeParcelWriter.writeLong(parcel, 22, this.zzq);
        SafeParcelWriter.writeStringList(parcel, 23, this.zzr, false);
        SafeParcelWriter.writeString(parcel, 25, this.zzs, false);
        SafeParcelWriter.writeString(parcel, 26, this.zzt, false);
        SafeParcelWriter.writeString(parcel, 27, this.zzu, false);
        SafeParcelWriter.writeBoolean(parcel, 28, this.zzv);
        SafeParcelWriter.writeLong(parcel, 29, this.zzw);
        SafeParcelWriter.writeInt(parcel, 30, this.zzx);
        SafeParcelWriter.writeString(parcel, 31, this.zzy, false);
        SafeParcelWriter.writeInt(parcel, 32, this.zzz);
        SafeParcelWriter.writeLong(parcel, 34, this.zzA);
        SafeParcelWriter.writeString(parcel, 35, this.zzB, false);
        SafeParcelWriter.writeString(parcel, 36, this.zzC, false);
        SafeParcelWriter.writeLong(parcel, 37, this.zzD);
        SafeParcelWriter.writeInt(parcel, 38, this.zzE);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzr(@Nullable @SafeParcelable.Param(id = 2) String str, @Nullable @SafeParcelable.Param(id = 3) String str2, @Nullable @SafeParcelable.Param(id = 4) String str3, @Nullable @SafeParcelable.Param(id = 5) String str4, @SafeParcelable.Param(id = 6) long j, @SafeParcelable.Param(id = 7) long j2, @Nullable @SafeParcelable.Param(id = 8) String str5, @SafeParcelable.Param(id = 9) boolean z, @SafeParcelable.Param(id = 10) boolean z2, @SafeParcelable.Param(id = 11) long j3, @Nullable @SafeParcelable.Param(id = 12) String str6, @SafeParcelable.Param(id = 14) long j4, @SafeParcelable.Param(id = 15) int i, @SafeParcelable.Param(id = 16) boolean z3, @SafeParcelable.Param(id = 18) boolean z4, @Nullable @SafeParcelable.Param(id = 21) Boolean bool, @SafeParcelable.Param(id = 22) long j5, @Nullable @SafeParcelable.Param(id = 23) List list, @SafeParcelable.Param(id = 25) String str7, @SafeParcelable.Param(id = 26) String str8, @SafeParcelable.Param(id = 27) String str9, @SafeParcelable.Param(id = 28) boolean z5, @SafeParcelable.Param(id = 29) long j6, @SafeParcelable.Param(id = 30) int i2, @SafeParcelable.Param(id = 31) String str10, @SafeParcelable.Param(id = 32) int i3, @SafeParcelable.Param(id = 34) long j7, @Nullable @SafeParcelable.Param(id = 35) String str11, @SafeParcelable.Param(id = 36) String str12, @SafeParcelable.Param(id = 37) long j8, @SafeParcelable.Param(id = 38) int i4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzj = j3;
        this.zzd = str4;
        this.zze = j;
        this.zzf = j2;
        this.zzg = str5;
        this.zzh = z;
        this.zzi = z2;
        this.zzk = str6;
        this.zzl = j4;
        this.zzm = i;
        this.zzn = z3;
        this.zzo = z4;
        this.zzp = bool;
        this.zzq = j5;
        this.zzr = list;
        this.zzs = str7;
        this.zzt = str8;
        this.zzu = str9;
        this.zzv = z5;
        this.zzw = j6;
        this.zzx = i2;
        this.zzy = str10;
        this.zzz = i3;
        this.zzA = j7;
        this.zzB = str11;
        this.zzC = str12;
        this.zzD = j8;
        this.zzE = i4;
    }
}
