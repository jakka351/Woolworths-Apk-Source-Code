package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes6.dex */
public final class Shorts extends ShortsMethodsForWeb {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LexicographicalComparator implements Comparator<short[]> {
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
        public final int compare(short[] sArr, short[] sArr2) {
            short[] sArr3 = sArr;
            short[] sArr4 = sArr2;
            int iMin = Math.min(sArr3.length, sArr4.length);
            for (int i = 0; i < iMin; i++) {
                int iCompare = Short.compare(sArr3[i], sArr4[i]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return sArr3.length - sArr4.length;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Shorts.lexicographicalComparator()";
        }
    }

    @GwtCompatible
    public static class ShortArrayAsList extends AbstractList<Short> implements RandomAccess, Serializable {
        public final int d;
        public final int e;

        public ShortArrayAsList(int i, int i2) {
            this.d = i;
            this.e = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            if (!(obj instanceof Short) || this.d >= this.e) {
                return false;
            }
            throw null;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ShortArrayAsList)) {
                return super.equals(obj);
            }
            int size = size();
            if (((ShortArrayAsList) obj).size() != size) {
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
            if (!(obj instanceof Short)) {
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
            if (!(obj instanceof Short) || this.e - 1 < this.d) {
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
            return new ShortArrayAsList(i + i3, i3 + i2);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            new StringBuilder(size() * 6).append('[');
            throw null;
        }
    }

    public static final class ShortConverter extends Converter<String, Short> implements Serializable {
        public static final Converter d = new ShortConverter();

        private Object readResolve() {
            return d;
        }

        @Override // com.google.common.base.Converter
        public final Object b(Object obj) {
            return Short.decode((String) obj);
        }

        public final String toString() {
            return "Shorts.stringConverter()";
        }
    }
}
