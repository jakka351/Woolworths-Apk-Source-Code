package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class zzgos {
    private final boolean zza;
    private final zzgjz zzb;

    public /* synthetic */ zzgos(boolean z, zzgjz zzgjzVar, byte[] bArr) {
        this.zza = z;
        this.zzb = zzgjzVar;
    }

    public final ListenableFuture zza(Callable callable, Executor executor) {
        return new zzgoh(this.zzb, this.zza, executor, callable);
    }
}
