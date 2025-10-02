package com.google.api;

import com.google.protobuf.Any;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes6.dex */
public final class Distribution extends GeneratedMessageLite<Distribution, Builder> implements DistributionOrBuilder {
    public static final int BUCKET_COUNTS_FIELD_NUMBER = 7;
    public static final int BUCKET_OPTIONS_FIELD_NUMBER = 6;
    public static final int COUNT_FIELD_NUMBER = 1;
    private static final Distribution DEFAULT_INSTANCE;
    public static final int EXEMPLARS_FIELD_NUMBER = 10;
    public static final int MEAN_FIELD_NUMBER = 2;
    private static volatile Parser<Distribution> PARSER = null;
    public static final int RANGE_FIELD_NUMBER = 4;
    public static final int SUM_OF_SQUARED_DEVIATION_FIELD_NUMBER = 3;
    private int bitField0_;
    private BucketOptions bucketOptions_;
    private long count_;
    private double mean_;
    private Range range_;
    private double sumOfSquaredDeviation_;
    private int bucketCountsMemoizedSerializedSize = -1;
    private Internal.LongList bucketCounts_ = GeneratedMessageLite.v();
    private Internal.ProtobufList<Exemplar> exemplars_ = GeneratedMessageLite.w();

    /* renamed from: com.google.api.Distribution$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14807a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14807a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14807a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14807a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14807a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14807a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14807a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14807a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class BucketOptions extends GeneratedMessageLite<BucketOptions, Builder> implements BucketOptionsOrBuilder {
        private static final BucketOptions DEFAULT_INSTANCE;
        public static final int EXPLICIT_BUCKETS_FIELD_NUMBER = 3;
        public static final int EXPONENTIAL_BUCKETS_FIELD_NUMBER = 2;
        public static final int LINEAR_BUCKETS_FIELD_NUMBER = 1;
        private static volatile Parser<BucketOptions> PARSER;
        private int optionsCase_ = 0;
        private Object options_;

        public static final class Builder extends GeneratedMessageLite.Builder<BucketOptions, Builder> implements BucketOptionsOrBuilder {
        }

        public static final class Explicit extends GeneratedMessageLite<Explicit, Builder> implements ExplicitOrBuilder {
            public static final int BOUNDS_FIELD_NUMBER = 1;
            private static final Explicit DEFAULT_INSTANCE;
            private static volatile Parser<Explicit> PARSER;
            private int boundsMemoizedSerializedSize = -1;
            private Internal.DoubleList bounds_ = GeneratedMessageLite.t();

            public static final class Builder extends GeneratedMessageLite.Builder<Explicit, Builder> implements ExplicitOrBuilder {
            }

            static {
                Explicit explicit = new Explicit();
                DEFAULT_INSTANCE = explicit;
                GeneratedMessageLite.J(Explicit.class, explicit);
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
                        return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001#", new Object[]{"bounds_"});
                    case 3:
                        return new Explicit();
                    case 4:
                        return new Builder(DEFAULT_INSTANCE);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        Parser<Explicit> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Explicit.class) {
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

        public interface ExplicitOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class Exponential extends GeneratedMessageLite<Exponential, Builder> implements ExponentialOrBuilder {
            private static final Exponential DEFAULT_INSTANCE;
            public static final int GROWTH_FACTOR_FIELD_NUMBER = 2;
            public static final int NUM_FINITE_BUCKETS_FIELD_NUMBER = 1;
            private static volatile Parser<Exponential> PARSER = null;
            public static final int SCALE_FIELD_NUMBER = 3;
            private double growthFactor_;
            private int numFiniteBuckets_;
            private double scale_;

            public static final class Builder extends GeneratedMessageLite.Builder<Exponential, Builder> implements ExponentialOrBuilder {
            }

            static {
                Exponential exponential = new Exponential();
                DEFAULT_INSTANCE = exponential;
                GeneratedMessageLite.J(Exponential.class, exponential);
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
                        return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0000\u0003\u0000", new Object[]{"numFiniteBuckets_", "growthFactor_", "scale_"});
                    case 3:
                        return new Exponential();
                    case 4:
                        return new Builder(DEFAULT_INSTANCE);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        Parser<Exponential> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Exponential.class) {
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

        public interface ExponentialOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class Linear extends GeneratedMessageLite<Linear, Builder> implements LinearOrBuilder {
            private static final Linear DEFAULT_INSTANCE;
            public static final int NUM_FINITE_BUCKETS_FIELD_NUMBER = 1;
            public static final int OFFSET_FIELD_NUMBER = 3;
            private static volatile Parser<Linear> PARSER = null;
            public static final int WIDTH_FIELD_NUMBER = 2;
            private int numFiniteBuckets_;
            private double offset_;
            private double width_;

            public static final class Builder extends GeneratedMessageLite.Builder<Linear, Builder> implements LinearOrBuilder {
            }

            static {
                Linear linear = new Linear();
                DEFAULT_INSTANCE = linear;
                GeneratedMessageLite.J(Linear.class, linear);
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
                        return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0000\u0003\u0000", new Object[]{"numFiniteBuckets_", "width_", "offset_"});
                    case 3:
                        return new Linear();
                    case 4:
                        return new Builder(DEFAULT_INSTANCE);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        Parser<Linear> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Linear.class) {
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

        public interface LinearOrBuilder extends MessageLiteOrBuilder {
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class OptionsCase {
            public static final /* synthetic */ OptionsCase[] d = {new OptionsCase("LINEAR_BUCKETS", 0), new OptionsCase("EXPONENTIAL_BUCKETS", 1), new OptionsCase("EXPLICIT_BUCKETS", 2), new OptionsCase("OPTIONS_NOT_SET", 3)};

            /* JADX INFO: Fake field, exist only in values array */
            OptionsCase EF5;

            public static OptionsCase valueOf(String str) {
                return (OptionsCase) Enum.valueOf(OptionsCase.class, str);
            }

            public static OptionsCase[] values() {
                return (OptionsCase[]) d.clone();
            }
        }

        static {
            BucketOptions bucketOptions = new BucketOptions();
            DEFAULT_INSTANCE = bucketOptions;
            GeneratedMessageLite.J(BucketOptions.class, bucketOptions);
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
                    return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"options_", "optionsCase_", Linear.class, Exponential.class, Explicit.class});
                case 3:
                    return new BucketOptions();
                case 4:
                    return new Builder(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    Parser<BucketOptions> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (BucketOptions.class) {
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

    public interface BucketOptionsOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Distribution, Builder> implements DistributionOrBuilder {
    }

    public static final class Exemplar extends GeneratedMessageLite<Exemplar, Builder> implements ExemplarOrBuilder {
        public static final int ATTACHMENTS_FIELD_NUMBER = 3;
        private static final Exemplar DEFAULT_INSTANCE;
        private static volatile Parser<Exemplar> PARSER = null;
        public static final int TIMESTAMP_FIELD_NUMBER = 2;
        public static final int VALUE_FIELD_NUMBER = 1;
        private Internal.ProtobufList<Any> attachments_ = GeneratedMessageLite.w();
        private int bitField0_;
        private Timestamp timestamp_;
        private double value_;

        public static final class Builder extends GeneratedMessageLite.Builder<Exemplar, Builder> implements ExemplarOrBuilder {
        }

        static {
            Exemplar exemplar = new Exemplar();
            DEFAULT_INSTANCE = exemplar;
            GeneratedMessageLite.J(Exemplar.class, exemplar);
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
                    return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0000\u0002ဉ\u0000\u0003\u001b", new Object[]{"bitField0_", "value_", "timestamp_", "attachments_", Any.class});
                case 3:
                    return new Exemplar();
                case 4:
                    return new Builder(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    Parser<Exemplar> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Exemplar.class) {
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

    public interface ExemplarOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Range extends GeneratedMessageLite<Range, Builder> implements RangeOrBuilder {
        private static final Range DEFAULT_INSTANCE;
        public static final int MAX_FIELD_NUMBER = 2;
        public static final int MIN_FIELD_NUMBER = 1;
        private static volatile Parser<Range> PARSER;
        private double max_;
        private double min_;

        public static final class Builder extends GeneratedMessageLite.Builder<Range, Builder> implements RangeOrBuilder {
        }

        static {
            Range range = new Range();
            DEFAULT_INSTANCE = range;
            GeneratedMessageLite.J(Range.class, range);
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
                    return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"min_", "max_"});
                case 3:
                    return new Range();
                case 4:
                    return new Builder(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    Parser<Range> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Range.class) {
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

    public interface RangeOrBuilder extends MessageLiteOrBuilder {
    }

    static {
        Distribution distribution = new Distribution();
        DEFAULT_INSTANCE = distribution;
        GeneratedMessageLite.J(Distribution.class, distribution);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\n\u0007\u0000\u0002\u0000\u0001\u0002\u0002\u0000\u0003\u0000\u0004ဉ\u0000\u0006ဉ\u0001\u0007%\n\u001b", new Object[]{"bitField0_", "count_", "mean_", "sumOfSquaredDeviation_", "range_", "bucketOptions_", "bucketCounts_", "exemplars_", Exemplar.class});
            case 3:
                return new Distribution();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<Distribution> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Distribution.class) {
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
