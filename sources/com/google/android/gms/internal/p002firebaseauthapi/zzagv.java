package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class zzagv implements zzaez<zzagv> {
    private static final String zza = "zzagv";
    private List<String> zzb;

    public zzagv() {
        zzaiw.zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaez
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzagv zza(String str) throws zzacn {
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optString("authUri", null);
            jSONObject.optBoolean("registered", false);
            jSONObject.optString("providerId", null);
            jSONObject.optBoolean("forExistingProvider", false);
            if (jSONObject.has("allProviders")) {
                new zzaiw(1, zzajk.zza(jSONObject.optJSONArray("allProviders")));
            } else {
                zzaiw.zza();
            }
            this.zzb = zzajk.zza(jSONObject.optJSONArray("signinMethods"));
            return this;
        } catch (NullPointerException e) {
            e = e;
            throw zzajk.zza(e, zza, str);
        } catch (JSONException e2) {
            e = e2;
            throw zzajk.zza(e, zza, str);
        }
    }

    @Nullable
    public final List<String> zza() {
        return this.zzb;
    }
}
