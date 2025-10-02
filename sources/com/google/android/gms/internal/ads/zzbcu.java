package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes5.dex */
public final class zzbcu {
    private final long zza;

    @Nullable
    private final String zzb;

    @Nullable
    private final zzbcu zzc;

    public zzbcu(long j, @Nullable String str, @Nullable zzbcu zzbcuVar) {
        this.zza = j;
        this.zzb = str;
        this.zzc = zzbcuVar;
    }

    public final long zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    @Nullable
    public final zzbcu zzc() {
        return this.zzc;
    }
}
