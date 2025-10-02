package com.google.firestore.admin.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class Index extends GeneratedMessageLite<Index, Builder> implements IndexOrBuilder {
    private static final Index DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Index> PARSER = null;
    public static final int QUERY_SCOPE_FIELD_NUMBER = 2;
    public static final int STATE_FIELD_NUMBER = 4;
    private int queryScope_;
    private int state_;
    private String name_ = "";
    private Internal.ProtobufList<IndexField> fields_ = GeneratedMessageLite.w();

    /* renamed from: com.google.firestore.admin.v1.Index$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15850a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15850a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15850a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15850a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15850a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15850a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15850a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15850a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Index, Builder> implements IndexOrBuilder {
    }

    public static final class IndexField extends GeneratedMessageLite<IndexField, Builder> implements IndexFieldOrBuilder {
        public static final int ARRAY_CONFIG_FIELD_NUMBER = 3;
        private static final IndexField DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 1;
        public static final int ORDER_FIELD_NUMBER = 2;
        private static volatile Parser<IndexField> PARSER;
        private Object valueMode_;
        private int valueModeCase_ = 0;
        private String fieldPath_ = "";

        public enum ArrayConfig implements Internal.EnumLite {
            ARRAY_CONFIG_UNSPECIFIED(0),
            CONTAINS(1),
            UNRECOGNIZED(-1);

            public final int d;

            /* renamed from: com.google.firestore.admin.v1.Index$IndexField$ArrayConfig$1, reason: invalid class name */
            public class AnonymousClass1 implements Internal.EnumLiteMap<ArrayConfig> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final Internal.EnumLite a(int i) {
                    if (i == 0) {
                        return ArrayConfig.ARRAY_CONFIG_UNSPECIFIED;
                    }
                    if (i != 1) {
                        return null;
                    }
                    return ArrayConfig.CONTAINS;
                }
            }

            public static final class ArrayConfigVerifier implements Internal.EnumVerifier {
                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean a(int i) {
                    return (i != 0 ? i != 1 ? null : ArrayConfig.CONTAINS : ArrayConfig.ARRAY_CONFIG_UNSPECIFIED) != null;
                }
            }

            ArrayConfig(int i) {
                this.d = i;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int g() {
                if (this != UNRECOGNIZED) {
                    return this.d;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        public static final class Builder extends GeneratedMessageLite.Builder<IndexField, Builder> implements IndexFieldOrBuilder {
        }

        public enum Order implements Internal.EnumLite {
            ORDER_UNSPECIFIED(0),
            ASCENDING(1),
            DESCENDING(2),
            UNRECOGNIZED(-1);

            public final int d;

            /* renamed from: com.google.firestore.admin.v1.Index$IndexField$Order$1, reason: invalid class name */
            public class AnonymousClass1 implements Internal.EnumLiteMap<Order> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final Internal.EnumLite a(int i) {
                    return Order.a(i);
                }
            }

            public static final class OrderVerifier implements Internal.EnumVerifier {
                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean a(int i) {
                    return Order.a(i) != null;
                }
            }

            Order(int i2) {
                this.d = i2;
            }

            public static Order a(int i2) {
                if (i2 == 0) {
                    return ORDER_UNSPECIFIED;
                }
                if (i2 == 1) {
                    return ASCENDING;
                }
                if (i2 != 2) {
                    return null;
                }
                return DESCENDING;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int g() {
                if (this != UNRECOGNIZED) {
                    return this.d;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ValueModeCase {
            public static final ValueModeCase d;
            public static final ValueModeCase e;
            public static final ValueModeCase f;
            public static final /* synthetic */ ValueModeCase[] g;

            static {
                ValueModeCase valueModeCase = new ValueModeCase("ORDER", 0);
                d = valueModeCase;
                ValueModeCase valueModeCase2 = new ValueModeCase("ARRAY_CONFIG", 1);
                e = valueModeCase2;
                ValueModeCase valueModeCase3 = new ValueModeCase("VALUEMODE_NOT_SET", 2);
                f = valueModeCase3;
                g = new ValueModeCase[]{valueModeCase, valueModeCase2, valueModeCase3};
            }

            public static ValueModeCase valueOf(String str) {
                return (ValueModeCase) Enum.valueOf(ValueModeCase.class, str);
            }

            public static ValueModeCase[] values() {
                return (ValueModeCase[]) g.clone();
            }
        }

        static {
            IndexField indexField = new IndexField();
            DEFAULT_INSTANCE = indexField;
            GeneratedMessageLite.J(IndexField.class, indexField);
        }

        public final String L() {
            return this.fieldPath_;
        }

        public final Order M() {
            if (this.valueModeCase_ != 2) {
                return Order.ORDER_UNSPECIFIED;
            }
            Order orderA = Order.a(((Integer) this.valueMode_).intValue());
            return orderA == null ? Order.UNRECOGNIZED : orderA;
        }

        public final ValueModeCase N() {
            int i = this.valueModeCase_;
            if (i == 0) {
                return ValueModeCase.f;
            }
            if (i == 2) {
                return ValueModeCase.d;
            }
            if (i != 3) {
                return null;
            }
            return ValueModeCase.e;
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
                    return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003?\u0000", new Object[]{"valueMode_", "valueModeCase_", "fieldPath_"});
                case 3:
                    return new IndexField();
                case 4:
                    return new Builder(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    Parser<IndexField> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (IndexField.class) {
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

    public interface IndexFieldOrBuilder extends MessageLiteOrBuilder {
    }

    public enum QueryScope implements Internal.EnumLite {
        QUERY_SCOPE_UNSPECIFIED(0),
        COLLECTION(1),
        COLLECTION_GROUP(2),
        UNRECOGNIZED(-1);

        public final int d;

        /* renamed from: com.google.firestore.admin.v1.Index$QueryScope$1, reason: invalid class name */
        public class AnonymousClass1 implements Internal.EnumLiteMap<QueryScope> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite a(int i) {
                if (i == 0) {
                    return QueryScope.QUERY_SCOPE_UNSPECIFIED;
                }
                if (i == 1) {
                    return QueryScope.COLLECTION;
                }
                if (i != 2) {
                    return null;
                }
                return QueryScope.COLLECTION_GROUP;
            }
        }

        public static final class QueryScopeVerifier implements Internal.EnumVerifier {
            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean a(int i) {
                return (i != 0 ? i != 1 ? i != 2 ? null : QueryScope.COLLECTION_GROUP : QueryScope.COLLECTION : QueryScope.QUERY_SCOPE_UNSPECIFIED) != null;
            }
        }

        QueryScope(int i2) {
            this.d = i2;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int g() {
            if (this != UNRECOGNIZED) {
                return this.d;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public enum State implements Internal.EnumLite {
        STATE_UNSPECIFIED(0),
        CREATING(1),
        READY(2),
        NEEDS_REPAIR(3),
        UNRECOGNIZED(-1);

        public final int d;

        /* renamed from: com.google.firestore.admin.v1.Index$State$1, reason: invalid class name */
        public class AnonymousClass1 implements Internal.EnumLiteMap<State> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite a(int i) {
                if (i == 0) {
                    return State.STATE_UNSPECIFIED;
                }
                if (i == 1) {
                    return State.CREATING;
                }
                if (i == 2) {
                    return State.READY;
                }
                if (i != 3) {
                    return null;
                }
                return State.NEEDS_REPAIR;
            }
        }

        public static final class StateVerifier implements Internal.EnumVerifier {
            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean a(int i) {
                return (i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : State.NEEDS_REPAIR : State.READY : State.CREATING : State.STATE_UNSPECIFIED) != null;
            }
        }

        State(int i) {
            this.d = i;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int g() {
            if (this != UNRECOGNIZED) {
                return this.d;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        Index index = new Index();
        DEFAULT_INSTANCE = index;
        GeneratedMessageLite.J(Index.class, index);
    }

    public static Index M(byte[] bArr) {
        return (Index) GeneratedMessageLite.H(DEFAULT_INSTANCE, bArr);
    }

    public final Internal.ProtobufList L() {
        return this.fields_;
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003\u001b\u0004\f", new Object[]{"name_", "queryScope_", "fields_", IndexField.class, "state_"});
            case 3:
                return new Index();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<Index> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Index.class) {
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
