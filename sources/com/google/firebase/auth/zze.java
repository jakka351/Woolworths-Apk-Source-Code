package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzajb;

@SafeParcelable.Class(creator = "DefaultOAuthCredentialCreator")
/* loaded from: classes6.dex */
public final class zze extends OAuthCredential {
    public static final Parcelable.Creator<zze> CREATOR = new zzd();
    public final String d;
    public final String e;
    public final String f;
    public final zzajb g;
    public final String h;
    public final String i;
    public final String j;

    public zze(String str, String str2, String str3, zzajb zzajbVar, String str4, String str5, String str6) {
        this.d = com.google.android.gms.internal.p002firebaseauthapi.zzac.zzb(str);
        this.e = str2;
        this.f = str3;
        this.g = zzajbVar;
        this.h = str4;
        this.i = str5;
        this.j = str6;
    }

    public static zze A(zzajb zzajbVar) {
        Preconditions.checkNotNull(zzajbVar, "Must specify a non-null webSignInCredential");
        return new zze(null, null, null, zzajbVar, null, null, null);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String d() {
        return this.d;
    }

    public final AuthCredential v() {
        return new zze(this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.d, false);
        SafeParcelWriter.writeString(parcel, 2, this.e, false);
        SafeParcelWriter.writeString(parcel, 3, this.f, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.g, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.h, false);
        SafeParcelWriter.writeString(parcel, 6, this.i, false);
        SafeParcelWriter.writeString(parcel, 7, this.j, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
