package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzaao;
import com.google.android.gms.internal.p002firebaseauthapi.zzaiz;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "TotpMultiFactorInfoCreator")
/* loaded from: classes6.dex */
public class TotpMultiFactorInfo extends MultiFactorInfo {

    @NonNull
    public static final Parcelable.Creator<TotpMultiFactorInfo> CREATOR = new zzas();
    public final String d;
    public final String e;
    public final long f;
    public final zzaiz g;

    public TotpMultiFactorInfo(String str, String str2, long j, zzaiz zzaizVar) {
        this.d = Preconditions.checkNotEmpty(str);
        this.e = str2;
        this.f = j;
        this.g = (zzaiz) Preconditions.checkNotNull(zzaizVar, "totpInfo cannot be null.");
    }

    public static TotpMultiFactorInfo v(JSONObject jSONObject) {
        if (!jSONObject.has("enrollmentTimestamp")) {
            throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a TotpMultiFactorInfo instance.");
        }
        long jOptLong = jSONObject.optLong("enrollmentTimestamp");
        if (jSONObject.opt("totpInfo") == null) {
            throw new IllegalArgumentException("A totpInfo is required to build a TotpMultiFactorInfo instance.");
        }
        return new TotpMultiFactorInfo(jSONObject.optString("uid"), jSONObject.optString("displayName"), jOptLong, new zzaiz());
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public final String d() {
        return "totp";
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "totp");
            jSONObject.putOpt("uid", this.d);
            jSONObject.putOpt("displayName", this.e);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f));
            jSONObject.putOpt("totpInfo", this.g);
            return jSONObject;
        } catch (JSONException e) {
            Log.d("TotpMultiFactorInfo", "Failed to jsonify this object");
            throw new zzaao(e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.d, false);
        SafeParcelWriter.writeString(parcel, 2, this.e, false);
        SafeParcelWriter.writeLong(parcel, 3, this.f);
        SafeParcelWriter.writeParcelable(parcel, 4, this.g, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
