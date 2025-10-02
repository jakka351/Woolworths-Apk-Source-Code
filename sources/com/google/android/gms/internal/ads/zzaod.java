package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes5.dex */
final class zzaod {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};
    private static final byte[] zzc = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static boolean zza(zzacv zzacvVar) throws IOException {
        zzef zzefVar = new zzef(8);
        int i = zzaoc.zza(zzacvVar, zzefVar).zza;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        zzacvVar.zzi(zzefVar.zzi(), 0, 4);
        zzefVar.zzh(0);
        int iZzB = zzefVar.zzB();
        if (iZzB == 1463899717) {
            return true;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iZzB).length() + 23);
        sb.append("Unsupported form type: ");
        sb.append(iZzB);
        zzds.zze("WavHeaderReader", sb.toString());
        return false;
    }

    public static zzaob zzb(zzacv zzacvVar) throws IOException {
        byte[] bArr;
        int i;
        byte[] bArr2;
        zzef zzefVar = new zzef(16);
        long j = zzd(1718449184, zzacvVar, zzefVar).zzb;
        zzghc.zzh(j >= 16);
        zzacvVar.zzi(zzefVar.zzi(), 0, 16);
        zzefVar.zzh(0);
        int iZzu = zzefVar.zzu();
        int iZzu2 = zzefVar.zzu();
        int iZzI = zzefVar.zzI();
        int iZzI2 = zzefVar.zzI();
        int iZzu3 = zzefVar.zzu();
        int iZzu4 = zzefVar.zzu();
        int i2 = ((int) j) - 16;
        if (i2 > 0) {
            bArr = new byte[i2];
            zzacvVar.zzi(bArr, 0, i2);
            if (iZzu == 65534) {
                if (i2 == 24) {
                    zzef zzefVar2 = new zzef(bArr);
                    zzefVar2.zzu();
                    int iZzu5 = zzefVar2.zzu();
                    if (iZzu5 != 0 && iZzu5 != iZzu4) {
                        StringBuilder sb = new StringBuilder(String.valueOf(iZzu4).length() + String.valueOf(iZzu5).length() + 33 + 19);
                        androidx.constraintlayout.core.state.a.t(iZzu5, iZzu4, "validBits ( ", ")  != bitsPerSample( ", sb);
                        sb.append(") are not supported");
                        throw zzas.zzc(sb.toString());
                    }
                    int iZzI3 = zzefVar2.zzI();
                    if ((iZzI3 >> 18) != 0) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzI3).length() + 21);
                        sb2.append("invalid channel mask ");
                        sb2.append(iZzI3);
                        throw zzas.zzc(sb2.toString());
                    }
                    if (iZzI3 != 0 && Integer.bitCount(iZzI3) != iZzu2) {
                        int iBitCount = Integer.bitCount(iZzI3);
                        StringBuilder sb3 = new StringBuilder(String.valueOf(iBitCount).length() + 46 + String.valueOf(iZzI3).length());
                        sb3.append("invalid number of channels (");
                        sb3.append(iBitCount);
                        sb3.append(") in channel mask ");
                        sb3.append(iZzI3);
                        throw zzas.zzc(sb3.toString());
                    }
                    iZzu = zzefVar2.zzu();
                    byte[] bArr3 = new byte[14];
                    zzefVar2.zzm(bArr3, 0, 14);
                    if (!Arrays.equals(bArr3, zzb) && !Arrays.equals(bArr3, zzc)) {
                        throw zzas.zzc("invalid wav format extension guid");
                    }
                } else {
                    bArr2 = bArr;
                    i = 65534;
                }
            }
            zzacvVar.zzf((int) (zzacvVar.zzm() - zzacvVar.zzn()));
            return new zzaob(i, iZzu2, iZzI, iZzI2, iZzu3, iZzu4, bArr2);
        }
        bArr = zzeo.zzb;
        i = iZzu;
        bArr2 = bArr;
        zzacvVar.zzf((int) (zzacvVar.zzm() - zzacvVar.zzn()));
        return new zzaob(i, iZzu2, iZzI, iZzI2, iZzu3, iZzu4, bArr2);
    }

    public static Pair zzc(zzacv zzacvVar) throws IOException {
        zzacvVar.zzl();
        zzaoc zzaocVarZzd = zzd(1684108385, zzacvVar, new zzef(8));
        zzacvVar.zzf(8);
        return Pair.create(Long.valueOf(zzacvVar.zzn()), Long.valueOf(zzaocVarZzd.zzb));
    }

    private static zzaoc zzd(int i, zzacv zzacvVar, zzef zzefVar) throws IOException {
        zzaoc zzaocVarZza = zzaoc.zza(zzacvVar, zzefVar);
        while (true) {
            int i2 = zzaocVarZza.zza;
            if (i2 == i) {
                return zzaocVarZza;
            }
            com.google.android.gms.common.api.internal.a.r(new StringBuilder(String.valueOf(i2).length() + 28), "Ignoring unknown WAV chunk: ", i2, "WavHeaderReader");
            long j = zzaocVarZza.zzb;
            long j2 = 8 + j;
            if ((1 & j) != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 40);
                sb.append("Chunk is too large (~2GB+) to skip; id: ");
                sb.append(i2);
                throw zzas.zzc(sb.toString());
            }
            zzacvVar.zzf((int) j2);
            zzaocVarZza = zzaoc.zza(zzacvVar, zzefVar);
        }
    }
}
