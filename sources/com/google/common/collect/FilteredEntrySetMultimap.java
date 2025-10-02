package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Collection;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class FilteredEntrySetMultimap<K, V> extends FilteredEntryMultimap<K, V> implements FilteredSetMultimap<K, V> {
    @Override // com.google.common.collect.FilteredEntryMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final Collection b(Object obj) {
        return (Set) super.b(obj);
    }

    @Override // com.google.common.collect.FilteredEntryMultimap, com.google.common.collect.AbstractMultimap
    public final Collection c() {
        throw null;
    }

    @Override // com.google.common.collect.FilteredEntryMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final Collection get(Object obj) {
        return (Set) super.get(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final Collection l() {
        return (Set) super.l();
    }

    @Override // com.google.common.collect.FilteredEntryMultimap, com.google.common.collect.FilteredMultimap
    public final /* bridge */ /* synthetic */ Multimap x() {
        return null;
    }

    @Override // com.google.common.collect.FilteredEntryMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final Set b(Object obj) {
        return (Set) super.b(obj);
    }

    @Override // com.google.common.collect.FilteredEntryMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final Set get(Object obj) {
        return (Set) super.get(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final Set l() {
        return (Set) super.l();
    }
}
