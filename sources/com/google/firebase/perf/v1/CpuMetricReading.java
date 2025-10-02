package com.google.firebase.perf.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class CpuMetricReading extends GeneratedMessageLite<CpuMetricReading, Builder> implements CpuMetricReadingOrBuilder {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final CpuMetricReading DEFAULT_INSTANCE;
    private static volatile Parser<CpuMetricReading> PARSER = null;
    public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
    public static final int USER_TIME_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private long systemTimeUs_;
    private long userTimeUs_;

    /* renamed from: com.google.firebase.perf.v1.CpuMetricReading$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15733a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15733a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15733a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15733a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15733a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15733a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15733a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15733a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<CpuMetricReading, Builder> implements CpuMetricReadingOrBuilder {
    }

    static {
        CpuMetricReading cpuMetricReading = new CpuMetricReading();
        DEFAULT_INSTANCE = cpuMetricReading;
        GeneratedMessageLite.J(CpuMetricReading.class, cpuMetricReading);
    }

    public static void L(CpuMetricReading cpuMetricReading, long j) {
        cpuMetricReading.bitField0_ |= 1;
        cpuMetricReading.clientTimeUs_ = j;
    }

    public static void M(CpuMetricReading cpuMetricReading, long j) {
        cpuMetricReading.bitField0_ |= 2;
        cpuMetricReading.userTimeUs_ = j;
    }

    public static void N(CpuMetricReading cpuMetricReading, long j) {
        cpuMetricReading.bitField0_ |= 4;
        cpuMetricReading.systemTimeUs_ = j;
    }

    public static Builder O() {
        return (Builder) DEFAULT_INSTANCE.r();
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "clientTimeUs_", "userTimeUs_", "systemTimeUs_"});
            case 3:
                return new CpuMetricReading();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<CpuMetricReading> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (CpuMetricReading.class) {
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
