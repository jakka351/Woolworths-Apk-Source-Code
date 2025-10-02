package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class zzenj {
    private final AtomicBoolean zza = new AtomicBoolean(false);

    @Nullable
    private zzeni zzb;

    public final void zza(boolean z) {
        this.zza.set(true);
    }

    public final boolean zzb() {
        return this.zza.get();
    }

    public final void zzc(zzeni zzeniVar) {
        this.zzb = zzeniVar;
    }

    @Nullable
    public final zzeni zzd() {
        return this.zzb;
    }
}
