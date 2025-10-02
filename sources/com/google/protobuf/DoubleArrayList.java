package com.google.protobuf;

import YU.a;
import com.google.protobuf.Internal;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
final class DoubleArrayList extends AbstractProtobufList<Double> implements Internal.DoubleList, RandomAccess, PrimitiveNonBoxingCollection {
    public static final DoubleArrayList g = new DoubleArrayList(new double[0], 0, false);
    public double[] e;
    public int f;

    public DoubleArrayList(double[] dArr, int i, boolean z) {
        super(z);
        this.e = dArr;
        this.f = i;
    }

    public static DoubleArrayList g() {
        return g;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        double dDoubleValue = ((Double) obj).doubleValue();
        b();
        if (i < 0 || i > (i2 = this.f)) {
            StringBuilder sbR = a.r(i, "Index:", ", Size:");
            sbR.append(this.f);
            throw new IndexOutOfBoundsException(sbR.toString());
        }
        double[] dArr = this.e;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[androidx.constraintlayout.core.state.a.a(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.e, i, dArr2, i + 1, this.f - i);
            this.e = dArr2;
        }
        this.e[i] = dDoubleValue;
        this.f++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = Internal.f16059a;
        collection.getClass();
        if (!(collection instanceof DoubleArrayList)) {
            return super.addAll(collection);
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) collection;
        int i = doubleArrayList.f;
        if (i == 0) {
            return false;
        }
        int i2 = this.f;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.e;
        if (i3 > dArr.length) {
            this.e = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(doubleArrayList.e, 0, this.e, this.f, doubleArrayList.f);
        this.f = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(double d) {
        b();
        int i = this.f;
        double[] dArr = this.e;
        if (i == dArr.length) {
            double[] dArr2 = new double[androidx.constraintlayout.core.state.a.a(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.e = dArr2;
        }
        double[] dArr3 = this.e;
        int i2 = this.f;
        this.f = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DoubleArrayList)) {
            return super.equals(obj);
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) obj;
        if (this.f != doubleArrayList.f) {
            return false;
        }
        double[] dArr = doubleArrayList.e;
        for (int i = 0; i < this.f; i++) {
            if (Double.doubleToLongBits(this.e[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        h(i);
        return Double.valueOf(this.e[i]);
    }

    public final void h(int i) {
        if (i < 0 || i >= this.f) {
            StringBuilder sbR = a.r(i, "Index:", ", Size:");
            sbR.append(this.f);
            throw new IndexOutOfBoundsException(sbR.toString());
        }
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i = 0; i < this.f; i++) {
            iB = (iB * 31) + Internal.b(Double.doubleToLongBits(this.e[i]));
        }
        return iB;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i = this.f;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.e[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        b();
        h(i);
        double[] dArr = this.e;
        double d = dArr[i];
        if (i < this.f - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
        }
        this.f--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        b();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.e;
        System.arraycopy(dArr, i2, dArr, i, this.f - i2);
        this.f -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        b();
        h(i);
        double[] dArr = this.e;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f;
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    public final Internal.DoubleList a(int i) {
        if (i >= this.f) {
            return new DoubleArrayList(Arrays.copyOf(this.e, i), this.f, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d(((Double) obj).doubleValue());
        return true;
    }
}
