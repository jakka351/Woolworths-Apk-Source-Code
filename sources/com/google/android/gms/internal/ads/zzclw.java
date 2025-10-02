package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes5.dex */
public final class zzclw implements zzcky {
    private final zzdvs zza;

    public zzclw(zzdvs zzdvsVar) {
        this.zza = zzdvsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcky
    public final void zza(Map map) throws JSONException {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.zza.zzc(str.equals("true"));
    }
}
