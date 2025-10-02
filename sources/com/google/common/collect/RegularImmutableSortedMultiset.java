package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.primitives.Ints;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class RegularImmutableSortedMultiset<E> extends ImmutableSortedMultiset<E> {
    public static final long[] n = {0};
    public static final ImmutableSortedMultiset o = new RegularImmutableSortedMultiset(NaturalOrdering.f);
    public final transient RegularImmutableSortedSet j;
    public final transient long[] k;
    public final transient int l;
    public final transient int m;

    public RegularImmutableSortedMultiset(RegularImmutableSortedSet regularImmutableSortedSet, long[] jArr, int i, int i2) {
        this.j = regularImmutableSortedSet;
        this.k = jArr;
        this.l = i;
        this.m = i2;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public final NavigableSet c() {
        return this.j;
    }

    @Override // com.google.common.collect.Multiset
    public final int e2(Object obj) {
        RegularImmutableSortedSet regularImmutableSortedSet = this.j;
        regularImmutableSortedSet.getClass();
        int i = -1;
        if (obj != null) {
            try {
                int iBinarySearch = Collections.binarySearch(regularImmutableSortedSet.i, obj, regularImmutableSortedSet.g);
                if (iBinarySearch >= 0) {
                    i = iBinarySearch;
                }
            } catch (ClassCastException unused) {
            }
        }
        if (i < 0) {
            return 0;
        }
        int i2 = this.l + i;
        long[] jArr = this.k;
        return (int) (jArr[i2 + 1] - jArr[i2]);
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return o(0);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean j() {
        if (this.l <= 0) {
            if (this.m >= this.k.length - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return o(this.m - 1);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset
    /* renamed from: m */
    public final ImmutableSet c() {
        return this.j;
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public final Multiset.Entry o(int i) {
        E e = this.j.i.get(i);
        int i2 = this.l + i;
        long[] jArr = this.k;
        return new Multisets.ImmutableEntry(e, (int) (jArr[i2 + 1] - jArr[i2]));
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset
    /* renamed from: s */
    public final ImmutableSortedSet c() {
        return this.j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = this.m;
        int i2 = this.l;
        long[] jArr = this.k;
        return Ints.e(jArr[i + i2] - jArr[i2]);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    /* renamed from: t */
    public final ImmutableSortedMultiset G0(Object obj, BoundType boundType) {
        return w(0, this.j.Q(obj, boundType == BoundType.e));
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    /* renamed from: u */
    public final ImmutableSortedMultiset g2(Object obj, BoundType boundType) {
        return w(this.j.S(obj, boundType == BoundType.e), this.m);
    }

    public final ImmutableSortedMultiset w(int i, int i2) {
        int i3 = this.m;
        Preconditions.m(i, i2, i3);
        RegularImmutableSortedSet regularImmutableSortedSet = this.j;
        if (i == i2) {
            Comparator comparator = regularImmutableSortedSet.g;
            return NaturalOrdering.f.equals(comparator) ? o : new RegularImmutableSortedMultiset(comparator);
        }
        if (i == 0 && i2 == i3) {
            return this;
        }
        return new RegularImmutableSortedMultiset(regularImmutableSortedSet.P(i, i2), this.k, this.l + i, i2 - i);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public final Set c() {
        return this.j;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public final SortedSet c() {
        return this.j;
    }

    public RegularImmutableSortedMultiset(Comparator comparator) {
        this.j = ImmutableSortedSet.E(comparator);
        this.k = n;
        this.l = 0;
        this.m = 0;
    }
}
