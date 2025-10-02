package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes5.dex */
final class zzfgt implements zzgoq {
    final /* synthetic */ zzfgo zza;
    final /* synthetic */ zzfgy zzb;

    public zzfgt(zzfgy zzfgyVar, zzfgo zzfgoVar) {
        this.zza = zzfgoVar;
        Objects.requireNonNull(zzfgyVar);
        this.zzb = zzfgyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        this.zzb.zza.zzg().zzc(this.zza, th);
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zzb(Object obj) {
        this.zzb.zza.zzg().zzd(this.zza);
    }
}
