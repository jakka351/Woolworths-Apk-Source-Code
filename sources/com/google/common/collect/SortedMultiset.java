package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Multiset;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public interface SortedMultiset<E> extends SortedMultisetBridge<E>, SortedIterable<E> {
    SortedMultiset G0(Object obj, BoundType boundType);

    SortedMultiset K1(Object obj, BoundType boundType, Object obj2, BoundType boundType2);

    @Override // com.google.common.collect.SortedMultisetBridge, com.google.common.collect.Multiset
    NavigableSet c();

    Comparator comparator();

    @Override // com.google.common.collect.Multiset
    Set entrySet();

    Multiset.Entry firstEntry();

    SortedMultiset g2(Object obj, BoundType boundType);

    Multiset.Entry lastEntry();

    Multiset.Entry pollFirstEntry();

    Multiset.Entry pollLastEntry();

    SortedMultiset t0();
}
