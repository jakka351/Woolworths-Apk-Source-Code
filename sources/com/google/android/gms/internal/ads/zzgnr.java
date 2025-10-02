package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes5.dex */
final class zzgnr extends zzgns {
    public zzgnr(ListenableFuture listenableFuture, zzggr zzggrVar) {
        super(listenableFuture, zzggrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgns
    public final void zze(Object obj) {
        zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgns
    public final /* synthetic */ Object zzf(Object obj, Object obj2) throws Exception {
        return ((zzggr) obj).apply(obj2);
    }
}
