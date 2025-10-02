package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "EmailAuthCredentialCreator")
/* loaded from: classes6.dex */
public class EmailAuthCredential extends AuthCredential {

    @NonNull
    public static final Parcelable.Creator<EmailAuthCredential> CREATOR = new zzf();
    public final String d;
    public final String e;
    public final String f;
    public String g;
    public boolean h;

    public EmailAuthCredential(String str, String str2, String str3, String str4, boolean z) {
        this.d = Preconditions.checkNotEmpty(str);
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = z;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String d() {
        return "password";
    }

    public final String v() {
        return !TextUtils.isEmpty(this.e) ? "password" : "emailLink";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.d, false);
        SafeParcelWriter.writeString(parcel, 2, this.e, false);
        SafeParcelWriter.writeString(parcel, 3, this.f, false);
        SafeParcelWriter.writeString(parcel, 4, this.g, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.h);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final String zzc() {
        return this.d;
    }

    public final String zzd() {
        return this.e;
    }

    public final String zze() {
        return this.f;
    }

    public final boolean zzf() {
        return !TextUtils.isEmpty(this.f);
    }
}
