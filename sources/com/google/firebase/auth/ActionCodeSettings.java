package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ActionCodeSettingsCreator")
/* loaded from: classes6.dex */
public class ActionCodeSettings extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ActionCodeSettings> CREATOR = new zza();
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final String i;
    public final boolean j;
    public final String k;
    public int l;
    public final String m;
    public final String n;

    public static class Builder {
    }

    public ActionCodeSettings(String str, String str2, String str3, String str4, boolean z, String str5, boolean z2, String str6, int i, String str7, String str8) {
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = z;
        this.i = str5;
        this.j = z2;
        this.k = str6;
        this.l = i;
        this.m = str7;
        this.n = str8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.d, false);
        SafeParcelWriter.writeString(parcel, 2, this.e, false);
        SafeParcelWriter.writeString(parcel, 3, this.f, false);
        SafeParcelWriter.writeString(parcel, 4, this.g, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.h);
        SafeParcelWriter.writeString(parcel, 6, this.i, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.j);
        SafeParcelWriter.writeString(parcel, 8, this.k, false);
        SafeParcelWriter.writeInt(parcel, 9, this.l);
        SafeParcelWriter.writeString(parcel, 10, this.m, false);
        SafeParcelWriter.writeString(parcel, 11, this.n, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
