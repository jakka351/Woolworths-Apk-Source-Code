package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class zzese implements zzeup {
    private final zzgpd zza;
    private final zzdvs zzb;

    public zzese(zzgpd zzgpdVar, zzdvs zzdvsVar) {
        this.zza = zzgpdVar;
        this.zzb = zzdvsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzesd
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 23;
    }

    public final /* synthetic */ zzesf zzc() {
        zzdvs zzdvsVar = this.zzb;
        return new zzesf(zzdvsVar.zzg(), zzdvsVar.zzd(), com.google.android.gms.ads.internal.zzt.zzo().zzk(), zzdvsVar.zzq(), zzdvsVar.zzm());
    }
}
