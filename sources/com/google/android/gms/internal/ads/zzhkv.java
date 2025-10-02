package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes5.dex */
abstract class zzhkv {
    private static volatile int zza = 100;

    public abstract void zza(Object obj, int i, long j);

    public abstract void zzb(Object obj, int i, int i2);

    public abstract void zzc(Object obj, int i, long j);

    public abstract void zzd(Object obj, int i, zzhhb zzhhbVar);

    public abstract void zze(Object obj, int i, Object obj2);

    public abstract Object zzf();

    public abstract Object zzg(Object obj);

    public abstract Object zzh(Object obj);

    public abstract void zzi(Object obj, Object obj2);

    public abstract void zzj(Object obj);

    public final boolean zzk(Object obj, zzhkf zzhkfVar, int i) throws IOException {
        int iZzc = zzhkfVar.zzc();
        int i2 = iZzc >>> 3;
        int i3 = iZzc & 7;
        if (i3 == 0) {
            zza(obj, i2, zzhkfVar.zzh());
            return true;
        }
        if (i3 == 1) {
            zzc(obj, i2, zzhkfVar.zzj());
            return true;
        }
        if (i3 == 2) {
            zzd(obj, i2, zzhkfVar.zzq());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                if (i != 0) {
                    return false;
                }
                throw new zzhiw("Protocol message end-group tag did not match expected tag.");
            }
            if (i3 != 5) {
                throw new zzhiv("Protocol message tag had invalid wire type.");
            }
            zzb(obj, i2, zzhkfVar.zzk());
            return true;
        }
        Object objZzf = zzf();
        int i4 = i2 << 3;
        int i5 = i + 1;
        if (i5 >= zza) {
            throw new zzhiw("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zzhkfVar.zzb() != Integer.MAX_VALUE && zzk(objZzf, zzhkfVar, i5)) {
        }
        if ((i4 | 4) != zzhkfVar.zzc()) {
            throw new zzhiw("Protocol message end-group tag did not match expected tag.");
        }
        zze(obj, i2, zzg(objZzf));
        return true;
    }
}
