package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzcgp extends Thread {
    final /* synthetic */ Runnable zza;
    final /* synthetic */ zzcgq zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcgp(zzcgq zzcgqVar, Runnable runnable, String str, Runnable runnable2) {
        super(runnable, str);
        this.zza = runnable2;
        Objects.requireNonNull(zzcgqVar);
        this.zzb = zzcgqVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(this.zzb.zza());
        this.zza.run();
    }
}
