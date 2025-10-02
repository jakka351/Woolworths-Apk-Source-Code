package com.google.firebase.auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "UserProfileChangeRequestCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public class UserProfileChangeRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<UserProfileChangeRequest> CREATOR = new zzau();
    public String d;
    public String e;
    public boolean f;
    public boolean g;
    public Uri h;

    public static class Builder {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.d, false);
        SafeParcelWriter.writeString(parcel, 3, this.e, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f);
        SafeParcelWriter.writeBoolean(parcel, 5, this.g);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
