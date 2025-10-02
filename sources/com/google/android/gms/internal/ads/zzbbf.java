package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* loaded from: classes5.dex */
public final class zzbbf {
    private final InputStream zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final boolean zze;

    private zzbbf(InputStream inputStream, boolean z, boolean z2, long j, boolean z3) {
        this.zza = inputStream;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = j;
        this.zze = z3;
    }

    public static zzbbf zza(InputStream inputStream, boolean z, boolean z2, long j, boolean z3) {
        return new zzbbf(inputStream, z, z2, j, z3);
    }

    public final InputStream zzb() {
        return this.zza;
    }

    public final boolean zzc() {
        return this.zzb;
    }

    public final boolean zzd() {
        return this.zzc;
    }

    public final long zze() {
        return this.zzd;
    }

    public final boolean zzf() {
        return this.zze;
    }
}
