package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes.dex */
public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {
    public static final /* synthetic */ int f = 0;
    public transient ImmutableList e;

    public static class Builder<E> extends ImmutableCollection.ArrayBasedBuilder<E> {
        public Object[] d;
        public int e;

        public Builder() {
            super(4);
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Builder a(Object obj) {
            obj.getClass();
            if (this.d != null) {
                int iN = ImmutableSet.n(this.b);
                Object[] objArr = this.d;
                if (iN <= objArr.length) {
                    Objects.requireNonNull(objArr);
                    int length = this.d.length - 1;
                    int iHashCode = obj.hashCode();
                    int iB = Hashing.b(iHashCode);
                    while (true) {
                        int i = iB & length;
                        Object[] objArr2 = this.d;
                        Object obj2 = objArr2[i];
                        if (obj2 == null) {
                            objArr2[i] = obj;
                            this.e += iHashCode;
                            super.a(obj);
                            return this;
                        }
                        if (obj2.equals(obj)) {
                            return this;
                        }
                        iB = i + 1;
                    }
                }
            }
            this.d = null;
            super.a(obj);
            return this;
        }

        public Builder i(Object... objArr) {
            if (this.d == null) {
                d(objArr.length, objArr);
                return this;
            }
            for (Object obj : objArr) {
                a(obj);
            }
            return this;
        }

        public Builder j(Iterable iterable) {
            iterable.getClass();
            if (this.d == null) {
                e(iterable);
                return this;
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }

        public ImmutableSet k() {
            ImmutableSet immutableSetO;
            int i = this.b;
            if (i == 0) {
                int i2 = ImmutableSet.f;
                return RegularImmutableSet.m;
            }
            if (i == 1) {
                Object obj = this.f14883a[0];
                Objects.requireNonNull(obj);
                int i3 = ImmutableSet.f;
                return new SingletonImmutableSet(obj);
            }
            if (this.d == null || ImmutableSet.n(i) != this.d.length) {
                immutableSetO = ImmutableSet.o(this.b, this.f14883a);
                this.b = immutableSetO.size();
            } else {
                int i4 = this.b;
                Object[] objArrCopyOf = this.f14883a;
                int length = objArrCopyOf.length;
                if (i4 < (length >> 1) + (length >> 2)) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                }
                immutableSetO = new RegularImmutableSet(objArrCopyOf, this.e, this.d, r6.length - 1, this.b);
            }
            this.c = true;
            this.d = null;
            return immutableSetO;
        }

        public Builder l(Builder builder) {
            if (this.d == null) {
                d(builder.b, builder.f14883a);
                return this;
            }
            for (int i = 0; i < builder.b; i++) {
                Object obj = builder.f14883a[i];
                Objects.requireNonNull(obj);
                a(obj);
            }
            return this;
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
            return ImmutableSet.s(this.d);
        }
    }

    public static Builder l() {
        return new Builder(4);
    }

    public static Builder m(int i) {
        CollectPreconditions.b(i, "expectedSize");
        Builder builder = new Builder(i);
        builder.d = new Object[n(i)];
        return builder;
    }

    public static int n(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            Preconditions.f("collection too large", iMax < 1073741824);
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (iHighestOneBit * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static ImmutableSet o(int i, Object... objArr) {
        if (i == 0) {
            return RegularImmutableSet.m;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new SingletonImmutableSet(obj);
        }
        int iN = n(i);
        Object[] objArr2 = new Object[iN];
        int i2 = iN - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                throw new NullPointerException(YU.a.d(i5, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iB = Hashing.b(iHashCode);
            while (true) {
                int i6 = iB & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iB++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new SingletonImmutableSet(obj4);
        }
        if (n(i4) < iN / 2) {
            return o(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new RegularImmutableSet(objArr, i3, objArr2, i2, i4);
    }

    public static ImmutableSet q(Collection collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
            ImmutableSet immutableSet = (ImmutableSet) collection;
            if (!immutableSet.j()) {
                return immutableSet;
            }
        }
        Object[] array = collection.toArray();
        return o(array.length, array);
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static ImmutableSet s(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? o(objArr.length, (Object[]) objArr.clone()) : new SingletonImmutableSet(objArr[0]) : RegularImmutableSet.m;
    }

    public static ImmutableSet w() {
        return RegularImmutableSet.m;
    }

    public static ImmutableSet x(Object obj, Object obj2, Object obj3) {
        return o(3, obj, obj2, obj3);
    }

    public static ImmutableSet y(String str) {
        return new SingletonImmutableSet(str);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList b() {
        ImmutableList immutableList = this.e;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList immutableListT = t();
        this.e = immutableListT;
        return immutableListT;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ImmutableSet) && u() && ((ImmutableSet) obj).u() && hashCode() != obj.hashCode()) {
            return false;
        }
        return Sets.b(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return Sets.e(this);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public ImmutableList t() {
        Object[] array = toArray(ImmutableCollection.d);
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.e;
        return ImmutableList.l(array.length, array);
    }

    public boolean u() {
        return this instanceof EmptyContiguousSet;
    }

    @Override // com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    public Object writeReplace() {
        return new SerializedForm(toArray(ImmutableCollection.d));
    }
}
