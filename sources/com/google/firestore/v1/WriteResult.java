package com.google.firestore.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes6.dex */
public final class WriteResult extends GeneratedMessageLite<WriteResult, Builder> implements WriteResultOrBuilder {
    private static final WriteResult DEFAULT_INSTANCE;
    private static volatile Parser<WriteResult> PARSER = null;
    public static final int TRANSFORM_RESULTS_FIELD_NUMBER = 2;
    public static final int UPDATE_TIME_FIELD_NUMBER = 1;
    private int bitField0_;
    private Internal.ProtobufList<Value> transformResults_ = GeneratedMessageLite.w();
    private Timestamp updateTime_;

    /* renamed from: com.google.firestore.v1.WriteResult$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15906a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15906a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15906a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15906a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15906a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15906a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15906a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15906a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<WriteResult, Builder> implements WriteResultOrBuilder {
    }

    static {
        WriteResult writeResult = new WriteResult();
        DEFAULT_INSTANCE = writeResult;
        GeneratedMessageLite.J(WriteResult.class, writeResult);
    }

    public final Value L(int i) {
        return this.transformResults_.get(i);
    }

    public final int M() {
        return this.transformResults_.size();
    }

    public final Timestamp N() {
        Timestamp timestamp = this.updateTime_;
        return timestamp == null ? Timestamp.N() : timestamp;
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "updateTime_", "transformResults_", Value.class});
            case 3:
                return new WriteResult();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<WriteResult> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (WriteResult.class) {
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
