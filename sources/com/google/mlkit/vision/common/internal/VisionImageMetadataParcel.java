package com.google.mlkit.vision.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class(creator = "VisionImageMetadataParcelCreator")
/* loaded from: classes6.dex */
public class VisionImageMetadataParcel extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<VisionImageMetadataParcel> CREATOR = new zzg();
    public final int d;
    public final int e;
    public final long f;
    public final int g;
    public final int h;

    public VisionImageMetadataParcel(int i, int i2, int i3, long j, int i4) {
        this.d = i;
        this.e = i2;
        this.h = i3;
        this.f = j;
        this.g = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.d);
        SafeParcelWriter.writeInt(parcel, 2, this.e);
        SafeParcelWriter.writeInt(parcel, 3, this.h);
        SafeParcelWriter.writeLong(parcel, 4, this.f);
        SafeParcelWriter.writeInt(parcel, 5, this.g);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
