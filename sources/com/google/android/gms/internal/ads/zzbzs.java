package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzbzs implements zzgoq {
    final /* synthetic */ zzbzq zza;
    final /* synthetic */ zzbzo zzb;

    public zzbzs(zzbzt zzbztVar, zzbzq zzbzqVar, zzbzo zzbzoVar) {
        this.zza = zzbzqVar;
        this.zzb = zzbzoVar;
        Objects.requireNonNull(zzbztVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zzb(@Nullable Object obj) {
        this.zza.zza(obj);
    }
}
