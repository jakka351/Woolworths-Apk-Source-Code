package com.google.firebase.firestore.proto;

import com.google.firestore.v1.Document;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class MaybeDocument extends GeneratedMessageLite<MaybeDocument, Builder> implements MaybeDocumentOrBuilder {
    private static final MaybeDocument DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 2;
    public static final int HAS_COMMITTED_MUTATIONS_FIELD_NUMBER = 4;
    public static final int NO_DOCUMENT_FIELD_NUMBER = 1;
    private static volatile Parser<MaybeDocument> PARSER = null;
    public static final int UNKNOWN_DOCUMENT_FIELD_NUMBER = 3;
    private int documentTypeCase_ = 0;
    private Object documentType_;
    private boolean hasCommittedMutations_;

    /* renamed from: com.google.firebase.firestore.proto.MaybeDocument$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15550a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15550a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15550a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15550a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15550a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15550a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15550a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15550a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<MaybeDocument, Builder> implements MaybeDocumentOrBuilder {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DocumentTypeCase {
        public static final DocumentTypeCase d;
        public static final DocumentTypeCase e;
        public static final DocumentTypeCase f;
        public static final DocumentTypeCase g;
        public static final /* synthetic */ DocumentTypeCase[] h;

        static {
            DocumentTypeCase documentTypeCase = new DocumentTypeCase("NO_DOCUMENT", 0);
            d = documentTypeCase;
            DocumentTypeCase documentTypeCase2 = new DocumentTypeCase("DOCUMENT", 1);
            e = documentTypeCase2;
            DocumentTypeCase documentTypeCase3 = new DocumentTypeCase("UNKNOWN_DOCUMENT", 2);
            f = documentTypeCase3;
            DocumentTypeCase documentTypeCase4 = new DocumentTypeCase("DOCUMENTTYPE_NOT_SET", 3);
            g = documentTypeCase4;
            h = new DocumentTypeCase[]{documentTypeCase, documentTypeCase2, documentTypeCase3, documentTypeCase4};
        }

        public static DocumentTypeCase valueOf(String str) {
            return (DocumentTypeCase) Enum.valueOf(DocumentTypeCase.class, str);
        }

        public static DocumentTypeCase[] values() {
            return (DocumentTypeCase[]) h.clone();
        }
    }

    static {
        MaybeDocument maybeDocument = new MaybeDocument();
        DEFAULT_INSTANCE = maybeDocument;
        GeneratedMessageLite.J(MaybeDocument.class, maybeDocument);
    }

    public static void L(MaybeDocument maybeDocument, boolean z) {
        maybeDocument.hasCommittedMutations_ = z;
    }

    public static void M(MaybeDocument maybeDocument, NoDocument noDocument) {
        maybeDocument.getClass();
        maybeDocument.documentType_ = noDocument;
        maybeDocument.documentTypeCase_ = 1;
    }

    public static void N(MaybeDocument maybeDocument, Document document) {
        maybeDocument.getClass();
        maybeDocument.documentType_ = document;
        maybeDocument.documentTypeCase_ = 2;
    }

    public static void O(MaybeDocument maybeDocument, UnknownDocument unknownDocument) {
        maybeDocument.getClass();
        maybeDocument.documentType_ = unknownDocument;
        maybeDocument.documentTypeCase_ = 3;
    }

    public static Builder U() {
        return (Builder) DEFAULT_INSTANCE.r();
    }

    public static MaybeDocument V(byte[] bArr) {
        return (MaybeDocument) GeneratedMessageLite.H(DEFAULT_INSTANCE, bArr);
    }

    public final Document P() {
        return this.documentTypeCase_ == 2 ? (Document) this.documentType_ : Document.O();
    }

    public final DocumentTypeCase Q() {
        int i = this.documentTypeCase_;
        if (i == 0) {
            return DocumentTypeCase.g;
        }
        if (i == 1) {
            return DocumentTypeCase.d;
        }
        if (i == 2) {
            return DocumentTypeCase.e;
        }
        if (i != 3) {
            return null;
        }
        return DocumentTypeCase.f;
    }

    public final boolean R() {
        return this.hasCommittedMutations_;
    }

    public final NoDocument S() {
        return this.documentTypeCase_ == 1 ? (NoDocument) this.documentType_ : NoDocument.N();
    }

    public final UnknownDocument T() {
        return this.documentTypeCase_ == 3 ? (UnknownDocument) this.documentType_ : UnknownDocument.N();
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004\u0007", new Object[]{"documentType_", "documentTypeCase_", NoDocument.class, Document.class, UnknownDocument.class, "hasCommittedMutations_"});
            case 3:
                return new MaybeDocument();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<MaybeDocument> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (MaybeDocument.class) {
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
