package com.google.firestore.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class BloomFilter extends GeneratedMessageLite<BloomFilter, Builder> implements BloomFilterOrBuilder {
    public static final int BITS_FIELD_NUMBER = 1;
    private static final BloomFilter DEFAULT_INSTANCE;
    public static final int HASH_COUNT_FIELD_NUMBER = 2;
    private static volatile Parser<BloomFilter> PARSER;
    private int bitField0_;
    private BitSequence bits_;
    private int hashCount_;

    /* renamed from: com.google.firestore.v1.BloomFilter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15864a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15864a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15864a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15864a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15864a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15864a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15864a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15864a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<BloomFilter, Builder> implements BloomFilterOrBuilder {
    }

    static {
        BloomFilter bloomFilter = new BloomFilter();
        DEFAULT_INSTANCE = bloomFilter;
        GeneratedMessageLite.J(BloomFilter.class, bloomFilter);
    }

    public static BloomFilter M() {
        return DEFAULT_INSTANCE;
    }

    public final BitSequence L() {
        BitSequence bitSequence = this.bits_;
        return bitSequence == null ? BitSequence.M() : bitSequence;
    }

    public final int N() {
        return this.hashCount_;
    }

    public final boolean O() {
        return (this.bitField0_ & 1) != 0;
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"bitField0_", "bits_", "hashCount_"});
            case 3:
                return new BloomFilter();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<BloomFilter> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (BloomFilter.class) {
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
