package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzaij implements zzafa {
    private final String zza;
    private final long zzb;
    private final boolean zzc;
    private final String zzd;

    @Nullable
    private final String zze;

    @Nullable
    private final String zzf;

    @Nullable
    private final String zzg;

    @Nullable
    private final String zzh;
    private final boolean zzi;

    @Nullable
    private zzagm zzj;

    public zzaij(String str, long j, boolean z, String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, boolean z2) {
        this.zza = Preconditions.checkNotEmpty(str);
        this.zzb = j;
        this.zzc = z;
        this.zzd = str2;
        this.zze = str3;
        this.zzf = str4;
        this.zzg = str5;
        this.zzh = str6;
        this.zzi = z2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafa
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("phoneNumber", this.zza);
        String str = this.zze;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        String str2 = this.zzf;
        if (str2 != null) {
            jSONObject.put("recaptchaToken", str2);
        }
        zzagm zzagmVar = this.zzj;
        if (zzagmVar != null) {
            jSONObject.put("autoRetrievalInfo", zzagmVar.zza());
        }
        String str3 = this.zzg;
        if (str3 != null) {
            jSONObject.put("playIntegrityToken", str3);
        }
        String str4 = this.zzh;
        if (str4 != null) {
            zzajk.zza(jSONObject, "captchaResponse", str4);
        } else {
            zzajk.zza(jSONObject);
        }
        return jSONObject.toString();
    }

    public final long zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }

    public final boolean zzf() {
        return this.zzi;
    }

    public final void zza(zzagm zzagmVar) {
        this.zzj = zzagmVar;
    }
}
