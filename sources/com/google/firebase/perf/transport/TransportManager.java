package com.google.firebase.perf.transport;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.v1.ApplicationInfo;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.GaugeMetric;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import com.google.firebase.perf.v1.PerfMetric;
import com.google.firebase.perf.v1.PerfMetricOrBuilder;
import com.google.firebase.perf.v1.TraceMetric;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class TransportManager implements AppStateMonitor.AppStateCallback {
    public static final AndroidLogger u = AndroidLogger.e();
    public static final TransportManager v = new TransportManager();
    public final ConcurrentHashMap d;
    public FirebaseApp g;
    public FirebasePerformance h;
    public FirebaseInstallationsApi i;
    public Provider j;
    public FlgTransport k;
    public Context m;
    public ConfigResolver n;
    public RateLimiter o;
    public AppStateMonitor p;
    public ApplicationInfo.Builder q;
    public String r;
    public String s;
    public final ConcurrentLinkedQueue e = new ConcurrentLinkedQueue();
    public final AtomicBoolean f = new AtomicBoolean(false);
    public boolean t = false;
    public final ThreadPoolExecutor l = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public TransportManager() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.d = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    public static String a(PerfMetricOrBuilder perfMetricOrBuilder) {
        if (perfMetricOrBuilder.g()) {
            TraceMetric traceMetricH = perfMetricOrBuilder.h();
            long jZ = traceMetricH.Z();
            Locale locale = Locale.ENGLISH;
            return YU.a.j("trace metric: ", traceMetricH.a0(), " (duration: ", new DecimalFormat("#.####").format(jZ / 1000.0d), "ms)");
        }
        if (perfMetricOrBuilder.f()) {
            NetworkRequestMetric networkRequestMetricB = perfMetricOrBuilder.b();
            long jH0 = networkRequestMetricB.q0() ? networkRequestMetricB.h0() : 0L;
            String strValueOf = networkRequestMetricB.m0() ? String.valueOf(networkRequestMetricB.c0()) : "UNKNOWN";
            Locale locale2 = Locale.ENGLISH;
            return YU.a.o(YU.a.v("network request trace: ", networkRequestMetricB.j0(), " (responseCode: ", strValueOf, ", responseTime: "), new DecimalFormat("#.####").format(jH0 / 1000.0d), "ms)");
        }
        if (!perfMetricOrBuilder.e()) {
            return "log";
        }
        GaugeMetric gaugeMetricD = perfMetricOrBuilder.d();
        Locale locale3 = Locale.ENGLISH;
        boolean zU = gaugeMetricD.U();
        int iR = gaugeMetricD.R();
        int iQ = gaugeMetricD.Q();
        StringBuilder sb = new StringBuilder("gauges (hasMetadata: ");
        sb.append(zU);
        sb.append(", cpuGaugeCount: ");
        sb.append(iR);
        sb.append(", memoryGaugeCount: ");
        return YU.a.m(sb, iQ, ")");
    }

    public final void b(PerfMetric perfMetric) {
        if (perfMetric.g()) {
            this.p.b("_fstec");
        } else if (perfMetric.f()) {
            this.p.b("_fsntc");
        }
    }

    public final void c(TraceMetric traceMetric, ApplicationProcessState applicationProcessState) {
        this.l.execute(new androidx.work.impl.b(5, this, traceMetric, applicationProcessState));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:209:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(com.google.firebase.perf.v1.PerfMetric.Builder r13, com.google.firebase.perf.v1.ApplicationProcessState r14) {
        /*
            Method dump skipped, instructions count: 1259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.transport.TransportManager.d(com.google.firebase.perf.v1.PerfMetric$Builder, com.google.firebase.perf.v1.ApplicationProcessState):void");
    }

    @Override // com.google.firebase.perf.application.AppStateMonitor.AppStateCallback
    public final void onUpdateAppState(ApplicationProcessState applicationProcessState) {
        this.t = applicationProcessState == ApplicationProcessState.FOREGROUND;
        if (this.f.get()) {
            this.l.execute(new a(this, 0));
        }
    }
}
