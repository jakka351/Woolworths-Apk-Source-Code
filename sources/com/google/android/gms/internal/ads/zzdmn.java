package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class zzdmn {
    private final Executor zza;
    private final zzcnp zzb;
    private final zzddt zzc;
    private final zzcmi zzd;

    public zzdmn(Executor executor, zzcnp zzcnpVar, zzddt zzddtVar, zzcmi zzcmiVar) {
        this.zza = executor;
        this.zzc = zzddtVar;
        this.zzb = zzcnpVar;
        this.zzd = zzcmiVar;
    }

    public final void zza(final zzcek zzcekVar) {
        if (zzcekVar == null) {
            return;
        }
        zzddt zzddtVar = this.zzc;
        zzddtVar.zza(zzcekVar.zzE());
        zzayi zzayiVar = new zzayi() { // from class: com.google.android.gms.internal.ads.zzdmm
            @Override // com.google.android.gms.internal.ads.zzayi
            public final /* synthetic */ void zzdo(zzayh zzayhVar) {
                Rect rect = zzayhVar.zzd;
                zzcekVar.zzP().zza(rect.left, rect.top, false);
            }
        };
        Executor executor = this.zza;
        zzddtVar.zzq(zzayiVar, executor);
        zzddtVar.zzq(new zzayi() { // from class: com.google.android.gms.internal.ads.zzdmj
            @Override // com.google.android.gms.internal.ads.zzayi
            public final /* synthetic */ void zzdo(zzayh zzayhVar) {
                HashMap map = new HashMap();
                map.put("isVisible", true != zzayhVar.zzj ? "0" : "1");
                zzcekVar.zze("onAdVisibilityChanged", map);
            }
        }, executor);
        zzcnp zzcnpVar = this.zzb;
        zzddtVar.zzq(zzcnpVar, executor);
        zzcnpVar.zza(zzcekVar);
        zzcgi zzcgiVarZzP = zzcekVar.zzP();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkV)).booleanValue() && zzcgiVarZzP != null) {
            zzcmi zzcmiVar = this.zzd;
            zzcgiVarZzP.zzc(zzcmiVar);
            zzcgiVarZzP.zze(zzcmiVar, null, null);
        }
        zzcekVar.zzab("/trackActiveViewUnit", new zzbjl() { // from class: com.google.android.gms.internal.ads.zzdmk
            @Override // com.google.android.gms.internal.ads.zzbjl
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzb((zzcek) obj, map);
            }
        });
        zzcekVar.zzab("/untrackActiveViewUnit", new zzbjl() { // from class: com.google.android.gms.internal.ads.zzdml
            @Override // com.google.android.gms.internal.ads.zzbjl
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzc((zzcek) obj, map);
            }
        });
    }

    public final /* synthetic */ void zzb(zzcek zzcekVar, Map map) {
        this.zzb.zzd();
    }

    public final /* synthetic */ void zzc(zzcek zzcekVar, Map map) {
        this.zzb.zzb();
    }
}
