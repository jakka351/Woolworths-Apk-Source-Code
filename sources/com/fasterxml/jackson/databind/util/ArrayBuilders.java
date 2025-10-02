package com.fasterxml.jackson.databind.util;

import java.lang.reflect.Array;

/* loaded from: classes4.dex */
public final class ArrayBuilders {

    /* renamed from: a, reason: collision with root package name */
    public BooleanBuilder f14328a;
    public ByteBuilder b;
    public ShortBuilder c;
    public IntBuilder d;
    public LongBuilder e;
    public FloatBuilder f;
    public DoubleBuilder g;

    public static final class BooleanBuilder extends PrimitiveArrayBuilder<boolean[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        public final Object a(int i) {
            return new boolean[i];
        }
    }

    public static final class ByteBuilder extends PrimitiveArrayBuilder<byte[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        public final Object a(int i) {
            return new byte[i];
        }
    }

    public static final class DoubleBuilder extends PrimitiveArrayBuilder<double[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        public final Object a(int i) {
            return new double[i];
        }
    }

    public static final class FloatBuilder extends PrimitiveArrayBuilder<float[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        public final Object a(int i) {
            return new float[i];
        }
    }

    public static final class IntBuilder extends PrimitiveArrayBuilder<int[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        public final Object a(int i) {
            return new int[i];
        }
    }

    public static final class LongBuilder extends PrimitiveArrayBuilder<long[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        public final Object a(int i) {
            return new long[i];
        }
    }

    public static final class ShortBuilder extends PrimitiveArrayBuilder<short[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        public final Object a(int i) {
            return new short[i];
        }
    }

    public static Object a(final Object obj) {
        final int length = Array.getLength(obj);
        final Class<?> cls = obj.getClass();
        return new Object() { // from class: com.fasterxml.jackson.databind.util.ArrayBuilders.1
            public final boolean equals(Object obj2) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
                if (obj2 == this) {
                    return true;
                }
                if (!ClassUtil.u(cls, obj2)) {
                    return false;
                }
                int length2 = Array.getLength(obj2);
                int i = length;
                if (length2 != i) {
                    return false;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    Object obj3 = Array.get(obj, i2);
                    Object obj4 = Array.get(obj2, i2);
                    if (obj3 != obj4 && obj3 != null && !obj3.equals(obj4)) {
                        return false;
                    }
                }
                return true;
            }
        };
    }

    public static Object[] b(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (objArr[i] == obj) {
                if (i == 0) {
                    return objArr;
                }
                Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), length);
                System.arraycopy(objArr, 0, objArr2, 1, i);
                objArr2[0] = obj;
                int i2 = i + 1;
                int i3 = length - i2;
                if (i3 > 0) {
                    System.arraycopy(objArr, i2, objArr2, i2, i3);
                }
                return objArr2;
            }
        }
        Object[] objArr3 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), length + 1);
        if (length > 0) {
            System.arraycopy(objArr, 0, objArr3, 1, length);
        }
        objArr3[0] = obj;
        return objArr3;
    }
}
