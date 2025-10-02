package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes5.dex */
public abstract class zzgop extends zzgon implements ListenableFuture {
    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        zzc().addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public /* bridge */ /* synthetic */ Future zza() {
        throw null;
    }

    public abstract ListenableFuture zzc();
}
