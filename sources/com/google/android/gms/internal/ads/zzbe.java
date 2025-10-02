package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public abstract class zzbe {
    public static final zzbe zza = new zzbb();

    static {
        String str = zzeo.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public final boolean equals(@Nullable Object obj) {
        int iZzj;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbe)) {
            return false;
        }
        zzbe zzbeVar = (zzbe) obj;
        if (zzbeVar.zza() == zza() && zzbeVar.zzc() == zzc()) {
            zzbd zzbdVar = new zzbd();
            zzbc zzbcVar = new zzbc();
            zzbd zzbdVar2 = new zzbd();
            zzbc zzbcVar2 = new zzbc();
            for (int i = 0; i < zza(); i++) {
                if (!zzb(i, zzbdVar, 0L).equals(zzbeVar.zzb(i, zzbdVar2, 0L))) {
                    return false;
                }
            }
            for (int i2 = 0; i2 < zzc(); i2++) {
                if (!zzd(i2, zzbcVar, true).equals(zzbeVar.zzd(i2, zzbcVar2, true))) {
                    return false;
                }
            }
            int iZzk = zzk(true);
            if (iZzk == zzbeVar.zzk(true) && (iZzj = zzj(true)) == zzbeVar.zzj(true)) {
                while (iZzk != iZzj) {
                    int iZzh = zzh(iZzk, 0, true);
                    if (iZzh != zzbeVar.zzh(iZzk, 0, true)) {
                        return false;
                    }
                    iZzk = iZzh;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        zzbd zzbdVar = new zzbd();
        zzbc zzbcVar = new zzbc();
        int iZza = zza() + 217;
        int i2 = 0;
        while (true) {
            i = iZza * 31;
            if (i2 >= zza()) {
                break;
            }
            iZza = i + zzb(i2, zzbdVar, 0L).hashCode();
            i2++;
        }
        int iZzc = zzc() + i;
        for (int i3 = 0; i3 < zzc(); i3++) {
            iZzc = (iZzc * 31) + zzd(i3, zzbcVar, true).hashCode();
        }
        int iZzk = zzk(true);
        while (iZzk != -1) {
            iZzc = (iZzc * 31) + iZzk;
            iZzk = zzh(iZzk, 0, true);
        }
        return iZzc;
    }

    public abstract int zza();

    public abstract zzbd zzb(int i, zzbd zzbdVar, long j);

    public abstract int zzc();

    public abstract zzbc zzd(int i, zzbc zzbcVar, boolean z);

    public abstract int zze(Object obj);

    public abstract Object zzf(int i);

    public final boolean zzg() {
        return zza() == 0;
    }

    public int zzh(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == zzj(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == zzj(z) ? zzk(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public int zzi(int i, int i2, boolean z) {
        if (i == zzk(false)) {
            return -1;
        }
        return i - 1;
    }

    public int zzj(boolean z) {
        if (zzg()) {
            return -1;
        }
        return zza() - 1;
    }

    public int zzk(boolean z) {
        return zzg() ? -1 : 0;
    }

    public final int zzl(int i, zzbc zzbcVar, zzbd zzbdVar, int i2, boolean z) {
        int i3 = zzd(i, zzbcVar, false).zzc;
        if (zzb(i3, zzbdVar, 0L).zzo != i) {
            return i + 1;
        }
        int iZzh = zzh(i3, i2, z);
        if (iZzh == -1) {
            return -1;
        }
        return zzb(iZzh, zzbdVar, 0L).zzn;
    }

    public final Pair zzm(zzbd zzbdVar, zzbc zzbcVar, int i, long j) {
        Pair pairZzn = zzn(zzbdVar, zzbcVar, i, j, 0L);
        pairZzn.getClass();
        return pairZzn;
    }

    @Nullable
    public final Pair zzn(zzbd zzbdVar, zzbc zzbcVar, int i, long j, long j2) {
        zzghc.zzm(i, zza(), "index");
        zzb(i, zzbdVar, j2);
        if (j == -9223372036854775807L) {
            long j3 = zzbdVar.zzl;
            j = 0;
        }
        int i2 = zzbdVar.zzn;
        zzd(i2, zzbcVar, false);
        while (i2 < zzbdVar.zzo) {
            long j4 = zzbcVar.zze;
            if (j == 0) {
                break;
            }
            int i3 = i2 + 1;
            long j5 = zzd(i3, zzbcVar, false).zze;
            if (j < 0) {
                break;
            }
            i2 = i3;
        }
        zzd(i2, zzbcVar, true);
        long j6 = zzbcVar.zze;
        long j7 = zzbcVar.zzd;
        if (j7 != -9223372036854775807L) {
            j = Math.min(j, j7 - 1);
        }
        long jMax = Math.max(0L, j);
        Object obj = zzbcVar.zzb;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public zzbc zzo(Object obj, zzbc zzbcVar) {
        return zzd(zze(obj), zzbcVar, true);
    }
}
