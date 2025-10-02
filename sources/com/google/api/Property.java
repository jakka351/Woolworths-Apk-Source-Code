package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class Property extends GeneratedMessageLite<Property, Builder> implements PropertyOrBuilder {
    private static final Property DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Property> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int type_;
    private String name_ = "";
    private String description_ = "";

    /* renamed from: com.google.api.Property$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14832a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14832a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14832a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14832a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14832a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14832a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14832a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14832a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Property, Builder> implements PropertyOrBuilder {
    }

    public enum PropertyType implements Internal.EnumLite {
        UNSPECIFIED(0),
        INT64(1),
        BOOL(2),
        STRING(3),
        DOUBLE(4),
        UNRECOGNIZED(-1);

        public final int d;

        /* renamed from: com.google.api.Property$PropertyType$1, reason: invalid class name */
        public class AnonymousClass1 implements Internal.EnumLiteMap<PropertyType> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite a(int i) {
                return PropertyType.a(i);
            }
        }

        public static final class PropertyTypeVerifier implements Internal.EnumVerifier {
            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean a(int i) {
                return PropertyType.a(i) != null;
            }
        }

        PropertyType(int i) {
            this.d = i;
        }

        public static PropertyType a(int i) {
            if (i == 0) {
                return UNSPECIFIED;
            }
            if (i == 1) {
                return INT64;
            }
            if (i == 2) {
                return BOOL;
            }
            if (i == 3) {
                return STRING;
            }
            if (i != 4) {
                return null;
            }
            return DOUBLE;
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
        Property property = new Property();
        DEFAULT_INSTANCE = property;
        GeneratedMessageLite.J(Property.class, property);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ", new Object[]{"name_", "type_", "description_"});
            case 3:
                return new Property();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<Property> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Property.class) {
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
