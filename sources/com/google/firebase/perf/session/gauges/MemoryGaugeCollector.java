package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.StorageUnit;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.Utils;
import com.google.firebase.perf.v1.AndroidMemoryReading;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class MemoryGaugeCollector {
    public static final AndroidLogger f = AndroidLogger.e();

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f15715a;
    public final ConcurrentLinkedQueue b;
    public final Runtime c;
    public ScheduledFuture d;
    public long e;

    public MemoryGaugeCollector() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Runtime runtime = Runtime.getRuntime();
        this.d = null;
        this.e = -1L;
        this.f15715a = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.b = new ConcurrentLinkedQueue();
        this.c = runtime;
    }

    public static boolean b(long j) {
        return j <= 0;
    }

    public final void a(Timer timer) {
        synchronized (this) {
            try {
                this.f15715a.schedule(new b(this, timer, 1), 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                f.g("Unable to collect Memory Metric: " + e.getMessage());
            }
        }
    }

    public final synchronized void c(long j, Timer timer) {
        this.e = j;
        try {
            this.d = this.f15715a.scheduleAtFixedRate(new b(this, timer, 0), 0L, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            f.g("Unable to start collecting Memory Metrics: " + e.getMessage());
        }
    }

    public final void d(long j, Timer timer) {
        if (b(j)) {
            return;
        }
        if (this.d == null) {
            c(j, timer);
        } else if (this.e != j) {
            e();
            c(j, timer);
        }
    }

    public final void e() {
        ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.d = null;
        this.e = -1L;
    }

    public final AndroidMemoryReading f(Timer timer) {
        if (timer == null) {
            return null;
        }
        long jA = timer.a() + timer.d;
        AndroidMemoryReading.Builder builderN = AndroidMemoryReading.N();
        builderN.p();
        AndroidMemoryReading.L((AndroidMemoryReading) builderN.e, jA);
        Runtime runtime = this.c;
        int iB = Utils.b(StorageUnit.f.a(runtime.totalMemory() - runtime.freeMemory()));
        builderN.p();
        AndroidMemoryReading.M((AndroidMemoryReading) builderN.e, iB);
        return (AndroidMemoryReading) builderN.m();
    }
}
