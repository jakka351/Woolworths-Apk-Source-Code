package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes5.dex */
final class zzehi implements zzgoq {
    final /* synthetic */ long zza;
    final /* synthetic */ zzfcm zzb;
    final /* synthetic */ zzfcj zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzfjr zze;
    final /* synthetic */ zzfcu zzf;
    final /* synthetic */ zzehk zzg;

    public zzehi(zzehk zzehkVar, long j, zzfcm zzfcmVar, zzfcj zzfcjVar, String str, zzfjr zzfjrVar, zzfcu zzfcuVar) {
        this.zza = j;
        this.zzb = zzfcmVar;
        this.zzc = zzfcjVar;
        this.zzd = str;
        this.zze = zzfjrVar;
        this.zzf = zzfcuVar;
        Objects.requireNonNull(zzehkVar);
        this.zzg = zzehkVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgoq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(java.lang.Throwable r14) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzehi.zza(java.lang.Throwable):void");
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zzb(Object obj) {
        long j;
        zzehk zzehkVar = this.zzg;
        long jElapsedRealtime = zzehkVar.zzj().elapsedRealtime() - this.zza;
        synchronized (zzehkVar) {
            try {
                if (zzehkVar.zzn()) {
                    j = jElapsedRealtime;
                    zzehkVar.zzk().zza(this.zzb, this.zzc, 0, null, j);
                } else {
                    j = jElapsedRealtime;
                }
                if (zzehkVar.zzp()) {
                    return;
                }
                zzfcj zzfcjVar = this.zzc;
                if (zzehkVar.zzi(zzfcjVar)) {
                    ((zzehj) zzehkVar.zzm().get(zzfcjVar)).zzd = j;
                } else {
                    long j2 = j;
                    j = j2;
                    zzehkVar.zzm().put(zzfcjVar, new zzehj(this.zzd, zzfcjVar.zzaf, 0, j2, null));
                }
                zzehkVar.zzo().zzd(zzfcjVar, j, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
