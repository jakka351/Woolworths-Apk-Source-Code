package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzfkm implements zzazc {
    final /* synthetic */ zzfko zza;

    public zzfkm(zzfko zzfkoVar) {
        Objects.requireNonNull(zzfkoVar);
        this.zza = zzfkoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final void zza(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzx)).booleanValue()) {
            this.zza.zzj(z);
        }
    }
}
