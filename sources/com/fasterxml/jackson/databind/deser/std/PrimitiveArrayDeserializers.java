package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsFailProvider;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes4.dex */
public abstract class PrimitiveArrayDeserializers<T> extends StdDeserializer<T> implements ContextualDeserializer {
    public final Boolean g;
    public transient Object h;
    public final NullValueProvider i;

    @JacksonStdImpl
    public static final class BooleanDeser extends PrimitiveArrayDeserializers<boolean[]> {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws JsonMappingException {
            boolean zO;
            int i;
            if (!jsonParser.x1()) {
                return (boolean[]) r0(jsonParser, deserializationContext);
            }
            ArrayBuilders arrayBuildersW = deserializationContext.w();
            if (arrayBuildersW.f14328a == null) {
                arrayBuildersW.f14328a = new ArrayBuilders.BooleanBuilder();
            }
            ArrayBuilders.BooleanBuilder booleanBuilder = arrayBuildersW.f14328a;
            boolean[] zArr = (boolean[]) booleanBuilder.d();
            int i2 = 0;
            while (true) {
                try {
                    JsonToken jsonTokenN1 = jsonParser.N1();
                    if (jsonTokenN1 == JsonToken.END_ARRAY) {
                        return (boolean[]) booleanBuilder.c(i2, zArr);
                    }
                    try {
                        if (jsonTokenN1 == JsonToken.VALUE_TRUE) {
                            zO = true;
                        } else {
                            if (jsonTokenN1 != JsonToken.VALUE_FALSE) {
                                if (jsonTokenN1 == JsonToken.VALUE_NULL) {
                                    NullValueProvider nullValueProvider = this.i;
                                    if (nullValueProvider != null) {
                                        nullValueProvider.c(deserializationContext);
                                    } else {
                                        d0(deserializationContext);
                                    }
                                } else {
                                    zO = O(jsonParser, deserializationContext);
                                }
                            }
                            zO = false;
                        }
                        zArr[i2] = zO;
                        i2 = i;
                    } catch (Exception e) {
                        e = e;
                        i2 = i;
                        throw JsonMappingException.i(e, zArr, booleanBuilder.d + i2);
                    }
                    if (i2 >= zArr.length) {
                        boolean[] zArr2 = (boolean[]) booleanBuilder.b(i2, zArr);
                        i2 = 0;
                        zArr = zArr2;
                    }
                    i = i2 + 1;
                } catch (Exception e2) {
                    e = e2;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final Object o0(Object obj, Object obj2) {
            boolean[] zArr = (boolean[]) obj;
            boolean[] zArr2 = (boolean[]) obj2;
            int length = zArr.length;
            int length2 = zArr2.length;
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + length2);
            System.arraycopy(zArr2, 0, zArrCopyOf, length, length2);
            return zArrCopyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final Object p0() {
            return new boolean[0];
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final Object s0(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return new boolean[]{O(jsonParser, deserializationContext)};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final PrimitiveArrayDeserializers t0(NullValueProvider nullValueProvider, Boolean bool) {
            return new BooleanDeser(this, nullValueProvider, bool);
        }
    }

    @JacksonStdImpl
    public static final class ByteDeser extends PrimitiveArrayDeserializers<byte[]> {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws JsonMappingException {
            byte bJ;
            int i;
            JsonToken jsonTokenE = jsonParser.e();
            if (jsonTokenE == JsonToken.VALUE_STRING) {
                try {
                    return jsonParser.h(deserializationContext.f.e.j);
                } catch (StreamReadException e) {
                    String strB = e.b();
                    if (strB.contains("base64")) {
                        deserializationContext.J(byte[].class, jsonParser.k0(), strB, new Object[0]);
                        throw null;
                    }
                }
            }
            if (jsonTokenE == JsonToken.VALUE_EMBEDDED_OBJECT) {
                Object objC = jsonParser.C();
                if (objC == null) {
                    return null;
                }
                if (objC instanceof byte[]) {
                    return (byte[]) objC;
                }
            }
            if (!jsonParser.x1()) {
                return (byte[]) r0(jsonParser, deserializationContext);
            }
            ArrayBuilders arrayBuildersW = deserializationContext.w();
            if (arrayBuildersW.b == null) {
                arrayBuildersW.b = new ArrayBuilders.ByteBuilder();
            }
            ArrayBuilders.ByteBuilder byteBuilder = arrayBuildersW.b;
            byte[] bArr = (byte[]) byteBuilder.d();
            int i2 = 0;
            while (true) {
                try {
                    JsonToken jsonTokenN1 = jsonParser.N1();
                    if (jsonTokenN1 == JsonToken.END_ARRAY) {
                        return (byte[]) byteBuilder.c(i2, bArr);
                    }
                    try {
                        if (jsonTokenN1 == JsonToken.VALUE_NUMBER_INT) {
                            bJ = jsonParser.j();
                        } else if (jsonTokenN1 == JsonToken.VALUE_NULL) {
                            NullValueProvider nullValueProvider = this.i;
                            if (nullValueProvider != null) {
                                nullValueProvider.c(deserializationContext);
                            } else {
                                d0(deserializationContext);
                                bJ = 0;
                            }
                        } else {
                            bJ = P(jsonParser, deserializationContext);
                        }
                        bArr[i2] = bJ;
                        i2 = i;
                    } catch (Exception e2) {
                        e = e2;
                        i2 = i;
                        throw JsonMappingException.i(e, bArr, byteBuilder.d + i2);
                    }
                    if (i2 >= bArr.length) {
                        byte[] bArr2 = (byte[]) byteBuilder.b(i2, bArr);
                        i2 = 0;
                        bArr = bArr2;
                    }
                    i = i2 + 1;
                } catch (Exception e3) {
                    e = e3;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers, com.fasterxml.jackson.databind.JsonDeserializer
        public final LogicalType n() {
            return LogicalType.n;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final Object o0(Object obj, Object obj2) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = (byte[]) obj2;
            int length = bArr.length;
            int length2 = bArr2.length;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
            System.arraycopy(bArr2, 0, bArrCopyOf, length, length2);
            return bArrCopyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final Object p0() {
            return new byte[0];
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final Object s0(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
            JsonToken jsonTokenE = jsonParser.e();
            if (jsonTokenE == JsonToken.VALUE_NUMBER_INT) {
                return new byte[]{jsonParser.j()};
            }
            if (jsonTokenE != JsonToken.VALUE_NULL) {
                deserializationContext.E(jsonParser, this.d.getComponentType());
                throw null;
            }
            NullValueProvider nullValueProvider = this.i;
            if (nullValueProvider != null) {
                nullValueProvider.c(deserializationContext);
                return (byte[]) j(deserializationContext);
            }
            d0(deserializationContext);
            return null;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final PrimitiveArrayDeserializers t0(NullValueProvider nullValueProvider, Boolean bool) {
            return new ByteDeser(this, nullValueProvider, bool);
        }
    }

    @JacksonStdImpl
    public static final class CharDeser extends PrimitiveArrayDeserializers<char[]> {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
            String strK0;
            if (jsonParser.a1(JsonToken.VALUE_STRING)) {
                char[] cArrM0 = jsonParser.m0();
                int iT0 = jsonParser.t0();
                int iR0 = jsonParser.r0();
                char[] cArr = new char[iR0];
                System.arraycopy(cArrM0, iT0, cArr, 0, iR0);
                return cArr;
            }
            if (!jsonParser.x1()) {
                if (jsonParser.a1(JsonToken.VALUE_EMBEDDED_OBJECT)) {
                    Object objC = jsonParser.C();
                    if (objC == null) {
                        return null;
                    }
                    if (objC instanceof char[]) {
                        return (char[]) objC;
                    }
                    if (objC instanceof String) {
                        return ((String) objC).toCharArray();
                    }
                    if (objC instanceof byte[]) {
                        return Base64Variants.b.e((byte[]) objC).toCharArray();
                    }
                }
                deserializationContext.E(jsonParser, this.d);
                throw null;
            }
            StringBuilder sb = new StringBuilder(64);
            while (true) {
                JsonToken jsonTokenN1 = jsonParser.N1();
                if (jsonTokenN1 == JsonToken.END_ARRAY) {
                    return sb.toString().toCharArray();
                }
                if (jsonTokenN1 == JsonToken.VALUE_STRING) {
                    strK0 = jsonParser.k0();
                } else {
                    if (jsonTokenN1 != JsonToken.VALUE_NULL) {
                        deserializationContext.E(jsonParser, Character.TYPE);
                        throw null;
                    }
                    NullValueProvider nullValueProvider = this.i;
                    if (nullValueProvider != null) {
                        nullValueProvider.c(deserializationContext);
                    } else {
                        d0(deserializationContext);
                        strK0 = WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR;
                    }
                }
                if (strK0.length() != 1) {
                    deserializationContext.V(this, "Cannot convert a JSON String of length %d into a char element of char array", Integer.valueOf(strK0.length()));
                    throw null;
                }
                sb.append(strK0.charAt(0));
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final Object o0(Object obj, Object obj2) {
            char[] cArr = (char[]) obj;
            char[] cArr2 = (char[]) obj2;
            int length = cArr.length;
            int length2 = cArr2.length;
            char[] cArrCopyOf = Arrays.copyOf(cArr, length + length2);
            System.arraycopy(cArr2, 0, cArrCopyOf, length, length2);
            return cArrCopyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final Object p0() {
            return new char[0];
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final Object s0(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
            deserializationContext.E(jsonParser, this.d);
            throw null;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final PrimitiveArrayDeserializers t0(NullValueProvider nullValueProvider, Boolean bool) {
            return this;
        }
    }

    @JacksonStdImpl
    public static final class DoubleDeser extends PrimitiveArrayDeserializers<double[]> {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws JsonMappingException {
            NullValueProvider nullValueProvider;
            if (!jsonParser.x1()) {
                return (double[]) r0(jsonParser, deserializationContext);
            }
            ArrayBuilders arrayBuildersW = deserializationContext.w();
            if (arrayBuildersW.g == null) {
                arrayBuildersW.g = new ArrayBuilders.DoubleBuilder();
            }
            ArrayBuilders.DoubleBuilder doubleBuilder = arrayBuildersW.g;
            double[] dArr = (double[]) doubleBuilder.d();
            int i = 0;
            while (true) {
                try {
                    JsonToken jsonTokenN1 = jsonParser.N1();
                    if (jsonTokenN1 == JsonToken.END_ARRAY) {
                        return (double[]) doubleBuilder.c(i, dArr);
                    }
                    if (jsonTokenN1 != JsonToken.VALUE_NULL || (nullValueProvider = this.i) == null) {
                        double dS = S(jsonParser, deserializationContext);
                        if (i >= dArr.length) {
                            double[] dArr2 = (double[]) doubleBuilder.b(i, dArr);
                            i = 0;
                            dArr = dArr2;
                        }
                        int i2 = i + 1;
                        try {
                            dArr[i] = dS;
                            i = i2;
                        } catch (Exception e) {
                            e = e;
                            i = i2;
                            throw JsonMappingException.i(e, dArr, doubleBuilder.d + i);
                        }
                    } else {
                        nullValueProvider.c(deserializationContext);
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final Object o0(Object obj, Object obj2) {
            double[] dArr = (double[]) obj;
            double[] dArr2 = (double[]) obj2;
            int length = dArr.length;
            int length2 = dArr2.length;
            double[] dArrCopyOf = Arrays.copyOf(dArr, length + length2);
            System.arraycopy(dArr2, 0, dArrCopyOf, length, length2);
            return dArrCopyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final Object p0() {
            return new double[0];
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final Object s0(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return new double[]{S(jsonParser, deserializationContext)};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final PrimitiveArrayDeserializers t0(NullValueProvider nullValueProvider, Boolean bool) {
            return new DoubleDeser(this, nullValueProvider, bool);
        }
    }

    @JacksonStdImpl
    public static final class FloatDeser extends PrimitiveArrayDeserializers<float[]> {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws JsonMappingException {
            NullValueProvider nullValueProvider;
            if (!jsonParser.x1()) {
                return (float[]) r0(jsonParser, deserializationContext);
            }
            ArrayBuilders arrayBuildersW = deserializationContext.w();
            if (arrayBuildersW.f == null) {
                arrayBuildersW.f = new ArrayBuilders.FloatBuilder();
            }
            ArrayBuilders.FloatBuilder floatBuilder = arrayBuildersW.f;
            float[] fArr = (float[]) floatBuilder.d();
            int i = 0;
            while (true) {
                try {
                    JsonToken jsonTokenN1 = jsonParser.N1();
                    if (jsonTokenN1 == JsonToken.END_ARRAY) {
                        return (float[]) floatBuilder.c(i, fArr);
                    }
                    if (jsonTokenN1 != JsonToken.VALUE_NULL || (nullValueProvider = this.i) == null) {
                        float fT = T(jsonParser, deserializationContext);
                        if (i >= fArr.length) {
                            float[] fArr2 = (float[]) floatBuilder.b(i, fArr);
                            i = 0;
                            fArr = fArr2;
                        }
                        int i2 = i + 1;
                        try {
                            fArr[i] = fT;
                            i = i2;
                        } catch (Exception e) {
                            e = e;
                            i = i2;
                            throw JsonMappingException.i(e, fArr, floatBuilder.d + i);
                        }
                    } else {
                        nullValueProvider.c(deserializationContext);
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final Object o0(Object obj, Object obj2) {
            float[] fArr = (float[]) obj;
            float[] fArr2 = (float[]) obj2;
            int length = fArr.length;
            int length2 = fArr2.length;
            float[] fArrCopyOf = Arrays.copyOf(fArr, length + length2);
            System.arraycopy(fArr2, 0, fArrCopyOf, length, length2);
            return fArrCopyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final Object p0() {
            return new float[0];
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final Object s0(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return new float[]{T(jsonParser, deserializationContext)};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final PrimitiveArrayDeserializers t0(NullValueProvider nullValueProvider, Boolean bool) {
            return new FloatDeser(this, nullValueProvider, bool);
        }
    }

    @JacksonStdImpl
    public static final class IntDeser extends PrimitiveArrayDeserializers<int[]> {
        public static final IntDeser j = new IntDeser(int[].class);

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws JsonMappingException {
            int iH;
            int i;
            if (!jsonParser.x1()) {
                return (int[]) r0(jsonParser, deserializationContext);
            }
            ArrayBuilders arrayBuildersW = deserializationContext.w();
            if (arrayBuildersW.d == null) {
                arrayBuildersW.d = new ArrayBuilders.IntBuilder();
            }
            ArrayBuilders.IntBuilder intBuilder = arrayBuildersW.d;
            int[] iArr = (int[]) intBuilder.d();
            int i2 = 0;
            while (true) {
                try {
                    JsonToken jsonTokenN1 = jsonParser.N1();
                    if (jsonTokenN1 == JsonToken.END_ARRAY) {
                        return (int[]) intBuilder.c(i2, iArr);
                    }
                    try {
                        if (jsonTokenN1 == JsonToken.VALUE_NUMBER_INT) {
                            iH = jsonParser.H();
                        } else if (jsonTokenN1 == JsonToken.VALUE_NULL) {
                            NullValueProvider nullValueProvider = this.i;
                            if (nullValueProvider != null) {
                                nullValueProvider.c(deserializationContext);
                            } else {
                                d0(deserializationContext);
                                iH = 0;
                            }
                        } else {
                            iH = U(jsonParser, deserializationContext);
                        }
                        iArr[i2] = iH;
                        i2 = i;
                    } catch (Exception e) {
                        e = e;
                        i2 = i;
                        throw JsonMappingException.i(e, iArr, intBuilder.d + i2);
                    }
                    if (i2 >= iArr.length) {
                        int[] iArr2 = (int[]) intBuilder.b(i2, iArr);
                        i2 = 0;
                        iArr = iArr2;
                    }
                    i = i2 + 1;
                } catch (Exception e2) {
                    e = e2;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final Object o0(Object obj, Object obj2) {
            int[] iArr = (int[]) obj;
            int[] iArr2 = (int[]) obj2;
            int length = iArr.length;
            int length2 = iArr2.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
            System.arraycopy(iArr2, 0, iArrCopyOf, length, length2);
            return iArrCopyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final Object p0() {
            return new int[0];
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final Object s0(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return new int[]{U(jsonParser, deserializationContext)};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final PrimitiveArrayDeserializers t0(NullValueProvider nullValueProvider, Boolean bool) {
            return new IntDeser(this, nullValueProvider, bool);
        }
    }

    @JacksonStdImpl
    public static final class LongDeser extends PrimitiveArrayDeserializers<long[]> {
        public static final LongDeser j = new LongDeser(long[].class);

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws JsonMappingException {
            long jR;
            int i;
            if (!jsonParser.x1()) {
                return (long[]) r0(jsonParser, deserializationContext);
            }
            ArrayBuilders arrayBuildersW = deserializationContext.w();
            if (arrayBuildersW.e == null) {
                arrayBuildersW.e = new ArrayBuilders.LongBuilder();
            }
            ArrayBuilders.LongBuilder longBuilder = arrayBuildersW.e;
            long[] jArr = (long[]) longBuilder.d();
            int i2 = 0;
            while (true) {
                try {
                    JsonToken jsonTokenN1 = jsonParser.N1();
                    if (jsonTokenN1 == JsonToken.END_ARRAY) {
                        return (long[]) longBuilder.c(i2, jArr);
                    }
                    try {
                        if (jsonTokenN1 == JsonToken.VALUE_NUMBER_INT) {
                            jR = jsonParser.R();
                        } else if (jsonTokenN1 == JsonToken.VALUE_NULL) {
                            NullValueProvider nullValueProvider = this.i;
                            if (nullValueProvider != null) {
                                nullValueProvider.c(deserializationContext);
                            } else {
                                d0(deserializationContext);
                                jR = 0;
                            }
                        } else {
                            jR = Y(jsonParser, deserializationContext);
                        }
                        jArr[i2] = jR;
                        i2 = i;
                    } catch (Exception e) {
                        e = e;
                        i2 = i;
                        throw JsonMappingException.i(e, jArr, longBuilder.d + i2);
                    }
                    if (i2 >= jArr.length) {
                        long[] jArr2 = (long[]) longBuilder.b(i2, jArr);
                        i2 = 0;
                        jArr = jArr2;
                    }
                    i = i2 + 1;
                } catch (Exception e2) {
                    e = e2;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final Object o0(Object obj, Object obj2) {
            long[] jArr = (long[]) obj;
            long[] jArr2 = (long[]) obj2;
            int length = jArr.length;
            int length2 = jArr2.length;
            long[] jArrCopyOf = Arrays.copyOf(jArr, length + length2);
            System.arraycopy(jArr2, 0, jArrCopyOf, length, length2);
            return jArrCopyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final Object p0() {
            return new long[0];
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final Object s0(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return new long[]{Y(jsonParser, deserializationContext)};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final PrimitiveArrayDeserializers t0(NullValueProvider nullValueProvider, Boolean bool) {
            return new LongDeser(this, nullValueProvider, bool);
        }
    }

    @JacksonStdImpl
    public static final class ShortDeser extends PrimitiveArrayDeserializers<short[]> {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws JsonMappingException {
            short sZ;
            int i;
            if (!jsonParser.x1()) {
                return (short[]) r0(jsonParser, deserializationContext);
            }
            ArrayBuilders arrayBuildersW = deserializationContext.w();
            if (arrayBuildersW.c == null) {
                arrayBuildersW.c = new ArrayBuilders.ShortBuilder();
            }
            ArrayBuilders.ShortBuilder shortBuilder = arrayBuildersW.c;
            short[] sArr = (short[]) shortBuilder.d();
            int i2 = 0;
            while (true) {
                try {
                    JsonToken jsonTokenN1 = jsonParser.N1();
                    if (jsonTokenN1 == JsonToken.END_ARRAY) {
                        return (short[]) shortBuilder.c(i2, sArr);
                    }
                    try {
                        if (jsonTokenN1 == JsonToken.VALUE_NULL) {
                            NullValueProvider nullValueProvider = this.i;
                            if (nullValueProvider != null) {
                                nullValueProvider.c(deserializationContext);
                            } else {
                                d0(deserializationContext);
                                sZ = 0;
                            }
                        } else {
                            sZ = Z(jsonParser, deserializationContext);
                        }
                        sArr[i2] = sZ;
                        i2 = i;
                    } catch (Exception e) {
                        e = e;
                        i2 = i;
                        throw JsonMappingException.i(e, sArr, shortBuilder.d + i2);
                    }
                    if (i2 >= sArr.length) {
                        short[] sArr2 = (short[]) shortBuilder.b(i2, sArr);
                        i2 = 0;
                        sArr = sArr2;
                    }
                    i = i2 + 1;
                } catch (Exception e2) {
                    e = e2;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final Object o0(Object obj, Object obj2) {
            short[] sArr = (short[]) obj;
            short[] sArr2 = (short[]) obj2;
            int length = sArr.length;
            int length2 = sArr2.length;
            short[] sArrCopyOf = Arrays.copyOf(sArr, length + length2);
            System.arraycopy(sArr2, 0, sArrCopyOf, length, length2);
            return sArrCopyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final Object p0() {
            return new short[0];
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final Object s0(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return new short[]{Z(jsonParser, deserializationContext)};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final PrimitiveArrayDeserializers t0(NullValueProvider nullValueProvider, Boolean bool) {
            return new ShortDeser(this, nullValueProvider, bool);
        }
    }

    public PrimitiveArrayDeserializers(Class cls) {
        super(cls);
        this.g = null;
        this.i = null;
    }

    public static PrimitiveArrayDeserializers q0(Class cls) {
        if (cls == Integer.TYPE) {
            return IntDeser.j;
        }
        if (cls == Long.TYPE) {
            return LongDeser.j;
        }
        if (cls == Byte.TYPE) {
            return new ByteDeser(byte[].class);
        }
        if (cls == Short.TYPE) {
            return new ShortDeser(short[].class);
        }
        if (cls == Float.TYPE) {
            return new FloatDeser(float[].class);
        }
        if (cls == Double.TYPE) {
            return new DoubleDeser(double[].class);
        }
        if (cls == Boolean.TYPE) {
            return new BooleanDeser(boolean[].class);
        }
        if (cls == Character.TYPE) {
            return new CharDeser(char[].class);
        }
        throw new IllegalStateException();
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public final JsonDeserializer b(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        Class cls = this.d;
        JsonFormat.Value valueH0 = StdDeserializer.h0(deserializationContext, beanProperty, cls);
        NullValueProvider nullsFailProvider = null;
        Boolean boolB = valueH0 != null ? valueH0.b(JsonFormat.Feature.d) : null;
        Nulls nulls = beanProperty != null ? beanProperty.getMetadata().j : deserializationContext.f.j.e.e;
        if (nulls == Nulls.d) {
            nullsFailProvider = NullsConstantProvider.e;
        } else if (nulls == Nulls.e) {
            nullsFailProvider = beanProperty == null ? new NullsFailProvider(null, deserializationContext.l(cls.getComponentType())) : new NullsFailProvider(beanProperty.b(), beanProperty.getType().k());
        }
        return (Objects.equals(boolB, this.g) && nullsFailProvider == this.i) ? this : t0(nullsFailProvider, boolB);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object f(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        Object objE = e(jsonParser, deserializationContext);
        return (obj == null || Array.getLength(obj) == 0) ? objE : o0(obj, objE);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final Object g(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.c(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final AccessPattern i() {
        return AccessPattern.e;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object j(DeserializationContext deserializationContext) {
        Object obj = this.h;
        if (obj != null) {
            return obj;
        }
        Object objP0 = p0();
        this.h = objP0;
        return objP0;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType n() {
        return LogicalType.d;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Boolean o(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    public abstract Object o0(Object obj, Object obj2);

    public abstract Object p0();

    public final Object r0(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
        if (jsonParser.a1(JsonToken.VALUE_STRING)) {
            return G(jsonParser, deserializationContext);
        }
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = this.g;
        if (bool2 == bool || (bool2 == null && deserializationContext.N(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return s0(jsonParser, deserializationContext);
        }
        deserializationContext.E(jsonParser, this.d);
        throw null;
    }

    public abstract Object s0(JsonParser jsonParser, DeserializationContext deserializationContext);

    public abstract PrimitiveArrayDeserializers t0(NullValueProvider nullValueProvider, Boolean bool);

    public PrimitiveArrayDeserializers(PrimitiveArrayDeserializers primitiveArrayDeserializers, NullValueProvider nullValueProvider, Boolean bool) {
        super(primitiveArrayDeserializers.d);
        this.g = bool;
        this.i = nullValueProvider;
    }
}
