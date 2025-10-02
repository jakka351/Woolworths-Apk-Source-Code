package com.google.firestore.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class ArrayValue extends GeneratedMessageLite<ArrayValue, Builder> implements ArrayValueOrBuilder {
    private static final ArrayValue DEFAULT_INSTANCE;
    private static volatile Parser<ArrayValue> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Value> values_ = GeneratedMessageLite.w();

    /* renamed from: com.google.firestore.v1.ArrayValue$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15858a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15858a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15858a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15858a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15858a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15858a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15858a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15858a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ArrayValue, Builder> implements ArrayValueOrBuilder {
        @Override // com.google.firestore.v1.ArrayValueOrBuilder
        public final List i() {
            return Collections.unmodifiableList(((ArrayValue) this.e).i());
        }
    }

    static {
        ArrayValue arrayValue = new ArrayValue();
        DEFAULT_INSTANCE = arrayValue;
        GeneratedMessageLite.J(ArrayValue.class, arrayValue);
    }

    public static void L(ArrayValue arrayValue, Value value) {
        arrayValue.getClass();
        value.getClass();
        Internal.ProtobufList<Value> protobufList = arrayValue.values_;
        if (!protobufList.r()) {
            arrayValue.values_ = GeneratedMessageLite.C(protobufList);
        }
        arrayValue.values_.add(value);
    }

    public static void M(ArrayValue arrayValue, Iterable iterable) {
        Internal.ProtobufList<Value> protobufList = arrayValue.values_;
        if (!protobufList.r()) {
            arrayValue.values_ = GeneratedMessageLite.C(protobufList);
        }
        AbstractMessageLite.k(iterable, arrayValue.values_);
    }

    public static void N(ArrayValue arrayValue, int i) {
        Internal.ProtobufList<Value> protobufList = arrayValue.values_;
        if (!protobufList.r()) {
            arrayValue.values_ = GeneratedMessageLite.C(protobufList);
        }
        arrayValue.values_.remove(i);
    }

    public static ArrayValue O() {
        return DEFAULT_INSTANCE;
    }

    public static Builder R() {
        return (Builder) DEFAULT_INSTANCE.r();
    }

    public final Value P(int i) {
        return this.values_.get(i);
    }

    public final int Q() {
        return this.values_.size();
    }

    @Override // com.google.firestore.v1.ArrayValueOrBuilder
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", Value.class});
            case 3:
                return new ArrayValue();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<ArrayValue> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ArrayValue.class) {
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
