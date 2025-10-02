package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Scopes;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class zzagw implements zzaez<zzagw> {
    private static final String zza = "zzagw";
    private String zzb;
    private String zzc;
    private boolean zzd;
    private long zze;

    @Nullable
    private List<zzahy> zzf;

    @Nullable
    private String zzg;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaez
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzagw zza(String str) throws zzacn {
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optString("localId", null);
            jSONObject.optString(Scopes.EMAIL, null);
            this.zzb = jSONObject.optString("idToken", null);
            this.zzc = jSONObject.optString("refreshToken", null);
            this.zzd = jSONObject.optBoolean("isNewUser", false);
            this.zze = jSONObject.optLong("expiresIn", 0L);
            this.zzf = zzahy.zza(jSONObject.optJSONArray("mfaInfo"));
            this.zzg = jSONObject.optString("mfaPendingCredential", null);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzajk.zza(e, zza, str);
        }
    }

    public final long zza() {
        return this.zze;
    }

    @Nullable
    public final String zzc() {
        return this.zzg;
    }

    @NonNull
    public final String zzd() {
        return this.zzc;
    }

    @Nullable
    public final List<zzahy> zze() {
        return this.zzf;
    }

    public final boolean zzf() {
        return !TextUtils.isEmpty(this.zzg);
    }

    public final boolean zzg() {
        return this.zzd;
    }

    @NonNull
    public final String zzb() {
        return this.zzb;
    }
}
