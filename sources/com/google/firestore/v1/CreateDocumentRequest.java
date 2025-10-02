package com.google.firestore.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class CreateDocumentRequest extends GeneratedMessageLite<CreateDocumentRequest, Builder> implements CreateDocumentRequestOrBuilder {
    public static final int COLLECTION_ID_FIELD_NUMBER = 2;
    private static final CreateDocumentRequest DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 4;
    public static final int DOCUMENT_ID_FIELD_NUMBER = 3;
    public static final int MASK_FIELD_NUMBER = 5;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile Parser<CreateDocumentRequest> PARSER;
    private int bitField0_;
    private Document document_;
    private DocumentMask mask_;
    private String parent_ = "";
    private String collectionId_ = "";
    private String documentId_ = "";

    /* renamed from: com.google.firestore.v1.CreateDocumentRequest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15867a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15867a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15867a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15867a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15867a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15867a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15867a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15867a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<CreateDocumentRequest, Builder> implements CreateDocumentRequestOrBuilder {
    }

    static {
        CreateDocumentRequest createDocumentRequest = new CreateDocumentRequest();
        DEFAULT_INSTANCE = createDocumentRequest;
        GeneratedMessageLite.J(CreateDocumentRequest.class, createDocumentRequest);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000\u0005ဉ\u0001", new Object[]{"bitField0_", "parent_", "collectionId_", "documentId_", "document_", "mask_"});
            case 3:
                return new CreateDocumentRequest();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<CreateDocumentRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (CreateDocumentRequest.class) {
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
