package com.google.firebase.perf.metrics;

import com.google.firebase.perf.FirebasePerformanceAttributable;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.validator.PerfMetricValidator;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class HttpMetric implements FirebasePerformanceAttributable {
    public static final AndroidLogger i = AndroidLogger.e();
    public final NetworkRequestMetricBuilder d;
    public final Timer e;
    public final boolean h;
    public boolean g = false;
    public final ConcurrentHashMap f = new ConcurrentHashMap();

    public HttpMetric(String str, String str2, TransportManager transportManager, Timer timer) {
        this.h = false;
        this.e = timer;
        NetworkRequestMetricBuilder networkRequestMetricBuilder = new NetworkRequestMetricBuilder(transportManager);
        networkRequestMetricBuilder.j(str);
        networkRequestMetricBuilder.c(str2);
        this.d = networkRequestMetricBuilder;
        networkRequestMetricBuilder.k = true;
        if (ConfigResolver.e().q()) {
            return;
        }
        i.f("HttpMetric feature is disabled. URL %s", str);
        this.h = true;
    }

    public final void a(String str, String str2) {
        boolean z;
        ConcurrentHashMap concurrentHashMap = this.f;
        AndroidLogger androidLogger = i;
        try {
            str = str.trim();
            str2 = str2.trim();
        } catch (Exception e) {
            androidLogger.d("Cannot set attribute '%s' with value '%s' (%s)", str, str2, e.getMessage());
            z = false;
        }
        if (this.g) {
            throw new IllegalArgumentException("HttpMetric has been logged already so unable to modify attributes");
        }
        if (!concurrentHashMap.containsKey(str) && concurrentHashMap.size() >= 5) {
            Locale locale = Locale.ENGLISH;
            throw new IllegalArgumentException("Exceeds max limit of number of attributes - 5");
        }
        PerfMetricValidator.c(str, str2);
        androidLogger.b("Setting attribute '%s' to %s on network request '%s'", str, str2, ((NetworkRequestMetric) this.d.g.e).j0());
        z = true;
        if (z) {
            concurrentHashMap.put(str, str2);
        }
    }

    public final void b() {
        if (this.h) {
            return;
        }
        long jA = this.e.a();
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.d;
        networkRequestMetricBuilder.i(jA);
        NetworkRequestMetric.Builder builder = networkRequestMetricBuilder.g;
        builder.p();
        NetworkRequestMetric.U((NetworkRequestMetric) builder.e).clear();
        builder.p();
        NetworkRequestMetric.U((NetworkRequestMetric) builder.e).putAll(this.f);
        networkRequestMetricBuilder.b();
        this.g = true;
    }
}
