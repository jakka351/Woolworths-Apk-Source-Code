package com.google.api;

import com.google.protobuf.Duration;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class MetricDescriptor extends GeneratedMessageLite<MetricDescriptor, Builder> implements MetricDescriptorOrBuilder {
    private static final MetricDescriptor DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 6;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 7;
    public static final int LABELS_FIELD_NUMBER = 2;
    public static final int LAUNCH_STAGE_FIELD_NUMBER = 12;
    public static final int METADATA_FIELD_NUMBER = 10;
    public static final int METRIC_KIND_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<MetricDescriptor> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 8;
    public static final int UNIT_FIELD_NUMBER = 5;
    public static final int VALUE_TYPE_FIELD_NUMBER = 4;
    private int bitField0_;
    private int launchStage_;
    private MetricDescriptorMetadata metadata_;
    private int metricKind_;
    private int valueType_;
    private String name_ = "";
    private String type_ = "";
    private Internal.ProtobufList<LabelDescriptor> labels_ = GeneratedMessageLite.w();
    private String unit_ = "";
    private String description_ = "";
    private String displayName_ = "";

    /* renamed from: com.google.api.MetricDescriptor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14820a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14820a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14820a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14820a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14820a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14820a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14820a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14820a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<MetricDescriptor, Builder> implements MetricDescriptorOrBuilder {
    }

    public static final class MetricDescriptorMetadata extends GeneratedMessageLite<MetricDescriptorMetadata, Builder> implements MetricDescriptorMetadataOrBuilder {
        private static final MetricDescriptorMetadata DEFAULT_INSTANCE;
        public static final int INGEST_DELAY_FIELD_NUMBER = 3;
        public static final int LAUNCH_STAGE_FIELD_NUMBER = 1;
        private static volatile Parser<MetricDescriptorMetadata> PARSER = null;
        public static final int SAMPLE_PERIOD_FIELD_NUMBER = 2;
        private int bitField0_;
        private Duration ingestDelay_;
        private int launchStage_;
        private Duration samplePeriod_;

        public static final class Builder extends GeneratedMessageLite.Builder<MetricDescriptorMetadata, Builder> implements MetricDescriptorMetadataOrBuilder {
        }

        static {
            MetricDescriptorMetadata metricDescriptorMetadata = new MetricDescriptorMetadata();
            DEFAULT_INSTANCE = metricDescriptorMetadata;
            GeneratedMessageLite.J(MetricDescriptorMetadata.class, metricDescriptorMetadata);
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
                    return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "launchStage_", "samplePeriod_", "ingestDelay_"});
                case 3:
                    return new MetricDescriptorMetadata();
                case 4:
                    return new Builder(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    Parser<MetricDescriptorMetadata> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (MetricDescriptorMetadata.class) {
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

    public interface MetricDescriptorMetadataOrBuilder extends MessageLiteOrBuilder {
    }

    public enum MetricKind implements Internal.EnumLite {
        METRIC_KIND_UNSPECIFIED(0),
        GAUGE(1),
        DELTA(2),
        CUMULATIVE(3),
        UNRECOGNIZED(-1);

        public final int d;

        /* renamed from: com.google.api.MetricDescriptor$MetricKind$1, reason: invalid class name */
        public class AnonymousClass1 implements Internal.EnumLiteMap<MetricKind> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite a(int i) {
                if (i == 0) {
                    return MetricKind.METRIC_KIND_UNSPECIFIED;
                }
                if (i == 1) {
                    return MetricKind.GAUGE;
                }
                if (i == 2) {
                    return MetricKind.DELTA;
                }
                if (i != 3) {
                    return null;
                }
                return MetricKind.CUMULATIVE;
            }
        }

        public static final class MetricKindVerifier implements Internal.EnumVerifier {
            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean a(int i) {
                return (i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : MetricKind.CUMULATIVE : MetricKind.DELTA : MetricKind.GAUGE : MetricKind.METRIC_KIND_UNSPECIFIED) != null;
            }
        }

        MetricKind(int i) {
            this.d = i;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int g() {
            if (this != UNRECOGNIZED) {
                return this.d;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public enum ValueType implements Internal.EnumLite {
        VALUE_TYPE_UNSPECIFIED(0),
        BOOL(1),
        INT64(2),
        DOUBLE(3),
        STRING(4),
        DISTRIBUTION(5),
        MONEY(6),
        UNRECOGNIZED(-1);

        public final int d;

        /* renamed from: com.google.api.MetricDescriptor$ValueType$1, reason: invalid class name */
        public class AnonymousClass1 implements Internal.EnumLiteMap<ValueType> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite a(int i) {
                switch (i) {
                    case 0:
                        return ValueType.VALUE_TYPE_UNSPECIFIED;
                    case 1:
                        return ValueType.BOOL;
                    case 2:
                        return ValueType.INT64;
                    case 3:
                        return ValueType.DOUBLE;
                    case 4:
                        return ValueType.STRING;
                    case 5:
                        return ValueType.DISTRIBUTION;
                    case 6:
                        return ValueType.MONEY;
                    default:
                        return null;
                }
            }
        }

        public static final class ValueTypeVerifier implements Internal.EnumVerifier {
            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean a(int i) {
                ValueType valueType;
                switch (i) {
                    case 0:
                        valueType = ValueType.VALUE_TYPE_UNSPECIFIED;
                        break;
                    case 1:
                        valueType = ValueType.BOOL;
                        break;
                    case 2:
                        valueType = ValueType.INT64;
                        break;
                    case 3:
                        valueType = ValueType.DOUBLE;
                        break;
                    case 4:
                        valueType = ValueType.STRING;
                        break;
                    case 5:
                        valueType = ValueType.DISTRIBUTION;
                        break;
                    case 6:
                        valueType = ValueType.MONEY;
                        break;
                    default:
                        valueType = null;
                        break;
                }
                return valueType != null;
            }
        }

        ValueType(int i) {
            this.d = i;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int g() {
            if (this != UNRECOGNIZED) {
                return this.d;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        MetricDescriptor metricDescriptor = new MetricDescriptor();
        DEFAULT_INSTANCE = metricDescriptor;
        GeneratedMessageLite.J(MetricDescriptor.class, metricDescriptor);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\f\n\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003\f\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\nဉ\u0000\f\f", new Object[]{"bitField0_", "name_", "labels_", LabelDescriptor.class, "metricKind_", "valueType_", "unit_", "description_", "displayName_", "type_", "metadata_", "launchStage_"});
            case 3:
                return new MetricDescriptor();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<MetricDescriptor> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (MetricDescriptor.class) {
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
