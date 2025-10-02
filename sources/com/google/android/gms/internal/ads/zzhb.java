package com.google.android.gms.internal.ads;

import androidx.annotation.CallSuper;

/* loaded from: classes5.dex */
public class zzhb {
    private int zza;

    @CallSuper
    public void zza() {
        this.zza = 0;
    }

    public final boolean zzb() {
        return zzi(4);
    }

    public final boolean zzc() {
        return zzi(1);
    }

    public final boolean zzd() {
        return zzi(536870912);
    }

    public final boolean zze() {
        return zzi(268435456);
    }

    public final boolean zzf() {
        return zzi(67108864);
    }

    public final void zzg(int i) {
        this.zza = i;
    }

    public final void zzh(int i) {
        this.zza |= 536870912;
    }

    public final boolean zzi(int i) {
        return (this.zza & i) == i;
    }
}
