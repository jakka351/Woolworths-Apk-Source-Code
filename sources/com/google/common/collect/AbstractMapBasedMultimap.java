package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractMultimap;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimaps;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
abstract class AbstractMapBasedMultimap<K, V> extends AbstractMultimap<K, V> implements Serializable {
    public transient Map i;
    public transient int j;

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$1, reason: invalid class name */
    class AnonymousClass1 extends AbstractMapBasedMultimap<Object, Object>.Itr<Object> {
        @Override // com.google.common.collect.AbstractMapBasedMultimap.Itr
        public final Object a(Object obj, Object obj2) {
            return obj2;
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$2, reason: invalid class name */
    class AnonymousClass2 extends AbstractMapBasedMultimap<Object, Object>.Itr<Map.Entry<Object, Object>> {
        @Override // com.google.common.collect.AbstractMapBasedMultimap.Itr
        public final Object a(Object obj, Object obj2) {
            return new ImmutableEntry(obj, obj2);
        }
    }

    public class AsMap extends Maps.ViewCachingAbstractMap<K, Collection<V>> {
        public final transient Map g;

        public class AsMapEntries extends Maps.EntrySet<K, Collection<V>> {
            public AsMapEntries() {
            }

            @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                return Collections2.c(obj, AsMap.this.g.entrySet());
            }

            @Override // com.google.common.collect.Maps.EntrySet
            public final Map h() {
                return AsMap.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                return AsMap.this.new AsMapIterator();
            }

            @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                Object objRemove;
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
                Object key = entry.getKey();
                Map map = abstractMapBasedMultimap.i;
                map.getClass();
                try {
                    objRemove = map.remove(key);
                } catch (ClassCastException | NullPointerException unused) {
                    objRemove = null;
                }
                Collection collection = (Collection) objRemove;
                if (collection == null) {
                    return true;
                }
                int size = collection.size();
                collection.clear();
                abstractMapBasedMultimap.j -= size;
                return true;
            }
        }

        public class AsMapIterator implements Iterator<Map.Entry<K, Collection<V>>> {
            public final Iterator d;
            public Collection e;

            public AsMapIterator() {
                this.d = AsMap.this.g.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.d.hasNext();
            }

            @Override // java.util.Iterator
            public final Object next() {
                Map.Entry entry = (Map.Entry) this.d.next();
                this.e = (Collection) entry.getValue();
                return AsMap.this.d(entry);
            }

            @Override // java.util.Iterator
            public final void remove() {
                Preconditions.q("no calls to next() since the last call to remove()", this.e != null);
                this.d.remove();
                AbstractMapBasedMultimap.this.j -= this.e.size();
                this.e.clear();
                this.e = null;
            }
        }

        public AsMap(Map map) {
            this.g = map;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set a() {
            return new AsMapEntries();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            if (this.g == abstractMapBasedMultimap.i) {
                abstractMapBasedMultimap.clear();
            } else {
                Iterators.b(new AsMapIterator());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            Map map = this.g;
            map.getClass();
            try {
                return map.containsKey(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        public final Map.Entry d(Map.Entry entry) {
            Object key = entry.getKey();
            return new ImmutableEntry(key, AbstractMapBasedMultimap.this.q(key, (Collection) entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean equals(Object obj) {
            return this == obj || this.g.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            Collection collection = (Collection) Maps.h(obj, this.g);
            if (collection == null) {
                return null;
            }
            return AbstractMapBasedMultimap.this.q(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int hashCode() {
            return this.g.hashCode();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public Set keySet() {
            return AbstractMapBasedMultimap.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            Collection collection = (Collection) this.g.remove(obj);
            if (collection == null) {
                return null;
            }
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            Collection collectionH = abstractMapBasedMultimap.h();
            collectionH.addAll(collection);
            abstractMapBasedMultimap.j -= collection.size();
            collection.clear();
            return collectionH;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.g.size();
        }

        @Override // java.util.AbstractMap
        public final String toString() {
            return this.g.toString();
        }
    }

    public abstract class Itr<T> implements Iterator<T> {
        public final Iterator d;
        public Object e = null;
        public Collection f = null;
        public Iterator g = Iterators.EmptyModifiableIterator.d;

        public Itr() {
            this.d = AbstractMapBasedMultimap.this.i.entrySet().iterator();
        }

        public abstract Object a(Object obj, Object obj2);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d.hasNext() || this.g.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!this.g.hasNext()) {
                Map.Entry entry = (Map.Entry) this.d.next();
                this.e = entry.getKey();
                Collection collection = (Collection) entry.getValue();
                this.f = collection;
                this.g = collection.iterator();
            }
            return a(this.e, this.g.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.g.remove();
            Collection collection = this.f;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.d.remove();
            }
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            abstractMapBasedMultimap.j--;
        }
    }

    public class KeySet extends Maps.KeySet<K, Collection<V>> {
        public KeySet(Map map) {
            super(map);
        }

        @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            Iterators.b(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean containsAll(Collection collection) {
            return this.d.keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            return this == obj || this.d.keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final int hashCode() {
            return this.d.keySet().hashCode();
        }

        @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            final Iterator<Map.Entry<K, V>> it = this.d.entrySet().iterator();
            return new Iterator<Object>(this) { // from class: com.google.common.collect.AbstractMapBasedMultimap.KeySet.1
                public Map.Entry d;
                public final /* synthetic */ KeySet f;

                {
                    this.f = this;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                public final Object next() {
                    Map.Entry entry = (Map.Entry) it.next();
                    this.d = entry;
                    return entry.getKey();
                }

                @Override // java.util.Iterator
                public final void remove() {
                    Preconditions.q("no calls to next() since the last call to remove()", this.d != null);
                    Collection collection = (Collection) this.d.getValue();
                    it.remove();
                    AbstractMapBasedMultimap.this.j -= collection.size();
                    collection.clear();
                    this.d = null;
                }
            };
        }

        @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            int size;
            Collection collection = (Collection) this.d.remove(obj);
            if (collection != null) {
                size = collection.size();
                collection.clear();
                AbstractMapBasedMultimap.this.j -= size;
            } else {
                size = 0;
            }
            return size > 0;
        }
    }

    public final class NavigableAsMap extends AbstractMapBasedMultimap<K, V>.SortedAsMap implements NavigableMap<K, Collection<V>> {
        public NavigableAsMap(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set b() {
            return new NavigableKeySet(g());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry ceilingEntry(Object obj) {
            Map.Entry<K, V> entryCeilingEntry = g().ceilingEntry(obj);
            if (entryCeilingEntry == null) {
                return null;
            }
            return d(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        public final Object ceilingKey(Object obj) {
            return g().ceilingKey(obj);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet descendingKeySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap descendingMap() {
            return new NavigableAsMap(g().descendingMap());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap
        /* renamed from: e */
        public final SortedSet b() {
            return new NavigableKeySet(g());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap
        /* renamed from: f */
        public final SortedSet keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry firstEntry() {
            Map.Entry<K, V> entryFirstEntry = g().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return d(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry floorEntry(Object obj) {
            Map.Entry<K, V> entryFloorEntry = g().floorEntry(obj);
            if (entryFloorEntry == null) {
                return null;
            }
            return d(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        public final Object floorKey(Object obj) {
            return g().floorKey(obj);
        }

        public final Map.Entry h(Iterator it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) it.next();
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            Collection collectionH = abstractMapBasedMultimap.h();
            collectionH.addAll((Collection) entry.getValue());
            it.remove();
            return new ImmutableEntry(entry.getKey(), abstractMapBasedMultimap.o(collectionH));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry higherEntry(Object obj) {
            Map.Entry<K, V> entryHigherEntry = g().higherEntry(obj);
            if (entryHigherEntry == null) {
                return null;
            }
            return d(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        public final Object higherKey(Object obj) {
            return g().higherKey(obj);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final NavigableMap g() {
            return (NavigableMap) ((SortedMap) this.g);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, com.google.common.collect.AbstractMapBasedMultimap.AsMap, com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry lastEntry() {
            Map.Entry<K, V> entryLastEntry = g().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return d(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry lowerEntry(Object obj) {
            Map.Entry<K, V> entryLowerEntry = g().lowerEntry(obj);
            if (entryLowerEntry == null) {
                return null;
            }
            return d(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        public final Object lowerKey(Object obj) {
            return g().lowerKey(obj);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet navigableKeySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry pollFirstEntry() {
            return h(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry pollLastEntry() {
            return h(((Maps.ViewCachingAbstractMap) descendingMap()).entrySet().iterator());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap headMap(Object obj, boolean z) {
            return new NavigableAsMap(g().headMap(obj, z));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
            return new NavigableAsMap(g().subMap(obj, z, obj2, z2));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap tailMap(Object obj, boolean z) {
            return new NavigableAsMap(g().tailMap(obj, z));
        }
    }

    public final class NavigableKeySet extends AbstractMapBasedMultimap<K, V>.SortedKeySet implements NavigableSet<K> {
        public NavigableKeySet(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public final Object ceiling(Object obj) {
            return i().ceilingKey(obj);
        }

        @Override // java.util.NavigableSet
        public final Iterator descendingIterator() {
            return ((KeySet) descendingSet()).iterator();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet descendingSet() {
            return new NavigableKeySet(i().descendingMap());
        }

        @Override // java.util.NavigableSet
        public final Object floor(Object obj) {
            return i().floorKey(obj);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // java.util.NavigableSet
        public final Object higher(Object obj) {
            return i().higherKey(obj);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public final NavigableMap i() {
            return (NavigableMap) ((SortedMap) this.d);
        }

        @Override // java.util.NavigableSet
        public final Object lower(Object obj) {
            return i().lowerKey(obj);
        }

        @Override // java.util.NavigableSet
        public final Object pollFirst() {
            return Iterators.j(iterator());
        }

        @Override // java.util.NavigableSet
        public final Object pollLast() {
            return Iterators.j(descendingIterator());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet headSet(Object obj, boolean z) {
            return new NavigableKeySet(i().headMap(obj, z));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
            return new NavigableKeySet(i().subMap(obj, z, obj2, z2));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet tailSet(Object obj, boolean z) {
            return new NavigableKeySet(i().tailMap(obj, z));
        }
    }

    public class RandomAccessWrappedList extends AbstractMapBasedMultimap<K, V>.WrappedList implements RandomAccess {
    }

    public class SortedAsMap extends AbstractMapBasedMultimap<K, V>.AsMap implements SortedMap<K, Collection<V>> {
        public SortedSet i;

        public SortedAsMap(SortedMap sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public final Comparator comparator() {
            return g().comparator();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public SortedSet b() {
            return new SortedKeySet(g());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.AsMap, com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public SortedSet keySet() {
            SortedSet sortedSet = this.i;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet sortedSetB = b();
            this.i = sortedSetB;
            return sortedSetB;
        }

        @Override // java.util.SortedMap
        public final Object firstKey() {
            return g().firstKey();
        }

        public SortedMap g() {
            return (SortedMap) this.g;
        }

        public SortedMap headMap(Object obj) {
            return new SortedAsMap(g().headMap(obj));
        }

        @Override // java.util.SortedMap
        public final Object lastKey() {
            return g().lastKey();
        }

        public SortedMap subMap(Object obj, Object obj2) {
            return new SortedAsMap(g().subMap(obj, obj2));
        }

        public SortedMap tailMap(Object obj) {
            return new SortedAsMap(g().tailMap(obj));
        }
    }

    public class SortedKeySet extends AbstractMapBasedMultimap<K, V>.KeySet implements SortedSet<K> {
        public SortedKeySet(SortedMap sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        public final Comparator comparator() {
            return i().comparator();
        }

        @Override // java.util.SortedSet
        public final Object first() {
            return i().firstKey();
        }

        public SortedSet headSet(Object obj) {
            return new SortedKeySet(i().headMap(obj));
        }

        public SortedMap i() {
            return (SortedMap) this.d;
        }

        @Override // java.util.SortedSet
        public final Object last() {
            return i().lastKey();
        }

        public SortedSet subSet(Object obj, Object obj2) {
            return new SortedKeySet(i().subMap(obj, obj2));
        }

        public SortedSet tailSet(Object obj) {
            return new SortedKeySet(i().tailMap(obj));
        }
    }

    public class WrappedNavigableSet extends AbstractMapBasedMultimap<K, V>.WrappedSortedSet implements NavigableSet<V> {
        public WrappedNavigableSet(Object obj, NavigableSet navigableSet, WrappedCollection wrappedCollection) {
            super(obj, navigableSet, wrappedCollection);
        }

        @Override // java.util.NavigableSet
        public final Object ceiling(Object obj) {
            return h().ceiling(obj);
        }

        @Override // java.util.NavigableSet
        public final Iterator descendingIterator() {
            return new WrappedCollection.WrappedIterator(h().descendingIterator());
        }

        @Override // java.util.NavigableSet
        public final NavigableSet descendingSet() {
            return j(h().descendingSet());
        }

        @Override // java.util.NavigableSet
        public final Object floor(Object obj) {
            return h().floor(obj);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet headSet(Object obj, boolean z) {
            return j(h().headSet(obj, z));
        }

        @Override // java.util.NavigableSet
        public final Object higher(Object obj) {
            return h().higher(obj);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.WrappedSortedSet
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final NavigableSet h() {
            return (NavigableSet) ((SortedSet) this.e);
        }

        public final NavigableSet j(NavigableSet navigableSet) {
            WrappedCollection wrappedCollection = this.f;
            if (wrappedCollection == null) {
                wrappedCollection = this;
            }
            return new WrappedNavigableSet(this.d, navigableSet, wrappedCollection);
        }

        @Override // java.util.NavigableSet
        public final Object lower(Object obj) {
            return h().lower(obj);
        }

        @Override // java.util.NavigableSet
        public final Object pollFirst() {
            return Iterators.j(iterator());
        }

        @Override // java.util.NavigableSet
        public final Object pollLast() {
            return Iterators.j(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
            return j(h().subSet(obj, z, obj2, z2));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet tailSet(Object obj, boolean z) {
            return j(h().tailSet(obj, z));
        }
    }

    public class WrappedSet extends AbstractMapBasedMultimap<K, V>.WrappedCollection implements Set<V> {
        public WrappedSet(Object obj, Set set) {
            super(obj, set, null);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.WrappedCollection, java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zG = Sets.g((Set) this.e, collection);
            if (zG) {
                AbstractMapBasedMultimap.this.j += this.e.size() - size;
                g();
            }
            return zG;
        }
    }

    public class WrappedSortedSet extends AbstractMapBasedMultimap<K, V>.WrappedCollection implements SortedSet<V> {
        public WrappedSortedSet(Object obj, SortedSet sortedSet, WrappedCollection wrappedCollection) {
            super(obj, sortedSet, wrappedCollection);
        }

        @Override // java.util.SortedSet
        public final Comparator comparator() {
            return h().comparator();
        }

        @Override // java.util.SortedSet
        public final Object first() {
            d();
            return h().first();
        }

        public SortedSet h() {
            return (SortedSet) this.e;
        }

        @Override // java.util.SortedSet
        public final SortedSet headSet(Object obj) {
            d();
            SortedSet sortedSetHeadSet = h().headSet(obj);
            WrappedCollection wrappedCollection = this.f;
            if (wrappedCollection == null) {
                wrappedCollection = this;
            }
            return new WrappedSortedSet(this.d, sortedSetHeadSet, wrappedCollection);
        }

        @Override // java.util.SortedSet
        public final Object last() {
            d();
            return h().last();
        }

        @Override // java.util.SortedSet
        public final SortedSet subSet(Object obj, Object obj2) {
            d();
            SortedSet sortedSetSubSet = h().subSet(obj, obj2);
            WrappedCollection wrappedCollection = this.f;
            if (wrappedCollection == null) {
                wrappedCollection = this;
            }
            return new WrappedSortedSet(this.d, sortedSetSubSet, wrappedCollection);
        }

        @Override // java.util.SortedSet
        public final SortedSet tailSet(Object obj) {
            d();
            SortedSet sortedSetTailSet = h().tailSet(obj);
            WrappedCollection wrappedCollection = this.f;
            if (wrappedCollection == null) {
                wrappedCollection = this;
            }
            return new WrappedSortedSet(this.d, sortedSetTailSet, wrappedCollection);
        }
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Map a() {
        return new AsMap(this.i);
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Collection b(Object obj) {
        Collection collection = (Collection) this.i.remove(obj);
        if (collection == null) {
            return m();
        }
        Collection collectionH = h();
        collectionH.addAll(collection);
        this.j -= collection.size();
        collection.clear();
        return o(collectionH);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Collection c() {
        return this instanceof SetMultimap ? new AbstractMultimap.EntrySet() : new AbstractMultimap.Entries();
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
        Iterator<V> it = this.i.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.i.clear();
        this.j = 0;
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(Object obj) {
        return this.i.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Set d() {
        return new KeySet(this.i);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Multiset e() {
        return new Multimaps.Keys(this);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Collection f() {
        return new AbstractMultimap.Values(this);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Iterator g() {
        return new AnonymousClass2();
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Collection get(Object obj) {
        Collection collectionI = (Collection) this.i.get(obj);
        if (collectionI == null) {
            collectionI = i(obj);
        }
        return q(obj, collectionI);
    }

    public abstract Collection h();

    public Collection i(Object obj) {
        return h();
    }

    public final Map j() {
        Map map = this.i;
        return map instanceof NavigableMap ? new NavigableAsMap((NavigableMap) this.i) : map instanceof SortedMap ? new SortedAsMap((SortedMap) this.i) : new AsMap(this.i);
    }

    public final Set k() {
        Map map = this.i;
        return map instanceof NavigableMap ? new NavigableKeySet((NavigableMap) this.i) : map instanceof SortedMap ? new SortedKeySet((SortedMap) this.i) : new KeySet(this.i);
    }

    public Collection m() {
        return o(h());
    }

    public final void n(Map map) {
        this.i = map;
        this.j = 0;
        for (V v : map.values()) {
            Preconditions.g(!v.isEmpty());
            this.j = v.size() + this.j;
        }
    }

    public Collection o(Collection collection) {
        return Collections.unmodifiableCollection(collection);
    }

    public Iterator p() {
        return new AnonymousClass1();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public boolean put(Object obj, Object obj2) {
        Collection collection = (Collection) this.i.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.j++;
            return true;
        }
        Collection collectionI = i(obj);
        if (!collectionI.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.j++;
        this.i.put(obj, collectionI);
        return true;
    }

    public Collection q(Object obj, Collection collection) {
        return new WrappedCollection(obj, collection, null);
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        return this.j;
    }

    public class WrappedList extends AbstractMapBasedMultimap<K, V>.WrappedCollection implements List<V> {

        public class WrappedListIterator extends AbstractMapBasedMultimap<K, V>.WrappedCollection.WrappedIterator implements ListIterator<V> {
            public WrappedListIterator() {
                super();
            }

            @Override // java.util.ListIterator
            public final void add(Object obj) {
                WrappedList wrappedList = WrappedList.this;
                boolean zIsEmpty = wrappedList.isEmpty();
                b().add(obj);
                AbstractMapBasedMultimap.this.j++;
                if (zIsEmpty) {
                    wrappedList.b();
                }
            }

            public final ListIterator b() {
                a();
                return (ListIterator) this.d;
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return b().hasPrevious();
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return b().nextIndex();
            }

            @Override // java.util.ListIterator
            public final Object previous() {
                return b().previous();
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return b().previousIndex();
            }

            @Override // java.util.ListIterator
            public final void set(Object obj) {
                b().set(obj);
            }

            public WrappedListIterator(int i) {
                super(((List) WrappedList.this.e).listIterator(i));
            }
        }

        public WrappedList(Object obj, List list, WrappedCollection wrappedCollection) {
            super(obj, list, wrappedCollection);
        }

        @Override // java.util.List
        public final void add(int i, Object obj) {
            d();
            boolean zIsEmpty = this.e.isEmpty();
            ((List) this.e).add(i, obj);
            AbstractMapBasedMultimap.this.j++;
            if (zIsEmpty) {
                b();
            }
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = ((List) this.e).addAll(i, collection);
            if (zAddAll) {
                AbstractMapBasedMultimap.this.j += this.e.size() - size;
                if (size == 0) {
                    b();
                }
            }
            return zAddAll;
        }

        @Override // java.util.List
        public final Object get(int i) {
            d();
            return ((List) this.e).get(i);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            d();
            return ((List) this.e).indexOf(obj);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            d();
            return ((List) this.e).lastIndexOf(obj);
        }

        @Override // java.util.List
        public final ListIterator listIterator() {
            d();
            return new WrappedListIterator();
        }

        @Override // java.util.List
        public final Object remove(int i) {
            d();
            Object objRemove = ((List) this.e).remove(i);
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            abstractMapBasedMultimap.j--;
            g();
            return objRemove;
        }

        @Override // java.util.List
        public final Object set(int i, Object obj) {
            d();
            return ((List) this.e).set(i, obj);
        }

        @Override // java.util.List
        public final List subList(int i, int i2) {
            d();
            List listSubList = ((List) this.e).subList(i, i2);
            WrappedCollection wrappedCollection = this.f;
            if (wrappedCollection == null) {
                wrappedCollection = this;
            }
            boolean z = listSubList instanceof RandomAccess;
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            Object obj = this.d;
            return z ? new RandomAccessWrappedList(obj, listSubList, wrappedCollection) : new WrappedList(obj, listSubList, wrappedCollection);
        }

        @Override // java.util.List
        public final ListIterator listIterator(int i) {
            d();
            return new WrappedListIterator(i);
        }
    }

    public class WrappedCollection extends AbstractCollection<V> {
        public final Object d;
        public Collection e;
        public final WrappedCollection f;
        public final Collection g;

        public WrappedCollection(Object obj, Collection collection, WrappedCollection wrappedCollection) {
            this.d = obj;
            this.e = collection;
            this.f = wrappedCollection;
            this.g = wrappedCollection == null ? null : wrappedCollection.e;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean add(Object obj) {
            d();
            boolean zIsEmpty = this.e.isEmpty();
            boolean zAdd = this.e.add(obj);
            if (zAdd) {
                AbstractMapBasedMultimap.this.j++;
                if (zIsEmpty) {
                    b();
                }
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean addAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.e.addAll(collection);
            if (zAddAll) {
                AbstractMapBasedMultimap.this.j += this.e.size() - size;
                if (size == 0) {
                    b();
                }
            }
            return zAddAll;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void b() {
            WrappedCollection wrappedCollection = this.f;
            if (wrappedCollection != null) {
                wrappedCollection.b();
            } else {
                AbstractMapBasedMultimap.this.i.put(this.d, this.e);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.e.clear();
            AbstractMapBasedMultimap.this.j -= size;
            g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            d();
            return this.e.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean containsAll(Collection collection) {
            d();
            return this.e.containsAll(collection);
        }

        public final void d() {
            Collection collection;
            WrappedCollection wrappedCollection = this.f;
            if (wrappedCollection != null) {
                wrappedCollection.d();
                if (wrappedCollection.e != this.g) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.e.isEmpty() || (collection = (Collection) AbstractMapBasedMultimap.this.i.get(this.d)) == null) {
                    return;
                }
                this.e = collection;
            }
        }

        @Override // java.util.Collection
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            d();
            return this.e.equals(obj);
        }

        public final void g() {
            WrappedCollection wrappedCollection = this.f;
            if (wrappedCollection != null) {
                wrappedCollection.g();
            } else if (this.e.isEmpty()) {
                AbstractMapBasedMultimap.this.i.remove(this.d);
            }
        }

        @Override // java.util.Collection
        public final int hashCode() {
            d();
            return this.e.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            d();
            return new WrappedIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            d();
            boolean zRemove = this.e.remove(obj);
            if (zRemove) {
                AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
                abstractMapBasedMultimap.j--;
                g();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.e.removeAll(collection);
            if (zRemoveAll) {
                AbstractMapBasedMultimap.this.j += this.e.size() - size;
                g();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection collection) {
            collection.getClass();
            int size = size();
            boolean zRetainAll = this.e.retainAll(collection);
            if (zRetainAll) {
                AbstractMapBasedMultimap.this.j += this.e.size() - size;
                g();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            d();
            return this.e.size();
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            d();
            return this.e.toString();
        }

        public class WrappedIterator implements Iterator<V> {
            public final Iterator d;
            public final Collection e;

            public WrappedIterator() {
                Collection collection = WrappedCollection.this.e;
                this.e = collection;
                this.d = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
            }

            public final void a() {
                WrappedCollection wrappedCollection = WrappedCollection.this;
                wrappedCollection.d();
                if (wrappedCollection.e != this.e) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                a();
                return this.d.hasNext();
            }

            @Override // java.util.Iterator
            public final Object next() {
                a();
                return this.d.next();
            }

            @Override // java.util.Iterator
            public final void remove() {
                this.d.remove();
                WrappedCollection wrappedCollection = WrappedCollection.this;
                AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
                abstractMapBasedMultimap.j--;
                wrappedCollection.g();
            }

            public WrappedIterator(Iterator it) {
                this.e = WrappedCollection.this.e;
                this.d = it;
            }
        }
    }
}
