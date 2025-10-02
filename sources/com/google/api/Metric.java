package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;

/* loaded from: classes6.dex */
public final class Metric extends GeneratedMessageLite<Metric, Builder> implements MetricOrBuilder {
    private static final Metric DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 2;
    private static volatile Parser<Metric> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 3;
    private MapFieldLite<String, String> labels_ = MapFieldLite.e;
    private String type_ = "";

    /* renamed from: com.google.api.Metric$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14818a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14818a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14818a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14818a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14818a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14818a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14818a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14818a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Metric, Builder> implements MetricOrBuilder {
    }

    public static final class LabelsDefaultEntryHolder {

        /* renamed from: a, reason: collision with root package name */
        public static final MapEntryLite f14819a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.n;
            f14819a = new MapEntryLite(fieldType, fieldType, "");
        }
    }

    static {
        Metric metric = new Metric();
        DEFAULT_INSTANCE = metric;
        GeneratedMessageLite.J(Metric.class, metric);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0001\u0000\u0000\u00022\u0003Ȉ", new Object[]{"labels_", LabelsDefaultEntryHolder.f14819a, "type_"});
            case 3:
                return new Metric();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<Metric> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Metric.class) {
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
