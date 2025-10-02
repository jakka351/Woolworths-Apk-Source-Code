package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgnm;

/* loaded from: classes5.dex */
final class zzgpi extends zzgnm.zzf implements Runnable {
    private final Runnable zza;

    public zzgpi(Runnable runnable) {
        runnable.getClass();
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Throwable th) {
            zzb(th);
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    public final String zzd() {
        String string = this.zza.toString();
        return YU.a.p(new StringBuilder(string.length() + 7), "task=[", string, "]");
    }
}
