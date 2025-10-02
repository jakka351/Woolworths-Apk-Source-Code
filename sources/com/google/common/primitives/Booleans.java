package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
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
public final class Booleans {

    @GwtCompatible
    public static class BooleanArrayAsList extends AbstractList<Boolean> implements RandomAccess, Serializable {
        public final int d;
        public final int e;

        public BooleanArrayAsList(int i, int i2) {
            this.d = i;
            this.e = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            if (!(obj instanceof Boolean) || this.d >= this.e) {
                return false;
            }
            throw null;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BooleanArrayAsList)) {
                return super.equals(obj);
            }
            int size = size();
            if (((BooleanArrayAsList) obj).size() != size) {
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
            if (!(obj instanceof Boolean)) {
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
            if (!(obj instanceof Boolean) || this.e - 1 < this.d) {
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
            return new BooleanArrayAsList(i + i3, i3 + i2);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            new StringBuilder(size() * 7);
            throw null;
        }
    }

    public enum BooleanComparator implements Comparator<Boolean> {
        /* JADX INFO: Fake field, exist only in values array */
        TRUE_FIRST(1, "Booleans.trueFirst()"),
        /* JADX INFO: Fake field, exist only in values array */
        FALSE_FIRST(-1, "Booleans.falseFirst()");

        public final int d;
        public final String e;

        BooleanComparator(int i, String str) {
            this.d = i;
            this.e = str;
        }

        @Override // java.util.Comparator
        public final int compare(Boolean bool, Boolean bool2) {
            Boolean bool3 = bool2;
            boolean zBooleanValue = bool.booleanValue();
            int i = this.d;
            return (bool3.booleanValue() ? i : 0) - (zBooleanValue ? i : 0);
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.e;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LexicographicalComparator implements Comparator<boolean[]> {
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
        public final int compare(boolean[] zArr, boolean[] zArr2) {
            boolean[] zArr3 = zArr;
            boolean[] zArr4 = zArr2;
            int iMin = Math.min(zArr3.length, zArr4.length);
            for (int i = 0; i < iMin; i++) {
                int iCompare = Boolean.compare(zArr3[i], zArr4[i]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return zArr3.length - zArr4.length;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Booleans.lexicographicalComparator()";
        }
    }
}
