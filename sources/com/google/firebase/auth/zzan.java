package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "PasskeyInfoCreator")
/* loaded from: classes6.dex */
public final class zzan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzan> CREATOR = new zzam();
    public final String d;
    public final String e;
    public final String f;

    public zzan(String str, String str2, String str3) {
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public static com.google.android.gms.internal.p002firebaseauthapi.zzah d(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return com.google.android.gms.internal.p002firebaseauthapi.zzah.zzg();
        }
        com.google.android.gms.internal.p002firebaseauthapi.zzak zzakVarZzf = com.google.android.gms.internal.p002firebaseauthapi.zzah.zzf();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            zzakVarZzf.zza(new zzan(jSONObject.getString("credentialId"), jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.NAME), jSONObject.getString("displayName")));
        }
        return zzakVarZzf.zza();
    }

    public static final zzan v(JSONObject jSONObject) {
        return new zzan(jSONObject.getString("credentialId"), jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.NAME), jSONObject.getString("displayName"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.d, false);
        SafeParcelWriter.writeString(parcel, 2, this.e, false);
        SafeParcelWriter.writeString(parcel, 3, this.f, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
