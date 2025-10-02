package com.google.rpc;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class RequestInfo extends GeneratedMessageLite<RequestInfo, Builder> implements RequestInfoOrBuilder {
    private static final RequestInfo DEFAULT_INSTANCE;
    private static volatile Parser<RequestInfo> PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    public static final int SERVING_DATA_FIELD_NUMBER = 2;
    private String requestId_ = "";
    private String servingData_ = "";

    /* renamed from: com.google.rpc.RequestInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16105a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16105a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16105a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16105a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16105a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16105a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16105a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16105a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<RequestInfo, Builder> implements RequestInfoOrBuilder {
    }

    static {
        RequestInfo requestInfo = new RequestInfo();
        DEFAULT_INSTANCE = requestInfo;
        GeneratedMessageLite.J(RequestInfo.class, requestInfo);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"requestId_", "servingData_"});
            case 3:
                return new RequestInfo();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<RequestInfo> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (RequestInfo.class) {
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
