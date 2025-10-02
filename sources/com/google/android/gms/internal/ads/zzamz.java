package com.google.android.gms.internal.ads;

import com.google.android.gms.location.DeviceOrientationRequest;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzamz {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzel zza = new zzel(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzef zzb = new zzef();

    public static long zze(zzef zzefVar) {
        int iZzg = zzefVar.zzg();
        if (zzefVar.zzd() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzefVar.zzm(bArr, 0, 9);
        zzefVar.zzh(iZzg);
        byte b = bArr[0];
        if ((b & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b2 = bArr[2];
        if ((b2 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b3 = bArr[4];
        if ((b3 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j = b;
        long j2 = b2;
        long j3 = (248 & j2) >> 3;
        long j4 = (j2 & 3) << 13;
        return j4 | ((bArr[1] & 255) << 20) | ((j & 3) << 28) | (((j & 56) >> 3) << 30) | (j3 << 15) | ((bArr[3] & 255) << 5) | ((b3 & 248) >> 3);
    }

    private final int zzf(zzacv zzacvVar) {
        byte[] bArr = zzeo.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
        this.zzc = true;
        zzacvVar.zzl();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final zzel zzb() {
        return this.zza;
    }

    public final int zzc(zzacv zzacvVar, zzads zzadsVar) throws IOException {
        long j = -9223372036854775807L;
        if (!this.zze) {
            long jZzo = zzacvVar.zzo();
            int iMin = (int) Math.min(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, jZzo);
            long j2 = jZzo - iMin;
            if (zzacvVar.zzn() != j2) {
                zzadsVar.zza = j2;
                return 1;
            }
            zzef zzefVar = this.zzb;
            zzefVar.zza(iMin);
            zzacvVar.zzl();
            zzacvVar.zzi(zzefVar.zzi(), 0, iMin);
            int iZzg = zzefVar.zzg();
            int iZze = zzefVar.zze() - 4;
            while (true) {
                if (iZze < iZzg) {
                    break;
                }
                if (zzg(zzefVar.zzi(), iZze) == 442) {
                    zzefVar.zzh(iZze + 4);
                    long jZze = zze(zzefVar);
                    if (jZze != -9223372036854775807L) {
                        j = jZze;
                        break;
                    }
                }
                iZze--;
            }
            this.zzg = j;
            this.zze = true;
            return 0;
        }
        if (this.zzg == -9223372036854775807L) {
            zzf(zzacvVar);
            return 0;
        }
        if (this.zzd) {
            long j3 = this.zzf;
            if (j3 == -9223372036854775807L) {
                zzf(zzacvVar);
                return 0;
            }
            zzel zzelVar = this.zza;
            this.zzh = zzelVar.zzf(this.zzg) - zzelVar.zze(j3);
            zzf(zzacvVar);
            return 0;
        }
        int iMin2 = (int) Math.min(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, zzacvVar.zzo());
        if (zzacvVar.zzn() != 0) {
            zzadsVar.zza = 0L;
            return 1;
        }
        zzef zzefVar2 = this.zzb;
        zzefVar2.zza(iMin2);
        zzacvVar.zzl();
        zzacvVar.zzi(zzefVar2.zzi(), 0, iMin2);
        int iZzg2 = zzefVar2.zzg();
        int iZze2 = zzefVar2.zze();
        while (true) {
            if (iZzg2 >= iZze2 - 3) {
                break;
            }
            if (zzg(zzefVar2.zzi(), iZzg2) == 442) {
                zzefVar2.zzh(iZzg2 + 4);
                long jZze2 = zze(zzefVar2);
                if (jZze2 != -9223372036854775807L) {
                    j = jZze2;
                    break;
                }
            }
            iZzg2++;
        }
        this.zzf = j;
        this.zzd = true;
        return 0;
    }

    public final long zzd() {
        return this.zzh;
    }
}
