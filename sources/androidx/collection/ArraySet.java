package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableCollection;
import kotlin.jvm.internal.markers.KMutableSet;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010#\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Landroidx/collection/ArraySet;", "E", "", "", "ElementIterator", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ArraySet<E> implements Collection<E>, Set<E>, KMutableCollection, KMutableSet {
    public int[] d;
    public Object[] e;
    public int f;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/collection/ArraySet$ElementIterator;", "Landroidx/collection/IndexBasedArrayIterator;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class ElementIterator extends IndexBasedArrayIterator<E> {
        public ElementIterator() {
            super(ArraySet.this.f);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public final Object a(int i) {
            return ArraySet.this.e[i];
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public final void b(int i) {
            ArraySet.this.b(i);
        }
    }

    public ArraySet(int i) {
        this.d = ContainerHelpersKt.f705a;
        this.e = ContainerHelpersKt.c;
        if (i > 0) {
            this.d = new int[i];
            this.e = new Object[i];
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iA;
        int i2 = this.f;
        if (obj == null) {
            iA = ArraySetKt.a(this, null, 0);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iA = ArraySetKt.a(this, obj, iHashCode);
        }
        if (iA >= 0) {
            return false;
        }
        int i3 = ~iA;
        int[] iArr = this.d;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.e;
            int[] iArr2 = new int[i4];
            this.d = iArr2;
            this.e = new Object[i4];
            if (i2 != this.f) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                ArraysKt.u(0, iArr.length, 6, iArr, iArr2);
                ArraysKt.x(objArr, 0, this.e, objArr.length, 6);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.d;
            int i5 = i3 + 1;
            ArraysKt.q(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.e;
            ArraysKt.t(objArr2, i5, objArr2, i3, i2);
        }
        int i6 = this.f;
        if (i2 == i6) {
            int[] iArr4 = this.d;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.e[i3] = obj;
                this.f = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        Intrinsics.h(elements, "elements");
        int size = elements.size() + this.f;
        int i = this.f;
        int[] iArr = this.d;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.e;
            int[] iArr2 = new int[size];
            this.d = iArr2;
            this.e = new Object[size];
            if (i > 0) {
                ArraysKt.u(0, i, 6, iArr, iArr2);
                ArraysKt.x(objArr, 0, this.e, this.f, 6);
            }
        }
        if (this.f != i) {
            throw new ConcurrentModificationException();
        }
        Iterator<E> it = elements.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final Object b(int i) {
        int i2 = this.f;
        Object[] objArr = this.e;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.d;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                ArraysKt.q(i, i4, i2, iArr, iArr);
                Object[] objArr2 = this.e;
                ArraysKt.t(objArr2, i, objArr2, i4, i2);
            }
            this.e[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.d = iArr2;
            this.e = new Object[i5];
            if (i > 0) {
                ArraysKt.u(0, i, 6, iArr, iArr2);
                ArraysKt.x(objArr, 0, this.e, i, 6);
            }
            if (i < i3) {
                int i6 = i + 1;
                ArraysKt.q(i, i6, i2, iArr, this.d);
                ArraysKt.t(objArr, i, this.e, i6, i2);
            }
        }
        if (i2 != this.f) {
            throw new ConcurrentModificationException();
        }
        this.f = i3;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f != 0) {
            this.d = ContainerHelpersKt.f705a;
            this.e = ContainerHelpersKt.c;
            this.f = 0;
        }
        if (this.f != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? ArraySetKt.a(this, null, 0) : ArraySetKt.a(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        Intrinsics.h(elements, "elements");
        Iterator<E> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.f;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.e[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.d;
        int i = this.f;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new ElementIterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iA = obj == null ? ArraySetKt.a(this, null, 0) : ArraySetKt.a(this, obj, obj.hashCode());
        if (iA < 0) {
            return false;
        }
        b(iA);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        Intrinsics.h(elements, "elements");
        Iterator<E> it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        Intrinsics.h(elements, "elements");
        boolean z = false;
        for (int i = this.f - 1; -1 < i; i--) {
            if (!CollectionsKt.t(elements, this.e[i])) {
                b(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return ArraysKt.z(0, this.f, this.e);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f * 14);
        sb.append('{');
        int i = this.f;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.e[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        Intrinsics.h(array, "array");
        Object[] objArrA = ArraySetJvmUtil.a(this.f, array);
        ArraysKt.t(this.e, 0, objArrA, 0, this.f);
        return objArrA;
    }
}
