package com.google.android.recaptcha.internal;

import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class zzbk {
    public static final /* synthetic */ int zza = 0;

    @NotNull
    private static final ConcurrentHashMap zzb = new ConcurrentHashMap();

    public static final void zza(int i, long j) {
        ConcurrentHashMap concurrentHashMap = zzb;
        Integer numValueOf = Integer.valueOf(i);
        Object zzbjVar = concurrentHashMap.get(numValueOf);
        if (zzbjVar == null) {
            zzbjVar = new zzbj();
        }
        zzbj zzbjVar2 = (zzbj) zzbjVar;
        zzbjVar2.zzg(zzbjVar2.zzb() + 1);
        zzbjVar2.zzf(zzbjVar2.zzd() + j);
        zzbjVar2.zze(Math.max(j, zzbjVar2.zzc()));
        concurrentHashMap.put(numValueOf, zzbjVar2);
    }
}
