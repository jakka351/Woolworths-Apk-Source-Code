package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

@ElementTypesAreNonnullByDefault
@Immutable
@GwtCompatible
/* loaded from: classes6.dex */
public final class ImmutableIntArray implements Serializable {
    public static final ImmutableIntArray g = new ImmutableIntArray(new int[0], 0, 0);
    public final int[] d;
    public final transient int e;
    public final int f;

    public static class AsList extends AbstractList<Integer> implements RandomAccess, Serializable {
        public final ImmutableIntArray d;

        public AsList(ImmutableIntArray immutableIntArray) {
            this.d = immutableIntArray;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            return indexOf(obj) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            boolean z = obj instanceof AsList;
            ImmutableIntArray immutableIntArray = this.d;
            if (z) {
                return immutableIntArray.equals(((AsList) obj).d);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (immutableIntArray.a() != list.size()) {
                return false;
            }
            int i = immutableIntArray.e;
            for (Object obj2 : list) {
                if (obj2 instanceof Integer) {
                    int i2 = i + 1;
                    if (immutableIntArray.d[i] == ((Integer) obj2).intValue()) {
                        i = i2;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i) {
            ImmutableIntArray immutableIntArray = this.d;
            Preconditions.i(i, immutableIntArray.a());
            return Integer.valueOf(immutableIntArray.d[immutableIntArray.e + i]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            return this.d.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            if (obj instanceof Integer) {
                int iIntValue = ((Integer) obj).intValue();
                ImmutableIntArray immutableIntArray = this.d;
                int i = immutableIntArray.e;
                for (int i2 = i; i2 < immutableIntArray.f; i2++) {
                    if (immutableIntArray.d[i2] == iIntValue) {
                        return i2 - i;
                    }
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            int i;
            if (obj instanceof Integer) {
                int iIntValue = ((Integer) obj).intValue();
                ImmutableIntArray immutableIntArray = this.d;
                int i2 = immutableIntArray.f;
                do {
                    i2--;
                    i = immutableIntArray.e;
                    if (i2 >= i) {
                    }
                } while (immutableIntArray.d[i2] != iIntValue);
                return i2 - i;
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.d.a();
        }

        @Override // java.util.AbstractList, java.util.List
        public final List subList(int i, int i2) {
            ImmutableIntArray immutableIntArray;
            ImmutableIntArray immutableIntArray2 = this.d;
            Preconditions.m(i, i2, immutableIntArray2.a());
            if (i == i2) {
                immutableIntArray = ImmutableIntArray.g;
            } else {
                int[] iArr = immutableIntArray2.d;
                int i3 = immutableIntArray2.e;
                immutableIntArray = new ImmutableIntArray(iArr, i + i3, i3 + i2);
            }
            return new AsList(immutableIntArray);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            return this.d.toString();
        }
    }

    public static final class Builder {
    }

    public ImmutableIntArray(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    public final int a() {
        return this.f - this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableIntArray) {
            ImmutableIntArray immutableIntArray = (ImmutableIntArray) obj;
            if (a() == immutableIntArray.a()) {
                for (int i = 0; i < a(); i++) {
                    Preconditions.i(i, a());
                    int i2 = this.d[this.e + i];
                    Preconditions.i(i, immutableIntArray.a());
                    if (i2 == immutableIntArray.d[immutableIntArray.e + i]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.e; i2 < this.f; i2++) {
            i = (i * 31) + this.d[i2];
        }
        return i;
    }

    public Object readResolve() {
        return this.f == this.e ? g : this;
    }

    public final String toString() {
        int i = this.e;
        int i2 = this.f;
        if (i2 == i) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(a() * 5);
        sb.append('[');
        int[] iArr = this.d;
        sb.append(iArr[i]);
        while (true) {
            i++;
            if (i >= i2) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i]);
        }
    }

    public Object writeReplace() {
        int[] iArr = this.d;
        int i = this.f;
        int i2 = this.e;
        return (i2 > 0 || i < iArr.length) ? new ImmutableIntArray(Arrays.copyOfRange(iArr, i2, i)) : this;
    }

    public ImmutableIntArray(int[] iArr, int i, int i2) {
        this.d = iArr;
        this.e = i;
        this.f = i2;
    }
}
