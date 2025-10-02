package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
class CompactHashSet<E> extends AbstractSet<E> implements Serializable {
    public transient Object d;
    public transient int[] e;
    public transient Object[] f;
    public transient int g;
    public transient int h;

    public CompactHashSet(int i) {
        k(i);
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(YU.a.d(i, "Invalid size: "));
        }
        k(i);
        for (int i2 = 0; i2 < i; i2++) {
            add(objectInputStream.readObject());
        }
    }

    @J2ktIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int iMin;
        if (n()) {
            d();
        }
        Set setH = h();
        if (setH != null) {
            return setH.add(obj);
        }
        int[] iArrQ = q();
        Object[] objArrO = o();
        int i = this.h;
        int i2 = i + 1;
        int iC = Hashing.c(obj);
        int iT = (1 << (this.g & 31)) - 1;
        int i3 = iC & iT;
        Object obj2 = this.d;
        Objects.requireNonNull(obj2);
        int iE = CompactHashing.e(i3, obj2);
        if (iE != 0) {
            int i4 = ~iT;
            int i5 = iC & i4;
            int i6 = 0;
            while (true) {
                int i7 = iE - 1;
                int i8 = iArrQ[i7];
                if ((i8 & i4) == i5 && com.google.common.base.Objects.a(obj, objArrO[i7])) {
                    return false;
                }
                int i9 = i8 & iT;
                i6++;
                if (i9 != 0) {
                    iE = i9;
                } else {
                    if (i6 >= 9) {
                        return g().add(obj);
                    }
                    if (i2 > iT) {
                        iT = t(iT, CompactHashing.c(iT), iC, i);
                    } else {
                        iArrQ[i7] = CompactHashing.b(i8, i2, iT);
                    }
                }
            }
        } else if (i2 > iT) {
            iT = t(iT, CompactHashing.c(iT), iC, i);
        } else {
            Object obj3 = this.d;
            Objects.requireNonNull(obj3);
            CompactHashing.f(i3, i2, obj3);
        }
        int length = q().length;
        if (i2 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            s(iMin);
        }
        l(i, iC, iT, obj);
        this.h = i2;
        this.g += 32;
        return true;
    }

    public int b(int i, int i2) {
        return i - 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (n()) {
            return;
        }
        this.g += 32;
        Set setH = h();
        if (setH != null) {
            this.g = Ints.c(size(), 3);
            setH.clear();
            this.d = null;
            this.h = 0;
            return;
        }
        Arrays.fill(o(), 0, this.h, (Object) null);
        Object obj = this.d;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(q(), 0, this.h, 0);
        this.h = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (n()) {
            return false;
        }
        Set setH = h();
        if (setH != null) {
            return setH.contains(obj);
        }
        int iC = Hashing.c(obj);
        int i = (1 << (this.g & 31)) - 1;
        Object obj2 = this.d;
        Objects.requireNonNull(obj2);
        int iE = CompactHashing.e(iC & i, obj2);
        if (iE == 0) {
            return false;
        }
        int i2 = ~i;
        int i3 = iC & i2;
        do {
            int i4 = iE - 1;
            int i5 = q()[i4];
            if ((i5 & i2) == i3 && com.google.common.base.Objects.a(obj, o()[i4])) {
                return true;
            }
            iE = i5 & i;
        } while (iE != 0);
        return false;
    }

    public int d() {
        Preconditions.q("Arrays already allocated", n());
        int i = this.g;
        int iMax = Math.max(4, Hashing.a(1.0d, i + 1));
        this.d = CompactHashing.a(iMax);
        this.g = CompactHashing.b(this.g, 32 - Integer.numberOfLeadingZeros(iMax - 1), 31);
        this.e = new int[i];
        this.f = new Object[i];
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LinkedHashSet g() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(1 << (this.g & 31), 1.0f);
        int i = i();
        while (i >= 0) {
            linkedHashSet.add(o()[i]);
            i = j(i);
        }
        this.d = linkedHashSet;
        this.e = null;
        this.f = null;
        this.g += 32;
        return linkedHashSet;
    }

    public final Set h() {
        Object obj = this.d;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    public int i() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Set setH = h();
        return setH != null ? setH.iterator() : new Iterator<Object>() { // from class: com.google.common.collect.CompactHashSet.1
            public int d;
            public int e;
            public int f = -1;

            {
                this.d = CompactHashSet.this.g;
                this.e = CompactHashSet.this.i();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.e >= 0;
            }

            @Override // java.util.Iterator
            public final Object next() {
                CompactHashSet compactHashSet = CompactHashSet.this;
                if (compactHashSet.g != this.d) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i = this.e;
                this.f = i;
                Object obj = compactHashSet.o()[i];
                this.e = compactHashSet.j(this.e);
                return obj;
            }

            @Override // java.util.Iterator
            public final void remove() {
                CompactHashSet compactHashSet = CompactHashSet.this;
                if (compactHashSet.g != this.d) {
                    throw new ConcurrentModificationException();
                }
                CollectPreconditions.d(this.f >= 0);
                this.d += 32;
                compactHashSet.remove(compactHashSet.o()[this.f]);
                this.e = compactHashSet.b(this.e, this.f);
                this.f = -1;
            }
        };
    }

    public int j(int i) {
        int i2 = i + 1;
        if (i2 < this.h) {
            return i2;
        }
        return -1;
    }

    public void k(int i) {
        Preconditions.f("Expected size must be >= 0", i >= 0);
        this.g = Ints.c(i, 1);
    }

    public void l(int i, int i2, int i3, Object obj) {
        q()[i] = CompactHashing.b(i2, 0, i3);
        o()[i] = obj;
    }

    public void m(int i, int i2) {
        Object obj = this.d;
        Objects.requireNonNull(obj);
        int[] iArrQ = q();
        Object[] objArrO = o();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrO[i] = null;
            iArrQ[i] = 0;
            return;
        }
        Object obj2 = objArrO[i3];
        objArrO[i] = obj2;
        objArrO[i3] = null;
        iArrQ[i] = iArrQ[i3];
        iArrQ[i3] = 0;
        int iC = Hashing.c(obj2) & i2;
        int iE = CompactHashing.e(iC, obj);
        if (iE == size) {
            CompactHashing.f(iC, i + 1, obj);
            return;
        }
        while (true) {
            int i4 = iE - 1;
            int i5 = iArrQ[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                iArrQ[i4] = CompactHashing.b(i5, i + 1, i2);
                return;
            }
            iE = i6;
        }
    }

    public final boolean n() {
        return this.d == null;
    }

    public final Object[] o() {
        Object[] objArr = this.f;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int[] q() {
        int[] iArr = this.e;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (n()) {
            return false;
        }
        Set setH = h();
        if (setH != null) {
            return setH.remove(obj);
        }
        int i = (1 << (this.g & 31)) - 1;
        Object obj2 = this.d;
        Objects.requireNonNull(obj2);
        int iD = CompactHashing.d(obj, null, i, obj2, q(), o(), null);
        if (iD == -1) {
            return false;
        }
        m(iD, i);
        this.h--;
        this.g += 32;
        return true;
    }

    public void s(int i) {
        this.e = Arrays.copyOf(q(), i);
        this.f = Arrays.copyOf(o(), i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Set setH = h();
        return setH != null ? setH.size() : this.h;
    }

    public final int t(int i, int i2, int i3, int i4) {
        Object objA = CompactHashing.a(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            CompactHashing.f(i3 & i5, i4 + 1, objA);
        }
        Object obj = this.d;
        Objects.requireNonNull(obj);
        int[] iArrQ = q();
        for (int i6 = 0; i6 <= i; i6++) {
            int iE = CompactHashing.e(i6, obj);
            while (iE != 0) {
                int i7 = iE - 1;
                int i8 = iArrQ[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iE2 = CompactHashing.e(i10, objA);
                CompactHashing.f(i10, iE, objA);
                iArrQ[i7] = CompactHashing.b(i9, iE2, i5);
                iE = i8 & i;
            }
        }
        this.d = objA;
        this.g = CompactHashing.b(this.g, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (n()) {
            return new Object[0];
        }
        Set setH = h();
        return setH != null ? setH.toArray() : Arrays.copyOf(o(), this.h);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        if (n()) {
            if (objArr.length > 0) {
                objArr[0] = null;
            }
            return objArr;
        }
        Set setH = h();
        if (setH != null) {
            return setH.toArray(objArr);
        }
        Object[] objArrO = o();
        int i = this.h;
        Preconditions.m(0, i, objArrO.length);
        if (objArr.length < i) {
            if (objArr.length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        System.arraycopy(objArrO, 0, objArr, 0, i);
        return objArr;
    }
}
