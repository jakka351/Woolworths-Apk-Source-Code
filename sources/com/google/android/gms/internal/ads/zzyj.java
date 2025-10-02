package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class zzyj extends zzym {
    public abstract Pair zzh(zzyi zzyiVar, int[][][] iArr, int[] iArr2, zzup zzupVar, zzbe zzbeVar) throws zzhz;

    @Override // com.google.android.gms.internal.ads.zzym
    public final void zzp(@Nullable Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzym
    public final zzyn zzq(zzln[] zzlnVarArr, zzwq zzwqVar, zzup zzupVar, zzbe zzbeVar) throws zzhz {
        List[] listArr;
        boolean z;
        int[] iArr;
        int[] iArr2 = new int[3];
        zzbf[][] zzbfVarArr = new zzbf[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = zzwqVar.zzb;
            zzbfVarArr[i] = new zzbf[i2];
            iArr3[i] = new int[i2][];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            iArr4[i4] = zzlnVarArr[i4].zzu();
        }
        int i5 = 0;
        while (i5 < zzwqVar.zzb) {
            zzbf zzbfVarZza = zzwqVar.zza(i5);
            int i6 = zzbfVarZza.zzc;
            int i7 = i3;
            int i8 = 0;
            int i9 = 0;
            boolean z2 = true;
            while (i8 < i3) {
                zzln zzlnVar = zzlnVarArr[i8];
                int iMax = 0;
                for (int i10 = 0; i10 < zzbfVarZza.zza; i10++) {
                    iMax = Math.max(iMax, zzlnVar.zzaa(zzbfVarZza.zza(i10)) & 7);
                }
                boolean z3 = iArr2[i8] == 0;
                if (iMax > i9) {
                    z2 = z3;
                    i7 = i8;
                    i9 = iMax;
                } else if (iMax == i9 && i6 == 5 && !z2 && z3) {
                    i7 = i8;
                    i9 = iMax;
                    z2 = true;
                }
                i8++;
                i3 = 2;
            }
            if (i7 == i3) {
                iArr = new int[zzbfVarZza.zza];
            } else {
                zzln zzlnVar2 = zzlnVarArr[i7];
                int i11 = zzbfVarZza.zza;
                int[] iArr5 = new int[i11];
                for (int i12 = 0; i12 < i11; i12++) {
                    iArr5[i12] = zzlnVar2.zzaa(zzbfVarZza.zza(i12));
                }
                iArr = iArr5;
            }
            int i13 = iArr2[i7];
            zzbfVarArr[i7][i13] = zzbfVarZza;
            iArr3[i7][i13] = iArr;
            iArr2[i7] = i13 + 1;
            i5++;
            i3 = 2;
        }
        zzwq[] zzwqVarArr = new zzwq[i3];
        String[] strArr = new String[i3];
        int[] iArr6 = new int[i3];
        int i14 = 0;
        while (i14 < i3) {
            int i15 = iArr2[i14];
            zzwqVarArr[i14] = new zzwq((zzbf[]) zzeo.zzb(zzbfVarArr[i14], i15));
            iArr3[i14] = (int[][]) zzeo.zzb(iArr3[i14], i15);
            strArr[i14] = zzlnVarArr[i14].zzS();
            iArr6[i14] = zzlnVarArr[i14].zza();
            i14++;
            i3 = 2;
        }
        int i16 = i3;
        zzyi zzyiVar = new zzyi(strArr, iArr6, zzwqVarArr, iArr4, iArr3, new zzwq((zzbf[]) zzeo.zzb(zzbfVarArr[i16], iArr2[i16])));
        Pair pairZzh = zzh(zzyiVar, iArr3, iArr4, zzupVar, zzbeVar);
        zzyk[] zzykVarArr = (zzyk[]) pairZzh.second;
        List[] listArr2 = new List[zzykVarArr.length];
        for (int i17 = 0; i17 < zzykVarArr.length; i17++) {
            zzyk zzykVar = zzykVarArr[i17];
            listArr2[i17] = zzykVar != null ? zzgjz.zzj(zzykVar) : zzgjz.zzi();
        }
        zzgjw zzgjwVar = new zzgjw();
        for (int i18 = 0; i18 < 2; i18++) {
            zzwq zzwqVarZzb = zzyiVar.zzb(i18);
            List list = listArr2[i18];
            int i19 = 0;
            while (i19 < zzwqVarZzb.zzb) {
                zzbf zzbfVarZza2 = zzwqVarZzb.zza(i19);
                boolean z4 = zzyiVar.zzd(i18, i19, false) != 0;
                int i20 = zzbfVarZza2.zza;
                int[] iArr7 = new int[i20];
                boolean[] zArr = new boolean[i20];
                int i21 = 0;
                while (i21 < i20) {
                    iArr7[i21] = zzyiVar.zzc(i18, i19, i21) & 7;
                    int i22 = 0;
                    while (true) {
                        if (i22 >= list.size()) {
                            listArr = listArr2;
                            z = false;
                            break;
                        }
                        zzyk zzykVar2 = (zzyk) list.get(i22);
                        listArr = listArr2;
                        if (zzykVar2.zza().equals(zzbfVarZza2) && zzykVar2.zzg(i21) != -1) {
                            z = true;
                            break;
                        }
                        i22++;
                        listArr2 = listArr;
                    }
                    zArr[i21] = z;
                    i21++;
                    listArr2 = listArr;
                }
                zzgjwVar.zzf(new zzbl(zzbfVarZza2, z4, iArr7, zArr));
                i19++;
                listArr2 = listArr2;
            }
        }
        zzwq zzwqVarZze = zzyiVar.zze();
        for (int i23 = 0; i23 < zzwqVarZze.zzb; i23++) {
            zzbf zzbfVarZza3 = zzwqVarZze.zza(i23);
            int i24 = zzbfVarZza3.zza;
            int[] iArr8 = new int[i24];
            Arrays.fill(iArr8, 0);
            zzgjwVar.zzf(new zzbl(zzbfVarZza3, false, iArr8, new boolean[i24]));
        }
        return new zzyn((zzlo[]) pairZzh.first, (zzyf[]) pairZzh.second, new zzbm(zzgjwVar.zzi()), zzyiVar);
    }
}
