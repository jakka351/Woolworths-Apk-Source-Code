package com.google.android.gms.internal.ads;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbjn implements zzbjl {
    private final zzbjo zza;

    public zzbjn(zzbjo zzbjoVar) {
        this.zza = zzbjoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) throws NumberFormatException {
        zzcek zzcekVar = (zzcek) obj;
        boolean zEquals = "1".equals(map.get("transparentBackground"));
        boolean zEquals2 = "1".equals(map.get("blur"));
        float f = BitmapDescriptorFactory.HUE_RED;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Fail to parse float", e);
        }
        zzbjo zzbjoVar = this.zza;
        zzbjoVar.zza(zEquals);
        zzbjoVar.zzb(zEquals2, f);
        zzcekVar.zzaE(zEquals);
    }
}
