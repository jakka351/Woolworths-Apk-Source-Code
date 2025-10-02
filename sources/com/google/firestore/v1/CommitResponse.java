package com.google.firestore.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes6.dex */
public final class CommitResponse extends GeneratedMessageLite<CommitResponse, Builder> implements CommitResponseOrBuilder {
    public static final int COMMIT_TIME_FIELD_NUMBER = 2;
    private static final CommitResponse DEFAULT_INSTANCE;
    private static volatile Parser<CommitResponse> PARSER = null;
    public static final int WRITE_RESULTS_FIELD_NUMBER = 1;
    private int bitField0_;
    private Timestamp commitTime_;
    private Internal.ProtobufList<WriteResult> writeResults_ = GeneratedMessageLite.w();

    /* renamed from: com.google.firestore.v1.CommitResponse$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15866a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15866a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15866a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15866a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15866a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15866a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15866a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15866a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<CommitResponse, Builder> implements CommitResponseOrBuilder {
    }

    static {
        CommitResponse commitResponse = new CommitResponse();
        DEFAULT_INSTANCE = commitResponse;
        GeneratedMessageLite.J(CommitResponse.class, commitResponse);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"bitField0_", "writeResults_", WriteResult.class, "commitTime_"});
            case 3:
                return new CommitResponse();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<CommitResponse> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (CommitResponse.class) {
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
