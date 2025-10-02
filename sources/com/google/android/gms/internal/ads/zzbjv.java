package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzbjv implements com.google.android.gms.ads.internal.overlay.zzz {
    final /* synthetic */ zzbjy zza;

    public zzbjv(zzbjy zzbjyVar) {
        Objects.requireNonNull(zzbjyVar);
        this.zza = zzbjyVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzz
    public final void zza(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzz
    public final void zzb(int i) {
        this.zza.zzg(i);
    }
}
