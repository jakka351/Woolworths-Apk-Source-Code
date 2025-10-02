package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzewl implements zzeun {
    private final String zza;
    private final String zzb;

    public zzewl(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) throws JSONException {
        try {
            JSONObject jSONObjectZzh = com.google.android.gms.ads.internal.util.zzbp.zzh((JSONObject) obj, "pii");
            jSONObjectZzh.put("doritos", this.zza);
            jSONObjectZzh.put("doritos_v2", this.zzb);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting doritos string.");
        }
    }
}
