package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.CheckResult;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class zza {
    public final long zza;
    public final int zzb;

    @Deprecated
    public final Uri[] zzc;
    public final zzaj[] zzd;
    public final int[] zze;
    public final long[] zzf;
    public final String[] zzg;
    public final long zzh;
    public final boolean zzi;

    static {
        String str = zzeo.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
    }

    public zza(long j) {
        this(0L, -1, -1, new int[0], new zzaj[0], new long[0], 0L, false, new String[0], false);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zza.class == obj.getClass()) {
            zza zzaVar = (zza) obj;
            if (this.zzb == zzaVar.zzb && Arrays.equals(this.zzd, zzaVar.zzd) && Arrays.equals(this.zze, zzaVar.zze) && Arrays.equals(this.zzf, zzaVar.zzf) && Arrays.equals(this.zzg, zzaVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((Arrays.hashCode(this.zzf) + ((Arrays.hashCode(this.zze) + ((Arrays.hashCode(this.zzd) + (((this.zzb * 31) - 1) * 961)) * 31)) * 31)) * 29791) + Arrays.hashCode(this.zzg)) * 31;
    }

    public final int zza(@IntRange int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.zze;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    @CheckResult
    public final zza zzb(int i) {
        int[] iArr = this.zze;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = this.zzf;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        return new zza(0L, 0, -1, iArrCopyOf, (zzaj[]) Arrays.copyOf(this.zzd, 0), jArrCopyOf, 0L, false, (String[]) Arrays.copyOf(this.zzg, 0), false);
    }

    private zza(long j, int i, int i2, int[] iArr, zzaj[] zzajVarArr, long[] jArr, long j2, boolean z, String[] strArr, boolean z2) {
        Uri uri;
        int length = iArr.length;
        int length2 = zzajVarArr.length;
        int i3 = 0;
        zzghc.zza(length == length2);
        this.zza = 0L;
        this.zzb = i;
        this.zze = iArr;
        this.zzd = zzajVarArr;
        this.zzf = jArr;
        this.zzh = 0L;
        this.zzi = false;
        this.zzc = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.zzc;
            if (i3 >= uriArr.length) {
                this.zzg = strArr;
                return;
            }
            zzaj zzajVar = zzajVarArr[i3];
            if (zzajVar == null) {
                uri = null;
            } else {
                zzaf zzafVar = zzajVar.zzb;
                zzafVar.getClass();
                uri = zzafVar.zza;
            }
            uriArr[i3] = uri;
            i3++;
        }
    }
}
