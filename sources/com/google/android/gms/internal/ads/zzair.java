package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class zzair {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    @Nullable
    public static zzadz zza(zzacv zzacvVar) throws IOException {
        return zzc(zzacvVar, true, false);
    }

    @Nullable
    public static zzadz zzb(zzacv zzacvVar, boolean z) throws IOException {
        return zzc(zzacvVar, false, z);
    }

    @Nullable
    private static zzadz zzc(zzacv zzacvVar, boolean z, boolean z2) throws IOException {
        zzadz zzadzVar;
        long j;
        zzef zzefVar;
        int i;
        long j2;
        int i2;
        int[] iArr;
        long jZzo = zzacvVar.zzo();
        long j3 = -1;
        long j4 = 4096;
        if (jZzo != -1 && jZzo <= 4096) {
            j4 = jZzo;
        }
        zzef zzefVar2 = new zzef(64);
        int i3 = (int) j4;
        int i4 = 0;
        int i5 = 0;
        boolean z3 = false;
        while (i5 < i3) {
            zzefVar2.zza(8);
            boolean z4 = true;
            if (!zzacvVar.zzh(zzefVar2.zzi(), i4, 8, true)) {
                break;
            }
            long jZzz = zzefVar2.zzz();
            int iZzB = zzefVar2.zzB();
            if (jZzz == 1) {
                j = j3;
                zzacvVar.zzi(zzefVar2.zzi(), 8, 8);
                i = 16;
                zzefVar2.zzf(16);
                jZzz = zzefVar2.zzD();
                zzefVar = zzefVar2;
            } else {
                j = j3;
                if (jZzz == 0) {
                    long jZzo2 = zzacvVar.zzo();
                    if (jZzo2 != j) {
                        jZzz = (jZzo2 - zzacvVar.zzm()) + 8;
                    }
                }
                zzefVar = zzefVar2;
                i = 8;
            }
            long j5 = jZzz;
            zzadzVar = null;
            long j6 = i;
            if (j5 < j6) {
                return new zzahm(iZzB, j5, i);
            }
            i5 += i;
            if (iZzB == 1836019574) {
                i3 += (int) j5;
                if (jZzo != -1 && i3 > jZzo) {
                    i3 = (int) jZzo;
                }
                zzefVar2 = zzefVar;
                j3 = j;
                i4 = 0;
            } else {
                if (iZzB == 1953653099 || iZzB == 1835297121 || iZzB == 1835626086) {
                    j2 = jZzo;
                    i2 = 0;
                } else {
                    if (iZzB == 1836019558 || iZzB == 1836475768) {
                        i4 = 1;
                        break;
                    }
                    z3 |= !(iZzB != 1835295092);
                    if (iZzB == 1937007212) {
                        if (j5 > 1000000) {
                            i4 = 0;
                            break;
                        }
                        iZzB = 1937007212;
                    }
                    j2 = jZzo;
                    if ((i5 + j5) - j6 >= i3) {
                        i4 = 0;
                        break;
                    }
                    int i6 = (int) (j5 - j6);
                    i5 += i6;
                    if (iZzB != 1718909296) {
                        i2 = 0;
                        if (i6 != 0) {
                            zzacvVar.zzk(i6);
                        }
                    } else {
                        if (i6 < 8) {
                            return new zzahm(1718909296, i6, 8);
                        }
                        zzefVar.zza(i6);
                        i2 = 0;
                        zzacvVar.zzi(zzefVar.zzi(), 0, i6);
                        int iZzB2 = zzefVar.zzB();
                        boolean zZzd = zzd(iZzB2, z2) | z3;
                        zzefVar.zzk(4);
                        int iZzd = zzefVar.zzd() / 4;
                        if (!zZzd && iZzd > 0) {
                            iArr = new int[iZzd];
                            int i7 = 0;
                            while (true) {
                                if (i7 >= iZzd) {
                                    z4 = zZzd;
                                    break;
                                }
                                int iZzB3 = zzefVar.zzB();
                                iArr[i7] = iZzB3;
                                if (zzd(iZzB3, z2)) {
                                    break;
                                }
                                i7++;
                            }
                        } else {
                            z4 = zZzd;
                            iArr = null;
                        }
                        if (!z4) {
                            return new zzaiw(iZzB2, iArr);
                        }
                        z3 = z4;
                    }
                }
                i4 = i2;
                zzefVar2 = zzefVar;
                j3 = j;
                jZzo = j2;
            }
        }
        zzadzVar = null;
        return !z3 ? zzain.zza : z != i4 ? i4 != 0 ? zzaig.zza : zzaig.zzb : zzadzVar;
    }

    private static boolean zzd(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579) {
            if (z) {
                return true;
            }
            i = 1751476579;
        }
        int[] iArr = zza;
        for (int i2 = 0; i2 < 29; i2++) {
            if (iArr[i2] == i) {
                return true;
            }
        }
        return false;
    }
}
