package com.google.firestore.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class UpdateDocumentRequest extends GeneratedMessageLite<UpdateDocumentRequest, Builder> implements UpdateDocumentRequestOrBuilder {
    public static final int CURRENT_DOCUMENT_FIELD_NUMBER = 4;
    private static final UpdateDocumentRequest DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    public static final int MASK_FIELD_NUMBER = 3;
    private static volatile Parser<UpdateDocumentRequest> PARSER = null;
    public static final int UPDATE_MASK_FIELD_NUMBER = 2;
    private int bitField0_;
    private Precondition currentDocument_;
    private Document document_;
    private DocumentMask mask_;
    private DocumentMask updateMask_;

    /* renamed from: com.google.firestore.v1.UpdateDocumentRequest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15900a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15900a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15900a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15900a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15900a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15900a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15900a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15900a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<UpdateDocumentRequest, Builder> implements UpdateDocumentRequestOrBuilder {
    }

    static {
        UpdateDocumentRequest updateDocumentRequest = new UpdateDocumentRequest();
        DEFAULT_INSTANCE = updateDocumentRequest;
        GeneratedMessageLite.J(UpdateDocumentRequest.class, updateDocumentRequest);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "document_", "updateMask_", "mask_", "currentDocument_"});
            case 3:
                return new UpdateDocumentRequest();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<UpdateDocumentRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (UpdateDocumentRequest.class) {
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
