package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes5.dex */
final class zzcrs implements zzgoq {
    final /* synthetic */ zzcrw zza;

    public zzcrs(zzcrw zzcrwVar) {
        Objects.requireNonNull(zzcrwVar);
        this.zza = zzcrwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        this.zza.zzk().zzn(false);
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Object obj) {
        this.zza.zzk().zzn(true);
    }
}
