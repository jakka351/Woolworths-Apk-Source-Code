package com.google.android.gms.tasks;

import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class Tasks {
    private Tasks() {
    }

    public static <TResult> TResult await(@NonNull Task<TResult> task) throws ExecutionException, InterruptedException {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotGoogleApiHandlerThread();
        Preconditions.checkNotNull(task, "Task must not be null");
        if (task.isComplete()) {
            return (TResult) zza(task);
        }
        zzaa zzaaVar = new zzaa(null);
        zzb(task, zzaaVar);
        zzaaVar.zza();
        return (TResult) zza(task);
    }

    @NonNull
    @Deprecated
    public static <TResult> Task<TResult> call(@NonNull Callable<TResult> callable) {
        return call(TaskExecutors.MAIN_THREAD, callable);
    }

    @NonNull
    public static <TResult> Task<TResult> forCanceled() {
        zzw zzwVar = new zzw();
        zzwVar.zze();
        return zzwVar;
    }

    @NonNull
    public static <TResult> Task<TResult> forException(@NonNull Exception exc) {
        zzw zzwVar = new zzw();
        zzwVar.zzc(exc);
        return zzwVar;
    }

    @NonNull
    public static <TResult> Task<TResult> forResult(TResult tresult) {
        zzw zzwVar = new zzw();
        zzwVar.zza(tresult);
        return zzwVar;
    }

    @NonNull
    public static Task<Void> whenAll(@Nullable Collection<? extends Task<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return forResult(null);
        }
        Iterator<? extends Task<?>> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        zzw zzwVar = new zzw();
        zzae zzaeVar = new zzae(collection.size(), zzwVar);
        Iterator<? extends Task<?>> it2 = collection.iterator();
        while (it2.hasNext()) {
            zzb(it2.next(), zzaeVar);
        }
        return zzwVar;
    }

    @NonNull
    public static Task<List<Task<?>>> whenAllComplete(@Nullable Collection<? extends Task<?>> collection) {
        return whenAllComplete(TaskExecutors.MAIN_THREAD, collection);
    }

    @NonNull
    public static <TResult> Task<List<TResult>> whenAllSuccess(@Nullable Collection<? extends Task> collection) {
        return whenAllSuccess(TaskExecutors.MAIN_THREAD, collection);
    }

    @NonNull
    public static <T> Task<T> withTimeout(@NonNull Task<T> task, long j, @NonNull TimeUnit timeUnit) {
        Preconditions.checkNotNull(task, "Task must not be null");
        Preconditions.checkArgument(j > 0, "Timeout must be positive");
        Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        final zzb zzbVar = new zzb();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(zzbVar);
        final com.google.android.gms.internal.tasks.zza zzaVar = new com.google.android.gms.internal.tasks.zza(Looper.getMainLooper());
        zzaVar.postDelayed(new Runnable() { // from class: com.google.android.gms.tasks.zzad
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                taskCompletionSource.trySetException(new TimeoutException());
            }
        }, timeUnit.toMillis(j));
        task.addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.tasks.zzac
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(Task task2) {
                zzaVar.removeCallbacksAndMessages(null);
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                if (task2.isSuccessful()) {
                    taskCompletionSource2.trySetResult(task2.getResult());
                } else {
                    if (task2.isCanceled()) {
                        zzbVar.zza();
                        return;
                    }
                    Exception exception = task2.getException();
                    Objects.requireNonNull(exception);
                    taskCompletionSource2.trySetException(exception);
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    private static Object zza(@NonNull Task task) throws ExecutionException {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.getException());
    }

    private static void zzb(Task task, zzab zzabVar) {
        Executor executor = TaskExecutors.zza;
        task.addOnSuccessListener(executor, zzabVar);
        task.addOnFailureListener(executor, zzabVar);
        task.addOnCanceledListener(executor, zzabVar);
    }

    @NonNull
    @Deprecated
    public static <TResult> Task<TResult> call(@NonNull Executor executor, @NonNull Callable<TResult> callable) {
        Preconditions.checkNotNull(executor, "Executor must not be null");
        Preconditions.checkNotNull(callable, "Callback must not be null");
        zzw zzwVar = new zzw();
        executor.execute(new zzx(zzwVar, callable));
        return zzwVar;
    }

    @NonNull
    public static Task<List<Task<?>>> whenAllComplete(@NonNull Executor executor, @Nullable Collection<? extends Task<?>> collection) {
        return (collection == null || collection.isEmpty()) ? forResult(Collections.EMPTY_LIST) : whenAll(collection).continueWithTask(executor, new zzz(collection));
    }

    @NonNull
    public static <TResult> Task<List<TResult>> whenAllSuccess(@NonNull Executor executor, @Nullable Collection<? extends Task> collection) {
        return (collection == null || collection.isEmpty()) ? forResult(Collections.EMPTY_LIST) : (Task<List<TResult>>) whenAll((Collection<? extends Task<?>>) collection).continueWith(executor, new zzy(collection));
    }

    @NonNull
    public static Task<List<Task<?>>> whenAllComplete(@NonNull Executor executor, @Nullable Task<?>... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return whenAllComplete(executor, Arrays.asList(taskArr));
        }
        return forResult(Collections.EMPTY_LIST);
    }

    @NonNull
    public static <TResult> Task<List<TResult>> whenAllSuccess(@NonNull Executor executor, @Nullable Task... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return whenAllSuccess(executor, Arrays.asList(taskArr));
        }
        return forResult(Collections.EMPTY_LIST);
    }

    @NonNull
    public static Task<List<Task<?>>> whenAllComplete(@Nullable Task<?>... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return whenAllComplete(Arrays.asList(taskArr));
        }
        return forResult(Collections.EMPTY_LIST);
    }

    @NonNull
    public static <TResult> Task<List<TResult>> whenAllSuccess(@Nullable Task... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return whenAllSuccess(Arrays.asList(taskArr));
        }
        return forResult(Collections.EMPTY_LIST);
    }

    @NonNull
    public static Task<Void> whenAll(@Nullable Task<?>... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return whenAll(Arrays.asList(taskArr));
        }
        return forResult(null);
    }

    public static <TResult> TResult await(@NonNull Task<TResult> task, long j, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotGoogleApiHandlerThread();
        Preconditions.checkNotNull(task, "Task must not be null");
        Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        if (task.isComplete()) {
            return (TResult) zza(task);
        }
        zzaa zzaaVar = new zzaa(null);
        zzb(task, zzaaVar);
        if (zzaaVar.zzb(j, timeUnit)) {
            return (TResult) zza(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }
}
