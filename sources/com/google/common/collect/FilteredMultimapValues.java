package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Maps;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class FilteredMultimapValues<K, V> extends AbstractCollection<V> {
    public final AbstractMultimap d;

    /* JADX WARN: Multi-variable type inference failed */
    public FilteredMultimapValues(FilteredMultimap filteredMultimap) {
        this.d = (AbstractMultimap) filteredMultimap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new Maps.AnonymousClass2(this.d.l().iterator());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.collect.AbstractMultimap, com.google.common.collect.FilteredMultimap] */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        ?? r0 = this.d;
        Predicate predicateZ0 = r0.z0();
        Iterator it = r0.x().l().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (predicateZ0.apply(entry) && Objects.a(entry.getValue(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.collect.AbstractMultimap, com.google.common.collect.FilteredMultimap] */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        ?? r0 = this.d;
        return Iterables.f(r0.x().l(), Predicates.b(r0.z0(), Predicates.c(Predicates.e(collection), Maps.EntryFunction.e)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.collect.AbstractMultimap, com.google.common.collect.FilteredMultimap] */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        ?? r0 = this.d;
        return Iterables.f(r0.x().l(), Predicates.b(r0.z0(), Predicates.c(Predicates.g(Predicates.e(collection)), Maps.EntryFunction.e)));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.d.size();
    }
}
