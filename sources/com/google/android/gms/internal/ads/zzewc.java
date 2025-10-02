package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzewc implements zzeup {
    final zzgpd zza;

    public zzewc(zzbaw zzbawVar, zzgpd zzgpdVar, Context context) {
        this.zza = zzgpdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzewb
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzewd(new JSONObject());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 45;
    }
}
