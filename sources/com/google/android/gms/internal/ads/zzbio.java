package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* loaded from: classes5.dex */
final class zzbio implements zzbjl {
    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcek zzcekVar = (zzcek) obj;
        try {
            String str = (String) map.get("enabled");
            zzbjl zzbjlVar = zzbjk.zza;
            if (!zzggj.zze("true", str) && !zzggj.zze("false", str)) {
                return;
            }
            zzftj.zza(zzcekVar.getContext()).zzd(Boolean.parseBoolean(str));
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
