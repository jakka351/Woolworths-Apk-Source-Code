package com.google.firestore.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes6.dex */
public final class RunQueryRequest extends GeneratedMessageLite<RunQueryRequest, Builder> implements RunQueryRequestOrBuilder {
    private static final RunQueryRequest DEFAULT_INSTANCE;
    public static final int NEW_TRANSACTION_FIELD_NUMBER = 6;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile Parser<RunQueryRequest> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 7;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
    public static final int TRANSACTION_FIELD_NUMBER = 5;
    private Object consistencySelector_;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private int consistencySelectorCase_ = 0;
    private String parent_ = "";

    /* renamed from: com.google.firestore.v1.RunQueryRequest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15893a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15893a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15893a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15893a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15893a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15893a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15893a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15893a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<RunQueryRequest, Builder> implements RunQueryRequestOrBuilder {
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class QueryTypeCase {
        public static final /* synthetic */ QueryTypeCase[] d = {new QueryTypeCase("STRUCTURED_QUERY", 0), new QueryTypeCase("QUERYTYPE_NOT_SET", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        QueryTypeCase EF5;

        public static QueryTypeCase valueOf(String str) {
            return (QueryTypeCase) Enum.valueOf(QueryTypeCase.class, str);
        }

        public static QueryTypeCase[] values() {
            return (QueryTypeCase[]) d.clone();
        }
    }

    static {
        RunQueryRequest runQueryRequest = new RunQueryRequest();
        DEFAULT_INSTANCE = runQueryRequest;
        GeneratedMessageLite.J(RunQueryRequest.class, runQueryRequest);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0005\u0002\u0000\u0001\u0007\u0005\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0005=\u0001\u0006<\u0001\u0007<\u0001", new Object[]{"queryType_", "queryTypeCase_", "consistencySelector_", "consistencySelectorCase_", "parent_", StructuredQuery.class, TransactionOptions.class, Timestamp.class});
            case 3:
                return new RunQueryRequest();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<RunQueryRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (RunQueryRequest.class) {
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
