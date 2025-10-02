package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;

/* loaded from: classes6.dex */
public final class Timestamp extends GeneratedMessageLite<Timestamp, Builder> implements TimestampOrBuilder {
    private static final Timestamp DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile Parser<Timestamp> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    /* renamed from: com.google.protobuf.Timestamp$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16087a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16087a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16087a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16087a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16087a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16087a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16087a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16087a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Timestamp, Builder> implements TimestampOrBuilder {
    }

    static {
        Timestamp timestamp = new Timestamp();
        DEFAULT_INSTANCE = timestamp;
        GeneratedMessageLite.J(Timestamp.class, timestamp);
    }

    public static void L(Timestamp timestamp, long j) {
        timestamp.seconds_ = j;
    }

    public static void M(Timestamp timestamp, int i) {
        timestamp.nanos_ = i;
    }

    public static Timestamp N() {
        return DEFAULT_INSTANCE;
    }

    public static Builder Q() {
        return (Builder) DEFAULT_INSTANCE.r();
    }

    public final int O() {
        return this.nanos_;
    }

    public final long P() {
        return this.seconds_;
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
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 3:
                return new Timestamp();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<Timestamp> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Timestamp.class) {
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
