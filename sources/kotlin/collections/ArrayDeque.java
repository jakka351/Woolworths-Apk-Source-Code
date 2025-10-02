package kotlin.collections;

import YU.a;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SinceKotlin
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/collections/ArrayDeque;", "E", "Lkotlin/collections/AbstractMutableList;", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ArrayDeque<E> extends AbstractMutableList<E> {
    public static final Object[] g = new Object[0];
    public int d;
    public Object[] e;
    public int f;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u001c\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/collections/ArrayDeque$Companion;", "", "", "emptyElementData", "[Ljava/lang/Object;", "", "defaultMinCapacity", "I", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
    }

    public ArrayDeque() {
        this.e = g;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        AbstractList.Companion.c(i, this.f);
        if (i == this.f) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        o();
        h(this.f + 1);
        int iN = n(this.d + i);
        int i2 = this.f;
        if (i < ((i2 + 1) >> 1)) {
            int iK = iN == 0 ? ArraysKt.K(this.e) : iN - 1;
            int i3 = this.d;
            int iK2 = i3 == 0 ? ArraysKt.K(this.e) : i3 - 1;
            int i4 = this.d;
            if (iK >= i4) {
                Object[] objArr = this.e;
                objArr[iK2] = objArr[i4];
                ArraysKt.t(objArr, i4, objArr, i4 + 1, iK + 1);
            } else {
                Object[] objArr2 = this.e;
                ArraysKt.t(objArr2, i4 - 1, objArr2, i4, objArr2.length);
                Object[] objArr3 = this.e;
                objArr3[objArr3.length - 1] = objArr3[0];
                ArraysKt.t(objArr3, 0, objArr3, 1, iK + 1);
            }
            this.e[iK] = obj;
            this.d = iK2;
        } else {
            int iN2 = n(i2 + this.d);
            if (iN < iN2) {
                Object[] objArr4 = this.e;
                ArraysKt.t(objArr4, iN + 1, objArr4, iN, iN2);
            } else {
                Object[] objArr5 = this.e;
                ArraysKt.t(objArr5, 1, objArr5, 0, iN2);
                Object[] objArr6 = this.e;
                objArr6[0] = objArr6[objArr6.length - 1];
                ArraysKt.t(objArr6, iN + 1, objArr6, iN, objArr6.length - 1);
            }
            this.e[iN] = obj;
        }
        this.f++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection elements) {
        Intrinsics.h(elements, "elements");
        AbstractList.Companion.c(i, this.f);
        if (elements.isEmpty()) {
            return false;
        }
        if (i == this.f) {
            return addAll(elements);
        }
        o();
        h(elements.size() + this.f);
        int iN = n(this.f + this.d);
        int iN2 = n(this.d + i);
        int size = elements.size();
        if (i >= ((this.f + 1) >> 1)) {
            int i2 = iN2 + size;
            if (iN2 < iN) {
                int i3 = size + iN;
                Object[] objArr = this.e;
                if (i3 <= objArr.length) {
                    ArraysKt.t(objArr, i2, objArr, iN2, iN);
                } else if (i2 >= objArr.length) {
                    ArraysKt.t(objArr, i2 - objArr.length, objArr, iN2, iN);
                } else {
                    int length = iN - (i3 - objArr.length);
                    ArraysKt.t(objArr, 0, objArr, length, iN);
                    Object[] objArr2 = this.e;
                    ArraysKt.t(objArr2, i2, objArr2, iN2, length);
                }
            } else {
                Object[] objArr3 = this.e;
                ArraysKt.t(objArr3, size, objArr3, 0, iN);
                Object[] objArr4 = this.e;
                if (i2 >= objArr4.length) {
                    ArraysKt.t(objArr4, i2 - objArr4.length, objArr4, iN2, objArr4.length);
                } else {
                    ArraysKt.t(objArr4, 0, objArr4, objArr4.length - size, objArr4.length);
                    Object[] objArr5 = this.e;
                    ArraysKt.t(objArr5, i2, objArr5, iN2, objArr5.length - size);
                }
            }
            g(iN2, elements);
            return true;
        }
        int i4 = this.d;
        int length2 = i4 - size;
        if (iN2 < i4) {
            Object[] objArr6 = this.e;
            ArraysKt.t(objArr6, length2, objArr6, i4, objArr6.length);
            if (size >= iN2) {
                Object[] objArr7 = this.e;
                ArraysKt.t(objArr7, objArr7.length - size, objArr7, 0, iN2);
            } else {
                Object[] objArr8 = this.e;
                ArraysKt.t(objArr8, objArr8.length - size, objArr8, 0, size);
                Object[] objArr9 = this.e;
                ArraysKt.t(objArr9, 0, objArr9, size, iN2);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.e;
            ArraysKt.t(objArr10, length2, objArr10, i4, iN2);
        } else {
            Object[] objArr11 = this.e;
            length2 += objArr11.length;
            int i5 = iN2 - i4;
            int length3 = objArr11.length - length2;
            if (length3 >= i5) {
                ArraysKt.t(objArr11, length2, objArr11, i4, iN2);
            } else {
                ArraysKt.t(objArr11, length2, objArr11, i4, i4 + length3);
                Object[] objArr12 = this.e;
                ArraysKt.t(objArr12, 0, objArr12, this.d + length3, iN2);
            }
        }
        this.d = length2;
        g(l(iN2 - size), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        o();
        h(this.f + 1);
        int i = this.d;
        int iK = i == 0 ? ArraysKt.K(this.e) : i - 1;
        this.d = iK;
        this.e[iK] = obj;
        this.f++;
    }

    public final void addLast(Object obj) {
        o();
        h(getE() + 1);
        this.e[n(getE() + this.d)] = obj;
        this.f = getE() + 1;
    }

    @Override // kotlin.collections.AbstractMutableList
    /* renamed from: b, reason: from getter */
    public final int getE() {
        return this.f;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            o();
            m(this.d, n(getE() + this.d));
        }
        this.d = 0;
        this.f = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // kotlin.collections.AbstractMutableList
    public final Object d(int i) {
        AbstractList.Companion.b(i, this.f);
        if (i == CollectionsKt.I(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        o();
        int iN = n(this.d + i);
        Object[] objArr = this.e;
        Object obj = objArr[iN];
        if (i < (this.f >> 1)) {
            int i2 = this.d;
            if (iN >= i2) {
                ArraysKt.t(objArr, i2 + 1, objArr, i2, iN);
            } else {
                ArraysKt.t(objArr, 1, objArr, 0, iN);
                Object[] objArr2 = this.e;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i3 = this.d;
                ArraysKt.t(objArr2, i3 + 1, objArr2, i3, objArr2.length - 1);
            }
            Object[] objArr3 = this.e;
            int i4 = this.d;
            objArr3[i4] = null;
            this.d = j(i4);
        } else {
            int iN2 = n(CollectionsKt.I(this) + this.d);
            if (iN <= iN2) {
                Object[] objArr4 = this.e;
                ArraysKt.t(objArr4, iN, objArr4, iN + 1, iN2 + 1);
            } else {
                Object[] objArr5 = this.e;
                ArraysKt.t(objArr5, iN, objArr5, iN + 1, objArr5.length);
                Object[] objArr6 = this.e;
                objArr6[objArr6.length - 1] = objArr6[0];
                ArraysKt.t(objArr6, 0, objArr6, 1, iN2 + 1);
            }
            this.e[iN2] = null;
        }
        this.f--;
        return obj;
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.e[this.d];
    }

    public final void g(int i, Collection collection) {
        Iterator<E> it = collection.iterator();
        int length = this.e.length;
        while (i < length && it.hasNext()) {
            this.e[i] = it.next();
            i++;
        }
        int i2 = this.d;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.e[i3] = it.next();
        }
        this.f = collection.size() + this.f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        AbstractList.Companion.b(i, this.f);
        return this.e[n(this.d + i)];
    }

    public final void h(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.e;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == g) {
            if (i < 10) {
                i = 10;
            }
            this.e = new Object[i];
            return;
        }
        Object[] objArr2 = new Object[AbstractList.Companion.e(objArr.length, i)];
        Object[] objArr3 = this.e;
        ArraysKt.t(objArr3, 0, objArr2, this.d, objArr3.length);
        Object[] objArr4 = this.e;
        int length = objArr4.length;
        int i2 = this.d;
        ArraysKt.t(objArr4, length - i2, objArr2, 0, i2);
        this.d = 0;
        this.e = objArr2;
    }

    public final Object i() {
        if (isEmpty()) {
            return null;
        }
        return this.e[this.d];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iN = n(getE() + this.d);
        int length = this.d;
        if (length < iN) {
            while (length < iN) {
                if (Intrinsics.c(obj, this.e[length])) {
                    i = this.d;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iN) {
            return -1;
        }
        int length2 = this.e.length;
        while (true) {
            if (length >= length2) {
                for (int i2 = 0; i2 < iN; i2++) {
                    if (Intrinsics.c(obj, this.e[i2])) {
                        length = i2 + this.e.length;
                        i = this.d;
                    }
                }
                return -1;
            }
            if (Intrinsics.c(obj, this.e[length])) {
                i = this.d;
                break;
            }
            length++;
        }
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return getE() == 0;
    }

    public final int j(int i) {
        if (i == ArraysKt.K(this.e)) {
            return 0;
        }
        return i + 1;
    }

    public final Object k() {
        if (isEmpty()) {
            return null;
        }
        return this.e[n(CollectionsKt.I(this) + this.d)];
    }

    public final int l(int i) {
        return i < 0 ? i + this.e.length : i;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.e[n(CollectionsKt.I(this) + this.d)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int iK;
        int i;
        int iN = n(getE() + this.d);
        int i2 = this.d;
        if (i2 < iN) {
            iK = iN - 1;
            if (i2 <= iK) {
                while (!Intrinsics.c(obj, this.e[iK])) {
                    if (iK != i2) {
                        iK--;
                    }
                }
                i = this.d;
                return iK - i;
            }
            return -1;
        }
        if (i2 > iN) {
            int i3 = iN - 1;
            while (true) {
                if (-1 >= i3) {
                    iK = ArraysKt.K(this.e);
                    int i4 = this.d;
                    if (i4 <= iK) {
                        while (!Intrinsics.c(obj, this.e[iK])) {
                            if (iK != i4) {
                                iK--;
                            }
                        }
                        i = this.d;
                    }
                } else {
                    if (Intrinsics.c(obj, this.e[i3])) {
                        iK = i3 + this.e.length;
                        i = this.d;
                        break;
                    }
                    i3--;
                }
            }
        }
        return -1;
    }

    public final void m(int i, int i2) {
        if (i < i2) {
            ArraysKt.B(this.e, i, i2, null);
            return;
        }
        Object[] objArr = this.e;
        ArraysKt.B(objArr, i, objArr.length, null);
        ArraysKt.B(this.e, 0, i2, null);
    }

    public final int n(int i) {
        Object[] objArr = this.e;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void o() {
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        d(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        int iN;
        Intrinsics.h(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.e.length != 0) {
            int iN2 = n(getE() + this.d);
            int i = this.d;
            if (i < iN2) {
                iN = i;
                while (i < iN2) {
                    Object obj = this.e[i];
                    if (elements.contains(obj)) {
                        z = true;
                    } else {
                        this.e[iN] = obj;
                        iN++;
                    }
                    i++;
                }
                ArraysKt.B(this.e, iN, iN2, null);
            } else {
                int length = this.e.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.e;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (elements.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.e[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iN = n(i2);
                for (int i3 = 0; i3 < iN2; i3++) {
                    Object[] objArr2 = this.e;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (elements.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.e[iN] = obj3;
                        iN = j(iN);
                    }
                }
                z = z2;
            }
            if (z) {
                o();
                this.f = l(iN - this.d);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        o();
        Object[] objArr = this.e;
        int i = this.d;
        Object obj = objArr[i];
        objArr[i] = null;
        this.d = j(i);
        this.f = getE() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        o();
        int iN = n(CollectionsKt.I(this) + this.d);
        Object[] objArr = this.e;
        Object obj = objArr[iN];
        objArr[iN] = null;
        this.f = getE() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        AbstractList.Companion.d(i, i2, this.f);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.f) {
            clear();
            return;
        }
        if (i3 == 1) {
            d(i);
            return;
        }
        o();
        if (i < this.f - i2) {
            int iN = n(this.d + (i - 1));
            int iN2 = n(this.d + (i2 - 1));
            while (i > 0) {
                int i4 = iN + 1;
                int iMin = Math.min(i, Math.min(i4, iN2 + 1));
                Object[] objArr = this.e;
                int i5 = iN2 - iMin;
                int i6 = iN - iMin;
                ArraysKt.t(objArr, i5 + 1, objArr, i6 + 1, i4);
                iN = l(i6);
                iN2 = l(i5);
                i -= iMin;
            }
            int iN3 = n(this.d + i3);
            m(this.d, iN3);
            this.d = iN3;
        } else {
            int iN4 = n(this.d + i2);
            int iN5 = n(this.d + i);
            int i7 = this.f;
            while (true) {
                i7 -= i2;
                if (i7 <= 0) {
                    break;
                }
                Object[] objArr2 = this.e;
                i2 = Math.min(i7, Math.min(objArr2.length - iN4, objArr2.length - iN5));
                Object[] objArr3 = this.e;
                int i8 = iN4 + i2;
                ArraysKt.t(objArr3, iN5, objArr3, iN4, i8);
                iN4 = n(i8);
                iN5 = n(iN5 + i2);
            }
            int iN6 = n(this.f + this.d);
            m(l(iN6 - i3), iN6);
        }
        this.f -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        int iN;
        Intrinsics.h(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.e.length != 0) {
            int iN2 = n(getE() + this.d);
            int i = this.d;
            if (i < iN2) {
                iN = i;
                while (i < iN2) {
                    Object obj = this.e[i];
                    if (elements.contains(obj)) {
                        this.e[iN] = obj;
                        iN++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                ArraysKt.B(this.e, iN, iN2, null);
            } else {
                int length = this.e.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.e;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (elements.contains(obj2)) {
                        this.e[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iN = n(i2);
                for (int i3 = 0; i3 < iN2; i3++) {
                    Object[] objArr2 = this.e;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (elements.contains(obj3)) {
                        this.e[iN] = obj3;
                        iN = j(iN);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                o();
                this.f = l(iN - this.d);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        AbstractList.Companion.b(i, this.f);
        int iN = n(this.d + i);
        Object[] objArr = this.e;
        Object obj2 = objArr[iN];
        objArr[iN] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[getE()]);
    }

    public ArrayDeque(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = g;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            throw new IllegalArgumentException(a.d(i, "Illegal Capacity: "));
        }
        this.e = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) throws NegativeArraySizeException {
        Intrinsics.h(array, "array");
        int length = array.length;
        int i = this.f;
        if (length < i) {
            Object objNewInstance = Array.newInstance(array.getClass().getComponentType(), i);
            Intrinsics.f(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) objNewInstance;
        }
        int iN = n(this.f + this.d);
        int i2 = this.d;
        if (i2 < iN) {
            ArraysKt.x(this.e, i2, array, iN, 2);
        } else if (!isEmpty()) {
            Object[] objArr = this.e;
            ArraysKt.t(objArr, 0, array, this.d, objArr.length);
            Object[] objArr2 = this.e;
            ArraysKt.t(objArr2, objArr2.length - this.d, array, 0, iN);
        }
        int i3 = this.f;
        if (i3 < array.length) {
            array[i3] = null;
        }
        return array;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        Intrinsics.h(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        o();
        h(elements.size() + getE());
        g(n(getE() + this.d), elements);
        return true;
    }
}
