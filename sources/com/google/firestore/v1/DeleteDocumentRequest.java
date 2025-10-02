package com.google.firestore.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class DeleteDocumentRequest extends GeneratedMessageLite<DeleteDocumentRequest, Builder> implements DeleteDocumentRequestOrBuilder {
    public static final int CURRENT_DOCUMENT_FIELD_NUMBER = 2;
    private static final DeleteDocumentRequest DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<DeleteDocumentRequest> PARSER;
    private int bitField0_;
    private Precondition currentDocument_;
    private String name_ = "";

    /* renamed from: com.google.firestore.v1.DeleteDocumentRequest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15869a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15869a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15869a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15869a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15869a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15869a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15869a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15869a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<DeleteDocumentRequest, Builder> implements DeleteDocumentRequestOrBuilder {
    }

    static {
        DeleteDocumentRequest deleteDocumentRequest = new DeleteDocumentRequest();
        DEFAULT_INSTANCE = deleteDocumentRequest;
        GeneratedMessageLite.J(DeleteDocumentRequest.class, deleteDocumentRequest);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "name_", "currentDocument_"});
            case 3:
                return new DeleteDocumentRequest();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<DeleteDocumentRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (DeleteDocumentRequest.class) {
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
