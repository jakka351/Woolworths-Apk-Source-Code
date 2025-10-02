package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzfdp {
    private final zzfcj zza;
    private final zzfcm zzb;
    private final zzfjv zzc;
    private final zzfjn zzd;
    private final zzfib zze;
    private final zzcmi zzf;

    @VisibleForTesting
    public zzfdp(zzfjv zzfjvVar, zzfjn zzfjnVar, zzfcj zzfcjVar, zzfcm zzfcmVar, zzcmi zzcmiVar, zzfib zzfibVar) {
        this.zza = zzfcjVar;
        this.zzb = zzfcmVar;
        this.zzc = zzfjvVar;
        this.zzd = zzfjnVar;
        this.zzf = zzcmiVar;
        this.zze = zzfibVar;
    }

    public final void zza(List list, @Nullable zzcyh zzcyhVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzc((String) it.next(), 2, zzcyhVar);
        }
    }

    public final void zzb(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            zzgot.zzq((((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkQ)).booleanValue() && zzcmi.zzc(str)) ? this.zzf.zzb(str, com.google.android.gms.ads.internal.client.zzbb.zze()) : zzgot.zza(str), new zzfdo(this, i), zzbzh.zza);
        }
    }

    public final void zzc(String str, int i, @Nullable zzcyh zzcyhVar) {
        zzfcj zzfcjVar = this.zza;
        if (zzfcjVar.zzai) {
            this.zzd.zza(str, this.zzb.zzb, i);
            return;
        }
        this.zzc.zzb(str, zzfcjVar.zzax, this.zze, zzcyhVar);
    }
}
