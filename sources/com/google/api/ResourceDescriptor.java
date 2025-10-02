package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class ResourceDescriptor extends GeneratedMessageLite<ResourceDescriptor, Builder> implements ResourceDescriptorOrBuilder {
    private static final ResourceDescriptor DEFAULT_INSTANCE;
    public static final int HISTORY_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_FIELD_NUMBER = 3;
    private static volatile Parser<ResourceDescriptor> PARSER = null;
    public static final int PATTERN_FIELD_NUMBER = 2;
    public static final int PLURAL_FIELD_NUMBER = 5;
    public static final int SINGULAR_FIELD_NUMBER = 6;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int history_;
    private String type_ = "";
    private Internal.ProtobufList<String> pattern_ = GeneratedMessageLite.w();
    private String nameField_ = "";
    private String plural_ = "";
    private String singular_ = "";

    /* renamed from: com.google.api.ResourceDescriptor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14836a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14836a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14836a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14836a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14836a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14836a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14836a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14836a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ResourceDescriptor, Builder> implements ResourceDescriptorOrBuilder {
    }

    public enum History implements Internal.EnumLite {
        HISTORY_UNSPECIFIED(0),
        ORIGINALLY_SINGLE_PATTERN(1),
        FUTURE_MULTI_PATTERN(2),
        UNRECOGNIZED(-1);

        public final int d;

        /* renamed from: com.google.api.ResourceDescriptor$History$1, reason: invalid class name */
        public class AnonymousClass1 implements Internal.EnumLiteMap<History> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite a(int i) {
                if (i == 0) {
                    return History.HISTORY_UNSPECIFIED;
                }
                if (i == 1) {
                    return History.ORIGINALLY_SINGLE_PATTERN;
                }
                if (i != 2) {
                    return null;
                }
                return History.FUTURE_MULTI_PATTERN;
            }
        }

        public static final class HistoryVerifier implements Internal.EnumVerifier {
            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean a(int i) {
                return (i != 0 ? i != 1 ? i != 2 ? null : History.FUTURE_MULTI_PATTERN : History.ORIGINALLY_SINGLE_PATTERN : History.HISTORY_UNSPECIFIED) != null;
            }
        }

        History(int i2) {
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
        ResourceDescriptor resourceDescriptor = new ResourceDescriptor();
        DEFAULT_INSTANCE = resourceDescriptor;
        GeneratedMessageLite.J(ResourceDescriptor.class, resourceDescriptor);
    }

    public static ResourceDescriptor L() {
        return DEFAULT_INSTANCE;
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003Ȉ\u0004\f\u0005Ȉ\u0006Ȉ", new Object[]{"type_", "pattern_", "nameField_", "history_", "plural_", "singular_"});
            case 3:
                return new ResourceDescriptor();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<ResourceDescriptor> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ResourceDescriptor.class) {
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
