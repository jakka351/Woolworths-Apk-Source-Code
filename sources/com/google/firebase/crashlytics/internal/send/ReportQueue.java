package com.google.firebase.crashlytics.internal.send;

import android.os.SystemClock;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.ForcedSender;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.common.Utils;
import com.google.firebase.crashlytics.internal.settings.Settings;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class ReportQueue {

    /* renamed from: a, reason: collision with root package name */
    public final double f15392a;
    public final double b;
    public final long c;
    public final long d;
    public final int e;
    public final ArrayBlockingQueue f;
    public final ThreadPoolExecutor g;
    public final Transport h;
    public final OnDemandCounter i;
    public int j;
    public long k;

    /* loaded from: classes6.dex */
    public final class ReportRunnable implements Runnable {
        public final CrashlyticsReportWithSessionId d;
        public final TaskCompletionSource e;

        public ReportRunnable(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, TaskCompletionSource taskCompletionSource) {
            this.d = crashlyticsReportWithSessionId;
            this.e = taskCompletionSource;
        }

        @Override // java.lang.Runnable
        public final void run() throws InterruptedException {
            TaskCompletionSource taskCompletionSource = this.e;
            ReportQueue reportQueue = ReportQueue.this;
            CrashlyticsReportWithSessionId crashlyticsReportWithSessionId = this.d;
            reportQueue.b(crashlyticsReportWithSessionId, taskCompletionSource);
            reportQueue.i.b.set(0);
            double dMin = Math.min(3600000.0d, Math.pow(reportQueue.b, reportQueue.a()) * (60000.0d / reportQueue.f15392a));
            Logger.f15258a.b("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dMin / 1000.0d)) + " s for report: " + crashlyticsReportWithSessionId.d(), null);
            try {
                Thread.sleep((long) dMin);
            } catch (InterruptedException unused) {
            }
        }
    }

    public ReportQueue(Transport transport, Settings settings, OnDemandCounter onDemandCounter) {
        double d = settings.d;
        double d2 = settings.e;
        this.f15392a = d;
        this.b = d2;
        this.c = settings.f * 1000;
        this.h = transport;
        this.i = onDemandCounter;
        this.d = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.e = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f = arrayBlockingQueue;
        this.g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.j = 0;
        this.k = 0L;
    }

    public final int a() {
        if (this.k == 0) {
            this.k = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.k) / this.c);
        int iMin = this.f.size() == this.e ? Math.min(100, this.j + iCurrentTimeMillis) : Math.max(0, this.j - iCurrentTimeMillis);
        if (this.j != iMin) {
            this.j = iMin;
            this.k = System.currentTimeMillis();
        }
        return iMin;
    }

    public final void b(final CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, final TaskCompletionSource taskCompletionSource) {
        Logger.f15258a.b("Sending report through Google DataTransport: " + crashlyticsReportWithSessionId.d(), null);
        final boolean z = SystemClock.elapsedRealtime() - this.d < 2000;
        this.h.a(Event.i(crashlyticsReportWithSessionId.b()), new TransportScheduleCallback() { // from class: com.google.firebase.crashlytics.internal.send.a
            @Override // com.google.android.datatransport.TransportScheduleCallback
            public final void g(Exception exc) throws Throwable {
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                if (exc != null) {
                    taskCompletionSource2.trySetException(exc);
                    return;
                }
                if (z) {
                    boolean z2 = true;
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    final ReportQueue reportQueue = this.d;
                    new Thread(new Runnable() { // from class: com.google.firebase.crashlytics.internal.send.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                ForcedSender.a(reportQueue.h);
                            } catch (Exception unused) {
                            }
                            countDownLatch.countDown();
                        }
                    }).start();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    ExecutorService executorService = Utils.f15282a;
                    boolean z3 = false;
                    try {
                        long nanos = timeUnit.toNanos(2L);
                        long jNanoTime = System.nanoTime() + nanos;
                        while (true) {
                            try {
                                try {
                                    countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                                    break;
                                } catch (Throwable th) {
                                    th = th;
                                    if (z2) {
                                        Thread.currentThread().interrupt();
                                    }
                                    throw th;
                                }
                            } catch (InterruptedException unused) {
                                nanos = jNanoTime - System.nanoTime();
                                z3 = true;
                            }
                        }
                        if (z3) {
                            Thread.currentThread().interrupt();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z2 = z3;
                    }
                }
                taskCompletionSource2.trySetResult(crashlyticsReportWithSessionId);
            }
        });
    }
}
