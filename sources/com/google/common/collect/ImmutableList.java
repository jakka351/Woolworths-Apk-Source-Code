package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes.dex */
public abstract class ImmutableList<E> extends ImmutableCollection<E> implements List<E>, RandomAccess {
    public static final UnmodifiableListIterator e = new Itr(0, RegularImmutableList.h);

    public static final class Builder<E> extends ImmutableCollection.ArrayBasedBuilder<E> {
        public Builder() {
            super(4);
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        public final ImmutableCollection.Builder a(Object obj) {
            super.a(obj);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder
        /* renamed from: c */
        public final ImmutableCollection.ArrayBasedBuilder a(Object obj) {
            super.a(obj);
            return this;
        }

        public final void h(Object obj) {
            super.a(obj);
        }

        public final void i(Object... objArr) {
            d(objArr.length, objArr);
        }

        public final ImmutableList j() {
            this.c = true;
            return ImmutableList.l(this.b, this.f14883a);
        }
    }

    public static class Itr<E> extends AbstractIndexedListIterator<E> {
        public final ImmutableList f;

        public Itr(int i, ImmutableList immutableList) {
            super(immutableList.size(), i);
            this.f = immutableList;
        }

        @Override // com.google.common.collect.AbstractIndexedListIterator
        public final Object a(int i) {
            return this.f.get(i);
        }
    }

    /* loaded from: classes6.dex */
    public static class ReverseImmutableList<E> extends ImmutableList<E> {
        public final transient ImmutableList f;

        public ReverseImmutableList(ImmutableList immutableList) {
            this.f = immutableList;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public final ImmutableList subList(int i, int i2) {
            ImmutableList immutableList = this.f;
            Preconditions.m(i, i2, immutableList.size());
            return immutableList.subList(immutableList.size() - i2, immutableList.size() - i).z();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return this.f.contains(obj);
        }

        @Override // java.util.List
        public final Object get(int i) {
            ImmutableList immutableList = this.f;
            Preconditions.i(i, immutableList.size());
            return immutableList.get((immutableList.size() - 1) - i);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final int indexOf(Object obj) {
            int iLastIndexOf = this.f.lastIndexOf(obj);
            if (iLastIndexOf >= 0) {
                return (r0.size() - 1) - iLastIndexOf;
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean j() {
            return this.f.j();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final int lastIndexOf(Object obj) {
            int iIndexOf = this.f.indexOf(obj);
            if (iIndexOf >= 0) {
                return (r0.size() - 1) - iIndexOf;
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f.size();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        @GwtIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableList
        public final ImmutableList z() {
            return this.f;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return listIterator(i);
        }
    }

    @J2ktIncompatible
    /* loaded from: classes6.dex */
    public static class SerializedForm implements Serializable {
        public final Object[] d;

        public SerializedForm(Object[] objArr) {
            this.d = objArr;
        }

        public Object readResolve() {
            return ImmutableList.q(this.d);
        }
    }

    /* loaded from: classes6.dex */
    public class SubList extends ImmutableList<E> {
        public final transient int f;
        public final transient int g;

        public SubList(int i, int i2) {
            this.f = i;
            this.g = i2;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        /* renamed from: C */
        public final ImmutableList subList(int i, int i2) {
            Preconditions.m(i, i2, this.g);
            int i3 = this.f;
            return ImmutableList.this.subList(i + i3, i2 + i3);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final Object[] g() {
            return ImmutableList.this.g();
        }

        @Override // java.util.List
        public final Object get(int i) {
            Preconditions.i(i, this.g);
            return ImmutableList.this.get(i + this.f);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int h() {
            return ImmutableList.this.i() + this.f + this.g;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int i() {
            return ImmutableList.this.i() + this.f;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean j() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.g;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        @GwtIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return listIterator(i);
        }
    }

    public static ImmutableList B(Ordering ordering, Collection collection) {
        ordering.getClass();
        Object[] objArrH = Iterables.h(collection);
        ObjectArrays.a(objArrH.length, objArrH);
        Arrays.sort(objArrH, ordering);
        return l(objArrH.length, objArrH);
    }

    public static ImmutableList l(int i, Object[] objArr) {
        return i == 0 ? RegularImmutableList.h : new RegularImmutableList(objArr, i);
    }

    public static Builder m() {
        return new Builder(4);
    }

    public static Builder n(int i) {
        CollectPreconditions.b(i, "expectedSize");
        return new Builder(i);
    }

    public static ImmutableList o(Collection collection) {
        if (!(collection instanceof ImmutableCollection)) {
            Object[] array = collection.toArray();
            ObjectArrays.a(array.length, array);
            return l(array.length, array);
        }
        ImmutableList immutableListB = ((ImmutableCollection) collection).b();
        if (!immutableListB.j()) {
            return immutableListB;
        }
        Object[] array2 = immutableListB.toArray(ImmutableCollection.d);
        return l(array2.length, array2);
    }

    public static ImmutableList q(Object[] objArr) {
        if (objArr.length == 0) {
            return RegularImmutableList.h;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        ObjectArrays.a(objArr2.length, objArr2);
        return l(objArr2.length, objArr2);
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static ImmutableList t() {
        return RegularImmutableList.h;
    }

    public static ImmutableList u(Long l, Long l2, Long l3, Long l4, Long l5) {
        Object[] objArr = {l, l2, l3, l4, l5};
        ObjectArrays.a(5, objArr);
        return l(5, objArr);
    }

    public static ImmutableList w(Object obj) {
        Object[] objArr = {obj};
        ObjectArrays.a(1, objArr);
        return l(1, objArr);
    }

    public static ImmutableList x(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ObjectArrays.a(2, objArr);
        return l(2, objArr);
    }

    public static ImmutableList y(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Object... objArr) {
        Preconditions.f("the total number of elements must fit in an int", objArr.length <= 2147483635);
        int length = objArr.length + 12;
        Object[] objArr2 = new Object[length];
        objArr2[0] = str;
        objArr2[1] = str2;
        objArr2[2] = str3;
        objArr2[3] = str4;
        objArr2[4] = str5;
        objArr2[5] = str6;
        objArr2[6] = str7;
        objArr2[7] = str8;
        objArr2[8] = str9;
        objArr2[9] = str10;
        objArr2[10] = str11;
        objArr2[11] = str12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        ObjectArrays.a(length, objArr2);
        return l(length, objArr2);
    }

    @Override // java.util.List
    /* renamed from: C */
    public ImmutableList subList(int i, int i2) {
        Preconditions.m(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? RegularImmutableList.h : new SubList(i, i3);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final ImmutableList b() {
        return this;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int d(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator<E> it = iterator();
                        Iterator<E> it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && Objects.a(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        if (Objects.a(get(i), list.get(i))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: k */
    public final UnmodifiableIterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public UnmodifiableListIterator listIterator(int i) {
        Preconditions.l(i, size());
        return isEmpty() ? e : new Itr(i, this);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    @GwtIncompatible
    public Object writeReplace() {
        return new SerializedForm(toArray(ImmutableCollection.d));
    }

    public ImmutableList z() {
        return size() <= 1 ? this : new ReverseImmutableList(this);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }
}
