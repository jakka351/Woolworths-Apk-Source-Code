package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class zzait implements zzaez<zzait> {
    private static final String zza = "zzait";

    @Nullable
    private String zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaez
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzait zza(String str) throws zzacn {
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("phoneResponseInfo");
            if (jSONObjectOptJSONObject == null) {
                return this;
            }
            this.zzb = Strings.emptyToNull(jSONObjectOptJSONObject.optString("sessionInfo"));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzajk.zza(e, zza, str);
        }
    }

    @Nullable
    public final String zza() {
        return this.zzb;
    }
}
