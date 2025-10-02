package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class zzahy {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb;

    static {
        String str = zzeo.zza;
        zzb = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static int zza(int i) {
        return (i >> 24) & 255;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e6, code lost:
    
        r26 = -9223372036854775807L;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x0c67  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x0c69  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x0de5  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x0de9  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x0e54  */
    /* JADX WARN: Removed duplicated region for block: B:618:0x0e7f  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x0e8d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:630:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List zzb(com.google.android.gms.internal.ads.zzet r86, com.google.android.gms.internal.ads.zzadk r87, long r88, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzp r90, boolean r91, boolean r92, com.google.android.gms.internal.ads.zzggr r93, boolean r94) throws com.google.android.gms.internal.ads.zzas {
        /*
            Method dump skipped, instructions count: 3735
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahy.zzb(com.google.android.gms.internal.ads.zzet, com.google.android.gms.internal.ads.zzadk, long, com.google.android.gms.internal.ads.zzp, boolean, boolean, com.google.android.gms.internal.ads.zzggr, boolean):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzao zzc(com.google.android.gms.internal.ads.zzeu r14) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahy.zzc(com.google.android.gms.internal.ads.zzeu):com.google.android.gms.internal.ads.zzao");
    }

    public static zzex zzd(zzef zzefVar) {
        long jZzD;
        long jZzD2;
        zzefVar.zzh(8);
        if (zza(zzefVar.zzB()) == 0) {
            jZzD = zzefVar.zzz();
            jZzD2 = zzefVar.zzz();
        } else {
            jZzD = zzefVar.zzD();
            jZzD2 = zzefVar.zzD();
        }
        return new zzex(jZzD, jZzD2, zzefVar.zzz());
    }

    @Nullable
    public static zzao zze(zzet zzetVar) {
        zzer zzerVar;
        zzeu zzeuVarZzc = zzetVar.zzc(1751411826);
        zzeu zzeuVarZzc2 = zzetVar.zzc(1801812339);
        zzeu zzeuVarZzc3 = zzetVar.zzc(1768715124);
        if (zzeuVarZzc != null && zzeuVarZzc2 != null && zzeuVarZzc3 != null && zzi(zzeuVarZzc.zza) == 1835299937) {
            zzef zzefVar = zzeuVarZzc2.zza;
            zzefVar.zzh(12);
            int iZzB = zzefVar.zzB();
            String[] strArr = new String[iZzB];
            for (int i = 0; i < iZzB; i++) {
                int iZzB2 = zzefVar.zzB();
                zzefVar.zzk(4);
                strArr[i] = zzefVar.zzK(iZzB2 - 8, StandardCharsets.UTF_8);
            }
            zzef zzefVar2 = zzeuVarZzc3.zza;
            zzefVar2.zzh(8);
            ArrayList arrayList = new ArrayList();
            while (zzefVar2.zzd() > 8) {
                int iZzB3 = zzefVar2.zzB() + zzefVar2.zzg();
                int iZzB4 = zzefVar2.zzB() - 1;
                if (iZzB4 < 0 || iZzB4 >= iZzB) {
                    com.google.android.gms.common.api.internal.a.r(new StringBuilder(String.valueOf(iZzB4).length() + 41), "Skipped metadata with unknown key index: ", iZzB4, "BoxParsers");
                } else {
                    String str = strArr[iZzB4];
                    while (true) {
                        int iZzg = zzefVar2.zzg();
                        if (iZzg >= iZzB3) {
                            zzerVar = null;
                            break;
                        }
                        int iZzB5 = zzefVar2.zzB();
                        if (zzefVar2.zzB() == 1684108385) {
                            int iZzB6 = zzefVar2.zzB();
                            int iZzB7 = zzefVar2.zzB();
                            int i2 = iZzB5 - 16;
                            byte[] bArr = new byte[i2];
                            zzefVar2.zzm(bArr, 0, i2);
                            zzerVar = new zzer(str, bArr, iZzB7, iZzB6);
                            break;
                        }
                        zzefVar2.zzh(iZzg + iZzB5);
                    }
                    if (zzerVar != null) {
                        arrayList.add(zzerVar);
                    }
                }
                zzefVar2.zzh(iZzB3);
            }
            if (!arrayList.isEmpty()) {
                return new zzao(arrayList);
            }
        }
        return null;
    }

    public static void zzf(zzef zzefVar) {
        int iZzg = zzefVar.zzg();
        zzefVar.zzk(4);
        if (zzefVar.zzB() != 1751411826) {
            iZzg += 4;
        }
        zzefVar.zzh(iZzg);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x02a9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzaiv zzg(com.google.android.gms.internal.ads.zzais r47, com.google.android.gms.internal.ads.zzet r48, com.google.android.gms.internal.ads.zzadk r49, boolean r50) throws com.google.android.gms.internal.ads.zzas {
        /*
            Method dump skipped, instructions count: 1711
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahy.zzg(com.google.android.gms.internal.ads.zzais, com.google.android.gms.internal.ads.zzet, com.google.android.gms.internal.ads.zzadk, boolean):com.google.android.gms.internal.ads.zzaiv");
    }

    @Nullable
    private static zzao zzh(zzef zzefVar) {
        short sZzv = zzefVar.zzv();
        zzefVar.zzk(2);
        String strZzK = zzefVar.zzK(sZzv, StandardCharsets.UTF_8);
        int iMax = Math.max(strZzK.lastIndexOf(43), strZzK.lastIndexOf(45));
        try {
            return new zzao(-9223372036854775807L, new zzew(Float.parseFloat(strZzK.substring(0, iMax)), Float.parseFloat(strZzK.substring(iMax, strZzK.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static int zzi(zzef zzefVar) {
        zzefVar.zzh(16);
        return zzefVar.zzB();
    }

    private static String zzj(byte[] bArr, int i, int i2) {
        zzghc.zzh(bArr.length == 64);
        ArrayList arrayList = new ArrayList(16);
        for (int i3 = 0; i3 < bArr.length - 3; i3 += 4) {
            int iZze = zzgne.zze(bArr[i3], bArr[i3 + 1], bArr[i3 + 2], bArr[i3 + 3]);
            String str = zzeo.zza;
            int i4 = ((iZze >> 8) & 255) - 128;
            int i5 = (iZze >> 16) & 255;
            int i6 = (iZze & 255) - 128;
            arrayList.add(String.format("%06x", Integer.valueOf(Math.max(0, Math.min(((i6 * 17790) / ModuleDescriptor.MODULE_VERSION) + i5, 255)) | (Math.max(0, Math.min(((i4 * 14075) / ModuleDescriptor.MODULE_VERSION) + i5, 255)) << 16) | (Math.max(0, Math.min((i5 - ((i6 * 3455) / ModuleDescriptor.MODULE_VERSION)) - ((i4 * 7169) / ModuleDescriptor.MODULE_VERSION), 255)) << 8))));
        }
        String strZzd = zzggw.zzd(arrayList, ", ");
        StringBuilder sb = new StringBuilder(au.com.woolworths.shop.checkout.ui.confirmation.c.e(au.com.woolworths.shop.checkout.ui.confirmation.c.e(String.valueOf(i).length() + 7, 10, String.valueOf(i2)), 1, strZzd));
        sb.append("size: ");
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        return YU.a.p(sb, "\npalette: ", strZzd, "\n");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzh zzk(com.google.android.gms.internal.ads.zzef r15) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahy.zzk(com.google.android.gms.internal.ads.zzef):com.google.android.gms.internal.ads.zzh");
    }

    private static zzh zzl(zzef zzefVar) {
        zzg zzgVar = new zzg();
        byte[] bArrZzi = zzefVar.zzi();
        zzee zzeeVar = new zzee(bArrZzi, bArrZzi.length);
        zzeeVar.zzf(zzefVar.zzg() * 8);
        zzeeVar.zzo(1);
        int iZzj = zzeeVar.zzj(8);
        for (int i = 0; i < iZzj; i++) {
            zzeeVar.zzo(1);
            int iZzj2 = zzeeVar.zzj(8);
            for (int i2 = 0; i2 < iZzj2; i2++) {
                zzeeVar.zzh(6);
                boolean zZzi = zzeeVar.zzi();
                zzeeVar.zzg();
                zzeeVar.zzo(11);
                zzeeVar.zzh(4);
                int iZzj3 = zzeeVar.zzj(4) + 8;
                zzgVar.zze(iZzj3);
                zzgVar.zzf(iZzj3);
                zzeeVar.zzo(1);
                if (zZzi) {
                    int iZzj4 = zzeeVar.zzj(8);
                    int iZzj5 = zzeeVar.zzj(8);
                    zzeeVar.zzo(1);
                    boolean zZzi2 = zzeeVar.zzi();
                    zzgVar.zza(zzh.zzb(iZzj4));
                    zzgVar.zzb(true != zZzi2 ? 2 : 1);
                    zzgVar.zzc(zzh.zzc(iZzj5));
                }
            }
        }
        return zzgVar.zzg();
    }

    private static ByteBuffer zzm() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    @Nullable
    private static Pair zzn(zzet zzetVar) {
        zzeu zzeuVarZzc = zzetVar.zzc(1701606260);
        if (zzeuVarZzc == null) {
            return null;
        }
        zzef zzefVar = zzeuVarZzc.zza;
        zzefVar.zzh(8);
        int iZza = zza(zzefVar.zzB());
        int iZzH = zzefVar.zzH();
        long[] jArr = new long[iZzH];
        long[] jArr2 = new long[iZzH];
        for (int i = 0; i < iZzH; i++) {
            jArr[i] = iZza == 1 ? zzefVar.zzJ() : zzefVar.zzz();
            jArr2[i] = iZza == 1 ? zzefVar.zzD() : zzefVar.zzB();
            if (zzefVar.zzv() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            zzefVar.zzk(2);
        }
        return Pair.create(jArr, jArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zzo(com.google.android.gms.internal.ads.zzef r30, int r31, int r32, int r33, int r34, @androidx.annotation.Nullable java.lang.String r35, boolean r36, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzp r37, com.google.android.gms.internal.ads.zzahu r38, int r39) throws com.google.android.gms.internal.ads.zzas {
        /*
            Method dump skipped, instructions count: 1476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahy.zzo(com.google.android.gms.internal.ads.zzef, int, int, int, int, java.lang.String, boolean, com.google.android.gms.internal.ads.zzp, com.google.android.gms.internal.ads.zzahu, int):void");
    }

    private static zzahp zzp(zzef zzefVar, int i) {
        zzefVar.zzh(i + 12);
        zzefVar.zzk(1);
        zzs(zzefVar);
        zzefVar.zzk(2);
        int iZzs = zzefVar.zzs();
        if ((iZzs & 128) != 0) {
            zzefVar.zzk(2);
        }
        if ((iZzs & 64) != 0) {
            zzefVar.zzk(zzefVar.zzs());
        }
        if ((iZzs & 32) != 0) {
            zzefVar.zzk(2);
        }
        zzefVar.zzk(1);
        zzs(zzefVar);
        String strZzf = zzar.zzf(zzefVar.zzs());
        if ("audio/mpeg".equals(strZzf) || "audio/vnd.dts".equals(strZzf) || "audio/vnd.dts.hd".equals(strZzf)) {
            return new zzahp(strZzf, null, -1L, -1L);
        }
        zzefVar.zzk(4);
        long jZzz = zzefVar.zzz();
        long jZzz2 = zzefVar.zzz();
        zzefVar.zzk(1);
        int iZzs2 = zzs(zzefVar);
        long j = jZzz2;
        byte[] bArr = new byte[iZzs2];
        zzefVar.zzm(bArr, 0, iZzs2);
        if (j <= 0) {
            j = -1;
        }
        return new zzahp(strZzf, bArr, j, jZzz > 0 ? jZzz : -1L);
    }

    private static zzahn zzq(zzef zzefVar, int i) {
        zzefVar.zzh(i + 8);
        zzefVar.zzk(4);
        return new zzahn(zzefVar.zzz(), zzefVar.zzz());
    }

    @Nullable
    private static Pair zzr(zzef zzefVar, int i, int i2) throws zzas {
        Integer num;
        zzait zzaitVar;
        Pair pairCreate;
        int i3;
        int i4;
        Integer num2;
        boolean z;
        int iZzg = zzefVar.zzg();
        while (iZzg - i < i2) {
            zzefVar.zzh(iZzg);
            int iZzB = zzefVar.zzB();
            zzacy.zza(iZzB > 0, "childAtomSize must be positive");
            if (zzefVar.zzB() == 1936289382) {
                int i5 = iZzg + 8;
                int i6 = 0;
                int i7 = -1;
                Integer numValueOf = null;
                String strZzK = null;
                while (i5 - iZzg < iZzB) {
                    zzefVar.zzh(i5);
                    int iZzB2 = zzefVar.zzB();
                    int iZzB3 = zzefVar.zzB();
                    if (iZzB3 == 1718775137) {
                        numValueOf = Integer.valueOf(zzefVar.zzB());
                    } else if (iZzB3 == 1935894637) {
                        zzefVar.zzk(4);
                        strZzK = zzefVar.zzK(4, StandardCharsets.UTF_8);
                    } else if (iZzB3 == 1935894633) {
                        i7 = i5;
                        i6 = iZzB2;
                    }
                    i5 += iZzB2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strZzK) || "cbc1".equals(strZzK) || "cens".equals(strZzK) || "cbcs".equals(strZzK)) {
                    zzacy.zza(numValueOf != null, "frma atom is mandatory");
                    zzacy.zza(i7 != -1, "schi atom is mandatory");
                    int i8 = i7 + 8;
                    while (true) {
                        if (i8 - i7 >= i6) {
                            num = numValueOf;
                            zzaitVar = null;
                            break;
                        }
                        zzefVar.zzh(i8);
                        int iZzB4 = zzefVar.zzB();
                        if (zzefVar.zzB() == 1952804451) {
                            int iZza = zza(zzefVar.zzB());
                            zzefVar.zzk(1);
                            if (iZza == 0) {
                                zzefVar.zzk(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int iZzs = zzefVar.zzs();
                                i3 = iZzs & 15;
                                i4 = (iZzs & 240) >> 4;
                            }
                            if (zzefVar.zzs() == 1) {
                                num2 = numValueOf;
                                z = true;
                            } else {
                                num2 = numValueOf;
                                z = false;
                            }
                            int iZzs2 = zzefVar.zzs();
                            byte[] bArr2 = new byte[16];
                            zzefVar.zzm(bArr2, 0, 16);
                            if (z && iZzs2 == 0) {
                                int iZzs3 = zzefVar.zzs();
                                byte[] bArr3 = new byte[iZzs3];
                                zzefVar.zzm(bArr3, 0, iZzs3);
                                bArr = bArr3;
                            }
                            num = num2;
                            zzaitVar = new zzait(z, strZzK, iZzs2, bArr2, i4, i3, bArr);
                        } else {
                            i8 += iZzB4;
                        }
                    }
                    zzacy.zza(zzaitVar != null, "tenc atom is mandatory");
                    String str = zzeo.zza;
                    pairCreate = Pair.create(num, zzaitVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            iZzg += iZzB;
        }
        return null;
    }

    private static int zzs(zzef zzefVar) {
        int iZzs = zzefVar.zzs();
        int i = iZzs & 127;
        while ((iZzs & 128) == 128) {
            iZzs = zzefVar.zzs();
            i = (i << 7) | (iZzs & 127);
        }
        return i;
    }
}
