package com.google.firestore.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class ExistenceFilter extends GeneratedMessageLite<ExistenceFilter, Builder> implements ExistenceFilterOrBuilder {
    public static final int COUNT_FIELD_NUMBER = 2;
    private static final ExistenceFilter DEFAULT_INSTANCE;
    private static volatile Parser<ExistenceFilter> PARSER = null;
    public static final int TARGET_ID_FIELD_NUMBER = 1;
    public static final int UNCHANGED_NAMES_FIELD_NUMBER = 3;
    private int bitField0_;
    private int count_;
    private int targetId_;
    private BloomFilter unchangedNames_;

    /* renamed from: com.google.firestore.v1.ExistenceFilter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15877a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15877a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15877a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15877a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15877a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15877a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15877a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15877a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ExistenceFilter, Builder> implements ExistenceFilterOrBuilder {
    }

    static {
        ExistenceFilter existenceFilter = new ExistenceFilter();
        DEFAULT_INSTANCE = existenceFilter;
        GeneratedMessageLite.J(ExistenceFilter.class, existenceFilter);
    }

    public static ExistenceFilter M() {
        return DEFAULT_INSTANCE;
    }

    public final int L() {
        return this.count_;
    }

    public final int N() {
        return this.targetId_;
    }

    public final BloomFilter O() {
        BloomFilter bloomFilter = this.unchangedNames_;
        return bloomFilter == null ? BloomFilter.M() : bloomFilter;
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003ဉ\u0000", new Object[]{"bitField0_", "targetId_", "count_", "unchangedNames_"});
            case 3:
                return new ExistenceFilter();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<ExistenceFilter> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ExistenceFilter.class) {
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
