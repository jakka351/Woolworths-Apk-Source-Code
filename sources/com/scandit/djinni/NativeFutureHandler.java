package com.scandit.djinni;

import com.scandit.djinni.Future;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public class NativeFutureHandler<T> implements Future.FutureHandler<T> {

    /* renamed from: a, reason: collision with root package name */
    private final long f19005a;
    private final long b;

    public NativeFutureHandler(long j, long j2) {
        this.f19005a = j;
        this.b = j2;
    }

    private static native void nativeHandleResult(long j, long j2, Object obj, Throwable th);

    @Override // com.scandit.djinni.Future.FutureHandler
    public void handleResult(Future<T> future) throws ExecutionException, InterruptedException {
        Throwable th;
        T t;
        try {
            t = future.get();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            t = null;
        }
        nativeHandleResult(this.f19005a, this.b, t, th);
    }
}
