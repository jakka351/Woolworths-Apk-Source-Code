package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes5.dex */
final class zzanj {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzel zza = new zzel(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzef zzb = new zzef();

    public zzanj(int i) {
    }

    private final int zze(zzacv zzacvVar) {
        byte[] bArr = zzeo.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
        this.zzc = true;
        zzacvVar.zzl();
        return 0;
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final int zzb(zzacv zzacvVar, zzads zzadsVar, int i) throws IOException {
        if (i <= 0) {
            zze(zzacvVar);
            return 0;
        }
        long j = -9223372036854775807L;
        if (this.zze) {
            if (this.zzg == -9223372036854775807L) {
                zze(zzacvVar);
                return 0;
            }
            if (this.zzd) {
                long j2 = this.zzf;
                if (j2 == -9223372036854775807L) {
                    zze(zzacvVar);
                    return 0;
                }
                zzel zzelVar = this.zza;
                this.zzh = zzelVar.zzf(this.zzg) - zzelVar.zze(j2);
                zze(zzacvVar);
                return 0;
            }
            int iMin = (int) Math.min(112800L, zzacvVar.zzo());
            if (zzacvVar.zzn() != 0) {
                zzadsVar.zza = 0L;
                return 1;
            }
            zzef zzefVar = this.zzb;
            zzefVar.zza(iMin);
            zzacvVar.zzl();
            zzacvVar.zzi(zzefVar.zzi(), 0, iMin);
            int iZzg = zzefVar.zzg();
            int iZze = zzefVar.zze();
            while (true) {
                if (iZzg >= iZze) {
                    break;
                }
                if (zzefVar.zzi()[iZzg] == 71) {
                    long jZzb = zzant.zzb(zzefVar, iZzg, i);
                    if (jZzb != -9223372036854775807L) {
                        j = jZzb;
                        break;
                    }
                }
                iZzg++;
            }
            this.zzf = j;
            this.zzd = true;
            return 0;
        }
        long jZzo = zzacvVar.zzo();
        int iMin2 = (int) Math.min(112800L, jZzo);
        long j3 = jZzo - iMin2;
        if (zzacvVar.zzn() != j3) {
            zzadsVar.zza = j3;
            return 1;
        }
        zzef zzefVar2 = this.zzb;
        zzefVar2.zza(iMin2);
        zzacvVar.zzl();
        zzacvVar.zzi(zzefVar2.zzi(), 0, iMin2);
        int iZzg2 = zzefVar2.zzg();
        int iZze2 = zzefVar2.zze();
        int i2 = iZze2 - 188;
        while (true) {
            if (i2 < iZzg2) {
                break;
            }
            byte[] bArrZzi = zzefVar2.zzi();
            int i3 = -4;
            int i4 = 0;
            while (true) {
                if (i3 > 4) {
                    break;
                }
                int i5 = (i3 * 188) + i2;
                if (i5 < iZzg2 || i5 >= iZze2 || bArrZzi[i5] != 71) {
                    i4 = 0;
                } else {
                    i4++;
                    if (i4 == 5) {
                        long jZzb2 = zzant.zzb(zzefVar2, i2, i);
                        if (jZzb2 != -9223372036854775807L) {
                            j = jZzb2;
                            break;
                        }
                    }
                }
                i3++;
            }
            i2--;
        }
        this.zzg = j;
        this.zze = true;
        return 0;
    }

    public final long zzc() {
        return this.zzh;
    }

    public final zzel zzd() {
        return this.zza;
    }
}
