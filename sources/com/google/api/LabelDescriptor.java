package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class LabelDescriptor extends GeneratedMessageLite<LabelDescriptor, Builder> implements LabelDescriptorOrBuilder {
    private static final LabelDescriptor DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int KEY_FIELD_NUMBER = 1;
    private static volatile Parser<LabelDescriptor> PARSER = null;
    public static final int VALUE_TYPE_FIELD_NUMBER = 2;
    private int valueType_;
    private String key_ = "";
    private String description_ = "";

    /* renamed from: com.google.api.LabelDescriptor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14815a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14815a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14815a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14815a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14815a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14815a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14815a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14815a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<LabelDescriptor, Builder> implements LabelDescriptorOrBuilder {
    }

    public enum ValueType implements Internal.EnumLite {
        STRING(0),
        BOOL(1),
        INT64(2),
        UNRECOGNIZED(-1);

        public final int d;

        /* renamed from: com.google.api.LabelDescriptor$ValueType$1, reason: invalid class name */
        public class AnonymousClass1 implements Internal.EnumLiteMap<ValueType> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite a(int i) {
                if (i == 0) {
                    return ValueType.STRING;
                }
                if (i == 1) {
                    return ValueType.BOOL;
                }
                if (i != 2) {
                    return null;
                }
                return ValueType.INT64;
            }
        }

        public static final class ValueTypeVerifier implements Internal.EnumVerifier {
            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean a(int i) {
                return (i != 0 ? i != 1 ? i != 2 ? null : ValueType.INT64 : ValueType.BOOL : ValueType.STRING) != null;
            }
        }

        ValueType(int i2) {
            this.d = i2;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int g() {
            if (this != UNRECOGNIZED) {
                return this.d;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        LabelDescriptor labelDescriptor = new LabelDescriptor();
        DEFAULT_INSTANCE = labelDescriptor;
        GeneratedMessageLite.J(LabelDescriptor.class, labelDescriptor);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ", new Object[]{"key_", "valueType_", "description_"});
            case 3:
                return new LabelDescriptor();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<LabelDescriptor> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (LabelDescriptor.class) {
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
