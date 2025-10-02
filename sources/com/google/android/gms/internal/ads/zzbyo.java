package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzbyo {
    final /* synthetic */ zzbyp zza;
    private long zzb;
    private long zzc;

    public zzbyo(zzbyp zzbypVar) {
        Objects.requireNonNull(zzbypVar);
        this.zza = zzbypVar;
        this.zzb = -1L;
        this.zzc = -1L;
    }

    public final long zza() {
        return this.zzc;
    }

    public final void zzb() {
        this.zzc = this.zza.zzk().elapsedRealtime();
    }

    public final void zzc() {
        this.zzb = this.zza.zzk().elapsedRealtime();
    }

    public final Bundle zzd() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.zzb);
        bundle.putLong("tclose", this.zzc);
        return bundle;
    }
}
