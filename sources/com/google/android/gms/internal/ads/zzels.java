package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes5.dex */
final class zzels implements zzelx {
    final /* synthetic */ zzelt zza;

    public zzels(zzelt zzeltVar) {
        Objects.requireNonNull(zzeltVar);
        this.zza = zzeltVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final void zza() {
        synchronized (this.zza) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcqs zzcqsVar = (zzcqs) obj;
        zzelt zzeltVar = this.zza;
        synchronized (zzeltVar) {
            zzeltVar.zze(zzcqsVar.zzn());
            zzcqsVar.zzj();
        }
    }
}
