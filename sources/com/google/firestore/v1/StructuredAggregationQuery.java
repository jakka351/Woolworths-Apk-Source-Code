package com.google.firestore.v1;

import com.google.firestore.v1.StructuredQuery;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Int64Value;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class StructuredAggregationQuery extends GeneratedMessageLite<StructuredAggregationQuery, Builder> implements StructuredAggregationQueryOrBuilder {
    public static final int AGGREGATIONS_FIELD_NUMBER = 3;
    private static final StructuredAggregationQuery DEFAULT_INSTANCE;
    private static volatile Parser<StructuredAggregationQuery> PARSER = null;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 1;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private Internal.ProtobufList<Aggregation> aggregations_ = GeneratedMessageLite.w();

    /* renamed from: com.google.firestore.v1.StructuredAggregationQuery$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15895a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15895a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15895a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15895a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15895a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15895a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15895a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15895a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Aggregation extends GeneratedMessageLite<Aggregation, Builder> implements AggregationOrBuilder {
        public static final int ALIAS_FIELD_NUMBER = 7;
        public static final int AVG_FIELD_NUMBER = 3;
        public static final int COUNT_FIELD_NUMBER = 1;
        private static final Aggregation DEFAULT_INSTANCE;
        private static volatile Parser<Aggregation> PARSER = null;
        public static final int SUM_FIELD_NUMBER = 2;
        private Object operator_;
        private int operatorCase_ = 0;
        private String alias_ = "";

        public static final class Avg extends GeneratedMessageLite<Avg, Builder> implements AvgOrBuilder {
            private static final Avg DEFAULT_INSTANCE;
            public static final int FIELD_FIELD_NUMBER = 1;
            private static volatile Parser<Avg> PARSER;
            private int bitField0_;
            private StructuredQuery.FieldReference field_;

            public static final class Builder extends GeneratedMessageLite.Builder<Avg, Builder> implements AvgOrBuilder {
            }

            static {
                Avg avg = new Avg();
                DEFAULT_INSTANCE = avg;
                GeneratedMessageLite.J(Avg.class, avg);
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
                        return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "field_"});
                    case 3:
                        return new Avg();
                    case 4:
                        return new Builder(DEFAULT_INSTANCE);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        Parser<Avg> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Avg.class) {
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

        public interface AvgOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Aggregation, Builder> implements AggregationOrBuilder {
        }

        public static final class Count extends GeneratedMessageLite<Count, Builder> implements CountOrBuilder {
            private static final Count DEFAULT_INSTANCE;
            private static volatile Parser<Count> PARSER = null;
            public static final int UP_TO_FIELD_NUMBER = 1;
            private int bitField0_;
            private Int64Value upTo_;

            public static final class Builder extends GeneratedMessageLite.Builder<Count, Builder> implements CountOrBuilder {
            }

            static {
                Count count = new Count();
                DEFAULT_INSTANCE = count;
                GeneratedMessageLite.J(Count.class, count);
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
                        return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "upTo_"});
                    case 3:
                        return new Count();
                    case 4:
                        return new Builder(DEFAULT_INSTANCE);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        Parser<Count> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Count.class) {
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

        public interface CountOrBuilder extends MessageLiteOrBuilder {
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class OperatorCase {
            public static final /* synthetic */ OperatorCase[] d = {new OperatorCase("COUNT", 0), new OperatorCase("SUM", 1), new OperatorCase("AVG", 2), new OperatorCase("OPERATOR_NOT_SET", 3)};

            /* JADX INFO: Fake field, exist only in values array */
            OperatorCase EF5;

            public static OperatorCase valueOf(String str) {
                return (OperatorCase) Enum.valueOf(OperatorCase.class, str);
            }

            public static OperatorCase[] values() {
                return (OperatorCase[]) d.clone();
            }
        }

        public static final class Sum extends GeneratedMessageLite<Sum, Builder> implements SumOrBuilder {
            private static final Sum DEFAULT_INSTANCE;
            public static final int FIELD_FIELD_NUMBER = 1;
            private static volatile Parser<Sum> PARSER;
            private int bitField0_;
            private StructuredQuery.FieldReference field_;

            public static final class Builder extends GeneratedMessageLite.Builder<Sum, Builder> implements SumOrBuilder {
            }

            static {
                Sum sum = new Sum();
                DEFAULT_INSTANCE = sum;
                GeneratedMessageLite.J(Sum.class, sum);
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
                        return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "field_"});
                    case 3:
                        return new Sum();
                    case 4:
                        return new Builder(DEFAULT_INSTANCE);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        Parser<Sum> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Sum.class) {
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

        public interface SumOrBuilder extends MessageLiteOrBuilder {
        }

        static {
            Aggregation aggregation = new Aggregation();
            DEFAULT_INSTANCE = aggregation;
            GeneratedMessageLite.J(Aggregation.class, aggregation);
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
                    return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0007\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0007Ȉ", new Object[]{"operator_", "operatorCase_", Count.class, Sum.class, Avg.class, "alias_"});
                case 3:
                    return new Aggregation();
                case 4:
                    return new Builder(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    Parser<Aggregation> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Aggregation.class) {
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

    public interface AggregationOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Builder extends GeneratedMessageLite.Builder<StructuredAggregationQuery, Builder> implements StructuredAggregationQueryOrBuilder {
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
        StructuredAggregationQuery structuredAggregationQuery = new StructuredAggregationQuery();
        DEFAULT_INSTANCE = structuredAggregationQuery;
        GeneratedMessageLite.J(StructuredAggregationQuery.class, structuredAggregationQuery);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001<\u0000\u0003\u001b", new Object[]{"queryType_", "queryTypeCase_", StructuredQuery.class, "aggregations_", Aggregation.class});
            case 3:
                return new StructuredAggregationQuery();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<StructuredAggregationQuery> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (StructuredAggregationQuery.class) {
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
