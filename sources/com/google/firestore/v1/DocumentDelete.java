package com.google.firestore.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes6.dex */
public final class DocumentDelete extends GeneratedMessageLite<DocumentDelete, Builder> implements DocumentDeleteOrBuilder {
    private static final DocumentDelete DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    private static volatile Parser<DocumentDelete> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 4;
    public static final int REMOVED_TARGET_IDS_FIELD_NUMBER = 6;
    private int bitField0_;
    private Timestamp readTime_;
    private int removedTargetIdsMemoizedSerializedSize = -1;
    private String document_ = "";
    private Internal.IntList removedTargetIds_ = GeneratedMessageLite.u();

    /* renamed from: com.google.firestore.v1.DocumentDelete$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15873a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15873a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15873a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15873a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15873a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15873a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15873a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15873a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<DocumentDelete, Builder> implements DocumentDeleteOrBuilder {
    }

    static {
        DocumentDelete documentDelete = new DocumentDelete();
        DEFAULT_INSTANCE = documentDelete;
        GeneratedMessageLite.J(DocumentDelete.class, documentDelete);
    }

    public static DocumentDelete L() {
        return DEFAULT_INSTANCE;
    }

    public final String M() {
        return this.document_;
    }

    public final Timestamp N() {
        Timestamp timestamp = this.readTime_;
        return timestamp == null ? Timestamp.N() : timestamp;
    }

    public final Internal.IntList O() {
        return this.removedTargetIds_;
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0001\u0000\u0001Ȉ\u0004ဉ\u0000\u0006'", new Object[]{"bitField0_", "document_", "readTime_", "removedTargetIds_"});
            case 3:
                return new DocumentDelete();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<DocumentDelete> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (DocumentDelete.class) {
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
