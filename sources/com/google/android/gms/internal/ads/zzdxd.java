package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* loaded from: classes5.dex */
final /* synthetic */ class zzdxd implements zzgob {
    static final /* synthetic */ zzdxd zza = new zzdxd();

    private /* synthetic */ zzdxd() {
    }

    @Override // com.google.android.gms.internal.ads.zzgob
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        Throwable cause = (ExecutionException) obj;
        if (cause.getCause() != null) {
            cause = cause.getCause();
        }
        return zzgot.zzc(cause);
    }
}
