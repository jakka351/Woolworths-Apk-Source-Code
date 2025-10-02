package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes5.dex */
final class zzch {
    private final int zza;
    private final int zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final short[] zzi;
    private short[] zzj;
    private int zzk;
    private short[] zzl;
    private int zzm;
    private short[] zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private int zzv;
    private double zzw;

    public zzch(int i, int i2, float f, float f2, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = f;
        this.zzd = f2;
        this.zze = i / i3;
        this.zzf = i / 400;
        int i4 = i / 65;
        this.zzg = i4;
        int i5 = i4 + i4;
        this.zzh = i5;
        this.zzi = new short[i5];
        int i6 = i5 * i2;
        this.zzj = new short[i6];
        this.zzl = new short[i6];
        this.zzn = new short[i6];
    }

    private final short[] zzg(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.zzb;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    private final void zzh(short[] sArr, int i, int i2) {
        short[] sArrZzg = zzg(this.zzl, this.zzm, i2);
        this.zzl = sArrZzg;
        int i3 = this.zzm;
        int i4 = this.zzb;
        System.arraycopy(sArr, i * i4, sArrZzg, i3 * i4, i2 * i4);
        this.zzm += i2;
    }

    private final void zzi(short[] sArr, int i, int i2) {
        int i3;
        for (int i4 = 0; i4 < this.zzh / i2; i4++) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int i7 = this.zzb;
                i3 = i7 * i2;
                if (i5 < i3) {
                    i6 += sArr[YU.a.C(i4, i3, i7 * i, i5)];
                    i5++;
                }
            }
            this.zzi[i4] = (short) (i6 / i3);
        }
    }

    private final int zzj(short[] sArr, int i, int i2, int i3) {
        int i4 = 1;
        int i5 = 255;
        int i6 = 0;
        int i7 = 0;
        while (i2 <= i3) {
            int iAbs = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                int i9 = this.zzb * i;
                iAbs += Math.abs(sArr[i9 + i8] - sArr[(i9 + i2) + i8]);
            }
            int i10 = iAbs * i6;
            int i11 = i4 * i2;
            if (i10 < i11) {
                i4 = iAbs;
            }
            if (i10 < i11) {
                i6 = i2;
            }
            int i12 = iAbs * i5;
            int i13 = i7 * i2;
            if (i12 > i13) {
                i7 = iAbs;
            }
            if (i12 > i13) {
                i5 = i2;
            }
            i2++;
        }
        this.zzu = i4 / i6;
        this.zzv = i7 / i5;
        return i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzk() {
        /*
            Method dump skipped, instructions count: 676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzch.zzk():void");
    }

    private static void zzl(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i4 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i3 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i9] = (short) (((sArr3[i8] * i10) + ((i - i10) * sArr2[i7])) / i);
                i9 += i2;
                i7 += i2;
                i8 += i2;
            }
        }
    }

    public final int zza() {
        int i = this.zzk * this.zzb;
        return i + i;
    }

    public final void zzb(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i = this.zzb;
        int i2 = iRemaining / i;
        int i3 = i2 * i;
        short[] sArrZzg = zzg(this.zzj, this.zzk, i2);
        this.zzj = sArrZzg;
        shortBuffer.get(sArrZzg, this.zzk * i, (i3 + i3) / 2);
        this.zzk += i2;
        zzk();
    }

    public final void zzc(ShortBuffer shortBuffer) {
        zzghc.zzh(this.zzm >= 0);
        int iRemaining = shortBuffer.remaining();
        int i = this.zzb;
        int iMin = Math.min(iRemaining / i, this.zzm);
        int i2 = iMin * i;
        shortBuffer.put(this.zzl, 0, i2);
        int i3 = this.zzm - iMin;
        this.zzm = i3;
        short[] sArr = this.zzl;
        System.arraycopy(sArr, i2, sArr, 0, i3 * i);
    }

    public final void zzd() {
        int i = this.zzk;
        int i2 = this.zzr;
        int i3 = this.zzm;
        float f = this.zzc;
        float f2 = this.zzd;
        int i4 = i3 + ((int) (((((((i - i2) / (f / f2)) + i2) + this.zzw) + this.zzo) / (this.zze * f2)) + 0.5d));
        this.zzw = 0.0d;
        int i5 = this.zzh;
        int i6 = i5 + i5;
        this.zzj = zzg(this.zzj, i, i + i6);
        int i7 = 0;
        while (true) {
            int i8 = this.zzb;
            if (i7 >= i6 * i8) {
                break;
            }
            this.zzj[(i8 * i) + i7] = 0;
            i7++;
        }
        this.zzk += i6;
        zzk();
        if (this.zzm > i4) {
            this.zzm = Math.max(i4, 0);
        }
        this.zzk = 0;
        this.zzr = 0;
        this.zzo = 0;
    }

    public final void zze() {
        this.zzk = 0;
        this.zzm = 0;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = 0;
        this.zzv = 0;
        this.zzw = 0.0d;
    }

    public final int zzf() {
        zzghc.zzh(this.zzm >= 0);
        int i = this.zzm * this.zzb;
        return i + i;
    }
}
