package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.NonNull;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class zzaip implements zzaez<zzaip> {
    private static final String zza = "zzaip";
    private String zzb;
    private String zzc;
    private long zzd;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaez
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzaip zza(String str) throws zzacn {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = Strings.emptyToNull(jSONObject.optString("idToken", null));
            Strings.emptyToNull(jSONObject.optString("displayName", null));
            Strings.emptyToNull(jSONObject.optString(Scopes.EMAIL, null));
            this.zzc = Strings.emptyToNull(jSONObject.optString("refreshToken", null));
            this.zzd = jSONObject.optLong("expiresIn", 0L);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzajk.zza(e, zza, str);
        }
    }

    public final long zza() {
        return this.zzd;
    }

    @NonNull
    public final String zzc() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zzb;
    }
}
