package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class zzdt {
    private int zza;
    private long[] zzb;

    public zzdt() {
        throw null;
    }

    public final void zza(long j) {
        int i = this.zza;
        long[] jArr = this.zzb;
        if (i == jArr.length) {
            this.zzb = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = this.zzb;
        int i2 = this.zza;
        this.zza = i2 + 1;
        jArr2[i2] = j;
    }

    public final void zzb(long[] jArr) {
        int i = this.zza;
        int length = jArr.length;
        int i2 = i + length;
        long[] jArr2 = this.zzb;
        int length2 = jArr2.length;
        if (i2 > length2) {
            this.zzb = Arrays.copyOf(jArr2, Math.max(length2 + length2, i2));
        }
        System.arraycopy(jArr, 0, this.zzb, this.zza, length);
        this.zza = i2;
    }

    public final long zzc(int i) {
        if (i >= 0 && i < this.zza) {
            return this.zzb[i];
        }
        int i2 = this.zza;
        throw new IndexOutOfBoundsException(au.com.woolworths.shop.checkout.ui.confirmation.c.l(i, i2, "Invalid index ", ", size is ", new StringBuilder(String.valueOf(i).length() + 24 + String.valueOf(i2).length())));
    }

    public final int zzd() {
        return this.zza;
    }

    public zzdt(int i) {
        this.zzb = new long[i];
    }
}
