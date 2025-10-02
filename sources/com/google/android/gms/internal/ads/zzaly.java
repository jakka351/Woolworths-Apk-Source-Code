package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class zzaly implements zzacu {
    private final zzalz zza;
    private final zzef zzb;
    private final zzef zzc;
    private final zzee zzd;
    private zzacx zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;

    public zzaly() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws IOException {
        zzef zzefVar;
        int i = 0;
        while (true) {
            zzefVar = this.zzc;
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
        if (this.zzg == -1) {
            this.zzg = i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            zzaclVar2.zzh(zzefVar.zzi(), 0, 2, false);
            zzefVar.zzh(0);
            if (zzalz.zzf(zzefVar.zzt())) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                zzaclVar2.zzh(zzefVar.zzi(), 0, 4, false);
                zzee zzeeVar = this.zzd;
                zzeeVar.zzf(14);
                int iZzj = zzeeVar.zzj(13);
                if (iZzj <= 6) {
                    i4++;
                    zzacvVar.zzl();
                    zzaclVar2.zzj(i4, false);
                } else {
                    zzaclVar2.zzj(iZzj - 6, false);
                    i3 += iZzj;
                }
            } else {
                i4++;
                zzacvVar.zzl();
                zzaclVar2.zzj(i4, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        this.zze = zzacxVar;
        this.zza.zzb(zzacxVar, new zzanr(Integer.MIN_VALUE, 0, 1));
        zzacxVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) throws IOException {
        this.zze.getClass();
        zzef zzefVar = this.zzb;
        int iZza = zzacvVar.zza(zzefVar.zzi(), 0, 2048);
        if (!this.zzi) {
            this.zze.zzw(new zzadu(-9223372036854775807L, 0L));
            this.zzi = true;
        }
        if (iZza == -1) {
            return -1;
        }
        zzefVar.zzh(0);
        zzefVar.zzf(iZza);
        if (!this.zzh) {
            this.zza.zzc(this.zzf, 4);
            this.zzh = true;
        }
        this.zza.zzd(zzefVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j, long j2) {
        this.zzh = false;
        this.zza.zza();
        this.zzf = j2;
    }

    public zzaly(int i) {
        this.zza = new zzalz(true, null, 0, "audio/mp4a-latm");
        this.zzb = new zzef(2048);
        this.zzg = -1L;
        zzef zzefVar = new zzef(10);
        this.zzc = zzefVar;
        byte[] bArrZzi = zzefVar.zzi();
        this.zzd = new zzee(bArrZzi, bArrZzi.length);
    }
}
