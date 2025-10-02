package com.google.firebase.firestore.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class MutationQueue extends GeneratedMessageLite<MutationQueue, Builder> implements MutationQueueOrBuilder {
    private static final MutationQueue DEFAULT_INSTANCE;
    public static final int LAST_ACKNOWLEDGED_BATCH_ID_FIELD_NUMBER = 1;
    public static final int LAST_STREAM_TOKEN_FIELD_NUMBER = 2;
    private static volatile Parser<MutationQueue> PARSER;
    private int lastAcknowledgedBatchId_;
    private ByteString lastStreamToken_ = ByteString.e;

    /* renamed from: com.google.firebase.firestore.proto.MutationQueue$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15551a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15551a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15551a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15551a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15551a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15551a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15551a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15551a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<MutationQueue, Builder> implements MutationQueueOrBuilder {
    }

    static {
        MutationQueue mutationQueue = new MutationQueue();
        DEFAULT_INSTANCE = mutationQueue;
        GeneratedMessageLite.J(MutationQueue.class, mutationQueue);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\n", new Object[]{"lastAcknowledgedBatchId_", "lastStreamToken_"});
            case 3:
                return new MutationQueue();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<MutationQueue> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (MutationQueue.class) {
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
