package com.google.android.gms.internal.p002firebaseauthapi;

import YU.a;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzajk {
    @NonNull
    public static zzacn zza(@NonNull Exception exc, @NonNull String str, @NonNull String str2) {
        String message = exc.getMessage();
        StringBuilder sbV = a.v("Failed to parse ", str, " for string [", str2, "] with exception: ");
        sbV.append(message);
        Log.e(str, sbV.toString());
        return new zzacn(a.j("Failed to parse ", str, " for string [", str2, "]"), exc);
    }

    @NonNull
    public static List<String> zza(@Nullable JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.length() != 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
        }
        return arrayList;
    }

    public static void zza(JSONObject jSONObject) throws JSONException {
        jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
    }

    public static void zza(JSONObject jSONObject, String str, String str2) throws JSONException {
        jSONObject.put(str, str2);
        jSONObject.put("recaptchaVersion", "RECAPTCHA_ENTERPRISE");
        jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
    }
}
