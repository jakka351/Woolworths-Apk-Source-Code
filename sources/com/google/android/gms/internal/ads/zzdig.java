package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzdig implements zzgoq {
    final /* synthetic */ View zza;
    final /* synthetic */ zzdip zzb;

    public zzdig(zzdip zzdipVar, View view) {
        this.zza = view;
        Objects.requireNonNull(zzdipVar);
        this.zzb = zzdipVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfR)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zzY(this.zza, (zzedu) obj);
    }
}
