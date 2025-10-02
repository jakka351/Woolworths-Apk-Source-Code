package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "TimeIntervalCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class TimeInterval extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<TimeInterval> CREATOR = new zzl();

    @SafeParcelable.Field(id = 2)
    long zza;

    @SafeParcelable.Field(id = 3)
    long zzb;

    public TimeInterval() {
    }

    public long getEndTimestamp() {
        return this.zzb;
    }

    public long getStartTimestamp() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 2, this.zza);
        SafeParcelWriter.writeLong(parcel, 3, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public TimeInterval(@SafeParcelable.Param(id = 2) long j, @SafeParcelable.Param(id = 3) long j2) {
        this.zza = j;
        this.zzb = j2;
    }
}
