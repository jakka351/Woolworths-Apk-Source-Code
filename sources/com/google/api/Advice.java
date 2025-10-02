package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class Advice extends GeneratedMessageLite<Advice, Builder> implements AdviceOrBuilder {
    private static final Advice DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    private static volatile Parser<Advice> PARSER;
    private String description_ = "";

    /* renamed from: com.google.api.Advice$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14794a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14794a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14794a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14794a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14794a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14794a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14794a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14794a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Advice, Builder> implements AdviceOrBuilder {
    }

    static {
        Advice advice = new Advice();
        DEFAULT_INSTANCE = advice;
        GeneratedMessageLite.J(Advice.class, advice);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"description_"});
            case 3:
                return new Advice();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<Advice> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Advice.class) {
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
