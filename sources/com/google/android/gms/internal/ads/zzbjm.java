package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbjm implements zzbjl {
    private final zzdvs zza;

    public zzbjm(zzdvs zzdvsVar) {
        Preconditions.checkNotNull(zzdvsVar, "The Inspector Manager must not be null");
        this.zza = zzdvsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final void zza(Object obj, Map map) {
        if (map == null || !map.containsKey("persistentData") || TextUtils.isEmpty((CharSequence) map.get("persistentData"))) {
            return;
        }
        this.zza.zzj((String) map.get("persistentData"));
    }
}
