package com.google.mlkit.vision.common.internal;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzrr;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.mlkit.common.sdkinternal.MLTask;
import com.google.mlkit.vision.barcode.internal.zzl;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

@KeepForSdk
/* loaded from: classes6.dex */
public class MobileVisionBase<DetectionResultT> implements Closeable, LifecycleObserver {
    public static final GmsLogger h = new GmsLogger("MobileVisionBase", "");
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final MLTask e;
    public final CancellationTokenSource f;
    public final Executor g;

    public MobileVisionBase(zzl zzlVar, Executor executor) {
        this.e = zzlVar;
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        this.f = cancellationTokenSource;
        this.g = executor;
        zzlVar.b.incrementAndGet();
        zzlVar.a(executor, zzb.d, cancellationTokenSource.getToken()).addOnFailureListener(zzc.d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, com.google.mlkit.vision.barcode.BarcodeScanner
    @KeepForSdk
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public synchronized void close() {
        boolean z = true;
        if (this.d.getAndSet(true)) {
            return;
        }
        this.f.cancel();
        final MLTask mLTask = this.e;
        Executor executor = this.g;
        if (mLTask.b.get() <= 0) {
            z = false;
        }
        Preconditions.checkState(z);
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        mLTask.f15983a.a(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.zzl
            @Override // java.lang.Runnable
            public final void run() {
                ModelResource modelResource = mLTask;
                int iDecrementAndGet = modelResource.b.decrementAndGet();
                Preconditions.checkState(iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    modelResource.c();
                    modelResource.c.set(false);
                }
                zzrr.zza();
                taskCompletionSource.setResult(null);
            }
        }, executor);
        taskCompletionSource.getTask();
    }
}
