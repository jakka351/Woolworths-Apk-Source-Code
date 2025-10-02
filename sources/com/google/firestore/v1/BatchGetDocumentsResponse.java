package com.google.firestore.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes6.dex */
public final class BatchGetDocumentsResponse extends GeneratedMessageLite<BatchGetDocumentsResponse, Builder> implements BatchGetDocumentsResponseOrBuilder {
    private static final BatchGetDocumentsResponse DEFAULT_INSTANCE;
    public static final int FOUND_FIELD_NUMBER = 1;
    public static final int MISSING_FIELD_NUMBER = 2;
    private static volatile Parser<BatchGetDocumentsResponse> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 4;
    public static final int TRANSACTION_FIELD_NUMBER = 3;
    private int bitField0_;
    private Timestamp readTime_;
    private Object result_;
    private int resultCase_ = 0;
    private ByteString transaction_ = ByteString.e;

    /* renamed from: com.google.firestore.v1.BatchGetDocumentsResponse$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15860a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15860a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15860a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15860a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15860a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15860a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15860a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15860a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<BatchGetDocumentsResponse, Builder> implements BatchGetDocumentsResponseOrBuilder {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ResultCase {
        public static final /* synthetic */ ResultCase[] d = {new ResultCase("FOUND", 0), new ResultCase("MISSING", 1), new ResultCase("RESULT_NOT_SET", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        ResultCase EF5;

        public static ResultCase valueOf(String str) {
            return (ResultCase) Enum.valueOf(ResultCase.class, str);
        }

        public static ResultCase[] values() {
            return (ResultCase[]) d.clone();
        }
    }

    static {
        BatchGetDocumentsResponse batchGetDocumentsResponse = new BatchGetDocumentsResponse();
        DEFAULT_INSTANCE = batchGetDocumentsResponse;
        GeneratedMessageLite.J(BatchGetDocumentsResponse.class, batchGetDocumentsResponse);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002Ȼ\u0000\u0003\n\u0004ဉ\u0000", new Object[]{"result_", "resultCase_", "bitField0_", Document.class, "transaction_", "readTime_"});
            case 3:
                return new BatchGetDocumentsResponse();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<BatchGetDocumentsResponse> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (BatchGetDocumentsResponse.class) {
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
