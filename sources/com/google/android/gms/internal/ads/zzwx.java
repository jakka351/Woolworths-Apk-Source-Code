package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes5.dex */
public final class zzwx extends zzwz {
    public zzwx(zzbf zzbfVar, int[] iArr, int i, zzyu zzyuVar, long j, long j2, long j3, int i2, int i3, float f, float f2, List list, zzdb zzdbVar) {
        super(zzbfVar, iArr, 0);
        zzgjz.zzq(list);
    }

    public static /* synthetic */ zzgjz zzd(zzye[] zzyeVarArr) {
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = 1;
            if (i3 >= 2) {
                break;
            }
            zzye zzyeVar = zzyeVarArr[i3];
            if (zzyeVar == null || zzyeVar.zzb.length <= 1) {
                arrayList.add(null);
            } else {
                int i4 = zzgjz.zzd;
                zzgjw zzgjwVar = new zzgjw();
                zzgjwVar.zzf(new zzwv(0L, 0L));
                arrayList.add(zzgjwVar);
            }
            i3++;
        }
        long[][] jArr = new long[2][];
        for (int i5 = 0; i5 < 2; i5++) {
            zzye zzyeVar2 = zzyeVarArr[i5];
            if (zzyeVar2 == null) {
                jArr[i5] = new long[0];
            } else {
                int[] iArr = zzyeVar2.zzb;
                jArr[i5] = new long[iArr.length];
                for (int i6 = 0; i6 < iArr.length; i6++) {
                    long j = zzyeVar2.zza.zza(iArr[i6]).zzj;
                    long[] jArr2 = jArr[i5];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i6] = j;
                }
                Arrays.sort(jArr[i5]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr3 = new long[2];
        for (int i7 = 0; i7 < 2; i7++) {
            long[] jArr4 = jArr[i7];
            jArr3[i7] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        zzi(arrayList, jArr3);
        zzgkk zzgkkVarZza = zzgle.zzc(zzglj.zzb()).zzb(2).zza();
        int i8 = 0;
        while (i8 < 2) {
            int length = jArr[i8].length;
            if (length > i) {
                double[] dArr = new double[length];
                int i9 = i2;
                while (true) {
                    long[] jArr5 = jArr[i8];
                    double dLog = 0.0d;
                    if (i9 >= jArr5.length) {
                        break;
                    }
                    long j2 = jArr5[i9];
                    if (j2 != -1) {
                        dLog = Math.log(j2);
                    }
                    dArr[i9] = dLog;
                    i9++;
                }
                int i10 = length - 1;
                double d = dArr[i10] - dArr[i2];
                int i11 = i2;
                while (i11 < i10) {
                    double d2 = dArr[i11];
                    i11++;
                    zzgkkVarZza.zze(Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i11]) * 0.5d) - dArr[i2]) / d), Integer.valueOf(i8));
                    i = i;
                    i2 = 0;
                }
            }
            i8++;
            i = i;
            i2 = 0;
        }
        zzgjz zzgjzVarZzq = zzgjz.zzq(zzgkkVarZza.zzs());
        for (int i12 = 0; i12 < zzgjzVarZzq.size(); i12++) {
            int iIntValue = ((Integer) zzgjzVarZzq.get(i12)).intValue();
            int i13 = iArr2[iIntValue] + 1;
            iArr2[iIntValue] = i13;
            jArr3[iIntValue] = jArr[iIntValue][i13];
            zzi(arrayList, jArr3);
        }
        for (int i14 = 0; i14 < 2; i14++) {
            if (arrayList.get(i14) != null) {
                long j3 = jArr3[i14];
                jArr3[i14] = j3 + j3;
            }
        }
        zzi(arrayList, jArr3);
        zzgjw zzgjwVar2 = new zzgjw();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            zzgjw zzgjwVar3 = (zzgjw) arrayList.get(i15);
            zzgjwVar2.zzf(zzgjwVar3 == null ? zzgjz.zzi() : zzgjwVar3.zzi());
        }
        return zzgjwVar2.zzi();
    }

    private static void zzi(List list, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgjw zzgjwVar = (zzgjw) list.get(i2);
            if (zzgjwVar != null) {
                zzgjwVar.zzf(new zzwv(j, jArr[i2]));
            }
        }
    }
}
