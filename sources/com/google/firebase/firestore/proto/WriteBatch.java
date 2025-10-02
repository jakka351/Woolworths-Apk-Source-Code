package com.google.firebase.firestore.proto;

import com.google.firestore.v1.Write;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes6.dex */
public final class WriteBatch extends GeneratedMessageLite<WriteBatch, Builder> implements WriteBatchOrBuilder {
    public static final int BASE_WRITES_FIELD_NUMBER = 4;
    public static final int BATCH_ID_FIELD_NUMBER = 1;
    private static final WriteBatch DEFAULT_INSTANCE;
    public static final int LOCAL_WRITE_TIME_FIELD_NUMBER = 3;
    private static volatile Parser<WriteBatch> PARSER = null;
    public static final int WRITES_FIELD_NUMBER = 2;
    private int batchId_;
    private int bitField0_;
    private Timestamp localWriteTime_;
    private Internal.ProtobufList<Write> writes_ = GeneratedMessageLite.w();
    private Internal.ProtobufList<Write> baseWrites_ = GeneratedMessageLite.w();

    /* renamed from: com.google.firebase.firestore.proto.WriteBatch$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15556a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15556a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15556a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15556a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15556a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15556a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15556a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15556a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<WriteBatch, Builder> implements WriteBatchOrBuilder {
    }

    static {
        WriteBatch writeBatch = new WriteBatch();
        DEFAULT_INSTANCE = writeBatch;
        GeneratedMessageLite.J(WriteBatch.class, writeBatch);
    }

    public static WriteBatch R(ByteString byteString) throws InvalidProtocolBufferException {
        WriteBatch writeBatch = DEFAULT_INSTANCE;
        ExtensionRegistryLite extensionRegistryLiteB = ExtensionRegistryLite.b();
        CodedInputStream codedInputStreamT = byteString.t();
        GeneratedMessageLite generatedMessageLiteI = GeneratedMessageLite.I(writeBatch, codedInputStreamT, extensionRegistryLiteB);
        codedInputStreamT.a(0);
        GeneratedMessageLite.q(generatedMessageLiteI);
        GeneratedMessageLite.q(generatedMessageLiteI);
        return (WriteBatch) generatedMessageLiteI;
    }

    public static WriteBatch S(byte[] bArr) {
        return (WriteBatch) GeneratedMessageLite.H(DEFAULT_INSTANCE, bArr);
    }

    public final Write L(int i) {
        return this.baseWrites_.get(i);
    }

    public final int M() {
        return this.baseWrites_.size();
    }

    public final int N() {
        return this.batchId_;
    }

    public final Timestamp O() {
        Timestamp timestamp = this.localWriteTime_;
        return timestamp == null ? Timestamp.N() : timestamp;
    }

    public final Write P(int i) {
        return this.writes_.get(i);
    }

    public final int Q() {
        return this.writes_.size();
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u0004\u0002\u001b\u0003ဉ\u0000\u0004\u001b", new Object[]{"bitField0_", "batchId_", "writes_", Write.class, "localWriteTime_", "baseWrites_", Write.class});
            case 3:
                return new WriteBatch();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<WriteBatch> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (WriteBatch.class) {
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
