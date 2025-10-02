package com.google.firestore.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class CommitRequest extends GeneratedMessageLite<CommitRequest, Builder> implements CommitRequestOrBuilder {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final CommitRequest DEFAULT_INSTANCE;
    private static volatile Parser<CommitRequest> PARSER = null;
    public static final int TRANSACTION_FIELD_NUMBER = 3;
    public static final int WRITES_FIELD_NUMBER = 2;
    private String database_ = "";
    private Internal.ProtobufList<Write> writes_ = GeneratedMessageLite.w();
    private ByteString transaction_ = ByteString.e;

    /* renamed from: com.google.firestore.v1.CommitRequest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15865a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15865a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15865a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15865a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15865a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15865a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15865a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15865a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<CommitRequest, Builder> implements CommitRequestOrBuilder {
    }

    static {
        CommitRequest commitRequest = new CommitRequest();
        DEFAULT_INSTANCE = commitRequest;
        GeneratedMessageLite.J(CommitRequest.class, commitRequest);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003\n", new Object[]{"database_", "writes_", Write.class, "transaction_"});
            case 3:
                return new CommitRequest();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<CommitRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (CommitRequest.class) {
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
