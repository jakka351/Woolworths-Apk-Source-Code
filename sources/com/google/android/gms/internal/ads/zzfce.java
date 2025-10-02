package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes5.dex */
final class zzfce implements zzelx {
    final /* synthetic */ zzfcg zza;

    public zzfce(zzfcg zzfcgVar) {
        Objects.requireNonNull(zzfcgVar);
        this.zza = zzfcgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final void zza() {
        zzfcg zzfcgVar = this.zza;
        synchronized (zzfcgVar) {
            zzfcgVar.zzx(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfcg zzfcgVar = this.zza;
        zzdom zzdomVar = (zzdom) obj;
        synchronized (zzfcgVar) {
            try {
                zzfcgVar.zzx(zzdomVar);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdX)).booleanValue()) {
                    zzdomVar.zzh().zza = zzfcgVar.zzv();
                }
                zzfcgVar.zzw().zzj();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
