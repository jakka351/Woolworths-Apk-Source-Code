package com.google.mlkit.common.sdkinternal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzav;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@KeepForSdk
/* loaded from: classes.dex */
public class MlKitThreadPool extends zzav {
    public static final ThreadLocal e = new ThreadLocal();
    public final ThreadPoolExecutor d;

    public MlKitThreadPool() {
        final ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.google.mlkit.common.sdkinternal.zzj
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                return threadFactoryDefaultThreadFactory.newThread(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.zzk
                    @Override // java.lang.Runnable
                    public final void run() {
                        MlKitThreadPool.e.set(new ArrayDeque());
                        runnable.run();
                    }
                });
            }
        });
        this.d = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzav, java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        Deque deque = (Deque) e.get();
        if (deque == null || deque.size() > 1) {
            this.d.execute(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.zzi
                @Override // java.lang.Runnable
                public final void run() {
                    Deque deque2 = (Deque) MlKitThreadPool.e.get();
                    Preconditions.checkNotNull(deque2);
                    Runnable runnable2 = runnable;
                    deque2.add(runnable2);
                    if (deque2.size() <= 1) {
                        do {
                            runnable2.run();
                            deque2.removeFirst();
                            runnable2 = (Runnable) deque2.peekFirst();
                        } while (runnable2 != null);
                    }
                }
            });
            return;
        }
        Preconditions.checkNotNull(deque);
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (Runnable) deque.peekFirst();
            } while (runnable != null);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzav, com.google.android.gms.internal.mlkit_common.zzx
    public final /* synthetic */ Object zza() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzav
    public final ExecutorService zzb() {
        return this.d;
    }
}
