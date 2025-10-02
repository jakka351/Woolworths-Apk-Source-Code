package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
final class zzgdl implements zzgcz, zzfvv {
    private final Context zza;
    private final ExecutorService zzb;
    private NetworkCapabilities zzc = null;

    public zzgdl(Context context, ExecutorService executorService) {
        this.zza = context;
        this.zzb = executorService;
    }

    @Override // com.google.android.gms.internal.ads.zzfvv
    public final ListenableFuture zza() {
        return zzgot.zze(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgdk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zze();
            }
        }, this.zzb);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0035 A[Catch: all -> 0x0019, DONT_GENERATE, TRY_LEAVE, TryCatch #1 {all -> 0x0019, blocks: (B:7:0x000a, B:9:0x000e, B:11:0x0015, B:15:0x001b, B:17:0x0024, B:19:0x0028, B:21:0x0031, B:23:0x0035), top: B:34:0x000a }] */
    @Override // com.google.android.gms.internal.ads.zzgcz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzb(java.util.Map r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            android.net.NetworkCapabilities r0 = r3.zzc     // Catch: java.lang.Throwable -> L44
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = "ntc"
            r4.put(r1, r0)
            monitor-enter(r3)
            android.net.NetworkCapabilities r0 = r3.zzc     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L35
            r1 = 4
            boolean r0 = r0.hasTransport(r1)     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L19
            r0 = 2
            goto L38
        L19:
            r4 = move-exception
            goto L42
        L1b:
            android.net.NetworkCapabilities r0 = r3.zzc     // Catch: java.lang.Throwable -> L19
            r1 = 1
            boolean r0 = r0.hasTransport(r1)     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L28
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L19
            r0 = 1
            goto L38
        L28:
            android.net.NetworkCapabilities r0 = r3.zzc     // Catch: java.lang.Throwable -> L19
            r1 = 0
            boolean r0 = r0.hasTransport(r1)     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L35
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L19
            r0 = 0
            goto L38
        L35:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L19
            r0 = -1
        L38:
            java.lang.String r2 = "nt"
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.put(r2, r0)
            return
        L42:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L19
            throw r4
        L44:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L44
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgdl.zzb(java.util.Map):void");
    }

    @Override // com.google.android.gms.internal.ads.zzgcz
    public final void zzc(Map map, Context context, View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzgcz
    public final void zzd(Map map) {
    }

    public final /* synthetic */ void zze() {
        zzgdj zzgdjVar = new zzgdj(this);
        try {
            Object systemService = this.zza.getSystemService("connectivity");
            if (systemService == null) {
                throw null;
            }
            ((ConnectivityManager) systemService).registerDefaultNetworkCallback(zzgdjVar);
        } catch (Throwable unused) {
        }
    }

    public final /* synthetic */ void zzf(NetworkCapabilities networkCapabilities) {
        this.zzc = networkCapabilities;
    }
}
