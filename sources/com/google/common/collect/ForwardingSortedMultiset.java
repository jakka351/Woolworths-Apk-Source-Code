package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Multiset;
import com.google.common.collect.SortedMultisets;
import java.util.Comparator;
import java.util.NavigableSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class ForwardingSortedMultiset<E> extends ForwardingMultiset<E> implements SortedMultiset<E> {

    public abstract class StandardDescendingMultiset extends DescendingMultiset<E> {
        @Override // com.google.common.collect.DescendingMultiset
        public final SortedMultiset k2() {
            return null;
        }
    }

    public class StandardElementSet extends SortedMultisets.NavigableElementSet<E> {
    }

    @Override // com.google.common.collect.SortedMultiset
    public final SortedMultiset G0(Object obj, BoundType boundType) {
        return P1().G0(obj, boundType);
    }

    @Override // com.google.common.collect.SortedMultiset
    public final SortedMultiset K1(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        return P1().K1(obj, boundType, obj2, boundType2);
    }

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public final Comparator comparator() {
        return P1().comparator();
    }

    @Override // com.google.common.collect.ForwardingMultiset
    /* renamed from: f2, reason: merged with bridge method [inline-methods] */
    public abstract SortedMultiset P1();

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry firstEntry() {
        return P1().firstEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final SortedMultiset g2(Object obj, BoundType boundType) {
        return P1().g2(obj, boundType);
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry lastEntry() {
        return P1().lastEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry pollFirstEntry() {
        return P1().pollFirstEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry pollLastEntry() {
        return P1().pollLastEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final SortedMultiset t0() {
        return P1().t0();
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
    public final NavigableSet c() {
        return P1().c();
    }
}
