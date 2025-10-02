package com.google.firestore.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class BitSequence extends GeneratedMessageLite<BitSequence, Builder> implements BitSequenceOrBuilder {
    public static final int BITMAP_FIELD_NUMBER = 1;
    private static final BitSequence DEFAULT_INSTANCE;
    public static final int PADDING_FIELD_NUMBER = 2;
    private static volatile Parser<BitSequence> PARSER;
    private ByteString bitmap_ = ByteString.e;
    private int padding_;

    /* renamed from: com.google.firestore.v1.BitSequence$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15863a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15863a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15863a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15863a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15863a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15863a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15863a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15863a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<BitSequence, Builder> implements BitSequenceOrBuilder {
    }

    static {
        BitSequence bitSequence = new BitSequence();
        DEFAULT_INSTANCE = bitSequence;
        GeneratedMessageLite.J(BitSequence.class, bitSequence);
    }

    public static BitSequence M() {
        return DEFAULT_INSTANCE;
    }

    public final ByteString L() {
        return this.bitmap_;
    }

    public final int N() {
        return this.padding_;
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\u0004", new Object[]{"bitmap_", "padding_"});
            case 3:
                return new BitSequence();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<BitSequence> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (BitSequence.class) {
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
