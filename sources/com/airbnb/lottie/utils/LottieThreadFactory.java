package com.airbnb.lottie.utils;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class LottieThreadFactory implements ThreadFactory {
    public static final AtomicInteger g = new AtomicInteger(1);
    public final ThreadGroup d;
    public final AtomicInteger e = new AtomicInteger(1);
    public final String f;

    public LottieThreadFactory() {
        SecurityManager securityManager = System.getSecurityManager();
        this.d = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        this.f = "lottie-" + g.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.d, runnable, this.f + this.e.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
