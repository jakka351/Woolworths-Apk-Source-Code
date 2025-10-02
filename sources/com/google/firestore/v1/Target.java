package com.google.firestore.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Int32Value;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes6.dex */
public final class Target extends GeneratedMessageLite<Target, Builder> implements TargetOrBuilder {
    private static final Target DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 3;
    public static final int EXPECTED_COUNT_FIELD_NUMBER = 12;
    public static final int ONCE_FIELD_NUMBER = 6;
    private static volatile Parser<Target> PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int READ_TIME_FIELD_NUMBER = 11;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_ID_FIELD_NUMBER = 5;
    private int bitField0_;
    private Int32Value expectedCount_;
    private boolean once_;
    private Object resumeType_;
    private int targetId_;
    private Object targetType_;
    private int targetTypeCase_ = 0;
    private int resumeTypeCase_ = 0;

    /* renamed from: com.google.firestore.v1.Target$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15897a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15897a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15897a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15897a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15897a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15897a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15897a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15897a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Target, Builder> implements TargetOrBuilder {
    }

    public static final class DocumentsTarget extends GeneratedMessageLite<DocumentsTarget, Builder> implements DocumentsTargetOrBuilder {
        private static final DocumentsTarget DEFAULT_INSTANCE;
        public static final int DOCUMENTS_FIELD_NUMBER = 2;
        private static volatile Parser<DocumentsTarget> PARSER;
        private Internal.ProtobufList<String> documents_ = GeneratedMessageLite.w();

        public static final class Builder extends GeneratedMessageLite.Builder<DocumentsTarget, Builder> implements DocumentsTargetOrBuilder {
        }

        static {
            DocumentsTarget documentsTarget = new DocumentsTarget();
            DEFAULT_INSTANCE = documentsTarget;
            GeneratedMessageLite.J(DocumentsTarget.class, documentsTarget);
        }

        public static void L(DocumentsTarget documentsTarget, String str) {
            documentsTarget.getClass();
            str.getClass();
            Internal.ProtobufList<String> protobufList = documentsTarget.documents_;
            if (!protobufList.r()) {
                documentsTarget.documents_ = GeneratedMessageLite.C(protobufList);
            }
            documentsTarget.documents_.add(str);
        }

        public static DocumentsTarget M() {
            return DEFAULT_INSTANCE;
        }

        public static Builder P() {
            return (Builder) DEFAULT_INSTANCE.r();
        }

        public final String N() {
            return this.documents_.get(0);
        }

        public final int O() {
            return this.documents_.size();
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
                    return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002Ț", new Object[]{"documents_"});
                case 3:
                    return new DocumentsTarget();
                case 4:
                    return new Builder(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    Parser<DocumentsTarget> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (DocumentsTarget.class) {
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

    public interface DocumentsTargetOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class QueryTarget extends GeneratedMessageLite<QueryTarget, Builder> implements QueryTargetOrBuilder {
        private static final QueryTarget DEFAULT_INSTANCE;
        public static final int PARENT_FIELD_NUMBER = 1;
        private static volatile Parser<QueryTarget> PARSER = null;
        public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
        private Object queryType_;
        private int queryTypeCase_ = 0;
        private String parent_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<QueryTarget, Builder> implements QueryTargetOrBuilder {
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
            QueryTarget queryTarget = new QueryTarget();
            DEFAULT_INSTANCE = queryTarget;
            GeneratedMessageLite.J(QueryTarget.class, queryTarget);
        }

        public static void L(QueryTarget queryTarget, StructuredQuery structuredQuery) {
            queryTarget.getClass();
            queryTarget.queryType_ = structuredQuery;
            queryTarget.queryTypeCase_ = 2;
        }

        public static void M(QueryTarget queryTarget, String str) {
            queryTarget.getClass();
            str.getClass();
            queryTarget.parent_ = str;
        }

        public static QueryTarget N() {
            return DEFAULT_INSTANCE;
        }

        public static Builder Q() {
            return (Builder) DEFAULT_INSTANCE.r();
        }

        public final String O() {
            return this.parent_;
        }

        public final StructuredQuery P() {
            return this.queryTypeCase_ == 2 ? (StructuredQuery) this.queryType_ : StructuredQuery.R();
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
                    return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"queryType_", "queryTypeCase_", "parent_", StructuredQuery.class});
                case 3:
                    return new QueryTarget();
                case 4:
                    return new Builder(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    Parser<QueryTarget> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (QueryTarget.class) {
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

    public interface QueryTargetOrBuilder extends MessageLiteOrBuilder {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ResumeTypeCase {
        public static final /* synthetic */ ResumeTypeCase[] d = {new ResumeTypeCase("RESUME_TOKEN", 0), new ResumeTypeCase("READ_TIME", 1), new ResumeTypeCase("RESUMETYPE_NOT_SET", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        ResumeTypeCase EF5;

        public static ResumeTypeCase valueOf(String str) {
            return (ResumeTypeCase) Enum.valueOf(ResumeTypeCase.class, str);
        }

        public static ResumeTypeCase[] values() {
            return (ResumeTypeCase[]) d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TargetTypeCase {
        public static final /* synthetic */ TargetTypeCase[] d = {new TargetTypeCase("QUERY", 0), new TargetTypeCase("DOCUMENTS", 1), new TargetTypeCase("TARGETTYPE_NOT_SET", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        TargetTypeCase EF5;

        public static TargetTypeCase valueOf(String str) {
            return (TargetTypeCase) Enum.valueOf(TargetTypeCase.class, str);
        }

        public static TargetTypeCase[] values() {
            return (TargetTypeCase[]) d.clone();
        }
    }

    static {
        Target target = new Target();
        DEFAULT_INSTANCE = target;
        GeneratedMessageLite.J(Target.class, target);
    }

    public static void L(Target target, QueryTarget queryTarget) {
        target.getClass();
        target.targetType_ = queryTarget;
        target.targetTypeCase_ = 2;
    }

    public static void M(Target target, DocumentsTarget documentsTarget) {
        target.getClass();
        target.targetType_ = documentsTarget;
        target.targetTypeCase_ = 3;
    }

    public static void N(Target target, ByteString byteString) {
        target.getClass();
        byteString.getClass();
        target.resumeTypeCase_ = 4;
        target.resumeType_ = byteString;
    }

    public static void O(Target target, Timestamp timestamp) {
        target.getClass();
        target.resumeType_ = timestamp;
        target.resumeTypeCase_ = 11;
    }

    public static void P(Target target, int i) {
        target.targetId_ = i;
    }

    public static void Q(Target target, Int32Value int32Value) {
        target.getClass();
        target.expectedCount_ = int32Value;
        target.bitField0_ |= 1;
    }

    public static Builder R() {
        return (Builder) DEFAULT_INSTANCE.r();
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0007\u0002\u0001\u0002\f\u0007\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004=\u0001\u0005\u0004\u0006\u0007\u000b<\u0001\fဉ\u0000", new Object[]{"targetType_", "targetTypeCase_", "resumeType_", "resumeTypeCase_", "bitField0_", QueryTarget.class, DocumentsTarget.class, "targetId_", "once_", Timestamp.class, "expectedCount_"});
            case 3:
                return new Target();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<Target> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Target.class) {
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
