package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "TwitterAuthCredentialCreator")
/* loaded from: classes6.dex */
public class TwitterAuthCredential extends AuthCredential {

    @NonNull
    public static final Parcelable.Creator<TwitterAuthCredential> CREATOR = new zzat();
    public final String d;
    public final String e;

    public TwitterAuthCredential(String str, String str2) {
        this.d = Preconditions.checkNotEmpty(str);
        this.e = Preconditions.checkNotEmpty(str2);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String d() {
        return "twitter.com";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.d, false);
        SafeParcelWriter.writeString(parcel, 2, this.e, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
