package com.google.firestore.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes6.dex */
public final class RunQueryResponse extends GeneratedMessageLite<RunQueryResponse, Builder> implements RunQueryResponseOrBuilder {
    private static final RunQueryResponse DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    private static volatile Parser<RunQueryResponse> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 3;
    public static final int SKIPPED_RESULTS_FIELD_NUMBER = 4;
    public static final int TRANSACTION_FIELD_NUMBER = 2;
    private int bitField0_;
    private Document document_;
    private Timestamp readTime_;
    private int skippedResults_;
    private ByteString transaction_ = ByteString.e;

    /* renamed from: com.google.firestore.v1.RunQueryResponse$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15894a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15894a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15894a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15894a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15894a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15894a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15894a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15894a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<RunQueryResponse, Builder> implements RunQueryResponseOrBuilder {
    }

    static {
        RunQueryResponse runQueryResponse = new RunQueryResponse();
        DEFAULT_INSTANCE = runQueryResponse;
        GeneratedMessageLite.J(RunQueryResponse.class, runQueryResponse);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\n\u0003ဉ\u0001\u0004\u0004", new Object[]{"bitField0_", "document_", "transaction_", "readTime_", "skippedResults_"});
            case 3:
                return new RunQueryResponse();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<RunQueryResponse> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (RunQueryResponse.class) {
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
