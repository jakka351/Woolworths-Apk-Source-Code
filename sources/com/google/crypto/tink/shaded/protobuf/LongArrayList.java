package com.google.crypto.tink.shaded.protobuf;

import YU.a;
import com.google.crypto.tink.shaded.protobuf.Internal;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
final class LongArrayList extends AbstractProtobufList<Long> implements Internal.LongList, RandomAccess, PrimitiveNonBoxingCollection {
    public static final LongArrayList g;
    public long[] e;
    public int f;

    static {
        LongArrayList longArrayList = new LongArrayList(new long[0], 0);
        g = longArrayList;
        longArrayList.d = false;
    }

    public LongArrayList() {
        this(new long[10], 0);
    }

    public static LongArrayList g() {
        return g;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        b();
        if (i < 0 || i > (i2 = this.f)) {
            StringBuilder sbR = a.r(i, "Index:", ", Size:");
            sbR.append(this.f);
            throw new IndexOutOfBoundsException(sbR.toString());
        }
        long[] jArr = this.e;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[androidx.constraintlayout.core.state.a.a(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.e, i, jArr2, i + 1, this.f - i);
            this.e = jArr2;
        }
        this.e[i] = jLongValue;
        this.f++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = Internal.f15103a;
        collection.getClass();
        if (!(collection instanceof LongArrayList)) {
            return super.addAll(collection);
        }
        LongArrayList longArrayList = (LongArrayList) collection;
        int i = longArrayList.f;
        if (i == 0) {
            return false;
        }
        int i2 = this.f;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.e;
        if (i3 > jArr.length) {
            this.e = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(longArrayList.e, 0, this.e, this.f, longArrayList.f);
        this.f = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void d(long j) {
        b();
        int i = this.f;
        long[] jArr = this.e;
        if (i == jArr.length) {
            long[] jArr2 = new long[androidx.constraintlayout.core.state.a.a(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.e = jArr2;
        }
        long[] jArr3 = this.e;
        int i2 = this.f;
        this.f = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LongArrayList)) {
            return super.equals(obj);
        }
        LongArrayList longArrayList = (LongArrayList) obj;
        if (this.f != longArrayList.f) {
            return false;
        }
        long[] jArr = longArrayList.e;
        for (int i = 0; i < this.f; i++) {
            if (this.e[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Long.valueOf(i(i));
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
        int iB = 1;
        for (int i = 0; i < this.f; i++) {
            iB = (iB * 31) + Internal.b(this.e[i]);
        }
        return iB;
    }

    public final long i(int i) {
        h(i);
        return this.e[i];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        b();
        for (int i = 0; i < this.f; i++) {
            if (obj.equals(Long.valueOf(this.e[i]))) {
                long[] jArr = this.e;
                System.arraycopy(jArr, i + 1, jArr, i, (this.f - i) - 1);
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
        long[] jArr = this.e;
        System.arraycopy(jArr, i2, jArr, i, this.f - i2);
        this.f -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        b();
        h(i);
        long[] jArr = this.e;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f;
    }

    public LongArrayList(long[] jArr, int i) {
        this.e = jArr;
        this.f = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    public final Internal.LongList a(int i) {
        if (i >= this.f) {
            return new LongArrayList(Arrays.copyOf(this.e, i), this.f);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        b();
        h(i);
        long[] jArr = this.e;
        long j = jArr[i];
        if (i < this.f - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.f--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d(((Long) obj).longValue());
        return true;
    }
}
