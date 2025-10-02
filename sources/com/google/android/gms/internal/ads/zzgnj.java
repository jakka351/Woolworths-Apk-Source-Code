package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes5.dex */
final class zzgnj extends zzgnl {
    public zzgnj(ListenableFuture listenableFuture, Class cls, zzgob zzgobVar) {
        super(listenableFuture, cls, zzgobVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgnl
    public final /* synthetic */ void zze(Object obj) {
        zzk((ListenableFuture) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgnl
    public final /* bridge */ /* synthetic */ Object zzf(Object obj, Throwable th) throws Exception {
        zzgob zzgobVar = (zzgob) obj;
        ListenableFuture listenableFutureZza = zzgobVar.zza(th);
        zzghc.zzl(listenableFutureZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgobVar);
        return listenableFutureZza;
    }
}
