package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "FacebookAuthCredentialCreator")
/* loaded from: classes6.dex */
public class FacebookAuthCredential extends AuthCredential {

    @NonNull
    public static final Parcelable.Creator<FacebookAuthCredential> CREATOR = new zzg();
    public final String d;

    public FacebookAuthCredential(String str) {
        this.d = Preconditions.checkNotEmpty(str);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String d() {
        return "facebook.com";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.d, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
