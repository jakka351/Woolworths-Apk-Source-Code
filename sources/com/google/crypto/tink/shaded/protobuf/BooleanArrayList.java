package com.google.crypto.tink.shaded.protobuf;

import YU.a;
import com.google.crypto.tink.shaded.protobuf.Internal;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
final class BooleanArrayList extends AbstractProtobufList<Boolean> implements Internal.BooleanList, RandomAccess, PrimitiveNonBoxingCollection {
    public static final BooleanArrayList g;
    public boolean[] e;
    public int f;

    static {
        BooleanArrayList booleanArrayList = new BooleanArrayList(new boolean[0], 0);
        g = booleanArrayList;
        booleanArrayList.d = false;
    }

    public BooleanArrayList() {
        this(new boolean[10], 0);
    }

    public static BooleanArrayList g() {
        return g;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        b();
        if (i < 0 || i > (i2 = this.f)) {
            StringBuilder sbR = a.r(i, "Index:", ", Size:");
            sbR.append(this.f);
            throw new IndexOutOfBoundsException(sbR.toString());
        }
        boolean[] zArr = this.e;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[androidx.constraintlayout.core.state.a.a(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.e, i, zArr2, i + 1, this.f - i);
            this.e = zArr2;
        }
        this.e[i] = zBooleanValue;
        this.f++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = Internal.f15103a;
        collection.getClass();
        if (!(collection instanceof BooleanArrayList)) {
            return super.addAll(collection);
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) collection;
        int i = booleanArrayList.f;
        if (i == 0) {
            return false;
        }
        int i2 = this.f;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.e;
        if (i3 > zArr.length) {
            this.e = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(booleanArrayList.e, 0, this.e, this.f, booleanArrayList.f);
        this.f = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void d(boolean z) {
        b();
        int i = this.f;
        boolean[] zArr = this.e;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[androidx.constraintlayout.core.state.a.a(i, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.e = zArr2;
        }
        boolean[] zArr3 = this.e;
        int i2 = this.f;
        this.f = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BooleanArrayList)) {
            return super.equals(obj);
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) obj;
        if (this.f != booleanArrayList.f) {
            return false;
        }
        boolean[] zArr = booleanArrayList.e;
        for (int i = 0; i < this.f; i++) {
            if (this.e[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        h(i);
        return Boolean.valueOf(this.e[i]);
    }

    public final void h(int i) {
        if (i < 0 || i >= this.f) {
            StringBuilder sbR = a.r(i, "Index:", ", Size:");
            sbR.append(this.f);
            throw new IndexOutOfBoundsException(sbR.toString());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f; i2++) {
            int i3 = i * 31;
            boolean z = this.e[i2];
            Charset charset = Internal.f15103a;
            i = i3 + (z ? 1231 : 1237);
        }
        return i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        b();
        for (int i = 0; i < this.f; i++) {
            if (obj.equals(Boolean.valueOf(this.e[i]))) {
                boolean[] zArr = this.e;
                System.arraycopy(zArr, i + 1, zArr, i, (this.f - i) - 1);
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
        boolean[] zArr = this.e;
        System.arraycopy(zArr, i2, zArr, i, this.f - i2);
        this.f -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        b();
        h(i);
        boolean[] zArr = this.e;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f;
    }

    public BooleanArrayList(boolean[] zArr, int i) {
        this.e = zArr;
        this.f = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    public final Internal.BooleanList a(int i) {
        if (i >= this.f) {
            return new BooleanArrayList(Arrays.copyOf(this.e, i), this.f);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        b();
        h(i);
        boolean[] zArr = this.e;
        boolean z = zArr[i];
        if (i < this.f - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.f--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d(((Boolean) obj).booleanValue());
        return true;
    }
}
