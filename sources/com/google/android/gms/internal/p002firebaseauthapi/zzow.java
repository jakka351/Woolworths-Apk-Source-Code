package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class zzow {
    private static final zzow zza = new zzow();
    private static final zzov zzb = new zzov();
    private final AtomicReference<zzol> zzc = new AtomicReference<>();

    public static zzow zzb() {
        return zza;
    }

    public final zzol zza() {
        zzol zzolVar = this.zzc.get();
        return zzolVar == null ? zzb : zzolVar;
    }
}
