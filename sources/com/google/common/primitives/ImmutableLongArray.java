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
public final class ImmutableLongArray implements Serializable {
    public static final ImmutableLongArray g = new ImmutableLongArray(new long[0], 0, 0);
    public final long[] d;
    public final transient int e;
    public final int f;

    public static class AsList extends AbstractList<Long> implements RandomAccess, Serializable {
        public final ImmutableLongArray d;

        public AsList(ImmutableLongArray immutableLongArray) {
            this.d = immutableLongArray;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            return indexOf(obj) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            boolean z = obj instanceof AsList;
            ImmutableLongArray immutableLongArray = this.d;
            if (z) {
                return immutableLongArray.equals(((AsList) obj).d);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (immutableLongArray.a() != list.size()) {
                return false;
            }
            int i = immutableLongArray.e;
            for (Object obj2 : list) {
                if (obj2 instanceof Long) {
                    int i2 = i + 1;
                    if (immutableLongArray.d[i] == ((Long) obj2).longValue()) {
                        i = i2;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i) {
            ImmutableLongArray immutableLongArray = this.d;
            Preconditions.i(i, immutableLongArray.a());
            return Long.valueOf(immutableLongArray.d[immutableLongArray.e + i]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            return this.d.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            if (obj instanceof Long) {
                long jLongValue = ((Long) obj).longValue();
                ImmutableLongArray immutableLongArray = this.d;
                int i = immutableLongArray.e;
                for (int i2 = i; i2 < immutableLongArray.f; i2++) {
                    if (immutableLongArray.d[i2] == jLongValue) {
                        return i2 - i;
                    }
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            int i;
            if (obj instanceof Long) {
                long jLongValue = ((Long) obj).longValue();
                ImmutableLongArray immutableLongArray = this.d;
                int i2 = immutableLongArray.f;
                do {
                    i2--;
                    i = immutableLongArray.e;
                    if (i2 >= i) {
                    }
                } while (immutableLongArray.d[i2] != jLongValue);
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
            ImmutableLongArray immutableLongArray;
            ImmutableLongArray immutableLongArray2 = this.d;
            Preconditions.m(i, i2, immutableLongArray2.a());
            if (i == i2) {
                immutableLongArray = ImmutableLongArray.g;
            } else {
                long[] jArr = immutableLongArray2.d;
                int i3 = immutableLongArray2.e;
                immutableLongArray = new ImmutableLongArray(jArr, i + i3, i3 + i2);
            }
            return new AsList(immutableLongArray);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            return this.d.toString();
        }
    }

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public long[] f14940a;
        public int b;
    }

    public ImmutableLongArray(long[] jArr, int i, int i2) {
        this.d = jArr;
        this.e = i;
        this.f = i2;
    }

    public final int a() {
        return this.f - this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableLongArray) {
            ImmutableLongArray immutableLongArray = (ImmutableLongArray) obj;
            if (a() == immutableLongArray.a()) {
                for (int i = 0; i < a(); i++) {
                    Preconditions.i(i, a());
                    long j = this.d[this.e + i];
                    Preconditions.i(i, immutableLongArray.a());
                    if (j == immutableLongArray.d[immutableLongArray.e + i]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iA = 1;
        for (int i = this.e; i < this.f; i++) {
            iA = (iA * 31) + Longs.a(this.d[i]);
        }
        return iA;
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
        long[] jArr = this.d;
        sb.append(jArr[i]);
        while (true) {
            i++;
            if (i >= i2) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(jArr[i]);
        }
    }

    public Object writeReplace() {
        long[] jArr = this.d;
        int i = this.f;
        int i2 = this.e;
        if (i2 <= 0 && i >= jArr.length) {
            return this;
        }
        long[] jArrCopyOfRange = Arrays.copyOfRange(jArr, i2, i);
        return new ImmutableLongArray(jArrCopyOfRange, 0, jArrCopyOfRange.length);
    }
}
