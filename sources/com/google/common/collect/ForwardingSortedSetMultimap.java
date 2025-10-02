package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.SortedSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class ForwardingSortedSetMultimap<K, V> extends ForwardingSetMultimap<K, V> implements SortedSetMultimap<K, V> {
    @Override // com.google.common.collect.ForwardingSetMultimap
    /* renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public abstract SortedSetMultimap P1();

    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final SortedSet b(Object obj) {
        return P1().b(obj);
    }

    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final SortedSet get(Object obj) {
        return P1().get(obj);
    }
}
