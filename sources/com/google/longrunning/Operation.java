package com.google.longrunning;

import com.google.protobuf.Any;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import com.google.rpc.Status;

/* loaded from: classes6.dex */
public final class Operation extends GeneratedMessageLite<Operation, Builder> implements OperationOrBuilder {
    private static final Operation DEFAULT_INSTANCE;
    public static final int DONE_FIELD_NUMBER = 3;
    public static final int ERROR_FIELD_NUMBER = 4;
    public static final int METADATA_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Operation> PARSER = null;
    public static final int RESPONSE_FIELD_NUMBER = 5;
    private int bitField0_;
    private boolean done_;
    private Any metadata_;
    private Object result_;
    private int resultCase_ = 0;
    private String name_ = "";

    /* renamed from: com.google.longrunning.Operation$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15972a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15972a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15972a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15972a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15972a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15972a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15972a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15972a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Operation, Builder> implements OperationOrBuilder {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ResultCase {
        public static final /* synthetic */ ResultCase[] d = {new ResultCase("ERROR", 0), new ResultCase("RESPONSE", 1), new ResultCase("RESULT_NOT_SET", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        ResultCase EF5;

        public static ResultCase valueOf(String str) {
            return (ResultCase) Enum.valueOf(ResultCase.class, str);
        }

        public static ResultCase[] values() {
            return (ResultCase[]) d.clone();
        }
    }

    static {
        Operation operation = new Operation();
        DEFAULT_INSTANCE = operation;
        GeneratedMessageLite.J(Operation.class, operation);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u0007\u0004<\u0000\u0005<\u0000", new Object[]{"result_", "resultCase_", "bitField0_", "name_", "metadata_", "done_", Status.class, Any.class});
            case 3:
                return new Operation();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<Operation> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Operation.class) {
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
