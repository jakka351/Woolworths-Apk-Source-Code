package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class zzaci implements zzadv {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    public zzaci(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzb = iArr;
        this.zzc = jArr;
        this.zzd = jArr2;
        this.zze = jArr3;
        int length = iArr.length;
        this.zza = length;
        if (length <= 0) {
            this.zzf = 0L;
        } else {
            int i = length - 1;
            this.zzf = jArr2[i] + jArr3[i];
        }
    }

    public final String toString() {
        long[] jArr = this.zzd;
        long[] jArr2 = this.zze;
        long[] jArr3 = this.zzc;
        String string = Arrays.toString(this.zzb);
        String string2 = Arrays.toString(jArr3);
        String string3 = Arrays.toString(jArr2);
        String string4 = Arrays.toString(jArr);
        int i = this.zza;
        int length = String.valueOf(i).length();
        int length2 = String.valueOf(string).length();
        int length3 = String.valueOf(string2).length();
        StringBuilder sb = new StringBuilder(length + 26 + length2 + 10 + length3 + 9 + String.valueOf(string3).length() + 14 + String.valueOf(string4).length() + 1);
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.t(i, "ChunkIndex(length=", ", sizes=", string, sb);
        androidx.constraintlayout.core.state.a.B(sb, ", offsets=", string2, ", timeUs=", string3);
        return YU.a.p(sb, ", durationsUs=", string4, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final long zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final zzadt zzc(long j) {
        long[] jArr = this.zze;
        int iZzm = zzeo.zzm(jArr, j, true, true);
        long j2 = jArr[iZzm];
        long[] jArr2 = this.zzc;
        zzadw zzadwVar = new zzadw(j2, jArr2[iZzm]);
        if (zzadwVar.zzb >= j || iZzm == this.zza - 1) {
            return new zzadt(zzadwVar, zzadwVar);
        }
        int i = iZzm + 1;
        return new zzadt(zzadwVar, new zzadw(jArr[i], jArr2[i]));
    }
}
