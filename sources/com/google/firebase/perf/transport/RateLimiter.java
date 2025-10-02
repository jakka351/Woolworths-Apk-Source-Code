package com.google.firebase.perf.transport;

import android.content.Context;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.config.ConfigurationConstants;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Optional;
import com.google.firebase.perf.util.Rate;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.Utils;
import com.google.firebase.perf.v1.PerfSession;
import com.google.firebase.perf.v1.SessionVerbosity;
import com.google.protobuf.Internal;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class RateLimiter {

    /* renamed from: a, reason: collision with root package name */
    public final ConfigResolver f15718a;
    public final double b;
    public final double c;
    public final RateLimiterImpl d;
    public final RateLimiterImpl e;

    public static class RateLimiterImpl {
        public static final long i;
        public Rate b;
        public final Rate e;
        public final Rate f;
        public final long g;
        public final long h;
        public long c = 500;
        public double d = 500;

        /* renamed from: a, reason: collision with root package name */
        public Timer f15719a = new Timer();

        static {
            AndroidLogger.e();
            i = TimeUnit.SECONDS.toMicros(1L);
        }

        public RateLimiterImpl(Rate rate, Clock clock, ConfigResolver configResolver, String str) {
            ConfigurationConstants.NetworkEventCountForeground networkEventCountForeground;
            long jLongValue;
            ConfigurationConstants.NetworkEventCountBackground networkEventCountBackground;
            long jLongValue2;
            ConfigurationConstants.TraceEventCountBackground traceEventCountBackground;
            ConfigurationConstants.TraceEventCountForeground traceEventCountForeground;
            this.b = rate;
            long jK = str == "Trace" ? configResolver.k() : configResolver.k();
            if (str == "Trace") {
                synchronized (ConfigurationConstants.TraceEventCountForeground.class) {
                    try {
                        if (ConfigurationConstants.TraceEventCountForeground.f15689a == null) {
                            ConfigurationConstants.TraceEventCountForeground.f15689a = new ConfigurationConstants.TraceEventCountForeground();
                        }
                        traceEventCountForeground = ConfigurationConstants.TraceEventCountForeground.f15689a;
                    } finally {
                    }
                }
                Optional optionalM = configResolver.m(traceEventCountForeground);
                if (optionalM.b() && ConfigResolver.n(((Long) optionalM.a()).longValue())) {
                    configResolver.c.e(((Long) optionalM.a()).longValue(), "com.google.firebase.perf.TraceEventCountForeground");
                    jLongValue = ((Long) optionalM.a()).longValue();
                } else {
                    Optional optionalC = configResolver.c(traceEventCountForeground);
                    jLongValue = (optionalC.b() && ConfigResolver.n(((Long) optionalC.a()).longValue())) ? ((Long) optionalC.a()).longValue() : 300L;
                }
            } else {
                synchronized (ConfigurationConstants.NetworkEventCountForeground.class) {
                    try {
                        if (ConfigurationConstants.NetworkEventCountForeground.f15677a == null) {
                            ConfigurationConstants.NetworkEventCountForeground.f15677a = new ConfigurationConstants.NetworkEventCountForeground();
                        }
                        networkEventCountForeground = ConfigurationConstants.NetworkEventCountForeground.f15677a;
                    } finally {
                    }
                }
                Optional optionalM2 = configResolver.m(networkEventCountForeground);
                if (optionalM2.b() && ConfigResolver.n(((Long) optionalM2.a()).longValue())) {
                    configResolver.c.e(((Long) optionalM2.a()).longValue(), "com.google.firebase.perf.NetworkEventCountForeground");
                    jLongValue = ((Long) optionalM2.a()).longValue();
                } else {
                    Optional optionalC2 = configResolver.c(networkEventCountForeground);
                    jLongValue = (optionalC2.b() && ConfigResolver.n(((Long) optionalC2.a()).longValue())) ? ((Long) optionalC2.a()).longValue() : 700L;
                }
            }
            long j = jLongValue;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.e = new Rate(j, jK, timeUnit);
            this.g = j;
            long jK2 = str == "Trace" ? configResolver.k() : configResolver.k();
            if (str == "Trace") {
                synchronized (ConfigurationConstants.TraceEventCountBackground.class) {
                    try {
                        if (ConfigurationConstants.TraceEventCountBackground.f15688a == null) {
                            ConfigurationConstants.TraceEventCountBackground.f15688a = new ConfigurationConstants.TraceEventCountBackground();
                        }
                        traceEventCountBackground = ConfigurationConstants.TraceEventCountBackground.f15688a;
                    } finally {
                    }
                }
                Optional optionalM3 = configResolver.m(traceEventCountBackground);
                if (optionalM3.b() && ConfigResolver.n(((Long) optionalM3.a()).longValue())) {
                    configResolver.c.e(((Long) optionalM3.a()).longValue(), "com.google.firebase.perf.TraceEventCountBackground");
                    jLongValue2 = ((Long) optionalM3.a()).longValue();
                } else {
                    Optional optionalC3 = configResolver.c(traceEventCountBackground);
                    jLongValue2 = (optionalC3.b() && ConfigResolver.n(((Long) optionalC3.a()).longValue())) ? ((Long) optionalC3.a()).longValue() : 30L;
                }
            } else {
                synchronized (ConfigurationConstants.NetworkEventCountBackground.class) {
                    try {
                        if (ConfigurationConstants.NetworkEventCountBackground.f15676a == null) {
                            ConfigurationConstants.NetworkEventCountBackground.f15676a = new ConfigurationConstants.NetworkEventCountBackground();
                        }
                        networkEventCountBackground = ConfigurationConstants.NetworkEventCountBackground.f15676a;
                    } finally {
                    }
                }
                Optional optionalM4 = configResolver.m(networkEventCountBackground);
                if (optionalM4.b() && ConfigResolver.n(((Long) optionalM4.a()).longValue())) {
                    configResolver.c.e(((Long) optionalM4.a()).longValue(), "com.google.firebase.perf.NetworkEventCountBackground");
                    jLongValue2 = ((Long) optionalM4.a()).longValue();
                } else {
                    Optional optionalC4 = configResolver.c(networkEventCountBackground);
                    jLongValue2 = (optionalC4.b() && ConfigResolver.n(((Long) optionalC4.a()).longValue())) ? ((Long) optionalC4.a()).longValue() : 70L;
                }
            }
            long j2 = jLongValue2;
            this.f = new Rate(j2, jK2, timeUnit);
            this.h = j2;
        }

        public final synchronized void a(boolean z) {
            try {
                this.b = z ? this.e : this.f;
                this.c = z ? this.g : this.h;
            } catch (Throwable th) {
                throw th;
            }
        }

        public final synchronized boolean b() {
            try {
                Timer timer = new Timer();
                this.f15719a.getClass();
                double dA = ((timer.e - r1.e) * this.b.a()) / i;
                if (dA > 0.0d) {
                    this.d = Math.min(this.d + dA, this.c);
                    this.f15719a = timer;
                }
                double d = this.d;
                if (d < 1.0d) {
                    return false;
                }
                this.d = d - 1.0d;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public RateLimiter(Context context, Rate rate) {
        Clock clock = new Clock();
        double dNextDouble = new Random().nextDouble();
        double dNextDouble2 = new Random().nextDouble();
        ConfigResolver configResolverE = ConfigResolver.e();
        this.d = null;
        this.e = null;
        boolean z = false;
        if (!(0.0d <= dNextDouble && dNextDouble < 1.0d)) {
            throw new IllegalArgumentException("Sampling bucket ID should be in range [0.0, 1.0).");
        }
        if (0.0d <= dNextDouble2 && dNextDouble2 < 1.0d) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException("Fragment sampling bucket ID should be in range [0.0, 1.0).");
        }
        this.b = dNextDouble;
        this.c = dNextDouble2;
        this.f15718a = configResolverE;
        this.d = new RateLimiterImpl(rate, clock, configResolverE, "Trace");
        this.e = new RateLimiterImpl(rate, clock, configResolverE, "Network");
        Utils.a(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(Internal.ProtobufList protobufList) {
        return protobufList.size() > 0 && ((PerfSession) protobufList.get(0)).O() > 0 && ((PerfSession) protobufList.get(0)).N() == SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS;
    }
}
