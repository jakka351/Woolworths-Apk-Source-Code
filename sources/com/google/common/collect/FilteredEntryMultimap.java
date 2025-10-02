package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimaps;
import com.google.common.collect.Multisets;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
class FilteredEntryMultimap<K, V> extends AbstractMultimap<K, V> implements FilteredMultimap<K, V> {

    public class AsMap extends Maps.ViewCachingAbstractMap<K, Collection<V>> {

        /* renamed from: com.google.common.collect.FilteredEntryMultimap$AsMap$1KeySetImpl, reason: invalid class name */
        class C1KeySetImpl extends Maps.KeySet<Object, Collection<Object>> {
            @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                throw null;
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean removeAll(Collection collection) {
                Predicates.c(Predicates.e(collection), Maps.EntryFunction.d);
                throw null;
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean retainAll(Collection collection) {
                Predicates.c(Predicates.g(Predicates.e(collection)), Maps.EntryFunction.d);
                throw null;
            }
        }

        public AsMap() {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set a() {
            return new Maps.EntrySet<Object, Collection<Object>>() { // from class: com.google.common.collect.FilteredEntryMultimap.AsMap.1EntrySetImpl

                /* renamed from: com.google.common.collect.FilteredEntryMultimap$AsMap$1EntrySetImpl$1, reason: invalid class name */
                class AnonymousClass1 extends AbstractIterator<Map.Entry<Object, Collection<Object>>> {
                    @Override // com.google.common.collect.AbstractIterator
                    public final Object a() {
                        throw null;
                    }
                }

                @Override // com.google.common.collect.Maps.EntrySet
                public final Map h() {
                    return AsMap.this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public final Iterator iterator() {
                    throw null;
                }

                @Override // com.google.common.collect.Maps.EntrySet, com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean removeAll(Collection collection) {
                    Predicates.e(collection);
                    throw null;
                }

                @Override // com.google.common.collect.Maps.EntrySet, com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean retainAll(Collection collection) {
                    Predicates.e(collection);
                    throw null;
                }

                @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final int size() {
                    throw null;
                }
            };
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set b() {
            return new C1KeySetImpl(this);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Collection c() {
            return new Maps.Values<Object, Collection<Object>>() { // from class: com.google.common.collect.FilteredEntryMultimap.AsMap.1ValuesImpl
                @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
                public final boolean remove(Object obj) {
                    if (!(obj instanceof Collection)) {
                        return false;
                    }
                    FilteredEntryMultimap.this.getClass();
                    throw null;
                }

                @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
                public final boolean removeAll(Collection collection) {
                    Predicates.c(Predicates.e(collection), Maps.EntryFunction.e);
                    throw null;
                }

                @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
                public final boolean retainAll(Collection collection) {
                    Predicates.c(Predicates.g(Predicates.e(collection)), Maps.EntryFunction.e);
                    throw null;
                }
            };
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            FilteredEntryMultimap.this.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            throw null;
        }
    }

    public class Keys extends Multimaps.Keys<K, V> {
        public Keys() {
            super(FilteredEntryMultimap.this);
        }

        @Override // com.google.common.collect.Multimaps.Keys, com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public final int b0(int i, Object obj) {
            CollectPreconditions.b(i, "occurrences");
            if (i == 0) {
                return e2(obj);
            }
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public final Set entrySet() {
            return new Multisets.EntrySet<Object>() { // from class: com.google.common.collect.FilteredEntryMultimap.Keys.1
                @Override // com.google.common.collect.Multisets.EntrySet
                public final Multiset h() {
                    return Keys.this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public final Iterator iterator() {
                    return Keys.this.i();
                }

                @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean removeAll(Collection collection) {
                    Predicates.e(collection);
                    throw null;
                }

                @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean retainAll(Collection collection) {
                    Predicates.e(collection);
                    throw null;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final int size() {
                    return FilteredEntryMultimap.this.keySet().size();
                }
            };
        }
    }

    public final class ValuePredicate implements Predicate<V> {
        @Override // com.google.common.base.Predicate
        public final boolean apply(Object obj) {
            throw null;
        }
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Map a() {
        return new AsMap();
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Collection b(Object obj) {
        return (Collection) MoreObjects.a((Collection) p1().remove(obj), Collections.EMPTY_LIST);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Collection c() {
        throw null;
    }

    @Override // com.google.common.collect.Multimap
    public final void clear() {
        l().clear();
    }

    @Override // com.google.common.collect.Multimap
    public final boolean containsKey(Object obj) {
        return p1().get(obj) != null;
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Set d() {
        return p1().keySet();
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Multiset e() {
        return new Keys();
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Collection f() {
        return new FilteredMultimapValues(this);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Iterator g() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Collection get(Object obj) {
        throw null;
    }

    @Override // com.google.common.collect.Multimap
    public final int size() {
        return l().size();
    }

    @Override // com.google.common.collect.FilteredMultimap
    public Multimap x() {
        return null;
    }

    @Override // com.google.common.collect.FilteredMultimap
    public final Predicate z0() {
        return null;
    }
}
