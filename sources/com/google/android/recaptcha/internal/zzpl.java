package com.google.android.recaptcha.internal;

import java.io.IOException;

/* loaded from: classes6.dex */
abstract class zzpl {
    private static volatile int zza = 100;

    public abstract Object zza(Object obj);

    public abstract Object zzb();

    public abstract Object zzc(Object obj);

    public abstract void zzd(Object obj, int i, int i2);

    public abstract void zze(Object obj, int i, long j);

    public abstract void zzf(Object obj, int i, Object obj2);

    public abstract void zzg(Object obj, int i, zzle zzleVar);

    public abstract void zzh(Object obj, int i, long j);

    public abstract void zzi(Object obj);

    public abstract void zzj(Object obj, Object obj2);

    public final boolean zzk(Object obj, zzov zzovVar, int i) throws IOException {
        int iZzd = zzovVar.zzd();
        int i2 = iZzd >>> 3;
        int i3 = iZzd & 7;
        if (i3 == 0) {
            zzh(obj, i2, zzovVar.zzl());
            return true;
        }
        if (i3 == 1) {
            zze(obj, i2, zzovVar.zzk());
            return true;
        }
        if (i3 == 2) {
            zzg(obj, i2, zzovVar.zzp());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
            zzd(obj, i2, zzovVar.zzf());
            return true;
        }
        Object objZzb = zzb();
        int i4 = i2 << 3;
        int i5 = i + 1;
        if (i5 >= zza) {
            throw new zznn("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zzovVar.zzc() != Integer.MAX_VALUE && zzk(objZzb, zzovVar, i5)) {
        }
        if ((i4 | 4) != zzovVar.zzd()) {
            throw new zznn("Protocol message end-group tag did not match expected tag.");
        }
        zzf(obj, i2, zzc(objZzb));
        return true;
    }
}
