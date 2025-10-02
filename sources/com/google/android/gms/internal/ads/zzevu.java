package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class zzevu implements zzeup {
    private final Executor zza;
    private final String zzb;

    public zzevu(zzbyn zzbynVar, Executor executor, String str, @Nullable PackageInfo packageInfo, int i) {
        this.zza = executor;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        ListenableFuture listenableFutureZza = zzgot.zza(this.zzb);
        zzevt zzevtVar = zzevt.zza;
        Executor executor = this.zza;
        return zzgot.zzh(zzgot.zzk(listenableFutureZza, zzevtVar, executor), Throwable.class, new zzgob() { // from class: com.google.android.gms.internal.ads.zzevs
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc((Throwable) obj);
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 41;
    }

    public final /* synthetic */ ListenableFuture zzc(Throwable th) {
        return zzgot.zza(new zzevv(this.zzb));
    }
}
