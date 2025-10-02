package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzewp implements zzeun {
    private final List zza;

    public zzewp(List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) throws JSONException {
        try {
            ((JSONObject) obj).put("eid", TextUtils.join(",", this.zza));
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting experiment ids.");
        }
    }
}
