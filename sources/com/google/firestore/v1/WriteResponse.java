package com.google.firestore.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes6.dex */
public final class WriteResponse extends GeneratedMessageLite<WriteResponse, Builder> implements WriteResponseOrBuilder {
    public static final int COMMIT_TIME_FIELD_NUMBER = 4;
    private static final WriteResponse DEFAULT_INSTANCE;
    private static volatile Parser<WriteResponse> PARSER = null;
    public static final int STREAM_ID_FIELD_NUMBER = 1;
    public static final int STREAM_TOKEN_FIELD_NUMBER = 2;
    public static final int WRITE_RESULTS_FIELD_NUMBER = 3;
    private int bitField0_;
    private Timestamp commitTime_;
    private String streamId_ = "";
    private ByteString streamToken_ = ByteString.e;
    private Internal.ProtobufList<WriteResult> writeResults_ = GeneratedMessageLite.w();

    /* renamed from: com.google.firestore.v1.WriteResponse$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15905a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15905a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15905a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15905a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15905a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15905a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15905a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15905a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<WriteResponse, Builder> implements WriteResponseOrBuilder {
    }

    static {
        WriteResponse writeResponse = new WriteResponse();
        DEFAULT_INSTANCE = writeResponse;
        GeneratedMessageLite.J(WriteResponse.class, writeResponse);
    }

    public static WriteResponse M() {
        return DEFAULT_INSTANCE;
    }

    public final Timestamp L() {
        Timestamp timestamp = this.commitTime_;
        return timestamp == null ? Timestamp.N() : timestamp;
    }

    public final ByteString N() {
        return this.streamToken_;
    }

    public final WriteResult O(int i) {
        return this.writeResults_.get(i);
    }

    public final int P() {
        return this.writeResults_.size();
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\n\u0003\u001b\u0004ဉ\u0000", new Object[]{"bitField0_", "streamId_", "streamToken_", "writeResults_", WriteResult.class, "commitTime_"});
            case 3:
                return new WriteResponse();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<WriteResponse> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (WriteResponse.class) {
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
