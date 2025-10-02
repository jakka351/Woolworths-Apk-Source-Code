package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzbzr implements zzgoq {
    final /* synthetic */ zzbzt zza;

    public zzbzr(zzbzt zzbztVar) {
        Objects.requireNonNull(zzbztVar);
        this.zza = zzbztVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        this.zza.zzj().set(-1);
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zzb(@Nullable Object obj) {
        this.zza.zzj().set(1);
    }
}
