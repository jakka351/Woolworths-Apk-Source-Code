package com.google.firestore.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes6.dex */
public final class BatchGetDocumentsRequest extends GeneratedMessageLite<BatchGetDocumentsRequest, Builder> implements BatchGetDocumentsRequestOrBuilder {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final BatchGetDocumentsRequest DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 2;
    public static final int MASK_FIELD_NUMBER = 3;
    public static final int NEW_TRANSACTION_FIELD_NUMBER = 5;
    private static volatile Parser<BatchGetDocumentsRequest> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 7;
    public static final int TRANSACTION_FIELD_NUMBER = 4;
    private int bitField0_;
    private Object consistencySelector_;
    private DocumentMask mask_;
    private int consistencySelectorCase_ = 0;
    private String database_ = "";
    private Internal.ProtobufList<String> documents_ = GeneratedMessageLite.w();

    /* renamed from: com.google.firestore.v1.BatchGetDocumentsRequest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15859a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15859a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15859a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15859a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15859a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15859a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15859a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15859a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<BatchGetDocumentsRequest, Builder> implements BatchGetDocumentsRequestOrBuilder {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ConsistencySelectorCase {
        public static final /* synthetic */ ConsistencySelectorCase[] d = {new ConsistencySelectorCase("TRANSACTION", 0), new ConsistencySelectorCase("NEW_TRANSACTION", 1), new ConsistencySelectorCase("READ_TIME", 2), new ConsistencySelectorCase("CONSISTENCYSELECTOR_NOT_SET", 3)};

        /* JADX INFO: Fake field, exist only in values array */
        ConsistencySelectorCase EF5;

        public static ConsistencySelectorCase valueOf(String str) {
            return (ConsistencySelectorCase) Enum.valueOf(ConsistencySelectorCase.class, str);
        }

        public static ConsistencySelectorCase[] values() {
            return (ConsistencySelectorCase[]) d.clone();
        }
    }

    static {
        BatchGetDocumentsRequest batchGetDocumentsRequest = new BatchGetDocumentsRequest();
        DEFAULT_INSTANCE = batchGetDocumentsRequest;
        GeneratedMessageLite.J(BatchGetDocumentsRequest.class, batchGetDocumentsRequest);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003ဉ\u0000\u0004=\u0000\u0005<\u0000\u0007<\u0000", new Object[]{"consistencySelector_", "consistencySelectorCase_", "bitField0_", "database_", "documents_", "mask_", TransactionOptions.class, Timestamp.class});
            case 3:
                return new BatchGetDocumentsRequest();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<BatchGetDocumentsRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (BatchGetDocumentsRequest.class) {
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
