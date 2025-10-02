package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes5.dex */
final class zzbiz implements zzbjl {
    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcek zzcekVar = (zzcek) obj;
        if (map.containsKey("start")) {
            zzcekVar.zzas(true);
        }
        if (map.containsKey("stop")) {
            zzcekVar.zzas(false);
        }
    }
}
