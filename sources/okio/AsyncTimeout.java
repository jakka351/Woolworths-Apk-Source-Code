package okio;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokio/AsyncTimeout;", "Lokio/Timeout;", "Watchdog", "Companion", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class AsyncTimeout extends Timeout {
    public static final ReentrantLock i;
    public static final Condition j;
    public static final long k;
    public static final long l;
    public static AsyncTimeout m;
    public int f;
    public AsyncTimeout g;
    public long h;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lokio/AsyncTimeout$Companion;", "", "", "TIMEOUT_WRITE_SIZE", "I", "", "IDLE_TIMEOUT_MILLIS", "J", "IDLE_TIMEOUT_NANOS", "STATE_IDLE", "STATE_IN_QUEUE", "STATE_TIMED_OUT", "STATE_CANCELED", "Lokio/AsyncTimeout;", "head", "Lokio/AsyncTimeout;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static final void a(AsyncTimeout asyncTimeout, long j, boolean z) {
            AsyncTimeout asyncTimeout2;
            ReentrantLock reentrantLock = AsyncTimeout.i;
            if (AsyncTimeout.m == null) {
                AsyncTimeout.m = new AsyncTimeout();
                Watchdog watchdog = new Watchdog("Okio Watchdog");
                watchdog.setDaemon(true);
                watchdog.start();
            }
            long jNanoTime = System.nanoTime();
            if (j != 0 && z) {
                asyncTimeout.h = Math.min(j, asyncTimeout.d() - jNanoTime) + jNanoTime;
            } else if (j != 0) {
                asyncTimeout.h = j + jNanoTime;
            } else {
                if (!z) {
                    throw new AssertionError();
                }
                asyncTimeout.h = asyncTimeout.d();
            }
            long j2 = asyncTimeout.h - jNanoTime;
            AsyncTimeout asyncTimeout3 = AsyncTimeout.m;
            Intrinsics.e(asyncTimeout3);
            while (true) {
                asyncTimeout2 = asyncTimeout3.g;
                if (asyncTimeout2 == null || j2 < asyncTimeout2.h - jNanoTime) {
                    break;
                }
                Intrinsics.e(asyncTimeout2);
                asyncTimeout3 = asyncTimeout2;
            }
            asyncTimeout.g = asyncTimeout2;
            asyncTimeout3.g = asyncTimeout;
            if (asyncTimeout3 == AsyncTimeout.m) {
                AsyncTimeout.j.signal();
            }
        }

        public static AsyncTimeout b() throws InterruptedException {
            AsyncTimeout asyncTimeout = AsyncTimeout.m;
            Intrinsics.e(asyncTimeout);
            AsyncTimeout asyncTimeout2 = asyncTimeout.g;
            if (asyncTimeout2 == null) {
                long jNanoTime = System.nanoTime();
                AsyncTimeout.j.await(AsyncTimeout.k, TimeUnit.MILLISECONDS);
                AsyncTimeout asyncTimeout3 = AsyncTimeout.m;
                Intrinsics.e(asyncTimeout3);
                if (asyncTimeout3.g != null || System.nanoTime() - jNanoTime < AsyncTimeout.l) {
                    return null;
                }
                return AsyncTimeout.m;
            }
            long jNanoTime2 = asyncTimeout2.h - System.nanoTime();
            if (jNanoTime2 > 0) {
                AsyncTimeout.j.await(jNanoTime2, TimeUnit.NANOSECONDS);
                return null;
            }
            AsyncTimeout asyncTimeout4 = AsyncTimeout.m;
            Intrinsics.e(asyncTimeout4);
            asyncTimeout4.g = asyncTimeout2.g;
            asyncTimeout2.g = null;
            asyncTimeout2.f = 2;
            return asyncTimeout2;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/AsyncTimeout$Watchdog;", "Ljava/lang/Thread;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Watchdog extends Thread {
        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            ReentrantLock reentrantLock;
            AsyncTimeout asyncTimeoutB;
            while (true) {
                try {
                    ReentrantLock reentrantLock2 = AsyncTimeout.i;
                    reentrantLock = AsyncTimeout.i;
                    reentrantLock.lock();
                    try {
                        asyncTimeoutB = Companion.b();
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                } catch (InterruptedException unused) {
                    continue;
                }
                if (asyncTimeoutB == AsyncTimeout.m) {
                    AsyncTimeout.m = null;
                    reentrantLock.unlock();
                    return;
                } else {
                    reentrantLock.unlock();
                    if (asyncTimeoutB != null) {
                        asyncTimeoutB.l();
                    }
                }
            }
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        i = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        Intrinsics.g(conditionNewCondition, "newCondition(...)");
        j = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        k = millis;
        l = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    @Override // okio.Timeout
    public final void a() {
        super.a();
        ReentrantLock reentrantLock = i;
        reentrantLock.lock();
        try {
            if (this.f == 1) {
                AsyncTimeout asyncTimeout = m;
                while (asyncTimeout != null) {
                    AsyncTimeout asyncTimeout2 = asyncTimeout.g;
                    if (asyncTimeout2 == this) {
                        asyncTimeout.g = this.g;
                        this.g = null;
                        this.f = 3;
                    } else {
                        asyncTimeout = asyncTimeout2;
                    }
                }
                throw new IllegalStateException("node was not found in the queue");
            }
            reentrantLock.unlock();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void j() {
        long j2 = this.c;
        boolean z = this.f26784a;
        if (j2 != 0 || z) {
            ReentrantLock reentrantLock = i;
            reentrantLock.lock();
            try {
                if (this.f != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f = 1;
                Companion.a(this, j2, z);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean k() {
        ReentrantLock reentrantLock = i;
        reentrantLock.lock();
        try {
            int i2 = this.f;
            this.f = 0;
            if (i2 != 1) {
                return i2 == 2;
            }
            AsyncTimeout asyncTimeout = m;
            while (asyncTimeout != null) {
                AsyncTimeout asyncTimeout2 = asyncTimeout.g;
                if (asyncTimeout2 == this) {
                    asyncTimeout.g = this.g;
                    this.g = null;
                    return false;
                }
                asyncTimeout = asyncTimeout2;
            }
            throw new IllegalStateException("node was not found in the queue");
        } finally {
            reentrantLock.unlock();
        }
    }

    public void l() {
    }
}
