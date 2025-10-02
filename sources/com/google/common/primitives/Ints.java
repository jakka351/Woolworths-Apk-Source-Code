package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes6.dex */
public final class Ints extends IntsMethodsForWeb {

    @GwtCompatible
    public static class IntArrayAsList extends AbstractList<Integer> implements RandomAccess, Serializable {
        public final int[] d;
        public final int e;
        public final int f;

        public IntArrayAsList(int[] iArr, int i, int i2) {
            this.d = iArr;
            this.e = i;
            this.f = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            if (!(obj instanceof Integer)) {
                return false;
            }
            int iIntValue = ((Integer) obj).intValue();
            int i = this.e;
            while (true) {
                if (i >= this.f) {
                    i = -1;
                    break;
                }
                if (this.d[i] == iIntValue) {
                    break;
                }
                i++;
            }
            return i != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof IntArrayAsList)) {
                return super.equals(obj);
            }
            IntArrayAsList intArrayAsList = (IntArrayAsList) obj;
            int size = size();
            if (intArrayAsList.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.d[this.e + i] != intArrayAsList.d[intArrayAsList.e + i]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i) {
            Preconditions.i(i, size());
            return Integer.valueOf(this.d[this.e + i]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            int i = 1;
            for (int i2 = this.e; i2 < this.f; i2++) {
                i = (i * 31) + this.d[i2];
            }
            return i;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            if (obj instanceof Integer) {
                int iIntValue = ((Integer) obj).intValue();
                int i = this.e;
                int i2 = i;
                while (true) {
                    if (i2 >= this.f) {
                        i2 = -1;
                        break;
                    }
                    if (this.d[i2] == iIntValue) {
                        break;
                    }
                    i2++;
                }
                if (i2 >= 0) {
                    return i2 - i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            int i;
            if (obj instanceof Integer) {
                int iIntValue = ((Integer) obj).intValue();
                int i2 = this.f;
                while (true) {
                    i2--;
                    i = this.e;
                    if (i2 < i) {
                        i2 = -1;
                        break;
                    }
                    if (this.d[i2] == iIntValue) {
                        break;
                    }
                }
                if (i2 >= 0) {
                    return i2 - i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i, Object obj) {
            Integer num = (Integer) obj;
            Preconditions.i(i, size());
            int i2 = this.e + i;
            int[] iArr = this.d;
            int i3 = iArr[i2];
            num.getClass();
            iArr[i2] = num.intValue();
            return Integer.valueOf(i3);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f - this.e;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List subList(int i, int i2) {
            Preconditions.m(i, i2, size());
            if (i == i2) {
                return Collections.EMPTY_LIST;
            }
            int i3 = this.e;
            return new IntArrayAsList(this.d, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            int[] iArr = this.d;
            int i = this.e;
            sb.append(iArr[i]);
            while (true) {
                i++;
                if (i >= this.f) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(iArr[i]);
            }
        }
    }

    public static final class IntConverter extends Converter<String, Integer> implements Serializable {
        public static final Converter d = new IntConverter();

        private Object readResolve() {
            return d;
        }

        @Override // com.google.common.base.Converter
        public final Object b(Object obj) {
            return Integer.decode((String) obj);
        }

        public final String toString() {
            return "Ints.stringConverter()";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LexicographicalComparator implements Comparator<int[]> {
        public static final /* synthetic */ LexicographicalComparator[] d = {new LexicographicalComparator("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        LexicographicalComparator EF5;

        public static LexicographicalComparator valueOf(String str) {
            return (LexicographicalComparator) Enum.valueOf(LexicographicalComparator.class, str);
        }

        public static LexicographicalComparator[] values() {
            return (LexicographicalComparator[]) d.clone();
        }

        @Override // java.util.Comparator
        public final int compare(int[] iArr, int[] iArr2) {
            int[] iArr3 = iArr;
            int[] iArr4 = iArr2;
            int iMin = Math.min(iArr3.length, iArr4.length);
            for (int i = 0; i < iMin; i++) {
                int iCompare = Integer.compare(iArr3[i], iArr4[i]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return iArr3.length - iArr4.length;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Ints.lexicographicalComparator()";
        }
    }

    public static List a(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new IntArrayAsList(iArr, 0, iArr.length);
    }

    public static int b(long j) {
        int i = (int) j;
        Preconditions.c(j, "Out of range: %s", ((long) i) == j);
        return i;
    }

    public static int c(int i, int i2) {
        Preconditions.d("min (%s) must be less than or equal to max (%s)", i2, 1073741823, i2 <= 1073741823);
        return Math.min(Math.max(i, i2), 1073741823);
    }

    public static int d(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    public static int e(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static int[] f(Collection collection) {
        if (collection instanceof IntArrayAsList) {
            IntArrayAsList intArrayAsList = (IntArrayAsList) collection;
            return Arrays.copyOfRange(intArrayAsList.d, intArrayAsList.e, intArrayAsList.f);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Integer g(java.lang.String r19) {
        /*
            r0 = r19
            r0.getClass()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L10
        Lb:
            r0 = 0
            r16 = 0
            goto L86
        L10:
            r1 = 0
            char r3 = r0.charAt(r1)
            r4 = 45
            if (r3 != r4) goto L1a
            r1 = 1
        L1a:
            int r3 = r0.length()
            if (r1 != r3) goto L21
            goto Lb
        L21:
            int r3 = r1 + 1
            char r4 = r0.charAt(r1)
            r5 = -1
            r6 = 128(0x80, float:1.794E-43)
            if (r4 >= r6) goto L31
            byte[] r7 = com.google.common.primitives.Longs.AsciiDigits.f14941a
            r4 = r7[r4]
            goto L34
        L31:
            byte[] r4 = com.google.common.primitives.Longs.AsciiDigits.f14941a
            r4 = r5
        L34:
            if (r4 < 0) goto L60
            r7 = 10
            if (r4 < r7) goto L3b
            goto L60
        L3b:
            int r4 = -r4
            long r8 = (long) r4
            long r10 = (long) r7
            r12 = -9223372036854775808
            long r14 = r12 / r10
        L42:
            int r4 = r0.length()
            if (r3 >= r4) goto L73
            int r4 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 >= r6) goto L55
            byte[] r16 = com.google.common.primitives.Longs.AsciiDigits.f14941a
            r3 = r16[r3]
            goto L58
        L55:
            byte[] r3 = com.google.common.primitives.Longs.AsciiDigits.f14941a
            r3 = r5
        L58:
            if (r3 < 0) goto L60
            if (r3 >= r7) goto L60
            int r16 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r16 >= 0) goto L63
        L60:
            r16 = 0
            goto L6d
        L63:
            long r8 = r8 * r10
            r16 = 0
            long r2 = (long) r3
            long r17 = r2 + r12
            int r17 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r17 >= 0) goto L70
        L6d:
            r0 = r16
            goto L86
        L70:
            long r8 = r8 - r2
            r3 = r4
            goto L42
        L73:
            r16 = 0
            if (r1 == 0) goto L7c
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            goto L86
        L7c:
            int r0 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r0 != 0) goto L81
            goto L6d
        L81:
            long r0 = -r8
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L86:
            if (r0 == 0) goto L9f
            long r1 = r0.longValue()
            int r3 = r0.intValue()
            long r3 = (long) r3
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L96
            goto L9f
        L96:
            int r0 = r0.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L9f:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.primitives.Ints.g(java.lang.String):java.lang.Integer");
    }
}
