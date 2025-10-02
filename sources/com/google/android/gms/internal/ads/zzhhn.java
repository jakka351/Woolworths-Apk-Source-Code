package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
final class zzhhn implements zzhlk {
    private final zzhhm zza;

    private zzhhn(zzhhm zzhhmVar) {
        zzhiu.zza(zzhhmVar, "output");
        this.zza = zzhhmVar;
        zzhhmVar.zze = this;
    }

    public static zzhhn zza(zzhhm zzhhmVar) {
        Object obj = zzhhmVar.zze;
        return obj != null ? (zzhhn) obj : new zzhhn(zzhhmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzA(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhjg)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            zzhhmVar.zzs(i3);
            while (i2 < list.size()) {
                zzhhmVar.zzv(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzhjg zzhjgVar = (zzhjg) list;
        if (!z) {
            while (i2 < zzhjgVar.size()) {
                this.zza.zzh(i, zzhjgVar.zzc(i2));
                i2++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzhjgVar.size(); i6++) {
            zzhjgVar.zzc(i6);
            i5 += 8;
        }
        zzhhmVar2.zzs(i5);
        while (i2 < zzhjgVar.size()) {
            zzhhmVar2.zzv(zzhjgVar.zzc(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzB(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhhy)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzM(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                i3 += 4;
            }
            zzhhmVar.zzs(i3);
            while (i2 < list.size()) {
                zzhhmVar.zzt(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        zzhhy zzhhyVar = (zzhhy) list;
        if (!z) {
            while (i2 < zzhhyVar.size()) {
                this.zza.zzM(i, Float.floatToRawIntBits(zzhhyVar.zzf(i2)));
                i2++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzhhyVar.size(); i6++) {
            zzhhyVar.zzf(i6);
            i5 += 4;
        }
        zzhhmVar2.zzs(i5);
        while (i2 < zzhhyVar.size()) {
            zzhhmVar2.zzt(Float.floatToRawIntBits(zzhhyVar.zzf(i2)));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzC(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhho)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).getClass();
                i3 += 8;
            }
            zzhhmVar.zzs(i3);
            while (i2 < list.size()) {
                zzhhmVar.zzv(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        zzhho zzhhoVar = (zzhho) list;
        if (!z) {
            while (i2 < zzhhoVar.size()) {
                this.zza.zzh(i, Double.doubleToRawLongBits(zzhhoVar.zzf(i2)));
                i2++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzhhoVar.size(); i6++) {
            zzhhoVar.zzf(i6);
            i5 += 8;
        }
        zzhhmVar2.zzs(i5);
        while (i2 < zzhhoVar.size()) {
            zzhhmVar2.zzv(Double.doubleToRawLongBits(zzhhoVar.zzf(i2)));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzD(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhii)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzK(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i, 2);
            int iZzB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzB += zzhhm.zzB(((Integer) list.get(i3)).intValue());
            }
            zzhhmVar.zzs(iZzB);
            while (i2 < list.size()) {
                zzhhmVar.zzr(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzhii zzhiiVar = (zzhii) list;
        if (!z) {
            while (i2 < zzhiiVar.size()) {
                this.zza.zzK(i, zzhiiVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i, 2);
        int iZzB2 = 0;
        for (int i4 = 0; i4 < zzhiiVar.size(); i4++) {
            iZzB2 += zzhhm.zzB(zzhiiVar.zzf(i4));
        }
        zzhhmVar2.zzs(iZzB2);
        while (i2 < zzhiiVar.size()) {
            zzhhmVar2.zzr(zzhiiVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzE(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhgr)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzi(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).getClass();
                i3++;
            }
            zzhhmVar.zzs(i3);
            while (i2 < list.size()) {
                zzhhmVar.zzq(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        zzhgr zzhgrVar = (zzhgr) list;
        if (!z) {
            while (i2 < zzhgrVar.size()) {
                this.zza.zzi(i, zzhgrVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzhgrVar.size(); i6++) {
            zzhgrVar.zzf(i6);
            i5++;
        }
        zzhhmVar2.zzs(i5);
        while (i2 < zzhgrVar.size()) {
            zzhhmVar2.zzq(zzhgrVar.zzf(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzF(int i, List list) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhjd)) {
            while (i2 < list.size()) {
                this.zza.zzj(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        zzhjd zzhjdVar = (zzhjd) list;
        while (i2 < list.size()) {
            Object objZzc = zzhjdVar.zzc();
            if (objZzc instanceof String) {
                this.zza.zzj(i, (String) objZzc);
            } else {
                this.zza.zzk(i, (zzhhb) objZzc);
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzG(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zzk(i, (zzhhb) list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzH(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhii)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzL(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i, 2);
            int iZzA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzA += zzhhm.zzA(((Integer) list.get(i3)).intValue());
            }
            zzhhmVar.zzs(iZzA);
            while (i2 < list.size()) {
                zzhhmVar.zzs(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzhii zzhiiVar = (zzhii) list;
        if (!z) {
            while (i2 < zzhiiVar.size()) {
                this.zza.zzL(i, zzhiiVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i, 2);
        int iZzA2 = 0;
        for (int i4 = 0; i4 < zzhiiVar.size(); i4++) {
            iZzA2 += zzhhm.zzA(zzhiiVar.zzf(i4));
        }
        zzhhmVar2.zzs(iZzA2);
        while (i2 < zzhiiVar.size()) {
            zzhhmVar2.zzs(zzhiiVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzI(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhii)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzM(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            zzhhmVar.zzs(i3);
            while (i2 < list.size()) {
                zzhhmVar.zzt(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzhii zzhiiVar = (zzhii) list;
        if (!z) {
            while (i2 < zzhiiVar.size()) {
                this.zza.zzM(i, zzhiiVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzhiiVar.size(); i6++) {
            zzhiiVar.zzf(i6);
            i5 += 4;
        }
        zzhhmVar2.zzs(i5);
        while (i2 < zzhiiVar.size()) {
            zzhhmVar2.zzt(zzhiiVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzJ(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhjg)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            zzhhmVar.zzs(i3);
            while (i2 < list.size()) {
                zzhhmVar.zzv(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzhjg zzhjgVar = (zzhjg) list;
        if (!z) {
            while (i2 < zzhjgVar.size()) {
                this.zza.zzh(i, zzhjgVar.zzc(i2));
                i2++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzhjgVar.size(); i6++) {
            zzhjgVar.zzc(i6);
            i5 += 8;
        }
        zzhhmVar2.zzs(i5);
        while (i2 < zzhjgVar.size()) {
            zzhhmVar2.zzv(zzhjgVar.zzc(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzK(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhii)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzhhm zzhhmVar = this.zza;
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    zzhhmVar.zzL(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            zzhhm zzhhmVar2 = this.zza;
            zzhhmVar2.zzJ(i, 2);
            int iZzA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iZzA += zzhhm.zzA((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            zzhhmVar2.zzs(iZzA);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                zzhhmVar2.zzs((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        zzhii zzhiiVar = (zzhii) list;
        if (!z) {
            while (i2 < zzhiiVar.size()) {
                zzhhm zzhhmVar3 = this.zza;
                int iZzf = zzhiiVar.zzf(i2);
                zzhhmVar3.zzL(i, (iZzf >> 31) ^ (iZzf + iZzf));
                i2++;
            }
            return;
        }
        zzhhm zzhhmVar4 = this.zza;
        zzhhmVar4.zzJ(i, 2);
        int iZzA2 = 0;
        for (int i4 = 0; i4 < zzhiiVar.size(); i4++) {
            int iZzf2 = zzhiiVar.zzf(i4);
            iZzA2 += zzhhm.zzA((iZzf2 >> 31) ^ (iZzf2 + iZzf2));
        }
        zzhhmVar4.zzs(iZzA2);
        while (i2 < zzhiiVar.size()) {
            int iZzf3 = zzhiiVar.zzf(i2);
            zzhhmVar4.zzs((iZzf3 >> 31) ^ (iZzf3 + iZzf3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzL(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhjg)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzhhm zzhhmVar = this.zza;
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    zzhhmVar.zzN(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i2++;
                }
                return;
            }
            zzhhm zzhhmVar2 = this.zza;
            zzhhmVar2.zzJ(i, 2);
            int iZzB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iZzB += zzhhm.zzB((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            zzhhmVar2.zzs(iZzB);
            while (i2 < list.size()) {
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                zzhhmVar2.zzu((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i2++;
            }
            return;
        }
        zzhjg zzhjgVar = (zzhjg) list;
        if (!z) {
            while (i2 < zzhjgVar.size()) {
                zzhhm zzhhmVar3 = this.zza;
                long jZzc = zzhjgVar.zzc(i2);
                zzhhmVar3.zzN(i, (jZzc >> 63) ^ (jZzc + jZzc));
                i2++;
            }
            return;
        }
        zzhhm zzhhmVar4 = this.zza;
        zzhhmVar4.zzJ(i, 2);
        int iZzB2 = 0;
        for (int i4 = 0; i4 < zzhjgVar.size(); i4++) {
            long jZzc2 = zzhjgVar.zzc(i4);
            iZzB2 += zzhhm.zzB((jZzc2 >> 63) ^ (jZzc2 + jZzc2));
        }
        zzhhmVar4.zzs(iZzB2);
        while (i2 < zzhjgVar.size()) {
            long jZzc3 = zzhjgVar.zzc(i2);
            zzhhmVar4.zzu((jZzc3 >> 63) ^ (jZzc3 + jZzc3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzM(int i, zzhjk zzhjkVar, Map map) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i, 2);
            zzhhmVar.zzs(zzhjl.zzc(zzhjkVar, entry.getKey(), entry.getValue()));
            zzhjl.zzb(zzhhmVar, zzhjkVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzb(int i, int i2) throws IOException {
        this.zza.zzM(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzc(int i, long j) throws IOException {
        this.zza.zzN(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzd(int i, long j) throws IOException {
        this.zza.zzh(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zze(int i, float f) throws IOException {
        this.zza.zzM(i, Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzf(int i, double d) throws IOException {
        this.zza.zzh(i, Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzg(int i, int i2) throws IOException {
        this.zza.zzK(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzh(int i, long j) throws IOException {
        this.zza.zzN(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzi(int i, int i2) throws IOException {
        this.zza.zzK(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzj(int i, long j) throws IOException {
        this.zza.zzh(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzk(int i, int i2) throws IOException {
        this.zza.zzM(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzl(int i, boolean z) throws IOException {
        this.zza.zzi(i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzm(int i, String str) throws IOException {
        this.zza.zzj(i, str);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzn(int i, zzhhb zzhhbVar) throws IOException {
        this.zza.zzk(i, zzhhbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzo(int i, int i2) throws IOException {
        this.zza.zzL(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzp(int i, int i2) throws IOException {
        this.zza.zzL(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzq(int i, long j) throws IOException {
        this.zza.zzN(i, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzr(int i, Object obj, zzhkk zzhkkVar) throws IOException {
        zzhhm zzhhmVar = this.zza;
        zzhgk zzhgkVar = (zzhgk) obj;
        zzhhmVar.zzJ(i, 2);
        zzhhmVar.zzs(zzhgkVar.zzaT(zzhkkVar));
        zzhkkVar.zzf(zzhgkVar, this);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzs(int i, Object obj, zzhkk zzhkkVar) throws IOException {
        zzhhm zzhhmVar = this.zza;
        zzhhmVar.zzJ(i, 3);
        zzhkkVar.zzf((zzhgk) obj, this);
        zzhhmVar.zzJ(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    @Deprecated
    public final void zzt(int i) throws IOException {
        this.zza.zzJ(i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    @Deprecated
    public final void zzu(int i) throws IOException {
        this.zza.zzJ(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzv(int i, Object obj) throws IOException {
        if (obj instanceof zzhhb) {
            this.zza.zzo(i, (zzhhb) obj);
        } else {
            this.zza.zzn(i, (zzhjs) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzw(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhii)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzK(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i, 2);
            int iZzB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzB += zzhhm.zzB(((Integer) list.get(i3)).intValue());
            }
            zzhhmVar.zzs(iZzB);
            while (i2 < list.size()) {
                zzhhmVar.zzr(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzhii zzhiiVar = (zzhii) list;
        if (!z) {
            while (i2 < zzhiiVar.size()) {
                this.zza.zzK(i, zzhiiVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i, 2);
        int iZzB2 = 0;
        for (int i4 = 0; i4 < zzhiiVar.size(); i4++) {
            iZzB2 += zzhhm.zzB(zzhiiVar.zzf(i4));
        }
        zzhhmVar2.zzs(iZzB2);
        while (i2 < zzhiiVar.size()) {
            zzhhmVar2.zzr(zzhiiVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzx(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhii)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzM(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            zzhhmVar.zzs(i3);
            while (i2 < list.size()) {
                zzhhmVar.zzt(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzhii zzhiiVar = (zzhii) list;
        if (!z) {
            while (i2 < zzhiiVar.size()) {
                this.zza.zzM(i, zzhiiVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzhiiVar.size(); i6++) {
            zzhiiVar.zzf(i6);
            i5 += 4;
        }
        zzhhmVar2.zzs(i5);
        while (i2 < zzhiiVar.size()) {
            zzhhmVar2.zzt(zzhiiVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzy(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhjg)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzN(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i, 2);
            int iZzB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzB += zzhhm.zzB(((Long) list.get(i3)).longValue());
            }
            zzhhmVar.zzs(iZzB);
            while (i2 < list.size()) {
                zzhhmVar.zzu(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzhjg zzhjgVar = (zzhjg) list;
        if (!z) {
            while (i2 < zzhjgVar.size()) {
                this.zza.zzN(i, zzhjgVar.zzc(i2));
                i2++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i, 2);
        int iZzB2 = 0;
        for (int i4 = 0; i4 < zzhjgVar.size(); i4++) {
            iZzB2 += zzhhm.zzB(zzhjgVar.zzc(i4));
        }
        zzhhmVar2.zzs(iZzB2);
        while (i2 < zzhjgVar.size()) {
            zzhhmVar2.zzu(zzhjgVar.zzc(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzz(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhjg)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzN(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i, 2);
            int iZzB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzB += zzhhm.zzB(((Long) list.get(i3)).longValue());
            }
            zzhhmVar.zzs(iZzB);
            while (i2 < list.size()) {
                zzhhmVar.zzu(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzhjg zzhjgVar = (zzhjg) list;
        if (!z) {
            while (i2 < zzhjgVar.size()) {
                this.zza.zzN(i, zzhjgVar.zzc(i2));
                i2++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i, 2);
        int iZzB2 = 0;
        for (int i4 = 0; i4 < zzhjgVar.size(); i4++) {
            iZzB2 += zzhhm.zzB(zzhjgVar.zzc(i4));
        }
        zzhhmVar2.zzs(iZzB2);
        while (i2 < zzhjgVar.size()) {
            zzhhmVar2.zzu(zzhjgVar.zzc(i2));
            i2++;
        }
    }
}
