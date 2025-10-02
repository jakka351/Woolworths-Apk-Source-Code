package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes5.dex */
final class zzanh implements zzacf {
    private final zzel zza;
    private final zzef zzb = new zzef();
    private final int zzc;

    public zzanh(int i, zzel zzelVar, int i2) {
        this.zzc = i;
        this.zza = zzelVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacf
    public final zzace zza(zzacv zzacvVar, long j) throws IOException {
        int iZza;
        int iZza2;
        long jZzn = zzacvVar.zzn();
        int iMin = (int) Math.min(112800L, zzacvVar.zzo() - jZzn);
        zzef zzefVar = this.zzb;
        zzefVar.zza(iMin);
        zzacvVar.zzi(zzefVar.zzi(), 0, iMin);
        int iZze = zzefVar.zze();
        long j2 = -1;
        long j3 = -9223372036854775807L;
        long j4 = -1;
        while (zzefVar.zzd() >= 188 && (iZza2 = (iZza = zzant.zza(zzefVar.zzi(), zzefVar.zzg(), iZze)) + 188) <= iZze) {
            long jZzb = zzant.zzb(zzefVar, iZza, this.zzc);
            if (jZzb != -9223372036854775807L) {
                long jZze = this.zza.zze(jZzb);
                if (jZze > j) {
                    return j3 == -9223372036854775807L ? zzace.zza(jZze, jZzn) : zzace.zzc(jZzn + j4);
                }
                j4 = iZza;
                if (100000 + jZze > j) {
                    return zzace.zzc(jZzn + j4);
                }
                j3 = jZze;
            }
            zzefVar.zzh(iZza2);
            j2 = iZza2;
        }
        return j3 != -9223372036854775807L ? zzace.zzb(j3, jZzn + j2) : zzace.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzacf
    public final void zzb() {
        byte[] bArr = zzeo.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
    }
}
