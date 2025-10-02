package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class zzbiy implements zzbjl {
    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcek zzcekVar = (zzcek) obj;
        if (map.containsKey("start")) {
            zzcekVar.zzP().zzr();
        } else if (map.containsKey("stop")) {
            zzcekVar.zzP().zzs();
        } else if (map.containsKey("cancel")) {
            zzcekVar.zzP().zzt();
        }
    }
}
