package com.google.android.gms.internal.oss_licenses;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.VisibleForTesting;

/* loaded from: classes5.dex */
public final class zzg implements Comparable<zzg>, Parcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new zzf();
    private final String zza;
    private final long zzb;
    private final int zzc;

    private zzg(String str, long j, int i) {
        this.zza = str;
        this.zzb = j;
        this.zzc = i;
    }

    @VisibleForTesting
    public static zzg zza(String str, long j, int i) {
        return new zzg(str, j, i);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(zzg zzgVar) {
        return this.zza.compareTo(zzgVar.zza);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzg) {
            return this.zza.equals(((zzg) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeLong(this.zzb);
        parcel.writeInt(this.zzc);
    }

    public final String zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzb;
    }

    public final int zzd() {
        return this.zzc;
    }

    public /* synthetic */ zzg(Parcel parcel, byte[] bArr) {
        this.zza = parcel.readString();
        this.zzb = parcel.readLong();
        this.zzc = parcel.readInt();
    }
}
