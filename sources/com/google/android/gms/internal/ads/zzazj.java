package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes5.dex */
public final class zzazj {
    private final float zza;
    private final float zzb;
    private final float zzc;
    private final float zzd;
    private final int zze;

    @VisibleForTesting
    public zzazj(float f, float f2, float f3, float f4, int i) {
        this.zza = f;
        this.zzb = f2;
        this.zzc = f + f3;
        this.zzd = f2 + f4;
        this.zze = i;
    }

    public final float zza() {
        return this.zza;
    }

    public final float zzb() {
        return this.zzb;
    }

    public final float zzc() {
        return this.zzc;
    }

    public final float zzd() {
        return this.zzd;
    }

    public final int zze() {
        return this.zze;
    }
}
