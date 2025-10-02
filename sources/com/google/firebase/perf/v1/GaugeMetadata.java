package com.google.firebase.perf.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class GaugeMetadata extends GeneratedMessageLite<GaugeMetadata, Builder> implements GaugeMetadataOrBuilder {
    public static final int CPU_CLOCK_RATE_KHZ_FIELD_NUMBER = 2;
    public static final int CPU_PROCESSOR_COUNT_FIELD_NUMBER = 6;
    private static final GaugeMetadata DEFAULT_INSTANCE;
    public static final int DEVICE_RAM_SIZE_KB_FIELD_NUMBER = 3;
    public static final int MAX_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 4;
    public static final int MAX_ENCOURAGED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 5;
    private static volatile Parser<GaugeMetadata> PARSER = null;
    public static final int PROCESS_NAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private int cpuClockRateKhz_;
    private int cpuProcessorCount_;
    private int deviceRamSizeKb_;
    private int maxAppJavaHeapMemoryKb_;
    private int maxEncouragedAppJavaHeapMemoryKb_;
    private String processName_ = "";

    /* renamed from: com.google.firebase.perf.v1.GaugeMetadata$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15734a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15734a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15734a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15734a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15734a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15734a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15734a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15734a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<GaugeMetadata, Builder> implements GaugeMetadataOrBuilder {
        public final void t(int i) {
            p();
            GaugeMetadata.N((GaugeMetadata) this.e, i);
        }

        public final void u(int i) {
            p();
            GaugeMetadata.L((GaugeMetadata) this.e, i);
        }

        public final void v(int i) {
            p();
            GaugeMetadata.M((GaugeMetadata) this.e, i);
        }
    }

    static {
        GaugeMetadata gaugeMetadata = new GaugeMetadata();
        DEFAULT_INSTANCE = gaugeMetadata;
        GeneratedMessageLite.J(GaugeMetadata.class, gaugeMetadata);
    }

    public static void L(GaugeMetadata gaugeMetadata, int i) {
        gaugeMetadata.bitField0_ |= 16;
        gaugeMetadata.maxAppJavaHeapMemoryKb_ = i;
    }

    public static void M(GaugeMetadata gaugeMetadata, int i) {
        gaugeMetadata.bitField0_ |= 32;
        gaugeMetadata.maxEncouragedAppJavaHeapMemoryKb_ = i;
    }

    public static void N(GaugeMetadata gaugeMetadata, int i) {
        gaugeMetadata.bitField0_ |= 8;
        gaugeMetadata.deviceRamSizeKb_ = i;
    }

    public static GaugeMetadata O() {
        return DEFAULT_INSTANCE;
    }

    public static Builder Q() {
        return (Builder) DEFAULT_INSTANCE.r();
    }

    public final boolean P() {
        return (this.bitField0_ & 16) != 0;
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006င\u0002", new Object[]{"bitField0_", "processName_", "cpuClockRateKhz_", "deviceRamSizeKb_", "maxAppJavaHeapMemoryKb_", "maxEncouragedAppJavaHeapMemoryKb_", "cpuProcessorCount_"});
            case 3:
                return new GaugeMetadata();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<GaugeMetadata> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (GaugeMetadata.class) {
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
