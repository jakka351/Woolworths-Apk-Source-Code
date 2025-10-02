package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class zzajl implements zzaez<zzajl> {
    private static final String zza = "zzajl";

    @Nullable
    private String zzb;

    @Nullable
    private String zzc;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaez
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzajl zza(String str) throws zzacn {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = Strings.emptyToNull(jSONObject.optString("idToken"));
            this.zzc = Strings.emptyToNull(jSONObject.optString("refreshToken"));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzajk.zza(e, zza, str);
        }
    }

    @Nullable
    public final String zza() {
        return this.zzb;
    }

    @Nullable
    public final String zzb() {
        return this.zzc;
    }
}
