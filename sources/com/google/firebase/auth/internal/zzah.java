package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.FirebaseUserMetadata;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "DefaultFirebaseUserMetadataCreator")
/* loaded from: classes6.dex */
public final class zzah implements FirebaseUserMetadata {
    public static final Parcelable.Creator<zzah> CREATOR = new zzag();
    public final long d;
    public final long e;

    public zzah(long j, long j2) {
        this.d = j;
        this.e = j2;
    }

    public static zzah a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new zzah(jSONObject.getLong("lastSignInTimestamp"), jSONObject.getLong("creationTimestamp"));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.d);
        SafeParcelWriter.writeLong(parcel, 2, this.e);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
