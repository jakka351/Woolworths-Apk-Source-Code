package com.google.firebase.firestore.proto;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes6.dex */
public final class NoDocument extends GeneratedMessageLite<NoDocument, Builder> implements NoDocumentOrBuilder {
    private static final NoDocument DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<NoDocument> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 2;
    private int bitField0_;
    private String name_ = "";
    private Timestamp readTime_;

    /* renamed from: com.google.firebase.firestore.proto.NoDocument$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15552a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15552a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15552a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15552a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15552a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15552a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15552a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15552a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<NoDocument, Builder> implements NoDocumentOrBuilder {
    }

    static {
        NoDocument noDocument = new NoDocument();
        DEFAULT_INSTANCE = noDocument;
        GeneratedMessageLite.J(NoDocument.class, noDocument);
    }

    public static void L(NoDocument noDocument, String str) {
        noDocument.getClass();
        str.getClass();
        noDocument.name_ = str;
    }

    public static void M(NoDocument noDocument, Timestamp timestamp) {
        noDocument.getClass();
        noDocument.readTime_ = timestamp;
        noDocument.bitField0_ |= 1;
    }

    public static NoDocument N() {
        return DEFAULT_INSTANCE;
    }

    public static Builder Q() {
        return (Builder) DEFAULT_INSTANCE.r();
    }

    public final String O() {
        return this.name_;
    }

    public final Timestamp P() {
        Timestamp timestamp = this.readTime_;
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "name_", "readTime_"});
            case 3:
                return new NoDocument();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<NoDocument> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (NoDocument.class) {
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
