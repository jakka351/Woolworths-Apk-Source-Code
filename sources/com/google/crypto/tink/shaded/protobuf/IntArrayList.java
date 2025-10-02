package com.google.crypto.tink.shaded.protobuf;

import androidx.constraintlayout.core.state.a;
import com.google.crypto.tink.shaded.protobuf.Internal;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
final class IntArrayList extends AbstractProtobufList<Integer> implements Internal.IntList, RandomAccess, PrimitiveNonBoxingCollection {
    public static final IntArrayList g;
    public int[] e;
    public int f;

    static {
        IntArrayList intArrayList = new IntArrayList(new int[0], 0);
        g = intArrayList;
        intArrayList.d = false;
    }

    public IntArrayList() {
        this(new int[10], 0);
    }

    public static IntArrayList d() {
        return g;
    }

    public final void W1(int i) {
        b();
        int i2 = this.f;
        int[] iArr = this.e;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[a.a(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.e = iArr2;
        }
        int[] iArr3 = this.e;
        int i3 = this.f;
        this.f = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        b();
        if (i < 0 || i > (i2 = this.f)) {
            StringBuilder sbR = YU.a.r(i, "Index:", ", Size:");
            sbR.append(this.f);
            throw new IndexOutOfBoundsException(sbR.toString());
        }
        int[] iArr = this.e;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[a.a(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.e, i, iArr2, i + 1, this.f - i);
            this.e = iArr2;
        }
        this.e[i] = iIntValue;
        this.f++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = Internal.f15103a;
        collection.getClass();
        if (!(collection instanceof IntArrayList)) {
            return super.addAll(collection);
        }
        IntArrayList intArrayList = (IntArrayList) collection;
        int i = intArrayList.f;
        if (i == 0) {
            return false;
        }
        int i2 = this.f;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.e;
        if (i3 > iArr.length) {
            this.e = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(intArrayList.e, 0, this.e, this.f, intArrayList.f);
        this.f = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntArrayList)) {
            return super.equals(obj);
        }
        IntArrayList intArrayList = (IntArrayList) obj;
        if (this.f != intArrayList.f) {
            return false;
        }
        int[] iArr = intArrayList.e;
        for (int i = 0; i < this.f; i++) {
            if (this.e[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i) {
        if (i < 0 || i >= this.f) {
            StringBuilder sbR = YU.a.r(i, "Index:", ", Size:");
            sbR.append(this.f);
            throw new IndexOutOfBoundsException(sbR.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Integer.valueOf(getInt(i));
    }

    public final int getInt(int i) {
        g(i);
        return this.e[i];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f; i2++) {
            i = (i * 31) + this.e[i2];
        }
        return i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        b();
        for (int i = 0; i < this.f; i++) {
            if (obj.equals(Integer.valueOf(this.e[i]))) {
                int[] iArr = this.e;
                System.arraycopy(iArr, i + 1, iArr, i, (this.f - i) - 1);
                this.f--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        b();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.e;
        System.arraycopy(iArr, i2, iArr, i, this.f - i2);
        this.f -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        b();
        g(i);
        int[] iArr = this.e;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f;
    }

    public IntArrayList(int[] iArr, int i) {
        this.e = iArr;
        this.f = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    public final Internal.IntList a(int i) {
        if (i >= this.f) {
            return new IntArrayList(Arrays.copyOf(this.e, i), this.f);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        b();
        g(i);
        int[] iArr = this.e;
        int i2 = iArr[i];
        if (i < this.f - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        W1(((Integer) obj).intValue());
        return true;
    }
}
