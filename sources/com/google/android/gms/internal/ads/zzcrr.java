package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes5.dex */
final class zzcrr implements zzgoq {
    final /* synthetic */ zzcrw zza;

    public zzcrr(zzcrw zzcrwVar) {
        Objects.requireNonNull(zzcrwVar);
        this.zza = zzcrwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        this.zza.zzk().zzm(false);
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Object obj) {
        this.zza.zzk().zzm(true);
    }
}
