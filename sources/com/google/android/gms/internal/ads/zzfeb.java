package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes5.dex */
public final class zzfeb {
    private final Deque zza = new LinkedBlockingDeque();
    private final Callable zzb;
    private final zzgpd zzc;

    public zzfeb(Callable callable, zzgpd zzgpdVar) {
        this.zzb = callable;
        this.zzc = zzgpdVar;
    }

    public final synchronized void zza(int i) {
        Deque deque = this.zza;
        int size = i - deque.size();
        for (int i2 = 0; i2 < size; i2++) {
            deque.add(this.zzc.submit(this.zzb));
        }
    }

    @Nullable
    public final synchronized ListenableFuture zzb() {
        zza(1);
        return (ListenableFuture) this.zza.poll();
    }

    public final synchronized void zzc(ListenableFuture listenableFuture) {
        this.zza.addFirst(listenableFuture);
    }
}
