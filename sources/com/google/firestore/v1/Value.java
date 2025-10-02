package com.google.firestore.v1;

import com.google.firestore.v1.MapValue;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.NullValue;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import com.google.type.LatLng;

/* loaded from: classes6.dex */
public final class Value extends GeneratedMessageLite<Value, Builder> implements ValueOrBuilder {
    public static final int ARRAY_VALUE_FIELD_NUMBER = 9;
    public static final int BOOLEAN_VALUE_FIELD_NUMBER = 1;
    public static final int BYTES_VALUE_FIELD_NUMBER = 18;
    private static final Value DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 3;
    public static final int GEO_POINT_VALUE_FIELD_NUMBER = 8;
    public static final int INTEGER_VALUE_FIELD_NUMBER = 2;
    public static final int MAP_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 11;
    private static volatile Parser<Value> PARSER = null;
    public static final int REFERENCE_VALUE_FIELD_NUMBER = 5;
    public static final int STRING_VALUE_FIELD_NUMBER = 17;
    public static final int TIMESTAMP_VALUE_FIELD_NUMBER = 10;
    private int valueTypeCase_ = 0;
    private Object valueType_;

    /* renamed from: com.google.firestore.v1.Value$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15901a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15901a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15901a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15901a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15901a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15901a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15901a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15901a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Value, Builder> implements ValueOrBuilder {
        public final void t(MapValue.Builder builder) {
            p();
            Value.R((Value) this.e, (MapValue) builder.m());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ValueTypeCase {
        public static final ValueTypeCase d;
        public static final ValueTypeCase e;
        public static final ValueTypeCase f;
        public static final ValueTypeCase g;
        public static final ValueTypeCase h;
        public static final ValueTypeCase i;
        public static final ValueTypeCase j;
        public static final ValueTypeCase k;
        public static final ValueTypeCase l;
        public static final ValueTypeCase m;
        public static final ValueTypeCase n;
        public static final ValueTypeCase o;
        public static final /* synthetic */ ValueTypeCase[] p;

        static {
            ValueTypeCase valueTypeCase = new ValueTypeCase("NULL_VALUE", 0);
            d = valueTypeCase;
            ValueTypeCase valueTypeCase2 = new ValueTypeCase("BOOLEAN_VALUE", 1);
            e = valueTypeCase2;
            ValueTypeCase valueTypeCase3 = new ValueTypeCase("INTEGER_VALUE", 2);
            f = valueTypeCase3;
            ValueTypeCase valueTypeCase4 = new ValueTypeCase("DOUBLE_VALUE", 3);
            g = valueTypeCase4;
            ValueTypeCase valueTypeCase5 = new ValueTypeCase("TIMESTAMP_VALUE", 4);
            h = valueTypeCase5;
            ValueTypeCase valueTypeCase6 = new ValueTypeCase("STRING_VALUE", 5);
            i = valueTypeCase6;
            ValueTypeCase valueTypeCase7 = new ValueTypeCase("BYTES_VALUE", 6);
            j = valueTypeCase7;
            ValueTypeCase valueTypeCase8 = new ValueTypeCase("REFERENCE_VALUE", 7);
            k = valueTypeCase8;
            ValueTypeCase valueTypeCase9 = new ValueTypeCase("GEO_POINT_VALUE", 8);
            l = valueTypeCase9;
            ValueTypeCase valueTypeCase10 = new ValueTypeCase("ARRAY_VALUE", 9);
            m = valueTypeCase10;
            ValueTypeCase valueTypeCase11 = new ValueTypeCase("MAP_VALUE", 10);
            n = valueTypeCase11;
            ValueTypeCase valueTypeCase12 = new ValueTypeCase("VALUETYPE_NOT_SET", 11);
            o = valueTypeCase12;
            p = new ValueTypeCase[]{valueTypeCase, valueTypeCase2, valueTypeCase3, valueTypeCase4, valueTypeCase5, valueTypeCase6, valueTypeCase7, valueTypeCase8, valueTypeCase9, valueTypeCase10, valueTypeCase11, valueTypeCase12};
        }

        public static ValueTypeCase valueOf(String str) {
            return (ValueTypeCase) Enum.valueOf(ValueTypeCase.class, str);
        }

        public static ValueTypeCase[] values() {
            return (ValueTypeCase[]) p.clone();
        }
    }

    static {
        Value value = new Value();
        DEFAULT_INSTANCE = value;
        GeneratedMessageLite.J(Value.class, value);
    }

    public static void L(Value value, Timestamp timestamp) {
        value.getClass();
        value.valueType_ = timestamp;
        value.valueTypeCase_ = 10;
    }

    public static void M(Value value, String str) {
        value.getClass();
        value.valueTypeCase_ = 17;
        value.valueType_ = str;
    }

    public static void N(Value value, ByteString byteString) {
        value.getClass();
        byteString.getClass();
        value.valueTypeCase_ = 18;
        value.valueType_ = byteString;
    }

    public static void O(Value value, String str) {
        value.getClass();
        str.getClass();
        value.valueTypeCase_ = 5;
        value.valueType_ = str;
    }

    public static void P(Value value, LatLng latLng) {
        value.getClass();
        value.valueType_ = latLng;
        value.valueTypeCase_ = 8;
    }

    public static void Q(ArrayValue arrayValue, Value value) {
        value.getClass();
        arrayValue.getClass();
        value.valueType_ = arrayValue;
        value.valueTypeCase_ = 9;
    }

    public static void R(Value value, MapValue mapValue) {
        value.getClass();
        mapValue.getClass();
        value.valueType_ = mapValue;
        value.valueTypeCase_ = 6;
    }

    public static void S(Value value) {
        value.getClass();
        value.valueType_ = Integer.valueOf(NullValue.NULL_VALUE.g());
        value.valueTypeCase_ = 11;
    }

    public static void T(Value value) {
        value.valueTypeCase_ = 1;
        value.valueType_ = Boolean.FALSE;
    }

    public static void U(Value value, long j) {
        value.valueTypeCase_ = 2;
        value.valueType_ = Long.valueOf(j);
    }

    public static void V(Value value, double d) {
        value.valueTypeCase_ = 3;
        value.valueType_ = Double.valueOf(d);
    }

    public static Value Z() {
        return DEFAULT_INSTANCE;
    }

    public static Builder j0() {
        return (Builder) DEFAULT_INSTANCE.r();
    }

    public final ArrayValue W() {
        return this.valueTypeCase_ == 9 ? (ArrayValue) this.valueType_ : ArrayValue.O();
    }

    public final boolean X() {
        if (this.valueTypeCase_ == 1) {
            return ((Boolean) this.valueType_).booleanValue();
        }
        return false;
    }

    public final ByteString Y() {
        return this.valueTypeCase_ == 18 ? (ByteString) this.valueType_ : ByteString.e;
    }

    public final double a0() {
        if (this.valueTypeCase_ == 3) {
            return ((Double) this.valueType_).doubleValue();
        }
        return 0.0d;
    }

    public final LatLng b0() {
        return this.valueTypeCase_ == 8 ? (LatLng) this.valueType_ : LatLng.N();
    }

    public final long c0() {
        if (this.valueTypeCase_ == 2) {
            return ((Long) this.valueType_).longValue();
        }
        return 0L;
    }

    public final MapValue d0() {
        return this.valueTypeCase_ == 6 ? (MapValue) this.valueType_ : MapValue.M();
    }

    public final String e0() {
        return this.valueTypeCase_ == 5 ? (String) this.valueType_ : "";
    }

    public final String f0() {
        return this.valueTypeCase_ == 17 ? (String) this.valueType_ : "";
    }

    public final Timestamp g0() {
        return this.valueTypeCase_ == 10 ? (Timestamp) this.valueType_ : Timestamp.N();
    }

    public final ValueTypeCase h0() {
        int i = this.valueTypeCase_;
        if (i == 0) {
            return ValueTypeCase.o;
        }
        if (i == 1) {
            return ValueTypeCase.e;
        }
        if (i == 2) {
            return ValueTypeCase.f;
        }
        if (i == 3) {
            return ValueTypeCase.g;
        }
        if (i == 5) {
            return ValueTypeCase.k;
        }
        if (i == 6) {
            return ValueTypeCase.n;
        }
        if (i == 17) {
            return ValueTypeCase.i;
        }
        if (i == 18) {
            return ValueTypeCase.j;
        }
        switch (i) {
            case 8:
                return ValueTypeCase.l;
            case 9:
                return ValueTypeCase.m;
            case 10:
                return ValueTypeCase.h;
            case 11:
                return ValueTypeCase.d;
            default:
                return null;
        }
    }

    public final boolean i0() {
        return this.valueTypeCase_ == 11;
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0000\u0001\u0012\u000b\u0000\u0000\u0000\u0001:\u0000\u00025\u0000\u00033\u0000\u0005Ȼ\u0000\u0006<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b?\u0000\u0011Ȼ\u0000\u0012=\u0000", new Object[]{"valueType_", "valueTypeCase_", MapValue.class, LatLng.class, ArrayValue.class, Timestamp.class});
            case 3:
                return new Value();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<Value> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Value.class) {
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
