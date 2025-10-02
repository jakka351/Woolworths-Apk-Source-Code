package kotlinx.coroutines;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.EventLoopImplBase;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/DefaultExecutor;", "Lkotlinx/coroutines/EventLoopImplBase;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Ljava/lang/Thread;", "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "()V", "", "debugStatus", "I", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class DefaultExecutor extends EventLoopImplBase implements Runnable {

    @Nullable
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final DefaultExecutor m;
    public static final long n;

    static {
        Long l;
        DefaultExecutor defaultExecutor = new DefaultExecutor();
        m = defaultExecutor;
        defaultExecutor.Y(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        n = timeUnit.toNanos(l.longValue());
    }

    public final synchronized void G0() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            EventLoopImplBase.j.set(this, null);
            EventLoopImplBase.k.set(this, null);
            notifyAll();
        }
    }

    @Override // kotlinx.coroutines.EventLoopImplPlatform
    /* renamed from: i0 */
    public final Thread getM() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(m.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // kotlinx.coroutines.EventLoopImplBase, kotlinx.coroutines.Delay
    public final DisposableHandle j(long j, Runnable runnable, CoroutineContext coroutineContext) {
        long jA = EventLoop_commonKt.a(j);
        if (jA >= 4611686018427387903L) {
            return NonDisposableHandle.d;
        }
        long jNanoTime = System.nanoTime();
        EventLoopImplBase.DelayedRunnableTask delayedRunnableTask = new EventLoopImplBase.DelayedRunnableTask(runnable, jA + jNanoTime);
        B0(jNanoTime, delayedRunnableTask);
        return delayedRunnableTask;
    }

    @Override // kotlinx.coroutines.EventLoopImplPlatform
    public final void k0(long j, EventLoopImplBase.DelayedTask delayedTask) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlinx.coroutines.EventLoopImplBase
    public final void m0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.m0(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zZ0;
        ThreadLocalEventLoop.f24695a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (zZ0) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jB0 = b0();
                    if (jB0 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = n + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            G0();
                            if (z0()) {
                                return;
                            }
                            getM();
                            return;
                        }
                        if (jB0 > j2) {
                            jB0 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jB0 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            G0();
                            if (z0()) {
                                return;
                            }
                            getM();
                            return;
                        }
                        LockSupport.parkNanos(this, jB0);
                    }
                }
            }
        } finally {
            _thread = null;
            G0();
            if (!z0()) {
                getM();
            }
        }
    }

    @Override // kotlinx.coroutines.EventLoopImplBase, kotlinx.coroutines.EventLoop
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return "DefaultExecutor";
    }
}
