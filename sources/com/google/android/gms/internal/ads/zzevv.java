package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzevv implements zzeun {
    private final String zza;

    public zzevv(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) throws JSONException {
        try {
            ((JSONObject) obj).put("ms", this.zza);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting Ad ID.", e);
        }
    }
}
