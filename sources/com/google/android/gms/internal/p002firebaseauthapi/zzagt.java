package com.google.android.gms.internal.p002firebaseauthapi;

import YU.a;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class zzagt implements zzaez<zzagt> {
    private static final String zza = "com.google.android.gms.internal.firebase-auth-api.zzagt";
    private String zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaez
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzagt zza(@NonNull String str) throws JSONException, zzacn {
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(str).getString("error"));
            jSONObject.getInt("code");
            this.zzb = jSONObject.getString("message");
            return this;
        } catch (NullPointerException | JSONException e) {
            Log.e(zza, "Failed to parse error for string [" + str + "] with exception: " + e.getMessage());
            throw new zzacn(a.h("Failed to parse error for string [", str, "]"), e);
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final boolean zzb() {
        return !TextUtils.isEmpty(this.zzb);
    }
}
