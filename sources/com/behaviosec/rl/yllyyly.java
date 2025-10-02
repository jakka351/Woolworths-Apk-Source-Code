package com.behaviosec.rl;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes4.dex */
public class yllyyly extends ScheduledThreadPoolExecutor implements AutoCloseable {
    public static int h006800680068h006800680068 = 43;
    public static int h00680068h0068006800680068 = 0;
    public static int h0068hh0068006800680068 = 2;
    public static int hhhh0068006800680068 = 1;
    private Condition h00680068hhhh;
    private boolean h0068hhhhh;
    private ReentrantLock hh0068hhhh;

    public yllyyly(int i) {
        super(i);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.hh0068hhhh = reentrantLock;
        this.h00680068hhhh = reentrantLock.newCondition();
    }

    public static int hh0068h0068006800680068() {
        return 88;
    }

    public void b00620062b0062bb() {
        this.hh0068hhhh.lock();
        int i = h006800680068h006800680068;
        if (((hhhh0068006800680068 + i) * i) % h0068hh0068006800680068 != h00680068h0068006800680068) {
            h006800680068h006800680068 = hh0068h0068006800680068();
            h00680068h0068006800680068 = 23;
        }
        try {
            this.h0068hhhhh = true;
        } finally {
            this.hh0068hhhh.unlock();
        }
    }

    public void bbb00620062bb() {
        this.hh0068hhhh.lock();
        try {
            this.h0068hhhhh = false;
            this.h00680068hhhh.signalAll();
        } finally {
            this.hh0068hhhh.unlock();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
        int i = h006800680068h006800680068;
        if (((hhhh0068006800680068 + i) * i) % h0068hh0068006800680068 != 0) {
            h006800680068h006800680068 = hh0068h0068006800680068();
            hhhh0068006800680068 = hh0068h0068006800680068();
        }
        this.hh0068hhhh.lock();
        try {
            if (this.h0068hhhhh) {
                thread.interrupt();
            }
        } finally {
            this.hh0068hhhh.unlock();
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() throws InterruptedException {
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }
}
