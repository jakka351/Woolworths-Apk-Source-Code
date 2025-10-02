package com.google.android.gms.measurement.internal;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzlu {

    @Nullable
    public final String zza;

    @Nullable
    public final String zzb;
    public final long zzc;
    boolean zzd;
    public final boolean zze;
    public final long zzf;

    public zzlu(@Nullable String str, @Nullable String str2, long j, boolean z, long j2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = false;
        this.zze = z;
        this.zzf = j2;
    }

    public zzlu(@Nullable String str, @Nullable String str2, long j) {
        this(str, str2, j, false, 0L);
    }
}
