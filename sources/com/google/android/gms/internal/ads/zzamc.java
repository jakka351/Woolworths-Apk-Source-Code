package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class zzamc implements zzamd {
    private final List zza;
    private final zzaeb[] zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private final String zzb = "video/mp2t";
    private long zzg = -9223372036854775807L;

    public zzamc(List list, String str) {
        this.zza = list;
        this.zzc = new zzaeb[list.size()];
    }

    private final boolean zzf(zzef zzefVar, int i) {
        if (zzefVar.zzd() == 0) {
            return false;
        }
        if (zzefVar.zzs() != i) {
            this.zzd = false;
        }
        this.zze--;
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza() {
        this.zzd = false;
        this.zzg = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzb(zzacx zzacxVar, zzanr zzanrVar) {
        int i = 0;
        while (true) {
            zzaeb[] zzaebVarArr = this.zzc;
            if (i >= zzaebVarArr.length) {
                return;
            }
            zzano zzanoVar = (zzano) this.zza.get(i);
            zzanrVar.zza();
            zzaeb zzaebVarZzu = zzacxVar.zzu(zzanrVar.zzb(), 3);
            zzs zzsVar = new zzs();
            zzsVar.zza(zzanrVar.zzc());
            zzsVar.zzl(this.zzb);
            zzsVar.zzm("application/dvbsubs");
            zzsVar.zzp(Collections.singletonList(zzanoVar.zzb));
            zzsVar.zze(zzanoVar.zza);
            zzaebVarZzu.zzu(zzsVar.zzM());
            zzaebVarArr[i] = zzaebVarZzu;
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzc(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.zzd = true;
        this.zzg = j;
        this.zzf = 0;
        this.zze = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzd(zzef zzefVar) {
        if (this.zzd) {
            if (this.zze != 2 || zzf(zzefVar, 32)) {
                if (this.zze != 1 || zzf(zzefVar, 0)) {
                    int iZzg = zzefVar.zzg();
                    int iZzd = zzefVar.zzd();
                    for (zzaeb zzaebVar : this.zzc) {
                        zzefVar.zzh(iZzg);
                        zzaebVar.zzz(zzefVar, iZzd);
                    }
                    this.zzf += iZzd;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zze(boolean z) {
        if (this.zzd) {
            zzghc.zzh(this.zzg != -9223372036854775807L);
            for (zzaeb zzaebVar : this.zzc) {
                zzaebVar.zzx(this.zzg, 1, this.zzf, 0, null);
            }
            this.zzd = false;
        }
    }
}
