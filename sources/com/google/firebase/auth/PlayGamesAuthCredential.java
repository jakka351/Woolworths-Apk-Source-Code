package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "PlayGamesAuthCredentialCreator")
/* loaded from: classes6.dex */
public class PlayGamesAuthCredential extends AuthCredential {

    @NonNull
    public static final Parcelable.Creator<PlayGamesAuthCredential> CREATOR = new zzar();
    public final String d;

    public PlayGamesAuthCredential(String str) {
        this.d = Preconditions.checkNotEmpty(str);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String d() {
        return "playgames.google.com";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.d, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
