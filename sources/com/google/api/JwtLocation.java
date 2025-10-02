package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class JwtLocation extends GeneratedMessageLite<JwtLocation, Builder> implements JwtLocationOrBuilder {
    private static final JwtLocation DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile Parser<JwtLocation> PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int VALUE_PREFIX_FIELD_NUMBER = 3;
    private Object in_;
    private int inCase_ = 0;
    private String valuePrefix_ = "";

    /* renamed from: com.google.api.JwtLocation$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14814a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14814a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14814a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14814a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14814a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14814a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14814a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14814a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<JwtLocation, Builder> implements JwtLocationOrBuilder {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class InCase {
        public static final /* synthetic */ InCase[] d = {new InCase("HEADER", 0), new InCase("QUERY", 1), new InCase("IN_NOT_SET", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        InCase EF5;

        public static InCase valueOf(String str) {
            return (InCase) Enum.valueOf(InCase.class, str);
        }

        public static InCase[] values() {
            return (InCase[]) d.clone();
        }
    }

    static {
        JwtLocation jwtLocation = new JwtLocation();
        DEFAULT_INSTANCE = jwtLocation;
        GeneratedMessageLite.J(JwtLocation.class, jwtLocation);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000\u0003Ȉ", new Object[]{"in_", "inCase_", "valuePrefix_"});
            case 3:
                return new JwtLocation();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<JwtLocation> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (JwtLocation.class) {
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
