package com.google.firebase.perf.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class GaugeMetric extends GeneratedMessageLite<GaugeMetric, Builder> implements GaugeMetricOrBuilder {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final GaugeMetric DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile Parser<GaugeMetric> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private GaugeMetadata gaugeMetadata_;
    private String sessionId_ = "";
    private Internal.ProtobufList<CpuMetricReading> cpuMetricReadings_ = GeneratedMessageLite.w();
    private Internal.ProtobufList<AndroidMemoryReading> androidMemoryReadings_ = GeneratedMessageLite.w();

    /* renamed from: com.google.firebase.perf.v1.GaugeMetric$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15735a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15735a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15735a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15735a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15735a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15735a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15735a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15735a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<GaugeMetric, Builder> implements GaugeMetricOrBuilder {
        public Builder() {
            super(GaugeMetric.DEFAULT_INSTANCE);
        }

        public final void t(AndroidMemoryReading androidMemoryReading) {
            p();
            GaugeMetric.N((GaugeMetric) this.e, androidMemoryReading);
        }

        public final void u(CpuMetricReading cpuMetricReading) {
            p();
            GaugeMetric.P((GaugeMetric) this.e, cpuMetricReading);
        }

        public final void v(GaugeMetadata gaugeMetadata) {
            p();
            GaugeMetric.O((GaugeMetric) this.e, gaugeMetadata);
        }

        public final void w(String str) {
            p();
            GaugeMetric.M((GaugeMetric) this.e, str);
        }
    }

    static {
        GaugeMetric gaugeMetric = new GaugeMetric();
        DEFAULT_INSTANCE = gaugeMetric;
        GeneratedMessageLite.J(GaugeMetric.class, gaugeMetric);
    }

    public static void M(GaugeMetric gaugeMetric, String str) {
        gaugeMetric.getClass();
        str.getClass();
        gaugeMetric.bitField0_ |= 1;
        gaugeMetric.sessionId_ = str;
    }

    public static void N(GaugeMetric gaugeMetric, AndroidMemoryReading androidMemoryReading) {
        gaugeMetric.getClass();
        androidMemoryReading.getClass();
        Internal.ProtobufList<AndroidMemoryReading> protobufList = gaugeMetric.androidMemoryReadings_;
        if (!protobufList.r()) {
            gaugeMetric.androidMemoryReadings_ = GeneratedMessageLite.C(protobufList);
        }
        gaugeMetric.androidMemoryReadings_.add(androidMemoryReading);
    }

    public static void O(GaugeMetric gaugeMetric, GaugeMetadata gaugeMetadata) {
        gaugeMetric.getClass();
        gaugeMetadata.getClass();
        gaugeMetric.gaugeMetadata_ = gaugeMetadata;
        gaugeMetric.bitField0_ |= 2;
    }

    public static void P(GaugeMetric gaugeMetric, CpuMetricReading cpuMetricReading) {
        gaugeMetric.getClass();
        cpuMetricReading.getClass();
        Internal.ProtobufList<CpuMetricReading> protobufList = gaugeMetric.cpuMetricReadings_;
        if (!protobufList.r()) {
            gaugeMetric.cpuMetricReadings_ = GeneratedMessageLite.C(protobufList);
        }
        gaugeMetric.cpuMetricReadings_.add(cpuMetricReading);
    }

    public static GaugeMetric S() {
        return DEFAULT_INSTANCE;
    }

    public static Builder W() {
        return (Builder) DEFAULT_INSTANCE.r();
    }

    public final int Q() {
        return this.androidMemoryReadings_.size();
    }

    public final int R() {
        return this.cpuMetricReadings_.size();
    }

    public final GaugeMetadata T() {
        GaugeMetadata gaugeMetadata = this.gaugeMetadata_;
        return gaugeMetadata == null ? GaugeMetadata.O() : gaugeMetadata;
    }

    public final boolean U() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean V() {
        return (this.bitField0_ & 1) != 0;
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", CpuMetricReading.class, "gaugeMetadata_", "androidMemoryReadings_", AndroidMemoryReading.class});
            case 3:
                return new GaugeMetric();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<GaugeMetric> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (GaugeMetric.class) {
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
