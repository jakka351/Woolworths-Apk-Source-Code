package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes5.dex */
final class zzcuh implements zzgoq {
    final /* synthetic */ zzcuj zza;

    public zzcuh(zzcuj zzcujVar) {
        Objects.requireNonNull(zzcujVar);
        this.zza = zzcujVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Object obj) {
        this.zza.zzk().zza();
    }
}
