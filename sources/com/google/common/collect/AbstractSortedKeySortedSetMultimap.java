package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
abstract class AbstractSortedKeySortedSetMultimap<K, V> extends AbstractSortedSetMultimap<K, V> {
    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
    public final Set d() {
        return k();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public SortedMap p1() {
        return (SortedMap) super.p1();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        return (SortedSet) super.keySet();
    }
}
