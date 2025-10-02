package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;

/* loaded from: classes6.dex */
public final class MetricRule extends GeneratedMessageLite<MetricRule, Builder> implements MetricRuleOrBuilder {
    private static final MetricRule DEFAULT_INSTANCE;
    public static final int METRIC_COSTS_FIELD_NUMBER = 2;
    private static volatile Parser<MetricRule> PARSER = null;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private MapFieldLite<String, Long> metricCosts_ = MapFieldLite.e;
    private String selector_ = "";

    /* renamed from: com.google.api.MetricRule$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14821a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14821a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14821a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14821a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14821a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14821a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14821a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14821a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<MetricRule, Builder> implements MetricRuleOrBuilder {
    }

    public static final class MetricCostsDefaultEntryHolder {

        /* renamed from: a, reason: collision with root package name */
        public static final MapEntryLite f14822a = new MapEntryLite(WireFormat.FieldType.n, WireFormat.FieldType.h, 0L);
    }

    static {
        MetricRule metricRule = new MetricRule();
        DEFAULT_INSTANCE = metricRule;
        GeneratedMessageLite.J(MetricRule.class, metricRule);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001Ȉ\u00022", new Object[]{"selector_", "metricCosts_", MetricCostsDefaultEntryHolder.f14822a});
            case 3:
                return new MetricRule();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<MetricRule> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (MetricRule.class) {
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
