package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class zzg implements Parcelable.Creator<FacebookAuthCredential> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ FacebookAuthCredential createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            if (SafeParcelReader.getFieldId(header) != 1) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                strCreateString = SafeParcelReader.createString(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new FacebookAuthCredential(strCreateString);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ FacebookAuthCredential[] newArray(int i) {
        return new FacebookAuthCredential[i];
    }
}
