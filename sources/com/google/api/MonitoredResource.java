package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;

/* loaded from: classes6.dex */
public final class MonitoredResource extends GeneratedMessageLite<MonitoredResource, Builder> implements MonitoredResourceOrBuilder {
    private static final MonitoredResource DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 2;
    private static volatile Parser<MonitoredResource> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private MapFieldLite<String, String> labels_ = MapFieldLite.e;
    private String type_ = "";

    /* renamed from: com.google.api.MonitoredResource$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14823a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14823a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14823a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14823a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14823a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14823a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14823a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14823a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<MonitoredResource, Builder> implements MonitoredResourceOrBuilder {
    }

    public static final class LabelsDefaultEntryHolder {

        /* renamed from: a, reason: collision with root package name */
        public static final MapEntryLite f14824a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.n;
            f14824a = new MapEntryLite(fieldType, fieldType, "");
        }
    }

    static {
        MonitoredResource monitoredResource = new MonitoredResource();
        DEFAULT_INSTANCE = monitoredResource;
        GeneratedMessageLite.J(MonitoredResource.class, monitoredResource);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001Ȉ\u00022", new Object[]{"type_", "labels_", LabelsDefaultEntryHolder.f14824a});
            case 3:
                return new MonitoredResource();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<MonitoredResource> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (MonitoredResource.class) {
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
