package com.google.rpc;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;

/* loaded from: classes6.dex */
public final class ErrorInfo extends GeneratedMessageLite<ErrorInfo, Builder> implements ErrorInfoOrBuilder {
    private static final ErrorInfo DEFAULT_INSTANCE;
    public static final int DOMAIN_FIELD_NUMBER = 2;
    public static final int METADATA_FIELD_NUMBER = 3;
    private static volatile Parser<ErrorInfo> PARSER = null;
    public static final int REASON_FIELD_NUMBER = 1;
    private MapFieldLite<String, String> metadata_ = MapFieldLite.e;
    private String reason_ = "";
    private String domain_ = "";

    /* renamed from: com.google.rpc.ErrorInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16099a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16099a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16099a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16099a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16099a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16099a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16099a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16099a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ErrorInfo, Builder> implements ErrorInfoOrBuilder {
    }

    public static final class MetadataDefaultEntryHolder {

        /* renamed from: a, reason: collision with root package name */
        public static final MapEntryLite f16100a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.n;
            f16100a = new MapEntryLite(fieldType, fieldType, "");
        }
    }

    static {
        ErrorInfo errorInfo = new ErrorInfo();
        DEFAULT_INSTANCE = errorInfo;
        GeneratedMessageLite.J(ErrorInfo.class, errorInfo);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u00032", new Object[]{"reason_", "domain_", "metadata_", MetadataDefaultEntryHolder.f16100a});
            case 3:
                return new ErrorInfo();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<ErrorInfo> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ErrorInfo.class) {
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
