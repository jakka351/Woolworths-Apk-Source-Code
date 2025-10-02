package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class zzalv implements zzacu {
    private final zzalw zza = new zzalw(null, 0, "audio/ac4");
    private final zzef zzb = new zzef(16384);
    private boolean zzc;

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws IOException {
        int i;
        zzef zzefVar = new zzef(10);
        int i2 = 0;
        while (true) {
            zzacl zzaclVar = (zzacl) zzacvVar;
            zzaclVar.zzh(zzefVar.zzi(), 0, 10, false);
            zzefVar.zzh(0);
            if (zzefVar.zzx() != 4801587) {
                break;
            }
            zzefVar.zzk(3);
            int iZzG = zzefVar.zzG();
            i2 += iZzG + 10;
            zzaclVar.zzj(iZzG, false);
        }
        zzacvVar.zzl();
        zzacl zzaclVar2 = (zzacl) zzacvVar;
        zzaclVar2.zzj(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            zzaclVar2.zzh(zzefVar.zzi(), 0, 7, false);
            zzefVar.zzh(0);
            int iZzt = zzefVar.zzt();
            if (iZzt == 44096 || iZzt == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArrZzi = zzefVar.zzi();
                if (bArrZzi.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArrZzi[2] & 255) << 8) | (bArrZzi[3] & 255);
                    if (i6 == 65535) {
                        i6 = ((bArrZzi[4] & 255) << 16) | ((bArrZzi[5] & 255) << 8) | (bArrZzi[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (iZzt == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    return false;
                }
                zzaclVar2.zzj(i - 7, false);
            } else {
                zzacvVar.zzl();
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                zzaclVar2.zzj(i4, false);
                i3 = 0;
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
        int iZza = zzacvVar.zza(zzefVar.zzi(), 0, 16384);
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
