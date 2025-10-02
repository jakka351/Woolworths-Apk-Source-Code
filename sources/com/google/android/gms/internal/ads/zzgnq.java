package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes5.dex */
final class zzgnq extends zzgns {
    public zzgnq(ListenableFuture listenableFuture, zzgob zzgobVar) {
        super(listenableFuture, zzgobVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgns
    public final /* synthetic */ void zze(Object obj) {
        zzk((ListenableFuture) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgns
    public final /* bridge */ /* synthetic */ Object zzf(Object obj, Object obj2) throws Exception {
        zzgob zzgobVar = (zzgob) obj;
        ListenableFuture listenableFutureZza = zzgobVar.zza(obj2);
        zzghc.zzl(listenableFutureZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgobVar);
        return listenableFutureZza;
    }
}
