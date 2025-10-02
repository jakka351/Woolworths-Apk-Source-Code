package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class zzerp implements zzeup {
    private final Context zza;
    private final zzgpd zzb;

    public zzerp(zzgpd zzgpdVar, Context context) {
        this.zzb = zzgpdVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        return this.zzb.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzero
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 57;
    }

    public final /* synthetic */ zzerq zzc() {
        com.google.android.gms.ads.internal.zzt.zzc();
        return new zzerq(com.google.android.gms.ads.internal.util.zzs.zzw(this.zza));
    }
}
