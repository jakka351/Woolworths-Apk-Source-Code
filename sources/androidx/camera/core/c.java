package androidx.camera.core;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements RejectedExecutionHandler {
    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        ThreadFactory threadFactory = CameraExecutor.f;
        Logger.b("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
    }
}
