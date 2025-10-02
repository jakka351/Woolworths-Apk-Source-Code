package com.google.longrunning;

import com.google.protobuf.Duration;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class WaitOperationRequest extends GeneratedMessageLite<WaitOperationRequest, Builder> implements WaitOperationRequestOrBuilder {
    private static final WaitOperationRequest DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<WaitOperationRequest> PARSER = null;
    public static final int TIMEOUT_FIELD_NUMBER = 2;
    private int bitField0_;
    private String name_ = "";
    private Duration timeout_;

    /* renamed from: com.google.longrunning.WaitOperationRequest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15974a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15974a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15974a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15974a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15974a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15974a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15974a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15974a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<WaitOperationRequest, Builder> implements WaitOperationRequestOrBuilder {
    }

    static {
        WaitOperationRequest waitOperationRequest = new WaitOperationRequest();
        DEFAULT_INSTANCE = waitOperationRequest;
        GeneratedMessageLite.J(WaitOperationRequest.class, waitOperationRequest);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "name_", "timeout_"});
            case 3:
                return new WaitOperationRequest();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<WaitOperationRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (WaitOperationRequest.class) {
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
