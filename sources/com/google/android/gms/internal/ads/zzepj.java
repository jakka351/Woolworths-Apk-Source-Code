package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzepj implements zzeup {
    private final zzgpd zza;
    private final zzdqh zzb;
    private final String zzc;
    private final zzfdc zzd;

    public zzepj(zzgpd zzgpdVar, zzdqh zzdqhVar, zzfdc zzfdcVar, String str) {
        this.zza = zzgpdVar;
        this.zzb = zzdqhVar;
        this.zzd = zzfdcVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzepi
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 17;
    }

    public final /* synthetic */ zzepk zzc() {
        zzfdc zzfdcVar = this.zzd;
        zzdqh zzdqhVar = this.zzb;
        return new zzepk(zzdqhVar.zzb(zzfdcVar.zzg, this.zzc), zzdqhVar.zzc());
    }
}
