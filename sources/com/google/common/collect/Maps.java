package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Converter;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterators;
import com.google.common.collect.MapDifference;
import com.google.common.collect.Sets;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class Maps {

    /* renamed from: com.google.common.collect.Maps$1, reason: invalid class name */
    class AnonymousClass1 extends TransformedIterator<Map.Entry<Object, Object>, Object> {
        @Override // com.google.common.collect.TransformedIterator
        public final Object a(Object obj) {
            return ((Map.Entry) obj).getKey();
        }
    }

    /* renamed from: com.google.common.collect.Maps$10, reason: invalid class name */
    class AnonymousClass10 implements Function<Object, Object> {
        public final /* synthetic */ EntryTransformer d;
        public final /* synthetic */ Object e;

        public AnonymousClass10(EntryTransformer entryTransformer, Object obj) {
            this.d = entryTransformer;
            this.e = obj;
        }

        @Override // com.google.common.base.Function
        public final Object apply(Object obj) {
            return ((AnonymousClass9) this.d).d.apply(obj);
        }
    }

    /* renamed from: com.google.common.collect.Maps$12, reason: invalid class name */
    class AnonymousClass12 extends AbstractMapEntry<Object, Object> {
        public final /* synthetic */ Map.Entry d;
        public final /* synthetic */ EntryTransformer e;

        public AnonymousClass12(Map.Entry entry, EntryTransformer entryTransformer) {
            this.d = entry;
            this.e = entryTransformer;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.d.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            Map.Entry entry = this.d;
            return this.e.a(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: com.google.common.collect.Maps$13, reason: invalid class name */
    class AnonymousClass13 implements Function<Map.Entry<Object, Object>, Map.Entry<Object, Object>> {
        public final /* synthetic */ EntryTransformer d;

        public AnonymousClass13(EntryTransformer entryTransformer) {
            this.d = entryTransformer;
        }

        @Override // com.google.common.base.Function
        public final Map.Entry<Object, Object> apply(Map.Entry<Object, Object> entry) {
            Map.Entry<Object, Object> entry2 = entry;
            EntryTransformer entryTransformer = this.d;
            entryTransformer.getClass();
            entry2.getClass();
            return new AnonymousClass12(entry2, entryTransformer);
        }
    }

    /* renamed from: com.google.common.collect.Maps$2, reason: invalid class name */
    class AnonymousClass2 extends TransformedIterator<Map.Entry<Object, Object>, Object> {
        @Override // com.google.common.collect.TransformedIterator
        public final Object a(Object obj) {
            return ((Map.Entry) obj).getValue();
        }
    }

    /* renamed from: com.google.common.collect.Maps$3, reason: invalid class name */
    class AnonymousClass3 extends TransformedIterator<Object, Map.Entry<Object, Object>> {
        public final /* synthetic */ Function e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Iterator it, Function function) {
            super(it);
            this.e = function;
        }

        @Override // com.google.common.collect.TransformedIterator
        public final Object a(Object obj) {
            return new ImmutableEntry(obj, this.e.apply(obj));
        }
    }

    /* renamed from: com.google.common.collect.Maps$5, reason: invalid class name */
    class AnonymousClass5 extends ForwardingSortedSet<Object> {
        public final /* synthetic */ SortedSet d;

        public AnonymousClass5(SortedSet sortedSet) {
            this.d = sortedSet;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final Object P1() {
            return this.d;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        /* renamed from: R1 */
        public final Collection P1() {
            return this.d;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet
        /* renamed from: b2 */
        public final Set P1() {
            return this.d;
        }

        @Override // com.google.common.collect.ForwardingSortedSet
        /* renamed from: f2 */
        public final SortedSet P1() {
            return this.d;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public final SortedSet headSet(Object obj) {
            return new AnonymousClass5(super.headSet(obj));
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public final SortedSet subSet(Object obj, Object obj2) {
            return new AnonymousClass5(super.subSet(obj, obj2));
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public final SortedSet tailSet(Object obj) {
            return new AnonymousClass5(super.tailSet(obj));
        }
    }

    /* renamed from: com.google.common.collect.Maps$7, reason: invalid class name */
    class AnonymousClass7 extends AbstractMapEntry<Object, Object> {
        public final /* synthetic */ Map.Entry d;

        public AnonymousClass7(Map.Entry entry) {
            this.d = entry;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.d.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return this.d.getValue();
        }
    }

    /* renamed from: com.google.common.collect.Maps$8, reason: invalid class name */
    class AnonymousClass8 extends UnmodifiableIterator<Map.Entry<Object, Object>> {
        public final /* synthetic */ Iterator d;

        public AnonymousClass8(Iterator it) {
            this.d = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry entry = (Map.Entry) this.d.next();
            entry.getClass();
            return new AnonymousClass7(entry);
        }
    }

    /* renamed from: com.google.common.collect.Maps$9, reason: invalid class name */
    class AnonymousClass9 implements EntryTransformer<Object, Object, Object> {
        public final /* synthetic */ Function d;

        public AnonymousClass9(Function function) {
            this.d = function;
        }

        @Override // com.google.common.collect.Maps.EntryTransformer
        public final Object a(Object obj, Object obj2) {
            return this.d.apply(obj2);
        }
    }

    public static abstract class AbstractFilteredMap<K, V> extends ViewCachingAbstractMap<K, V> {
        public final Map g;
        public final Predicate h;

        public AbstractFilteredMap(Map map, Predicate predicate) {
            this.g = map;
            this.h = predicate;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Collection c() {
            return new FilteredMapValues(this, this.g, this.h);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            Map map = this.g;
            return map.containsKey(obj) && d(obj, map.get(obj));
        }

        public final boolean d(Object obj, Object obj2) {
            return this.h.apply(new ImmutableEntry(obj, obj2));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            Object obj2 = this.g.get(obj);
            if (obj2 == null || !d(obj, obj2)) {
                return null;
            }
            return obj2;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean isEmpty() {
            return entrySet().isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object put(Object obj, Object obj2) {
            Preconditions.g(d(obj, obj2));
            return this.g.put(obj, obj2);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void putAll(Map map) {
            for (Map.Entry<K, V> entry : map.entrySet()) {
                Preconditions.g(d(entry.getKey(), entry.getValue()));
            }
            this.g.putAll(map);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            if (containsKey(obj)) {
                return this.g.remove(obj);
            }
            return null;
        }
    }

    public static class AsMapView<K, V> extends ViewCachingAbstractMap<K, V> {
        public final Set g;
        public final Function h;

        public AsMapView(Set set, Function function) {
            set.getClass();
            this.g = set;
            function.getClass();
            this.h = function;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set a() {
            return new EntrySet<Object, Object>() { // from class: com.google.common.collect.Maps.AsMapView.1EntrySetImpl
                @Override // com.google.common.collect.Maps.EntrySet
                public final Map h() {
                    return AsMapView.this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public final Iterator iterator() {
                    AsMapView asMapView = AsMapView.this;
                    Set setD = asMapView.d();
                    return new AnonymousClass3(setD.iterator(), asMapView.h);
                }
            };
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set b() {
            final Set setD = d();
            return new ForwardingSet<Object>() { // from class: com.google.common.collect.Maps.4
                @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
                public final Object P1() {
                    return setD;
                }

                @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
                /* renamed from: R1 */
                public final Collection P1() {
                    return setD;
                }

                @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
                public final boolean add(Object obj) {
                    throw new UnsupportedOperationException();
                }

                @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
                public final boolean addAll(Collection collection) {
                    throw new UnsupportedOperationException();
                }

                @Override // com.google.common.collect.ForwardingSet
                /* renamed from: b2 */
                public final Set P1() {
                    return setD;
                }
            };
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Collection c() {
            return new Collections2.TransformedCollection(this.g, this.h);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            d().clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            return d().contains(obj);
        }

        public Set d() {
            return this.g;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            if (Collections2.c(obj, d())) {
                return this.h.apply(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            if (d().remove(obj)) {
                return this.h.apply(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return d().size();
        }
    }

    public static final class BiMapConverter<A, B> extends Converter<A, B> implements Serializable {
        @Override // com.google.common.base.Converter
        public final Object b(Object obj) {
            throw null;
        }

        @Override // com.google.common.base.Function
        public final boolean equals(Object obj) {
            if (obj instanceof BiMapConverter) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Maps.asConverter(null)";
        }
    }

    @GwtIncompatible
    public static abstract class DescendingMap<K, V> extends ForwardingMap<K, V> implements NavigableMap<K, V> {
        public transient Ordering d;
        public transient Set e;
        public transient NavigableSet f;

        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final Object P1() {
            return b2();
        }

        @Override // com.google.common.collect.ForwardingMap
        /* renamed from: R1 */
        public final Map P1() {
            return b2();
        }

        public abstract Iterator Y1();

        public abstract NavigableMap b2();

        @Override // java.util.NavigableMap
        public final Map.Entry ceilingEntry(Object obj) {
            return b2().floorEntry(obj);
        }

        @Override // java.util.NavigableMap
        public final Object ceilingKey(Object obj) {
            return b2().floorKey(obj);
        }

        @Override // java.util.SortedMap
        public final Comparator comparator() {
            Ordering ordering = this.d;
            if (ordering != null) {
                return ordering;
            }
            Comparator<? super K> comparator = b2().comparator();
            if (comparator == null) {
                comparator = NaturalOrdering.f;
            }
            Ordering orderingG = Ordering.b(comparator).g();
            this.d = orderingG;
            return orderingG;
        }

        @Override // java.util.NavigableMap
        public final NavigableSet descendingKeySet() {
            return b2().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap descendingMap() {
            return b2();
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final Set entrySet() {
            Set set = this.e;
            if (set != null) {
                return set;
            }
            EntrySet<Object, Object> entrySet = new EntrySet<Object, Object>() { // from class: com.google.common.collect.Maps.DescendingMap.1EntrySetImpl
                @Override // com.google.common.collect.Maps.EntrySet
                public final Map h() {
                    return DescendingMap.this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public final Iterator iterator() {
                    return DescendingMap.this.Y1();
                }
            };
            this.e = entrySet;
            return entrySet;
        }

        @Override // java.util.NavigableMap
        public final Map.Entry firstEntry() {
            return b2().lastEntry();
        }

        @Override // java.util.SortedMap
        public final Object firstKey() {
            return b2().lastKey();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry floorEntry(Object obj) {
            return b2().ceilingEntry(obj);
        }

        @Override // java.util.NavigableMap
        public final Object floorKey(Object obj) {
            return b2().ceilingKey(obj);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap headMap(Object obj, boolean z) {
            return b2().tailMap(obj, z).descendingMap();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry higherEntry(Object obj) {
            return b2().lowerEntry(obj);
        }

        @Override // java.util.NavigableMap
        public final Object higherKey(Object obj) {
            return b2().lowerKey(obj);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final Set keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry lastEntry() {
            return b2().firstEntry();
        }

        @Override // java.util.SortedMap
        public final Object lastKey() {
            return b2().firstKey();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry lowerEntry(Object obj) {
            return b2().higherEntry(obj);
        }

        @Override // java.util.NavigableMap
        public final Object lowerKey(Object obj) {
            return b2().higherKey(obj);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet navigableKeySet() {
            NavigableSet navigableSet = this.f;
            if (navigableSet != null) {
                return navigableSet;
            }
            NavigableKeySet navigableKeySet = new NavigableKeySet(this);
            this.f = navigableKeySet;
            return navigableKeySet;
        }

        @Override // java.util.NavigableMap
        public final Map.Entry pollFirstEntry() {
            return b2().pollLastEntry();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry pollLastEntry() {
            return b2().pollFirstEntry();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
            return b2().subMap(obj2, z2, obj, z).descendingMap();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap tailMap(Object obj, boolean z) {
            return b2().headMap(obj, z).descendingMap();
        }

        @Override // com.google.common.collect.ForwardingObject
        public final String toString() {
            return Maps.i(this);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
        public final Collection values() {
            return new Values(this);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public final SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public final SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public final SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class EntryFunction implements Function<Map.Entry<?, ?>, Object> {
        public static final AnonymousClass1 d;
        public static final AnonymousClass2 e;
        public static final /* synthetic */ EntryFunction[] f;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.collect.Maps$EntryFunction$1] */
        /* JADX WARN: Type inference failed for: r1v0, types: [com.google.common.collect.Maps$EntryFunction$2] */
        static {
            ?? r0 = new EntryFunction() { // from class: com.google.common.collect.Maps.EntryFunction.1
                @Override // com.google.common.base.Function
                public final Object apply(Map.Entry<?, ?> entry) {
                    return entry.getKey();
                }
            };
            d = r0;
            ?? r1 = new EntryFunction() { // from class: com.google.common.collect.Maps.EntryFunction.2
                @Override // com.google.common.base.Function
                public final Object apply(Map.Entry<?, ?> entry) {
                    return entry.getValue();
                }
            };
            e = r1;
            f = new EntryFunction[]{r0, r1};
        }

        public static EntryFunction valueOf(String str) {
            return (EntryFunction) Enum.valueOf(EntryFunction.class, str);
        }

        public static EntryFunction[] values() {
            return (EntryFunction[]) f.clone();
        }
    }

    public static abstract class EntrySet<K, V> extends Sets.ImprovedAbstractSet<Map.Entry<K, V>> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            h().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object objH = Maps.h(key, h());
            if (Objects.a(objH, entry.getValue())) {
                return objH != null || h().containsKey(key);
            }
            return false;
        }

        public abstract Map h();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return h().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (contains(obj) && (obj instanceof Map.Entry)) {
                return h().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            try {
                collection.getClass();
                return Sets.g(this, collection);
            } catch (UnsupportedOperationException unused) {
                return Sets.h(this, collection.iterator());
            }
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            try {
                collection.getClass();
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet(Maps.c(collection.size()));
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        hashSet.add(((Map.Entry) obj).getKey());
                    }
                }
                return h().keySet().retainAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h().size();
        }
    }

    public interface EntryTransformer<K, V1, V2> {
        Object a(Object obj, Object obj2);
    }

    public static final class FilteredEntryBiMap<K, V> extends FilteredEntryMap<K, V> implements BiMap<K, V> {

        /* renamed from: com.google.common.collect.Maps$FilteredEntryBiMap$1, reason: invalid class name */
        class AnonymousClass1 implements Predicate<Map.Entry<Object, Object>> {
            @Override // com.google.common.base.Predicate
            public final boolean apply(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                entry.getValue();
                entry.getKey();
                throw null;
            }
        }

        @Override // com.google.common.collect.BiMap
        public final BiMap T0() {
            return null;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public final Collection values() {
            throw null;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public final Set values() {
            throw null;
        }
    }

    public static class FilteredEntryMap<K, V> extends AbstractFilteredMap<K, V> {
        public final Set i;

        public class EntrySet extends ForwardingSet<Map.Entry<K, V>> {
            public EntrySet() {
            }

            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            public final Object P1() {
                return FilteredEntryMap.this.i;
            }

            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
            /* renamed from: R1 */
            public final Collection P1() {
                return FilteredEntryMap.this.i;
            }

            @Override // com.google.common.collect.ForwardingSet
            /* renamed from: b2 */
            public final Set P1() {
                return FilteredEntryMap.this.i;
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                return new TransformedIterator<Map.Entry<Object, Object>, Map.Entry<Object, Object>>(FilteredEntryMap.this.i.iterator()) { // from class: com.google.common.collect.Maps.FilteredEntryMap.EntrySet.1
                    @Override // com.google.common.collect.TransformedIterator
                    public final Object a(Object obj) {
                        final Map.Entry entry = (Map.Entry) obj;
                        return new ForwardingMapEntry<Object, Object>(this) { // from class: com.google.common.collect.Maps.FilteredEntryMap.EntrySet.1.1
                            public final /* synthetic */ AnonymousClass1 e;

                            {
                                this.e = this;
                            }

                            @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
                            public final Object P1() {
                                return entry;
                            }

                            @Override // com.google.common.collect.ForwardingMapEntry
                            /* renamed from: R1 */
                            public final Map.Entry P1() {
                                return entry;
                            }

                            @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
                            public final Object setValue(Object obj2) {
                                Preconditions.g(FilteredEntryMap.this.d(getKey(), obj2));
                                return super.setValue(obj2);
                            }
                        };
                    }
                };
            }
        }

        public class KeySet extends KeySet<K, V> {
            public KeySet() {
                super(FilteredEntryMap.this);
            }

            @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                FilteredEntryMap filteredEntryMap = FilteredEntryMap.this;
                if (!filteredEntryMap.containsKey(obj)) {
                    return false;
                }
                filteredEntryMap.g.remove(obj);
                return true;
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean removeAll(Collection collection) {
                FilteredEntryMap filteredEntryMap = FilteredEntryMap.this;
                return FilteredEntryMap.e(filteredEntryMap.g, filteredEntryMap.h, collection);
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean retainAll(Collection collection) {
                FilteredEntryMap filteredEntryMap = FilteredEntryMap.this;
                return FilteredEntryMap.f(filteredEntryMap.g, filteredEntryMap.h, collection);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final Object[] toArray() {
                return Lists.b(iterator()).toArray();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final Object[] toArray(Object[] objArr) {
                return Lists.b(iterator()).toArray(objArr);
            }
        }

        public FilteredEntryMap(Map map, Predicate predicate) {
            super(map, predicate);
            this.i = Sets.d(map.entrySet(), this.h);
        }

        public static boolean e(Map map, Predicate predicate, Collection collection) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (predicate.apply(next) && collection.contains(next.getKey())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        public static boolean f(Map map, Predicate predicate, Collection collection) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (predicate.apply(next) && !collection.contains(next.getKey())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set a() {
            return new EntrySet();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Set b() {
            return new KeySet();
        }
    }

    @GwtIncompatible
    public static class FilteredEntryNavigableMap<K, V> extends AbstractNavigableMap<K, V> {
        public final NavigableMap d;
        public final Predicate e;
        public final Map f;

        public FilteredEntryNavigableMap(NavigableMap navigableMap, Predicate predicate) {
            navigableMap.getClass();
            this.d = navigableMap;
            this.e = predicate;
            this.f = new FilteredEntryMap(navigableMap, predicate);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public final Iterator a() {
            return Iterators.e(this.d.entrySet().iterator(), this.e);
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        public final Iterator b() {
            return Iterators.e(this.d.descendingMap().entrySet().iterator(), this.e);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public final void clear() {
            ((AbstractMap) this.f).clear();
        }

        @Override // java.util.SortedMap
        public final Comparator comparator() {
            return this.d.comparator();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            return ((AbstractFilteredMap) this.f).containsKey(obj);
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public final NavigableMap descendingMap() {
            return Maps.e(this.d.descendingMap(), this.e);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public final Set entrySet() {
            return ((ViewCachingAbstractMap) this.f).entrySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            return ((AbstractFilteredMap) this.f).get(obj);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap headMap(Object obj, boolean z) {
            return Maps.e(this.d.headMap(obj, z), this.e);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean isEmpty() {
            return !Iterables.a(this.d.entrySet(), this.e);
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public final NavigableSet navigableKeySet() {
            return new NavigableKeySet<Object, Object>(this) { // from class: com.google.common.collect.Maps.FilteredEntryNavigableMap.1
                @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean removeAll(Collection collection) {
                    FilteredEntryNavigableMap filteredEntryNavigableMap = FilteredEntryNavigableMap.this;
                    return FilteredEntryMap.e(filteredEntryNavigableMap.d, filteredEntryNavigableMap.e, collection);
                }

                @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean retainAll(Collection collection) {
                    FilteredEntryNavigableMap filteredEntryNavigableMap = FilteredEntryNavigableMap.this;
                    return FilteredEntryMap.f(filteredEntryNavigableMap.d, filteredEntryNavigableMap.e, collection);
                }
            };
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public final Map.Entry pollFirstEntry() {
            return (Map.Entry) Iterables.e(this.d.entrySet(), this.e);
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public final Map.Entry pollLastEntry() {
            return (Map.Entry) Iterables.e(this.d.descendingMap().entrySet(), this.e);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object put(Object obj, Object obj2) {
            return ((AbstractFilteredMap) this.f).put(obj, obj2);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void putAll(Map map) {
            ((AbstractFilteredMap) this.f).putAll(map);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            return ((AbstractFilteredMap) this.f).remove(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return ((AbstractMap) this.f).size();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
            return Maps.e(this.d.subMap(obj, z, obj2, z2), this.e);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap tailMap(Object obj, boolean z) {
            return Maps.e(this.d.tailMap(obj, z), this.e);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public final Collection values() {
            return new FilteredMapValues(this, this.d, this.e);
        }
    }

    public static class FilteredEntrySortedMap<K, V> extends FilteredEntryMap<K, V> implements SortedMap<K, V> {

        public class SortedKeySet extends FilteredEntryMap<K, V>.KeySet implements SortedSet<K> {
            public SortedKeySet() {
                super();
            }

            @Override // java.util.SortedSet
            public final Comparator comparator() {
                return ((SortedMap) FilteredEntrySortedMap.this.g).comparator();
            }

            @Override // java.util.SortedSet
            public final Object first() {
                return FilteredEntrySortedMap.this.firstKey();
            }

            @Override // java.util.SortedSet
            public final SortedSet headSet(Object obj) {
                return (SortedSet) ((FilteredEntrySortedMap) FilteredEntrySortedMap.this.headMap(obj)).keySet();
            }

            @Override // java.util.SortedSet
            public final Object last() {
                return FilteredEntrySortedMap.this.lastKey();
            }

            @Override // java.util.SortedSet
            public final SortedSet subSet(Object obj, Object obj2) {
                return (SortedSet) ((FilteredEntrySortedMap) FilteredEntrySortedMap.this.subMap(obj, obj2)).keySet();
            }

            @Override // java.util.SortedSet
            public final SortedSet tailSet(Object obj) {
                return (SortedSet) ((FilteredEntrySortedMap) FilteredEntrySortedMap.this.tailMap(obj)).keySet();
            }
        }

        @Override // com.google.common.collect.Maps.FilteredEntryMap, com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set b() {
            return new SortedKeySet();
        }

        @Override // java.util.SortedMap
        public final Comparator comparator() {
            return ((SortedMap) this.g).comparator();
        }

        @Override // java.util.SortedMap
        public final Object firstKey() {
            return ((SortedSet) super.keySet()).iterator().next();
        }

        @Override // java.util.SortedMap
        public final SortedMap headMap(Object obj) {
            return new FilteredEntrySortedMap(((SortedMap) this.g).headMap(obj), this.h);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            return (SortedSet) super.keySet();
        }

        @Override // java.util.SortedMap
        public final Object lastKey() {
            Map map = this.g;
            SortedMap<K, V> sortedMapHeadMap = (SortedMap) map;
            while (true) {
                K kLastKey = sortedMapHeadMap.lastKey();
                if (d(kLastKey, map.get(kLastKey))) {
                    return kLastKey;
                }
                sortedMapHeadMap = ((SortedMap) map).headMap(kLastKey);
            }
        }

        @Override // java.util.SortedMap
        public final SortedMap subMap(Object obj, Object obj2) {
            return new FilteredEntrySortedMap(((SortedMap) this.g).subMap(obj, obj2), this.h);
        }

        @Override // java.util.SortedMap
        public final SortedMap tailMap(Object obj) {
            return new FilteredEntrySortedMap(((SortedMap) this.g).tailMap(obj), this.h);
        }
    }

    public static class FilteredKeyMap<K, V> extends AbstractFilteredMap<K, V> {
        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set a() {
            return Sets.d(this.g.entrySet(), this.h);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set b() {
            return Sets.d(this.g.keySet(), null);
        }

        @Override // com.google.common.collect.Maps.AbstractFilteredMap, java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            if (this.g.containsKey(obj)) {
                throw null;
            }
            return false;
        }
    }

    public static final class FilteredMapValues<K, V> extends Values<K, V> {
        public final Map e;
        public final Predicate f;

        public FilteredMapValues(AbstractMap abstractMap, Map map, Predicate predicate) {
            super(abstractMap);
            this.e = map;
            this.f = predicate;
        }

        @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            Iterator<Map.Entry<K, V>> it = this.e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f.apply(next) && Objects.a(next.getValue(), obj)) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection collection) {
            Iterator<Map.Entry<K, V>> it = this.e.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f.apply(next) && collection.contains(next.getValue())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection collection) {
            Iterator<Map.Entry<K, V>> it = this.e.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f.apply(next) && !collection.contains(next.getValue())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final Object[] toArray() {
            return Lists.b(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            return Lists.b(iterator()).toArray(objArr);
        }
    }

    public static abstract class IteratorBasedAbstractMap<K, V> extends AbstractMap<K, V> {
        public abstract Iterator a();

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            Iterators.b(a());
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set entrySet() {
            return new EntrySet<Object, Object>() { // from class: com.google.common.collect.Maps.IteratorBasedAbstractMap.1
                @Override // com.google.common.collect.Maps.EntrySet
                public final Map h() {
                    return IteratorBasedAbstractMap.this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public final Iterator iterator() {
                    return IteratorBasedAbstractMap.this.a();
                }
            };
        }
    }

    public static class KeySet<K, V> extends Sets.ImprovedAbstractSet<K> {
        public final Map d;

        public KeySet(Map map) {
            map.getClass();
            this.d = map;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            h().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return h().containsKey(obj);
        }

        public Map h() {
            return this.d;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return h().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new AnonymousClass1(h().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            h().remove(obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return h().size();
        }
    }

    public static class MapDifferenceImpl<K, V> implements MapDifference<K, V> {
        @Override // com.google.common.collect.MapDifference
        public Map a() {
            return null;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MapDifference)) {
                return false;
            }
            ((MapDifference) obj).a();
            throw null;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{null, null, null, null});
        }

        public final String toString() {
            throw null;
        }
    }

    @GwtIncompatible
    public static final class NavigableAsMapView<K, V> extends AbstractNavigableMap<K, V> {
        public final NavigableSet d;

        public NavigableAsMapView(NavigableSet navigableSet) {
            navigableSet.getClass();
            this.d = navigableSet;
            throw null;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public final Iterator a() {
            return new AnonymousClass3(this.d.iterator(), null);
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        public final Iterator b() {
            descendingMap();
            throw null;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public final void clear() {
            this.d.clear();
        }

        @Override // java.util.SortedMap
        public final Comparator comparator() {
            return this.d.comparator();
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public final NavigableMap descendingMap() {
            new NavigableAsMapView(this.d.descendingSet());
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            if (Collections2.c(obj, this.d)) {
                throw null;
            }
            return null;
        }

        @Override // java.util.NavigableMap
        public final NavigableMap headMap(Object obj, boolean z) {
            new NavigableAsMapView(this.d.headSet(obj, z));
            throw null;
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public final NavigableSet navigableKeySet() {
            return new AnonymousClass6(this.d);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.d.size();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
            new NavigableAsMapView(this.d.subSet(obj, z, obj2, z2));
            throw null;
        }

        @Override // java.util.NavigableMap
        public final NavigableMap tailMap(Object obj, boolean z) {
            new NavigableAsMapView(this.d.tailSet(obj, z));
            throw null;
        }
    }

    public static class SortedAsMapView<K, V> extends AsMapView<K, V> implements SortedMap<K, V> {
        @Override // java.util.SortedMap
        public final Comparator comparator() {
            return ((SortedSet) this.g).comparator();
        }

        @Override // com.google.common.collect.Maps.AsMapView
        public final Set d() {
            return (SortedSet) this.g;
        }

        @Override // java.util.SortedMap
        public final Object firstKey() {
            return ((SortedSet) this.g).first();
        }

        @Override // java.util.SortedMap
        public final SortedMap headMap(Object obj) {
            return new SortedAsMapView(((SortedSet) this.g).headSet(obj), this.h);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            return new AnonymousClass5((SortedSet) this.g);
        }

        @Override // java.util.SortedMap
        public final Object lastKey() {
            return ((SortedSet) this.g).last();
        }

        @Override // java.util.SortedMap
        public final SortedMap subMap(Object obj, Object obj2) {
            return new SortedAsMapView(((SortedSet) this.g).subSet(obj, obj2), this.h);
        }

        @Override // java.util.SortedMap
        public final SortedMap tailMap(Object obj) {
            return new SortedAsMapView(((SortedSet) this.g).tailSet(obj), this.h);
        }
    }

    public static class SortedKeySet<K, V> extends KeySet<K, V> implements SortedSet<K> {
        @Override // java.util.SortedSet
        public final Comparator comparator() {
            return h().comparator();
        }

        @Override // java.util.SortedSet
        public final Object first() {
            return h().firstKey();
        }

        public SortedSet headSet(Object obj) {
            return new SortedKeySet(h().headMap(obj));
        }

        @Override // com.google.common.collect.Maps.KeySet
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public SortedMap h() {
            return (SortedMap) this.d;
        }

        @Override // java.util.SortedSet
        public final Object last() {
            return h().lastKey();
        }

        public SortedSet subSet(Object obj, Object obj2) {
            return new SortedKeySet(h().subMap(obj, obj2));
        }

        public SortedSet tailSet(Object obj) {
            return new SortedKeySet(h().tailMap(obj));
        }
    }

    public static class SortedMapDifferenceImpl<K, V> extends MapDifferenceImpl<K, V> implements SortedMapDifference<K, V> {
        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public final /* bridge */ /* synthetic */ Map a() {
            return null;
        }
    }

    public static class TransformedEntriesMap<K, V1, V2> extends IteratorBasedAbstractMap<K, V2> {
        public final Map d;
        public final EntryTransformer e;

        public TransformedEntriesMap(Map map, EntryTransformer entryTransformer) {
            map.getClass();
            this.d = map;
            entryTransformer.getClass();
            this.e = entryTransformer;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public final Iterator a() {
            Iterator it = this.d.entrySet().iterator();
            EntryTransformer entryTransformer = this.e;
            entryTransformer.getClass();
            return new Iterators.AnonymousClass6(it, new AnonymousClass13(entryTransformer));
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public final void clear() {
            this.d.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            return this.d.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            Map map = this.d;
            Object obj2 = map.get(obj);
            if (obj2 != null || map.containsKey(obj)) {
                return this.e.a(obj, obj2);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            return this.d.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            Map map = this.d;
            if (map.containsKey(obj)) {
                return this.e.a(obj, map.remove(obj));
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.d.size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Collection values() {
            return new Values(this);
        }
    }

    @GwtIncompatible
    public static class TransformedEntriesNavigableMap<K, V1, V2> extends TransformedEntriesSortedMap<K, V1, V2> implements NavigableMap<K, V2> {
        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final NavigableMap b() {
            return (NavigableMap) ((SortedMap) this.d);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry ceilingEntry(Object obj) {
            return d(b().ceilingEntry(obj));
        }

        @Override // java.util.NavigableMap
        public final Object ceilingKey(Object obj) {
            return b().ceilingKey(obj);
        }

        public final Map.Entry d(Map.Entry entry) {
            if (entry == null) {
                return null;
            }
            EntryTransformer entryTransformer = this.e;
            entryTransformer.getClass();
            return new AnonymousClass12(entry, entryTransformer);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet descendingKeySet() {
            return b().descendingKeySet();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap descendingMap() {
            return new TransformedEntriesNavigableMap(b().descendingMap(), this.e);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry firstEntry() {
            return d(b().firstEntry());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry floorEntry(Object obj) {
            return d(b().floorEntry(obj));
        }

        @Override // java.util.NavigableMap
        public final Object floorKey(Object obj) {
            return b().floorKey(obj);
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry higherEntry(Object obj) {
            return d(b().higherEntry(obj));
        }

        @Override // java.util.NavigableMap
        public final Object higherKey(Object obj) {
            return b().higherKey(obj);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry lastEntry() {
            return d(b().lastEntry());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry lowerEntry(Object obj) {
            return d(b().lowerEntry(obj));
        }

        @Override // java.util.NavigableMap
        public final Object lowerKey(Object obj) {
            return b().lowerKey(obj);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet navigableKeySet() {
            return b().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry pollFirstEntry() {
            return d(b().pollFirstEntry());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry pollLastEntry() {
            return d(b().pollLastEntry());
        }

        @Override // java.util.NavigableMap
        public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
            return new TransformedEntriesNavigableMap(b().subMap(obj, z, obj2, z2), this.e);
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap headMap(Object obj, boolean z) {
            return new TransformedEntriesNavigableMap(b().headMap(obj, z), this.e);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap tailMap(Object obj, boolean z) {
            return new TransformedEntriesNavigableMap(b().tailMap(obj, z), this.e);
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }
    }

    public static class TransformedEntriesSortedMap<K, V1, V2> extends TransformedEntriesMap<K, V1, V2> implements SortedMap<K, V2> {
        public SortedMap b() {
            return (SortedMap) this.d;
        }

        @Override // java.util.SortedMap
        public final Comparator comparator() {
            return b().comparator();
        }

        @Override // java.util.SortedMap
        public final Object firstKey() {
            return b().firstKey();
        }

        public SortedMap headMap(Object obj) {
            return new TransformedEntriesSortedMap(b().headMap(obj), this.e);
        }

        @Override // java.util.SortedMap
        public final Object lastKey() {
            return b().lastKey();
        }

        public SortedMap subMap(Object obj, Object obj2) {
            return new TransformedEntriesSortedMap(b().subMap(obj, obj2), this.e);
        }

        public SortedMap tailMap(Object obj) {
            return new TransformedEntriesSortedMap(b().tailMap(obj), this.e);
        }
    }

    public static class UnmodifiableBiMap<K, V> extends ForwardingMap<K, V> implements BiMap<K, V>, Serializable {
        public final Map d;
        public final BiMap e;
        public BiMap f;
        public transient Set g;

        public UnmodifiableBiMap(BiMap biMap, BiMap biMap2) {
            this.d = Collections.unmodifiableMap(biMap);
            this.e = biMap;
            this.f = biMap2;
        }

        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final Object P1() {
            return this.d;
        }

        @Override // com.google.common.collect.ForwardingMap
        /* renamed from: R1 */
        public final Map P1() {
            return this.d;
        }

        @Override // com.google.common.collect.BiMap
        public final BiMap T0() {
            BiMap biMap = this.f;
            if (biMap != null) {
                return biMap;
            }
            UnmodifiableBiMap unmodifiableBiMap = new UnmodifiableBiMap(this.e.T0(), this);
            this.f = unmodifiableBiMap;
            return unmodifiableBiMap;
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
        public final Set values() {
            Set set = this.g;
            if (set != null) {
                return set;
            }
            Set setUnmodifiableSet = Collections.unmodifiableSet(this.e.values());
            this.g = setUnmodifiableSet;
            return setUnmodifiableSet;
        }
    }

    public static class UnmodifiableEntries<K, V> extends ForwardingCollection<Map.Entry<K, V>> {
        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final Object P1() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingCollection
        /* renamed from: R1 */
        public final Collection P1() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final Object[] toArray(Object[] objArr) {
            return ObjectArrays.c(this, objArr);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final Object[] toArray() {
            return U1();
        }
    }

    public static class UnmodifiableEntrySet<K, V> extends UnmodifiableEntries<K, V> implements Set<Map.Entry<K, V>> {
        @Override // java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            return Sets.b(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            return Sets.e(this);
        }
    }

    @GwtIncompatible
    public static class UnmodifiableNavigableMap<K, V> extends ForwardingSortedMap<K, V> implements NavigableMap<K, V>, Serializable {
        public final NavigableMap d;
        public transient UnmodifiableNavigableMap e;

        public UnmodifiableNavigableMap(NavigableMap navigableMap) {
            this.d = navigableMap;
        }

        @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final Object P1() {
            return Collections.unmodifiableSortedMap(this.d);
        }

        @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap
        /* renamed from: R1 */
        public final Map P1() {
            return Collections.unmodifiableSortedMap(this.d);
        }

        @Override // com.google.common.collect.ForwardingSortedMap
        /* renamed from: Y1 */
        public final SortedMap P1() {
            return Collections.unmodifiableSortedMap(this.d);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry ceilingEntry(Object obj) {
            return Maps.a(this.d.ceilingEntry(obj));
        }

        @Override // java.util.NavigableMap
        public final Object ceilingKey(Object obj) {
            return this.d.ceilingKey(obj);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet descendingKeySet() {
            return Sets.j(this.d.descendingKeySet());
        }

        @Override // java.util.NavigableMap
        public final NavigableMap descendingMap() {
            UnmodifiableNavigableMap unmodifiableNavigableMap = this.e;
            if (unmodifiableNavigableMap != null) {
                return unmodifiableNavigableMap;
            }
            UnmodifiableNavigableMap unmodifiableNavigableMap2 = new UnmodifiableNavigableMap(this.d.descendingMap(), this);
            this.e = unmodifiableNavigableMap2;
            return unmodifiableNavigableMap2;
        }

        @Override // java.util.NavigableMap
        public final Map.Entry firstEntry() {
            return Maps.a(this.d.firstEntry());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry floorEntry(Object obj) {
            return Maps.a(this.d.floorEntry(obj));
        }

        @Override // java.util.NavigableMap
        public final Object floorKey(Object obj) {
            return this.d.floorKey(obj);
        }

        @Override // com.google.common.collect.ForwardingSortedMap, java.util.SortedMap
        public final SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry higherEntry(Object obj) {
            return Maps.a(this.d.higherEntry(obj));
        }

        @Override // java.util.NavigableMap
        public final Object higherKey(Object obj) {
            return this.d.higherKey(obj);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final Set keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry lastEntry() {
            return Maps.a(this.d.lastEntry());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry lowerEntry(Object obj) {
            return Maps.a(this.d.lowerEntry(obj));
        }

        @Override // java.util.NavigableMap
        public final Object lowerKey(Object obj) {
            return this.d.lowerKey(obj);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet navigableKeySet() {
            return Sets.j(this.d.navigableKeySet());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry pollFirstEntry() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry pollLastEntry() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingSortedMap, java.util.SortedMap
        public final SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.ForwardingSortedMap, java.util.SortedMap
        public final SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap headMap(Object obj, boolean z) {
            NavigableMap<K, V> navigableMapHeadMap = this.d.headMap(obj, z);
            navigableMapHeadMap.getClass();
            return navigableMapHeadMap instanceof UnmodifiableNavigableMap ? navigableMapHeadMap : new UnmodifiableNavigableMap(navigableMapHeadMap);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
            NavigableMap<K, V> navigableMapSubMap = this.d.subMap(obj, z, obj2, z2);
            navigableMapSubMap.getClass();
            return navigableMapSubMap instanceof UnmodifiableNavigableMap ? navigableMapSubMap : new UnmodifiableNavigableMap(navigableMapSubMap);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap tailMap(Object obj, boolean z) {
            NavigableMap<K, V> navigableMapTailMap = this.d.tailMap(obj, z);
            navigableMapTailMap.getClass();
            return navigableMapTailMap instanceof UnmodifiableNavigableMap ? navigableMapTailMap : new UnmodifiableNavigableMap(navigableMapTailMap);
        }

        public UnmodifiableNavigableMap(NavigableMap navigableMap, UnmodifiableNavigableMap unmodifiableNavigableMap) {
            this.d = navigableMap;
            this.e = unmodifiableNavigableMap;
        }
    }

    public static class ValueDifferenceImpl<V> implements MapDifference.ValueDifference<V> {
        public final boolean equals(Object obj) {
            return (obj instanceof MapDifference.ValueDifference) && Objects.a(null, null) && Objects.a(null, null);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{null, null});
        }

        public final String toString() {
            return "(null, null)";
        }
    }

    public static class Values<K, V> extends AbstractCollection<V> {
        public final Map d;

        public Values(Map map) {
            this.d = map;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            this.d.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return this.d.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return this.d.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new AnonymousClass2(this.d.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                Map map = this.d;
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    if (Objects.a(obj, entry.getValue())) {
                        map.remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            try {
                collection.getClass();
                return super.removeAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                Map map = this.d;
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return map.keySet().removeAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            try {
                collection.getClass();
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                Map map = this.d;
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return map.keySet().retainAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.d.size();
        }
    }

    @GwtCompatible
    public static abstract class ViewCachingAbstractMap<K, V> extends AbstractMap<K, V> {
        public transient Set d;
        public transient Set e;
        public transient Collection f;

        public abstract Set a();

        public Set b() {
            return new KeySet(this);
        }

        public Collection c() {
            return new Values(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Set entrySet() {
            Set set = this.d;
            if (set != null) {
                return set;
            }
            Set setA = a();
            this.d = setA;
            return setA;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set keySet() {
            Set set = this.e;
            if (set != null) {
                return set;
            }
            Set setB = b();
            this.e = setB;
            return setB;
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public Collection values() {
            Collection collection = this.f;
            if (collection != null) {
                return collection;
            }
            Collection collectionC = c();
            this.f = collectionC;
            return collectionC;
        }
    }

    public static Map.Entry a(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return new AnonymousClass7(entry);
    }

    public static Map b(Set set, Function function) {
        return new AsMapView(set, function);
    }

    public static int c(int i) {
        if (i < 3) {
            CollectPreconditions.b(i, "expectedSize");
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) Math.ceil(i / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static boolean d(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static NavigableMap e(NavigableMap navigableMap, Predicate predicate) {
        predicate.getClass();
        if (!(navigableMap instanceof FilteredEntryNavigableMap)) {
            navigableMap.getClass();
            return new FilteredEntryNavigableMap(navigableMap, predicate);
        }
        FilteredEntryNavigableMap filteredEntryNavigableMap = (FilteredEntryNavigableMap) navigableMap;
        return new FilteredEntryNavigableMap(filteredEntryNavigableMap.d, Predicates.b(filteredEntryNavigableMap.e, predicate));
    }

    public static ImmutableMap f(ImmutableSet immutableSet) {
        ImmutableMap.Builder builder = new ImmutableMap.Builder(immutableSet.size());
        Iterator<E> it = immutableSet.iterator();
        int i = 0;
        while (it.hasNext()) {
            builder.c(it.next(), Integer.valueOf(i));
            i++;
        }
        return builder.a(true);
    }

    public static Object g(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public static Object h(Object obj, Map map) {
        map.getClass();
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static String i(Map map) {
        int size = map.size();
        CollectPreconditions.b(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, llqqqql.a0061aaaaa));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public static Map j(Map map, com.google.common.net.a aVar) {
        aVar.getClass();
        return new TransformedEntriesMap(map, new AnonymousClass9(aVar));
    }

    /* renamed from: com.google.common.collect.Maps$6, reason: invalid class name */
    class AnonymousClass6 extends ForwardingNavigableSet<Object> {
        public final /* synthetic */ NavigableSet d;

        public AnonymousClass6(NavigableSet navigableSet) {
            this.d = navigableSet;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final Object P1() {
            return this.d;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        /* renamed from: R1 */
        public final Collection P1() {
            return this.d;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet
        /* renamed from: b2 */
        public final Set P1() {
            return this.d;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final NavigableSet descendingSet() {
            return new AnonymousClass6(super.descendingSet());
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet
        /* renamed from: f2 */
        public final SortedSet P1() {
            return this.d;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public final SortedSet headSet(Object obj) {
            return new AnonymousClass5(super.headSet(obj));
        }

        @Override // com.google.common.collect.ForwardingNavigableSet
        /* renamed from: k2 */
        public final NavigableSet P1() {
            return this.d;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public final SortedSet subSet(Object obj, Object obj2) {
            return new AnonymousClass5(super.subSet(obj, obj2));
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public final SortedSet tailSet(Object obj) {
            return new AnonymousClass5(super.tailSet(obj));
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final NavigableSet headSet(Object obj, boolean z) {
            return new AnonymousClass6(super.headSet(obj, z));
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
            return new AnonymousClass6(super.subSet(obj, z, obj2, z2));
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final NavigableSet tailSet(Object obj, boolean z) {
            return new AnonymousClass6(super.tailSet(obj, z));
        }
    }

    @GwtIncompatible
    public static class NavigableKeySet<K, V> extends SortedKeySet<K, V> implements NavigableSet<K> {
        @Override // java.util.NavigableSet
        public final Object ceiling(Object obj) {
            return ((NavigableMap) this.d).ceilingKey(obj);
        }

        @Override // java.util.NavigableSet
        public final Iterator descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet descendingSet() {
            return ((NavigableMap) this.d).descendingKeySet();
        }

        @Override // java.util.NavigableSet
        public final Object floor(Object obj) {
            return ((NavigableMap) this.d).floorKey(obj);
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, com.google.common.collect.Maps.KeySet
        public final Map h() {
            return (NavigableMap) this.d;
        }

        @Override // java.util.NavigableSet
        public final NavigableSet headSet(Object obj, boolean z) {
            return ((NavigableMap) this.d).headMap(obj, z).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        public final Object higher(Object obj) {
            return ((NavigableMap) this.d).higherKey(obj);
        }

        @Override // com.google.common.collect.Maps.SortedKeySet
        /* renamed from: i */
        public final SortedMap h() {
            return (NavigableMap) this.d;
        }

        @Override // java.util.NavigableSet
        public final Object lower(Object obj) {
            return ((NavigableMap) this.d).lowerKey(obj);
        }

        @Override // java.util.NavigableSet
        public final Object pollFirst() {
            return Maps.g(((NavigableMap) this.d).pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        public final Object pollLast() {
            return Maps.g(((NavigableMap) this.d).pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
            return ((NavigableMap) this.d).subMap(obj, z, obj2, z2).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet tailSet(Object obj, boolean z) {
            return ((NavigableMap) this.d).tailMap(obj, z).navigableKeySet();
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet tailSet(Object obj) {
            return tailSet(obj, true);
        }
    }
}
