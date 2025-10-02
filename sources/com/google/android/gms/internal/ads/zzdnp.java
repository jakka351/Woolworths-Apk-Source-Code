package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzdnp implements zzgoq {
    final /* synthetic */ String zza = "sendMessageToNativeJs";
    final /* synthetic */ Map zzb;

    public zzdnp(zzdnx zzdnxVar, String str, Map map) {
        this.zzb = map;
        Objects.requireNonNull(zzdnxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzcek) obj).zze(this.zza, this.zzb);
    }
}
