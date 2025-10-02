package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzaao;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "PhoneMultiFactorInfoCreator")
/* loaded from: classes6.dex */
public class PhoneMultiFactorInfo extends MultiFactorInfo {

    @NonNull
    public static final Parcelable.Creator<PhoneMultiFactorInfo> CREATOR = new zzaq();
    public final String d;
    public final String e;
    public final long f;
    public final String g;

    public PhoneMultiFactorInfo(String str, String str2, long j, String str3) {
        this.d = Preconditions.checkNotEmpty(str);
        this.e = str2;
        this.f = j;
        this.g = Preconditions.checkNotEmpty(str3);
    }

    public static PhoneMultiFactorInfo v(JSONObject jSONObject) {
        if (jSONObject.has("enrollmentTimestamp")) {
            return new PhoneMultiFactorInfo(jSONObject.optString("uid"), jSONObject.optString("displayName"), jSONObject.optLong("enrollmentTimestamp"), jSONObject.optString("phoneNumber"));
        }
        throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public final String d() {
        return "phone";
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt("uid", this.d);
            jSONObject.putOpt("displayName", this.e);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f));
            jSONObject.putOpt("phoneNumber", this.g);
            return jSONObject;
        } catch (JSONException e) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new zzaao(e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.d, false);
        SafeParcelWriter.writeString(parcel, 2, this.e, false);
        SafeParcelWriter.writeLong(parcel, 3, this.f);
        SafeParcelWriter.writeString(parcel, 4, this.g, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
