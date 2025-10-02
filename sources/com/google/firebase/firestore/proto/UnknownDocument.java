package com.google.firebase.firestore.proto;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes6.dex */
public final class UnknownDocument extends GeneratedMessageLite<UnknownDocument, Builder> implements UnknownDocumentOrBuilder {
    private static final UnknownDocument DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<UnknownDocument> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    private int bitField0_;
    private String name_ = "";
    private Timestamp version_;

    /* renamed from: com.google.firebase.firestore.proto.UnknownDocument$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15555a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15555a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15555a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15555a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15555a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15555a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15555a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15555a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<UnknownDocument, Builder> implements UnknownDocumentOrBuilder {
    }

    static {
        UnknownDocument unknownDocument = new UnknownDocument();
        DEFAULT_INSTANCE = unknownDocument;
        GeneratedMessageLite.J(UnknownDocument.class, unknownDocument);
    }

    public static void L(UnknownDocument unknownDocument, String str) {
        unknownDocument.getClass();
        str.getClass();
        unknownDocument.name_ = str;
    }

    public static void M(UnknownDocument unknownDocument, Timestamp timestamp) {
        unknownDocument.getClass();
        unknownDocument.version_ = timestamp;
        unknownDocument.bitField0_ |= 1;
    }

    public static UnknownDocument N() {
        return DEFAULT_INSTANCE;
    }

    public static Builder Q() {
        return (Builder) DEFAULT_INSTANCE.r();
    }

    public final String O() {
        return this.name_;
    }

    public final Timestamp P() {
        Timestamp timestamp = this.version_;
        return timestamp == null ? Timestamp.N() : timestamp;
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "name_", "version_"});
            case 3:
                return new UnknownDocument();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<UnknownDocument> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (UnknownDocument.class) {
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
