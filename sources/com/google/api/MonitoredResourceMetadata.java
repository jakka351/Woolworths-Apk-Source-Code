package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Struct;
import com.google.protobuf.WireFormat;

/* loaded from: classes6.dex */
public final class MonitoredResourceMetadata extends GeneratedMessageLite<MonitoredResourceMetadata, Builder> implements MonitoredResourceMetadataOrBuilder {
    private static final MonitoredResourceMetadata DEFAULT_INSTANCE;
    private static volatile Parser<MonitoredResourceMetadata> PARSER = null;
    public static final int SYSTEM_LABELS_FIELD_NUMBER = 1;
    public static final int USER_LABELS_FIELD_NUMBER = 2;
    private int bitField0_;
    private Struct systemLabels_;
    private MapFieldLite<String, String> userLabels_ = MapFieldLite.e;

    /* renamed from: com.google.api.MonitoredResourceMetadata$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14826a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14826a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14826a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14826a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14826a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14826a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14826a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14826a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<MonitoredResourceMetadata, Builder> implements MonitoredResourceMetadataOrBuilder {
    }

    public static final class UserLabelsDefaultEntryHolder {

        /* renamed from: a, reason: collision with root package name */
        public static final MapEntryLite f14827a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.n;
            f14827a = new MapEntryLite(fieldType, fieldType, "");
        }
    }

    static {
        MonitoredResourceMetadata monitoredResourceMetadata = new MonitoredResourceMetadata();
        DEFAULT_INSTANCE = monitoredResourceMetadata;
        GeneratedMessageLite.J(MonitoredResourceMetadata.class, monitoredResourceMetadata);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဉ\u0000\u00022", new Object[]{"bitField0_", "systemLabels_", "userLabels_", UserLabelsDefaultEntryHolder.f14827a});
            case 3:
                return new MonitoredResourceMetadata();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<MonitoredResourceMetadata> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (MonitoredResourceMetadata.class) {
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
