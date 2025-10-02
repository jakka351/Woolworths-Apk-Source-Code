package kotlin.collections;

import YU.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.collections.unsigned.UArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.EmptySequence;
import kotlin.sequences.Sequence;

@Metadata(d1 = {"kotlin/collections/ArraysKt__ArraysJVMKt", "kotlin/collections/ArraysKt__ArraysKt", "kotlin/collections/ArraysKt___ArraysJvmKt", "kotlin/collections/ArraysKt___ArraysKt"}, k = 4, mv = {2, 2, 0}, xi = 49)
/* loaded from: classes.dex */
public final class ArraysKt extends ArraysKt___ArraysKt {
    public static List A(int i, Object[] objArr) {
        Intrinsics.h(objArr, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(a.e(i, "Requested element count ", " is less than zero.").toString());
        }
        int length = objArr.length - i;
        if (length < 0) {
            length = 0;
        }
        if (length < 0) {
            throw new IllegalArgumentException(a.e(length, "Requested element count ", " is less than zero.").toString());
        }
        if (length == 0) {
            return EmptyList.d;
        }
        int length2 = objArr.length;
        if (length >= length2) {
            return l0(objArr);
        }
        if (length == 1) {
            return CollectionsKt.Q(objArr[length2 - 1]);
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = length2 - length; i2 < length2; i2++) {
            arrayList.add(objArr[i2]);
        }
        return arrayList;
    }

    public static void B(Object[] objArr, int i, int i2, Object obj) {
        Intrinsics.h(objArr, "<this>");
        Arrays.fill(objArr, i, i2, obj);
    }

    public static void C(int i, int i2, int i3, int[] iArr) {
        if ((i3 & 4) != 0) {
            i2 = iArr.length;
        }
        Arrays.fill(iArr, 0, i2, i);
    }

    public static void D(long[] jArr, long j) {
        int length = jArr.length;
        Intrinsics.h(jArr, "<this>");
        Arrays.fill(jArr, 0, length, j);
    }

    public static ArrayList F(Object[] objArr) {
        Intrinsics.h(objArr, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object G(Object[] objArr) {
        Intrinsics.h(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object H(Object[] objArr) {
        Intrinsics.h(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static IntRange I(int[] iArr) {
        return new IntRange(0, iArr.length - 1, 1);
    }

    public static int J(long[] jArr) {
        Intrinsics.h(jArr, "<this>");
        return jArr.length - 1;
    }

    public static int K(Object[] objArr) {
        Intrinsics.h(objArr, "<this>");
        return objArr.length - 1;
    }

    public static Integer L(int i, int[] iArr) {
        Intrinsics.h(iArr, "<this>");
        if (i < 0 || i >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i]);
    }

    public static Object M(int i, Object[] objArr) {
        Intrinsics.h(objArr, "<this>");
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static int N(byte b, byte[] bArr) {
        Intrinsics.h(bArr, "<this>");
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            if (b == bArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int O(int i, int[] iArr) {
        Intrinsics.h(iArr, "<this>");
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static int P(long[] jArr, long j) {
        Intrinsics.h(jArr, "<this>");
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (j == jArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int Q(Object[] objArr, Object obj) {
        Intrinsics.h(objArr, "<this>");
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int R(short[] sArr, short s) {
        Intrinsics.h(sArr, "<this>");
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            if (s == sArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static String T(byte[] bArr, String str, Function1 function1, int i) {
        String str2 = (i & 2) != 0 ? "" : "[";
        String str3 = (i & 4) == 0 ? "]" : "";
        if ((i & 32) != 0) {
            function1 = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i2 = 0;
        for (byte b : bArr) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            if (function1 != null) {
                sb.append((CharSequence) function1.invoke(Byte.valueOf(b)));
            } else {
                sb.append((CharSequence) String.valueOf((int) b));
            }
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    public static String U(Object[] objArr, String str, String str2, String str3, Function1 function1, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            function1 = null;
        }
        Intrinsics.h(objArr, "<this>");
        StringBuilder sb = new StringBuilder();
        ArraysKt___ArraysKt.c(objArr, sb, str4, str5, str6, "...", function1);
        return sb.toString();
    }

    public static Object V(Object[] objArr) {
        Intrinsics.h(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Integer W(int[] iArr) {
        Intrinsics.h(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        int i2 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i3 = iArr[i2];
                if (i < i3) {
                    i = i3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return Integer.valueOf(i);
    }

    public static int X(int[] iArr) {
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i = iArr[0];
        int i2 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i3 = iArr[i2];
                if (i < i3) {
                    i = i3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    public static Integer Y(int[] iArr) {
        Intrinsics.h(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        int i2 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i3 = iArr[i2];
                if (i > i3) {
                    i = i3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return Integer.valueOf(i);
    }

    public static byte[] Z(byte[] bArr, byte[] elements) {
        Intrinsics.h(bArr, "<this>");
        Intrinsics.h(elements, "elements");
        int length = bArr.length;
        int length2 = elements.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(elements, 0, bArrCopyOf, length, length2);
        Intrinsics.e(bArrCopyOf);
        return bArrCopyOf;
    }

    public static int[] a0(int[] iArr, int[] elements) {
        Intrinsics.h(iArr, "<this>");
        Intrinsics.h(elements, "elements");
        int length = iArr.length;
        int length2 = elements.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(elements, 0, iArrCopyOf, length, length2);
        Intrinsics.e(iArrCopyOf);
        return iArrCopyOf;
    }

    public static Object[] b0(Object[] objArr, Object[] elements) {
        Intrinsics.h(objArr, "<this>");
        Intrinsics.h(elements, "elements");
        int length = objArr.length;
        int length2 = elements.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(elements, 0, objArrCopyOf, length, length2);
        Intrinsics.e(objArrCopyOf);
        return objArrCopyOf;
    }

    public static char c0(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static Object d0(Object[] objArr) {
        Intrinsics.h(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return objArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static Iterable e(Object[] objArr) {
        Intrinsics.h(objArr, "<this>");
        return objArr.length == 0 ? EmptyList.d : new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$1(objArr);
    }

    public static byte[] e0(byte[] bArr, IntRange indices) {
        Intrinsics.h(indices, "indices");
        return indices.isEmpty() ? new byte[0] : y(bArr, indices.d, indices.e + 1);
    }

    public static List f(Object[] objArr) {
        Intrinsics.h(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        Intrinsics.g(listAsList, "asList(...)");
        return listAsList;
    }

    public static List f0(Comparator comparator, Object[] objArr) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.g(objArr, "copyOf(...)");
            if (objArr.length > 1) {
                Arrays.sort(objArr, comparator);
            }
        }
        return f(objArr);
    }

    public static Sequence g(final Object[] objArr) {
        return objArr.length == 0 ? EmptySequence.f24658a : new Sequence<Object>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public final Iterator iterator() {
                return ArrayIteratorKt.a(objArr);
            }
        };
    }

    public static List g0(byte[] bArr) {
        Intrinsics.h(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            return EmptyList.d;
        }
        if (length == 1) {
            return CollectionsKt.Q(Byte.valueOf(bArr[0]));
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b : bArr) {
            arrayList.add(Byte.valueOf(b));
        }
        return arrayList;
    }

    public static boolean h(byte[] bArr, byte b) {
        Intrinsics.h(bArr, "<this>");
        return N(b, bArr) >= 0;
    }

    public static List h0(double[] dArr) {
        Intrinsics.h(dArr, "<this>");
        int length = dArr.length;
        return length != 0 ? length != 1 ? o0(dArr) : CollectionsKt.Q(Double.valueOf(dArr[0])) : EmptyList.d;
    }

    public static boolean i(char[] cArr, char c) {
        Intrinsics.h(cArr, "<this>");
        int length = cArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (c == cArr[i]) {
                break;
            }
            i++;
        }
        return i >= 0;
    }

    public static List i0(float[] fArr) {
        Intrinsics.h(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            return EmptyList.d;
        }
        if (length == 1) {
            return CollectionsKt.Q(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    public static boolean j(int[] iArr, int i) {
        Intrinsics.h(iArr, "<this>");
        return O(i, iArr) >= 0;
    }

    public static List j0(int[] iArr) {
        Intrinsics.h(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? p0(iArr) : CollectionsKt.Q(Integer.valueOf(iArr[0])) : EmptyList.d;
    }

    public static boolean k(long[] jArr, long j) {
        Intrinsics.h(jArr, "<this>");
        return P(jArr, j) >= 0;
    }

    public static List k0(long[] jArr) {
        Intrinsics.h(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return EmptyList.d;
        }
        if (length == 1) {
            return CollectionsKt.Q(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static boolean l(Object[] objArr, Object obj) {
        Intrinsics.h(objArr, "<this>");
        return Q(objArr, obj) >= 0;
    }

    public static List l0(Object[] objArr) {
        Intrinsics.h(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? q0(objArr) : CollectionsKt.Q(objArr[0]) : EmptyList.d;
    }

    public static boolean m(short[] sArr, short s) {
        Intrinsics.h(sArr, "<this>");
        return R(sArr, s) >= 0;
    }

    public static List m0(short[] sArr) {
        Intrinsics.h(sArr, "<this>");
        int length = sArr.length;
        if (length == 0) {
            return EmptyList.d;
        }
        if (length == 1) {
            return CollectionsKt.Q(Short.valueOf(sArr[0]));
        }
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s : sArr) {
            arrayList.add(Short.valueOf(s));
        }
        return arrayList;
    }

    public static boolean n(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr != null && objArr2 != null && objArr.length == objArr2.length) {
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                Object obj = objArr[i];
                Object obj2 = objArr2[i];
                if (obj != obj2) {
                    if (obj != null && obj2 != null) {
                        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                            if (!n((Object[]) obj, (Object[]) obj2)) {
                            }
                        } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                            if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            }
                        } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                            if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            }
                        } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                            if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            }
                        } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                            if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            }
                        } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                            if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            }
                        } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                            if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            }
                        } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                            if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            }
                        } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                            if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            }
                        } else if ((obj instanceof UByteArray) && (obj2 instanceof UByteArray)) {
                            if (!UArraysKt.c(((UByteArray) obj).getD(), ((UByteArray) obj2).getD())) {
                            }
                        } else if ((obj instanceof UShortArray) && (obj2 instanceof UShortArray)) {
                            if (!UArraysKt.a(((UShortArray) obj).getD(), ((UShortArray) obj2).getD())) {
                            }
                        } else if ((obj instanceof UIntArray) && (obj2 instanceof UIntArray)) {
                            if (!UArraysKt.b(((UIntArray) obj).getD(), ((UIntArray) obj2).getD())) {
                            }
                        } else if ((obj instanceof ULongArray) && (obj2 instanceof ULongArray)) {
                            if (!UArraysKt.d(((ULongArray) obj).d, ((ULongArray) obj2).d)) {
                            }
                        } else if (!obj.equals(obj2)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static List n0(boolean[] zArr) {
        Intrinsics.h(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            return EmptyList.d;
        }
        if (length == 1) {
            return CollectionsKt.Q(Boolean.valueOf(zArr[0]));
        }
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z : zArr) {
            arrayList.add(Boolean.valueOf(z));
        }
        return arrayList;
    }

    public static String o(Object[] objArr) {
        if (objArr == null) {
            return "null";
        }
        int length = objArr.length;
        if (length > 429496729) {
            length = 429496729;
        }
        StringBuilder sb = new StringBuilder((length * 5) + 2);
        ArraysKt__ArraysKt.b(objArr, sb, new ArrayList());
        return sb.toString();
    }

    public static ArrayList o0(double[] dArr) {
        Intrinsics.h(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d : dArr) {
            arrayList.add(Double.valueOf(d));
        }
        return arrayList;
    }

    public static void p(int i, int i2, int i3, byte[] bArr, byte[] destination) {
        Intrinsics.h(bArr, "<this>");
        Intrinsics.h(destination, "destination");
        System.arraycopy(bArr, i2, destination, i, i3 - i2);
    }

    public static ArrayList p0(int[] iArr) {
        Intrinsics.h(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    public static void q(int i, int i2, int i3, int[] iArr, int[] destination) {
        Intrinsics.h(iArr, "<this>");
        Intrinsics.h(destination, "destination");
        System.arraycopy(iArr, i2, destination, i, i3 - i2);
    }

    public static ArrayList q0(Object[] objArr) {
        Intrinsics.h(objArr, "<this>");
        return new ArrayList(new ArrayAsCollection(objArr, false));
    }

    public static void r(int i, long[] jArr, int i2, long[] destination, int i3) {
        Intrinsics.h(jArr, "<this>");
        Intrinsics.h(destination, "destination");
        System.arraycopy(jArr, i2, destination, i, i3 - i2);
    }

    public static Set r0(Object[] objArr) {
        Intrinsics.h(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return EmptySet.d;
        }
        if (length == 1) {
            return SetsKt.i(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.h(objArr.length));
        ArraysKt___ArraysKt.d(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static void s(char[] cArr, char[] destination, int i, int i2, int i3) {
        Intrinsics.h(cArr, "<this>");
        Intrinsics.h(destination, "destination");
        System.arraycopy(cArr, i2, destination, i, i3 - i2);
    }

    public static Pair s0(Pair[] pairArr) {
        ArrayList arrayList = new ArrayList(pairArr.length);
        ArrayList arrayList2 = new ArrayList(pairArr.length);
        for (Pair pair : pairArr) {
            arrayList.add(pair.d);
            arrayList2.add(pair.e);
        }
        return new Pair(arrayList, arrayList2);
    }

    public static void t(Object[] objArr, int i, Object[] destination, int i2, int i3) {
        Intrinsics.h(objArr, "<this>");
        Intrinsics.h(destination, "destination");
        System.arraycopy(objArr, i2, destination, i, i3 - i2);
    }

    public static ArrayList t0(Object[] objArr, Object[] other) {
        Intrinsics.h(objArr, "<this>");
        Intrinsics.h(other, "other");
        int iMin = Math.min(objArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(new Pair(objArr[i], other[i]));
        }
        return arrayList;
    }

    public static /* synthetic */ void u(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        q(i, 0, i2, iArr, iArr2);
    }

    public static /* synthetic */ void v(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        p(i, i2, i3, bArr, bArr2);
    }

    public static void w(float[] fArr, float[] destination, int i) {
        int length = (i & 8) != 0 ? fArr.length : 6;
        Intrinsics.h(fArr, "<this>");
        Intrinsics.h(destination, "destination");
        System.arraycopy(fArr, 0, destination, 0, length);
    }

    public static /* synthetic */ void x(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        t(objArr, 0, objArr2, i, i2);
    }

    public static byte[] y(byte[] bArr, int i, int i2) {
        Intrinsics.h(bArr, "<this>");
        ArraysKt__ArraysJVMKt.a(i2, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
        Intrinsics.g(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static Object[] z(int i, int i2, Object[] objArr) {
        Intrinsics.h(objArr, "<this>");
        ArraysKt__ArraysJVMKt.a(i2, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i2);
        Intrinsics.g(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }
}
