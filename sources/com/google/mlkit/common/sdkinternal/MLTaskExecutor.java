package com.google.mlkit.common.sdkinternal;

import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

@KeepForSdk
/* loaded from: classes6.dex */
public class MLTaskExecutor {
    public static final Object b = new Object();
    public static MLTaskExecutor c;

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.mlkit_common.zza f15981a;

    public MLTaskExecutor(Looper looper) {
        this.f15981a = new com.google.android.gms.internal.mlkit_common.zza(looper);
    }

    public static MLTaskExecutor a() {
        MLTaskExecutor mLTaskExecutor;
        synchronized (b) {
            try {
                if (c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    c = new MLTaskExecutor(handlerThread.getLooper());
                }
                mLTaskExecutor = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mLTaskExecutor;
    }

    public static Task b(final Callable callable) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zzh.d.execute(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.zzf
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable2 = callable;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                try {
                    taskCompletionSource2.setResult(callable2.call());
                } catch (MlKitException e) {
                    taskCompletionSource2.setException(e);
                } catch (Exception e2) {
                    taskCompletionSource2.setException(new MlKitException("Internal error has occurred when executing ML Kit tasks", e2));
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    public static Executor c() {
        return zzh.d;
    }
}
