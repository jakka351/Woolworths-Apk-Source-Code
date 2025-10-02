package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes5.dex */
public final class zzaiy implements Parcelable.Creator<zzaiz> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaiz createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            SafeParcelReader.getFieldId(header);
            SafeParcelReader.skipUnknownField(parcel, header);
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzaiz();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaiz[] newArray(int i) {
        return new zzaiz[i];
    }
}
