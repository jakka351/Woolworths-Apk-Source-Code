package com.google.android.gms.internal.ads;

import com.salesforce.marketingcloud.UrlHandler;
import java.util.Iterator;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzehm {
    private final zzfdv zza;
    private final zzdpz zzb;
    private final zzdsm zzc;

    public zzehm(zzfdv zzfdvVar, zzdpz zzdpzVar, zzdsm zzdsmVar) {
        this.zza = zzfdvVar;
        this.zzb = zzdpzVar;
        this.zzc = zzdsmVar;
    }

    public final void zza(zzfcm zzfcmVar, zzfcj zzfcjVar, int i, @Nullable zzeed zzeedVar, long j) {
        zzdpy zzdpyVarZzc;
        zzdsl zzdslVarZza = this.zzc.zza();
        zzdslVarZza.zza(zzfcmVar);
        zzdslVarZza.zzb(zzfcjVar);
        zzdslVarZza.zzc(UrlHandler.ACTION, "adapter_status");
        zzdslVarZza.zzc("adapter_l", String.valueOf(j));
        zzdslVarZza.zzc("sc", Integer.toString(i));
        if (zzeedVar != null) {
            zzdslVarZza.zzc("arec", Integer.toString(zzeedVar.zzb().zza));
            String strZza = this.zza.zza(zzeedVar.getMessage());
            if (strZza != null) {
                zzdslVarZza.zzc("areec", strZza);
            }
        }
        zzdpz zzdpzVar = this.zzb;
        Iterator it = zzfcjVar.zzt.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzdpyVarZzc = null;
                break;
            } else {
                zzdpyVarZzc = zzdpzVar.zzc((String) it.next());
                if (zzdpyVarZzc != null) {
                    break;
                }
            }
        }
        if (zzdpyVarZzc != null) {
            zzdslVarZza.zzc("ancn", zzdpyVarZzc.zza);
            zzbrl zzbrlVar = zzdpyVarZzc.zzb;
            if (zzbrlVar != null) {
                zzdslVarZza.zzc("adapter_v", zzbrlVar.toString());
            }
            zzbrl zzbrlVar2 = zzdpyVarZzc.zzc;
            if (zzbrlVar2 != null) {
                zzdslVarZza.zzc("adapter_sv", zzbrlVar2.toString());
            }
        }
        zzdslVarZza.zzd();
    }
}
