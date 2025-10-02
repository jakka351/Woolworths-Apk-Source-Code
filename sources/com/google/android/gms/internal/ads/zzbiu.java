package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes5.dex */
final class zzbiu implements zzbjl {
    @Override // com.google.android.gms.internal.ads.zzbjl
    public final void zza(Object obj, Map map) {
        String strValueOf = String.valueOf((String) map.get("string"));
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Received log message: ".concat(strValueOf));
    }
}
