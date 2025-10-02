package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes5.dex */
final class zzfka implements zzazc {
    final /* synthetic */ zzfkb zza;

    public zzfka(zzfkb zzfkbVar) {
        Objects.requireNonNull(zzfkbVar);
        this.zza = zzfkbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final void zza(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzx)).booleanValue()) {
            this.zza.zzl(z);
        }
    }
}
