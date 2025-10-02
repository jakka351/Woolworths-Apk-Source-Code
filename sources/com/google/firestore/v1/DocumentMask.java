package com.google.firestore.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class DocumentMask extends GeneratedMessageLite<DocumentMask, Builder> implements DocumentMaskOrBuilder {
    private static final DocumentMask DEFAULT_INSTANCE;
    public static final int FIELD_PATHS_FIELD_NUMBER = 1;
    private static volatile Parser<DocumentMask> PARSER;
    private Internal.ProtobufList<String> fieldPaths_ = GeneratedMessageLite.w();

    /* renamed from: com.google.firestore.v1.DocumentMask$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15874a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15874a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15874a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15874a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15874a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15874a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15874a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15874a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<DocumentMask, Builder> implements DocumentMaskOrBuilder {
    }

    static {
        DocumentMask documentMask = new DocumentMask();
        DEFAULT_INSTANCE = documentMask;
        GeneratedMessageLite.J(DocumentMask.class, documentMask);
    }

    public static void L(DocumentMask documentMask, String str) {
        documentMask.getClass();
        str.getClass();
        Internal.ProtobufList<String> protobufList = documentMask.fieldPaths_;
        if (!protobufList.r()) {
            documentMask.fieldPaths_ = GeneratedMessageLite.C(protobufList);
        }
        documentMask.fieldPaths_.add(str);
    }

    public static DocumentMask M() {
        return DEFAULT_INSTANCE;
    }

    public static Builder P() {
        return (Builder) DEFAULT_INSTANCE.r();
    }

    public final String N(int i) {
        return this.fieldPaths_.get(i);
    }

    public final int O() {
        return this.fieldPaths_.size();
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"fieldPaths_"});
            case 3:
                return new DocumentMask();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<DocumentMask> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (DocumentMask.class) {
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
