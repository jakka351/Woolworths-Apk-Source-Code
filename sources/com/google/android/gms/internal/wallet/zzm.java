package com.google.android.gms.internal.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@ShowFirstParty
@SafeParcelable.Class(creator = "GetSaveInstrumentDetailsResponseCreator")
/* loaded from: classes5.dex */
public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new zzn();

    @SafeParcelable.Field(id = 1)
    String[] zza;

    @SafeParcelable.Field(id = 2)
    int[] zzb;

    @SafeParcelable.Field(id = 3)
    RemoteViews zzc;

    @SafeParcelable.Field(id = 4)
    byte[] zzd;

    private zzm() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, this.zza, false);
        SafeParcelWriter.writeIntArray(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.writeByteArray(parcel, 4, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzm(@SafeParcelable.Param(id = 1) String[] strArr, @SafeParcelable.Param(id = 2) int[] iArr, @SafeParcelable.Param(id = 3) RemoteViews remoteViews, @SafeParcelable.Param(id = 4) byte[] bArr) {
        this.zza = strArr;
        this.zzb = iArr;
        this.zzc = remoteViews;
        this.zzd = bArr;
    }
}
