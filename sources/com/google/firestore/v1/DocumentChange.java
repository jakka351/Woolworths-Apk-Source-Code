package com.google.firestore.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class DocumentChange extends GeneratedMessageLite<DocumentChange, Builder> implements DocumentChangeOrBuilder {
    private static final DocumentChange DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    private static volatile Parser<DocumentChange> PARSER = null;
    public static final int REMOVED_TARGET_IDS_FIELD_NUMBER = 6;
    public static final int TARGET_IDS_FIELD_NUMBER = 5;
    private int bitField0_;
    private Document document_;
    private int targetIdsMemoizedSerializedSize = -1;
    private int removedTargetIdsMemoizedSerializedSize = -1;
    private Internal.IntList targetIds_ = GeneratedMessageLite.u();
    private Internal.IntList removedTargetIds_ = GeneratedMessageLite.u();

    /* renamed from: com.google.firestore.v1.DocumentChange$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15872a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15872a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15872a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15872a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15872a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15872a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15872a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15872a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<DocumentChange, Builder> implements DocumentChangeOrBuilder {
    }

    static {
        DocumentChange documentChange = new DocumentChange();
        DEFAULT_INSTANCE = documentChange;
        GeneratedMessageLite.J(DocumentChange.class, documentChange);
    }

    public static DocumentChange L() {
        return DEFAULT_INSTANCE;
    }

    public final Document M() {
        Document document = this.document_;
        return document == null ? Document.O() : document;
    }

    public final Internal.IntList N() {
        return this.removedTargetIds_;
    }

    public final Internal.IntList O() {
        return this.targetIds_;
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0002\u0000\u0001ဉ\u0000\u0005'\u0006'", new Object[]{"bitField0_", "document_", "targetIds_", "removedTargetIds_"});
            case 3:
                return new DocumentChange();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<DocumentChange> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (DocumentChange.class) {
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
