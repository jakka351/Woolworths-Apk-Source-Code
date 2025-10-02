package com.google.longrunning;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class OperationInfo extends GeneratedMessageLite<OperationInfo, Builder> implements OperationInfoOrBuilder {
    private static final OperationInfo DEFAULT_INSTANCE;
    public static final int METADATA_TYPE_FIELD_NUMBER = 2;
    private static volatile Parser<OperationInfo> PARSER = null;
    public static final int RESPONSE_TYPE_FIELD_NUMBER = 1;
    private String responseType_ = "";
    private String metadataType_ = "";

    /* renamed from: com.google.longrunning.OperationInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15973a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15973a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15973a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15973a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15973a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15973a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15973a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15973a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<OperationInfo, Builder> implements OperationInfoOrBuilder {
    }

    static {
        OperationInfo operationInfo = new OperationInfo();
        DEFAULT_INSTANCE = operationInfo;
        GeneratedMessageLite.J(OperationInfo.class, operationInfo);
    }

    public static OperationInfo L() {
        return DEFAULT_INSTANCE;
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"responseType_", "metadataType_"});
            case 3:
                return new OperationInfo();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<OperationInfo> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (OperationInfo.class) {
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
