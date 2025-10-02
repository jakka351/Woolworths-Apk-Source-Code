package com.google.firestore.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class BeginTransactionRequest extends GeneratedMessageLite<BeginTransactionRequest, Builder> implements BeginTransactionRequestOrBuilder {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final BeginTransactionRequest DEFAULT_INSTANCE;
    public static final int OPTIONS_FIELD_NUMBER = 2;
    private static volatile Parser<BeginTransactionRequest> PARSER;
    private int bitField0_;
    private String database_ = "";
    private TransactionOptions options_;

    /* renamed from: com.google.firestore.v1.BeginTransactionRequest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15861a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15861a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15861a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15861a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15861a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15861a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15861a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15861a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<BeginTransactionRequest, Builder> implements BeginTransactionRequestOrBuilder {
    }

    static {
        BeginTransactionRequest beginTransactionRequest = new BeginTransactionRequest();
        DEFAULT_INSTANCE = beginTransactionRequest;
        GeneratedMessageLite.J(BeginTransactionRequest.class, beginTransactionRequest);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "database_", "options_"});
            case 3:
                return new BeginTransactionRequest();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<BeginTransactionRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (BeginTransactionRequest.class) {
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
