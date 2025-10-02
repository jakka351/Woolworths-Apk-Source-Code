package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public interface zzzn extends Executor {
    static zzzn zzb(Executor executor, zzdf zzdfVar) {
        return new zzzm(executor, zzdfVar);
    }

    void zza();
}
