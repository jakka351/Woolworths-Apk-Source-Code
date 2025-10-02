package com.google.firebase.auth.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzaao;
import com.google.firebase.auth.UserInfo;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "DefaultAuthUserInfoCreator")
/* loaded from: classes6.dex */
public final class zzab extends AbstractSafeParcelable implements UserInfo {
    public static final Parcelable.Creator<zzab> CREATOR = new zzaa();
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public boolean j;
    public String k;

    public zzab(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7) {
        this.d = str;
        this.e = str2;
        this.h = str3;
        this.i = str4;
        this.f = str5;
        this.g = str6;
        if (!TextUtils.isEmpty(str6)) {
            Uri.parse(str6);
        }
        this.j = z;
        this.k = str7;
    }

    public static zzab d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new zzab(jSONObject.optString("userId"), jSONObject.optString("providerId"), jSONObject.optString(Scopes.EMAIL), jSONObject.optString("phoneNumber"), jSONObject.optString("displayName"), jSONObject.optString("photoUrl"), jSONObject.optBoolean("isEmailVerified"), jSONObject.optString("rawUserInfo"));
        } catch (JSONException e) {
            Log.d("DefaultAuthUserInfo", "Failed to unpack UserInfo from JSON");
            throw new zzaao(e);
        }
    }

    @Override // com.google.firebase.auth.UserInfo
    public final String b() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.d, false);
        SafeParcelWriter.writeString(parcel, 2, this.e, false);
        SafeParcelWriter.writeString(parcel, 3, this.f, false);
        SafeParcelWriter.writeString(parcel, 4, this.g, false);
        SafeParcelWriter.writeString(parcel, 5, this.h, false);
        SafeParcelWriter.writeString(parcel, 6, this.i, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.j);
        SafeParcelWriter.writeString(parcel, 8, this.k, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final String zzb() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.d);
            jSONObject.putOpt("providerId", this.e);
            jSONObject.putOpt("displayName", this.f);
            jSONObject.putOpt("photoUrl", this.g);
            jSONObject.putOpt(Scopes.EMAIL, this.h);
            jSONObject.putOpt("phoneNumber", this.i);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.j));
            jSONObject.putOpt("rawUserInfo", this.k);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new zzaao(e);
        }
    }
}
