package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzbfa {
    private static final AtomicReference zza = new AtomicReference();
    private static final AtomicReference zzb = new AtomicReference();

    static {
        new AtomicBoolean();
    }

    public static zzbey zza() {
        return (zzbey) zza.get();
    }

    public static zzbez zzb() {
        return (zzbez) zzb.get();
    }

    public static void zzc(zzbey zzbeyVar) {
        zza.set(zzbeyVar);
    }
}
