package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;

/* loaded from: classes5.dex */
abstract class zzanu<T, B> {
    private static volatile int zza = 100;

    public abstract int zza(T t);

    public abstract B zza();

    public abstract T zza(T t, T t2);

    public abstract void zza(B b, int i, int i2);

    public abstract void zza(B b, int i, long j);

    public abstract void zza(B b, int i, zzajv zzajvVar);

    public abstract void zza(B b, int i, T t);

    public abstract void zza(T t, zzaol zzaolVar) throws IOException;

    public abstract boolean zza(zzanc zzancVar);

    public final boolean zza(B b, zzanc zzancVar, int i) throws IOException {
        int iZzd = zzancVar.zzd();
        int i2 = iZzd >>> 3;
        int i3 = iZzd & 7;
        if (i3 == 0) {
            zzb(b, i2, zzancVar.zzl());
            return true;
        }
        if (i3 == 1) {
            zza((zzanu<T, B>) b, i2, zzancVar.zzk());
            return true;
        }
        if (i3 == 2) {
            zza((zzanu<T, B>) b, i2, zzancVar.zzp());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                if (i != 0) {
                    return false;
                }
                throw zzall.zzb();
            }
            if (i3 != 5) {
                throw zzall.zza();
            }
            zza((zzanu<T, B>) b, i2, zzancVar.zzf());
            return true;
        }
        B bZza = zza();
        int i4 = 4 | (i2 << 3);
        int i5 = i + 1;
        if (i5 >= zza) {
            throw zzall.zzh();
        }
        while (zzancVar.zzc() != Integer.MAX_VALUE && zza((zzanu<T, B>) bZza, zzancVar, i5)) {
        }
        if (i4 != zzancVar.zzd()) {
            throw zzall.zzb();
        }
        zza((zzanu<T, B>) b, i2, (int) zze(bZza));
        return true;
    }

    public abstract int zzb(T t);

    public abstract void zzb(B b, int i, long j);

    public abstract void zzb(T t, zzaol zzaolVar) throws IOException;

    public abstract void zzb(Object obj, B b);

    public abstract B zzc(Object obj);

    public abstract void zzc(Object obj, T t);

    public abstract T zzd(Object obj);

    public abstract T zze(B b);

    public abstract void zzf(Object obj);
}
