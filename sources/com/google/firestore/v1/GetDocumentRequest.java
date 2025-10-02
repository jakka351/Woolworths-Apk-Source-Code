package com.google.firestore.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes6.dex */
public final class GetDocumentRequest extends GeneratedMessageLite<GetDocumentRequest, Builder> implements GetDocumentRequestOrBuilder {
    private static final GetDocumentRequest DEFAULT_INSTANCE;
    public static final int MASK_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<GetDocumentRequest> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 5;
    public static final int TRANSACTION_FIELD_NUMBER = 3;
    private int bitField0_;
    private Object consistencySelector_;
    private DocumentMask mask_;
    private int consistencySelectorCase_ = 0;
    private String name_ = "";

    /* renamed from: com.google.firestore.v1.GetDocumentRequest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15879a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15879a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15879a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15879a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15879a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15879a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15879a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15879a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<GetDocumentRequest, Builder> implements GetDocumentRequestOrBuilder {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ConsistencySelectorCase {
        public static final /* synthetic */ ConsistencySelectorCase[] d = {new ConsistencySelectorCase("TRANSACTION", 0), new ConsistencySelectorCase("READ_TIME", 1), new ConsistencySelectorCase("CONSISTENCYSELECTOR_NOT_SET", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        ConsistencySelectorCase EF5;

        public static ConsistencySelectorCase valueOf(String str) {
            return (ConsistencySelectorCase) Enum.valueOf(ConsistencySelectorCase.class, str);
        }

        public static ConsistencySelectorCase[] values() {
            return (ConsistencySelectorCase[]) d.clone();
        }
    }

    static {
        GetDocumentRequest getDocumentRequest = new GetDocumentRequest();
        DEFAULT_INSTANCE = getDocumentRequest;
        GeneratedMessageLite.J(GetDocumentRequest.class, getDocumentRequest);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003=\u0000\u0005<\u0000", new Object[]{"consistencySelector_", "consistencySelectorCase_", "bitField0_", "name_", "mask_", Timestamp.class});
            case 3:
                return new GetDocumentRequest();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<GetDocumentRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (GetDocumentRequest.class) {
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
