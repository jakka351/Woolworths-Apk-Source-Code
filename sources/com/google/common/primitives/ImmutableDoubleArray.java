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
public final class ImmutableDoubleArray implements Serializable {
    public static final ImmutableDoubleArray g = new ImmutableDoubleArray(new double[0], 0, 0);
    public final double[] d;
    public final transient int e;
    public final int f;

    public static class AsList extends AbstractList<Double> implements RandomAccess, Serializable {
        public final ImmutableDoubleArray d;

        public AsList(ImmutableDoubleArray immutableDoubleArray) {
            this.d = immutableDoubleArray;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            return indexOf(obj) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            boolean z = obj instanceof AsList;
            ImmutableDoubleArray immutableDoubleArray = this.d;
            if (z) {
                return immutableDoubleArray.equals(((AsList) obj).d);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (immutableDoubleArray.b() != list.size()) {
                return false;
            }
            int i = immutableDoubleArray.e;
            for (Object obj2 : list) {
                if (obj2 instanceof Double) {
                    int i2 = i + 1;
                    if (ImmutableDoubleArray.a(immutableDoubleArray.d[i], ((Double) obj2).doubleValue())) {
                        i = i2;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i) {
            ImmutableDoubleArray immutableDoubleArray = this.d;
            Preconditions.i(i, immutableDoubleArray.b());
            return Double.valueOf(immutableDoubleArray.d[immutableDoubleArray.e + i]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            return this.d.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            if (obj instanceof Double) {
                double dDoubleValue = ((Double) obj).doubleValue();
                ImmutableDoubleArray immutableDoubleArray = this.d;
                int i = immutableDoubleArray.e;
                for (int i2 = i; i2 < immutableDoubleArray.f; i2++) {
                    if (ImmutableDoubleArray.a(immutableDoubleArray.d[i2], dDoubleValue)) {
                        return i2 - i;
                    }
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            if (obj instanceof Double) {
                double dDoubleValue = ((Double) obj).doubleValue();
                ImmutableDoubleArray immutableDoubleArray = this.d;
                int i = immutableDoubleArray.e;
                for (int i2 = immutableDoubleArray.f - 1; i2 >= i; i2--) {
                    if (ImmutableDoubleArray.a(immutableDoubleArray.d[i2], dDoubleValue)) {
                        return i2 - i;
                    }
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.d.b();
        }

        @Override // java.util.AbstractList, java.util.List
        public final List subList(int i, int i2) {
            ImmutableDoubleArray immutableDoubleArray;
            ImmutableDoubleArray immutableDoubleArray2 = this.d;
            Preconditions.m(i, i2, immutableDoubleArray2.b());
            if (i == i2) {
                immutableDoubleArray = ImmutableDoubleArray.g;
            } else {
                double[] dArr = immutableDoubleArray2.d;
                int i3 = immutableDoubleArray2.e;
                immutableDoubleArray = new ImmutableDoubleArray(dArr, i + i3, i3 + i2);
            }
            return new AsList(immutableDoubleArray);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            return this.d.toString();
        }
    }

    public static final class Builder {
    }

    public ImmutableDoubleArray(double[] dArr, int i, int i2) {
        this.d = dArr;
        this.e = i;
        this.f = i2;
    }

    public static boolean a(double d, double d2) {
        return Double.doubleToLongBits(d) == Double.doubleToLongBits(d2);
    }

    public final int b() {
        return this.f - this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableDoubleArray) {
            ImmutableDoubleArray immutableDoubleArray = (ImmutableDoubleArray) obj;
            if (b() == immutableDoubleArray.b()) {
                for (int i = 0; i < b(); i++) {
                    Preconditions.i(i, b());
                    double d = this.d[this.e + i];
                    Preconditions.i(i, immutableDoubleArray.b());
                    if (a(d, immutableDoubleArray.d[immutableDoubleArray.e + i])) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (int i = this.e; i < this.f; i++) {
            double d = this.d[i];
            int i2 = Doubles.f14939a;
            iHashCode = (iHashCode * 31) + Double.valueOf(d).hashCode();
        }
        return iHashCode;
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
        StringBuilder sb = new StringBuilder(b() * 5);
        sb.append('[');
        double[] dArr = this.d;
        sb.append(dArr[i]);
        while (true) {
            i++;
            if (i >= i2) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(dArr[i]);
        }
    }

    public Object writeReplace() {
        double[] dArr = this.d;
        int i = this.f;
        int i2 = this.e;
        if (i2 <= 0 && i >= dArr.length) {
            return this;
        }
        double[] dArrCopyOfRange = Arrays.copyOfRange(dArr, i2, i);
        return new ImmutableDoubleArray(dArrCopyOfRange, 0, dArrCopyOfRange.length);
    }
}
