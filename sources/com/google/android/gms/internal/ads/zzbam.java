package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes5.dex */
final class zzbam implements zzazc {
    final /* synthetic */ zzbap zza;

    public zzbam(zzbap zzbapVar) {
        Objects.requireNonNull(zzbapVar);
        this.zza = zzbapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final void zza(boolean z) {
        if (z) {
            this.zza.zzf();
        } else {
            this.zza.zzg();
        }
    }
}
