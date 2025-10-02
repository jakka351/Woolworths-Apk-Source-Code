package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes5.dex */
public final class zzgpk {
    public static Executor zza() {
        return zzgoi.INSTANCE;
    }

    public static zzgpd zzb(ExecutorService executorService) {
        return executorService instanceof zzgpd ? (zzgpd) executorService : executorService instanceof ScheduledExecutorService ? new zzgpj((ScheduledExecutorService) executorService) : new zzgpf(executorService);
    }

    public static zzgpe zzc(ScheduledExecutorService scheduledExecutorService) {
        return new zzgpj(scheduledExecutorService);
    }

    public static Executor zzd(final Executor executor, final zzgnm zzgnmVar) {
        executor.getClass();
        return executor == zzgoi.INSTANCE ? executor : new Executor() { // from class: com.google.android.gms.internal.ads.zzgpg
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                zzgpk.zzf(executor, zzgnmVar, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void zzf(Executor executor, zzgnm zzgnmVar, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e) {
            zzgnmVar.zzb(e);
        }
    }
}
