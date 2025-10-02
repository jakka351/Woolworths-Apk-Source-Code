package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.MultiFactorSession;
import java.util.ArrayList;

@SafeParcelable.Class(creator = "DefaultMultiFactorSessionCreator")
/* loaded from: classes6.dex */
public final class zzam extends MultiFactorSession {
    public static final Parcelable.Creator<zzam> CREATOR = new zzap();
    public String d;
    public String e;
    public ArrayList f;
    public ArrayList g;
    public zzaf h;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.d, false);
        SafeParcelWriter.writeString(parcel, 2, this.e, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.f, false);
        SafeParcelWriter.writeTypedList(parcel, 4, this.g, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.h, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
