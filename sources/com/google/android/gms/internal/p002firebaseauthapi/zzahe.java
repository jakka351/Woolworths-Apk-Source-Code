package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzahe implements zzahb {
    private final String zza;

    @Nullable
    private final String zzb;

    @Nullable
    private final String zzc;

    @Nullable
    private final String zzd;

    @VisibleForTesting
    private zzahe(String str, String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        Preconditions.checkNotEmpty(str);
        this.zza = Preconditions.checkNotEmpty(str2);
        this.zzb = str3;
        this.zzc = str4;
        this.zzd = str5;
    }

    public static zzahe zza(String str, String str2, @Nullable String str3, String str4) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str4);
        return new zzahe("totp", str, str2, str3, str4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafa
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        String str = this.zzb;
        if (str != null) {
            jSONObject2.put("verificationCode", str);
        }
        jSONObject.put("totpVerificationInfo", jSONObject2);
        jSONObject.put("mfaPendingCredential", this.zza);
        String str2 = this.zzc;
        if (str2 != null) {
            jSONObject.put("tenantId", str2);
        }
        String str3 = this.zzd;
        if (str3 != null) {
            jSONObject.put("mfaEnrollmentId", str3);
        }
        return jSONObject.toString();
    }
}
