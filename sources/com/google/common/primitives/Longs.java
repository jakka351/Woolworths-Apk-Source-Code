package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes6.dex */
public final class Longs {

    public static final class AsciiDigits {

        /* renamed from: a, reason: collision with root package name */
        public static final byte[] f14941a;

        static {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i = 0; i < 10; i++) {
                bArr[i + 48] = (byte) i;
            }
            for (int i2 = 0; i2 < 26; i2++) {
                byte b = (byte) (i2 + 10);
                bArr[i2 + 65] = b;
                bArr[i2 + 97] = b;
            }
            f14941a = bArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LexicographicalComparator implements Comparator<long[]> {
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
        public final int compare(long[] jArr, long[] jArr2) {
            long[] jArr3 = jArr;
            long[] jArr4 = jArr2;
            int iMin = Math.min(jArr3.length, jArr4.length);
            for (int i = 0; i < iMin; i++) {
                int iCompare = Long.compare(jArr3[i], jArr4[i]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return jArr3.length - jArr4.length;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Longs.lexicographicalComparator()";
        }
    }

    @GwtCompatible
    public static class LongArrayAsList extends AbstractList<Long> implements RandomAccess, Serializable {
        public final int d;
        public final int e;

        public LongArrayAsList(int i, int i2) {
            this.d = i;
            this.e = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            if (!(obj instanceof Long) || this.d >= this.e) {
                return false;
            }
            throw null;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LongArrayAsList)) {
                return super.equals(obj);
            }
            int size = size();
            if (((LongArrayAsList) obj).size() != size) {
                return false;
            }
            if (size <= 0) {
                return true;
            }
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i) {
            Preconditions.i(i, size());
            throw null;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            if (this.d >= this.e) {
                return 1;
            }
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            if (!(obj instanceof Long)) {
                return -1;
            }
            if (this.d >= this.e) {
                return -1;
            }
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof Long) || this.e - 1 < this.d) {
                return -1;
            }
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i, Object obj) {
            Preconditions.i(i, size());
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.e - this.d;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List subList(int i, int i2) {
            Preconditions.m(i, i2, size());
            if (i == i2) {
                return Collections.EMPTY_LIST;
            }
            int i3 = this.d;
            return new LongArrayAsList(i + i3, i3 + i2);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            new StringBuilder(size() * 10).append('[');
            throw null;
        }
    }

    public static final class LongConverter extends Converter<String, Long> implements Serializable {
        public static final Converter d = new LongConverter();

        private Object readResolve() {
            return d;
        }

        @Override // com.google.common.base.Converter
        public final Object b(Object obj) {
            return Long.decode((String) obj);
        }

        public final String toString() {
            return "Longs.stringConverter()";
        }
    }

    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
