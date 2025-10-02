package com.google.type;

import com.google.protobuf.FloatValue;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class Color extends GeneratedMessageLite<Color, Builder> implements ColorOrBuilder {
    public static final int ALPHA_FIELD_NUMBER = 4;
    public static final int BLUE_FIELD_NUMBER = 3;
    private static final Color DEFAULT_INSTANCE;
    public static final int GREEN_FIELD_NUMBER = 2;
    private static volatile Parser<Color> PARSER = null;
    public static final int RED_FIELD_NUMBER = 1;
    private FloatValue alpha_;
    private int bitField0_;
    private float blue_;
    private float green_;
    private float red_;

    /* renamed from: com.google.type.Color$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16115a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16115a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16115a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16115a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16115a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16115a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16115a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16115a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Color, Builder> implements ColorOrBuilder {
    }

    static {
        Color color = new Color();
        DEFAULT_INSTANCE = color;
        GeneratedMessageLite.J(Color.class, color);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0001\u0002\u0001\u0003\u0001\u0004ဉ\u0000", new Object[]{"bitField0_", "red_", "green_", "blue_", "alpha_"});
            case 3:
                return new Color();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<Color> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Color.class) {
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
