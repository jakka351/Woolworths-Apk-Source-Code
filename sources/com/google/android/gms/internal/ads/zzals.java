package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class zzals implements zzacu {
    private final zzalt zza = new zzalt(null, 0, "audio/ac3");
    private final zzef zzb = new zzef(2786);
    private boolean zzc;

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws IOException {
        zzef zzefVar = new zzef(10);
        int i = 0;
        while (true) {
            zzacl zzaclVar = (zzacl) zzacvVar;
            zzaclVar.zzh(zzefVar.zzi(), 0, 10, false);
            zzefVar.zzh(0);
            if (zzefVar.zzx() != 4801587) {
                break;
            }
            zzefVar.zzk(3);
            int iZzG = zzefVar.zzG();
            i += iZzG + 10;
            zzaclVar.zzj(iZzG, false);
        }
        zzacvVar.zzl();
        zzacl zzaclVar2 = (zzacl) zzacvVar;
        zzaclVar2.zzj(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            zzaclVar2.zzh(zzefVar.zzi(), 0, 6, false);
            zzefVar.zzh(0);
            if (zzefVar.zzt() != 2935) {
                zzacvVar.zzl();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                zzaclVar2.zzj(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int iZzd = zzabv.zzd(zzefVar.zzi());
                if (iZzd == -1) {
                    return false;
                }
                zzaclVar2.zzj(iZzd - 6, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        this.zza.zzb(zzacxVar, new zzanr(Integer.MIN_VALUE, 0, 1));
        zzacxVar.zzv();
        zzacxVar.zzw(new zzadu(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) throws IOException {
        zzef zzefVar = this.zzb;
        int iZza = zzacvVar.zza(zzefVar.zzi(), 0, 2786);
        if (iZza == -1) {
            return -1;
        }
        zzefVar.zzh(0);
        zzefVar.zzf(iZza);
        if (!this.zzc) {
            this.zza.zzc(0L, 4);
            this.zzc = true;
        }
        this.zza.zzd(zzefVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j, long j2) {
        this.zzc = false;
        this.zza.zza();
    }
}
