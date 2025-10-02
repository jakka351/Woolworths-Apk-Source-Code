package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class zzenw implements zzeup {
    private final Executor zza;
    private final zzbyv zzb;

    public zzenw(Executor executor, zzbyv zzbyvVar) {
        this.zza = executor;
        this.zzb = zzbyvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdn)).booleanValue()) {
            return zzgot.zza(new zzenx(null));
        }
        zzbyv zzbyvVar = this.zzb;
        return zzgot.zzk(zzbyvVar.zzq(), zzenv.zza, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 10;
    }
}
