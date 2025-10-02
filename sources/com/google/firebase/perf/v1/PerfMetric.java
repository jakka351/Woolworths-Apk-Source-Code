package com.google.firebase.perf.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class PerfMetric extends GeneratedMessageLite<PerfMetric, Builder> implements PerfMetricOrBuilder {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final PerfMetric DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile Parser<PerfMetric> PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private ApplicationInfo applicationInfo_;
    private int bitField0_;
    private GaugeMetric gaugeMetric_;
    private NetworkRequestMetric networkRequestMetric_;
    private TraceMetric traceMetric_;
    private TransportInfo transportInfo_;

    /* renamed from: com.google.firebase.perf.v1.PerfMetric$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15743a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15743a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15743a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15743a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15743a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15743a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15743a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15743a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<PerfMetric, Builder> implements PerfMetricOrBuilder {
        @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
        public final NetworkRequestMetric b() {
            return ((PerfMetric) this.e).b();
        }

        @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
        public final GaugeMetric d() {
            return ((PerfMetric) this.e).d();
        }

        @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
        public final boolean e() {
            return ((PerfMetric) this.e).e();
        }

        @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
        public final boolean f() {
            return ((PerfMetric) this.e).f();
        }

        @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
        public final boolean g() {
            return ((PerfMetric) this.e).g();
        }

        @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
        public final TraceMetric h() {
            return ((PerfMetric) this.e).h();
        }
    }

    static {
        PerfMetric perfMetric = new PerfMetric();
        DEFAULT_INSTANCE = perfMetric;
        GeneratedMessageLite.J(PerfMetric.class, perfMetric);
    }

    public static void L(PerfMetric perfMetric, ApplicationInfo applicationInfo) {
        perfMetric.getClass();
        perfMetric.applicationInfo_ = applicationInfo;
        perfMetric.bitField0_ |= 1;
    }

    public static void M(PerfMetric perfMetric, GaugeMetric gaugeMetric) {
        perfMetric.getClass();
        perfMetric.gaugeMetric_ = gaugeMetric;
        perfMetric.bitField0_ |= 8;
    }

    public static void N(PerfMetric perfMetric, TraceMetric traceMetric) {
        perfMetric.getClass();
        perfMetric.traceMetric_ = traceMetric;
        perfMetric.bitField0_ |= 2;
    }

    public static void O(PerfMetric perfMetric, NetworkRequestMetric networkRequestMetric) {
        perfMetric.getClass();
        perfMetric.networkRequestMetric_ = networkRequestMetric;
        perfMetric.bitField0_ |= 4;
    }

    public static Builder R() {
        return (Builder) DEFAULT_INSTANCE.r();
    }

    public final ApplicationInfo P() {
        ApplicationInfo applicationInfo = this.applicationInfo_;
        return applicationInfo == null ? ApplicationInfo.R() : applicationInfo;
    }

    public final boolean Q() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
    public final NetworkRequestMetric b() {
        NetworkRequestMetric networkRequestMetric = this.networkRequestMetric_;
        return networkRequestMetric == null ? NetworkRequestMetric.a0() : networkRequestMetric;
    }

    @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
    public final GaugeMetric d() {
        GaugeMetric gaugeMetric = this.gaugeMetric_;
        return gaugeMetric == null ? GaugeMetric.S() : gaugeMetric;
    }

    @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
    public final boolean e() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
    public final boolean f() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
    public final boolean g() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
    public final TraceMetric h() {
        TraceMetric traceMetric = this.traceMetric_;
        return traceMetric == null ? TraceMetric.Y() : traceMetric;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
        Parser defaultInstanceBasedParser;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 3:
                return new PerfMetric();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<PerfMetric> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (PerfMetric.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return defaultInstanceBasedParser;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
