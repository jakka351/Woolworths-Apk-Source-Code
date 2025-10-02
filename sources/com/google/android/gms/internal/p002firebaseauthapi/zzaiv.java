package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzaiv extends zzair {
    private static final String zza = "zzaiv";

    @Nullable
    private String zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzair
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzaiv zza(String str) throws zzacn {
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("phoneSessionInfo");
            if (jSONObjectOptJSONObject == null) {
                return this;
            }
            this.zzb = zzac.zza(jSONObjectOptJSONObject.optString("sessionInfo"));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzajk.zza(e, zza, str);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzair, com.google.android.gms.internal.p002firebaseauthapi.zzaez
    public final /* synthetic */ zzaez zza(String str) throws zzacn {
        return (zzaiv) zza(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzair
    @Nullable
    public final String zza() {
        return this.zzb;
    }
}
