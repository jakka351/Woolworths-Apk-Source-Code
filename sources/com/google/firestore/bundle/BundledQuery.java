package com.google.firestore.bundle;

import com.google.firestore.v1.StructuredQuery;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class BundledQuery extends GeneratedMessageLite<BundledQuery, Builder> implements BundledQueryOrBuilder {
    private static final BundledQuery DEFAULT_INSTANCE;
    public static final int LIMIT_TYPE_FIELD_NUMBER = 3;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile Parser<BundledQuery> PARSER = null;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
    private int limitType_;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private String parent_ = "";

    /* renamed from: com.google.firestore.bundle.BundledQuery$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15854a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15854a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15854a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15854a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15854a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15854a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15854a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15854a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<BundledQuery, Builder> implements BundledQueryOrBuilder {
    }

    public enum LimitType implements Internal.EnumLite {
        FIRST(0),
        LAST(1),
        UNRECOGNIZED(-1);

        public final int d;

        /* renamed from: com.google.firestore.bundle.BundledQuery$LimitType$1, reason: invalid class name */
        public class AnonymousClass1 implements Internal.EnumLiteMap<LimitType> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite a(int i) {
                if (i == 0) {
                    return LimitType.FIRST;
                }
                if (i != 1) {
                    return null;
                }
                return LimitType.LAST;
            }
        }

        public static final class LimitTypeVerifier implements Internal.EnumVerifier {
            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean a(int i) {
                return (i != 0 ? i != 1 ? null : LimitType.LAST : LimitType.FIRST) != null;
            }
        }

        LimitType(int i) {
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class QueryTypeCase {
        public static final /* synthetic */ QueryTypeCase[] d = {new QueryTypeCase("STRUCTURED_QUERY", 0), new QueryTypeCase("QUERYTYPE_NOT_SET", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        QueryTypeCase EF5;

        public static QueryTypeCase valueOf(String str) {
            return (QueryTypeCase) Enum.valueOf(QueryTypeCase.class, str);
        }

        public static QueryTypeCase[] values() {
            return (QueryTypeCase[]) d.clone();
        }
    }

    static {
        BundledQuery bundledQuery = new BundledQuery();
        DEFAULT_INSTANCE = bundledQuery;
        GeneratedMessageLite.J(BundledQuery.class, bundledQuery);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003\f", new Object[]{"queryType_", "queryTypeCase_", "parent_", StructuredQuery.class, "limitType_"});
            case 3:
                return new BundledQuery();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<BundledQuery> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (BundledQuery.class) {
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
