package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.AuthResult;
import java.util.ArrayList;

@SafeParcelable.Class(creator = "DefaultAuthResultCreator")
/* loaded from: classes6.dex */
public final class zzz implements AuthResult {
    public static final Parcelable.Creator<zzz> CREATOR = new zzy();
    public zzaf d;
    public zzx e;
    public com.google.firebase.auth.zze f;

    public zzz(zzaf zzafVar) {
        zzaf zzafVar2 = (zzaf) Preconditions.checkNotNull(zzafVar);
        this.d = zzafVar2;
        ArrayList arrayList = zzafVar2.h;
        this.e = null;
        for (int i = 0; i < arrayList.size(); i++) {
            if (!TextUtils.isEmpty(((zzab) arrayList.get(i)).k)) {
                this.e = new zzx(((zzab) arrayList.get(i)).e, ((zzab) arrayList.get(i)).k, zzafVar.m);
            }
        }
        if (this.e == null) {
            this.e = new zzx(zzafVar.m);
        }
        this.f = zzafVar.n;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.d, i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.e, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
