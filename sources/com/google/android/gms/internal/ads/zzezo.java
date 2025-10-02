package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class zzezo implements zzfab {
    private final zzfer zza;
    private final Executor zzb;
    private final zzgoq zzc = new zzezl(this);

    public zzezo(zzfer zzferVar, Executor executor) {
        this.zza = zzferVar;
        this.zzb = executor;
    }

    public final ListenableFuture zza(zzfac zzfacVar, zzfaa zzfaaVar, final zzcuz zzcuzVar) {
        zzfer zzferVar = this.zza;
        Executor executor = this.zzb;
        return (zzgol) zzgot.zzg((zzgol) zzgot.zzj(zzgol.zzw(new zzezx(zzferVar, zzcuzVar, executor).zza()), new zzgob() { // from class: com.google.android.gms.internal.ads.zzezm
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzb(zzcuzVar, (zzezv) obj);
            }
        }, executor), Exception.class, new zzezk(this), executor);
    }

    public final /* synthetic */ ListenableFuture zzb(zzcuz zzcuzVar, zzezv zzezvVar) {
        zzfer zzferVar = this.zza;
        zzffb zzffbVar = zzezvVar.zzb;
        zzbuv zzbuvVar = zzezvVar.zza;
        zzffa zzffaVarZza = zzferVar.zza(zzffbVar);
        if (zzffaVarZza != null && zzbuvVar != null) {
            zzgot.zzq(zzcuzVar.zza().zzf(zzbuvVar), this.zzc, this.zzb);
        }
        return zzgot.zza(new zzezn(zzffbVar, zzbuvVar, zzffaVarZza));
    }

    @Override // com.google.android.gms.internal.ads.zzfab
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfac zzfacVar, zzfaa zzfaaVar, Object obj) {
        return zza(zzfacVar, zzfaaVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfab
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
