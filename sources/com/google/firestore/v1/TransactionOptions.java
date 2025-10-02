package com.google.firestore.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes6.dex */
public final class TransactionOptions extends GeneratedMessageLite<TransactionOptions, Builder> implements TransactionOptionsOrBuilder {
    private static final TransactionOptions DEFAULT_INSTANCE;
    private static volatile Parser<TransactionOptions> PARSER = null;
    public static final int READ_ONLY_FIELD_NUMBER = 2;
    public static final int READ_WRITE_FIELD_NUMBER = 3;
    private int modeCase_ = 0;
    private Object mode_;

    /* renamed from: com.google.firestore.v1.TransactionOptions$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15899a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15899a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15899a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15899a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15899a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15899a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15899a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15899a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<TransactionOptions, Builder> implements TransactionOptionsOrBuilder {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ModeCase {
        public static final /* synthetic */ ModeCase[] d = {new ModeCase("READ_ONLY", 0), new ModeCase("READ_WRITE", 1), new ModeCase("MODE_NOT_SET", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        ModeCase EF5;

        public static ModeCase valueOf(String str) {
            return (ModeCase) Enum.valueOf(ModeCase.class, str);
        }

        public static ModeCase[] values() {
            return (ModeCase[]) d.clone();
        }
    }

    public static final class ReadOnly extends GeneratedMessageLite<ReadOnly, Builder> implements ReadOnlyOrBuilder {
        private static final ReadOnly DEFAULT_INSTANCE;
        private static volatile Parser<ReadOnly> PARSER = null;
        public static final int READ_TIME_FIELD_NUMBER = 2;
        private int consistencySelectorCase_ = 0;
        private Object consistencySelector_;

        public static final class Builder extends GeneratedMessageLite.Builder<ReadOnly, Builder> implements ReadOnlyOrBuilder {
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ConsistencySelectorCase {
            public static final /* synthetic */ ConsistencySelectorCase[] d = {new ConsistencySelectorCase("READ_TIME", 0), new ConsistencySelectorCase("CONSISTENCYSELECTOR_NOT_SET", 1)};

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
            ReadOnly readOnly = new ReadOnly();
            DEFAULT_INSTANCE = readOnly;
            GeneratedMessageLite.J(ReadOnly.class, readOnly);
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
                    return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002<\u0000", new Object[]{"consistencySelector_", "consistencySelectorCase_", Timestamp.class});
                case 3:
                    return new ReadOnly();
                case 4:
                    return new Builder(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    Parser<ReadOnly> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ReadOnly.class) {
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

    public interface ReadOnlyOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class ReadWrite extends GeneratedMessageLite<ReadWrite, Builder> implements ReadWriteOrBuilder {
        private static final ReadWrite DEFAULT_INSTANCE;
        private static volatile Parser<ReadWrite> PARSER = null;
        public static final int RETRY_TRANSACTION_FIELD_NUMBER = 1;
        private ByteString retryTransaction_ = ByteString.e;

        public static final class Builder extends GeneratedMessageLite.Builder<ReadWrite, Builder> implements ReadWriteOrBuilder {
        }

        static {
            ReadWrite readWrite = new ReadWrite();
            DEFAULT_INSTANCE = readWrite;
            GeneratedMessageLite.J(ReadWrite.class, readWrite);
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
                    return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"retryTransaction_"});
                case 3:
                    return new ReadWrite();
                case 4:
                    return new Builder(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    Parser<ReadWrite> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ReadWrite.class) {
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

    public interface ReadWriteOrBuilder extends MessageLiteOrBuilder {
    }

    static {
        TransactionOptions transactionOptions = new TransactionOptions();
        DEFAULT_INSTANCE = transactionOptions;
        GeneratedMessageLite.J(TransactionOptions.class, transactionOptions);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"mode_", "modeCase_", ReadOnly.class, ReadWrite.class});
            case 3:
                return new TransactionOptions();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<TransactionOptions> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (TransactionOptions.class) {
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
