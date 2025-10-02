package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "PhoneAuthCredentialCreator")
/* loaded from: classes6.dex */
public class PhoneAuthCredential extends AuthCredential implements Cloneable {

    @NonNull
    public static final Parcelable.Creator<PhoneAuthCredential> CREATOR = new zzao();
    public final String d;
    public final String e;
    public final String f;
    public boolean g;
    public final String h;

    public PhoneAuthCredential(String str, String str2, String str3, String str4, boolean z) {
        Preconditions.checkArgument(((TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) && (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4))) ? false : true, "Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber.");
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = z;
        this.h = str4;
    }

    public final Object clone() {
        boolean z = this.g;
        return new PhoneAuthCredential(this.d, this.e, this.f, this.h, z);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String d() {
        return "phone";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.d, false);
        SafeParcelWriter.writeString(parcel, 2, this.e, false);
        SafeParcelWriter.writeString(parcel, 4, this.f, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.g);
        SafeParcelWriter.writeString(parcel, 6, this.h, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
