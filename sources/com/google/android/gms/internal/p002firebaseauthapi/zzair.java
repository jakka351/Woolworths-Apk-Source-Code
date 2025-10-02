package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class zzair implements zzaez<zzair> {
    private static final String zza = "zzair";

    @Nullable
    public String zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaez
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public zzair zza(String str) throws zzacn {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optJSONObject("phoneSessionInfo") != null) {
                return (zzaiv) ((zzair) new zzaiv().zza(str));
            }
            if (jSONObject.optJSONObject("totpSessionInfo") != null) {
                return (zzaix) ((zzair) new zzaix().zza(str));
            }
            throw new IllegalArgumentException("Missing phoneSessionInfo or totpSessionInfo.");
        } catch (NullPointerException e) {
            e = e;
            throw zzajk.zza(e, zza, str);
        } catch (JSONException e2) {
            e = e2;
            throw zzajk.zza(e, zza, str);
        }
    }
}
