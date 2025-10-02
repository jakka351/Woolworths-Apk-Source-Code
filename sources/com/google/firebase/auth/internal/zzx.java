package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.AdditionalUserInfo;

@SafeParcelable.Class(creator = "DefaultAdditionalUserInfoCreator")
/* loaded from: classes6.dex */
public final class zzx implements AdditionalUserInfo {
    public static final Parcelable.Creator<zzx> CREATOR = new zzw();
    public final String d;
    public final String e;
    public final boolean f;

    public zzx(boolean z) {
        this.f = z;
        this.e = null;
        this.d = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.d, false);
        SafeParcelWriter.writeString(parcel, 2, this.e, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzx(String str, String str2, boolean z) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        this.d = str;
        this.e = str2;
        zzbh.d(str2);
        this.f = z;
    }
}
