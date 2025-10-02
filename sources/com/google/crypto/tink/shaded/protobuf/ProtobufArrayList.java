package com.google.crypto.tink.shaded.protobuf;

import YU.a;
import com.google.crypto.tink.shaded.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class ProtobufArrayList<E> extends AbstractProtobufList<E> implements RandomAccess {
    public static final ProtobufArrayList g;
    public Object[] e;
    public int f;

    static {
        ProtobufArrayList protobufArrayList = new ProtobufArrayList(new Object[0], 0);
        g = protobufArrayList;
        protobufArrayList.d = false;
    }

    public ProtobufArrayList(Object[] objArr, int i) {
        this.e = objArr;
        this.f = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    public final Internal.ProtobufList a(int i) {
        if (i >= this.f) {
            return new ProtobufArrayList(Arrays.copyOf(this.e, i), this.f);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i = this.f;
        Object[] objArr = this.e;
        if (i == objArr.length) {
            this.e = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.e;
        int i2 = this.f;
        this.f = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void d(int i) {
        if (i < 0 || i >= this.f) {
            StringBuilder sbR = a.r(i, "Index:", ", Size:");
            sbR.append(this.f);
            throw new IndexOutOfBoundsException(sbR.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        d(i);
        return this.e[i];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        b();
        d(i);
        Object[] objArr = this.e;
        Object obj = objArr[i];
        if (i < this.f - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        b();
        d(i);
        Object[] objArr = this.e;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        b();
        if (i >= 0 && i <= (i2 = this.f)) {
            Object[] objArr = this.e;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[androidx.constraintlayout.core.state.a.a(i2, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.e, i, objArr2, i + 1, this.f - i);
                this.e = objArr2;
            }
            this.e[i] = obj;
            this.f++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbR = a.r(i, "Index:", ", Size:");
        sbR.append(this.f);
        throw new IndexOutOfBoundsException(sbR.toString());
    }
}
