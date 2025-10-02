package com.google.longrunning;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class GetOperationRequest extends GeneratedMessageLite<GetOperationRequest, Builder> implements GetOperationRequestOrBuilder {
    private static final GetOperationRequest DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<GetOperationRequest> PARSER;
    private String name_ = "";

    /* renamed from: com.google.longrunning.GetOperationRequest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15969a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15969a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15969a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15969a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15969a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15969a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15969a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15969a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<GetOperationRequest, Builder> implements GetOperationRequestOrBuilder {
    }

    static {
        GetOperationRequest getOperationRequest = new GetOperationRequest();
        DEFAULT_INSTANCE = getOperationRequest;
        GeneratedMessageLite.J(GetOperationRequest.class, getOperationRequest);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"name_"});
            case 3:
                return new GetOperationRequest();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<GetOperationRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (GetOperationRequest.class) {
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
