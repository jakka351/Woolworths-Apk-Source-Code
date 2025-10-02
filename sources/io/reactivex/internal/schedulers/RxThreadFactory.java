package io.reactivex.internal.schedulers;

import YU.a;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class RxThreadFactory extends AtomicLong implements ThreadFactory {
    public final String d;
    public final int e;
    public final boolean f;

    /* loaded from: classes7.dex */
    public static final class RxCustomThread extends Thread implements NonBlockingThread {
        public RxCustomThread(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public RxThreadFactory(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.d + '-' + incrementAndGet();
        Thread rxCustomThread = this.f ? new RxCustomThread(runnable, str) : new Thread(runnable, str);
        rxCustomThread.setPriority(this.e);
        rxCustomThread.setDaemon(true);
        return rxCustomThread;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return a.o(new StringBuilder("RxThreadFactory["), this.d, "]");
    }

    public RxThreadFactory(String str, int i, boolean z) {
        this.d = str;
        this.e = i;
        this.f = z;
    }
}
