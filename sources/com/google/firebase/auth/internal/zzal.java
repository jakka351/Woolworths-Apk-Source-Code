package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.MultiFactorResolver;
import java.util.ArrayList;
import java.util.List;

@SafeParcelable.Class(creator = "DefaultMultiFactorResolverCreator")
/* loaded from: classes6.dex */
public final class zzal extends MultiFactorResolver {
    public static final Parcelable.Creator<zzal> CREATOR = new zzan();
    public final List d;
    public final zzam e;
    public final String f;
    public final com.google.firebase.auth.zze g;
    public final zzaf h;
    public final List i;

    public zzal(ArrayList arrayList, zzam zzamVar, String str, com.google.firebase.auth.zze zzeVar, zzaf zzafVar, ArrayList arrayList2) {
        this.d = (List) Preconditions.checkNotNull(arrayList);
        this.e = (zzam) Preconditions.checkNotNull(zzamVar);
        this.f = Preconditions.checkNotEmpty(str);
        this.g = zzeVar;
        this.h = zzafVar;
        this.i = (List) Preconditions.checkNotNull(arrayList2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.d, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.e, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.f, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.g, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.h, i, false);
        SafeParcelWriter.writeTypedList(parcel, 6, this.i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
