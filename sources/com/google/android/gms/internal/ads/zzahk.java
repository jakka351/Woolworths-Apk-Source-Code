package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.medallia.digital.mobilesdk.l3;

/* loaded from: classes5.dex */
final class zzahk {
    public final zzado zza;
    public final long zzb;
    public final long zzc;
    public final int zzd;
    public final int zze;

    @Nullable
    public final long[] zzf;

    private zzahk(zzado zzadoVar, long j, long j2, @Nullable long[] jArr, int i, int i2) {
        this.zza = new zzado(zzadoVar);
        this.zzb = j;
        this.zzc = j2;
        this.zzf = jArr;
        this.zzd = i;
        this.zze = i2;
    }

    public static zzahk zza(zzado zzadoVar, zzef zzefVar) {
        long[] jArr;
        int i;
        int i2;
        int iZzB = zzefVar.zzB();
        int iZzH = (iZzB & 1) != 0 ? zzefVar.zzH() : -1;
        long jZzz = (iZzB & 2) != 0 ? zzefVar.zzz() : -1L;
        if ((iZzB & 4) == 4) {
            jArr = new long[100];
            for (int i3 = 0; i3 < 100; i3++) {
                jArr[i3] = zzefVar.zzs();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        if ((iZzB & 8) != 0) {
            zzefVar.zzk(4);
        }
        if (zzefVar.zzd() >= 24) {
            zzefVar.zzk(21);
            int iZzx = zzefVar.zzx();
            i2 = iZzx & l3.b;
            i = iZzx >> 12;
        } else {
            i = -1;
            i2 = -1;
        }
        return new zzahk(zzadoVar, iZzH, jZzz, jArr2, i, i2);
    }

    public final long zzb() {
        long j = this.zzb;
        if (j == -1 || j == 0) {
            return -9223372036854775807L;
        }
        return zzeo.zzr((j * r4.zzg) - 1, this.zza.zzd);
    }
}
