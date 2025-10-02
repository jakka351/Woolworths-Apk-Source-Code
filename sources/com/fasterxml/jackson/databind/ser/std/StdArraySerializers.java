package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class StdArraySerializers {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f14322a;

    @JacksonStdImpl
    public static class BooleanArraySerializer extends ArraySerializerBase<boolean[]> {
        static {
            TypeFactory.g.getClass();
            TypeFactory.n(Boolean.class);
        }

        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public final boolean d(SerializerProvider serializerProvider, Object obj) {
            return ((boolean[]) obj).length == 0;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.JsonSerializer
        public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            boolean[] zArr = (boolean[]) obj;
            int length = zArr.length;
            int i = 0;
            if (length == 1 && q(serializerProvider)) {
                int length2 = zArr.length;
                while (i < length2) {
                    jsonGenerator.A(zArr[i]);
                    i++;
                }
                return;
            }
            jsonGenerator.a1(length, zArr);
            int length3 = zArr.length;
            while (i < length3) {
                jsonGenerator.A(zArr[i]);
                i++;
            }
            jsonGenerator.F();
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public final ContainerSerializer o(TypeSerializer typeSerializer) {
            return this;
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public final boolean p(Object obj) {
            return ((boolean[]) obj).length == 1;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public final JsonSerializer r(BeanProperty beanProperty, Boolean bool) {
            return new BooleanArraySerializer(this, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public final void s(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            for (boolean z : (boolean[]) obj) {
                jsonGenerator.A(z);
            }
        }
    }

    @JacksonStdImpl
    public static class CharArraySerializer extends StdSerializer<char[]> {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public final boolean d(SerializerProvider serializerProvider, Object obj) {
            return ((char[]) obj).length == 0;
        }

        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            char[] cArr = (char[]) obj;
            if (!serializerProvider.d.r(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
                jsonGenerator.K1(cArr, 0, cArr.length);
                return;
            }
            jsonGenerator.a1(cArr.length, cArr);
            int length = cArr.length;
            for (int i = 0; i < length; i++) {
                jsonGenerator.K1(cArr, i, 1);
            }
            jsonGenerator.F();
        }

        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public final void g(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
            WritableTypeId writableTypeIdE;
            char[] cArr = (char[]) obj;
            if (serializerProvider.d.r(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
                writableTypeIdE = typeSerializer.e(jsonGenerator, typeSerializer.d(JsonToken.START_ARRAY, cArr));
                int length = cArr.length;
                for (int i = 0; i < length; i++) {
                    jsonGenerator.K1(cArr, i, 1);
                }
            } else {
                writableTypeIdE = typeSerializer.e(jsonGenerator, typeSerializer.d(JsonToken.VALUE_STRING, cArr));
                jsonGenerator.K1(cArr, 0, cArr.length);
            }
            typeSerializer.f(jsonGenerator, writableTypeIdE);
        }
    }

    @JacksonStdImpl
    public static class DoubleArraySerializer extends ArraySerializerBase<double[]> {
        static {
            TypeFactory.g.getClass();
            TypeFactory.n(Double.TYPE);
        }

        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public final boolean d(SerializerProvider serializerProvider, Object obj) {
            return ((double[]) obj).length == 0;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.JsonSerializer
        public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            double[] dArr = (double[]) obj;
            if (dArr.length != 1 || !q(serializerProvider)) {
                jsonGenerator.p(dArr, dArr.length);
                return;
            }
            for (double d : dArr) {
                jsonGenerator.Z(d);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public final ContainerSerializer o(TypeSerializer typeSerializer) {
            return this;
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public final boolean p(Object obj) {
            return ((double[]) obj).length == 1;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public final JsonSerializer r(BeanProperty beanProperty, Boolean bool) {
            return new DoubleArraySerializer(this, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public final void s(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            for (double d : (double[]) obj) {
                jsonGenerator.Z(d);
            }
        }
    }

    @JacksonStdImpl
    public static class FloatArraySerializer extends TypedPrimitiveArraySerializer<float[]> {
        static {
            TypeFactory.g.getClass();
            TypeFactory.n(Float.TYPE);
        }

        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public final boolean d(SerializerProvider serializerProvider, Object obj) {
            return ((float[]) obj).length == 0;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.JsonSerializer
        public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            float[] fArr = (float[]) obj;
            int length = fArr.length;
            int i = 0;
            if (length == 1 && q(serializerProvider)) {
                int length2 = fArr.length;
                while (i < length2) {
                    jsonGenerator.b0(fArr[i]);
                    i++;
                }
                return;
            }
            jsonGenerator.a1(length, fArr);
            int length3 = fArr.length;
            while (i < length3) {
                jsonGenerator.b0(fArr[i]);
                i++;
            }
            jsonGenerator.F();
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public final boolean p(Object obj) {
            return ((float[]) obj).length == 1;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public final JsonSerializer r(BeanProperty beanProperty, Boolean bool) {
            return new FloatArraySerializer(this, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public final void s(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            for (float f : (float[]) obj) {
                jsonGenerator.b0(f);
            }
        }
    }

    @JacksonStdImpl
    public static class IntArraySerializer extends ArraySerializerBase<int[]> {
        static {
            TypeFactory.g.getClass();
            TypeFactory.n(Integer.TYPE);
        }

        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public final boolean d(SerializerProvider serializerProvider, Object obj) {
            return ((int[]) obj).length == 0;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.JsonSerializer
        public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            int[] iArr = (int[]) obj;
            if (iArr.length != 1 || !q(serializerProvider)) {
                jsonGenerator.l(iArr.length, iArr);
                return;
            }
            for (int i : iArr) {
                jsonGenerator.d0(i);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public final ContainerSerializer o(TypeSerializer typeSerializer) {
            return this;
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public final boolean p(Object obj) {
            return ((int[]) obj).length == 1;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public final JsonSerializer r(BeanProperty beanProperty, Boolean bool) {
            return new IntArraySerializer(this, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public final void s(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            for (int i : (int[]) obj) {
                jsonGenerator.d0(i);
            }
        }
    }

    @JacksonStdImpl
    public static class LongArraySerializer extends TypedPrimitiveArraySerializer<long[]> {
        static {
            TypeFactory.g.getClass();
            TypeFactory.n(Long.TYPE);
        }

        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public final boolean d(SerializerProvider serializerProvider, Object obj) {
            return ((long[]) obj).length == 0;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.JsonSerializer
        public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            long[] jArr = (long[]) obj;
            if (jArr.length != 1 || !q(serializerProvider)) {
                jsonGenerator.r(jArr, jArr.length);
                return;
            }
            for (long j : jArr) {
                jsonGenerator.i0(j);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public final boolean p(Object obj) {
            return ((long[]) obj).length == 1;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public final JsonSerializer r(BeanProperty beanProperty, Boolean bool) {
            return new LongArraySerializer(this, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public final void s(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            for (long j : (long[]) obj) {
                jsonGenerator.i0(j);
            }
        }
    }

    @JacksonStdImpl
    public static class ShortArraySerializer extends TypedPrimitiveArraySerializer<short[]> {
        static {
            TypeFactory.g.getClass();
            TypeFactory.n(Short.TYPE);
        }

        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public final boolean d(SerializerProvider serializerProvider, Object obj) {
            return ((short[]) obj).length == 0;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.JsonSerializer
        public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            short[] sArr = (short[]) obj;
            int length = sArr.length;
            int i = 0;
            if (length == 1 && q(serializerProvider)) {
                int length2 = sArr.length;
                while (i < length2) {
                    jsonGenerator.d0(sArr[i]);
                    i++;
                }
                return;
            }
            jsonGenerator.a1(length, sArr);
            int length3 = sArr.length;
            while (i < length3) {
                jsonGenerator.d0(sArr[i]);
                i++;
            }
            jsonGenerator.F();
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public final boolean p(Object obj) {
            return ((short[]) obj).length == 1;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public final JsonSerializer r(BeanProperty beanProperty, Boolean bool) {
            return new ShortArraySerializer(this, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public final void s(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            for (short s : (short[]) obj) {
                jsonGenerator.d0(s);
            }
        }
    }

    public static abstract class TypedPrimitiveArraySerializer<T> extends ArraySerializerBase<T> {
        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public final ContainerSerializer o(TypeSerializer typeSerializer) {
            return this;
        }
    }

    static {
        HashMap map = new HashMap();
        f14322a = map;
        map.put(boolean[].class.getName(), new BooleanArraySerializer(boolean[].class));
        map.put(byte[].class.getName(), new ByteArraySerializer(byte[].class));
        map.put(char[].class.getName(), new CharArraySerializer(char[].class));
        map.put(short[].class.getName(), new ShortArraySerializer(short[].class));
        map.put(int[].class.getName(), new IntArraySerializer(int[].class));
        map.put(long[].class.getName(), new LongArraySerializer(long[].class));
        map.put(float[].class.getName(), new FloatArraySerializer(float[].class));
        map.put(double[].class.getName(), new DoubleArraySerializer(double[].class));
    }
}
