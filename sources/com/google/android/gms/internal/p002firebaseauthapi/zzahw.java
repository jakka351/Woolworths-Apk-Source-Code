package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import io.jsonwebtoken.Claims;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzahw {
    private Long zza;
    private Long zzb;

    public static zzahw zza(String str) throws UnsupportedEncodingException {
        try {
            zzahw zzahwVar = new zzahw();
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optString(Claims.ISSUER);
            jSONObject.optString(Claims.AUDIENCE);
            jSONObject.optString(Claims.SUBJECT);
            zzahwVar.zza = Long.valueOf(jSONObject.optLong(Claims.ISSUED_AT));
            zzahwVar.zzb = Long.valueOf(jSONObject.optLong(Claims.EXPIRATION));
            jSONObject.optBoolean("is_anonymous");
            return zzahwVar;
        } catch (JSONException e) {
            if (Log.isLoggable("JwtToken", 3)) {
                Log.d("JwtToken", "Failed to read JwtToken from JSONObject. ".concat(String.valueOf(e)));
            }
            throw new UnsupportedEncodingException("Failed to read JwtToken from JSONObject. ".concat(String.valueOf(e)));
        }
    }

    public final Long zzb() {
        return this.zza;
    }

    public final Long zza() {
        return this.zzb;
    }
}
