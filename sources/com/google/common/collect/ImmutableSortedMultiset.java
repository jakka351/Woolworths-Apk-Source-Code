package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.Multiset;
import com.google.common.primitives.Ints;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class ImmutableSortedMultiset<E> extends ImmutableMultiset<E> implements SortedMultiset<E> {
    public static final /* synthetic */ int i = 0;
    public transient ImmutableSortedMultiset h;

    public static class Builder<E> extends ImmutableMultiset.Builder<E> {
        public final Comparator c;
        public Object[] d;
        public int[] e;
        public int f;
        public boolean g;

        public Builder(Comparator comparator) {
            this.b = false;
            this.f14888a = null;
            comparator.getClass();
            this.c = comparator;
            this.d = new Object[4];
            this.e = new int[4];
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        public final ImmutableCollection.Builder a(Object obj) {
            f(1, obj);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder
        /* renamed from: c */
        public final ImmutableMultiset.Builder a(Object obj) {
            f(1, obj);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder
        public final /* bridge */ /* synthetic */ ImmutableMultiset.Builder d(int i, Object obj) {
            f(i, obj);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder
        public final /* bridge */ /* synthetic */ ImmutableMultiset e() {
            throw null;
        }

        public final void f(int i, Object obj) {
            obj.getClass();
            CollectPreconditions.b(i, "occurrences");
            if (i == 0) {
                return;
            }
            int i2 = this.f;
            Object[] objArr = this.d;
            if (i2 == objArr.length) {
                g(true);
            } else if (this.g) {
                this.d = Arrays.copyOf(objArr, objArr.length);
            }
            this.g = false;
            Object[] objArr2 = this.d;
            int i3 = this.f;
            objArr2[i3] = obj;
            this.e[i3] = i;
            this.f = i3 + 1;
        }

        public final void g(boolean z) {
            int i = this.f;
            if (i == 0) {
                return;
            }
            Object[] objArrCopyOf = Arrays.copyOf(this.d, i);
            Comparator comparator = this.c;
            Arrays.sort(objArrCopyOf, comparator);
            int i2 = 1;
            for (int i3 = 1; i3 < objArrCopyOf.length; i3++) {
                if (comparator.compare(objArrCopyOf[i2 - 1], objArrCopyOf[i3]) < 0) {
                    objArrCopyOf[i2] = objArrCopyOf[i3];
                    i2++;
                }
            }
            Arrays.fill(objArrCopyOf, i2, this.f, (Object) null);
            if (z) {
                int i4 = i2 * 4;
                int i5 = this.f;
                if (i4 > i5 * 3) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, Ints.e(i5 + (i5 / 2) + 1));
                }
            }
            int[] iArr = new int[objArrCopyOf.length];
            for (int i6 = 0; i6 < this.f; i6++) {
                int iBinarySearch = Arrays.binarySearch(objArrCopyOf, 0, i2, this.d[i6], comparator);
                int i7 = this.e[i6];
                if (i7 >= 0) {
                    iArr[iBinarySearch] = iArr[iBinarySearch] + i7;
                } else {
                    iArr[iBinarySearch] = ~i7;
                }
            }
            this.d = objArrCopyOf;
            this.e = iArr;
            this.f = i2;
        }
    }

    @J2ktIncompatible
    public static final class SerializedForm<E> implements Serializable {
        public final Comparator d;
        public final Object[] e;
        public final int[] f;

        public SerializedForm(ImmutableSortedMultiset immutableSortedMultiset) {
            this.d = immutableSortedMultiset.comparator();
            int size = immutableSortedMultiset.entrySet().size();
            this.e = new Object[size];
            this.f = new int[size];
            int i = 0;
            for (Multiset.Entry entry : immutableSortedMultiset.entrySet()) {
                this.e[i] = entry.a();
                this.f[i] = entry.getCount();
                i++;
            }
        }

        public Object readResolve() {
            int i;
            Object[] objArr = this.e;
            int length = objArr.length;
            Builder builder = new Builder(this.d);
            for (int i2 = 0; i2 < length; i2++) {
                builder.f(this.f[i2], objArr[i2]);
            }
            builder.g(false);
            int i3 = 0;
            int i4 = 0;
            while (true) {
                i = builder.f;
                if (i3 >= i) {
                    break;
                }
                int[] iArr = builder.e;
                int i5 = iArr[i3];
                if (i5 > 0) {
                    Object[] objArr2 = builder.d;
                    objArr2[i4] = objArr2[i3];
                    iArr[i4] = i5;
                    i4++;
                }
                i3++;
            }
            Arrays.fill(builder.d, i4, i, (Object) null);
            Arrays.fill(builder.e, i4, builder.f, 0);
            builder.f = i4;
            Comparator comparator = builder.c;
            if (i4 == 0) {
                int i6 = ImmutableSortedMultiset.i;
                return NaturalOrdering.f.equals(comparator) ? RegularImmutableSortedMultiset.o : new RegularImmutableSortedMultiset(comparator);
            }
            RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) ImmutableSortedSet.z(comparator, i4, builder.d);
            long[] jArr = new long[builder.f + 1];
            int i7 = 0;
            while (i7 < builder.f) {
                int i8 = i7 + 1;
                jArr[i8] = jArr[i7] + builder.e[i7];
                i7 = i8;
            }
            builder.g = true;
            return new RegularImmutableSortedMultiset(regularImmutableSortedSet, jArr, 0, builder.f);
        }
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.SortedMultiset
    public final SortedMultiset K1(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        Preconditions.h(c().g.compare(obj, obj2) <= 0, "Expected lowerBound <= upperBound but %s > %s", obj, obj2);
        return g2(obj, boundType).G0(obj2, boundType2);
    }

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public final Comparator comparator() {
        return c().g;
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.SortedMultiset
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedMultiset t0() {
        ImmutableSortedMultiset descendingImmutableSortedMultiset = this.h;
        if (descendingImmutableSortedMultiset == null) {
            if (isEmpty()) {
                Ordering orderingG = Ordering.b(c().g).g();
                descendingImmutableSortedMultiset = NaturalOrdering.f.equals(orderingG) ? RegularImmutableSortedMultiset.o : new RegularImmutableSortedMultiset(orderingG);
            } else {
                descendingImmutableSortedMultiset = new DescendingImmutableSortedMultiset(this);
            }
            this.h = descendingImmutableSortedMultiset;
        }
        return descendingImmutableSortedMultiset;
    }

    @Override // com.google.common.collect.ImmutableMultiset
    /* renamed from: s */
    public abstract ImmutableSortedSet c();

    @Override // com.google.common.collect.SortedMultiset
    /* renamed from: t */
    public abstract ImmutableSortedMultiset G0(Object obj, BoundType boundType);

    @Override // com.google.common.collect.SortedMultiset
    /* renamed from: u */
    public abstract ImmutableSortedMultiset g2(Object obj, BoundType boundType);

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    public Object writeReplace() {
        return new SerializedForm(this);
    }
}
