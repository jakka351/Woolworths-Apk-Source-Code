package com.google.cloud.audit;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class RequestMetadata extends GeneratedMessageLite<RequestMetadata, Builder> implements RequestMetadataOrBuilder {
    public static final int CALLER_IP_FIELD_NUMBER = 1;
    public static final int CALLER_SUPPLIED_USER_AGENT_FIELD_NUMBER = 2;
    private static final RequestMetadata DEFAULT_INSTANCE;
    private static volatile Parser<RequestMetadata> PARSER;
    private String callerIp_ = "";
    private String callerSuppliedUserAgent_ = "";

    /* renamed from: com.google.cloud.audit.RequestMetadata$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14859a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14859a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14859a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14859a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14859a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14859a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14859a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14859a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<RequestMetadata, Builder> implements RequestMetadataOrBuilder {
    }

    static {
        RequestMetadata requestMetadata = new RequestMetadata();
        DEFAULT_INSTANCE = requestMetadata;
        GeneratedMessageLite.J(RequestMetadata.class, requestMetadata);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"callerIp_", "callerSuppliedUserAgent_"});
            case 3:
                return new RequestMetadata();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<RequestMetadata> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (RequestMetadata.class) {
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
