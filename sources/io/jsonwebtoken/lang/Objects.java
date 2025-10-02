package io.jsonwebtoken.lang;

import YU.a;
import androidx.camera.core.impl.b;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Array;

/* loaded from: classes7.dex */
public final class Objects {
    private static final String ARRAY_ELEMENT_SEPARATOR = ", ";
    private static final String ARRAY_END = "}";
    private static final String ARRAY_START = "{";
    private static final String EMPTY_ARRAY = "{}";
    private static final String EMPTY_STRING = "";
    private static final int INITIAL_HASH = 7;
    private static final int MULTIPLIER = 31;
    private static final String NULL_STRING = "null";

    private Objects() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <A, O extends A> A[] addObjectToArray(A[] aArr, O o) {
        A[] aArr2 = (A[]) ((Object[]) Array.newInstance(aArr != null ? aArr.getClass().getComponentType() : o != null ? o.getClass() : Object.class, aArr != null ? aArr.length + 1 : 1));
        if (aArr != null) {
            System.arraycopy(aArr, 0, aArr2, 0, aArr.length);
        }
        aArr2[aArr2.length - 1] = o;
        return aArr2;
    }

    public static <E extends Enum<?>> E caseInsensitiveValueOf(E[] eArr, String str) {
        for (E e : eArr) {
            if (e.toString().equalsIgnoreCase(str)) {
                return e;
            }
        }
        throw new IllegalArgumentException(a.i("constant [", str, "] does not exist in enum type ", eArr.getClass().getComponentType().getName()));
    }

    public static boolean containsConstant(Enum<?>[] enumArr, String str) {
        return containsConstant(enumArr, str, false);
    }

    public static boolean containsElement(Object[] objArr, Object obj) {
        if (objArr == null) {
            return false;
        }
        for (Object obj2 : objArr) {
            if (nullSafeEquals(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static String getDisplayString(Object obj) {
        return obj == null ? "" : nullSafeToString(obj);
    }

    public static String getIdentityHexString(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static int hashCode(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static String identityToString(Object obj) {
        if (obj == null) {
            return "";
        }
        return obj.getClass().getName() + "@" + getIdentityHexString(obj);
    }

    public static boolean isArray(Object obj) {
        return obj != null && obj.getClass().isArray();
    }

    public static boolean isCheckedException(Throwable th) {
        return ((th instanceof RuntimeException) || (th instanceof Error)) ? false : true;
    }

    public static boolean isCompatibleWithThrowsClause(Throwable th, Class[] clsArr) {
        if (!isCheckedException(th)) {
            return true;
        }
        if (clsArr != null) {
            for (Class cls : clsArr) {
                if (cls.isAssignableFrom(th.getClass())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isEmpty(Object[] objArr) {
        return objArr == null || objArr.length == 0;
    }

    public static String nullSafeClassName(Object obj) {
        return obj != null ? obj.getClass().getName() : NULL_STRING;
    }

    public static void nullSafeClose(Closeable... closeableArr) throws IOException {
        if (closeableArr == null) {
            return;
        }
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException unused) {
                }
            }
        }
    }

    public static boolean nullSafeEquals(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj2 != null) {
            if (obj.equals(obj2)) {
                return true;
            }
            if (obj.getClass().isArray() && obj2.getClass().isArray()) {
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    return java.util.Arrays.equals((Object[]) obj, (Object[]) obj2);
                }
                if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    return java.util.Arrays.equals((boolean[]) obj, (boolean[]) obj2);
                }
                if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    return java.util.Arrays.equals((byte[]) obj, (byte[]) obj2);
                }
                if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    return java.util.Arrays.equals((char[]) obj, (char[]) obj2);
                }
                if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    return java.util.Arrays.equals((double[]) obj, (double[]) obj2);
                }
                if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    return java.util.Arrays.equals((float[]) obj, (float[]) obj2);
                }
                if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    return java.util.Arrays.equals((int[]) obj, (int[]) obj2);
                }
                if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    return java.util.Arrays.equals((long[]) obj, (long[]) obj2);
                }
                if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    return java.util.Arrays.equals((short[]) obj, (short[]) obj2);
                }
            }
        }
        return false;
    }

    public static int nullSafeHashCode(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj.getClass().isArray()) {
            if (obj instanceof Object[]) {
                return nullSafeHashCode((Object[]) obj);
            }
            if (obj instanceof boolean[]) {
                return nullSafeHashCode((boolean[]) obj);
            }
            if (obj instanceof byte[]) {
                return nullSafeHashCode((byte[]) obj);
            }
            if (obj instanceof char[]) {
                return nullSafeHashCode((char[]) obj);
            }
            if (obj instanceof double[]) {
                return nullSafeHashCode((double[]) obj);
            }
            if (obj instanceof float[]) {
                return nullSafeHashCode((float[]) obj);
            }
            if (obj instanceof int[]) {
                return nullSafeHashCode((int[]) obj);
            }
            if (obj instanceof long[]) {
                return nullSafeHashCode((long[]) obj);
            }
            if (obj instanceof short[]) {
                return nullSafeHashCode((short[]) obj);
            }
        }
        return obj.hashCode();
    }

    public static String nullSafeToString(Object obj) {
        if (obj == null) {
            return NULL_STRING;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Object[]) {
            return nullSafeToString((Object[]) obj);
        }
        if (obj instanceof boolean[]) {
            return nullSafeToString((boolean[]) obj);
        }
        if (obj instanceof byte[]) {
            return nullSafeToString((byte[]) obj);
        }
        if (obj instanceof char[]) {
            return nullSafeToString((char[]) obj);
        }
        if (obj instanceof double[]) {
            return nullSafeToString((double[]) obj);
        }
        if (obj instanceof float[]) {
            return nullSafeToString((float[]) obj);
        }
        if (obj instanceof int[]) {
            return nullSafeToString((int[]) obj);
        }
        if (obj instanceof long[]) {
            return nullSafeToString((long[]) obj);
        }
        if (obj instanceof short[]) {
            return nullSafeToString((short[]) obj);
        }
        String string = obj.toString();
        return string != null ? string : "";
    }

    public static Object[] toObjectArray(Object obj) {
        if (obj instanceof Object[]) {
            return (Object[]) obj;
        }
        if (obj == null) {
            return new Object[0];
        }
        if (!obj.getClass().isArray()) {
            throw new IllegalArgumentException(b.m(obj, "Source is not an array: "));
        }
        int length = Array.getLength(obj);
        if (length == 0) {
            return new Object[0];
        }
        Object[] objArr = (Object[]) Array.newInstance(Array.get(obj, 0).getClass(), length);
        for (int i = 0; i < length; i++) {
            objArr[i] = Array.get(obj, i);
        }
        return objArr;
    }

    public static boolean containsConstant(Enum<?>[] enumArr, String str, boolean z) {
        for (Enum<?> r0 : enumArr) {
            String string = r0.toString();
            if (z) {
                if (string.equals(str)) {
                    return true;
                }
            } else if (string.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public static int hashCode(boolean z) {
        return z ? 1231 : 1237;
    }

    public static boolean isEmpty(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    public static int hashCode(double d) {
        return hashCode(Double.doubleToLongBits(d));
    }

    public static int hashCode(float f) {
        return Float.floatToIntBits(f);
    }

    public static int nullSafeHashCode(Object[] objArr) {
        if (objArr == null) {
            return 0;
        }
        int iNullSafeHashCode = 7;
        for (Object obj : objArr) {
            iNullSafeHashCode = (iNullSafeHashCode * 31) + nullSafeHashCode(obj);
        }
        return iNullSafeHashCode;
    }

    public static int nullSafeHashCode(boolean[] zArr) {
        if (zArr == null) {
            return 0;
        }
        int iHashCode = 7;
        for (boolean z : zArr) {
            iHashCode = (iHashCode * 31) + hashCode(z);
        }
        return iHashCode;
    }

    public static String nullSafeToString(Object[] objArr) {
        if (objArr == null) {
            return NULL_STRING;
        }
        int length = objArr.length;
        if (length == 0) {
            return EMPTY_ARRAY;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                sb.append(ARRAY_START);
            } else {
                sb.append(ARRAY_ELEMENT_SEPARATOR);
            }
            sb.append(String.valueOf(objArr[i]));
        }
        sb.append(ARRAY_END);
        return sb.toString();
    }

    public static int nullSafeHashCode(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int i = 7;
        for (byte b : bArr) {
            i = (i * 31) + b;
        }
        return i;
    }

    public static int nullSafeHashCode(char[] cArr) {
        if (cArr == null) {
            return 0;
        }
        int i = 7;
        for (char c : cArr) {
            i = (i * 31) + c;
        }
        return i;
    }

    public static int nullSafeHashCode(double[] dArr) {
        if (dArr == null) {
            return 0;
        }
        int iHashCode = 7;
        for (double d : dArr) {
            iHashCode = (iHashCode * 31) + hashCode(d);
        }
        return iHashCode;
    }

    public static int nullSafeHashCode(float[] fArr) {
        if (fArr == null) {
            return 0;
        }
        int iHashCode = 7;
        for (float f : fArr) {
            iHashCode = (iHashCode * 31) + hashCode(f);
        }
        return iHashCode;
    }

    public static int nullSafeHashCode(int[] iArr) {
        if (iArr == null) {
            return 0;
        }
        int i = 7;
        for (int i2 : iArr) {
            i = (i * 31) + i2;
        }
        return i;
    }

    public static String nullSafeToString(boolean[] zArr) {
        if (zArr == null) {
            return NULL_STRING;
        }
        int length = zArr.length;
        if (length == 0) {
            return EMPTY_ARRAY;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                sb.append(ARRAY_START);
            } else {
                sb.append(ARRAY_ELEMENT_SEPARATOR);
            }
            sb.append(zArr[i]);
        }
        sb.append(ARRAY_END);
        return sb.toString();
    }

    public static int nullSafeHashCode(long[] jArr) {
        if (jArr == null) {
            return 0;
        }
        int iHashCode = 7;
        for (long j : jArr) {
            iHashCode = (iHashCode * 31) + hashCode(j);
        }
        return iHashCode;
    }

    public static int nullSafeHashCode(short[] sArr) {
        if (sArr == null) {
            return 0;
        }
        int i = 7;
        for (short s : sArr) {
            i = (i * 31) + s;
        }
        return i;
    }

    public static String nullSafeToString(byte[] bArr) {
        if (bArr == null) {
            return NULL_STRING;
        }
        int length = bArr.length;
        if (length == 0) {
            return EMPTY_ARRAY;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                sb.append(ARRAY_START);
            } else {
                sb.append(ARRAY_ELEMENT_SEPARATOR);
            }
            sb.append((int) bArr[i]);
        }
        sb.append(ARRAY_END);
        return sb.toString();
    }

    public static String nullSafeToString(char[] cArr) {
        if (cArr == null) {
            return NULL_STRING;
        }
        int length = cArr.length;
        if (length == 0) {
            return EMPTY_ARRAY;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                sb.append(ARRAY_START);
            } else {
                sb.append(ARRAY_ELEMENT_SEPARATOR);
            }
            sb.append("'");
            sb.append(cArr[i]);
            sb.append("'");
        }
        sb.append(ARRAY_END);
        return sb.toString();
    }

    public static String nullSafeToString(double[] dArr) {
        if (dArr == null) {
            return NULL_STRING;
        }
        int length = dArr.length;
        if (length == 0) {
            return EMPTY_ARRAY;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                sb.append(ARRAY_START);
            } else {
                sb.append(ARRAY_ELEMENT_SEPARATOR);
            }
            sb.append(dArr[i]);
        }
        sb.append(ARRAY_END);
        return sb.toString();
    }

    public static String nullSafeToString(float[] fArr) {
        if (fArr == null) {
            return NULL_STRING;
        }
        int length = fArr.length;
        if (length == 0) {
            return EMPTY_ARRAY;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                sb.append(ARRAY_START);
            } else {
                sb.append(ARRAY_ELEMENT_SEPARATOR);
            }
            sb.append(fArr[i]);
        }
        sb.append(ARRAY_END);
        return sb.toString();
    }

    public static String nullSafeToString(int[] iArr) {
        if (iArr == null) {
            return NULL_STRING;
        }
        int length = iArr.length;
        if (length == 0) {
            return EMPTY_ARRAY;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                sb.append(ARRAY_START);
            } else {
                sb.append(ARRAY_ELEMENT_SEPARATOR);
            }
            sb.append(iArr[i]);
        }
        sb.append(ARRAY_END);
        return sb.toString();
    }

    public static String nullSafeToString(long[] jArr) {
        if (jArr == null) {
            return NULL_STRING;
        }
        int length = jArr.length;
        if (length == 0) {
            return EMPTY_ARRAY;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                sb.append(ARRAY_START);
            } else {
                sb.append(ARRAY_ELEMENT_SEPARATOR);
            }
            sb.append(jArr[i]);
        }
        sb.append(ARRAY_END);
        return sb.toString();
    }

    public static String nullSafeToString(short[] sArr) {
        if (sArr == null) {
            return NULL_STRING;
        }
        int length = sArr.length;
        if (length == 0) {
            return EMPTY_ARRAY;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                sb.append(ARRAY_START);
            } else {
                sb.append(ARRAY_ELEMENT_SEPARATOR);
            }
            sb.append((int) sArr[i]);
        }
        sb.append(ARRAY_END);
        return sb.toString();
    }
}
