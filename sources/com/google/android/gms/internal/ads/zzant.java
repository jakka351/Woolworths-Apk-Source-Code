package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzant {
    public static int zza(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long zzb(zzef zzefVar, int i, int i2) {
        zzefVar.zzh(i);
        if (zzefVar.zzd() < 5) {
            return -9223372036854775807L;
        }
        int iZzB = zzefVar.zzB();
        if ((8388608 & iZzB) != 0 || ((iZzB >> 8) & 8191) != i2 || (iZzB & 32) == 0 || zzefVar.zzs() < 7 || zzefVar.zzd() < 7 || (zzefVar.zzs() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        zzefVar.zzm(bArr, 0, 6);
        long j = bArr[0];
        long j2 = bArr[1];
        long j3 = bArr[2];
        long j4 = bArr[3] & 255;
        return ((j & 255) << 25) | ((j2 & 255) << 17) | ((j3 & 255) << 9) | (j4 + j4) | ((bArr[4] & 255) >> 7);
    }
}
