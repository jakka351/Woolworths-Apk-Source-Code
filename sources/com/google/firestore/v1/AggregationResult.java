package com.google.firestore.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;

/* loaded from: classes6.dex */
public final class AggregationResult extends GeneratedMessageLite<AggregationResult, Builder> implements AggregationResultOrBuilder {
    public static final int AGGREGATE_FIELDS_FIELD_NUMBER = 2;
    private static final AggregationResult DEFAULT_INSTANCE;
    private static volatile Parser<AggregationResult> PARSER;
    private MapFieldLite<String, Value> aggregateFields_ = MapFieldLite.e;

    /* renamed from: com.google.firestore.v1.AggregationResult$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15856a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15856a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15856a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15856a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15856a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15856a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15856a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15856a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class AggregateFieldsDefaultEntryHolder {

        /* renamed from: a, reason: collision with root package name */
        public static final MapEntryLite f15857a = new MapEntryLite(WireFormat.FieldType.n, WireFormat.FieldType.p, Value.Z());
    }

    public static final class Builder extends GeneratedMessageLite.Builder<AggregationResult, Builder> implements AggregationResultOrBuilder {
    }

    static {
        AggregationResult aggregationResult = new AggregationResult();
        DEFAULT_INSTANCE = aggregationResult;
        GeneratedMessageLite.J(AggregationResult.class, aggregationResult);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"aggregateFields_", AggregateFieldsDefaultEntryHolder.f15857a});
            case 3:
                return new AggregationResult();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<AggregationResult> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (AggregationResult.class) {
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
