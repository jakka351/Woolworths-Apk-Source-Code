package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.state.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "VersionInfoParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class VersionInfoParcel extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<VersionInfoParcel> CREATOR = new zzy();

    @NonNull
    @SafeParcelable.Field(id = 2)
    public String afmaVersion;

    @SafeParcelable.Field(id = 3)
    public int buddyApkVersion;

    @SafeParcelable.Field(id = 4)
    public int clientJarVersion;

    @SafeParcelable.Field(id = 5)
    public boolean isClientJar;

    @SafeParcelable.Field(id = 6)
    public boolean isLiteSdk;

    public VersionInfoParcel(int i, int i2, boolean z) {
        this(i, i2, z, false, false);
    }

    @NonNull
    public static VersionInfoParcel forPackage() {
        return new VersionInfoParcel(12451000, 12451000, true);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.afmaVersion, false);
        SafeParcelWriter.writeInt(parcel, 3, this.buddyApkVersion);
        SafeParcelWriter.writeInt(parcel, 4, this.clientJarVersion);
        SafeParcelWriter.writeBoolean(parcel, 5, this.isClientJar);
        SafeParcelWriter.writeBoolean(parcel, 6, this.isLiteSdk);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public VersionInfoParcel(int i, int i2, boolean z, boolean z2) {
        this(i, i2, z, false, z2);
    }

    public VersionInfoParcel(int i, int i2, boolean z, boolean z2, boolean z3) {
        String str;
        if (z) {
            str = "0";
        } else {
            str = z2 ? "2" : "1";
        }
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(str.length() + String.valueOf(i2).length() + length + 13 + 1);
        a.t(i, i2, "afma-sdk-a-v", ".", sb);
        this(YU.a.o(sb, ".", str), i, i2, z, z3);
    }

    @SafeParcelable.Constructor
    public VersionInfoParcel(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) int i2, @SafeParcelable.Param(id = 5) boolean z, @SafeParcelable.Param(id = 6) boolean z2) {
        this.afmaVersion = str;
        this.buddyApkVersion = i;
        this.clientJarVersion = i2;
        this.isClientJar = z;
        this.isLiteSdk = z2;
    }
}
