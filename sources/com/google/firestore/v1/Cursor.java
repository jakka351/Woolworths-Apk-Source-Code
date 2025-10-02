package com.google.firestore.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;
import java.util.List;

/* loaded from: classes6.dex */
public final class Cursor extends GeneratedMessageLite<Cursor, Builder> implements CursorOrBuilder {
    public static final int BEFORE_FIELD_NUMBER = 2;
    private static final Cursor DEFAULT_INSTANCE;
    private static volatile Parser<Cursor> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private boolean before_;
    private Internal.ProtobufList<Value> values_ = GeneratedMessageLite.w();

    /* renamed from: com.google.firestore.v1.Cursor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15868a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15868a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15868a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15868a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15868a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15868a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15868a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15868a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Cursor, Builder> implements CursorOrBuilder {
    }

    static {
        Cursor cursor = new Cursor();
        DEFAULT_INSTANCE = cursor;
        GeneratedMessageLite.J(Cursor.class, cursor);
    }

    public static void L(Cursor cursor, Iterable iterable) {
        Internal.ProtobufList<Value> protobufList = cursor.values_;
        if (!protobufList.r()) {
            cursor.values_ = GeneratedMessageLite.C(protobufList);
        }
        AbstractMessageLite.k(iterable, cursor.values_);
    }

    public static void M(Cursor cursor, boolean z) {
        cursor.before_ = z;
    }

    public static Cursor O() {
        return DEFAULT_INSTANCE;
    }

    public static Builder P() {
        return (Builder) DEFAULT_INSTANCE.r();
    }

    public final boolean N() {
        return this.before_;
    }

    public final List i() {
        return this.values_;
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0007", new Object[]{"values_", Value.class, "before_"});
            case 3:
                return new Cursor();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<Cursor> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Cursor.class) {
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
