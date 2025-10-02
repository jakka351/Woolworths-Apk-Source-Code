package com.google.firebase.perf.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class AndroidMemoryReading extends GeneratedMessageLite<AndroidMemoryReading, Builder> implements AndroidMemoryReadingOrBuilder {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final AndroidMemoryReading DEFAULT_INSTANCE;
    private static volatile Parser<AndroidMemoryReading> PARSER = null;
    public static final int USED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private int usedAppJavaHeapMemoryKb_;

    /* renamed from: com.google.firebase.perf.v1.AndroidMemoryReading$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15729a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15729a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15729a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15729a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15729a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15729a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15729a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15729a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<AndroidMemoryReading, Builder> implements AndroidMemoryReadingOrBuilder {
    }

    static {
        AndroidMemoryReading androidMemoryReading = new AndroidMemoryReading();
        DEFAULT_INSTANCE = androidMemoryReading;
        GeneratedMessageLite.J(AndroidMemoryReading.class, androidMemoryReading);
    }

    public static void L(AndroidMemoryReading androidMemoryReading, long j) {
        androidMemoryReading.bitField0_ |= 1;
        androidMemoryReading.clientTimeUs_ = j;
    }

    public static void M(AndroidMemoryReading androidMemoryReading, int i) {
        androidMemoryReading.bitField0_ |= 2;
        androidMemoryReading.usedAppJavaHeapMemoryKb_ = i;
    }

    public static Builder N() {
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"bitField0_", "clientTimeUs_", "usedAppJavaHeapMemoryKb_"});
            case 3:
                return new AndroidMemoryReading();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<AndroidMemoryReading> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (AndroidMemoryReading.class) {
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
