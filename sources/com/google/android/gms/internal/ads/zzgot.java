package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class zzgot extends zzgov {
    public static ListenableFuture zza(Object obj) {
        return obj == null ? zzgox.zza : new zzgox(obj);
    }

    public static ListenableFuture zzb() {
        return zzgox.zza;
    }

    public static ListenableFuture zzc(Throwable th) {
        th.getClass();
        return new zzgow(th);
    }

    public static ListenableFuture zzd(Callable callable, Executor executor) {
        zzgps zzgpsVar = new zzgps(callable);
        executor.execute(zzgpsVar);
        return zzgpsVar;
    }

    public static ListenableFuture zze(Runnable runnable, Executor executor) {
        zzgps zzgpsVarZze = zzgps.zze(runnable, null);
        executor.execute(zzgpsVarZze);
        return zzgpsVarZze;
    }

    public static ListenableFuture zzf(zzgoa zzgoaVar, Executor executor) {
        zzgps zzgpsVar = new zzgps(zzgoaVar);
        executor.execute(zzgpsVar);
        return zzgpsVar;
    }

    public static ListenableFuture zzg(ListenableFuture listenableFuture, Class cls, zzggr zzggrVar, Executor executor) {
        int i = zzgnl.zzd;
        zzgnk zzgnkVar = new zzgnk(listenableFuture, cls, zzggrVar);
        listenableFuture.addListener(zzgnkVar, zzgpk.zzd(executor, zzgnkVar));
        return zzgnkVar;
    }

    public static ListenableFuture zzh(ListenableFuture listenableFuture, Class cls, zzgob zzgobVar, Executor executor) {
        int i = zzgnl.zzd;
        zzgnj zzgnjVar = new zzgnj(listenableFuture, cls, zzgobVar);
        listenableFuture.addListener(zzgnjVar, zzgpk.zzd(executor, zzgnjVar));
        return zzgnjVar;
    }

    public static ListenableFuture zzi(ListenableFuture listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return listenableFuture.isDone() ? listenableFuture : zzgpp.zze(listenableFuture, j, timeUnit, scheduledExecutorService);
    }

    public static ListenableFuture zzj(ListenableFuture listenableFuture, zzgob zzgobVar, Executor executor) {
        int i = zzgns.zzc;
        zzgnq zzgnqVar = new zzgnq(listenableFuture, zzgobVar);
        listenableFuture.addListener(zzgnqVar, zzgpk.zzd(executor, zzgnqVar));
        return zzgnqVar;
    }

    public static ListenableFuture zzk(ListenableFuture listenableFuture, zzggr zzggrVar, Executor executor) {
        int i = zzgns.zzc;
        zzgnr zzgnrVar = new zzgnr(listenableFuture, zzggrVar);
        listenableFuture.addListener(zzgnrVar, zzgpk.zzd(executor, zzgnrVar));
        return zzgnrVar;
    }

    public static ListenableFuture zzl(Iterable iterable) {
        return new zzgoc(zzgjz.zzp(iterable), true);
    }

    public static zzgos zzm(Iterable iterable) {
        return new zzgos(false, zzgjz.zzp(iterable), null);
    }

    @SafeVarargs
    public static zzgos zzn(ListenableFuture... listenableFutureArr) {
        return new zzgos(true, zzgjz.zzr(listenableFutureArr), null);
    }

    public static zzgos zzo(Iterable iterable) {
        return new zzgos(true, zzgjz.zzp(iterable), null);
    }

    @SafeVarargs
    public static ListenableFuture zzp(ListenableFuture... listenableFutureArr) {
        return new zzgoc(zzgjz.zzr(listenableFutureArr), false);
    }

    public static void zzq(ListenableFuture listenableFuture, zzgoq zzgoqVar, Executor executor) {
        zzgoqVar.getClass();
        listenableFuture.addListener(new zzgor(listenableFuture, zzgoqVar), executor);
    }

    public static Object zzr(Future future) throws ExecutionException {
        if (future.isDone()) {
            return zzgpu.zza(future);
        }
        throw new IllegalStateException(zzghs.zzd("Future was expected to be done: %s", future));
    }

    public static Object zzs(Future future) {
        try {
            return zzgpu.zza(future);
        } catch (ExecutionException e) {
            if (e.getCause() instanceof Error) {
                throw new zzgoj((Error) e.getCause());
            }
            throw new zzgpt(e.getCause());
        }
    }
}
