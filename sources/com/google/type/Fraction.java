package com.google.type;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class Fraction extends GeneratedMessageLite<Fraction, Builder> implements FractionOrBuilder {
    private static final Fraction DEFAULT_INSTANCE;
    public static final int DENOMINATOR_FIELD_NUMBER = 2;
    public static final int NUMERATOR_FIELD_NUMBER = 1;
    private static volatile Parser<Fraction> PARSER;
    private long denominator_;
    private long numerator_;

    /* renamed from: com.google.type.Fraction$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16119a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16119a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16119a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16119a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16119a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16119a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16119a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16119a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Fraction, Builder> implements FractionOrBuilder {
    }

    static {
        Fraction fraction = new Fraction();
        DEFAULT_INSTANCE = fraction;
        GeneratedMessageLite.J(Fraction.class, fraction);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"numerator_", "denominator_"});
            case 3:
                return new Fraction();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<Fraction> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Fraction.class) {
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
