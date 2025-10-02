package com.google.firebase.perf.session.gauges;

import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.CpuMetricReading;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class CpuGaugeCollector {
    public static final AndroidLogger g = AndroidLogger.e();
    public static final long h = TimeUnit.SECONDS.toMicros(1);
    public ScheduledFuture e = null;
    public long f = -1;

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentLinkedQueue f15712a = new ConcurrentLinkedQueue();
    public final ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor();
    public final String c = "/proc/" + Integer.toString(Process.myPid()) + "/stat";
    public final long d = Os.sysconf(OsConstants._SC_CLK_TCK);

    public static boolean b(long j) {
        return j <= 0;
    }

    public final void a(Timer timer) {
        synchronized (this) {
            try {
                this.b.schedule(new a(this, timer, 1), 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                g.g("Unable to collect Cpu Metric: " + e.getMessage());
            }
        }
    }

    public final synchronized void c(long j, Timer timer) {
        this.f = j;
        try {
            this.e = this.b.scheduleAtFixedRate(new a(this, timer, 0), 0L, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            g.g("Unable to start collecting Cpu Metrics: " + e.getMessage());
        }
    }

    public final void d(long j, Timer timer) {
        long j2 = this.d;
        if (j2 == -1 || j2 == 0 || b(j)) {
            return;
        }
        if (this.e == null) {
            c(j, timer);
        } else if (this.f != j) {
            e();
            c(j, timer);
        }
    }

    public final void e() {
        ScheduledFuture scheduledFuture = this.e;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.e = null;
        this.f = -1L;
    }

    public final CpuMetricReading f(Timer timer) {
        long j = this.d;
        AndroidLogger androidLogger = g;
        if (timer == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.c));
            try {
                long jA = timer.a() + timer.d;
                String[] strArrSplit = bufferedReader.readLine().split(" ");
                long j2 = Long.parseLong(strArrSplit[13]);
                long j3 = Long.parseLong(strArrSplit[15]);
                long j4 = Long.parseLong(strArrSplit[14]);
                long j5 = Long.parseLong(strArrSplit[16]);
                CpuMetricReading.Builder builderO = CpuMetricReading.O();
                builderO.p();
                CpuMetricReading.L((CpuMetricReading) builderO.e, jA);
                double d = (j4 + j5) / j;
                long j6 = h;
                long jRound = Math.round(d * j6);
                builderO.p();
                CpuMetricReading.N((CpuMetricReading) builderO.e, jRound);
                long jRound2 = Math.round(((j2 + j3) / j) * j6);
                builderO.p();
                CpuMetricReading.M((CpuMetricReading) builderO.e, jRound2);
                CpuMetricReading cpuMetricReading = (CpuMetricReading) builderO.m();
                bufferedReader.close();
                return cpuMetricReading;
            } finally {
            }
        } catch (IOException e) {
            androidLogger.g("Unable to read 'proc/[pid]/stat' file: " + e.getMessage());
            return null;
        } catch (ArrayIndexOutOfBoundsException e2) {
            e = e2;
            androidLogger.g("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NullPointerException e3) {
            e = e3;
            androidLogger.g("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NumberFormatException e4) {
            e = e4;
            androidLogger.g("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        }
    }
}
