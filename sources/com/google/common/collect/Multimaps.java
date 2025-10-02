package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Supplier;
import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.common.collect.AbstractMultimap;
import com.google.common.collect.Collections2;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class Multimaps {

    public static final class AsMap<K, V> extends Maps.ViewCachingAbstractMap<K, Collection<V>> {
        public final Multimap g;

        public class EntrySet extends Maps.EntrySet<K, Collection<V>> {
            public EntrySet() {
            }

            @Override // com.google.common.collect.Maps.EntrySet
            public final Map h() {
                return AsMap.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                Set setKeySet = AsMap.this.g.keySet();
                return new Maps.AnonymousClass3(setKeySet.iterator(), new f(this));
            }

            @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AsMap.this.g.keySet().remove(entry.getKey());
                return true;
            }
        }

        public AsMap(Multimap multimap) {
            this.g = multimap;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set a() {
            return new EntrySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            this.g.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            return this.g.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            Multimap multimap = this.g;
            if (multimap.containsKey(obj)) {
                return multimap.get(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean isEmpty() {
            return this.g.isEmpty();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            return this.g.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            Multimap multimap = this.g;
            if (multimap.containsKey(obj)) {
                return multimap.b(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.g.keySet().size();
        }
    }

    public static class CustomListMultimap<K, V> extends AbstractListMultimap<K, V> {
        public transient Supplier k;

        @J2ktIncompatible
        @GwtIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            this.k = (Supplier) object;
            Object object2 = objectInputStream.readObject();
            Objects.requireNonNull(object2);
            n((Map) object2);
        }

        @J2ktIncompatible
        @GwtIncompatible
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.k);
            objectOutputStream.writeObject(this.i);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        public final Map a() {
            return j();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        public final Set d() {
            return k();
        }

        @Override // com.google.common.collect.AbstractListMultimap, com.google.common.collect.AbstractMapBasedMultimap
        /* renamed from: r */
        public final List h() {
            return (List) this.k.get();
        }
    }

    public static class CustomMultimap<K, V> extends AbstractMapBasedMultimap<K, V> {
        public transient Supplier k;

        @J2ktIncompatible
        @GwtIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            this.k = (Supplier) object;
            Object object2 = objectInputStream.readObject();
            Objects.requireNonNull(object2);
            n((Map) object2);
        }

        @J2ktIncompatible
        @GwtIncompatible
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.k);
            objectOutputStream.writeObject(this.i);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        public final Map a() {
            return j();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        public final Set d() {
            return k();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap
        public final Collection h() {
            return (Collection) this.k.get();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap
        public final Collection o(Collection collection) {
            return collection instanceof NavigableSet ? Sets.j((NavigableSet) collection) : collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : collection instanceof Set ? Collections.unmodifiableSet((Set) collection) : collection instanceof List ? Collections.unmodifiableList((List) collection) : Collections.unmodifiableCollection(collection);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap
        public final Collection q(Object obj, Collection collection) {
            if (!(collection instanceof List)) {
                return collection instanceof NavigableSet ? new AbstractMapBasedMultimap.WrappedNavigableSet(obj, (NavigableSet) collection, null) : collection instanceof SortedSet ? new AbstractMapBasedMultimap.WrappedSortedSet(obj, (SortedSet) collection, null) : collection instanceof Set ? new AbstractMapBasedMultimap.WrappedSet(obj, (Set) collection) : new AbstractMapBasedMultimap.WrappedCollection(obj, collection, null);
            }
            List list = (List) collection;
            return list instanceof RandomAccess ? new AbstractMapBasedMultimap.RandomAccessWrappedList(obj, list, null) : new AbstractMapBasedMultimap.WrappedList(obj, list, null);
        }
    }

    public static class CustomSetMultimap<K, V> extends AbstractSetMultimap<K, V> {
        public transient Supplier k;

        @J2ktIncompatible
        @GwtIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            this.k = (Supplier) object;
            Object object2 = objectInputStream.readObject();
            Objects.requireNonNull(object2);
            n((Map) object2);
        }

        @J2ktIncompatible
        @GwtIncompatible
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.k);
            objectOutputStream.writeObject(this.i);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        public final Map a() {
            return j();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        public final Set d() {
            return k();
        }

        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public final Collection o(Collection collection) {
            return collection instanceof NavigableSet ? Sets.j((NavigableSet) collection) : collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : Collections.unmodifiableSet((Set) collection);
        }

        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public final Collection q(Object obj, Collection collection) {
            return collection instanceof NavigableSet ? new AbstractMapBasedMultimap.WrappedNavigableSet(obj, (NavigableSet) collection, null) : collection instanceof SortedSet ? new AbstractMapBasedMultimap.WrappedSortedSet(obj, (SortedSet) collection, null) : new AbstractMapBasedMultimap.WrappedSet(obj, (Set) collection);
        }

        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        /* renamed from: r */
        public final Set h() {
            return (Set) this.k.get();
        }
    }

    public static class CustomSortedSetMultimap<K, V> extends AbstractSortedSetMultimap<K, V> {
        public transient Supplier k;

        @J2ktIncompatible
        @GwtIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            Supplier supplier = (Supplier) object;
            this.k = supplier;
            ((SortedSet) supplier.get()).comparator();
            Object object2 = objectInputStream.readObject();
            Objects.requireNonNull(object2);
            n((Map) object2);
        }

        @J2ktIncompatible
        @GwtIncompatible
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.k);
            objectOutputStream.writeObject(this.i);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        public final Map a() {
            return j();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        public final Set d() {
            return k();
        }

        @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public final SortedSet h() {
            return (SortedSet) this.k.get();
        }
    }

    public static abstract class Entries<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        public abstract Multimap b();

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            b().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return b().y1(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return b().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return b().size();
        }
    }

    public static class Keys<K, V> extends AbstractMultiset<K> {
        public final Multimap f;

        /* renamed from: com.google.common.collect.Multimaps$Keys$1, reason: invalid class name */
        class AnonymousClass1 extends TransformedIterator<Map.Entry<Object, Collection<Object>>, Multiset.Entry<Object>> {
            @Override // com.google.common.collect.TransformedIterator
            public final Object a(Object obj) {
                final Map.Entry entry = (Map.Entry) obj;
                return new Multisets.AbstractEntry<Object>() { // from class: com.google.common.collect.Multimaps.Keys.1.1
                    @Override // com.google.common.collect.Multiset.Entry
                    public final Object a() {
                        return entry.getKey();
                    }

                    @Override // com.google.common.collect.Multiset.Entry
                    public final int getCount() {
                        return ((Collection) entry.getValue()).size();
                    }
                };
            }
        }

        public Keys(Multimap multimap) {
            this.f = multimap;
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public int b0(int i, Object obj) {
            CollectPreconditions.b(i, "occurrences");
            if (i == 0) {
                return e2(obj);
            }
            Collection collection = (Collection) Maps.h(obj, this.f.p1());
            if (collection == null) {
                return 0;
            }
            int size = collection.size();
            if (i >= size) {
                collection.clear();
                return size;
            }
            Iterator it = collection.iterator();
            for (int i2 = 0; i2 < i; i2++) {
                it.next();
                it.remove();
            }
            return size;
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public final Set c() {
            return this.f.keySet();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            this.f.clear();
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return this.f.containsKey(obj);
        }

        @Override // com.google.common.collect.Multiset
        public final int e2(Object obj) {
            Collection collection = (Collection) Maps.h(obj, this.f.p1());
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final int g() {
            return this.f.p1().size();
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Iterator h() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Iterator i() {
            return new AnonymousClass1(this.f.p1().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new Maps.AnonymousClass1(this.f.l().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.f.size();
        }
    }

    public static class MapMultimap<K, V> extends AbstractMultimap<K, V> implements SetMultimap<K, V>, Serializable {

        /* renamed from: com.google.common.collect.Multimaps$MapMultimap$1, reason: invalid class name */
        class AnonymousClass1 extends Sets.ImprovedAbstractSet<Object> {
            public final /* synthetic */ Object d;
            public final /* synthetic */ MapMultimap e;

            public AnonymousClass1(MapMultimap mapMultimap, Object obj) {
                this.d = obj;
                this.e = mapMultimap;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                return new Iterator<Object>() { // from class: com.google.common.collect.Multimaps.MapMultimap.1.1
                    public int d;

                    @Override // java.util.Iterator
                    public final boolean hasNext() {
                        if (this.d != 0) {
                            return false;
                        }
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        anonymousClass1.e.getClass();
                        Object obj = anonymousClass1.d;
                        throw null;
                    }

                    @Override // java.util.Iterator
                    public final Object next() {
                        hasNext();
                        throw new NoSuchElementException();
                    }

                    @Override // java.util.Iterator
                    public final void remove() {
                        CollectPreconditions.d(this.d == 1);
                        this.d = -1;
                        throw null;
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                this.e.getClass();
                throw null;
            }
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final Map a() {
            return new AsMap(this);
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final /* bridge */ /* synthetic */ Collection b(Object obj) {
            b(obj);
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final Collection c() {
            throw new AssertionError("unreachable");
        }

        @Override // com.google.common.collect.Multimap
        public final void clear() {
            throw null;
        }

        @Override // com.google.common.collect.Multimap
        public final boolean containsKey(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public final boolean containsValue(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final Set d() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final Multiset e() {
            return new Keys(this);
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final Collection f() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final Iterator g() {
            throw null;
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final Collection get(Object obj) {
            return new AnonymousClass1(this, obj);
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public final int hashCode() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public final Collection l() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public final boolean put(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public final boolean remove(Object obj, Object obj2) {
            throw null;
        }

        @Override // com.google.common.collect.Multimap
        public final int size() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public final boolean y1(Object obj, Object obj2) {
            throw null;
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final Set b(Object obj) {
            new HashSet(2);
            throw null;
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final Set get(Object obj) {
            return new AnonymousClass1(this, obj);
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public final Set l() {
            throw null;
        }
    }

    public static final class TransformedEntriesListMultimap<K, V1, V2> extends TransformedEntriesMultimap<K, V1, V2> implements ListMultimap<K, V2> {
        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap
        public final Collection h(Object obj, Collection collection) {
            return Lists.d((List) collection, new Maps.AnonymousClass10(this.j, obj));
        }

        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final List b(Object obj) {
            return Lists.d((List) this.i.b(obj), new Maps.AnonymousClass10(this.j, obj));
        }

        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final List get(Object obj) {
            return Lists.d((List) this.i.get(obj), new Maps.AnonymousClass10(this.j, obj));
        }
    }

    public static class TransformedEntriesMultimap<K, V1, V2> extends AbstractMultimap<K, V2> {
        public final Multimap i;
        public final Maps.EntryTransformer j;

        public TransformedEntriesMultimap(ListMultimap listMultimap, Maps.EntryTransformer entryTransformer) {
            listMultimap.getClass();
            this.i = listMultimap;
            this.j = entryTransformer;
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final Map a() {
            return new Maps.TransformedEntriesMap(this.i.p1(), new f(this));
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Collection b(Object obj) {
            return h(obj, this.i.b(obj));
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final Collection c() {
            return new AbstractMultimap.Entries();
        }

        @Override // com.google.common.collect.Multimap
        public final void clear() {
            this.i.clear();
        }

        @Override // com.google.common.collect.Multimap
        public final boolean containsKey(Object obj) {
            return this.i.containsKey(obj);
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final Set d() {
            return this.i.keySet();
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final Multiset e() {
            return this.i.F();
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final Collection f() {
            Collection collectionL = this.i.l();
            final Maps.EntryTransformer entryTransformer = this.j;
            return new Collections2.TransformedCollection(collectionL, new Function<Map.Entry<Object, Object>, Object>() { // from class: com.google.common.collect.Maps.11
                public AnonymousClass11() {
                }

                @Override // com.google.common.base.Function
                public final Object apply(Map.Entry<Object, Object> entry) {
                    Map.Entry<Object, Object> entry2 = entry;
                    entry2.getKey();
                    return ((AnonymousClass9) entryTransformer).d.apply(entry2.getValue());
                }
            });
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final Iterator g() {
            return new Iterators.AnonymousClass6(this.i.l().iterator(), new Maps.AnonymousClass13(this.j));
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Collection get(Object obj) {
            return h(obj, this.i.get(obj));
        }

        public Collection h(Object obj, Collection collection) {
            Maps.AnonymousClass10 anonymousClass10 = new Maps.AnonymousClass10(this.j, obj);
            return collection instanceof List ? Lists.d((List) collection, anonymousClass10) : new Collections2.TransformedCollection(collection, anonymousClass10);
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public final boolean isEmpty() {
            return this.i.isEmpty();
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public final boolean put(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public final boolean remove(Object obj, Object obj2) {
            return get(obj).remove(obj2);
        }

        @Override // com.google.common.collect.Multimap
        public final int size() {
            return this.i.size();
        }
    }

    public static class UnmodifiableListMultimap<K, V> extends UnmodifiableMultimap<K, V> implements ListMultimap<K, V> {
        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        public final /* bridge */ /* synthetic */ Object P1() {
            return null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap
        /* renamed from: R1 */
        public final /* bridge */ /* synthetic */ Multimap P1() {
            return null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final Collection b(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final Collection get(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final List b(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final List get(Object obj) {
            throw null;
        }
    }

    public static class UnmodifiableMultimap<K, V> extends ForwardingMultimap<K, V> implements Serializable {
        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public final Multiset F() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        /* renamed from: R1, reason: merged with bridge method [inline-methods] */
        public Multimap P1() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Collection b(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Collection get(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public final Set keySet() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public Collection l() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public final Map p1() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public final boolean put(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public final boolean remove(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public final Collection values() {
            throw null;
        }
    }

    public static class UnmodifiableSetMultimap<K, V> extends UnmodifiableMultimap<K, V> implements SetMultimap<K, V> {
        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Object P1() {
            return null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap
        /* renamed from: R1 */
        public /* bridge */ /* synthetic */ Multimap P1() {
            return null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public /* bridge */ /* synthetic */ Collection b(Object obj) {
            b(obj);
            throw null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public final Collection l() {
            throw null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Set b(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Set get(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public final Set l() {
            throw null;
        }
    }

    public static class UnmodifiableSortedSetMultimap<K, V> extends UnmodifiableSetMultimap<K, V> implements SortedSetMultimap<K, V> {
        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        public final /* bridge */ /* synthetic */ Object P1() {
            return null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap
        /* renamed from: R1 */
        public final /* bridge */ /* synthetic */ Multimap P1() {
            return null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final Collection b(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final Collection get(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final Set b(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final Set get(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final SortedSet b(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final SortedSet get(Object obj) {
            throw null;
        }
    }

    public static ListMultimap a(ListMultimap listMultimap, com.google.common.net.a aVar) {
        return new TransformedEntriesListMultimap(listMultimap, new Maps.AnonymousClass9(aVar));
    }
}
