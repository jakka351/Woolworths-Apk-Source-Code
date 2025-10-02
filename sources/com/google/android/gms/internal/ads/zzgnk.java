package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes5.dex */
final class zzgnk extends zzgnl {
    public zzgnk(ListenableFuture listenableFuture, Class cls, zzggr zzggrVar) {
        super(listenableFuture, cls, zzggrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgnl
    public final void zze(Object obj) {
        zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgnl
    public final /* synthetic */ Object zzf(Object obj, Throwable th) throws Exception {
        return ((zzggr) obj).apply(th);
    }
}
